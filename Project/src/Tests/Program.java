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


            System.out.println("��������� ����������");

        } catch (NullPointerException e) {
            System.out.println("�� ������� ������ !! ��� :)");
            // 
        } catch (NumberFormatException e) {
            System.out.println("����� ������ �� �����!!! :(");
            e.printStackTrace();
        } 

        // ��������� ���������� ������
        System.out.println("��������� �� ���������� � ������ �����������");
    }
	
	
	
	
	private static void changeName(Animal p) {
		p = new Animal("Jucy");
		p.setName("Ju");
	}
}
