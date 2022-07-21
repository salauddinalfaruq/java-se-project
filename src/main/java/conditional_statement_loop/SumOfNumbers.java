package conditional_statement_loop;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int num = 100;

        for(int i= 0; i <= num; i++){
            if(i % 5 == 0){
                System.out.println(i+ "");
                sum += i;
            }
        }
        System.out.println("sum "+ sum);
    }
}
