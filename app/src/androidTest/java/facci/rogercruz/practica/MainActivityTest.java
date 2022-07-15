package facci.rogercruz.practica;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4ClassRunner.class)

public class MainActivityTest {

    public static final String STRING_TO_BE_TYPED = "34";

    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule
             = new ActivityScenarioRule<MainActivity>(MainActivity.class);


}
