package exercise8;

class A {
    public A () {
        System.out.println("constructed an instance of A");
    }
    @Override
    public String toString ()  {
        return "this is A";
    }
}

class B extends A {
    public B () {
        System.out.println("constructed the instance of B");
    }
    @Override
    public String toString () {
        return "this is B";
    }
}

class C extends B {
    public C () {
        System.out.println("constructed the instance of C");
    }
    @Override
    public String toString () {
        return "this is C";
    }
}

public class TestCasting {
    public static void main(String[] args) {
        A a = new B();
        A a1 = new C();
        A a2 = new A();
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("------------------------");
        B b = new C();
        System.out.println(b);



    }
}