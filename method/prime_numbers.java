public class prime_numbers {
    public static boolean prime(int number){
        for (int i = 2;i < number;i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){
        for (int i = 2; i<1000; i++){
            if (prime(i)){
                System.out.println(i);
            }
        }
    }
}
