package exe;

public class exercise11 {
    public static void main(String[] args) {
            int count = 0;
            for (int i = 1; i <= 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    count += i;
                }
                if (i % 15 == 0 || i % 21 == 0 || i % 35 == 0 || i % 105 == 0) {
                    count -= i;
                }
            }
        System.out.println(count);
    }
}
