package by.belstu.it.Prutenskaya;

public class TextFunction {
    public String getValue() {                                  //основной метод
        sayWord();                                              //вызываем доп. метод
        return "Hello from first project";
    }

    public void sayWord() {                                     //доп. метод
        System.out.println("Laba_2 ");
    }

    private int count;                                          //переменная с ограниченным методом доступа(только внутри класса)
    public int getCount() {                                     /*аксессоры get и set(позволяют читать и переопределять переменную
                                                                   с ограниченным методом доступа*/
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void onCreate()    {                                //цикл
        for (int j = 0; j < 10; j++) {
            System.out.println("Counter   " + j);
        }
    }
}
