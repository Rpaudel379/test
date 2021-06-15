public class Main {

    int modelYear;
    String modelName;

    public Main(int y, String name) {
        modelYear = y;
        modelName = name;
    }

    public static void main(String[] args) {

        Main myObj = new Main(1996, "Mustang");

        System.out.print(myObj.modelYear + " " + myObj.modelName);

    }
}
