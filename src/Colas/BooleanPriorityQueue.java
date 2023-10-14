package Colas;

import Estructuras.nodos.booleanNodo;

public class BooleanPriorityQueue {
    private int size;
    private booleanNodo f;
    private booleanNodo r;

    public BooleanPriorityQueue() {
        this.size = 0;
        this.f = null;
        this.r = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Object value, boolean prioridad) {
        booleanNodo nodo = new booleanNodo();
        nodo.setDato(value);
        nodo.setPrioridad(prioridad);

        if (isEmpty()) {
            f = nodo;
            r = nodo;
        } else {
            if (prioridad) {
                booleanNodo temp = f;
                booleanNodo prev = null;

                while (temp != null && temp.getPrioridad()) {
                    prev = temp;
                    temp = temp.getEnlace();
                }

                if (temp == null) {
                    r.setEnlace(nodo);
                    r = nodo;
                } else {
                    nodo.setEnlace(temp);
                    if (prev == null) {
                        f = nodo;
                    } else {
                        prev.setEnlace(nodo);
                    }
                }
            } else {
                r.setEnlace(nodo);
                r = nodo;
            }
        }

        size++;
    }

    public Object dequeue() {
        Object value = null;
        if (!isEmpty()) {
            value = f.getDato();
            f = f.getEnlace();
            size--;
        }
        return value;
    }

    public Object front() {
        return f != null ? f.getDato() : null;
    }

    public Object rear() {
        return r != null ? r.getDato() : null;
    }

    public String toString() {
        String s = "";
        booleanNodo temporal = f;
        while (temporal != null) {
            s += temporal.getDato() + "->";
            temporal = temporal.getEnlace();
        }
        s += "null";
        return s;
    }
}