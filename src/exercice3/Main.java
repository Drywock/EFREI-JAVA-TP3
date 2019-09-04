/**
 * 
 */
package exercice3;

/**
 * @author Gabriel RIBIER, Thomas LINTANF
 *
 */

import java.util.HashMap;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		//Question 1:
		String[] names = { "alice" , "bob" , "june" };
		String[] animals = { "edith le singe" , "izard le chamoix" , "gold le poisson rouge" };
		
		try {
			String name = args[0];
			int pos = position(names, name);
			
			if (pos == -1) {
				System.out.println(name + " does not exist");
			}
			else {
				String animal = animals[pos];
				System.out.print("L'animal préféré de " + name + " est " + animal);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("No arguments");
		}
		*/
		
		//Question 2:
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("alice", "edith le singe");
		hm.put("bob", "izard le chamoix");
		hm.put("june", "gold le poisson rouge");
		try {
			String name = args[0];
			String animal = hm.get(name);
			System.out.print("L'animal préféré de " + name + " est " + animal);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("No arguments");
		}
		
	}
	
	
	public static int position(String[] list, String word) {
		
		int leng = list.length;
		
		for (int cpt = 0; cpt < leng; cpt++) {
			
			if (list[cpt] == word) {
				return cpt;
			}
		}
		System.out.print(word + " is not in the list");
		return -1;
	}

	@Override
	public String toString() {
		return "Main []";
	}

}
