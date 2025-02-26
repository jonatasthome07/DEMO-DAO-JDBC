package application;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Departament;

public class Program2 {

	public static void main(String[] args) {
		DepartamentDao departamentDao = DaoFactory.createDepartamentDao();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("=== TEST 1: DEPARTMENT FIND BY ID =====");
		Departament departament = departamentDao.findById(2);
		System.out.println(departament);
		
		System.out.println("\n=== TEST 2: DEPARTMENT FIND ALL =====");
		List <Departament> list = departamentDao.findAll();
		for (Departament dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3: DEPARTMENT INSERT =====");
		Departament newDep = new Departament(8, "Tools");
		System.out.println("New Departament inserted! " + newDep.getId());
		
		System.out.println("\n=== TEST 4: DEPARTMENT UPDATE =====");
		departament = departamentDao.findById(1);
		departament.setName("Tools");
		departamentDao.update(departament);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: DEPARTMENT DELETE =====");
		System.out.print("Enter ID to delete: ");
		int id = sc.nextInt();
		departamentDao.deleteById(id);
		
		System.out.println("Delete completed!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
