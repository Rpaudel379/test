public class Arrays {

    static void myStaticFunc() {
        System.out.println("hello java");
    }

    public void myPublicFunc() {
        System.out.println("hello public");
    }

    public static void main(String[] args) {
        myStaticFunc();
        Arrays myObj = new Arrays();
        myObj.myPublicFunc();

    }
}
