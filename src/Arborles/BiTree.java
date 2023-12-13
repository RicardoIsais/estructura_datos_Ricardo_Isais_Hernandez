package Arborles;

import Estructuras.nodos.NumericNodoArbol;

public class BiTree {

    private NumericNodoArbol root;

    public BiTree() {
        root = null;
    }

    public void add(int valor) {
        if (root == null) {
            root = new NumericNodoArbol();
            root.setDato(valor);
        } else {
            NumericNodoArbol nodo = new NumericNodoArbol();
            nodo.setDato(valor);
            add(nodo, root);
        }
    }

    private void add(NumericNodoArbol valor, NumericNodoArbol currentNode) {
        if (valor.getDato() > currentNode.getDato()) {
            if (currentNode.getDerecha() == null) {
                currentNode.setDerecha(valor);
            } else {
                add(valor, currentNode.getDerecha());
            }
        } else {
            if (currentNode.getIzquierda() == null) {
                currentNode.setIzquierda(valor);
            } else {
                add(valor, currentNode.getIzquierda());
            }
        }
    }

    public void preorden() {
        preorden(root);
    }

    private void preorden(NumericNodoArbol nodo) {
        if (nodo != null) {
            System.out.println(nodo.getDato());
            preorden(nodo.getIzquierda());
            preorden(nodo.getDerecha());
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(NumericNodoArbol currentNode) {
        if (currentNode != null) {
            inorder(currentNode.getIzquierda());
            System.out.println(currentNode.getDato());
            inorder(currentNode.getDerecha());
        }
    }

    public void postorden() {
        postorden(root);
    }

    private void postorden(NumericNodoArbol currentNode) {
        if (currentNode != null) {
            postorden(currentNode.getIzquierda());
            postorden(currentNode.getDerecha());
            System.out.println(currentNode.getDato());
        }
    }
}

