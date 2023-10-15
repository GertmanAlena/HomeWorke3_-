public class Main {
    public static void main(String[] args) {
        Calculator.sum(2, 5);
        System.out.println(Calculator.sum(2, 5));
        System.out.println(Calculator.sum(2.2, 5));
        System.out.println(Calculator.divide(10, 3));

        Array array = new Array();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array);
        Array array2 = new Array();
        array2.add(1);
        array2.add(2);
        array2.add(3);
//        array2.add(4);
        System.out.println(array2);

        array.compareArrays(array, array2);
        System.out.println(array.compareArrays(array, array2));

        Pair pair = new Pair(2, "5");
        
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}