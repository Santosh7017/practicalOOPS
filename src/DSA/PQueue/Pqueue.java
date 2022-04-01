package DSA.PQueue;
import java.util.*;
public class Pqueue {


    /*
     * 1 insert
     * 2 min
     * 3 remove
     * Heap :
     * 1 Complete binary tree
     * 2 Heap order property
     *
     *Heap order property:
     *
     */

        private ArrayList<Integer> heap;
        public Pqueue() {
            heap  = new ArrayList<>();

        }
        boolean isEmpty() {
            return heap.size() ==0;
        }
        int size() {
            return heap.size();
        }
        int getMin() throws PriorityQueueException {
            if(isEmpty()) {
                throw new PriorityQueueException();
            }
            return heap.get(0);
        }
        int getMax() throws PriorityQueueException{
            if(isEmpty()) {
                throw new PriorityQueueException();
            }
            return heap.get(heap.size()-1);
        }

        void insert(int element) {
            heap.add(element);
            int childIndex  = heap.size()-1;
            int parentIndex = (childIndex-1)/2;

            while(childIndex>0) {
                if(heap.get(childIndex) < heap.get(parentIndex)) {
                    int temp = heap.get(childIndex);
                    heap.set(childIndex, heap.get(parentIndex));
                    heap.set(parentIndex, temp);
                    childIndex = parentIndex;
                    parentIndex = (childIndex-1)/2;
                }else {
                    return;
                }
            }

        }

        int removeMin() throws PriorityQueueException {
            if(isEmpty()) {
                throw new PriorityQueueException();
            }
            int temp = heap.get(0);
            heap.set(0, heap.get(heap.size()-1));
            heap.remove(heap.size()-1);
            int index = 0;
            int minIndex = index;
            int leftChildIndex = 1;
            int rightChildIndex = 2;

            while(leftChildIndex <heap.size()) {

                if(heap.get(leftChildIndex)< heap.get(minIndex)) {
                    minIndex = leftChildIndex;

                }
                if(rightChildIndex <heap.size()  &&  heap.get(rightChildIndex)< heap.get(minIndex)) {
                    minIndex = rightChildIndex;
                }


                if(minIndex == index) {
                    break;
                }else {
                    int temp1 = heap.get(index);
                    heap.set(index, heap.get(minIndex));
                    heap.set(minIndex, temp);
                    index  = minIndex;
                    leftChildIndex = 2*index+1;
                    rightChildIndex = 2*index+2;

                }
            }
            return temp;
        }

        public static void main(String[] args) throws PriorityQueueException {
            Pqueue queue = new Pqueue();
            int ar[] = {5,1,9,2};
            for(int i = 0;i<ar.length;i++) {
                queue.insert(ar[i]);
            }

//	queue.insert(0);
//	queue.insert(5);
//	queue.insert(1);
//	queue.insert(9);
//	queue.insert(2);
//	while(!queue.isEmpty()) {
//		System.out.println(queue.removeMin()+ " ");
//	}
            System.out.println(queue.getMin());
            System.out.println(queue.getMax());



        }






    }


