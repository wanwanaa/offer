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
		// �����ַ���,�ҵ��ո����
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == ' ')
				num += 1;
		}
		int oldlength = s.length();
		int newlength = oldlength + num * 2;
		// ��������ָ��, �ֱ�ָ��ԭ�ַ���β�������ӳ��Ⱥ���ַ���β��
		// ��Ϊ�ո�ʱ�滻 ָ��ֱ�ǰ��1��3
		// ��Ϊ�ո�ʱ�������� ָ��ֱ�ǰ��1
		int p1 = oldlength-1;
		int p2 = newlength-1;
		// ���ַ��������³���
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
