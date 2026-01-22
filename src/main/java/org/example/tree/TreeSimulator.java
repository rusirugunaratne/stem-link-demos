package org.example.tree;

public class TreeSimulator {

    // Manually build this tree:
    //       1
    //      / \
    //     2   3
    //    / \
    //   4   5
    public void simulate() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.preorder();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(2);
    }

}
