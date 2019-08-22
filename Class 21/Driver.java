package class21;

import uca.jetty.Container;

public class Driver {

	public static void main(String[] args) {
		Container.startServer(80);
		Container.addHandler(new JSONDemo(), "/jsondemo");
	} // end main
} // end Driver