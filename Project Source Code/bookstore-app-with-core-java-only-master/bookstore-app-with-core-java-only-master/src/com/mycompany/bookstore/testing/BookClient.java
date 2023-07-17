package com.mycompany.bookstore.testing;

import com.mycompany.bookstore.controller.BookController;
import com.mycompany.bookstore.dto.BookDTO;

public class BookClient {

	public static void main(String[] args) {
		
		BookController controller = new BookController();
		//Call the add book functionality
		//addBook(controller);
		//call the get book detail functionality
		getBook(controller, 111L);
	}
	
	private static void getBook(BookController controller, Long bookId) {
		BookDTO bookDTO = controller.getBook(bookId);
		System.out.println("Following are details for Book with ID: "+bookId);
		System.out.println("Book Name: "+bookDTO.getName());
		System.out.println("Book Author: "+bookDTO.getAuthorName());
		System.out.println("Book Price: "+bookDTO.getPricePerQty());
	}
	
	private static void addBook(BookController controller) {
		//create the BookDTO and call the controller add book method
		BookDTO bookDTO = new BookDTO();
		bookDTO.setBookId(111L);
		bookDTO.setAuthorEmail("author1@gmail.com");
		bookDTO.setAuthorName("Author One");
		bookDTO.setAvailableQty(10);
		bookDTO.setName("Book One");
		bookDTO.setDescription("Book One Description");
		bookDTO.setPricePerQty(19.95);
		
		//call controller add method and hold the return value
		Long bookId = controller.add(bookDTO);
		
		if(bookId != null) {
			System.out.println("Book was successfully create with Id: "+bookId);
		}else {
			System.out.println("Some Error Occurred while creating a new Book");
		}

	}

}
