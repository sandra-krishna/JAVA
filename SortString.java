import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sandra Krishna P S");
	System.out.println("46");
	System.out.println("26/02/24");
	System.out.println("SortString");
        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();
        String[] strings = input.split("\\s+");
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}

