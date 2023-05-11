import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestMock {
    public static double  x ;
    public static double  xFalse ;
    public static double  y ;
    public static double  yAdams ;
    public static double  h;
    public static double derivativeY ;
    public static double derivativeY1 ;
    public static double derivativeY2 ;
    public static double derivativeY3 ;
    @Spy
    private Main exampleSpy;

    @Mock
    private Main mockmain;
    @Mock
    private IArgumentProvider mockedProvider;
    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        mockmain.setArgumentProvider(mockedProvider);
        x=1.0;
        h=0.1;
        y=2.0;
        xFalse=-1.0;
        yAdams=4.065382;
        derivativeY = 9.3956766;
        derivativeY1 = 1.7075755;
        derivativeY2 = 0.30757124;
        derivativeY3 = 0.05548837;
    }

    @Test
    public void testRungeMethod() {
        double actualResult = exampleSpy.Runge(y, x, h);
        double expectedResult = 2.55244044;
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult, 0.00001);
    }

    @Test
    public void testImplicitAdamsMethod() {
        double actualResult = exampleSpy.implicitAdams(h, yAdams, derivativeY, derivativeY1, derivativeY2, derivativeY3);
        double expectedResult = 5.087534139791666;
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult, 0.00001);
    }

    @Test
    public void testResultMethod() {
        double[] actualResult = exampleSpy.result(y, x, h);
        double[] expectedResult = {2.0, 2.552440442408508, 3.2316781263791055, 4.065382792338085, 5.0875349381951755, 6.319587606804799, 7.8255361548065485, 9.665169898098803, 11.90844788846739, 14.643217923566356, 17.976101852764664};
        assertArrayEquals(expectedResult, actualResult, 0.00001);
        verify(exampleSpy, Mockito.atLeastOnce()).result(y, x, h);
    }

    @Test
    public void testFuncThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> exampleSpy.func(xFalse, y));
    }
    @Test
    public void testFunctionMethod() {
        double expected = 2*y + Math.sqrt(x);
        double actual = exampleSpy.func(x, y);
        assertEquals(expected, actual);
        verify(exampleSpy, times(1)).func(x, y);
    }
    @Test
    public void testX() throws Exception {
        Mockito.when(mockedProvider.nextArg()).thenReturn(1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8,1.9,2.0);
    }
}

