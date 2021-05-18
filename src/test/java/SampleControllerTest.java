import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import slm.controllers.SampleController;

public class SampleControllerTest {

    @Test
    public void test_callToGET_SampleMethod(){
        //Arrange
        SampleController controller = new SampleController();
        //Act
        String actual = controller.SampleMethod();
        //Assert
        Assertions.assertEquals("sample1", actual);
    }
    @Test
    public void test_callToPOST_SampleMethodWithDelta(){
        //Arrange
        SampleController controller = new SampleController();
        //Act
        String actual = controller.SampleMethodWithDelta(5);
        //Assert
        Assertions.assertEquals("sample6", actual);
    }
}
