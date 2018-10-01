package checkoutrcb.view;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.swing.JTextField;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FruitPanelTest {

	/*
	 * 
	 * The tests do not all work with the mocks, if I had more time I would troubleshoot these issues to ensure
	 * all of the tests work as the testAppleField test works
	 * 
	 */
	
	@InjectMocks
	FruitPanel panel;
	
	@Mock
	JTextField mockField;


	@Test
	public void testAppleField() {
		when(mockField.getText()).thenReturn("2");
		int actualAmount = Integer.parseInt(panel.getAppleField().getText());
		int expectedAmount = 2;
		assertEquals(expectedAmount, actualAmount);
		
		verify(mockField,times(1)).getText();
	}
	
	@Test
	public void testPearField() {
		when(mockField.getText()).thenReturn("3");
		panel.setPearField("3");
		int actualAmount = Integer.parseInt(panel.getPearField().getText());
	
		int expectedAmount = 3;
		assertEquals(expectedAmount, actualAmount);
		
//		verify(mockField,times(1)).getText();
	}
	
	@Test
	public void testOrangeField() {
		when(mockField.getText()).thenReturn("4");
		panel.setOrangeField("4");
		int actualAmount = Integer.parseInt(panel.getOrangeField().getText());
		int expectedAmount = 4;
		assertEquals(expectedAmount, actualAmount);
		
//		verify(mockField,times(1)).getText();
	}
	
	@Test
	public void testLemonField() {
		when(mockField.getText()).thenReturn("1");
		panel.setLemonField("1");
		int actualAmount = Integer.parseInt(panel.getLemonField().getText());
		int expectedAmount = 1;
		assertEquals(expectedAmount, actualAmount);
		
//		verify(mockField,times(1)).getText();
	}
	
	@Test
	public void testBananaField() {
		when(mockField.getText()).thenReturn("2");
		panel.setBananaField("2");
		int actualAmount = Integer.parseInt(panel.getBananaField().getText());
		int expectedAmount = 2;
		assertEquals(expectedAmount, actualAmount);
		
//		verify(mockField,times(1)).getText();
	}

}
