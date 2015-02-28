import java.util.*;

public class CollectionUtils {
	public static<E> List<E> map(List<E> list, ListMapper listMapper){
		List<E> result = new ArrayList();
		int index = 0;
		for(E element:list){
 			E ele = (E)listMapper.Callback(element,index,list);
 			result.add(ele);
 			index++;
		}
		return result;
	}

	public static<Integer> List<Integer> filter(List<Integer> list, ListFilter listFilter){
		List<Integer> result = new ArrayList();
		int index = 0;
		for(Integer element:list){
 			if(listFilter.FilterCallback(element,index,list)){
	 			result.add(element);
	 		}
	 		index++;
		}
		return result;
	}
}

