package Tests;

public class Program {
	
	
	public static void main(String[] args){
		/*Animal cat = new Animal("Lucy");
		((Cat)cat).display();*/
		try {
            boolean problem = true;
            

            Integer.parseInt("2932a"); // NumberFormatException

            Object obj = new Object();
            obj = null;
            String str = obj.toString(); // NullPointerException
            System.out.println(str);


            System.out.println("Программа отработала");

        } catch (NullPointerException e) {
            System.out.println("Мы словили ошибку !! ура :)");
            // 
        } catch (NumberFormatException e) {
            System.out.println("Текст введен не верно!!! :(");
            e.printStackTrace();
        } 

        // программа продолжает работу
        System.out.println("программа не крэшнулась и теперь выключается");
    }
	
	
	
	
	private static void changeName(Animal p) {
		p = new Animal("Jucy");
		p.setName("Ju");
	}
}
