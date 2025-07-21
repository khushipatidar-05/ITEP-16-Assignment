class q21{
    public static void main(String[]args){
        double l1 = 15;
        double b1 = 8;
        double h1 = 5;
        // no.of bricks use to make well
        double l2 = 15;
        double b2 = 10*100;
        double h2 =8*100;
         double Vbrick = l1 * b1 * h1;
        double Vwall = l2 *  b2 * h2;
       double  noofbrick =(Vwall / Vbrick);
        System.out.printf("number of bricks: % .2f\n" ,noofbrick);
    }
}