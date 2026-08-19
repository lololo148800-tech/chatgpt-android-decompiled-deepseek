package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;
import ni.C17634h;
import p049Bm.InterfaceC1436k;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2153Q0;
import p103Dn.C2207t0;
import p787he.C14459O;
import p972qm.InterfaceC18770c;
import ye.C21515d;

/* JADX INFO: renamed from: Hf.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C3332T {

    /* JADX INFO: renamed from: a */
    public final C2153Q0 f10182a = AbstractC2124C.m3204c(new C21515d());

    /* JADX INFO: renamed from: b */
    public final C2127D0 f10183b = AbstractC2124C.m3202a(1, 8, EnumC1733a.f4962Z);

    public C3332T(C17634h c17634h, C14459O c14459o) {
        AbstractC2124C.m3226y(new C2207t0(c14459o.f45521t, c14459o.f45526y, new C3327Q(this, (InterfaceC18770c) null, 0), 0), c17634h);
    }

    /* JADX INFO: renamed from: a */
    public final void m4168a() {
        C2153Q0 c2153q0;
        Object value;
        C21515d setState;
        do {
            c2153q0 = this.f10182a;
            value = c2153q0.getValue();
            setState = (C21515d) value;
            AbstractC16544l.m18094g(setState, "$this$setState");
        } while (!c2153q0.m3250k(value, C21515d.m21794a(setState, null, null, false, null, false, 27)));
    }

    /* JADX INFO: renamed from: b */
    public final void m4169b(InterfaceC1436k interfaceC1436k) {
        C2153Q0 c2153q0;
        Object value;
        do {
            c2153q0 = this.f10182a;
            value = c2153q0.getValue();
        } while (!c2153q0.m3250k(value, (C21515d) interfaceC1436k.invoke((C21515d) value)));
    }
}
