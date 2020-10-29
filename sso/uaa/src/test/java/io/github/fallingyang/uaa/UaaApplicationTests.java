package io.github.fallingyang.uaa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UaaApplication.class)
public class UaaApplicationTests {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void getEncodePassword() {
		System.out.println(passwordEncoder.encode("123456"));
	}

}

