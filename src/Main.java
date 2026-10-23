import java.util.Scanner;

void main () {
     Scanner sc = new Scanner (System.in);

     int [] numeros = new int [5];

    for (int i = 0; i < numeros.length; i++ ) {
        System.out.println("Introudeix un número:");
        int num = sc.nextInt();
        numeros[i] = num;
       
    }
        System.out.println("Recorregut invers:");

    for (int i = numeros.length - 1; i >= 0; i--) {
        System.out.println(numeros[i]);

    }

    System.out.println("Recorregut original:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);

    }






}
