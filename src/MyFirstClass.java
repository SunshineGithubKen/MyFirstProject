public class MyFirstClass {
    // followed tutorial to save local code at GitHub
    // use version control

    public int a;

    public int transform(int a){
        return a*3+4;
    }

    public static void main(String[] args) {
        MyFirstClass bbb = new MyFirstClass();
        bbb.a = bbb.transform(7);
        bbb.a = bbb.transform(bbb.a);
        System.out.println("Transforming a " + bbb.a);
    }
}
