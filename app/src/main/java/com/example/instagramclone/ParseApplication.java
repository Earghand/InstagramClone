package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("grbhv07c7NCi50nlVPQhrozOji2ZVXPw2TgxPtBZ")
                .clientKey("vcbZlu4XqHWfN6S5hUSO6IiwCJvrTcbNBqHQxw16")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
