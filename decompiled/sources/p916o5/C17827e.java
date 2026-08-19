package p916o5;

import java.io.Closeable;
import p1113xn.C21319m;

/* JADX INFO: renamed from: o5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17827e implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C17826d f56873Y;

    /* JADX INFO: renamed from: Z */
    public boolean f56874Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C17830h f56875o0;

    public C17827e(C17830h c17830h, C17826d c17826d) {
        this.f56875o0 = c17830h;
        this.f56873Y = c17826d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f56874Z) {
            return;
        }
        this.f56874Z = true;
        C17830h c17830h = this.f56875o0;
        synchronized (c17830h) {
            C17826d c17826d = this.f56873Y;
            int i10 = c17826d.f56871h - 1;
            c17826d.f56871h = i10;
            if (i10 == 0 && c17826d.f56869f) {
                C21319m c21319m = C17830h.f56877C0;
                c17830h.m19582W(c17826d);
            }
        }
    }
}
