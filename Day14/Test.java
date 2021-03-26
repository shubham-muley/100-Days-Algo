public class Test {
    public static void main(String args[]){
        try {
            linkedlist<Integer> Linkedlist = new linkedlist<>();
            Linkedlist.addFirst(14);
            Linkedlist.addFirst(546);
            Linkedlist.addLast(36);
            Linkedlist.addLast(63);
            Linkedlist.addLast(60);
            Linkedlist.addLast(62);
            Linkedlist.addLast(67);
            Linkedlist.iterateForward();
            Linkedlist.printMiddle_n();
            Linkedlist.reverse();
            Linkedlist.iterateForward();
            Linkedlist.removeFirst();
            Linkedlist.iterateForward();
            Linkedlist.printMiddle_n();
            System.out.println("Does the 1st LinkedList have loop : "+Linkedlist.hasLoop());
            linkedlist<Integer> loop_list = linkedlist.createWithLoop();
            System.out.println("Does the 2nd LinkedList have loop : "+loop_list.hasLoop());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
