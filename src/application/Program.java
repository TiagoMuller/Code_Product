package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 1;i <= n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.println("Common, used or imported (c/u/i):");
			char ch= sc.next().charAt(0);
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsfee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsfee));
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}else {
				list.add(new Product(name, price));
			}
			
		}
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
	
	}

}
