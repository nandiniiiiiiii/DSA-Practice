//creating a custom error
class NegaitiveDim extends Exception{
    @Override
    public String toString(){
        return "dim cant be negative";
    }

    @Override
    public String getMessage(){
        return "dim is negative";
    }
}

public class ExpHandle {
    public static int divide(int a,int b) throws Exception{        //use to identify what will give error
        return a/b;
    }

    public static double area(int a,int b) throws NegaitiveDim{
        if(a<0 || b<0){
            throw new NegaitiveDim();
        }
        return a*b;
    }
    public static void main(String args[]) throws NegaitiveDim{
        try{
            System.out.println("divisioin is: "+divide(4, 0));
        }catch(Exception e){
            // System.out.println(e);
            System.out.println("Exception");
        }

        System.out.println("area is: "+area(2, 4));
    }
}


