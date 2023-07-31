package _01_courses;

public interface List<E> {
    static final int DEFAULT_CAPACITY = 10;
    static final int ELEMENT_NOT_FOUND = -1;

    public int size();

    public boolean isEmpty();

    public void clear();

    public void add(int index, E element);

    public E get(int index);

    public E set(int index, E element);

    public E remove(int index);

    public int indexOf(E element);
}
