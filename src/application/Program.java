package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Departament obj = new Departament(1, "Books");
		System.out.println(obj);
		Seller s = new Seller(obj, 2, "Alex", "alex@gmail.com", new Date(), 2000.0);
		System.out.println(s);
		

	}

}
