class Node <E extends Comparable<E>>{
    private BSTNode<E> root;
    private int nodecount;

    Node() {root = null; nodecount = 0;}

    public void clear() {root = null ; nodecount = 0;}

    public void insert (E e) {
        root = inserthelp(root, e);
        nodecount++;
    }

    private BSTNode<E> inserthelp(BSTNode<E> root, E e) {

        if(root == null) {
            return new BSTNode<E>(e);
        }
            if (e.compareTo(root.value()) > 0){
                root.setRight(inserthelp(root.right(), e));
            }
            else if (e.compareTo(root.value()) < 0){
                root.setLeft(inserthelp(root.left(), e));
            }

        return root;
    }

    public E remove (E key) {
        E temp = findhelp(root, key);
        if (temp != null) {
            root = removehelp(root, key);
            nodecount--;
        }
        return temp;
    }

    public E find(E key) { return findhelp(root, key);}

    public int size() {return nodecount;}

    private E findhelp(BSTNode<E> rt, E key){
        if(rt == null) { return null;}
        if (rt.value().compareTo(key) > 0){
            return findhelp(rt.left(), key); }
        else if (rt.value().compareTo(key) == 0)
            return rt.value();
        else return findhelp(rt.right(), key);
    }


    private BSTNode<E> removehelp(BSTNode<E> rt, E key){
        if (rt == null) { return null; }
        if (rt.value().compareTo(key) > 0) {
            rt.setLeft(removehelp(rt.left(), key));
        }
        else if (rt.value().compareTo(key) < 0) {
            rt.setRight(removehelp(rt.right(), key));
        }
        else {
            if (rt.left() == null) {
                return rt.right();
            }
            else if (rt.right() == null){
                return rt.left();
            }
            else {
                BSTNode<E> temp = getMax(rt.left());
                rt.setValue(temp.value());
                rt.setLeft(deleteMax(rt.left()));
            }
        }
        return rt;
    }

    private BSTNode<E> getMax (BSTNode<E> rt) {
        if (rt.right() == null) {
            return rt;
        }
        else {
            return getMax(rt.right());
        }
    }

    private BSTNode<E> deleteMax (BSTNode<E> rt) {
        if (rt.right() == null){
            return rt.right();
        }
        else {
            rt.setRight(deleteMax(rt.right()));
            return rt;
        }
    }
        }
