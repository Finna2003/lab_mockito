import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//public class TestNG {
//    public static double x;
//    public double xFalse;
//    public static  double y;
//    public double yAdams;
//    public double h;
//    public double derivativeY;
//    public double derivativeY1;
//    public double derivativeY2;
//    public double derivativeY3;
//
//    @BeforeClass
//    public static void init() {
//
//    }
//    @BeforeMethod(groups={"groupA", "groupB"})
//    public void init2() {
//        x=1.0;
//        h=0.1;
//        y=2.0;
//        xFalse=-1.0;
//        yAdams=4.065382;
//        derivativeY = 9.3956766;
//        derivativeY1 = 1.7075755;
//        derivativeY2 = 0.30757124;
//        derivativeY3 = 0.05548837;
//    }
//    @Test(groups="groupA")
//    public void testFunc() {
//        double expected = 2 * y + Math.sqrt(x);
//        double actual = Main.func(x, y);
//        Assert.assertNotNull(actual);
//        Assert.assertEquals(expected, actual, 0.0001);
//    }
//    @Test(groups="groupB")
//    public void testRunge() {
//        double actual = Main.Runge(y, x, h);
//        Assert.assertNotNull(actual);
//        double expected = 2.55244044;
//        Assert.assertEquals(actual, expected, 0.0001);
//    }
//
//    @DataProvider(name = "funcValues")
//    public Object[][] createDataForFunc() {
//        return new Object[][]{{2.0, 1.0, 3.41421}, {3.0, 2.0, 5.73205}};
//    }
//
//    @Test(dataProvider = "funcValues",groups="groupA")
//    public void testFunc(double x1, double y1, double expected) {
//        double actual = Main.func(x1, y1);
//        Assert.assertNotNull(actual);
//        Assert.assertEquals(expected, actual, 0.0001);
//    }
//
//    @Test(expectedExceptions = IllegalArgumentException.class,groups="groupA")
//    public void testFuncThrowsException() {
//        Main.func(xFalse, y);
//    }
//
//
//    @Test(groups="groupB")
//    public void testImplicitAdams() {
//        double expected = 5.0875;
//        double actual = Main.implicitAdams(h, yAdams, derivativeY, derivativeY1, derivativeY2, derivativeY3);
//        Assert.assertNotNull(actual);
//        Assert.assertEquals(expected, actual, 0.0001);
//    }
//
//    @Test(groups="groupB")
//    public void testResult() {
//        double[] expected = {2.0, 2.552440442408508, 3.2316781263791055, 4.065382792338085, 5.0875349381951755, 6.319587606804799, 7.8255361548065485, 9.665169898098803, 11.90844788846739, 14.643217923566356, 17.976101852764664};
//        double[] actual ;
//        actual= Main.result(y,x,h);
//        Assert.assertEquals(expected.length, actual.length);
//        for (int i = 0; i < expected.length; i++) {
//            Assert.assertEquals(expected[i], actual[i], 0.0001);
//        }
//
//
//    }
//}

