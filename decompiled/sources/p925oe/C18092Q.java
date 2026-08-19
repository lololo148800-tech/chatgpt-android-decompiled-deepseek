package p925oe;

import gd.C13967n0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import me.C17238a;
import ni.C17634h;
import p092Dc.C1991h;
import p098Di.InterfaceC2061j;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2207t0;
import p103Dn.C2217y0;
import p1040ue.InterfaceC20204b;
import p1040ue.InterfaceC20207e;
import ye.EnumC21517f;

/* JADX INFO: renamed from: oe.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C18092Q implements InterfaceC20207e {

    /* JADX INFO: renamed from: a */
    public final C2153Q0 f57722a;

    /* JADX INFO: renamed from: b */
    public final C2217y0 f57723b;

    public C18092Q(C17634h c17634h, C17238a c17238a, C1991h c1991h, InterfaceC13849E interfaceC13849E) {
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(EnumC21517f.f68138Z);
        this.f57722a = c2153q0M3204c;
        C2217y0 c2217y0 = new C2217y0(c2153q0M3204c);
        this.f57723b = c2217y0;
        if (((C14005w2) interfaceC13849E).m15481a(C13967n0.f44023c)) {
            return;
        }
        AbstractC2124C.m3226y(new C2207t0(c2217y0, c17238a, c1991h, 4), c17634h);
    }

    @Override // p1040ue.InterfaceC20207e
    /* JADX INFO: renamed from: a */
    public final InterfaceC2061j mo4411a(InterfaceC20204b action) {
        AbstractC16544l.m18094g(action, "action");
        if (!action.equals(C18090O.f57718a)) {
            return null;
        }
        m19711b(EnumC21517f.f68138Z);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m19711b(EnumC21517f state) {
        C2153Q0 c2153q0;
        Object value;
        AbstractC16544l.m18094g(state, "state");
        do {
            c2153q0 = this.f57722a;
            value = c2153q0.getValue();
        } while (!c2153q0.m3250k(value, state));
    }
}
