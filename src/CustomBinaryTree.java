import java.util.ArrayDeque;

public class CustomBinaryTree {

    Element rootElement;

    Element[] array = new Element[16];

    public void add(int value) {
        Element el = new Element(value);

        if (rootElement == null) {
            rootElement = el;
            return;
        }

        Element currentElement = rootElement;

        while (true) {

            if (value > currentElement.value) {
                if (currentElement.right == null) {
                    currentElement.right = el;
                    return;
                }
                currentElement = currentElement.right;
            }

            else if (value < currentElement.value) {
                if (currentElement.left == null) {
                    currentElement.left = el;
                    return;
                }
                currentElement = currentElement.left;
            }
        }
    }


    public void traverse(){
        traverse(rootElement);
    }

    private void traverse(Element element){
        if (element.left != null)
            traverse(element.left);

        System.out.print(element.value + ", ");

        if (element.right != null)
            traverse(element.right);
    }

    public void traverseWidth(){
        traverseWidth(rootElement);
    }


    private void traverseWidth(Element el){
        if (el == null ) return ;

        ArrayDeque<Element> q = new ArrayDeque<Element>();
        q.offer(el);


        while (q.size()>0){
            Element tmp = q.poll();
          System.err.print(tmp.value +", ");

         if (tmp.left!=null)
             q.offer(tmp.left);

         if (tmp.right!=null)
             q.offer(tmp.right);
        }

    }


    class Element {

        Element right;
        Element left;
        int value;

        Element(int value) {
            this.value = value;
        }

    }


}
