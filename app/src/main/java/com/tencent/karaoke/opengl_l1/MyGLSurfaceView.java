package com.tencent.karaoke.opengl_l1;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.tencent.karaoke.opengl_l1.first.MyGLRender;

public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRender mRender;

    public MyGLSurfaceView(Context context) {
        super(context);

        // 设置 OpenGL ES 2 Context
        setEGLContextClientVersion(2);

        mRender = new MyGLRender();

        // 设置render
        setRenderer(mRender);

        // GLSurfaceView.RENDERMODE_CONTINUOUSLY
        // 不间断的绘制,默认渲染模式是这种
        // GLSurfaceView.RENDERMODE_WHEN_DIRTY
        // 不会主动绘制,也就是当调用GLSurfaceView的requestRender()方法后才会执行一次(第一次运行的时候会自动绘制一次)
        setRenderMode(RENDERMODE_WHEN_DIRTY);// 这里设置只在requestRender() 时触发重绘
    }


}
