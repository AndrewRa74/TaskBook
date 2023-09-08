package Fibonacci;
import java.util.stream.Stream;
//Ряд Фибоначчи с возвратом типа String в формате 'i: n'
public class Fibo_string_stream {
    int oldLast = 0, last = 0, next = 1 , i=0;
    String str="";
    public Stream<String> stream(){
        return Stream.generate(() -> {
           oldLast = last;
           last = next;
           next = oldLast + next;
           str = i+": "+oldLast;
           i++;
           return str;
        });
    }
}
