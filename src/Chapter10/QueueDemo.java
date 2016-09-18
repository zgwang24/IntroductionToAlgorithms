package Chapter10;

public class QueueDemo {

	public static void main(String[] args) {
		Queue.enQueue(10);
		Queue.enQueue(3);
		Queue.enQueue(6);
		Queue.enQueue(1);
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		Queue.enQueue(98);
		Queue.enQueue(3);
		Queue.enQueue(6);
		Queue.enQueue(1);
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		Queue.enQueue(98);
		Queue.enQueue(3);
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		Queue.enQueue(98);
		Queue.enQueue(3);
		Queue.enQueue(4);
		Queue.enQueue(5);
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
	}

}
