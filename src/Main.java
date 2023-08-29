public class Main {

    public static void Swap(int a, int b){ // Статический метод для XOR обмена значениями двух переменных
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
    }
    //Сложность алгоритма O(n)
    public static void main(String[] args) {
        System.out.println("ex1 a = 3, b = 4");
        Swap(3, 4); //Проверка работоспособности
        System.out.println("ex2 a = -2147483648, b = 2147483647"); //Проверка работоспособности на самом большом и самом малом числе
        Swap(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("ex3 a = 4, b = 4");//Проверка работоспособности на одинаковых числах
        Swap(4,4);

    }
}