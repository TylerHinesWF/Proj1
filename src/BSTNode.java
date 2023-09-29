public class BSTNode <E extends Comparable<E>> {
    private E element;
    private BSTNode<E> left;
    private BSTNode<E> right;

    BSTNode() {
        left = right = null;
    }

    BSTNode(E val) {
        left = right = null;
        element = val;
    }

    BSTNode(E val, BSTNode<E> l, BSTNode<E> r) {
        left = l;
        right = r;
        element = val;
    }


    //Get and set the element value
    public E value() {
        return element;
    }

    public void setValue(E v) {
        element = v;
    }


    public BSTNode<E> left() {
        return left;
    }

    public void setLeft(BSTNode<E> p) {
        left = p;
    }

    public BSTNode<E> right() { return right; }

    public void setRight(BSTNode<E> p) {right = p;}




    }



