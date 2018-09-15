package com.tencent.karaoke.opengl_l1;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRender mRender;

    public MyGLSurfaceView(Context context) {
        super(context);

        // 设置 OpenGL ES 2 Context
        setEGLContextClientVersion(2);

        mRender = new MyGLRender();

        // 设置render
        setRenderer(mRender);

        // 设置只在requestRender() 时触发重绘
        setRenderMode(RENDERMODE_WHEN_DIRTY);
    }


}
