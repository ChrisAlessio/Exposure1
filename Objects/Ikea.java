package Objects;

public class Ikea {

    public static void main(String[] args) {
        // datatype name = value;
        int example = 1;
        Table table1 = new Table();

        // These are the same;
        // String myString = new String("My string here");
        // String myString = "My string here";

        System.out.println(table1.getWeight());

        table1.setWeight(9999.0);


        System.out.println(table1.getWeight());



    }


}
