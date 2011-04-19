package ea2.a1;

public class RingPuffer<T> {

	private class Entry<ET> {
		ET element;
		Entry<ET> next;
		Entry<ET> previous;

		Entry(ET pElement, Entry<ET> pPrevious, Entry<ET> pNext) {
			this.element = pElement;
			this.next = pNext;
			this.previous = pPrevious;
		}
	}

	private class Queue {
		Entry<T> first;
	}

	private Queue queue = new Queue();
	int size = 0;

	public RingPuffer(int initialSize) {
		queue.first = new Entry<T>(null, null, null);
		queue.first.previous = queue.first;
		queue.first.next = queue.first;
		for (int i = 1; i < initialSize; i++) {
			addElement(null);
		}
		size = initialSize;
	}
	
	private void addElement(T element) {
		Entry<T> entry = new Entry<T>(element, queue.first.previous, queue.first);
		queue.first.previous.next = entry;
		queue.first.previous = entry;	
		size++;
	}
	
	public void insert(T element) {
		addElement(element);
	}
	
	public void print() {
		Entry<T> currEntry = queue.first.previous;
		while (true) {					
			System.out.println(String.valueOf(currEntry.element));
			
			if (currEntry.equals(queue.first))
				return;
			
			currEntry = currEntry.previous;			
		}
	}
}
