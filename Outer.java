//import java.lang.*;
/*class Outer {
    int v = 30;
    static int r = 4;
    class inner {
        int v = 5;
        void show() {
            System.out.println(v);
            System.out.println(r);
        }
    }
    public static void main(String[] args) {
       /// new Outer().new inner().show();
       Outer o = new Outer();
       inner i = o.new inner();
       i.show();
       System.out.println(new Outer().v);
    }
}*/

/*class Outer {
    static int v = 30;
    int r = 4;
    static class inner {
        int l = 45;
        void show() {
            System.out.println(v);
        }
        public static void main(String[] args) {
            inner i = new inner();
            i.show();
        }
    }
    public static void main(String[] args) {
        System.out.println("In Outer Class");
    }
}*/

/*class Outer 
{
    static class inner {
        static void show(){
            System.out.println("In Inner");
        }
        public static void main(String[] args) {
            inner.show();
        }
    }
    public static void main(String[] args) {
        System.out.println("In Outer");
    }
}*/

