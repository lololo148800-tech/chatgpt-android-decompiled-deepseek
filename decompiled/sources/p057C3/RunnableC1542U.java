package p057C3;

import android.util.Pair;
import p083D3.C1868f;
import p1139z0.C21585H;
import p232J3.C4244p;
import p232J3.C4249u;
import p232J3.C4253y;

/* JADX INFO: renamed from: C3.U */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1542U implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4217Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21585H f4218Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Pair f4219o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4244p f4220p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C4249u f4221q0;

    public /* synthetic */ RunnableC1542U(C21585H c21585h, Pair pair, C4244p c4244p, C4249u c4249u, int i10) {
        this.f4217Y = i10;
        this.f4218Z = c21585h;
        this.f4219o0 = pair;
        this.f4220p0 = c4244p;
        this.f4221q0 = c4249u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4217Y) {
            case 0:
                C1868f c1868f = (C1868f) ((C1546Y) this.f4218Z.f68345o0).f4245i;
                Pair pair = this.f4219o0;
                c1868f.mo2752L(((Integer) pair.first).intValue(), (C4253y) pair.second, this.f4220p0, this.f4221q0);
                break;
            case 1:
                C1868f c1868f2 = (C1868f) ((C1546Y) this.f4218Z.f68345o0).f4245i;
                Pair pair2 = this.f4219o0;
                c1868f2.mo2762j(((Integer) pair2.first).intValue(), (C4253y) pair2.second, this.f4220p0, this.f4221q0);
                break;
            default:
                C1868f c1868f3 = (C1868f) ((C1546Y) this.f4218Z.f68345o0).f4245i;
                Pair pair3 = this.f4219o0;
                c1868f3.mo2770r(((Integer) pair3.first).intValue(), (C4253y) pair3.second, this.f4220p0, this.f4221q0);
                break;
        }
    }
}
