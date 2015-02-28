import java.util.*;

interface ListMapper<E> {
	E Callback(E element, int index, List<E> list);
}

interface ListFilter<E> {
	boolean FilterCallback(E element, int index, List<E> list);
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

class ToUpperFunc implements ListMapper<String> {
	public String Callback (String element, int index, List<String> list) {
		return element.toUpperCase();	
	}

}

class ToLowerFunc implements ListMapper<String> {
	public String Callback (String element, int index, List<String> list) {
		return element.toLowerCase();	
	}

}

class IsSqure implements ListFilter<Integer> {
	public boolean FilterCallback(Integer element,int index , List<Integer> list) {
		return ((Math.ceil(Math.sqrt(element))) == (Math.floor(Math.sqrt(element))));
	}
}

class IsEven implements ListFilter<Integer> {
	public boolean FilterCallback(Integer element,int index , List<Integer> list) {
		return (element%2==0);
	}
}

