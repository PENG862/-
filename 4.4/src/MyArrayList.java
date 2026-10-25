public class MyArrayList <T>{
    private Object [] elements;
    private int size;

    public MyArrayList() {
        this.elements=new Object[3];
        size=0;
    }
    public void add(T element){
        if (size==elements.length){
            int newLength,oldLength;
            oldLength=elements.length;
            newLength=oldLength*2;
            Object [] newArray =new Object[newLength];
            System.out.println("触发底层扩容！ 当前数组容量由"+oldLength+"扩容至"+newLength);
            for (int i=0;i<oldLength;i++){
                newArray[i]=elements[i];
            }
            elements=newArray;
        }
        elements[size]=element;
        System.out.println("成功添加: "+element);
        size++;
    }
    public T get(int index){
        if (index<0||index>=size){
            System.out.println("错误");
            return null;
        }
        else {
            System.out.println("获取索引["+index+"]的元素:"+elements[index]);
            return (T)elements[index];

        }
    }
    public void remove(int index){
        if (index<0||index>=size){
            System.out.println("错误");}
        else {
            System.out.println("删除了索引["+index+"]的元素"+'('+elements[index]+')');
            for (int i = index; i <size-1 ; i++) {
                elements[i]=elements[i+1];
            }
            elements[size-1]=null;
            size--;
            System.out.println("验证移位，此时索引["+index+"]的元素变为了: "+elements[index]);

        }
    }
}
