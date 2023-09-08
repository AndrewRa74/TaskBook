package Fibonacci;
//Ряд Фибоначчи
public class Main {
    public static void main(String[] args) {
        Fibo f = new Fibo();
        //Простым методом, в цикле for()
        System.out.println(f.fibo(40));
        //Созданием потока типа String
        Fibo_string_stream fss = new Fibo_string_stream();
        fss.stream().limit(40).forEachOrdered(System.out::println);
        //Созданием потока типа int
        Fibo_int_stream fis = new Fibo_int_stream();
        fis.stream().limit(40).forEachOrdered(System.out::println);
    }
}