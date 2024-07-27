package practice.truyenthamtri;

public class Run {
    public static void setNumber (int number) {
        number = 2;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

//        Run run = new Run();

        setNumber(x);
//        run.setNumber(x);
        System.out.println(x);

    }
}
