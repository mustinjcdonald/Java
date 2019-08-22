package class22;

import uca.jetty.Container;

public class Driver {

	public static void main(String[] args) {
		Container.startServer(80);
		Container.addHandler(new UserRegistration(), "/registration");
		Container.addHandler(new UserLogin(), "/login");
		Container.addHandler(new UserReportJSONBasic(), "/reportjsonbasic");
		Container.addHandler(new UserReportJSONAdvanced(), "/reportjsonadvanced");
		Container.addHandler(new UserReportHTMLAdvanced(), "/reporthtmladvanced");
	} // end main
} // end Driver