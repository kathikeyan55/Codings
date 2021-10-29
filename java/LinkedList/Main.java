package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node head =  UtillList.takeInput();
        UtillList.print(head);
        System.out.println();
        Node rev = UtillList.reverIretive(head);
        UtillList.print(rev);

    }
}
