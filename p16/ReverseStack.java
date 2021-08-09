import java.util.Arrays;
public class ReverseStackDemo {
/* A generic method for reversing an array */
public static <E> void reverse(E[] a){
Stack<E> buffer = new ArrayStack<>(a.length);
for (int i = 0; i < a.length; i++)
buffer.push(a[i]);
for (int i = 0; i < a.length; i++)
a[i] = buffer.pop();

}
/* Tester routine for reversing arrays. */
public static void main(String[] args){
Integer[] a = {4, 8, 15, 16, 23, 42};
String[] s = {"one", "two", "three", "four", "five"};
System.out.println("a = " + Arrays.toString(a));
System.out.println("c = " + Arrays.toString(s));
reverse(a);
reverse(s);
System.out.println("a = " + Arrays.toString(a));
System.out.println("c = " + Arrays.toString(s));
}
}
