import java.util.*;
public class invtpat{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number Sir");
		int n=s.nextInt();
		for (int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
