import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\tMatriz boolean");
        IntegerSet integerSet=new IntegerSet();

        Scanner datos= new Scanner(System.in);

        System.out.print("\t\t\t introduce el indice en entero: ");
        int indice = datos.nextInt();
        System.out.print("\t\t\tintroduce el valor en binario: ");
        boolean valor = datos.nextBoolean();
        integerSet.set(indice,valor);
        System.out.print("\t\t\t introduce el indice en entero buscado: ");
        int indiceget = datos.nextInt();

        integerSet.get(indiceget);

        System.out.println("el tamaño es: ");
        integerSet.size();
    }
}