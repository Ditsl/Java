import java.util.Arrays;
public class KuoRong {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		arr=Arrays.copyOf(arr, arr.length/2);
		System.out.println(Arrays.toString(arr));
	}
}[1, 2, 3]
