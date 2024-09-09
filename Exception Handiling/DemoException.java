public class DemoException {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int k;
        int  arr[]={1,2,3,4,5,6};
        try{
           System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unknown exception"+e.getMessage());
        }
        finally{
            System.out.println("Finnally bye");
        }
    }
}
