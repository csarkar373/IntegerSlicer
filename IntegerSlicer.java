
public class IntegerSlicer
{
    private int n;
    
    public IntegerSlicer() {
        this.n = (int)(Math.random()*1000);
    }
    
    public IntegerSlicer(int n) {
        this.n = n;
    }
    
    public int getDecimalPosition(int position) {
        int temp = n/position;
        return (temp % 10) * position;
    }
    
    public static void main(String [] args) {
        IntegerSlicer is1 = new IntegerSlicer(123);
        System.out.println( is1.getDecimalPosition(10) );
        System.out.println("--------------------");
        IntegerSlicer is2 = new IntegerSlicer(5678);
        System.out.println( is2.getDecimalPosition(1000) );
        System.out.println("--------------------");
        IntegerSlicer is3 = new IntegerSlicer();
        System.out.println( is3.getDecimalPosition(1) );
    }
}
