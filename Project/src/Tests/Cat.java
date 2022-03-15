package Tests;

public class Cat extends Animal{
	public Cat (String name, int age) {
		super(name);
	}
	
	public void display() {
		//super.display();
		System.out.println("Cat class: "+getName()+" ");
	}
	public void setAdnDisplay() {
		System.out.println(getName()+"fff");
	}
	
	class Person{
	     
	    private String name;
	    Account account;
	 
	    Person(String name, String password){
	        this.name = name;
	        account = new Account(password);
	    }
	    public void displayPerson(){
	        System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
	    }
	}
	public class Account{
        private String password;
         
        Account(String pass){
            this.password = pass;
        }
        void displayAccount(){
            System.out.printf("Account Login: %s \t Password: %s \n", password);
        }
    }   
}
