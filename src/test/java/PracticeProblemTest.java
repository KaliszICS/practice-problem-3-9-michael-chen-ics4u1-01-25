import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class PracticeProblemTest {
    
    @Test
    @DisplayName("Test with 0 disks")
    void towerOfHanoiTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = {int.class};
            Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
            String[] result = (String[])method.invoke(null, 0);
            assertArrayEquals(new String[]{}, result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch(Exception e) {
            fail("Something weird happened");
        }
    }
    
    @Test
    @DisplayName("Test with 1 disk")
    void towerOfHanoiTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = {int.class};
            Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
            String[] result = (String[])method.invoke(null, 1);
            assertArrayEquals(new String[]{"LR"}, result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch(Exception e) {
            fail("Something weird happened");
        }
    }
    
    @Test
    @DisplayName("Test with 2 disks")
    void towerOfHanoiTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = {int.class};
            Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
            String[] result = (String[])method.invoke(null, 2);
            assertArrayEquals(new String[]{"LM", "LR", "MR"}, result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch(Exception e) {
            fail("Something weird happened");
        }
    }
    
    @Test
    @DisplayName("Test with 3 disks")
    void towerOfHanoiTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = {int.class};
            Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
            String[] result = (String[])method.invoke(null, 3);
            assertArrayEquals(new String[]{"LR", "LM", "RM", "LR", "ML", "MR", "LR"}, result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch(Exception e) {
            fail("Something weird happened");
        }
    }
    
    @Test
    @DisplayName("Test with 4 disks")
    void towerOfHanoiTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = {int.class};
            Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
            String[] result = (String[])method.invoke(null, 4);
            assertArrayEquals(new String[]{"LM", "LR", "MR", "LM", "RL", "RM", "LM", 
                                          "LR", "MR", "ML", "RL", "MR", "LM", "LR", "MR"}, result);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch(Exception e) {
            fail("Something weird happened");
        }
    }
    
    @Test
    @DisplayName("Test with 5 disks")
    void towerOfHanoiTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = {int.class};
            Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
            String[] result = (String[])method.invoke(null, 5);
            assertArrayEquals(new String[]{"LR", "LM", "RM", "LR", "ML", "MR", "LR", 
                                          "LM", "RM", "RL", "ML", "RM", "LR", "LM", "RM",
                                          "LR", "ML", "MR", "LR", "ML", "RM", "RL", "ML",
                                          "MR", "LR", "LM", "RM", "LR", "ML", "MR", "LR"}, result);
            
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch(Exception e) {
            fail("Something weird happened");
        }
    }
}
