import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MaxNumsTest
{
    public static void main(String args[]) {
        MaxNumsTest test = new MaxNumsTest();
        test.test_nums();
    }

    @Test
    public void test_nums()
    {
        
        int tester[] = {7, 1, 2, 4, 5, 6, 8, 9, 10, 3};
        MaxNums m = new MaxNums();
        assertEquals(m.maxNums(tester, 2), 2);
        assertEquals(m.maxNums(tester, 3), 6);
        assertEquals(m.maxNums(tester, 4), 24);
    }
    
}
