
public class LuchiArrayList implements List{

private int [] data = new int[10];
private int size = 0;



@Override
public void add(int num){

    data[size] = num;
        size++;

    }

@Override
public int get(int num){ 

    if(num < 0 || num >= size){
        throw new IndexOutOfBoundsException("Invalid syntax");
}
      
    return data[num];
}

@Override
public int remove(int index) {

    if(index < 0 || index >= size){
        throw new IndexOutOfBoundsException();
    }

    int removedValue = data[index];

    for (int count = index; count < size; count++) {
            data[count] = data[count + 1];
        }
        size--;
        return removedValue;
    }


@Override
public int size(){
    return size;
}

@Override
public boolean isEmpty(){
  
    if(size == 0){
    
}
        return size == 0;
}
@Override
public boolean contains(int num){

for(int index = 0; index < size; index ++){
    if(data[index] == num){
        return true;
}
}
return false;
}
@Override
public void clear(){
    size = 0;

}



}
