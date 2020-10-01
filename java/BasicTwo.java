import java.util.Scanner;

public class BasicTwo {

    public static void main(String []args) {

        int valueInteger;
        float valueFloat;
        double valueDouble;
        char valueChar;
        String valueString="";

        int sizeArray = 0;
        int[] valueIntegerArray = new int[sizeArray];
        float[] valueFloatArray = new float[sizeArray];
        double[] valueDoubleArray = new double[sizeArray];
        char[] valueCharArray = new char[sizeArray];
        String[] valueStringArray = new String[sizeArray];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Array base on Data Type \n");
        System.out.print("Input size of array \n");
        sizeArray = scanner.nextInt();

        System.out.printf("Size Array:  %d \n", sizeArray);

        System.out.print("---Variable Data Type: Inside Array of String---- \n");

        for (int index = 0; index < sizeArray; index++) {
           valueStringArray[index] = scanner.nextLine();
        }
        System.out.print("------------------------------------------------- \n");

        System.out.print("-------Show Data Type: Array of String------- \n");
        for (int index = 0; index < valueStringArray.length; index++) {
           System.out.printf("String:  %s \n",valueStringArray[index]);
        }

        System.out.print("--------------------------------------------- \n");
        System.out.print("Input Variable base on Data Type \n\n");
        System.out.print("---Variable Data Type: Inside Array of Char---- \n");
        System.out.printf("Integer: %d \n",valueInteger);
        System.out.printf("Float:   %3f \n",valueFloat);
        System.out.printf("Double:  %f \n",valueDouble);
        System.out.printf("Char:    %s \n",valueChar);
        System.out.printf("String:  %s \n",valueString);
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of Integer---- \n");
        System.out.printf("Integer: %d \n",valueInteger);
        System.out.printf("Float:   %3f \n",valueFloat);
        System.out.printf("Double:  %f \n",valueDouble);
        System.out.printf("Char:    %s \n",valueChar);
        System.out.printf("String:  %s \n",valueString);
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of Float---- \n");
        System.out.printf("Integer: %d \n",valueInteger);
        System.out.printf("Float:   %3f \n",valueFloat);
        System.out.printf("Double:  %f \n",valueDouble);
        System.out.printf("Char:    %s \n",valueChar);
        System.out.printf("String:  %s \n",valueString);
        System.out.print("------------------------------------------------- \n");

        System.out.print("---Variable Data Type: Inside Array of Double---- \n");
        System.out.printf("Integer: %d \n",valueInteger);
        System.out.printf("Float:   %3f \n",valueFloat);
        System.out.printf("Double:  %f \n",valueDouble);
        System.out.printf("Char:    %s \n",valueChar);
        System.out.printf("String:  %s \n",valueString);
        System.out.print("------------------------------------------------- \n");
    }
}
