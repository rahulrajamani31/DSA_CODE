package DLL;

public class MainDLL {
    public static void main(String[] args) {
        LinkedDLL list =new LinkedDLL();

        list.Insert(10);
        list.Insert(20);
        list.Insert(30);
        list.Insert(40);
        list.Insert(50);
        list.InsertMiddle(90,4);
        list.InsertFirst(2000);

        list.Display();
        System.out.println("============");
        list.ReverseDisplay();
        System.out.println("==================================================");
        list.removefirst();
        list.removelast();
        list.Display();
        System.out.println("============");
        list.ReverseDisplay();

    }
}
