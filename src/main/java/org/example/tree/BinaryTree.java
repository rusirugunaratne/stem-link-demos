package org.example.tree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    private void preorderInternal(Node node) {
        if(node == null)
            return;

        System.out.println(node.data); // process current node
        preorderInternal(node.left); // go to left subtree
        preorderInternal(node.right); // go to right subtree
    }

    private void inorderInternal(Node node) {
        if(node == null)
            return;

        inorderInternal(node.left);
        System.out.println(node.data);
        inorderInternal(node.right);
    }

    private void postorderInternal(Node node) {
        if(node == null)
            return;

        postorderInternal(node.left);
        postorderInternal(node.right);
        System.out.println(node.data);
    }

    public void preorder() {
        preorderInternal(root);
    }

    public void inorder() {
        inorderInternal(root);
    }

    public void postorder() {
        postorderInternal(root);
    }
}
