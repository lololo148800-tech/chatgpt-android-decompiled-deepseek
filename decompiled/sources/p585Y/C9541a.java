package p585Y;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC16544l;
import p140Fa.C2685e;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9541a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2685e f28700a;

    public C9541a(C2685e c2685e) {
        this.f28700a = c2685e;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e10) {
        AbstractC16544l.m18094g(e10, "e");
        e10.getX();
        this.f28700a.getClass();
        e10.getY();
        return true;
    }
}
