import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CollectionUtilsTest {
	@Test
	public void map_returns_a_list_of_performing_operation_on_the_given_list(){
		ListMapper listMapper = new QubeFunc();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();


		numbers.add(1); numbers.add(2); numbers.add(3);
		expected.add(1); expected.add(8); expected.add(27);
		
		List<Integer> result = CollectionUtils.map(numbers,listMapper);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		assertEquals(expected.get(2),result.get(2));
		
	}

	@Test
	public void map_returns_a_list_of_Squre_Integer_of_the_given_list(){
		ListMapper listMapper = new SqureFunc();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();


		numbers.add(1); numbers.add(2); numbers.add(3);
		expected.add(1); expected.add(4); expected.add(9);
		
		List<Integer> result = CollectionUtils.map(numbers,listMapper);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		assertEquals(expected.get(2),result.get(2));
		
	}

}