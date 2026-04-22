package com.example;


public class App {
	static void imprimeDetalles(Object obj) {
		if (obj instanceof book book) {
			System.out.println("Titulo del libro: "+ book.title());
			System.out.println("Autor del libro" + book.author());
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
    }
}
