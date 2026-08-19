package livekit.org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;

/* JADX INFO: renamed from: livekit.org.webrtc.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17033c {
    /* JADX INFO: renamed from: a */
    public static VideoFrame.TextureBuffer m18856a(TextureBufferImpl textureBufferImpl, boolean z6, int i10) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z6) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i10);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    /* JADX INFO: renamed from: b */
    public static int m18857b(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}
