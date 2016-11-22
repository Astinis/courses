package Les1;



/**
 Created by Борода on 22.11.2016.
 класс реализует калькулятор
 */
public class Calculate {
    //результат вычисления
    private int result;

    /**
     суммируем аргументы.
     @param params Аргументы суммирования
     */
    public void add(int ... params){
        for (Integer param : params)
            this.result += param;
    }

    /**
     * получить результат
     * @return результат вычисления
     */
    public int getResult(){
        return this.result;
    }

    /**
     * очистить результат вычисления
     */
    public void cleanResult(){
        this.result = 0;
    }

}
