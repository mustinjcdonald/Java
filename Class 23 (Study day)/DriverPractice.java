package class23;

import uca.jetty.Container;

public class DriverPractice {

	public static void main(String[] args) {
		Container.startServer(80);
		Container.addHandler(new MoviesHTMLPractice(), "/reportmovies");
	} // end main
} // end DriverPractice