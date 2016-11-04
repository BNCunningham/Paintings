public class FamousPainting extends Paintings{


	//default constructor
	public FamousPainting(){
		value = 0;
	}
//modifying constructor
	public FamousPainting(String paintingname, String name){
		this.paintingname = paintingname;
		this.name = name;
		this.value = 25000;

	}

	public void display(){

			System.out.println("paintingname: " + paintingname);
			System.out.println("Artist Name: " + name);
			System.out.printf("Value: $%.2f", value); //value = 25000;
			System.out.println();
		}

}
