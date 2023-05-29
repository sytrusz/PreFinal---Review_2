interface Set {
    int MAX = 10;

    void add(int e);
    void display();
    int count();
    boolean isElementOf(int e);
    int getElement(int index);
    Set union(Set s);
}