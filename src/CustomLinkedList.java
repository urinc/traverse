public class CustomLinkedList {

    Element firstElement;
    Element currentElement;

    void add(int value) {
        Element element = new Element(value);

        if (firstElement == null) {
            firstElement = element;
            currentElement = element;
        }
        if (firstElement != null) {
            currentElement.nextElement = element;
            currentElement = element;

        }
    }

    void add(int value, int index) {
        Element prevElement = getElement(index);
        Element newElement = new Element(value);
        newElement.nextElement = prevElement.nextElement;
        prevElement.nextElement = newElement;
    }

    int size() {
        int size = 0;
        Element currentElement = firstElement;

        if (currentElement != null) {
            size++;
            while (currentElement.nextElement != null) {
                size++;
                currentElement = currentElement.nextElement;
            }
        }
        return size;
    }

    Element getElement(int index) {
        check(index);
        Element currentElement = firstElement;
        for (int i = 0; i < index; i++) {
            if (currentElement.nextElement != null)
                currentElement = currentElement.nextElement;
        }
        return currentElement;
    }

    int get(int index) {

        Element element = getElement(index);
        return element.value;
    }

    @Override
    public String toString() {
        int size = size();
        String result = "";
        for (int i = 0; i < size; i++) {
            //System.out.print(get(i)+ ",");
            result += get(i) + ",";

        }
        return result;

    }

    void check(int index) {

        int listSize = size() - 1;
        if (firstElement == null) {
            throw new ArithmeticException("Empty list");
        } else if (index > listSize) {
            throw new ArithmeticException("Index is out of bounds");
        }


    }

    class Element {
        Element nextElement;
        int value;

        Element(int value) {
            this.value = value;
        }
    }


}
