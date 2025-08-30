package Heap;

import java.util.PriorityQueue;

public class HeapsDemo {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;


        }

        @Override
        public int compareTo(Student o) {
            return this.rank-o.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("a",21));
        pq.add(new Student("b",211));
        pq.add(new Student("c",2));
        pq.add(new Student("d",1));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"->"+pq.peek().rank);

            pq.remove();
        }

    }
}
