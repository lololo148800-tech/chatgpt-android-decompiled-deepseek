package p1028u;

import java.util.Iterator;

/* JADX INFO: renamed from: u.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20085b extends AbstractC20088e implements Iterator {

    /* JADX INFO: renamed from: Y */
    public C20086c f63602Y;

    /* JADX INFO: renamed from: Z */
    public C20086c f63603Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f63604o0;

    public C20085b(C20086c c20086c, C20086c c20086c2, int i10) {
        this.f63604o0 = i10;
        this.f63602Y = c20086c2;
        this.f63603Z = c20086c;
    }

    @Override // p1028u.AbstractC20088e
    /* JADX INFO: renamed from: a */
    public final void mo20919a(C20086c c20086c) {
        C20086c c20086c2;
        C20086c c20086cM20920b = null;
        if (this.f63602Y == c20086c && c20086c == this.f63603Z) {
            this.f63603Z = null;
            this.f63602Y = null;
        }
        C20086c c20086c3 = this.f63602Y;
        if (c20086c3 == c20086c) {
            switch (this.f63604o0) {
                case 0:
                    c20086c2 = c20086c3.f63608p0;
                    break;
                default:
                    c20086c2 = c20086c3.f63607o0;
                    break;
            }
            this.f63602Y = c20086c2;
        }
        C20086c c20086c4 = this.f63603Z;
        if (c20086c4 == c20086c) {
            C20086c c20086c5 = this.f63602Y;
            if (c20086c4 != c20086c5 && c20086c5 != null) {
                c20086cM20920b = m20920b(c20086c4);
            }
            this.f63603Z = c20086cM20920b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C20086c m20920b(C20086c c20086c) {
        switch (this.f63604o0) {
            case 0:
                return c20086c.f63607o0;
            default:
                return c20086c.f63608p0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63603Z != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C20086c c20086c = this.f63603Z;
        C20086c c20086c2 = this.f63602Y;
        this.f63603Z = (c20086c == c20086c2 || c20086c2 == null) ? null : m20920b(c20086c);
        return c20086c;
    }
}
