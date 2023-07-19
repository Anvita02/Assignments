import java.util.Arrays;
public class Main3 {
 public static void main(String [] args) {
	 int arr[][]= {{10,20,35,82,95}};
	 int arr2[][]= {{10,15,22}};
	 System.out.println("Arrays when compared: "+Arrays.deepEquals(arr, arr2));
 }
}
