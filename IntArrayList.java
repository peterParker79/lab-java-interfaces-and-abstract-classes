import java.util.ArrayList;

public class IntArrayList implements IntList{

    final int  CAPACITY=10;
    int newCapacity=CAPACITY;
    int lengthStorage=0;
    ArrayList <Integer> storageList= new ArrayList<>(10);


    public int  getSize() {
        return storageList.size();
    }


    @Override
    public void add(int number) {
        if (storageList.size()==newCapacity){
            newCapacity=newCapacity+(newCapacity / 2);
            ArrayList <Integer> storageListPlus= new ArrayList<> (newCapacity);
            storageListPlus.addAll(storageList);
            storageListPlus.add(number);
        }

    }

    public int get (int id){
        return id;

    }
}
