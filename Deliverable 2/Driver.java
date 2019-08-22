package Project;

import uca.jetty.Container;

public class Driver {

	public static void main(String[] args) {
		Container.startServer(81);
		Container.addHandler(new PointOfSale(), "/htmltest");
	} // end main
} // end Driver