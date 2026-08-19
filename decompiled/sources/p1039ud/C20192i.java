package p1039ud;

import java.util.Collection;
import p016Ae.C0452n;
import p025An.C0644w;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p403Qd.C6602H;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: ud.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20192i {

    /* JADX INFO: renamed from: a */
    public final C0452n f63940a;

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f63941b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f63942c;

    /* JADX INFO: renamed from: d */
    public boolean f63943d;

    /* JADX INFO: renamed from: e */
    public int f63944e;

    public C20192i(C0452n c0452n) {
        this.f63940a = c0452n;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f63941b = c2153q0M3204c;
        this.f63942c = c2153q0M3204c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m21009a(AbstractC19687c abstractC19687c) {
        C20191h c20191h;
        C20192i c20192i;
        if (abstractC19687c instanceof C20191h) {
            c20191h = (C20191h) abstractC19687c;
            int i10 = c20191h.f63939p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c20191h.f63939p0 = i10 - Integer.MIN_VALUE;
            } else {
                c20191h = new C20191h(this, abstractC19687c);
            }
        } else {
            c20191h = new C20191h(this, abstractC19687c);
        }
        Object objM1099g = c20191h.f63937Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c20191h.f63939p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1099g);
            this.f63943d = true;
            int i12 = this.f63944e;
            c20191h.f63936Y = this;
            c20191h.f63939p0 = 1;
            objM1099g = this.f63940a.m1099g(i12, 20, true, c20191h);
            if (objM1099g == enumC19250a) {
                return enumC19250a;
            }
            c20192i = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20192i = c20191h.f63936Y;
            AbstractC9233X.m9807c(objM1099g);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM1099g;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        if (!z6) {
            if (z6) {
                return new C21952P1(Boolean.TRUE);
            }
            if ((abstractC21955Q1 instanceof C21929J1) || (abstractC21955Q1 instanceof AbstractC21933K1)) {
                return abstractC21955Q1;
            }
            throw new C0644w();
        }
        C2153Q0 c2153q0 = c20192i.f63941b;
        C21952P1 c21952p1 = (C21952P1) abstractC21955Q1;
        c2153q0.m3251l(null, AbstractC17680n.m19361k0(((C6602H) c21952p1.f69511a).f21316a, (Collection) c2153q0.getValue()));
        c20192i.f63943d = false;
        int i13 = c20192i.f63944e;
        Object obj = c21952p1.f69511a;
        int size = ((C6602H) obj).f21316a.size() + i13;
        c20192i.f63944e = size;
        return new C21952P1(Boolean.valueOf(((C6602H) obj).f21317b > size));
    }
}
