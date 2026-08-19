package p708dh;

import mm.C17296C;
import ni.C17641o;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2207t0;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: dh.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C13166t {

    /* JADX INFO: renamed from: a */
    public final C13167u f41797a;

    /* JADX INFO: renamed from: b */
    public final C17641o f41798b;

    /* JADX INFO: renamed from: c */
    public final C13145X f41799c;

    /* JADX INFO: renamed from: d */
    public final C13158l f41800d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2184i f41801e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2184i f41802f;

    /* JADX INFO: renamed from: g */
    public final C2153Q0 f41803g;

    /* JADX INFO: renamed from: h */
    public final C2153Q0 f41804h;

    /* JADX INFO: renamed from: i */
    public C0564B0 f41805i;

    public C13166t(C13167u c13167u, C17641o c17641o, C13145X c13145x, C13158l c13158l) {
        this.f41797a = c13167u;
        this.f41798b = c17641o;
        this.f41799c = c13145x;
        this.f41800d = c13158l;
        InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new C1970n(new C2146N(c13167u.f64176f, 2), 20, this));
        this.f41801e = interfaceC2184iM3215n;
        this.f41802f = AbstractC2124C.m3215n(new C2146N(interfaceC2184iM3215n, 3));
        this.f41803g = AbstractC2124C.m3204c(null);
        this.f41804h = AbstractC2124C.m3204c(null);
        AbstractC2124C.m3226y(new C1970n(new C2207t0(c13145x.f41737e, c13158l.f41780e, C13160n.f41781t0, 0), 5, new C13161o(this, null)), c17641o);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m14826a(AbstractC19687c abstractC19687c) {
        C13162p c13162p;
        C13166t c13166t;
        C0564B0 c0564b0M1156D;
        if (abstractC19687c instanceof C13162p) {
            c13162p = (C13162p) abstractC19687c;
            int i10 = c13162p.f41788p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13162p.f41788p0 = i10 - Integer.MIN_VALUE;
            } else {
                c13162p = new C13162p(this, abstractC19687c);
            }
        } else {
            c13162p = new C13162p(this, abstractC19687c);
        }
        Object obj = c13162p.f41786Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13162p.f41788p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C0564B0 c0564b0 = this.f41805i;
            if (c0564b0 != null && c0564b0.mo1274a()) {
                c13162p.f41788p0 = 1;
                return c0564b0.mo1272P(c13162p) == enumC19250a ? enumC19250a : c17296c;
            }
            c13162p.f41785Y = this;
            c13162p.f41788p0 = 2;
            this.f41803g.setValue(null);
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
            c13166t = this;
            c0564b0M1156D = AbstractC0575H.m1156D(c13166t.f41798b, null, null, new C13163q(c13166t, null), 3);
            c13166t.f41805i = c0564b0M1156D;
            c13162p.f41785Y = c0564b0M1156D;
            c13162p.f41788p0 = 3;
            if (c0564b0M1156D.mo1272P(c13162p) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 == 1) {
                AbstractC9233X.m9807c(obj);
            }
            if (i11 == 2) {
                c13166t = (C13166t) c13162p.f41785Y;
                AbstractC9233X.m9807c(obj);
                c0564b0M1156D = AbstractC0575H.m1156D(c13166t.f41798b, null, null, new C13163q(c13166t, null), 3);
                c13166t.f41805i = c0564b0M1156D;
                c13162p.f41785Y = c0564b0M1156D;
                c13162p.f41788p0 = 3;
                if (c0564b0M1156D.mo1272P(c13162p) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        return c17296c;
    }
}
