package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		Department objt = new  Department(1, "books");
		System.out.println(objt);
		System.out.println("------------------------------------------");

		Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, objt);
		System.out.println(seller);
		System.out.println("------------------------------------------");

		System.out.println("findById");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller sellerid = sellerDao.findById(3);
		System.out.println(sellerid);
		System.out.println("------------------------------------------");
		
		System.out.println("findByDepartment");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------------");

		System.out.println("findAll");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		
	}

}
