import java.util.Iterator;

public class SList<T> {
	public String toString(){
		String msg = (String) first.item;
		SListIterator si = iterator();
		while(si.hasNext())
			msg += si.next() + ", ";
		return msg;
	}
	public SList<T>.SListIterator<T> iterator(){
		return new SListIterator<T>();
	}
	private static class Node<T> {
        T item;
        Node<T> next;
        Node(T element, Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }
	public class SListIterator<T>{
		SListIterator(){
			n = first;
		}
		T next(){
			if (hasNext()){
				n = n.next;
				return (T) n.item;
			}
			return null;
		}
		boolean hasNext(){
			return (n.next) != null;
		}
		void set(T elem){
			n.item = elem;
		}
		void add(T elem){
			if ((n == first) && (n.item == null) && (n.next == null)){
				n.item = elem;
				return;
			}
			n.next = new Node(elem, n.next);
			n = n.next;
		}
		void remove(){
			n.item = n.next.item;
			n.next = n.next.next;
		}
	}
	private Node n = new Node(null,null);
	private final Node first = n;
}
