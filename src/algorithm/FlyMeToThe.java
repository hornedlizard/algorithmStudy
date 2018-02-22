package algorithm;
import java.util.Scanner;
public class FlyMeToThe {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
		    int y = sc.nextInt();
		    int d = y-x;
            int cnt = 0;
	    	int sum = 0;
	    	int remain = 0;
	    	int maxSpeed = 0;
            while (sum*2<=d) {
			    maxSpeed++;
			    sum+=maxSpeed;
		    	cnt++;
		    }
	    	cnt--;
	    	sum=sum-maxSpeed;
	    	maxSpeed--;
	    	remain = d-sum*2;
	    	//System.out.println(cnt);
	    	if (remain==0) {
	    		System.out.print("1 ");
	    		System.out.println(cnt*2);
	    	} else if (remain<=maxSpeed+1){
	    		System.out.print("2 ");
	    		System.out.println(cnt*2+1);		
	    	}else if (remain>maxSpeed+1) {
	    		System.out.print("3 ");
	    		System.out.println((cnt*2)+remain/(maxSpeed+1)+1);
	    	}
		}
		
	}
	
}
