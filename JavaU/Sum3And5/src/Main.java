public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++){
            if((i%3 ==0 && i%5 ==0) && counter <= 5 ){
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        System.out.println("Sum = "+sum);

    }
}
