package uca.jetty;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServlet;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;

import uca.jetty.base.HelloWorld;
import uca.jetty.base.JSONStatus;

public class Container {
	private static Server server = new org.eclipse.jetty.server.Server();
	private static WebAppContext ctx = new WebAppContext();
	
	public static void main(String[] args) {
		startServer(80);
	} // end main
	
	public static void startServer(int inc) {
    	try {
    		ServerConnector connector = new ServerConnector(server);
	    	connector.setPort(inc);
	    	server.setConnectors(new Connector[] {connector});
			List<Handler> allHandlers = new ArrayList<Handler>();
	    	ctx.setResourceBase("src/"); // this path is relative to the project instantiating this class! NOT local to this project
	    	ctx.setContextPath("/");
			allHandlers.add(ctx);
	
			// must use this convoluted List --> .toArray --> HandlerCollection idiom to make all handlers of different types work simultaneously
			// otherwise only the last handler added works, all others are ignored
			HandlerCollection handlers = new HandlerCollection();
			handlers.setHandlers(allHandlers.toArray(new Handler[allHandlers.size()]));
			
			// attach the HandlerCollection and start the server
			server.setHandler(handlers);
			server.start();
			System.out.println("Jetty container server started at base URL: " + InetAddress.getLocalHost().getHostAddress() + ":" + inc);
			addHandler(new HelloWorld(), "/helloworld");
			addHandler(new JSONStatus(), "/jsonstatus");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} // end catch
	} // end startServer
	
    public static void addHandler(HttpServlet inc, String contextPath) {
    	try {
    		ServletHolder temp = new ServletHolder(inc);
    		temp.getRegistration().setMultipartConfig(new MultipartConfigElement("data/tmp", 1048576, 1048576, 262144)); // LOCATION, MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD
    		ctx.addServlet(temp, contextPath);
    		System.out.println("JettyServer registered the servlet handler: " + inc.getClass().getName() + " mapped to: " + contextPath);
    	} catch (Exception e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
    	} // end catch
    } // end addHandler	
    
} // end Container