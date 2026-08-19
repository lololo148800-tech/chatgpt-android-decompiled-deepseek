package p232J3;

import io.sentry.internal.debugmeta.C15384c;
import java.io.IOException;
import p031B3.C0803g;
import p1016t3.C19788o;
import p133F3.C2656b;
import p158G3.C2988g;
import p305M3.C5292l;
import p305M3.HandlerC5290j;
import p477Tb.C7296c;

/* JADX INFO: renamed from: J3.K */
/* JADX INFO: loaded from: classes.dex */
public final class C4211K implements InterfaceC4220U {

    /* JADX INFO: renamed from: Y */
    public final int f13695Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4213M f13696Z;

    public C4211K(C4213M c4213m, int i10) {
        this.f13696Z = c4213m;
        this.f13695Y = i10;
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: a */
    public final boolean mo4941a() {
        C4213M c4213m = this.f13696Z;
        return !c4213m.m4945A() && c4213m.f13705E0[this.f13695Y].m4980m(c4213m.f13724X0);
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: b */
    public final void mo4942b() throws IOException {
        C4213M c4213m = this.f13696Z;
        C4219T c4219t = c4213m.f13705E0[this.f13695Y];
        C7296c c7296c = c4219t.f13774h;
        if (c7296c != null && c7296c.m7749A() == 1) {
            C2656b c2656bM7764x = c4219t.f13774h.m7764x();
            c2656bM7764x.getClass();
            throw c2656bM7764x;
        }
        int iM3668h = c4213m.f13729p0.m3668h(c4213m.f13715O0);
        C5292l c5292l = c4213m.f13736w0;
        IOException iOException = c5292l.f17446c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC5290j handlerC5290j = c5292l.f17445b;
        if (handlerC5290j != null) {
            if (iM3668h == Integer.MIN_VALUE) {
                iM3668h = handlerC5290j.f17432Y;
            }
            IOException iOException2 = handlerC5290j.f17436q0;
            if (iOException2 != null && handlerC5290j.f17437r0 > iM3668h) {
                throw iOException2;
            }
        }
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: c */
    public final int mo4943c(long j10) {
        C4213M c4213m = this.f13696Z;
        int i10 = this.f13695Y;
        int i11 = 0;
        if (!c4213m.m4945A()) {
            c4213m.m4954w(i10);
            C4219T c4219t = c4213m.f13705E0[i10];
            boolean z6 = c4213m.f13724X0;
            synchronized (c4219t) {
                int iM4978k = c4219t.m4978k(c4219t.f13785s);
                int i12 = c4219t.f13785s;
                int i13 = c4219t.f13782p;
                if ((i12 != i13) && j10 >= c4219t.f13780n[iM4978k]) {
                    if (j10 <= c4219t.f13788v || !z6) {
                        int iM4976i = c4219t.m4976i(iM4978k, i13 - i12, j10, true);
                        if (iM4976i != -1) {
                            i11 = iM4976i;
                        }
                    } else {
                        i11 = i13 - i12;
                    }
                }
            }
            c4219t.m4986s(i11);
            if (i11 == 0) {
                c4213m.m4955x(i10);
            }
        }
        return i11;
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: d */
    public final int mo4944d(C15384c c15384c, C0803g c0803g, int i10) {
        int i11;
        C4213M c4213m = this.f13696Z;
        int i12 = this.f13695Y;
        if (c4213m.m4945A()) {
            return -3;
        }
        c4213m.m4954w(i12);
        C4219T c4219t = c4213m.f13705E0[i12];
        boolean z6 = c4213m.f13724X0;
        c4219t.getClass();
        boolean z10 = (i10 & 2) != 0;
        C2988g c2988g = c4219t.f13768b;
        synchronized (c4219t) {
            try {
                c0803g.f2227r0 = false;
                int i13 = c4219t.f13785s;
                if (i13 != c4219t.f13782p) {
                    C19788o c19788o = ((C4218S) c4219t.f13769c.m1061q(c4219t.f13783q + i13)).f13763a;
                    if (!z10 && c19788o == c4219t.f13773g) {
                        int iM4978k = c4219t.m4978k(c4219t.f13785s);
                        if (c4219t.m4981n(iM4978k)) {
                            c0803g.f2213Z = c4219t.f13779m[iM4978k];
                            if (c4219t.f13785s == c4219t.f13782p - 1 && (z6 || c4219t.f13789w)) {
                                c0803g.m1823a(536870912);
                            }
                            c0803g.f2228s0 = c4219t.f13780n[iM4978k];
                            c2988g.f8970a = c4219t.f13778l[iM4978k];
                            c2988g.f8971b = c4219t.f13777k[iM4978k];
                            c2988g.f8972c = c4219t.f13781o[iM4978k];
                            i11 = -4;
                        } else {
                            c0803g.f2227r0 = true;
                            i11 = -3;
                        }
                    }
                    c4219t.m4982o(c19788o, c15384c);
                    i11 = -5;
                } else {
                    if (!z6 && !c4219t.f13789w) {
                        C19788o c19788o2 = c4219t.f13792z;
                        if (c19788o2 == null || (!z10 && c19788o2 == c4219t.f13773g)) {
                            i11 = -3;
                        }
                        c4219t.m4982o(c19788o2, c15384c);
                        i11 = -5;
                    }
                    c0803g.f2213Z = 4;
                    c0803g.f2228s0 = Long.MIN_VALUE;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !c0803g.m1824d(4)) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    C4217Q c4217q = c4219t.f13767a;
                    C4217Q.m4965e(c4217q.f13760e, c0803g, c4219t.f13768b, c4217q.f13758c);
                } else {
                    C4217Q c4217q2 = c4219t.f13767a;
                    c4217q2.f13760e = C4217Q.m4965e(c4217q2.f13760e, c0803g, c4219t.f13768b, c4217q2.f13758c);
                }
            }
            if (!z11) {
                c4219t.f13785s++;
            }
        }
        if (i11 == -3) {
            c4213m.m4955x(i12);
        }
        return i11;
    }
}
