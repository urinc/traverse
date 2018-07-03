public class CustomArrayList {

    int[] arr;

    void add(int value) {
        if (arr == null) {
            arr = new int[]{value};
        } else if (arr != null) {
            int[] tmp = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            tmp[tmp.length - 1] = value;
            arr = tmp;
        }

    }

    void add(int value, int index) {
        if (arr.length - 1 < index) {
            throw new ArithmeticException("Index is out of bounds");
        }

        int[] tmp = new int[arr.length + 1];

        for (int i = 0; i < tmp.length-1; i++) {

            if (i<index){
                tmp[i]=arr[i];
            }

            else if (i==index){
                tmp[i]=value;
                tmp[i+1]=arr[i];
            }

            else if (i>index){
                tmp[i+1]=arr[i];
            }

        }
        arr= tmp;


    }
    void set(int index, int value){
        arr[index]= value;
    }

    int size() {
        return arr.length;
    }


    @Override
    public String toString() {


        if (arr == null) {
            throw new ArithmeticException("Empty list");
        }


        String result = "";
        for (int i : arr) {
            result += i + ",";
        }
        return result;
    }


}
