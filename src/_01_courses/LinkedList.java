package _01_courses;

public  class LinkedList<E> extends AbstractList<E> {

    private Node<E> first;

    private Node<E> last;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }



    private LinkedList.Node<E> node (int index){
        rangeCheck(index);
        Node<E> node;
        if (index < size>> 1) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        }
        else {
            node = last;
            for (int i = size - 1; i > index ; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        //end
        if (index == size){
            Node<E> oldLast = last;
            Node<E> newLast = new Node<E>(element, oldLast, null);
            last = newLast;
            if (size == 0) first = newLast;
            else oldLast.next = newLast;
        }
        else {
            // head and normal
            Node<E> nextNode = node(index);
            Node<E> preNode = nextNode.prev;
            Node<E> newNode = new Node<>(element, preNode, nextNode);
            nextNode.prev = newNode;
            if (index == 0) first = newNode;
            else preNode.next = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return node(index).value;
    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        Node<E> oldNode = node(index);
        E oldElement = node(index).value;
        oldNode.value = element;
        return oldElement;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);

        Node<E> node = node(index);
        Node<E> preNode = node.prev;
        Node<E> nextNode = node.next;

        //head
        if (index == 0) first = nextNode;
        else preNode.next = nextNode;

        // end
        if (index == size - 1) last = preNode;

        else nextNode.prev = preNode;

        size--;
        return node.value;
    }


    @Override
    public int indexOf(Object element) {
        if (element == null){
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (node.value == null) return i;
                node = node.next;
            }
        }
        else {
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (element.equals(node.value)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    private static class Node<E> {
        E value;
        Node<E> prev;
        Node<E> next;

        public Node(E value, Node<E> next, Node<E> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }


}
