import java.util.Scanner;
class AddTwoMatrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		
		int first[][]=new int[m][n];
		int second[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		System.out.println("Enter the first matrix");

		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				first[c][d]=sc.nextInt();
			}
		}
		
		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				System.out.print(first[c][d] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Enter the second matrix");
		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				second[c][d]=sc.nextInt();
			}
		}
		
		

		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				System.out.print(second[c][d] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				sum[c][d]=first[c][d]+second[c][d];
			}
		}
		

		System.out.println("Sum matrix");

		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				System.out.print(sum[c][d] + "\t");
			}
			System.out.println();
		}
		
	}
}