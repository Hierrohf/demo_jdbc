package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		Department objt = new  Department(1, "books");
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.0, objt);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println(objt);
		
		System.out.println(seller);
		
		
		
		
	}

}
