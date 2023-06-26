package collections_examoles;
import java.util.Scanner;

public class Array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter values to array");
int total=0;
for (int i=0;i<array.length;i++) {
	array[i]=sc.nextInt();
	total=total+array[i];
	
	
}
System.out.println("total:"+total);

	}

}
