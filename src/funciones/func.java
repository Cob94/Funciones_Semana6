
package funciones;
import java.util.Scanner;
public class func {
 
	static void funcionA(){
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
	}
	static void funcionB(){
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
	}
	static void funcionC(){
		System.out.print("A");
		System.out.print("B");
	}
	static void funcionD(int param){
		System.out.println("El parametro es:"+ param*2);
		
	}
	
	static void funcionDoble(int numero){
		System.out.print("\n El doble de "+numero+" es "+numero*2);
		
	}
	static void funcionsuma(int a, int b){
		System.out.println("\n La Suma es: "+(a+b));
		
	}
	static int funcionI(){
		return 10;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_escaner= new Scanner(System.in);
     funcionA();
     funcionB();
     funcionC();
     funcionD(15);
     System.out.println("Ingrese un valor:");
     int num1= mi_escaner.nextInt();
     funcionDoble(num1);
     funcionsuma(1,2);
     int x= funcionI();
     System.out.println(x);
     
	}

}
