package class23;

import uca.jetty.Container;

public class DriverAnswer {

	public static void main(String[] args) {
		Container.startServer(80);
		Container.addHandler(new MoviesHTMLAnswer(), "/reportmovies");
	} // end main
} // end DriverAnswer