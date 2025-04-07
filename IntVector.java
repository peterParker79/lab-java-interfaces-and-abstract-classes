public class IntVector implements IntList{
    final int  CAPACITY=20;
    int[] storageVector = new int[CAPACITY];
    int lengthStorage=0;

    @Override
    public void add(int number) {
        lengthStorage= storageVector.length;

        if (lengthStorage==CAPACITY) {
            int[] storagePlus =new int[CAPACITY + (CAPACITY / 2)];

            //move elements to new largest array
            for (int i=1; i < lengthStorage; i++) {
                storagePlus[i] = storageVector[i];
            }
            //index-1 the last index
            storagePlus[CAPACITY] =number;

        }

    } //end add




    public int get (int id){
        return id;

    }
}
