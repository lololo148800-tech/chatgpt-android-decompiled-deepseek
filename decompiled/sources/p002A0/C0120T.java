package p002A0;

import android.content.ClipData;
import android.view.ActionMode;
import java.io.Serializable;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p001A.AbstractC0010F;
import p003A1.C0166F0;
import p003A1.C0169G0;
import p003A1.C0256i;
import p003A1.C0278p0;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0303x1;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1807h0;
import p080D0.C1824q;
import p080D0.C1826r;
import p080D0.C1828s;
import p080D0.C1829s0;
import p1014t1.C19723A;
import p1071w0.AbstractC20776t0;
import p1071w0.EnumC20729S;
import p1095x1.InterfaceC21098s;
import p1116y0.C21353b;
import p1116y0.C21358g;
import p1139z0.AbstractC21627m;
import p1139z0.C21574A0;
import p1139z0.C21577C;
import p1139z0.C21578C0;
import p1139z0.C21582E0;
import p1139z0.C21595S;
import p1139z0.C21616g0;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3590f;
import p349O0.C5944C;
import p349O0.C5960K;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p467T1.EnumC7198h;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8583X2;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9233X;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p759g1.C13800b;
import p759g1.C13801c;
import p796i0.C14898e;
import p820j0.AbstractC16033d;
import p820j0.C16031b;
import p860l0.AbstractC16750j0;
import p894n0.C17409o;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: A0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0120T {

    /* JADX INFO: renamed from: a */
    public final C21582E0 f499a;

    /* JADX INFO: renamed from: b */
    public final C21574A0 f500b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7537b f501c;

    /* JADX INFO: renamed from: d */
    public boolean f502d;

    /* JADX INFO: renamed from: e */
    public boolean f503e;

    /* JADX INFO: renamed from: f */
    public boolean f504f;

    /* JADX INFO: renamed from: g */
    public boolean f505g;

    /* JADX INFO: renamed from: h */
    public InterfaceC18285a f506h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0303x1 f507i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0172H0 f508j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f509k;

    /* JADX INFO: renamed from: l */
    public C21616g0 f510l;

    /* JADX INFO: renamed from: m */
    public final C6002f0 f511m;

    /* JADX INFO: renamed from: n */
    public final C6002f0 f512n;

    /* JADX INFO: renamed from: o */
    public final C6002f0 f513o;

    /* JADX INFO: renamed from: p */
    public final C6002f0 f514p;

    /* JADX INFO: renamed from: q */
    public final C6002f0 f515q;

    /* JADX INFO: renamed from: r */
    public final C6002f0 f516r;

    /* JADX INFO: renamed from: s */
    public C1829s0 f517s;

    /* JADX INFO: renamed from: t */
    public int f518t;

    /* JADX INFO: renamed from: u */
    public C17409o f519u;

    public C0120T(C21582E0 c21582e0, C21574A0 c21574a0, InterfaceC7537b interfaceC7537b, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f499a = c21582e0;
        this.f500b = c21574a0;
        this.f501c = interfaceC7537b;
        this.f502d = z6;
        this.f503e = z10;
        this.f504f = z11;
        this.f505g = z12;
        Boolean bool = Boolean.TRUE;
        C5975S c5975s = C5975S.f19448r0;
        this.f509k = C5997d.m6430Q(bool, c5975s);
        this.f511m = C5997d.m6430Q(new C13800b(9205357640488583168L), c5975s);
        this.f512n = C5997d.m6430Q(new C13800b(9205357640488583168L), c5975s);
        this.f513o = C5997d.m6430Q(null, c5975s);
        this.f514p = C5997d.m6430Q(EnumC0137n.f571Y, c5975s);
        this.f515q = C5997d.m6430Q(Boolean.FALSE, c5975s);
        this.f516r = C5997d.m6430Q(EnumC0123W.f526Y, c5975s);
        this.f518t = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m396a(C0120T c0120t, C19723A c19723a, AbstractC19687c abstractC19687c) throws Throwable {
        C0145v c0145v;
        C0120T c0120t2;
        C16524A c16524a;
        Throwable th2;
        C16524A c16524a2;
        c0120t.getClass();
        if (abstractC19687c instanceof C0145v) {
            c0145v = (C0145v) abstractC19687c;
            int i10 = c0145v.f604r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0145v.f604r0 = i10 - Integer.MIN_VALUE;
            } else {
                c0145v = new C0145v(c0120t, abstractC19687c);
            }
        } else {
            c0145v = new C0145v(c0120t, abstractC19687c);
        }
        C0145v c0145v2 = c0145v;
        Object obj = c0145v2.f602p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0145v2.f604r0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16524a = c0145v2.f601o0;
            c16524a2 = c0145v2.f600Z;
            c0120t2 = c0145v2.f599Y;
            try {
                AbstractC9233X.m9807c(obj);
                m399h(c0120t2, c16524a2, c16524a);
                return C17296C.f55119a;
            } catch (Throwable th3) {
                th2 = th3;
                m399h(c0120t2, c16524a2, c16524a);
                throw th2;
            }
        }
        AbstractC9233X.m9807c(obj);
        C16524A c16524a3 = new C16524A();
        c16524a3.f51261Y = 9205357640488583168L;
        C16524A c16524a4 = new C16524A();
        c16524a4.f51261Y = 9205357640488583168L;
        try {
            C0146w c0146w = new C0146w((Serializable) c16524a3, c0120t, (Serializable) c16524a4, 0);
            C0147x c0147x = new C0147x(c16524a3, c16524a4, c0120t, 0);
            C0147x c0147x2 = new C0147x(c16524a3, c16524a4, c0120t, 1);
            C0148y c0148y = new C0148y(c0120t, c16524a4, c16524a3);
            c0145v2.f599Y = c0120t;
            c0145v2.f600Z = c16524a3;
            c0145v2.f601o0 = c16524a4;
            c0145v2.f604r0 = 1;
            if (AbstractC16750j0.m18523g(c19723a, c0146w, c0147x, c0147x2, c0148y, c0145v2) == enumC19250a) {
                return enumC19250a;
            }
            c0120t2 = c0120t;
            c16524a2 = c16524a3;
            c16524a = c16524a4;
            m399h(c0120t2, c16524a2, c16524a);
            return C17296C.f55119a;
        } catch (Throwable th4) {
            c0120t2 = c0120t;
            c16524a = c16524a4;
            th2 = th4;
            c16524a2 = c16524a3;
            m399h(c0120t2, c16524a2, c16524a);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: b */
    public static final Object m397b(C0120T c0120t, C19723A c19723a, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        C0149z c0149z;
        EnumC20729S enumC20729S;
        C16524A c16524a;
        C16524A c16524a2;
        C0120T c0120t2;
        C0120T c0120t3 = c0120t;
        c0120t.getClass();
        if (abstractC19687c instanceof C0149z) {
            c0149z = (C0149z) abstractC19687c;
            int i10 = c0149z.f623s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0149z.f623s0 = i10 - Integer.MIN_VALUE;
            } else {
                c0149z = new C0149z(c0120t3, abstractC19687c);
            }
        } else {
            c0149z = new C0149z(c0120t3, abstractC19687c);
        }
        C0149z c0149z2 = c0149z;
        Object obj = c0149z2.f621q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0149z2.f623s0;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC20729S = c0149z2.f620p0;
            c16524a = c0149z2.f619o0;
            c16524a2 = c0149z2.f618Z;
            c0120t2 = c0149z2.f617Y;
            try {
                AbstractC9233X.m9807c(obj);
                if (c0120t2.m408m() == enumC20729S) {
                    m400i(c0120t2, c16524a2, c16524a);
                }
                return C17296C.f55119a;
            } catch (Throwable th2) {
                th = th2;
                c0120t3 = c0120t2;
                if (c0120t3.m408m() == enumC20729S) {
                    m400i(c0120t3, c16524a2, c16524a);
                }
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        C16524A c16524a3 = new C16524A();
        c16524a3.f51261Y = 9205357640488583168L;
        C16524A c16524a4 = new C16524A();
        c16524a4.f51261Y = 0L;
        EnumC20729S enumC20729S2 = z6 ? EnumC20729S.f65725Z : EnumC20729S.f65726o0;
        try {
            C0102A c0102a = new C0102A(c0120t, c16524a3, c16524a4, enumC20729S2, z6);
            C0147x c0147x = new C0147x(c16524a3, c0120t3, c16524a4, 2);
            C0147x c0147x2 = new C0147x(c16524a3, c0120t3, c16524a4, 3);
            C0103B c0103b = new C0103B(c0120t, c16524a4, c16524a3, enumC20729S2, z6);
            c0149z2.f617Y = c0120t3;
            c0149z2.f618Z = c16524a3;
            c0149z2.f619o0 = c16524a4;
            c0149z2.f620p0 = enumC20729S2;
            c0149z2.f623s0 = 1;
            enumC20729S = enumC20729S2;
            c16524a = c16524a4;
            try {
                if (AbstractC16750j0.m18523g(c19723a, c0102a, c0147x, c0147x2, c0103b, c0149z2) == enumC19250a) {
                    return enumC19250a;
                }
                c0120t2 = c0120t3;
                c16524a2 = c16524a3;
                if (c0120t2.m408m() == enumC20729S) {
                    m400i(c0120t2, c16524a2, c16524a);
                }
                return C17296C.f55119a;
            } catch (Throwable th3) {
                th = th3;
                c16524a2 = c16524a3;
                if (c0120t3.m408m() == enumC20729S) {
                    m400i(c0120t3, c16524a2, c16524a);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            enumC20729S = enumC20729S2;
            c16524a = c16524a4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m398c(C0120T c0120t, long j10) {
        int iM4313e;
        int i10;
        long j11;
        C21578C0 c21578c0;
        C3578I c3578iM21849b = c0120t.f500b.m21849b();
        if (c3578iM21849b == null || (iM4313e = c3578iM21849b.f10893b.m4313e(j10)) == -1) {
            return false;
        }
        C21582E0 c21582e0 = c0120t.f499a;
        C5944C c5944c = c21582e0.f68339c;
        C21595S c21595s = null;
        C5960K c5960k = (c5944c == null || (c21578c0 = (C21578C0) c5944c.getValue()) == null) ? null : c21578c0.f68332b;
        long jM6395a = c5960k != null ? c5960k.m6395a(iM4313e, false) : AbstractC8676n.m9365b(iM4313e, iM4313e);
        long jM21883e = c21582e0.m21883e(jM6395a);
        if (C3581L.m4267c(jM6395a) && C3581L.m4267c(jM21883e)) {
            i10 = 1;
        } else if (C3581L.m4267c(jM6395a) || C3581L.m4267c(jM21883e)) {
            i10 = (!C3581L.m4267c(jM6395a) || C3581L.m4267c(jM21883e)) ? 4 : 2;
        } else {
            i10 = 3;
        }
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 0) {
            j11 = jM6395a >> 32;
        } else {
            if (iM24h == 1) {
                C13801c c13801cM4253c = c3578iM21849b.m4253c((int) (jM21883e >> 32));
                C13801c c13801cM4253c2 = c3578iM21849b.m4253c((int) (jM21883e & 4294967295L));
                float fM21965m = AbstractC21627m.m21965m(j10, c13801cM4253c);
                float fM21965m2 = AbstractC21627m.m21965m(j10, c13801cM4253c2);
                c21595s = (fM21965m != fM21965m2 && fM21965m < fM21965m2) ? new C21595S(1) : new C21595S(2);
            } else if (iM24h == 2) {
                C13801c c13801cM4253c3 = c3578iM21849b.m4253c((int) (jM21883e >> 32));
                C13801c c13801cM4253c4 = c3578iM21849b.m4253c((int) (jM21883e & 4294967295L));
                float fM21965m3 = AbstractC21627m.m21965m(j10, c13801cM4253c3);
                float fM21965m4 = AbstractC21627m.m21965m(j10, c13801cM4253c4);
                if (fM21965m3 == fM21965m4 || fM21965m3 >= fM21965m4) {
                    j11 = jM6395a & 4294967295L;
                }
            } else if (iM24h != 3) {
                throw new C0644w();
            }
            j11 = jM6395a >> 32;
        }
        int i11 = (int) j11;
        long jM9365b = AbstractC8676n.m9365b(i11, i11);
        boolean zM4266b = C3581L.m4266b(jM9365b, c21582e0.f68337a.m21750b().f67818Z);
        C6002f0 c6002f0 = c21582e0.f68340d;
        if (zM4266b && (c21595s == null || c21595s.equals((C21595S) c6002f0.getValue()))) {
            return false;
        }
        c21582e0.m21885i(jM9365b);
        if (c21595s != null) {
            c6002f0.setValue(c21595s);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static final void m399h(C0120T c0120t, C16524A c16524a, C16524A c16524a2) {
        if (AbstractC8088f6.m8538d(c16524a.f51261Y)) {
            c16524a.f51261Y = 9205357640488583168L;
            c16524a2.f51261Y = 9205357640488583168L;
            c0120t.m402e();
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m400i(C0120T c0120t, C16524A c16524a, C16524A c16524a2) {
        if (AbstractC8088f6.m8538d(c16524a.f51261Y)) {
            c0120t.m402e();
            c16524a.f51261Y = 9205357640488583168L;
            c16524a2.f51261Y = 0L;
            c0120t.f518t = -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m401d() {
        ClipData primaryClip;
        if (!(this.f502d && !this.f503e)) {
            return false;
        }
        InterfaceC0172H0 interfaceC0172H0 = this.f508j;
        if (interfaceC0172H0 != null && ((C0256i) interfaceC0172H0).m826b()) {
            return true;
        }
        C21616g0 c21616g0 = this.f510l;
        C0166F0 c0166f0 = null;
        if ((c21616g0 != null ? AbstractC16033d.m17588a(c21616g0.f68478Z) : null) == null) {
            return false;
        }
        InterfaceC0172H0 interfaceC0172H1 = this.f508j;
        if (interfaceC0172H1 != null && (primaryClip = ((C0256i) interfaceC0172H1).f960a.getPrimaryClip()) != null) {
            c0166f0 = new C0166F0(primaryClip);
        }
        return c0166f0 != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m402e() {
        this.f513o.setValue(null);
        this.f512n.setValue(new C13800b(9205357640488583168L));
        this.f511m.setValue(new C13800b(9205357640488583168L));
    }

    /* JADX INFO: renamed from: f */
    public final void m403f(boolean z6) {
        C21582E0 c21582e0 = this.f499a;
        C21353b c21353bM21881c = c21582e0.m21881c();
        if (C3581L.m4267c(c21353bM21881c.f67818Z)) {
            return;
        }
        InterfaceC0172H0 interfaceC0172H0 = this.f508j;
        if (interfaceC0172H0 != null) {
            long j10 = c21353bM21881c.f67818Z;
            C0256i c0256i = (C0256i) interfaceC0172H0;
            c0256i.m827c(new C3590f(6, c21353bM21881c.f67817Y.subSequence(C3581L.m4270f(j10), C3581L.m4269e(j10)).toString(), null));
        }
        if (z6) {
            c21582e0.m21879a();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m404g() {
        C21582E0 c21582e0 = this.f499a;
        C21353b c21353bM21881c = c21582e0.m21881c();
        if (C3581L.m4267c(c21353bM21881c.f67818Z)) {
            return;
        }
        InterfaceC0172H0 interfaceC0172H0 = this.f508j;
        if (interfaceC0172H0 != null) {
            long j10 = c21353bM21881c.f67818Z;
            C0256i c0256i = (C0256i) interfaceC0172H0;
            c0256i.m827c(new C3590f(6, c21353bM21881c.f67817Y.subSequence(C3581L.m4270f(j10), C3581L.m4269e(j10)).toString(), null));
        }
        C21358g c21358g = c21582e0.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g.f67827b;
        c21577c.m21855c(C3581L.m4270f(c21577c.m21857e()), C3581L.m4269e(c21577c.m21857e()));
        c21577c.m21860h(C3581L.m4270f(c21577c.m21857e()), C3581L.m4270f(c21577c.m21857e()));
        C21358g.m21749a(c21358g, true, 3);
    }

    /* JADX INFO: renamed from: j */
    public final Object m405j(C19723A c19723a, AbstractC19694j abstractC19694j) {
        Object objM20667K0 = c19723a.m20667K0(new C0107F(this, null), abstractC19694j);
        return objM20667K0 == EnumC19250a.f61036Y ? objM20667K0 : C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX INFO: renamed from: k */
    public final C0126c m406k(boolean z6) {
        C21353b c21353bM21881c = this.f499a.m21881c();
        boolean zBooleanValue = ((Boolean) this.f515q.getValue()).booleanValue();
        boolean z10 = true;
        boolean z11 = ((EnumC0137n) this.f514p.getValue()) == EnumC0137n.f571Y;
        EnumC20729S enumC20729SM408m = m408m();
        if (!zBooleanValue || !z11 || !C3581L.m4267c(c21353bM21881c.f67818Z) || c21353bM21881c.f67820p0 != null || c21353bM21881c.f67817Y.length() <= 0) {
            z10 = false;
        } else if (enumC20729SM408m != EnumC20729S.f65724Y) {
            AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
            InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
            AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
            try {
                long jM15316c = m407l().m15316c();
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                InterfaceC21098s interfaceC21098sM412q = m412q();
                if (!(interfaceC21098sM412q != null ? AbstractC1807h0.m2631t(jM15316c, AbstractC1807h0.m2611F(interfaceC21098sM412q)) : false)) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
                throw th2;
            }
        }
        if (z10) {
            return new C0126c(true, z6 ? m407l().m15316c() : 9205357640488583168L, EnumC7198h.f22859Y, false);
        }
        return C0126c.f535e;
    }

    /* JADX INFO: renamed from: l */
    public final C13801c m407l() {
        float f10;
        C3578I c3578iM21849b = this.f500b.m21849b();
        C13801c c13801c = C13801c.f43585e;
        if (c3578iM21849b == null) {
            return c13801c;
        }
        C21353b c21353bM21881c = this.f499a.m21881c();
        if (!C3581L.m4267c(c21353bM21881c.f67818Z)) {
            return c13801c;
        }
        C13801c c13801cM4253c = c3578iM21849b.m4253c((int) (c21353bM21881c.f67818Z >> 32));
        float fMo7864b0 = this.f501c.mo7864b0(AbstractC20776t0.f65981a);
        if (c3578iM21849b.f10892a.f10889h == EnumC7546k.f23904Y) {
            f10 = (fMo7864b0 / 2) + c13801cM4253c.f43586a;
        } else {
            f10 = c13801cM4253c.f43588c - (fMo7864b0 / 2);
        }
        float f11 = fMo7864b0 / 2;
        float fM8915f = AbstractC8301I.m8915f(AbstractC8301I.m8917h(f10, ((int) (c3578iM21849b.f10894c >> 32)) - f11), f11);
        return new C13801c(fM8915f - f11, c13801cM4253c.f43587b, fM8915f + f11, c13801cM4253c.f43589d);
    }

    /* JADX INFO: renamed from: m */
    public final EnumC20729S m408m() {
        return (EnumC20729S) this.f513o.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final long m409n() {
        C6002f0 c6002f0 = this.f512n;
        if (AbstractC8088f6.m8539e(((C13800b) c6002f0.getValue()).f43584a)) {
            return 9205357640488583168L;
        }
        C6002f0 c6002f1 = this.f511m;
        if (AbstractC8088f6.m8539e(((C13800b) c6002f1.getValue()).f43584a)) {
            return AbstractC21627m.m21966n(this.f500b, ((C13800b) c6002f0.getValue()).f43584a);
        }
        long j10 = ((C13800b) c6002f0.getValue()).f43584a;
        long j11 = ((C13800b) c6002f1.getValue()).f43584a;
        InterfaceC21098s interfaceC21098sM412q = m412q();
        return C13800b.m15311l(j10, C13800b.m15310k(j11, interfaceC21098sM412q != null ? interfaceC21098sM412q.mo21520d(0L) : 9205357640488583168L));
    }

    /* JADX INFO: renamed from: o */
    public final long m410o(boolean z6) {
        long j10;
        C3578I c3578iM21849b = this.f500b.m21849b();
        if (c3578iM21849b == null) {
            return 0L;
        }
        long j11 = this.f499a.m21881c().f67818Z;
        if (z6) {
            int i10 = C3581L.f10907c;
            j10 = j11 >> 32;
        } else {
            int i11 = C3581L.f10907c;
            j10 = 4294967295L & j11;
        }
        return AbstractC1807h0.m2637z(c3578iM21849b, (int) j10, z6, C3581L.m4271g(j11));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX INFO: renamed from: p */
    public final C0126c m411p(boolean z6, boolean z10) {
        boolean z11;
        EnumC20729S enumC20729S = z6 ? EnumC20729S.f65725Z : EnumC20729S.f65726o0;
        C3578I c3578iM21849b = this.f500b.m21849b();
        C0126c c0126c = C0126c.f535e;
        if (c3578iM21849b == null) {
            return c0126c;
        }
        C21582E0 c21582e0 = this.f499a;
        long j10 = c21582e0.m21881c().f67818Z;
        if (C3581L.m4267c(j10)) {
            return c0126c;
        }
        long jM410o = m410o(z6);
        if (((EnumC0137n) this.f514p.getValue()) != EnumC0137n.f571Y) {
            z11 = false;
        } else {
            if (m408m() != enumC20729S) {
                InterfaceC21098s interfaceC21098sM412q = m412q();
                if (!(interfaceC21098sM412q != null ? AbstractC1807h0.m2631t(jM410o, AbstractC1807h0.m2611F(interfaceC21098sM412q)) : false)) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (!z11) {
            return c0126c;
        }
        if (!(c21582e0.m21881c().f67820p0 == null)) {
            return c0126c;
        }
        EnumC7198h enumC7198hM4251a = c3578iM21849b.m4251a(z6 ? (int) (j10 >> 32) : Math.max(((int) (4294967295L & j10)) - 1, 0));
        boolean zM4271g = C3581L.m4271g(j10);
        if (z10) {
            InterfaceC21098s interfaceC21098sM412q2 = m412q();
            if (interfaceC21098sM412q2 != null) {
                jM410o = AbstractC21627m.m21962j(jM410o, AbstractC1807h0.m2611F(interfaceC21098sM412q2));
            }
        } else {
            jM410o = 9205357640488583168L;
        }
        return new C0126c(true, jM410o, enumC7198hM4251a, zM4271g);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC21098s m412q() {
        InterfaceC21098s interfaceC21098sM21851d = this.f500b.m21851d();
        if (interfaceC21098sM21851d == null || !interfaceC21098sM21851d.mo21522h()) {
            return null;
        }
        return interfaceC21098sM21851d;
    }

    /* JADX INFO: renamed from: r */
    public final EnumC0123W m413r() {
        return (EnumC0123W) this.f516r.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final void m414s() {
        InterfaceC0303x1 interfaceC0303x1 = this.f507i;
        if ((interfaceC0303x1 != null ? ((C0278p0) interfaceC0303x1).f1010d : 0) != 1 || interfaceC0303x1 == null) {
            return;
        }
        C0278p0 c0278p0 = (C0278p0) interfaceC0303x1;
        c0278p0.f1010d = 2;
        ActionMode actionMode = c0278p0.f1008b;
        if (actionMode != null) {
            actionMode.finish();
        }
        c0278p0.f1008b = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m415t(AbstractC19687c abstractC19687c) throws Throwable {
        C0108G c0108g;
        C0120T c0120t;
        if (abstractC19687c instanceof C0108G) {
            c0108g = (C0108G) abstractC19687c;
            int i10 = c0108g.f469p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0108g.f469p0 = i10 - Integer.MIN_VALUE;
            } else {
                c0108g = new C0108G(this, abstractC19687c);
            }
        } else {
            c0108g = new C0108G(this, abstractC19687c);
        }
        Object obj = c0108g.f467Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0108g.f469p0;
        EnumC0123W enumC0123W = EnumC0123W.f526Y;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0120t = c0108g.f466Y;
            try {
                AbstractC9233X.m9807c(obj);
                c0120t.m418w(false);
                if (c0120t.m413r() != enumC0123W) {
                    c0120t.m414s();
                }
                return C17296C.f55119a;
            } catch (Throwable th2) {
                th = th2;
                c0120t.m418w(false);
                if (c0120t.m413r() != enumC0123W) {
                    c0120t.m414s();
                }
                throw th;
            }
        }
        AbstractC9233X.m9807c(obj);
        try {
            C0111J c0111j = new C0111J(this, null);
            c0108g.f466Y = this;
            c0108g.f469p0 = 1;
            if (AbstractC0575H.m1183l(c0111j, c0108g) == enumC19250a) {
                return enumC19250a;
            }
            c0120t = this;
            c0120t.m418w(false);
            if (c0120t.m413r() != enumC0123W) {
                c0120t.m414s();
            }
            return C17296C.f55119a;
        } catch (Throwable th3) {
            th = th3;
            c0120t = this;
            c0120t.m418w(false);
            if (c0120t.m413r() != enumC0123W) {
                c0120t.m414s();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m416u() {
        C3590f c3590fM825a;
        String str;
        C16031b c16031bM17588a;
        C3590f c3590fM825a2;
        String str2;
        C0166F0 c0166f0;
        String strM9248c;
        C21616g0 c21616g0 = this.f510l;
        C21582E0 c21582e0 = this.f499a;
        if (c21616g0 == null || (c16031bM17588a = AbstractC16033d.m17588a(c21616g0.f68478Z)) == null) {
            InterfaceC0172H0 interfaceC0172H0 = this.f508j;
            if (interfaceC0172H0 == null || (c3590fM825a = ((C0256i) interfaceC0172H0).m825a()) == null || (str = c3590fM825a.f10934Y) == null) {
                return;
            }
            C21582E0.m21877f(c21582e0, str, false, 3, 2);
            return;
        }
        InterfaceC0172H0 interfaceC0172H1 = this.f508j;
        if (interfaceC0172H1 != null) {
            ClipData primaryClip = ((C0256i) interfaceC0172H1).f960a.getPrimaryClip();
            C0166F0 c0166f1 = primaryClip != null ? new C0166F0(primaryClip) : null;
            if (c0166f1 != null) {
                C14898e c14898eMo9531a = c16031bM17588a.f49468b.mo9531a(new C14898e(c0166f1, new C0169G0(c0166f1.f648a.getDescription()), 2, null));
                if (c14898eMo9531a == null || (c0166f0 = c14898eMo9531a.f46391a) == null || (strM9248c = AbstractC8583X2.m9248c(c0166f0)) == null) {
                    return;
                }
                C21582E0.m21877f(c21582e0, strM9248c, false, 3, 2);
                return;
            }
        }
        InterfaceC0172H0 interfaceC0172H2 = this.f508j;
        if (interfaceC0172H2 == null || (c3590fM825a2 = ((C0256i) interfaceC0172H2).m825a()) == null || (str2 = c3590fM825a2.f10934Y) == null) {
            return;
        }
        C21582E0.m21877f(c21582e0, str2, false, 3, 2);
    }

    /* JADX INFO: renamed from: v */
    public final void m417v() {
        C21358g c21358g = this.f499a.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g.f67827b;
        c21577c.m21860h(0, c21577c.f68324a.length());
        C21358g.m21749a(c21358g, true, 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m418w(boolean z6) {
        this.f515q.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: renamed from: x */
    public final void m419x(EnumC0123W enumC0123W) {
        this.f516r.setValue(enumC0123W);
    }

    /* JADX INFO: renamed from: y */
    public final void m420y(EnumC20729S enumC20729S, long j10) {
        this.f513o.setValue(enumC20729S);
        this.f512n.setValue(new C13800b(j10));
    }

    /* JADX INFO: renamed from: z */
    public final long m421z(C21353b c21353b, int i10, int i11, boolean z6, C1826r c1826r, boolean z10, boolean z11) {
        long jM9365b;
        InterfaceC18285a interfaceC18285a;
        long j10 = c21353b.f67818Z;
        C3581L c3581l = new C3581L(j10);
        if (z11 || (!z10 && C3581L.m4267c(j10))) {
            c3581l = null;
        }
        C3578I c3578iM21849b = this.f500b.m21849b();
        boolean z12 = false;
        if (c3578iM21849b == null) {
            jM9365b = C3581L.f10906b;
        } else if (c3581l == null && c1826r.equals(C1828s.f5267e)) {
            jM9365b = AbstractC8676n.m9365b(i10, i11);
        } else {
            C1829s0 c1829s0M2607B = AbstractC1807h0.m2607B(c3578iM21849b, i10, i11, this.f518t, c3581l != null ? c3581l.f10908a : C3581L.f10906b, c3581l == null, z6);
            if (c3581l == null || c1829s0M2607B.mo2578f(this.f517s)) {
                C1824q c1824qM2654a = c1826r.m2654a(c1829s0M2607B);
                long jM9365b2 = AbstractC8676n.m9365b(c1824qM2654a.f5257a.f5254b, c1824qM2654a.f5258b.f5254b);
                this.f517s = c1829s0M2607B;
                this.f518t = z6 ? i10 : i11;
                jM9365b = jM9365b2;
            } else {
                jM9365b = c3581l.f10908a;
            }
        }
        long j11 = c21353b.f67818Z;
        if (C3581L.m4266b(jM9365b, j11)) {
            return jM9365b;
        }
        if (C3581L.m4271g(jM9365b) != C3581L.m4271g(j11) && C3581L.m4266b(AbstractC8676n.m9365b((int) (4294967295L & jM9365b), (int) (jM9365b >> 32)), j11)) {
            z12 = true;
        }
        if (((Boolean) this.f509k.getValue()).booleanValue() && !z12 && (interfaceC18285a = this.f506h) != null) {
            ((C18286b) interfaceC18285a).m19828a(9);
        }
        return jM9365b;
    }
}
