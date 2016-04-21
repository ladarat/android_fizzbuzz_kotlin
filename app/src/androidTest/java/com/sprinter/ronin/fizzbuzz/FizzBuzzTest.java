package com.sprinter.ronin.fizzbuzz;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class FizzBuzzTest extends  ActivityInstrumentationTestCase2<MainActivity>  {

    public FizzBuzzTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testClickButtonNotInputText() {
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("กรุณากรอกตัวเลขด้วยเด้อ!")));
    }

    public void testInputEnDashShouldReturn1AndClick(){
        onView(withId(R.id.text_input)).perform(typeText(String.valueOf("-")));
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("กรุณากรอกตัวเลขด้วยเด้อ!")));
    }

    public void testInput1ShouldReturn1AndClick(){
        onView(withId(R.id.text_input)).perform(typeText(String.valueOf(1)));
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("1")));
    }

    public void testInput3ShouldReturnFizzAndClick(){
        onView(withId(R.id.text_input)).perform(typeText(String.valueOf(3)));
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("Fizz")));
    }

    public void testInput5ShouldReturnBuzzAndClick(){
        onView(withId(R.id.text_input)).perform(typeText(String.valueOf(5)));
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("Buzz")));
    }

    public void testInput15ShouldReturnFizzBuzzAndClick(){
        onView(withId(R.id.text_input)).perform(typeText(String.valueOf(15)));
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("FizzBuzz")));
    }

    public void testInputNumberMoreThanNineteenDigit(){
        String data = "12345678912345678912";
        onView(withId(R.id.text_input)).perform(typeText(String.valueOf(data)));
        onView(withId(R.id.btn_submit)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("กรอกแต่พองามนะ!")));
    }

}