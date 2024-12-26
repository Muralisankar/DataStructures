package DataStructures.DataStructures;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int intArray[] = {20,35,-15,7,55,1,-22};
		
		for(int unsort=intArray.length-1;unsort>0;unsort--) {
			
			int large=0;
			for(int i=1;i<=unsort;i++) {
				
				if(intArray[i]>intArray[large]) {
					
					large=i;
				}
			}
			swap(intArray,large,unsort);
		}
		
		for(int i:intArray) {
			
			System.out.print(i+" ");
		}
		
	}
	
	public static void swap(int intArray[],int i,int j) {
		
		if(i==j) {
			
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
