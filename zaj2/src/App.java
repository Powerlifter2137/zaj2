import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int [] tab1 = {1, 2, 3, 4, 5, 3, 4, 3, 3};
        System.out.println(zad1(tab1, 3));
        System.out.println(Arrays.toString(zad2(1, 11)));
        System.out.println(zad3(tab1, 3));
        System.out.println(zad4(5));
    }

    static int zad1 (int[] tablica, int number){
        int index = 0;
        for (int i : tablica){
            if (i == number){
                return index;
            }
            index ++;
        }
        return -1;
    }

    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2 ;i<=num/2; i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }

    static int[] zad2(int a, int b) {
        int index = 0;
        int[] primes = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(primes, index); // Trim the array to the actual size
    }

    static int zad3 (int[] arr, int num){
        int howMany = 0;
        for (int i : arr){
            if (i == num) {
                howMany ++;
            }
        }
        return howMany;
    }

    static int zad4 (int number){
        if (number==1) {
            return 1;
        }
        else return number + zad4(number-1);
    }
}
