package Les1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Борода on 22.11.2016.
 * класс для запуска калькулятора
 */
public class InteractRunner {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Calculate calc = new Calculate();
        String exit = "no";
        try {
            while (!exit.equals("yes")) {
                System.out.println("Enter first argument");
                String first = reader.readLine();
                System.out.println("Enter second argument");
                String second = reader.readLine();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result = " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit yes/no?");
                exit = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
