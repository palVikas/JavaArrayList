import java.util.*;

interface ListMapper<E> {
	E Callback(E element, int index, List<E> list);
}

class QubeFunc implements ListMapper<Integer> {
	public Integer Callback (Integer element, int index, List<Integer> list) {
		return (element*element*element);	
	}

}

class SqureFunc implements ListMapper<Integer> {
	public Integer Callback (Integer element, int index, List<Integer> list) {
		return (element*element);	
	}

}