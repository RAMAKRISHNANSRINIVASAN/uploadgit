package segue2practice;

public class ExceptionHan {
    public static void main(String[] args) {
        int a[] = {4, 6, 17, 8, 9, 3, 4, 6, 7, 2, 23, 14, 5};

        System.out.println("starting of the code");

        try {
            for (int i = 1; i < a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("finally");
        }

        System.out.println("ending of the code");
    }
}
