class q6{
    public static void main(String[]args){
        double  a = 10;
        double  b = 9;
        double perimeter = 36;
        double c = perimeter - a - b;
        // s is semiperimeter ;
        double s  =  ( a +  b +  c) / 2;
         double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
         System.out.println(" area of triangle is: " + area + " cmsquare");
    }
}