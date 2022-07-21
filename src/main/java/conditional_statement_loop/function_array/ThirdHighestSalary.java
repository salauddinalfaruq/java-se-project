package conditional_statement_loop.function_array;

import java.util.Arrays;

public class ThirdHighestSalary {
    public static void main(String[] args) {

        int[] salary = {35000, 25000, 28000, 32500, 44000, 32800};
        Arrays.sort(salary);

        System.out.println("Third highest salary is: "+ salary[salary.length-3]);
    }
}
