package p766g8;

import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: g8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13828e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C13828e f43859Y = new C13828e(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        MotionEvent it = (MotionEvent) obj;
        AbstractC16544l.m18094g(it, "it");
        MotionEvent motionEventObtain = MotionEvent.obtain(it);
        AbstractC16544l.m18093f(motionEventObtain, "obtain(it)");
        return motionEventObtain;
    }
}
