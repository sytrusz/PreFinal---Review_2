class TestArray {

    public static void main(String[] args) {
        Set s1 = new SetArray();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(2);
        s1.display();
    
        Set s2 = new SetArray();
        s2.add(10);
        s2.add(12);
        s2.add(13);
        s2.add(14);
        s2.add(15);
        s2.add(17);
        s2.add(16);
        s2.add(18);
        s2.add(20);
        s2.add(21);
        s2.add(22);
        System.out.println("Count: " + s2.count());
        s2.display();
    
        Set s3 = new SetArray();
        s3.add(1);
        s3.add(2);
        s3.add(3);
        s3.add(6);
        System.out.println(s3.isElementOf(2));
        System.out.println(s3.isElementOf(10));
    
        Set s4 = new SetArray();
        Set s5 = new SetArray();
        Set union = null;
        s4.add(1);
        s4.add(2);
        s4.add(3);
        s4.add(4);
        s5.add(10);
        s5.add(2);
        s5.add(20);
        union = s4.union(s5);
        union.display();
    
        Set s6 = new SetArray();
        s6.add(10);
        s6.add(12);
        s6.add(13);
        s6.add(14);
        s6.add(15);
        s6.add(17);
        s6.add(16);
        s6.add(18);
        s6.add(20);
        s6.add(21);
        s6.add(22);
    
        Set s7 = new SetArray();
        s7.add(41);
        s7.add(42);
        s7.add(43);
        s7.add(44);
        s7.add(45);
        s7.add(46);
        s7.add(47);
        s7.add(48);
        s7.add(49);
        s7.add(50);
        union = s6.union(s7);
        union.display();
        }
    }