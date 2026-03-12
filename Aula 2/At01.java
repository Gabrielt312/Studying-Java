
public class At01 {
    public static void main(String[] args) {
        int i = 10, j = 2, x = 0, y = 0;

        j++;
        ++i;

        x = i++ + j;
        y = ++j + ++i;

        System.out.println("Soma do X: " + x);
        System.out.println("Soma do y: " + y);
    }
}
