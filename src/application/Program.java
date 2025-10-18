package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Eletronics");
		Seller seller = new Seller(13, "Gustavo", "gustavo@gmail.com", new Date(), 2500.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);
		System.out.println(seller);
	}

}
