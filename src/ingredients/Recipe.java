package ingredients;

import java.util.Scanner;

class RecipeList {
	String input;

}

public class Recipe {
	public static void main(String[] args) {
		System.out.println("Lets get cooking!");

		StringBuilder choose = new StringBuilder();

		choose.append("Enter recipe from list: \n").append("French Toast\n")
				.append("Tuna Fish salad\n").append("Carbonara");
		System.out.println(choose.toString());

		String recipeName;

		Scanner recipeName1 = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Enter choice:");

		recipeName = recipeName1.nextLine();
		System.out.println("searching for: " + recipeName);

		Breakfast recipeName2 = new Breakfast();
		

		if (recipeName.equals("french toast")) {
			recipeName2.frenchToast();
		} else if (recipeName.equals("carbonara")){
			
		}else if (recipeName.equals("tuna fish salad")){
			
		}else if (!recipeName.equals("")){
			System.out.println("Sorry! We don't know how to make this dish yet");
		}
		
		
		
		
		
	
		
	}
}
