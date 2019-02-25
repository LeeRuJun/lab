public class RedBlackTree<T extends Comparable<T>> {

    private RBTNode<T> mRoot;
    private static final boolean RED = false;
    private static final boolean BLACK = true;




    public class RBTNode<T extends Comparable<T>>{
        boolean color;
        T key;
        RBTNode<T> left;
        RBTNode<T> right;
        RBTNode<T> parent;


        public RBTNode(boolean color, T key, RBTNode<T> left, RBTNode<T> right, RBTNode<T> parent) {
            this.color = color;
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }


}
