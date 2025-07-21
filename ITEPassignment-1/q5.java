class q5{
    public static void main(String[]args){
        int totalcost= 1600;
        int length= 20;
        int rate= 25;
        int breadth;
        int perimeter;
        int area;
        area = totalcost/rate;
        breadth = area/length;
        perimeter =  2*(length + breadth);
        System.out.println("the perimeter of park :" + perimeter +"meter");
        System.out.println("the breath of park: " + breadth + "meter");
        System.out.println("the area of park: " + area + "meter\u00B2");
    }
}