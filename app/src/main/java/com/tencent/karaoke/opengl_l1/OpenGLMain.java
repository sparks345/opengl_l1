package com.tencent.karaoke.opengl_l1;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OpenGLMain extends AppCompatActivity {

    private GLSurfaceView glMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assignViews();
        setContentView(glMain);
//        setContentView(R.layout.open_gl_main);

    }

    private void assignViews() {
//        glMain = (GLSurfaceView) findViewById(R.id.gl_main);
        glMain = new MyGLSurfaceView(this);
    }


}
