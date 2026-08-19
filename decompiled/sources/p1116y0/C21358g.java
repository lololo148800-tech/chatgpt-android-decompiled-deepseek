package p1116y0;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p029B0.C0715b;
import p049Bm.InterfaceC1436k;
import p1036u9.C20168n;
import p1068vo.C20659i;
import p1113xn.AbstractC21329w;
import p1139z0.C21577C;
import p1139z0.C21585H;
import p1139z0.C21593P;
import p1139z0.C21619i;
import p204I1.C3581L;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p392Q0.C6546d;
import p544W9.AbstractC8676n;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p784hb.C14438g;

/* JADX INFO: renamed from: y0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21358g {

    /* JADX INFO: renamed from: a */
    public final C21585H f67826a;

    /* JADX INFO: renamed from: b */
    public C21577C f67827b;

    /* JADX INFO: renamed from: c */
    public final C6002f0 f67828c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f67829d;

    /* JADX INFO: renamed from: e */
    public final C14438g f67830e;

    /* JADX INFO: renamed from: f */
    public final C6546d f67831f;

    public C21358g(String str, long j10, C21585H c21585h) {
        this.f67826a = c21585h;
        this.f67827b = new C21577C(AbstractC8676n.m9366c(str.length(), j10), str);
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f67828c = C5997d.m6430Q(bool, c5975s);
        this.f67829d = C5997d.m6430Q(new C21353b(str, j10, (C3581L) null, 12), c5975s);
        this.f67830e = new C14438g(this);
        this.f67831f = new C6546d(new C21619i[16]);
    }

    /* JADX INFO: renamed from: a */
    public static final void m21749a(C21358g c21358g, boolean z6, int i10) {
        C21353b c21353bM21750b = c21358g.m21750b();
        C21577C c21577c = c21358g.f67827b;
        if (((C6546d) c21577c.f68325b.f63875Z).f21184o0 == 0 && C3581L.m4266b(c21353bM21750b.f67818Z, c21577c.m21857e())) {
            if (AbstractC16544l.m18089b(c21353bM21750b.f67819o0, c21358g.f67827b.m21856d())) {
                if (AbstractC16544l.m18089b(c21353bM21750b.f67820p0, c21358g.f67827b.f68328e)) {
                    return;
                }
            }
            c21358g.m21753e(c21358g.m21750b(), new C21353b(c21358g.f67827b.f68324a.toString(), c21358g.f67827b.m21857e(), c21358g.f67827b.m21856d(), c21358g.f67827b.f68328e), z6);
            return;
        }
        C21353b c21353b = new C21353b(c21358g.f67827b.f68324a.toString(), c21358g.f67827b.m21857e(), c21358g.f67827b.m21856d(), c21358g.f67827b.f68328e);
        c21358g.m21753e(c21353bM21750b, c21353b, z6);
        C20168n c20168n = c21358g.f67827b.f68325b;
        int iM24h = AbstractC0010F.m24h(i10);
        C21585H c21585h = c21358g.f67826a;
        if (iM24h == 0) {
            AbstractC21360i.m21754c(c21585h, c21353bM21750b, c21353b, c20168n, true);
            return;
        }
        if (iM24h != 1) {
            if (iM24h != 2) {
                return;
            }
            AbstractC21360i.m21754c(c21585h, c21353bM21750b, c21353b, c20168n, false);
        } else {
            ((C6002f0) c21585h.f68345o0).setValue(null);
            C0715b c0715b = (C0715b) c21585h.f68344Z;
            c0715b.f2070b.clear();
            c0715b.f2071c.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C21353b m21750b() {
        return (C21353b) this.f67829d.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m21751c(boolean z6) {
        this.f67828c.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: renamed from: d */
    public final void m21752d(C21352a c21352a, boolean z6, boolean z10) {
        String string = this.f67827b.f68324a.toString();
        C21353b c21353b = new C21353b(string, this.f67827b.m21857e(), this.f67827b.m21856d(), 8);
        boolean zM18089b = AbstractC16544l.m18089b(null, this.f67827b.m21856d());
        C21593P c21593p = c21352a.f67814Z;
        if (z6) {
            this.f67827b = new C21577C(c21352a.f67816p0, c21593p.toString());
        } else if (z10) {
            C21577C c21577c = this.f67827b;
            long j10 = c21352a.f67816p0;
            int i10 = C3581L.f10907c;
            c21577c.m21860h((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        this.f67827b.m21854b();
        if (z6 || (!z10 && !zM18089b)) {
            this.f67827b.m21854b();
        }
        if (z6) {
            string = c21593p.toString();
        }
        m21753e(c21353b, new C21353b(string, this.f67827b.m21857e(), this.f67827b.m21856d(), 8), true);
    }

    /* JADX INFO: renamed from: e */
    public final void m21753e(C21353b c21353b, C21353b c21353b2, boolean z6) {
        this.f67829d.setValue(c21353b2);
        int i10 = 0;
        m21751c(false);
        C6546d c6546d = this.f67831f;
        int i11 = c6546d.f21184o0;
        if (i11 > 0) {
            Object[] objArr = c6546d.f21182Y;
            do {
                C21619i c21619i = (C21619i) objArr[i10];
                c21619i.getClass();
                long j10 = c21353b.f67818Z;
                C20659i c20659i = c21619i.f68489a;
                C3581L c3581l = c21353b.f67819o0;
                if (!z6 || c3581l == null || AbstractC21329w.m21722i(c21353b.f67817Y, c21353b2)) {
                    long j11 = c21353b2.f67818Z;
                    boolean zM4266b = C3581L.m4266b(j10, j11);
                    C3581L c3581l2 = c21353b2.f67819o0;
                    if (!zM4266b || !AbstractC16544l.m18089b(c3581l, c3581l2)) {
                        c20659i.m21208b().updateSelection((View) c20659i.f65541a, C3581L.m4270f(j11), C3581L.m4269e(j11), c3581l2 != null ? C3581L.m4270f(c3581l2.f10908a) : -1, c3581l2 != null ? C3581L.m4269e(c3581l2.f10908a) : -1);
                    }
                } else {
                    c20659i.m21208b().restartInput((View) c20659i.f65541a);
                }
                i10++;
            } while (i10 < i11);
        }
    }

    public final String toString() {
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            return "TextFieldState(selection=" + ((Object) C3581L.m4272h(m21750b().f67818Z)) + ", text=\"" + ((Object) m21750b().f67817Y) + "\")";
        } finally {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
        }
    }
}
