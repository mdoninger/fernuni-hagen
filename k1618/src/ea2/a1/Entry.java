package ea2.a1;

class Entry<T> {
	T element;
	Entry<T> next;
	Entry<T> previous;

	Entry(T element, Entry<T> next, Entry<T> previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
}