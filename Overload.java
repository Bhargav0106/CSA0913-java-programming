class Overload 
{
    int var1;
    int var2;
    public void assignValues(int value) 
    {
        var1=value;
        var2=value;
    }
    public void assignValues(int value1,int value2)
    {
        var1=value1;
        var2=value2;
    }
    public void printValues()
    {
        System.out.println("var1:"+var1);
        System.out.println("var2:"+var2);
    }
    public static void main(String[] args)
    {
        Overload overload=new Overload();
        overload.assignValues(5);
        System.out.println("Values after assigning with one argument:");
        overload.printValues();
        System.out.println();
        overload.assignValues(10,20);
        System.out.println("Values after assigning with two arguments:");
        overload.printValues();
    }
}
