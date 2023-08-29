package src;

public class Scanner {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    private int scan = scanner.nextInt();
    private boolean zero = false;

    public void setScan(int scan) {
        this.scan = scan;
    }

    public String toString() {
        if (scan == 0) {
            zero = true;
        }
        scanner.close();
        return "";
    }
}
