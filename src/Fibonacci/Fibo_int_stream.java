package Fibonacci;
import java.util.stream.IntStream;
//Ряд Фибоначчи с возвратом типа int
public class Fibo_int_stream {
    private int oldLast = 0, last = 0, next = 1;
    public IntStream stream(){
        return IntStream.generate(() -> {
            oldLast = last;
            last = next;
            next = oldLast + next;
            return oldLast;
        });
    }
}
