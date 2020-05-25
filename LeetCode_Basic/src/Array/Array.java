package Array;

public class Array<E> {
    //在自己封装的类中，成员变量最好都是私有的，其它人只能通过方法来获取成员信息。
    private E[] data;
    private int size;

    /**
     *传入数组的容量构造Array
     * @param capacity
     */
    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }
    //无参构造函数，默认初始容量是10
    public Array(){
        this(10);//逻辑上声明一个初始值
    }
    //1.获取数组的元素个数
    public int getSize(){ return size; }
    //2.获取数组的容量
    public int getCapacity(){ return data.length;}
    //3.获取某索引对应元素
    public E get(int index) {
        return data[index];
    }
    //4.获取元素对应的索引位置
    public int find(E e){
        for(int i=0; i<size; i++){
            if(data[i].equals(e)) return i;
        }
        return -1;
    }
    //5.判断元素存在
    public boolean contains(E e){
        for(int i=0; i<size; i++) {
            if (data[i].equals(e)) return true;
        }
        return false;
    }
    //6.添加元素系列
    public void add(int index, E e){
        if(size == data.length)
            throw new IllegalArgumentException("Add failed.Array is full.");
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >=0");
        for(int i = size-1; i>=index; i--) {data[i+1] = data[i];}
        data[index] = e;
        size++;
    }
    public void addLast(E e){
        add(size, e);
    }
    public void addFirst(E e){
        add(0,e);
    }
    //7.删除元素系列
    public E remove(int index){
        if(index<0 || index>size)
            throw new IllegalArgumentException("Remove failed. Index is Illegal");
        E ret = data[index];
        for(int i=index+1; i<size; i++){ data[i-1] = data[i]; }
        size--;
        return ret;
    }
    public E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(size-1);
    }
    public void removeElement(E e){
        int index = find(e);
        if(index!=-1) remove(index);
    }
}
