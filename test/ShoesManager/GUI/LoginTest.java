package ShoesManager.GUI;

import org.junit.*;
import static org.junit.Assert.*;

public class LoginTest {
	private Login login;
	@Before
	public void setUp() throws Exception {
		login = new Login();
	}
	
	@Test 
	public void testLogin() throws Exception {
		assertEquals("Đăng nhập", login.lblLogin.getText());
	}
	
	@After
	public void tearDown() throws Exception {
		login = null;
	}
}
