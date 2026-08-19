package p774h1;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: h1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C14354j {

    /* JADX INFO: renamed from: a */
    public final PathMeasure f45043a;

    public C14354j(PathMeasure pathMeasure) {
        this.f45043a = pathMeasure;
    }

    /* JADX INFO: renamed from: a */
    public final void m15736a(float f10, float f11, InterfaceC14333K interfaceC14333K) {
        if (!(interfaceC14333K instanceof C14353i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f45043a.getSegment(f10, f11, ((C14353i) interfaceC14333K).f45039a, true);
    }
}
