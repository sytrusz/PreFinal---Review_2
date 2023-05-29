class SetArray implements Set{
    private int[] set;
    private int count;

    public SetArray() {
        set = new int[MAX];
        count = 0;
    }

    public SetArray(int size){
        set = new int[size];
        count = 0;
    }

    public void add(int e){
        if (!isElementOf(e) && count < MAX){
            set[count] = e;
            count++;
        }
    }

    public void display(){
        for (int i = 0; i < count; i++){
            System.out.println(set[i]);
        }
    }

    public int count(){
        return count;
    }

    public boolean isElementOf(int e){
        for (int i = 0; i < count; i++){
            if (set[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int getElement(int index){
        return set[index];
    }

    public Set union(Set s){
        SetArray setUnion = new SetArray(count + s.count());

        for (int i = 0; i < count; i++){
            setUnion.add(set[i]);
        }

        for (int i = 0; i <= s.count(); i++){
            if (!isElementOf(s.getElement(i)) && setUnion.count() < MAX){
                setUnion.add(s.getElement(i));
            }
        }

        return setUnion;
    }
}