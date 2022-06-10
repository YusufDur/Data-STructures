/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heap;

/**
 *
 * @author yusuf.dur
 */
public class MinHeap<T extends Comparable<T>> {    // level order yazılır

    T heap[];
    private int size;

    public MinHeap(int N) {
        heap = (T[]) new Comparable[N];
        size = 0;
    }

    // insert
    int parent(int index) {
        return (index - 1) / 2;
    }

    void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(T data) {
        if (size < heap.length) {
            heap[size] = data;
            int current = size;
            int parent = parent(current);
            while (heap[current].compareTo(heap[parent]) < 0) {
                swap(current, parent);
                current = parent;
                parent = parent(current);
            }
            size++;

        } else {
            System.out.println("heap full");
        }

    }

    // heapify
    void minHeap(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int min = i;
        if (left < size && heap[left].compareTo(heap[min]) > 0) {
            min = left;
        }
        if (right < size && heap[right].compareTo(heap[min]) > 0) {
            min = right;
        }
        if (min != i) {
            swap(min, i);
            minHeap(min);
        }
    }

    void heapify() {
        int lastindex = size - 1;
        int parent = parent(lastindex);

        for (int i = parent; i >= 0; i--) {
            minHeap(i);
        }
    }

    // delete 
    T deleteMin() {
        T temp = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify();
        return temp;
    }

    void print() {
        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println("");
    }

    void heapSort() {
        heapify();
        int temp = size;
        for (int i = 0; i < temp - 1; i++) {
            swap(0, --size);
            minHeap(0);
        }
        size = temp;
    }

    void bubbleSort() {
        for (int k = 1; k < size; k++) {
            for (int i = 0; i < size - k; i++) {
                if ((Integer)heap[i] > (Integer)heap[i + 1]) {
                    swap(i, i+1);
                }
            }
        }

    }

    public static void main(String[] args) {
        MinHeap m = new MinHeap(6);
        m.insert(5);
        m.insert(6);
        m.insert(7);
        m.insert(3);
        m.insert(1);
        m.insert(10);

        m.print();
        m.heapify();
        m.print();

        m.bubbleSort();
        m.print();
    }

}
