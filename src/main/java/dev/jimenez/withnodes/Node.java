package dev.jimenez.withnodes;

public class Node {
    private int value;
    private Node node;

    public Node(){
        value = 0;
        node = null;
    }

    public Node(int value){
        this.value = value;
        this.node = null;
    }

    public Node(int value, Node node){
        this.value = value;
        this.node = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
