package p203I0;

import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0636s;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13756d;
import p759g1.C13800b;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: I0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3559p {

    /* JADX INFO: renamed from: a */
    public C13800b f10779a;

    /* JADX INFO: renamed from: b */
    public final float f10780b;

    /* JADX INFO: renamed from: c */
    public final boolean f10781c;

    /* JADX INFO: renamed from: d */
    public Float f10782d;

    /* JADX INFO: renamed from: e */
    public C13800b f10783e;

    /* JADX INFO: renamed from: f */
    public final C13756d f10784f = AbstractC13758e.m15236a(0.0f);

    /* JADX INFO: renamed from: g */
    public final C13756d f10785g = AbstractC13758e.m15236a(0.0f);

    /* JADX INFO: renamed from: h */
    public final C13756d f10786h = AbstractC13758e.m15236a(0.0f);

    /* JADX INFO: renamed from: i */
    public final C0636s f10787i;

    /* JADX INFO: renamed from: j */
    public final C6002f0 f10788j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f10789k;

    public C3559p(C13800b c13800b, float f10, boolean z6) {
        this.f10779a = c13800b;
        this.f10780b = f10;
        this.f10781c = z6;
        C0636s c0636s = new C0636s(true);
        c0636s.m1294K(null);
        this.f10787i = c0636s;
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f10788j = C5997d.m6430Q(bool, c5975s);
        this.f10789k = C5997d.m6430Q(bool, c5975s);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m4233a(AbstractC19687c abstractC19687c) {
        C3552i c3552i;
        C3559p c3559p;
        Object objM1183l;
        if (abstractC19687c instanceof C3552i) {
            c3552i = (C3552i) abstractC19687c;
            int i10 = c3552i.f10766p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3552i.f10766p0 = i10 - Integer.MIN_VALUE;
            } else {
                c3552i = new C3552i(this, abstractC19687c);
            }
        } else {
            c3552i = new C3552i(this, abstractC19687c);
        }
        Object obj = c3552i.f10764Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3552i.f10766p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                c3559p = c3552i.f10763Y;
                AbstractC9233X.m9807c(obj);
            } else if (i11 == 2) {
                c3559p = c3552i.f10763Y;
                AbstractC9233X.m9807c(obj);
                c3552i.f10763Y = null;
                c3552i.f10766p0 = 3;
                c3559p.getClass();
                objM1183l = AbstractC0575H.m1183l(new C3558o(c3559p, null), c3552i);
                if (objM1183l != enumC19250a) {
                    objM1183l = c17296c;
                }
                if (objM1183l == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        c3552i.f10763Y = this;
        c3552i.f10766p0 = 1;
        Object objM1183l2 = AbstractC0575H.m1183l(new C3556m(this, null), c3552i);
        if (objM1183l2 != enumC19250a) {
            objM1183l2 = c17296c;
        }
        if (objM1183l2 == enumC19250a) {
            return enumC19250a;
        }
        c3559p = this;
        c3559p.f10788j.setValue(Boolean.TRUE);
        c3552i.f10763Y = c3559p;
        c3552i.f10766p0 = 2;
        if (c3559p.f10787i.m1309u(c3552i) == enumC19250a) {
            return enumC19250a;
        }
        c3552i.f10763Y = null;
        c3552i.f10766p0 = 3;
        c3559p.getClass();
        objM1183l = AbstractC0575H.m1183l(new C3558o(c3559p, null), c3552i);
        if (objM1183l != enumC19250a) {
            objM1183l = c17296c;
        }
        if (objM1183l == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
