import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
        System.out.println();
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
        System.out.println();
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
        System.out.println();
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
        System.out.println();
    }

    @DisplayName("Test1")
    @Test
    void test1(){
        System.out.println("test1");
        System.out.println();
    }

    @DisplayName("Test2") // 테스트 이름
    @Test
    void test2(){
        System.out.println("test2");
        System.out.println();
    }

    @Test
    @Disabled // 지정된 테스트 실행되지 않는 것
    void test3(){
        System.out.println("test3");
        System.out.println();
    }




}
