package com.hackerrank.starter;

import static com.google.common.truth.Truth.assertThat;

import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void textview_shouldMatchText() {
        try (ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
            scenario.onActivity(activity -> {
                TextView textView = activity.findViewById(R.id.textview);
                assertThat(textView.getText()).isEqualTo("Hello World");
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}