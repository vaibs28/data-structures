package com.test.linkedlist;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import finalexample.Employee;

public class CustomLinkedList {
    
    static CustomNode head = null;
    
    public static void addNode(Object obj) {
        
        CustomNode newNode = new CustomNode(obj);
        newNode.setNext(head);
        head = newNode;
        
    }
    
    public static void addLast(Object obj) {
        
        CustomNode newNode = new CustomNode(obj);
        if(head==null)
            head = new CustomNode(obj);
        else {
            CustomNode curr = head;
            while(curr.getNext()!=null) {
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
            
    }
    
    public static void printList() {
        CustomNode temp = head;
        while(temp!=null) {
            System.out.println(temp.getData().toString());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee e1 = new Employee(1, "A");
        Employee e2 = new Employee(2, "B");
        Employee e3 = new Employee(3, "C");
        
        addNode(e1);
        addLast(e2);
        addNode(e3);
        
        printList();
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        
        
    }

}

class CustomNode {
    
    private Object data;
    private CustomNode next;
    
    public CustomNode() {
        
    }

    public CustomNode(Object data) {
       this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public CustomNode getNext() {
        return next;
    }

    public void setNext(CustomNode next) {
        this.next = next;
    }
    
    
}