public class printHelloWorld {
    public static void main(String[] args) {
        String hello = "Hello World!";
        char array[] = new char[12];

        for (int i = 0; i < array.length; i++){
            array[i] = hello.charAt(i);
            System.out.print(hello.charAt(i));
        }
    }
}
