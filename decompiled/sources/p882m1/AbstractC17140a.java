package p882m1;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8112i6;
import p604Yk.C10077b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.InterfaceC14362r;
import p821j1.InterfaceC16039d;
import p985r9.C18903m;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17140a {

    /* JADX INFO: renamed from: Y */
    public C18903m f54803Y;

    /* JADX INFO: renamed from: Z */
    public boolean f54804Z;

    /* JADX INFO: renamed from: o0 */
    public C14356l f54805o0;

    /* JADX INFO: renamed from: p0 */
    public float f54806p0 = 1.0f;

    /* JADX INFO: renamed from: q0 */
    public EnumC7546k f54807q0 = EnumC7546k.f23904Y;

    /* JADX INFO: renamed from: b */
    public boolean mo11307b(float f10) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo11308e(C14356l c14356l) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m18904g(InterfaceC16039d interfaceC16039d, long j10, float f10, C14356l c14356l) {
        if (this.f54806p0 != f10) {
            if (!mo11307b(f10)) {
                if (f10 == 1.0f) {
                    C18903m c18903m = this.f54803Y;
                    if (c18903m != null) {
                        c18903m.m20220d(f10);
                    }
                    this.f54804Z = false;
                } else {
                    C18903m c18903mM15630h = this.f54803Y;
                    if (c18903mM15630h == null) {
                        c18903mM15630h = AbstractC14334L.m15630h();
                        this.f54803Y = c18903mM15630h;
                    }
                    c18903mM15630h.m20220d(f10);
                    this.f54804Z = true;
                }
            }
            this.f54806p0 = f10;
        }
        if (!AbstractC16544l.m18089b(this.f54805o0, c14356l)) {
            if (!mo11308e(c14356l)) {
                if (c14356l == null) {
                    C18903m c18903m2 = this.f54803Y;
                    if (c18903m2 != null) {
                        c18903m2.m20223g(null);
                    }
                    this.f54804Z = false;
                } else {
                    C18903m c18903mM15630h2 = this.f54803Y;
                    if (c18903mM15630h2 == null) {
                        c18903mM15630h2 = AbstractC14334L.m15630h();
                        this.f54803Y = c18903mM15630h2;
                    }
                    c18903mM15630h2.m20223g(c14356l);
                    this.f54804Z = true;
                }
            }
            this.f54805o0 = c14356l;
        }
        EnumC7546k layoutDirection = interfaceC16039d.getLayoutDirection();
        if (this.f54807q0 != layoutDirection) {
            mo13177f(layoutDirection);
            this.f54807q0 = layoutDirection;
        }
        float fM15333e = C13803e.m15333e(interfaceC16039d.mo17602i()) - C13803e.m15333e(j10);
        float fM15331c = C13803e.m15331c(interfaceC16039d.mo17602i()) - C13803e.m15331c(j10);
        ((C10077b) interfaceC16039d.mo17601f0().f43259Z).m10659E(0.0f, 0.0f, fM15333e, fM15331c);
        if (f10 > 0.0f) {
            try {
                if (C13803e.m15333e(j10) > 0.0f && C13803e.m15331c(j10) > 0.0f) {
                    if (this.f54804Z) {
                        C13801c c13801cM8568b = AbstractC8096g6.m8568b(0L, AbstractC8112i6.m8603a(C13803e.m15333e(j10), C13803e.m15331c(j10)));
                        InterfaceC14362r interfaceC14362rM15196m = interfaceC16039d.mo17601f0().m15196m();
                        C18903m c18903mM15630h3 = this.f54803Y;
                        if (c18903mM15630h3 == null) {
                            c18903mM15630h3 = AbstractC14334L.m15630h();
                            this.f54803Y = c18903mM15630h3;
                        }
                        try {
                            interfaceC14362rM15196m.mo15714m(c13801cM8568b, c18903mM15630h3);
                            mo11310i(interfaceC16039d);
                            interfaceC14362rM15196m.mo15719r();
                        } catch (Throwable th2) {
                            interfaceC14362rM15196m.mo15719r();
                            throw th2;
                        }
                    } else {
                        mo11310i(interfaceC16039d);
                    }
                }
            } catch (Throwable th3) {
                ((C10077b) interfaceC16039d.mo17601f0().f43259Z).m10659E(-0.0f, -0.0f, -fM15333e, -fM15331c);
                throw th3;
            }
        }
        ((C10077b) interfaceC16039d.mo17601f0().f43259Z).m10659E(-0.0f, -0.0f, -fM15333e, -fM15331c);
    }

    /* JADX INFO: renamed from: h */
    public abstract long mo11309h();

    /* JADX INFO: renamed from: i */
    public abstract void mo11310i(InterfaceC16039d interfaceC16039d);

    /* JADX INFO: renamed from: f */
    public void mo13177f(EnumC7546k enumC7546k) {
    }
}
