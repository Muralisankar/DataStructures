package DataStructures.DataStructures;

public class InsertionSort {
	
	public static void main(String args[]) {
		
		int intArray[] = {20,35,-15,7,55,1,-22};
		
		for(int firstUnsort=1;firstUnsort<intArray.length;firstUnsort++) {
			
			int newElement = intArray[firstUnsort];
			int i;
			for(i=firstUnsort;i>0&&intArray[i-1]>newElement;i--) {
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;
		 }
	
		for(int i:intArray) {
			System.out.print(i+" ");
		}

	}
}
