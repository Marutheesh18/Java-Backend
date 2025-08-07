import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.add(1,200);

        System.out.println(list);

        List<Integer> newlist=new ArrayList<>();
        newlist.add(60);
        newlist.add(70);

        list.addAll(newlist);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(30));
        System.out.println(list);

        list.set(3,400);
        System.out.println(list);

        System.out.println(list.contains(100));
        System.out.println(list.contains(10));

        System.out.println(list.size());

        for(Integer i:list){
            System.out.println("The Values Are : "+ i);
        }


        Iterator<Integer> iterate=list.iterator();
        while(iterate.hasNext()){
            System.out.println("Iterator "+iterate.next());
        }


        list.clear();
        System.out.println(list);

    }
}