package by.belstu.Prutenskaya;

public class TextFunc{
    public TextFunc() {
        System.out.println("Constructor");
    }

    public String getVAl() {
        sayWord();                                                   //??
        return "Hello from first project";
    }

    public void sayWord() {
        System.out.println("kek");
    }

    private int count;
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void onCreate()    {
        for (int j = 0; j < 10; j++) {
            System.out.println("Counter   " + j);
        }
    }
}