import java.util.Scanner;

	public class leap {
		public static void main(String[] args) {
			System.out.println("������ �Է��Ͻÿ�.");
			Scanner leap = new Scanner(System.in);
			int year = leap.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "���� ����");
			} else {
				System.out.println(year + "���� ���");
			}
		}
	}

