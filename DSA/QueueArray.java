class QueueArray {
    private int front, rear, capacity;
    private int[] queue;

    
    QueueArray(int capacity) {
        this.capacity = capacity;
        front = rear = 0;
        queue = new int[capacity];
    }

    void enqueue(int data) {
        
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity)
                queue[rear - 1] = 0;

            rear--;
        }
        return;
    }

    void display() {
        int i;
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
        return;
    }

    int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();

        queue.dequeue();
        queue.display();

        System.out.println("Front element: " + queue.peek());

        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.display();
    }
}
