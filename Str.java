public class Str {
    public static void main(String args[]){
        int a = 4;
        float b = 4.5676f;
        System.out.printf("a is: %d and b is: %f \n",a,b);

        //string methods
        //string are mutable
        String name = "Nandini";
        System.out.println(name);
        int val  = name.length();
        System.out.println("Length: "+val);
        String str1 = name.toLowerCase();
        System.out.println(str1);
        System.out.println(name.trim());      //remove back&foward trailling spaces
        System.out.println(name.substring(3));         //will slice the string from index 3 till the end
        System.out.println(name.substring(3,5));         //will slice the string from index 3 till the index 5
        System.out.println(name.replace('n','z'));
        System.out.println(name.startsWith("Nan"));
        System.out.println(name.endsWith("Nan"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("n"));         //if match not found then it return -1 other wise it returns index of the 1st char that matches the arg
        System.out.println(name.lastIndexOf("n"));     //gives the index of the letter n from the last 
        System.out.println(name.equals("nandini"));   
        System.out.println(name.equalsIgnoreCase("nandini"));   
        // Escape Sequence char:         \n \t \" \\
        //to detect double and tripple spaces in a sentence
        String str2 = "hello i  am   nandini and   who   are you    ?";
        System.out.println(str2);
        System.out.println(str2.indexOf("  "));
        System.out.println(str2.indexOf("   "));
    }
}
