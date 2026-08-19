package p255K1;

import android.text.SegmentFinder;

/* JADX INFO: renamed from: K1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4527a extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC4531e f14804a;

    public C4527a(InterfaceC4531e interfaceC4531e) {
        this.f14804a = interfaceC4531e;
    }

    public final int nextEndBoundary(int i10) {
        return this.f14804a.mo5274h(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f14804a.mo5271a(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f14804a.mo5272d(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f14804a.mo5273f(i10);
    }
}
