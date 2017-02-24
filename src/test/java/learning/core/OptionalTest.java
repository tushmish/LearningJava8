package learning.core;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {

	@Test
	public void testOf() {
		Optional<Class<MyOptional>> of = Optional.of(MyOptional.class);
		String str = "";
		Optional<String> opt = Optional.of(str);
	}

}

class MyOptional{
	
}
