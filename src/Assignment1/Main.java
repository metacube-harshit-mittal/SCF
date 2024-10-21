package Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1AB";
		String b = "1AB";
         Service service = new Service();
		 System.out.println(service.decToHexa(427)); 
		 System.out.println(service.add(a, b));
		 System.out.println(service.subtract(a, b));
		 System.out.println(service.multiply(a, b));
		 System.out.println(service.divide(a, b));
		 System.out.println(service.comparator(a, b,">"));
	}

}
