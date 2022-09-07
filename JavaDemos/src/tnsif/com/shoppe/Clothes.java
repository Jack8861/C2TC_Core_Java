package tnsif.com.shoppe;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Clothes {
	String[] colors = {"red", "white", "white"};
	String[] sizes = {"Small", "Medium", "Large"};
	String[] brands = {"max", "puma", "gucci"};
	String[] wear = {"shirt", "pants", "sarvarkamiz", "jeans"};
	
	public void options(String[] list) {
		for (int i=0; i<list.length; i++) {
			System.out.print((i+1) +". " + list[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void buy() {
		ArrayList<String> brought = new ArrayList<String>();
		Integer op;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want?");
		options(this.wear);
		op = sc.nextInt();
		brought.add(this.wear[--op]);
		System.out.println("Which brand do you want?");
		options(this.brands);
		op = sc.nextInt();
		brought.add(this.brands[--op]);
		System.out.println("Which size do you want?");
		options(this.sizes);
		op = sc.nextInt();
		brought.add(this.sizes[--op]);
		System.out.println("Which color do you want?");
		options(this.colors);
		op = sc.nextInt();
		brought.add(this.colors[--op]);
		
		System.out.println("You have brought a " + brought.get(1) + "  "+ brought.get(0) +" of size " + brought.get(2) + " and " + brought.get(3) + " color");

	}

}
