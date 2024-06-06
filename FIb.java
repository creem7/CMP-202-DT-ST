public class FIb {


    public static void main(String[] args) {
        int first = 0, second = 1, next;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i < 10; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }

    }
    //don't remove an item from a stack when it is empty
    //insert at the top of the stack
    // remove from the top of a stack
    //don't insert into a full stack


}
