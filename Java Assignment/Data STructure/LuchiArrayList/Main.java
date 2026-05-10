public class Main{
public static void main(String [] args){

LuchiArrayList numbers = new LuchiArrayList();

numbers.add(10);
numbers.add(11);
numbers.add(20);
numbers.add(30);

System.out.print(numbers.get(1));
System.out.println();

numbers.remove(0);


System.out.println(numbers.get(1));
System.out.println(numbers.size());


}

}
