class q4{
    public static void main(String[]args){
        double length= 300;
        double wide= 150;
        double area;
        area= length*wide;
        double rateper100sqm= 6;
         double numberof100sqm=area/100;
         double totalcost=numberof100sqm*rateper100sqm;
         System.out.println("totalcost"+totalcost);
    }
}