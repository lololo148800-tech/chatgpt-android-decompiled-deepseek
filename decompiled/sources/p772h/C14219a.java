package p772h;

import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14219a {

    /* JADX INFO: renamed from: a */
    public static final C14219a f44655a = new C14219a();

    /* JADX INFO: renamed from: a */
    public final BackEvent m15521a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    /* JADX INFO: renamed from: b */
    public final float m15522b(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: c */
    public final int m15523c(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: d */
    public final float m15524d(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: e */
    public final float m15525e(BackEvent backEvent) {
        AbstractC16544l.m18094g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
