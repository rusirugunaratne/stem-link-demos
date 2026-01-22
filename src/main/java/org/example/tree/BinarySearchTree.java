package org.example.tree;

public class BinarySearchTree extends BinaryTree{
    private Node insertInternal(Node node, int data) {
        if (node == null)
            return new Node(data);

        if(data < node.data)
            node.left = insertInternal(node.left, data);
        else if(data > node.data)
            node.right = insertInternal(node.right, data);

        return node;
    }

    public void insert(int data) {
        root = insertInternal(root, data);
    }
}
