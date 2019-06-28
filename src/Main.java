public class Main {

    public static void main(String[] args) {

        System.out.println("Stringi:");
        System.out.println();
        Pair<String> stringPair1 = new Pair("aaa", "bbb");
        System.out.println("Po prostu para 1");
        stringPair1.printPair();

        Pair<String> stringPair2 = new Pair<>("ccc", "ddd");
        System.out.println("Po prostu para 2");
        stringPair2.printPair();


        System.out.println("Para 2 po sklonowaniu");
        stringPair2.clone(stringPair1);

        stringPair2.printPair();

        System.out.println();
        System.out.println("Inty:");
        System.out.println();
        Pair<Integer> intPair1 = new Pair(1, 2);
        System.out.println("Po prostu para 1");
        intPair1.printPair();

        Pair<Integer> intPair2 = new Pair(3, 4);
        System.out.println("Po prostu para 2");
        intPair2.printPair();


        System.out.println("Para 2 po sklonowaniu");
        intPair2.clone(intPair1);

        intPair2.printPair();

    }
}
