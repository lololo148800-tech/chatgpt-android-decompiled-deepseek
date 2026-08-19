package p329N3;

import p051Bo.C1458d;
import p1016t3.C19773X;
import p1073w3.AbstractC20800b;
import p239Ja.C4312o;
import p370P0.C6277D;
import p720e6.C13287b;

/* JADX INFO: renamed from: N3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5630t {

    /* JADX INFO: renamed from: a */
    public final C13287b f18286a;

    /* JADX INFO: renamed from: b */
    public final C5625o f18287b;

    /* JADX INFO: renamed from: c */
    public final C1458d f18288c = new C1458d();

    /* JADX INFO: renamed from: d */
    public final C4312o f18289d = new C4312o();

    /* JADX INFO: renamed from: e */
    public final C4312o f18290e = new C4312o();

    /* JADX INFO: renamed from: f */
    public final C6277D f18291f;

    /* JADX INFO: renamed from: g */
    public C19773X f18292g;

    /* JADX INFO: renamed from: h */
    public C19773X f18293h;

    /* JADX INFO: renamed from: i */
    public long f18294i;

    /* JADX INFO: renamed from: j */
    public long f18295j;

    public C5630t(C13287b c13287b, C5625o c5625o) {
        this.f18286a = c13287b;
        this.f18287b = c5625o;
        C6277D c6277d = new C6277D(5);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c6277d.f20382b = 0;
        c6277d.f20383c = 0;
        c6277d.f20385e = new long[iHighestOneBit];
        c6277d.f20384d = iHighestOneBit - 1;
        this.f18291f = c6277d;
        this.f18293h = C19773X.f62650e;
        this.f18295j = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m6040a() {
        C6277D c6277d = this.f18291f;
        c6277d.f20382b = 0;
        c6277d.f20383c = 0;
        this.f18295j = -9223372036854775807L;
        C4312o c4312o = this.f18290e;
        if (c4312o.m5079K() > 0) {
            AbstractC20800b.m21316d(c4312o.m5079K() > 0);
            while (c4312o.m5079K() > 1) {
                c4312o.m5074F();
            }
            Object objM5074F = c4312o.m5074F();
            objM5074F.getClass();
            c4312o.m5087f(0L, (Long) objM5074F);
        }
        C19773X c19773x = this.f18292g;
        C4312o c4312o2 = this.f18289d;
        if (c19773x != null) {
            c4312o2.m5093l();
            return;
        }
        if (c4312o2.m5079K() > 0) {
            AbstractC20800b.m21316d(c4312o2.m5079K() > 0);
            while (c4312o2.m5079K() > 1) {
                c4312o2.m5074F();
            }
            Object objM5074F2 = c4312o2.m5074F();
            objM5074F2.getClass();
            this.f18292g = (C19773X) objM5074F2;
        }
    }
}
