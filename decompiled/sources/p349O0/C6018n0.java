package p349O0;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p692d0.C12948A;
import p692d0.C12951D;

/* JADX INFO: renamed from: O0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6018n0 {

    /* JADX INFO: renamed from: a */
    public int f19533a;

    /* JADX INFO: renamed from: b */
    public C6029t f19534b;

    /* JADX INFO: renamed from: c */
    public C5995c f19535c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1439n f19536d;

    /* JADX INFO: renamed from: e */
    public int f19537e;

    /* JADX INFO: renamed from: f */
    public C12948A f19538f;

    /* JADX INFO: renamed from: g */
    public C12951D f19539g;

    public C6018n0(C6029t c6029t) {
        this.f19534b = c6029t;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6499a(C5944C c5944c, C12951D c12951d) {
        AbstractC16544l.m18092e(c5944c, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        InterfaceC5959J0 interfaceC5959J0 = c5944c.f19357o0;
        if (interfaceC5959J0 == null) {
            interfaceC5959J0 = C5975S.f19448r0;
        }
        return !interfaceC5959J0.mo6393a(c5944c.m6347h().f19344f, c12951d.m14619e(c5944c));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6500b() {
        if (this.f19534b == null) {
            return false;
        }
        C5995c c5995c = this.f19535c;
        return c5995c != null ? c5995c.m6411a() : false;
    }

    /* JADX INFO: renamed from: c */
    public final int m6501c(Object obj) {
        int iM6578o;
        C6029t c6029t = this.f19534b;
        if (c6029t == null || (iM6578o = c6029t.m6578o(this, obj)) == 0) {
            return 1;
        }
        return iM6578o;
    }

    /* JADX INFO: renamed from: d */
    public final void m6502d() {
        C6029t c6029t = this.f19534b;
        if (c6029t != null) {
            c6029t.f19612A0 = true;
        }
        this.f19534b = null;
        this.f19538f = null;
        this.f19539g = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m6503e(boolean z6) {
        if (z6) {
            this.f19533a |= 32;
        } else {
            this.f19533a &= -33;
        }
    }
}
