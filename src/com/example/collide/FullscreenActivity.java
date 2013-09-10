package com.example.collide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.facebook.widget.LoginButton;

import java.util.*;

public class FullscreenActivity extends Activity {

    /**
     * Facebook login permissions  
     */
    private static final List<String> PERMISSIONS = Arrays.asList("email", "user_groups");
    
    private LoginButton loginButtonActivity;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fullscreen);

        loginButtonActivity = (LoginButton) findViewById(R.id.authButton);
        loginButtonActivity.setReadPermissions(PERMISSIONS);
        loginButtonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, LoginUsingActivityActivity.class);
                startActivity(intent);
            }
        });
    }

}
