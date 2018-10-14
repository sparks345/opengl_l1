package com.tencent.karaoke.opengl_l1.first;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.karaoke.opengl_l1.MyGLSurfaceView;

public class OpenGLMain extends AppCompatActivity {

    private GLSurfaceView glMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assignViews();
        setContentView(glMain);

    }

    private void assignViews() {
        glMain = new MyGLSurfaceView(this);
    }

}
