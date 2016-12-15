package com.haiyangroup.education.common;


import com.haiyangroup.education.ui.test.TestActivityFragment;
import com.haiyangroup.education.ui.test2.TestActivityFragment2;

import dagger.Component;

@Component(
        modules = AppModule.class
)
public interface AppComponent {
    TestActivityFragment inject(TestActivityFragment activity);
    TestActivityFragment2 inject(TestActivityFragment2 activity);
}