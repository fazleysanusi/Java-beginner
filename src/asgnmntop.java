public class asgnmntop {
    public static void main(String[] args){

        //Simple assgins
        byte bt = 24;
        System.out.println("bt: " + bt);

        //Increments then assigns
        bt += 10;
        System.out.println("bt: " + bt);

        //Decrements then assigns
        bt -= 2;
        System.out.println("bt: " + bt);

        //Multiples
        bt *= 2;
        System.out.println("bt: " + bt);

        //Divides
        bt /= 2;
        System.out.println("bt: " + bt);

        //Modulus then assigns
        bt %=2;
        System.out.println("bt: " + bt);

        //Binary left shift then assigns
        bt <<=3;
        System.out.println("bt: " + bt);

        //Binary right shift then assigns

        bt >>=4;
        System.out.println("bt: " + bt);

        //Shift right zero fill and assigns
        bt >>>=1;
        System.out.println("bt: " + bt);

        //Binary AND assigns
        bt &=4;

        //Binary exclusive OR and assigns
        bt ^=4;
        System.out.println("bt: " + bt);

        //Binary Inclusive OR and assigns
        bt |=4;
        System.out.println("bt: " + bt);
    }
}
