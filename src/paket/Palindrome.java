package paket;
import java.util.Scanner;
public class Palindrome {
	
	public static String reverseString(String s) {//����� ���������������� ������
	    String s1 = "";
	    for (int i = s.length() - 1; i >= 0; i--) 
	    	s1 += s.charAt(i);
	    return s1;
	}


	public static Boolean isPalindrome(String s) {//����� ��� ��������� �����
		return s.equals(reverseString(s));
}
	public static void main(String[] args)// ����� ���������� �������� �� ������ �����������
    { 
       @SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
       String s=scanner.nextLine();
        String words[] = s.split(" ");
         for (String word: words){
            System.out.println(isPalindrome(word));
        }
        
    }
}
