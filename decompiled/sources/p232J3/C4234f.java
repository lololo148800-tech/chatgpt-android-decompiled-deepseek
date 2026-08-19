package p232J3;

import java.util.ArrayList;
import p1016t3.AbstractC19764N;
import p1016t3.C19763M;
import p1073w3.AbstractC20800b;
import p305M3.C5285e;

/* JADX INFO: renamed from: J3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4234f extends AbstractC4231c0 {

    /* JADX INFO: renamed from: l */
    public final long f13833l;

    /* JADX INFO: renamed from: m */
    public final boolean f13834m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f13835n;

    /* JADX INFO: renamed from: o */
    public final C19763M f13836o;

    /* JADX INFO: renamed from: p */
    public C4232d f13837p;

    /* JADX INFO: renamed from: q */
    public C4233e f13838q;

    /* JADX INFO: renamed from: r */
    public long f13839r;

    /* JADX INFO: renamed from: s */
    public long f13840s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4234f(AbstractC4226a abstractC4226a, long j10, boolean z6) {
        super(abstractC4226a);
        abstractC4226a.getClass();
        this.f13833l = j10;
        this.f13834m = z6;
        this.f13835n = new ArrayList();
        this.f13836o = new C19763M();
    }

    /* JADX INFO: renamed from: B */
    public final void m5007B(AbstractC19764N abstractC19764N) {
        long j10;
        C19763M c19763m = this.f13836o;
        abstractC19764N.m20727n(0, c19763m);
        long j11 = c19763m.f62600o;
        C4232d c4232d = this.f13837p;
        ArrayList arrayList = this.f13835n;
        long j12 = this.f13833l;
        if (c4232d == null || arrayList.isEmpty()) {
            this.f13839r = j11;
            this.f13840s = j12 != Long.MIN_VALUE ? j11 + j12 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4230c c4230c = (C4230c) arrayList.get(i10);
                long j13 = this.f13839r;
                long j14 = this.f13840s;
                c4230c.f13825q0 = j13;
                c4230c.f13826r0 = j14;
            }
            j10 = 0;
        } else {
            long j15 = this.f13839r - j11;
            j12 = j12 != Long.MIN_VALUE ? this.f13840s - j11 : Long.MIN_VALUE;
            j10 = j15;
        }
        try {
            C4232d c4232d2 = new C4232d(abstractC19764N, j10, j12);
            this.f13837p = c4232d2;
            m4995l(c4232d2);
        } catch (C4233e e10) {
            this.f13838q = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C4230c) arrayList.get(i11)).f13827s0 = this.f13838q;
            }
        }
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: a */
    public final InterfaceC4251w mo4929a(C4253y c4253y, C5285e c5285e, long j10) {
        C4230c c4230c = new C4230c(this.f13828k.mo4929a(c4253y, c5285e, j10), this.f13834m, this.f13839r, this.f13840s);
        this.f13835n.add(c4230c);
        return c4230c;
    }

    @Override // p232J3.AbstractC4237i, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: i */
    public final void mo4931i() throws C4233e {
        C4233e c4233e = this.f13838q;
        if (c4233e != null) {
            throw c4233e;
        }
        super.mo4931i();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: m */
    public final void mo4933m(InterfaceC4251w interfaceC4251w) {
        ArrayList arrayList = this.f13835n;
        AbstractC20800b.m21320h(arrayList.remove(interfaceC4251w));
        this.f13828k.mo4933m(((C4230c) interfaceC4251w).f13821Y);
        if (arrayList.isEmpty()) {
            C4232d c4232d = this.f13837p;
            c4232d.getClass();
            m5007B(c4232d.f13864b);
        }
    }

    @Override // p232J3.AbstractC4237i, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: o */
    public final void mo4934o() {
        super.mo4934o();
        this.f13838q = null;
        this.f13837p = null;
    }

    @Override // p232J3.AbstractC4231c0
    /* JADX INFO: renamed from: y */
    public final void mo5005y(AbstractC19764N abstractC19764N) {
        if (this.f13838q != null) {
            return;
        }
        m5007B(abstractC19764N);
    }
}
