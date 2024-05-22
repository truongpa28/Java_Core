public class Main {

    static int x = 10;

    public static void main(String[] args) {

        demTiep();

        System.out.println("x:" +x);
    }

    static void demTiep() {
        x++;
        ++x;
    }

}