public class HelloWorld {
    void main() {
        System.out.println("Hello, World!");
    }

    public static void hanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        
        hanoi(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        hanoi(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        hanoi(n, 'A', 'C', 'B');
    }
}