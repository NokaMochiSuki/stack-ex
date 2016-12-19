public class StackArray extends AbstractStack {
    private String[] data;
    private int topIndex;

    public StackArray(int size){
        data = new String[size];
        topIndex = -1;
    }

    @Override
    public void push(String item){
        if( isFull() == true ) {
            System.out.println("stack is full!");
        }else {
            topIndex++;
            data[topIndex] = item;
        }
    }

    @Override
    public String pop(){
        if( isEmpty() == true ) {
            System.out.println("stack is empty!");
            return null;
        }else {
            String temp = data[topIndex];
            topIndex--;
            return temp;
        }
    }

    @Override
    public boolean isEmpty(){
        return (topIndex < 0);
    }

    @Override
    public boolean isFull(){
        if( topIndex <= (data.length - 1) ) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString(){
        return data[topIndex];
    }
}
