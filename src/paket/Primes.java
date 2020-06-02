package paket;

public class Primes {
	public static boolean isPrime(int n)//����� ���������� tru� ���� �����  �������, ����� false
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return(false);
        return (true);
        
    }
    public static void main(String[] args)//����� ������� ������ ������� ����� ������ 100
    {
        for (int a = 2; a <= 100; a++)
            if (isPrime(a))
                System.out.println(a);
    }

}
