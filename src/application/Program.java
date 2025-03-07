package application;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("=== TEST 1: SELLER FIND BY ID =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: SELLER FIND BY DEPARTMENT =====");
		Departament departament = new Departament(2, null);
		List <Seller> list = sellerDao.findByDepartment(departament);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: SELLER FIND ALL =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: SELLER INSERT =====");
		Seller newSeller = new Seller(departament, null, "Greg Buttowski", "greg@gmail.com", new Date(), 4000.0);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: SELLER UPDATE =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: SELLER DELETE =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		
		System.out.println("Delete completed!");
		
		
		
		
		
		sc.close();
	}

}
