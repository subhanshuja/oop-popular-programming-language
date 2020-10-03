// references: https://beginnersbook.com/2017/08/data-types-in-java/

import java.util.Scanner;
import java.util.Arrays;

public class BasicOne {

    public static void main(String []args) {

        boolean valueBoolean;
        char valueChar;
        String valueString="";
        byte valueByte;
        short valueShort;
        int valueInteger;
        float valueFloat;
        double valueDouble;
        long valueLong;

        int[] valueIntegerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[] valueFloatArray = {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10.12f};
        double[] valueDoubleArray = {-1.0d, -2.5d, 3.3d, 4.1d, 5.2d, 6.2d, 7.3d, 8.1d, 9.2d, 10.3d};;
        char[] valueCharArray = {'h','a', 'i'};
        String[] valueStringArray = {"hai","aku", "bellasipagugelang"};
        byte[] valueByteArray = {113, 103, 93, 4, 25, 16, 7, 18, 9, 110};
        short[] valueShortArray = {-3451, -2, 4567, 412, 5, 656, 734, 8, 9, 10};
        long[] valueLongArray = {-12332252626L, -2332252626L, -332252626L, -32252626L, 5, 6, 7, 8, 9, 10};
        boolean[] valueBooleanArray = {true, true, true, true, true, false, true, true, false, false};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Variable base on Data Type \n\n");

        System.out.print("Input Variable Boolean \n");
        valueBoolean = scanner.nextBoolean();

        System.out.print("Input Variable Char \n");
        valueChar = scanner.next().charAt(0);

        System.out.print("Input Variable String \n");
        valueString = scanner.next();

        System.out.print("Input Variable Byte \n");
        valueByte = scanner.nextByte();

        System.out.print("Input Variable Short \n");
        valueShort = scanner.nextShort();

        System.out.print("Input Variable Integer \n");
        valueInteger = scanner.nextInt();

        System.out.print("Input Variable Float \n");
        valueFloat = scanner.nextFloat();

        System.out.print("Input Variable Double \n");
        valueDouble = scanner.nextDouble();

        System.out.print("Input Variable Long \n");
        valueLong = scanner.nextLong();

        System.out.println("--------Variable Data Type-------- \n");
        System.out.printf("Byte: %d \n",valueByte);
        System.out.printf("Short: %d \n",valueShort);
        System.out.printf("Boolean: %s \n",valueBoolean);
        System.out.printf("Integer: %d \n",valueInteger);
        System.out.printf("Float:   %3f \n",valueFloat);
        System.out.printf("Double:  %f \n",valueDouble);
        System.out.printf("Boolean:  %b \n",valueBoolean);
        System.out.printf("Long:  %s \n",valueLong);
        System.out.printf("Char:    %s \n",valueChar);
        System.out.printf("String:  %s \n",valueString);
        System.out.println("---------------------------------- \n");

        System.out.print("--------Variable Data Type Array-------- \n");
        System.out.println("Byte: "+Arrays.toString(valueByteArray)+"\n");
        System.out.println("Short:   "+Arrays.toString(valueShortArray)+"\n");
        System.out.println("Integer: "+Arrays.toString(valueIntegerArray)+"\n");
        System.out.println("Float:   "+Arrays.toString(valueFloatArray)+"\n");
        System.out.println("Double:  "+Arrays.toString(valueDoubleArray)+"\n");
        System.out.println("Long:  "+Arrays.toString(valueLongArray)+"\n");
        System.out.println("Boolean:    "+Arrays.toString(valueBooleanArray)+"\n");
        System.out.println("Char:    "+Arrays.toString(valueCharArray)+"\n");
        System.out.println("String:  "+Arrays.toString(valueStringArray)+"\n");
        System.out.print("---------------------------------- \n");

    }
}
