import java.util.*;

public class CollectionUtils {
	public static List<Integer> map(List<Integer> list, ListMapper listMapper){
		List<Integer> result = new ArrayList();
		int index = -1;
		for(Integer element:list){
 			Integer ele = (Integer)listMapper.Callback(element,++index,list);
 			result.add(ele);
		}
		return result;
	}
}

