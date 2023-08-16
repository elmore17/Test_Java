public class SwapTemp {
    public static void main(String[] args){
        System.out.println("Задание №2:");
        int a = 5;
        int b = 7;
        System.out.println("Значения до: " + "a=" + a + "," + "b=" + b);
        swapwhithTemp(a, b);
    }

    private static void swapwhithTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения после: " + "a=" + a + "," + "b=" + b);
    }
}
