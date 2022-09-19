import org.junit.*;

public class UnitTestLifeCycleTest {

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    @Before
    public void runOnceBeforeTest() {
        System.out.println("@Before - runOnceBeforeTest");
    }

    @After
    public void runOnceAfterTest() {
        System.out.println("@After - runOnceAfterTest");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}
