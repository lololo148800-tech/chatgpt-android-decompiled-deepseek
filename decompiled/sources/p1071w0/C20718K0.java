package p1071w0;

import androidx.compose.foundation.AbstractC10833a;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.List;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0309z1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19736m;
import p1014t1.InterfaceC19734k;
import p156G1.AbstractC2965l;
import p204I1.AbstractC3597m;
import p204I1.C3573D;
import p204I1.C3578I;
import p204I1.C3579J;
import p204I1.C3587c;
import p204I1.C3588d;
import p204I1.C3590f;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p414R.C6769c;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8088f6;
import p586Y0.C9566r;
import p588Y2.C9642z;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13801c;
import p774h1.C14353i;
import p860l0.C16663C;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17780r;
import td.C19843f;
import tf.C19941z;

/* JADX INFO: renamed from: w0.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20718K0 {

    /* JADX INFO: renamed from: a */
    public final C3590f f65690a;

    /* JADX INFO: renamed from: b */
    public final C6002f0 f65691b = C5997d.m6430Q(null, C5975S.f19448r0);

    /* JADX INFO: renamed from: c */
    public C3590f f65692c;

    /* JADX INFO: renamed from: d */
    public final C9566r f65693d;

    public C20718K0(C3590f c3590f) {
        C3573D c3573d;
        this.f65690a = c3590f;
        C3587c c3587c = new C3587c(c3590f);
        List listM4298a = c3590f.m4298a(c3590f.f10934Y.length());
        int size = listM4298a.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3588d c3588d = (C3588d) listM4298a.get(i10);
            C3579J c3579jMo4306b = ((AbstractC3597m) c3588d.f10930a).mo4306b();
            if (c3579jMo4306b != null && (c3573d = c3579jMo4306b.f10898a) != null) {
                c3587c.m4289a(c3573d, c3588d.f10931b, c3588d.f10932c);
            }
        }
        this.f65692c = c3587c.m4297i();
        this.f65693d = new C9566r();
    }

    /* JADX INFO: renamed from: a */
    public final void m21220a(int i10, C6021p c6021p) {
        int i11;
        char c9;
        char c10;
        C14353i c14353iM4262l;
        boolean z6;
        InterfaceC10459q interfaceC10459qM8501a;
        C3578I c3578i;
        char c11 = 3;
        c6021p.m6526U(1154651354);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object obj = (InterfaceC0309z1) c6021p.m6548k(AbstractC0187M0.f714p);
            C3590f c3590f = this.f65692c;
            List listM4298a = c3590f.m4298a(c3590f.f10934Y.length());
            int size = listM4298a.size();
            int i13 = 0;
            while (i13 < size) {
                C3588d c3588d = (C3588d) listM4298a.get(i13);
                int i14 = c3588d.f10931b;
                int i15 = c3588d.f10932c;
                if (i14 != i15) {
                    c6021p.m6524S(1383677450);
                    boolean zBooleanValue = ((Boolean) new C20779v(this, i12).invoke()).booleanValue();
                    int i16 = c3588d.f10931b;
                    if (zBooleanValue && (c3578i = (C3578I) this.f65691b.getValue()) != null) {
                        c14353iM4262l = c3578i.m4262l(i16, i15);
                        C13801c c13801cM4252b = c3578i.m4252b(i16);
                        c14353iM4262l.m15735g(AbstractC8088f6.m8536b(c3578i.m4257g(i16) == c3578i.m4257g(i15) ? Math.min(c3578i.m4252b(i15 - 1).f43586a, c13801cM4252b.f43586a) : 0.0f, c13801cM4252b.f43587b) ^ (-9223372034707292160L));
                    } else {
                        c14353iM4262l = null;
                    }
                    C9642z c9642z = c14353iM4262l != null ? new C9642z(c14353iM4262l, 24) : null;
                    InterfaceC10459q interfaceC10459q = C10456n.f30959Y;
                    if (c9642z != null && (interfaceC10459qM8501a = AbstractC8079e5.m8501a(interfaceC10459q, c9642z)) != null) {
                        interfaceC10459q = interfaceC10459qM8501a;
                    }
                    Object objM6514H = c6021p.m6514H();
                    Object obj2 = C6013l.f19514a;
                    if (objM6514H == obj2) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
                    InterfaceC10459q interfaceC10459qM11212g = AbstractC10833a.m11212g(interfaceC10459q.mo428M(new C20722M0(new C6769c(this, i16, i15))), interfaceC17406l);
                    InterfaceC19734k.f62473a.getClass();
                    InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(AbstractC19736m.m20686h(interfaceC10459qM11212g, AbstractC19736m.f62475b), false, C20745e.f65757B0);
                    boolean zM6545h = c6021p.m6545h(this) | c6021p.m6542f(c3588d) | c6021p.m6545h(obj);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6545h || objM6514H2 == obj2) {
                        objM6514H2 = new C15272c(this, c3588d, obj, 27);
                        c6021p.m6537c0(objM6514H2);
                    }
                    AbstractC17780r.m19507a(AbstractC10833a.m11210e(interfaceC10459qM3789a, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H2, 252), c6021p, 0);
                    AbstractC3597m abstractC3597m = (AbstractC3597m) c3588d.f10930a;
                    C3579J c3579jMo4306b = abstractC3597m.mo4306b();
                    if (c3579jMo4306b == null || (c3579jMo4306b.f10898a == null && c3579jMo4306b.f10899b == null && c3579jMo4306b.f10900c == null && c3579jMo4306b.f10901d == null)) {
                        obj = obj;
                        listM4298a = listM4298a;
                        size = size;
                        c9 = 3;
                        c10 = 6;
                        z6 = false;
                        c6021p.m6524S(1386435086);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1384566902);
                        Object objM6514H3 = c6021p.m6514H();
                        if (objM6514H3 == obj2) {
                            objM6514H3 = new C20752h0();
                            c6021p.m6537c0(objM6514H3);
                        }
                        C20752h0 c20752h0 = (C20752h0) objM6514H3;
                        Object objM6514H4 = c6021p.m6514H();
                        if (objM6514H4 == obj2) {
                            objM6514H4 = new C20712H0(c20752h0, interfaceC17406l, null);
                            c6021p.m6537c0(objM6514H4);
                        }
                        C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, interfaceC17406l);
                        Boolean boolValueOf = Boolean.valueOf((c20752h0.f65850a.m6412g() & 2) != 0);
                        C5996c0 c5996c0 = c20752h0.f65850a;
                        Boolean boolValueOf2 = Boolean.valueOf((c5996c0.m6412g() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((c5996c0.m6412g() & 4) != 0);
                        C3579J c3579jMo4306b2 = abstractC3597m.mo4306b();
                        C3573D c3573d = c3579jMo4306b2 != null ? c3579jMo4306b2.f10898a : null;
                        C3579J c3579jMo4306b3 = abstractC3597m.mo4306b();
                        C3573D c3573d2 = c3579jMo4306b3 != null ? c3579jMo4306b3.f10899b : null;
                        C3579J c3579jMo4306b4 = abstractC3597m.mo4306b();
                        C3573D c3573d3 = c3579jMo4306b4 != null ? c3579jMo4306b4.f10900c : null;
                        C3579J c3579jMo4306b5 = abstractC3597m.mo4306b();
                        c9 = 3;
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c3573d, c3573d2, c3573d3, c3579jMo4306b5 != null ? c3579jMo4306b5.f10901d : null};
                        boolean zM6545h2 = c6021p.m6545h(this) | c6021p.m6542f(c3588d);
                        Object objM6514H5 = c6021p.m6514H();
                        if (zM6545h2 || objM6514H5 == obj2) {
                            objM6514H5 = new C16663C(this, c3588d, c20752h0, 16);
                            c6021p.m6537c0(objM6514H5);
                        }
                        c10 = 6;
                        m21221b(objArr, (InterfaceC1436k) objM6514H5, c6021p, (i11 << 6) & 896);
                        z6 = false;
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(z6);
                } else {
                    c9 = c11;
                    obj = obj;
                    listM4298a = listM4298a;
                    size = size;
                    c10 = 6;
                    c6021p.m6524S(1386448974);
                    c6021p.m6553p(false);
                }
                i13++;
                size = size;
                obj = obj;
                listM4298a = listM4298a;
                i12 = 2;
                c11 = c9;
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19941z(this, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21221b(Object[] objArr, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        c6021p.m6526U(-2083052099);
        int i11 = (i10 & 48) == 0 ? (c6021p.m6545h(interfaceC1436k) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(this) ? 256 : 128;
        }
        c6021p.m6521P(-416686647, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= c6021p.m6545h(obj) ? 4 : 0;
        }
        c6021p.m6553p(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C9642z c9642z = new C9642z(2);
            c9642z.m10200L(interfaceC1436k);
            c9642z.m10201M(objArr);
            ArrayList arrayList = (ArrayList) c9642z.f29064Z;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM6545h = c6021p.m6545h(this) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C20777u(this, interfaceC1436k, 1);
                c6021p.m6537c0(objM6514H);
            }
            C5997d.m6448e(array, (InterfaceC1436k) objM6514H, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(this, objArr, interfaceC1436k, i10);
        }
    }
}
