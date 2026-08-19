package p1028u;

import java.util.Iterator;

/* JADX INFO: renamed from: u.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20087d extends AbstractC20088e implements Iterator {

    /* JADX INFO: renamed from: Y */
    public C20086c f63609Y;

    /* JADX INFO: renamed from: Z */
    public boolean f63610Z = true;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20089f f63611o0;

    public C20087d(C20089f c20089f) {
        this.f63611o0 = c20089f;
    }

    @Override // p1028u.AbstractC20088e
    /* JADX INFO: renamed from: a */
    public final void mo20919a(C20086c c20086c) {
        C20086c c20086c2 = this.f63609Y;
        if (c20086c == c20086c2) {
            C20086c c20086c3 = c20086c2.f63608p0;
            this.f63609Y = c20086c3;
            this.f63610Z = c20086c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f63610Z) {
            return this.f63611o0.f63612Y != null;
        }
        C20086c c20086c = this.f63609Y;
        return (c20086c == null || c20086c.f63607o0 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f63610Z) {
            this.f63610Z = false;
            this.f63609Y = this.f63611o0.f63612Y;
        } else {
            C20086c c20086c = this.f63609Y;
            this.f63609Y = c20086c != null ? c20086c.f63607o0 : null;
        }
        return this.f63609Y;
    }
}
