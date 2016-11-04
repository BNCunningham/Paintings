import java.util.Scanner;

public class Paintings{

	protected String paintingname;
	protected String name;
	protected int value;

	public Paintings(){
		paintingname = "";
		name = "";
		value = 400;


	}

	//Painting constructor
	public Paintings(String paintingname, String name){
		this.paintingname = paintingname;
		this.name = name;
	}


	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);


		Paintings [] p = new Paintings[10];

		for (int i = 0; i < 10; i++){

			System.out.print("Please enter the Painting Title: ");
			String paintingname = sc.nextLine();

			System.out.print("Please enter the artist's name: ");
			String name = sc.nextLine();

			Paintings paint = new Paintings(paintingname, name);
			FamousPainting p2 = new FamousPainting();

			if (name.equals("Degas") || name.equals("Monet") || name.equals("Picasso") || name.equals("Rembrandt")){
				
				paint.display(); //display famous painting
			}

			else{
				p2.display();
			}
		}
	}

	public void display(){
		if (name.equals("Degas") || name.equals("Monet") || name.equals("Picasso") || name.equals("Rembrandt")){
			System.out.println("Painting title: " + paintingname);
			System.out.println("Artist's Name: " + name);
			System.out.println("Painting value: $" + value);
		}

		else{
			System.out.println("Painting title: " + paintingname);
			System.out.println("Artist's name: " + name);
			System.out.println("Painting value = $400");



		}
	}
}
