import java.util.Scanner;

public class Currency_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Escoge una de las siguientes opciones");
		System.out.println("1) € Euros a Dólares $ ");
		System.out.println("2) $ Dólares a Euros € ");
		System.out.println("3) £ Libras a Euros € ");
		System.out.println("4) ¥ Yenes a Euros € ");
		int exchange = sc.nextInt();
		switch (exchange) {
		case 1: {
			System.out.println("Ingresa la cantidad de €");
			
			double euro = sc.nextDouble();
			if (euro>=0) {
				System.out.println(euro + "€ son " + euro*1.09 + "$. " );
				
			}
			else {
				System.out.println("Por favor ingrese números positivos en Euros");
			}
		}
		break;
		case 2: {
			System.out.println("Ingresa la cantidad de $");
			
			double dolar = sc.nextDouble();
			if (dolar>=0) {
				System.out.println(dolar + "$ son " + dolar*0.92 + "€. " );
			}
			else {
				System.out.println("Por favor ingrese números positivos en Dólares");
				
			}
		}
		break;
		case 3: {
			System.out.println("Ingresa la cantidad de £");
			
			double libra = sc.nextDouble();
			if (libra>=0) {
				System.out.println(libra + "£ son " + libra*1.17 + "€. " );
			}
			else {
				System.out.println("Por favor ingrese números positivos en Libras");
			}
		}
		break;
		case 4: {
			System.out.println("Ingresa la cantidad de ¥");
			
			double yen = sc.nextDouble();
			if (yen>=0) {
				System.out.println(yen + "¥ son " + yen*0.0061 + "€. " );
			}
			else {
				System.out.println("Por favor ingrese números positivos en Yenes");
			}
		}
		
	 }
  }
}