package kz.kaznu.aiym.second;

public class MainApp {
    public static void main(String[] args) {

        Box myBox = new Box(30, 20, 15, "Красный");

        myBox.printInfo();

        myBox.putItem("Книга");

        myBox.open();
        myBox.putItem("Книга");

        myBox.repaint("Красный");
        myBox.printInfo();

        myBox.close();
        myBox.removeItem();

    }
}