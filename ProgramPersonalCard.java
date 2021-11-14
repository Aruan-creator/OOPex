import java.util.Scanner;

class PersonCard{
	private String name;
	private String surname;
	private String position;


	public PersonCard(String name, String surname, String position){
		this.name = name;
		this.surname = surname;
		this.position = position;	
	}
	public String getName(){
		return this.name;
	}
	public String getSurname(){
		return this.surname;
	}

	public String getPosition(){
		return this.position;
	}

}

public class ProgramPersonalCard{

	public static void main(String[] agrs) {
		String myName;
		String mySurname;
		String myPosition;

		Scanner console = new Scanner(System.in);
		System.out.println("Enter your name: ");
		myName = console.nextLine();
		System.out.println("Enter your surname: ");
		mySurname = console.nextLine();
		System.out.println("Enter your position: ");
		myPosition = console.nextLine();
		
		PersonCard Aruan = new PersonCard(myName, mySurname, myPosition);
		System.out.println("Your name is " + Aruan.getName());
		System.out.println("Your surname is " + Aruan.getSurname());
		System.out.println("Your position is " + Aruan.getPosition());

	}
}
