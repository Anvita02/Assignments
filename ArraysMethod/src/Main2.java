import java.util.Arrays;
public class Main2 {
 public static void main(String [] args) {
	 int arr[]= {10,30,35,52,75};
	 Arrays.sort(arr);
	 int element=35;
	 System.out.println("ele is found at index="+Arrays.binarySearch(arr, element)); 
 }
}
