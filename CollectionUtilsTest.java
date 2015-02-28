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

	@Test
	public void map_returns_a_list_of_to_upper_case_String_of_the_given_list(){
		ListMapper listMapper = new ToUpperFunc();
		List<String> numbers = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();


		numbers.add("billo"); numbers.add("babu"); numbers.add("bakri");
		expected.add("BILLO"); expected.add("BABU"); expected.add("BAKRI");
		
		List<String> result = CollectionUtils.map(numbers,listMapper);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		assertEquals(expected.get(2),result.get(2));
		
	}

	@Test
	public void map_returns_a_list_of_to_lower_case_String_of_the_given_list(){
		ListMapper listMapper = new ToLowerFunc();
		List<String> numbers = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();


		numbers.add("BILLO"); numbers.add("BABU"); numbers.add("BAKRI");
		expected.add("billo"); expected.add("babu"); expected.add("bakri");
		
		List<String> result = CollectionUtils.map(numbers,listMapper);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		assertEquals(expected.get(2),result.get(2));
	}

	@Test
	public void filter_returns_a_list_of_Squre_performing_operation_on_the_given_list(){
		ListFilter listFilter = new IsSqure();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();

		numbers.add(1); numbers.add(4); numbers.add(3);
		expected.add(1); expected.add(4); 
		
		List<Integer> result = CollectionUtils.filter(numbers,listFilter);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		
	}
	@Test
	public void filter_returns_a_list_of_isEven_number_after_performing_operation_on_the_given_list(){
		ListFilter listFilter = new IsEven();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();

		numbers.add(1); numbers.add(4); numbers.add(3);
		numbers.add(12); numbers.add(11); numbers.add(17);
		expected.add(4); expected.add(12); 
		
		List<Integer> result = CollectionUtils.filter(numbers,listFilter);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		
	}

	@Test
	public void filter_returns_a_list_of_String_whose_length_is_greater_than_five_after_performing_operation_on_the_given_list(){
		ListFilter listFilter = new LengthGreaterThanFive();
		List<String> string = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();

		string.add("heloo"); string.add("nahi"); string.add("sahiba");
		string.add("why"); string.add("yariya"); string.add("dostana");
		expected.add("sahiba"); expected.add("yariya"); expected.add("dostana"); 
		
		List<String> result = CollectionUtils.filter(string,listFilter);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
		assertEquals(expected.get(2),result.get(2));
		
	}

}