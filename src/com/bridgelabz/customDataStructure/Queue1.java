package com.bridgelabz.customDataStructure;



public class Queue1<T>
{ 
    int front, rear, size; 
    int  capacity; 
    int array[]; 
       
    public Queue1(int capacity) { 
         this.capacity = capacity; 
         front = this.size = 0;  
         rear = capacity - 1; 
         array = new int[this.capacity]; 
            
    } 
       
    // Queue is full when size becomes equal to  
    // the capacity  
    public boolean isFull(Queue1 queue) 
    {  return (queue.size == queue.capacity); 
    } 
       
    // Queue is empty when size is 0 
    public boolean isEmpty(Queue1 queue) 
    {  return (queue.size == 0); } 
       
    // Method to add an item to the queue.  
    // It changes rear and size 
    public void enqueue( int item) 
    { 
        if (isFull(this)) 
            return; 
        this.rear = (this.rear + 1)%this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1; 
//        System.out.println(item+ " enqueued to queue"); 
    } 
       
    // Method to remove an item from queue.   
    // It changes front and size 
    public int dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        int item = this.array[this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return item; 
    } 
       
    // Method to get front of queue 
   public  int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.front]; 
    } 
        
    // Method to get rear of queue 
    public int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.rear]; 
    } 
    
//    Queue1 new_que=new Queue1(1000);
} 