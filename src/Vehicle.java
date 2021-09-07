class Vehicle{
    void run(int a , int b){
            System.out.println(" i am 1 "+ (a+b));
    }
}
class A {
    void run(int a  ,int b){
        System.out.println("I am 2 " + (a+b));
    }
}
class Bike{
    public static void main(String args[]){
       A obj = new A();
       Vehicle vehicle = new Vehicle();
       vehicle.run(45,45);
       obj.run(60,60);
    }
}
