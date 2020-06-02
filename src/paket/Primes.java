package paket;

public class Primes {
	public static boolean isPrime(int n)//метод возвращает truе если число  простое, иначе false
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return(false);
        return (true);
        
    }
    public static void main(String[] args)//метод выводит список простых чисел меньше 100
    {
        for (int a = 2; a <= 100; a++)
            if (isPrime(a))
                System.out.println(a);
    }

}
