public class Result{
    public  static void main(String args[]){
        sum(10,10);
        sum(10,10,10);
        sum(2 ,5, 10, 4);
        printMyName("saikat", 23);
        printMyName("name", 23, "Bogra");
    }
    static void sum(int a, int b){
        System.out.println("I am 1");
        System.out.println(a + b);
    }
    static void sum(int a, int b, int c){
        System.out.println("I am 2");

        System.out.println(a + b + c);
    }
    static void sum(int a, int b, int c, int d){
        System.out.println("I am 3");
        System.out.println(a + b + c + d);
    }
    static void printMyName(String name , int age){
        System.out.println("My name is " + name + "my age is " + age);
    }
    static void printMyName(String name , int age , String address){
        System.out.println("My name is " + name + "my age is " + age + "My address is " + address);
    }
}

