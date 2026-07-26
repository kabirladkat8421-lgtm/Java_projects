
public class UseOfArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int index = 0;

		for (int a : arr)

		{//Prefering modern way
			System.out.println(a + " index is :" + index);
			index++;
		}
	}

}

/*
 * for(int i =0; i<arr.length;i++) {
 * System.out.println(arr[i]+" index of array is: "+i); } } }
 */