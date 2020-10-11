package application;

import model.entities.Department;
import model.entities.Seller;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(1, "milton");
        Seller seller = new Seller(2, "milton", "milton@gmail.com", new Date(), 5000.00, department);

        System.out.println(seller);
    }
}
