import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        BookFactory bookFactory1 = new BookFactory(a);
        bookFactory1.getBook().readBook();


        BookFactory bookFactory2 = new BookFactory(b);
        bookFactory2.getBook().readBook();

        BookFactory bookFactory3 = new BookFactory(c);
        bookFactory3.getBook().readBook();



        GadgetFactory gadgetFactory1 = new GadgetFactory(a);
        System.out.println(gadgetFactory1.getGadget().getWeight());

        GadgetFactory gadgetFactory2 = new GadgetFactory(b);
        System.out.println(gadgetFactory2.getGadget().getWeight());

        GadgetFactory gadgetFactory3 = new GadgetFactory(c);
        System.out.println(gadgetFactory3.getGadget().getWeight());
    }
}
