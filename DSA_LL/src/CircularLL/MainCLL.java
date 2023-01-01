package CircularLL;

public class MainCLL {

    public static void main(String[] args) {
        LinkedCLL list = new LinkedCLL();

        list.addElement(10);
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.addElement(50);
        list.addElement(60);

        list.display();

        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.display();
    }

}
