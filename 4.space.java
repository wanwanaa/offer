import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class space {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer str = new StringBuffer(s);
		System.out.println(replace_space(str));
	}
	public static String replace_space(StringBuffer s) {
		int num = 0;
		// 遍历字符串,找到空格个数
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == ' ')
				num += 1;
		}
		int oldlength = s.length();
		int newlength = oldlength + num * 2;
		// 设置两个指针, 分别指向原字符串尾部和增加长度后的字符串尾部
		// 当为空格时替换 指针分别前移1和3
		// 不为空格时正常复杂 指针分别前移1
		int p1 = oldlength-1;
		int p2 = newlength-1;
		// 给字符串设置新长度
		s.setLength(newlength);
		while(p1 >= 0 && p2 > p1)
		{
			if(s.charAt(p1) == ' ')
			{
				s.setCharAt(p2, '0');
				s.setCharAt(p2-1, '2');
				s.setCharAt(p2-2, '%');
				p2 -= 3;
				p1 -= 1;
			}
			else
			{
				s.setCharAt(p2, s.charAt(p1));
				p1 -= 1;
				p2 -= 1;
			}
		}
		return s.toString();
	}
}
