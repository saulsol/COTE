package Practice.tree;

public class Tree {
    int count;

    public Tree() {
        count = 0;
    }

    public class Node {
        Object data;
        Node left;
        Node right;

        // 생성 시 매개변수를 받아 초기화하는 방법으로만 선언 가능
        public Node(Object data) {
            this.data = data;
            left = null;
            right = null;
        }

        public void addLeft(Node node) {
            left = node;
            count++;
        }

        public void addRight(Node node) {
            right = node;
            count++;
        }

        public void deleteLeft() {
            left = null;
            count--;
        }

        public void deleteRight() {
            right = null;
            count--;
        }
    }

    public Node addNode(Object data) {
        Node n = new Node(data);
        return n;
    }

    public void preOrder(Node node) {
        if(node == null) {
            return;
        }

        // 리프 노드인지 확인
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        preOrder(node.right); //순서만 바꾸면 됨
        preOrder(node.left);

    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder(Node node) {
        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        // 트리 생성
        Tree tree = new Tree();

        // 노드 생성
        Tree.Node node1 = tree.addNode(1);
        Tree.Node node2 = tree.addNode(2);
        Tree.Node node3 = tree.addNode(3);
        Tree.Node node4 = tree.addNode(4);
        Tree.Node node5 = tree.addNode(5);
        Tree.Node node6 = tree.addNode(6);
        Tree.Node node7 = tree.addNode(7);

        node1.addLeft(node2);
        node1.addRight(node3);
        node2.addLeft(node4);
        node2.addRight(node5);
        node3.addLeft(node6);
        node3.addRight(node7);

        // 순회
        tree.preOrder(node2);

    }
}
