package com.leetcode.day7.ListTest;

public class SingleListed implements Ilinked{
    //节点类
    class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    //头结点
    private Node head;
    public SingleListed(){
        this.head = head;
    }
    //头插法
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head==null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;//头结点
        if (this.head==null){
            this.head=node;
        }else{
            while (cur.next!=null){
                cur=cur.next;
            }
            //cur成了尾结点
            cur.next=node;
        }
    }
    //检测index 下标是否合法
    private void checkIndex(int index){
        if (index<0||index>getLength())
            throw new IndexOutOfBoundsException("下标不合法！");
    }
    //找到下标为 index-1 位置的节点
    private Node searchIndex(int index){
        checkIndex(index);
        if (index==0)
            return null;
        int count = 0;//记录行走的步数
        Node cur = this.head;
        while (cur.next!=null&&count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    /**
     * 任意位置插入，第一数据点为0号下标
     * @param index 要插入的下标
     * @param data  要插入的元素
     * @return
     */
    @Override
    public boolean addIndex(int index, int data) {
        Node node = new Node(data);
        Node cur=searchIndex(index);//获取下标为 index-1 的节点
        if (cur==null){
            node.next=this.head;
            this.head=node;
        }else{
            node.next=cur.next;
            cur.next = node;
        }
        return true;
    }

    /**
     * 查找是否包含关键字 key在单链表中
     * @param key
     * @return 找到key返回true，否则返回false
     */
    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //找到第一次出现关键字为key的节点的前驱
    private Node searchPre(int key){
        Node pre=this.head;
        if (pre.data==key){
            //return null;//返回null
            return this.head;//返回头结点
        }
        while(pre.next!=null){
            if (pre.next.data==key){
                return pre;
            }
            pre=pre.next;
        }
        return null;
    }

    /**
     * 删除第一次出现关键字为key的节点
     * @param key 要删除的关键字
     * @return oldData
     */
    @Override
    public int remove(int key) {
        int oldData=0;
        Node pre = searchPre(key);
        if (pre == null){
            return -1;
        }
        //找到key，并且key在第一个节点
        if (pre==this.head&&pre.data==key){
            oldData=pre.data;
            this.head=this.head.next;
            return  oldData;
        }
        //找到key，并且不在第一个节点
        Node delNode = pre.next;
        pre = delNode.next;
        return 0;
    }

    @Override
    public void removeAllkey(int key) {
        Node pre = this.head;
        Node cur = this.head.next;
        //遍历链表
        while (cur!=null){
            //找到关键字，进行删除
            if (cur.data==key){
                pre.next=cur.next;
                cur=cur.next;
            }else{
                pre=cur;
                cur=pre.next;
            }
            if(this.head.data==key){
                this.head=this.head.next;
            }
        }
    }

    /**
     * 获取单链表的长度
     * @return 单链表的长度
     */
    @Override
    public int getLength() {
        Node cur = this.head;
        int count = 0;//记录节点的个数
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //打印单链表
    @Override
    public void display() {
        Node cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+",");
            cur=cur.next;
        }
        System.out.println();
    }

    /**
     * 清理单链表以防内存泄漏
     */
    @Override
    public void clear() {
        while (this.head!=null){
            Node cur = this.head.next;
            this.head.next=null;
            this.head=cur;
        }
    }
}
