package Heap;

import java.util.ArrayList;

public class MinHeap {


    static class Heap{
        ArrayList<Integer>list=new ArrayList<>();
        public Heap() {
            list = new ArrayList<>();
        }

        private int parent(int i) { return (i - 1) / 2; }
        private int left(int i) { return 2 * i + 1; }
        private int right(int i) { return 2 * i + 2; }

        private void swap(int i, int j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

        public void insert(int x){
            list.add(x);
            int i=list.size()-1;

            while (i > 0 && list.get(parent(i)) > list.get(i)) {
                swap(i, parent(i));
                i = parent(i);
            }

        }
        public int peek() {
            if (list.isEmpty())
                throw new IllegalStateException("Heap is empty!");
            return list.get(0);
        }
        public void heapify(int i) {
            int left = left(i), right = right(i);
            int smallest = i;

            if (left < list.size() && list.get(left) < list.get(smallest))
                smallest = left;
            if (right < list.size() && list.get(right) < list.get(smallest))
                smallest = right;

            if (smallest != i) {
                swap(i, smallest);
                heapify(smallest);
            }
        }
        public int delete() {
            if (list.isEmpty())
                throw new IllegalStateException("Heap is empty!");

            if (list.size() == 1)
                return list.remove(0);

            int root = list.get(0);
            //swap first and last index
            list.set(0, list.remove(list.size() - 1));
            heapify(0);

            return root;
        }

        public void printHeap() {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Heap hp=new Heap();
        hp.insert(5);
        hp.insert(1);
        hp.insert(4);
        hp.printHeap();
    }
}
