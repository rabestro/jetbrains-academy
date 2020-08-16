class Main {
    public static void main(String[] args) {
        final var year = new java.util.Scanner(System.in).nextInt();
        final var isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 > 0;
        System.out.println(isLeap ? "Leap" : "Regular");
    }
}
