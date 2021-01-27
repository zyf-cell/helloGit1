package com;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
//单行注释
/*多行注释
*
* */
public class CollectionTest {
    @Test
    public void test1() {
        //contains()
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));
        Person p = new Person("jerry",20);
        coll.add(p);
        boolean contains=coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("tom")));
        System.out.println(coll.contains(p));
    }
}
