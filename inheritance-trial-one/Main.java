public class Main {

    int age;
    float height;
    String name;
    String password;

    public void printUserData() {
        age = 18;
        height = 160;
        name = "Shenum";
        name.length();

        password = "123456";
        if (password.contains("123456") && password.contains("abcdef")) {
            System.out.println("Invalid password (too easy)");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
