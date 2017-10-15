package classobj;
public class Class {       //class declaration
     public static int doublee(int x){
         return x*2; 
     }
   
    public static void main(String[] args) {
        Class object = new Class();//declaring an object for class Class
        int x=5;
        int y = object.doublee(x);//calling a method of class Class  
        System.out.println(y);
    }
    
}
