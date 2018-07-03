public class Main {

    public static void main(String[] args) {


//customLinkedList();
//customArrayList();
customBinaryTree();


    }
    static void customLinkedList() {
        CustomLinkedList cll = new CustomLinkedList();

        cll.add(0);
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);

        System.out.println("Size of the array: " + cll.size());
        int index = 4;
        System.out.println("Value of " + index + " is " + cll.get(index));
        System.out.println(cll);

        cll.add(-1, 2);
        System.out.println(cll);
    }


    static void customArrayList() {

        CustomArrayList cal = new CustomArrayList();
      //
       // System.out.println(cal);
        cal.add(0);
        System.out.println(cal);
       cal.add(1);
      cal.add(2);
      cal.add(3);
        cal.add(4);

        System.out.println(cal);

        cal.add(-1, 2);
        System.out.println(cal);
        cal.set(5, -4);
        System.out.println(cal);
    }

    static void customBinaryTree(){

        CustomBinaryTree bt = new CustomBinaryTree();

        bt.add(8);

        bt.add(4);
        bt.add(12);

        bt.add(2);
        bt.add(6);
        bt.add(10);
        bt.add(14);

        bt.add(1);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(11);
        bt.add(13);
        bt.add(15);


bt.traverse();
       System.out.println("_________________________");
bt.traverseWidth();


    }


}

