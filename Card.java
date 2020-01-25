import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Card {
	
	public Card(String name, int size, int speed, int range, int firepower, int cargo) {
		this.name = name;
		this.size = size;
		this.speed = speed;
		this.range = range;
		this.firepower = firepower;
		this.cargo = cargo;
		}
	
	public static void main(String[]args) {
		Card cardArray[] = new Card[40];
		cardArray[0] = new Card("350r", 1, 9, 2, 3, 0);
		System.out.println(cardArray[0]);
		
		
		FileReader fr = null;
		try {
			String fN = "C:\\Users\\atrai\\TeamProject\\Workspace\\MScIT_TeamProject_TemplateProject\\MScIT_TeamProject_TemplateProject/StarCitizenDeck.txt";
			fr = new FileReader(fN);
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
//		Card card = new Card("bob",1,2,3,4,5);
//		System.out.println(card);
	}
	
	public String toString() {
		return "Name: " + name + ", Size: " + size + ", Speed: " + speed + ", Range: " + range + ", Firepower: " +  firepower + ", Cargo: " + cargo;
		
	}
	public void cardArray() {
		
	}
	
	String name;
	int size;
	int speed;
	int range;
	int firepower;
	int cargo;

}
