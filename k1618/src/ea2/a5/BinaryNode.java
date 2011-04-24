package ea2.a5;

class BinaryNode {
	private BinaryNode leftSon, rightSon;
	private int value;

	public BinaryNode(int i) {
		leftSon = rightSon = null;
		value = i;
	}

	public boolean contains(int v) {
		if (v == value)
			return true;
		if (leftSon.value == v || rightSon.value == v)
			return true;
		else
			if (v < value) {
				return leftSon.contains(v);
			} else if (v > value) {
				return rightSon.contains(v);
			} else
				return false;
	}

	public void insert(int v) { 
		if (v < value) {
			leftSon.insert(v);
		} else if (v > value) {
			rightSon.insert(v);
		}
	}

	public void inorder() { /* ... */
	}
}