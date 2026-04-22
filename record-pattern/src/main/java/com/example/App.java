package com.example;


public class App {
	static void imprimeDetalles(Object obj) {
		if (obj instanceof book (String titulo, String autor)) {
			System.out.println("Titulo del libro: "+ titulo);
			System.out.println("Autor del libro" + autor);
		}
	}
	
    public static void main(String[] args) {
    	
        // CREAR UN OBJETO TIPO RECORD BOOK
    	
    	// book libro = new book("java es bueno", "yo mismo ninio");
    	
    	book libro = book.builder()
    			.title("Java es bueno")
    			.author (" yo mismo")
    			.build();
    	
    	imprimeDetalles(libro);
    	
    	
    	Library library = Library.builder()
    			.name("Biblioteca de mostoles")
    			.bestSeller(book.builder()
    					.title(" Java Programming")
    					.author("Toma lacasitos")
    					.build()
    					)
    			.build();
    	
    	if(library instanceof Library(String nombre, book (var titulo, var autor))) {
    		System.out.println("En la biblioteca "+ nombre + ", el bestSeller es: "+ titulo +" por el autor "+ autor);
    	}
    }
}
