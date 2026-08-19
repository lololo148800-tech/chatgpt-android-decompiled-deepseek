package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class GestureDetectorCompat {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f32901a;

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f32901a = new GestureDetector(context, onGestureListener, handler);
    }
}
