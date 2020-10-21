package lesson1;

public class lesson12 {

	public static void main(String[] args) {

		int[] array =new int[10];
		int  min, max;
		 
		for (int i=0; i < array.length; i++) {
			array[i]=(i*i)+2;
			System.out.print (array[i] + "  ");
			
		}
		max= array[0];
		
		for (int i=0; i < array.length; i++) {
			array[i]=(i*i)+2;
			
		if (array[i] > max) 
			max= array[i];
		}
			System.out.println();
			System.out.println("max:");
			System.out.println(max);
		
		min= array[0];
		
		for (int i=0; i < array.length; i++) {
				array[i]= (i*i)+2;
				
		if (min > array[i])
			min= array[i];
		}
			System.out.println();
			System.out.println("min:");
			System.out.println(min);
		
		

				
	}
}

