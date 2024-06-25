package com.example.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.junit.helper.NumbersTest;
import com.example.junit.helper.StringHelperTest;

@RunWith(Suite.class)
@SuiteClasses({ NumbersTest.class, StringHelperTest.class })
public class AllTests {

}
