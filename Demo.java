import java.util.*;
public class Demo{
	public static void main(String[] args){

//       ARRAYS 
 		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		for(int i=0;i<5;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++){
			System.out.println("marks = "+array[i]);
		}



//          -- -- Taking No of Employee And Store Their name in Arrays

		System.out.println("please enter the name of employee");
		int n=sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
	
		for(int k=0;k<a.length;k++) {
		System.out.println("Please enter the name of employee "+(k+1));
		a[k]=sc.nextLine();
		}
	
	//o/p
		for(int l=0;l<a.length;l++) {
		System.out.print(a[l]+" ");
		}	
	
		System.out.println();

		
//       ------ 2D Arrays --------------       ///

		int arrays[][]=new int[3][5];
		for(int b=0;b<3;b++){
			System.out.println("Enter the marks of class = "+b);
			for(int j=0;j<arrays[b].length;j++){
				System.out.println("Enter the marks of class "+b+" -> "+j+"th Student");
				arrays[b][j]=sc.nextInt();
			}
		}
		int b=arrays[0].length;
		System.out.println(a);
		for(int m=0;m<3;m++){
			System.out.println("Class "+m+" Students ");
			for(int j=0;j<5;j++){
				System.out.print(arrays[m][j]+" ");
			}
			System.out.println();
		}
		}
}
