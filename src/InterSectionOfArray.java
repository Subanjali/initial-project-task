import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
		List<Integer> outputList =  new ArrayList<Integer>();
		for(int i = 0; i<arrayOne.length; i++ ) {
			for(int j = 0; j<arrayTwo.length; j++) {
				if(arrayOne[i]==arrayTwo[j]) {
					if(!outputList.contains(arrayTwo[j]))
						outputList.add(arrayTwo[j]);
				}
			}
		}
		System.out.println(outputList);
	}



}
