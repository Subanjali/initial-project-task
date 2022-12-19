import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * InterSectionOfArray class will read two input array from user and perform intersection
 * on the array values and it will print result.
 * @author Suba
 *
 */

public class InterSectionOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the arrayOne:");
		int arrayOneSize = scanner.nextInt();
		int [] arrayOne = new int[arrayOneSize];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<arrayOneSize; i++ ) {
			arrayOne[i] = scanner.nextInt();
		}
		System.out.println("Enter the length of the arrayTwo:");
		int arrayTwoSize = scanner.nextInt();
		int [] arrayTwo = new int[arrayTwoSize];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<arrayTwoSize; i++ ) {
			arrayTwo[i] = scanner.nextInt();
		}
		System.out.println("Intersection of the two arrays ::");
		
		Set<Integer> outputSet = Arrays.stream(arrayOne).boxed().collect(Collectors.toSet());
		outputSet.retainAll(Arrays.stream(arrayTwo).boxed().collect(Collectors.toSet()));
		System.out.println(outputSet);
		
}



}
