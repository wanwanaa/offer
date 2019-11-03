import java.util.Scanner;
public class base {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(Find(target, a));
	}
	// 从右上角开始查找
	// 如果该数大则向左找
	// 如果该数小则向右找
	public static boolean Find(int target, int[][] a) {
		int n = a.length, m = a[0].length;
		int i = 0, j = m-1;
		while(i>=0 && i<n && j>=0 && j<m)
		{
			if(a[i][j]>target)
				j -= 1;
			else if(a[i][j]<target)
				i += 1;
			else
				return true;
		}
		return false;
	}
}
