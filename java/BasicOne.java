import java.util.Scanner;
import java.util.Arrays;

public class BasicOne {

    public static void main(String []args) {

        int valueInteger;
        float valueFloat;
        double valueDouble;
        char valueChar;
        String valueString="";

        int[] valueIntegerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[] valueFloatArray = { 1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f};
        double[] valueDoubleArray = { 1.0, 2.5, 3.3, 4.1, 5.2, 6.2, 7.3, 8.1, 9.2, 10.3};;
        char[] valueCharArray = {'h','a', 'i'};
        String[] valueStringArray = {"hai","aku", "bellasipagugelang"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Variable base on Data Type \n\n");

        System.out.print("Input Variable String \n");
        valueString = scanner.nextLine();

        System.out.print("Input Variable Char \n");
        valueChar = scanner.next().charAt(0);

        System.out.print("Input Variable Integer \n");
        valueInteger = scanner.nextInt();

        System.out.print("Input Variable Float \n");
        valueFloat = scanner.nextFloat();

        System.out.print("Input Variable Double \n");
        valueDouble = scanner.nextDouble();

        System.out.println("--------Variable Data Type-------- \n");
        System.out.printf("Integer: %d \n",valueInteger);
        System.out.printf("Float:   %3f \n",valueFloat);
        System.out.printf("Double:  %f \n",valueDouble);
        System.out.printf("Char:    %s \n",valueChar);
        System.out.printf("String:  %s \n",valueString);
        System.out.println("---------------------------------- \n");

        System.out.print("--------Variable Data Type Array-------- \n");
        System.out.println("Integer: "+Arrays.toString(valueIntegerArray)+"\n");
        System.out.println("Float:   "+Arrays.toString(valueFloatArray)+"\n");
        System.out.println("Double:  "+Arrays.toString(valueDoubleArray)+"\n");
        System.out.println("Char:    "+Arrays.toString(valueCharArray)+"\n");
        System.out.println("String:  "+Arrays.toString(valueStringArray)+"\n");
        System.out.print("---------------------------------- \n");

    }
}
