package com.dongguo.iterator;



/**
 * @author Dongguo
 * @date 2021/8/22 0022-21:51
 * @description: 定义具体迭代器角色(Concrete Iterator)
 */


public class ConcreteIterator implements Iterator {
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }

}