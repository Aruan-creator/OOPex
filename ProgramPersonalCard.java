import java.util.Scanner;

class PersonCard{
	private String name;
	private String surname;
	private String position;


  public PersonCard(){
  

  }

  public PersonCard(String name, String surname, String position){
		this.name = name;
		this.surname = surname;
		this.position = position;	
	}
	

  public void setName(String name){
    this.name = name;
  }

	public String getName(){
		return this.name;
	}

  public void setSurname(String surname){
    this.surname = surname;
  }

	public String getSurname(){
		return this.surname;
	}

  public void setPosition(String position){
    this.position = position;
  }

	public String getPosition(){
		return this.position;
	}

}

public class Main{

	public static void main(String[] agrs) {
    PersonCard somePerson = new PersonCard();

		Scanner console = new Scanner(System.in);

		System.out.println("Enter your name: ");
		somePerson.setName(console.nextLine());

		System.out.println("Enter your surname: ");
		somePerson.setSurname(console.nextLine());

		System.out.println("Enter your position: ");
		somePerson.setPosition(console.nextLine());
		
		
		System.out.println("Your name is " + somePerson.getName());
		System.out.println("Your surname is " + somePerson.getSurname());
		System.out.println("Your position is " + somePerson.getPosition());

	}
}
