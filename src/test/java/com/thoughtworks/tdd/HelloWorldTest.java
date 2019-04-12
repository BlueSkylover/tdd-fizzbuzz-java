package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }
    @Test
    //使用集成测试
    public void fizz_buzz_test(){
        Fizzbuzz fizzbuzz=new Fizzbuzz();
        String actual=fizzbuzz.Fizz_buzz(3);
        assertThat(actual, is("Fizz"));
        String actual2=fizzbuzz.Fizz_buzz(5);
        assertThat(actual2, is("Buzz"));
        String actual3=fizzbuzz.Fizz_buzz(7);
        assertThat(actual3, is("Whizz"));
        String actual4=fizzbuzz.Fizz_buzz(15);
        assertThat(actual4, is("FizzBuzz"));
        String actual5=fizzbuzz.Fizz_buzz(21);
        assertThat(actual5, is("FizzWhizz"));
        String actual6=fizzbuzz.Fizz_buzz(35);
        assertThat(actual6, is("BuzzWhizz"));
        String actual7=fizzbuzz.Fizz_buzz(105);
        assertThat(actual7, is("FizzBuzzWhizz"));
        for( int i = 0; i < 120; i++) {
            String result = fizzbuzz.Fizz_buzz(i+1);
            System.out.println(result);
        }

    }
}
