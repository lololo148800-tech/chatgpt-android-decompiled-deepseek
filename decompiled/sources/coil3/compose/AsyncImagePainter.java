package coil3.compose;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p008A6.C0383c;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.InterfaceC0571F;
import p033B5.AbstractC0833q;
import p049Bm.InterfaceC1436k;
import p059C5.C1587e;
import p059C5.C1588f;
import p059C5.C1593k;
import p059C5.C1596n;
import p059C5.InterfaceC1589g;
import p077Cn.EnumC1733a;
import p085D5.AbstractC1956c;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1095x1.C21089j;
import p1095x1.InterfaceC21090k;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC6034v0;
import p374P5.AbstractC6356i;
import p374P5.C6351d;
import p374P5.C6353f;
import p374P5.C6354g;
import p374P5.InterfaceC6357j;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;
import p397Q5.InterfaceC6580i;
import p471T5.C7257a;
import p658b5.C11234e;
import p759g1.C13803e;
import p774h1.C14356l;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;
import p972qm.C18777j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18067d2 = {"Lcoil3/compose/AsyncImagePainter;", "Lm1/a;", "LO0/v0;", "C5/e", "C5/g", "coil-compose-core_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AsyncImagePainter extends AbstractC17140a implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: G0 */
    public static final C0383c f35900G0 = new C0383c(5);

    /* JADX INFO: renamed from: A0 */
    public InterfaceC21090k f35901A0;

    /* JADX INFO: renamed from: B0 */
    public int f35902B0;

    /* JADX INFO: renamed from: C0 */
    public C1596n f35903C0;

    /* JADX INFO: renamed from: D0 */
    public final C2153Q0 f35904D0;

    /* JADX INFO: renamed from: E0 */
    public final C2153Q0 f35905E0;

    /* JADX INFO: renamed from: F0 */
    public final C2217y0 f35906F0;

    /* JADX INFO: renamed from: r0 */
    public final C2127D0 f35907r0;

    /* JADX INFO: renamed from: s0 */
    public final C2127D0 f35908s0;

    /* JADX INFO: renamed from: t0 */
    public final C6002f0 f35909t0;

    /* JADX INFO: renamed from: u0 */
    public final C5994b0 f35910u0;

    /* JADX INFO: renamed from: v0 */
    public final C6002f0 f35911v0;

    /* JADX INFO: renamed from: w0 */
    public C0564B0 f35912w0;

    /* JADX INFO: renamed from: x0 */
    public InterfaceC0571F f35913x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC1436k f35914y0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC1436k f35915z0;

    public AsyncImagePainter(C1587e c1587e) {
        EnumC1733a enumC1733a = EnumC1733a.f4962Z;
        this.f35907r0 = AbstractC2124C.m3203b(1, 0, enumC1733a, 2);
        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(1, 0, enumC1733a, 2);
        c2127d0M3203b.mo3231f(C17296C.f55119a);
        this.f35908s0 = c2127d0M3203b;
        C5975S c5975s = C5975S.f19448r0;
        this.f35909t0 = C5997d.m6430Q(null, c5975s);
        this.f35910u0 = C5997d.m6428O(1.0f);
        this.f35911v0 = C5997d.m6430Q(null, c5975s);
        this.f35914y0 = f35900G0;
        this.f35901A0 = C21089j.f67012o0;
        this.f35902B0 = 1;
        this.f35904D0 = AbstractC2124C.m3204c(c1587e);
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C1588f.f4457a);
        this.f35905E0 = c2153q0M3204c;
        this.f35906F0 = new C2217y0(c2153q0M3204c);
    }

    /* JADX INFO: renamed from: j */
    public static final C6354g m13134j(AsyncImagePainter asyncImagePainter, C6354g c6354g, boolean z6) {
        asyncImagePainter.getClass();
        C6351d c6351dM6973a = C6354g.m6973a(c6354g);
        c6351dM6973a.f20624d = new C11234e(c6354g, 4, asyncImagePainter);
        C6353f c6353f = c6354g.f20680t;
        if (c6353f.f20658g == null) {
            c6351dM6973a.f20633m = InterfaceC6580i.f21267f0;
        }
        if (c6353f.f20659h == null) {
            InterfaceC21090k interfaceC21090k = asyncImagePainter.f35901A0;
            AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
            c6351dM6973a.f20634n = (AbstractC16544l.m18089b(interfaceC21090k, C21089j.f67012o0) || AbstractC16544l.m18089b(interfaceC21090k, C21089j.f67013p0)) ? EnumC6578g.f21262Z : EnumC6578g.f21261Y;
        }
        if (c6353f.f20660i == null) {
            c6351dM6973a.f20635o = EnumC6575d.f21259Z;
        }
        if (z6) {
            C18777j c18777j = C18777j.f59682Y;
            c6351dM6973a.f20627g = c18777j;
            c6351dM6973a.f20628h = c18777j;
            c6351dM6973a.f20629i = c18777j;
        }
        return c6351dM6973a.m6972a();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0048, please report this as an issue */
    /* JADX INFO: renamed from: k */
    public static final void m13135k(AsyncImagePainter asyncImagePainter, InterfaceC1589g interfaceC1589g) {
        InterfaceC6357j interfaceC6357j;
        InterfaceC1436k interfaceC1436k;
        Object painter;
        InterfaceC6034v0 interfaceC6034v0;
        InterfaceC6034v0 interfaceC6034v1;
        C2153Q0 c2153q0 = asyncImagePainter.f35905E0;
        InterfaceC1589g interfaceC1589g2 = (InterfaceC1589g) c2153q0.getValue();
        InterfaceC1589g interfaceC1589g3 = (InterfaceC1589g) asyncImagePainter.f35914y0.invoke(interfaceC1589g);
        c2153q0.setValue(interfaceC1589g3);
        if (!(interfaceC1589g3 instanceof AsyncImagePainter$State$Success)) {
            if (interfaceC1589g3 instanceof AsyncImagePainter$State$Error) {
                interfaceC6357j = ((AsyncImagePainter$State$Error) interfaceC1589g3).f35916a;
            }
            asyncImagePainter.f35909t0.setValue(interfaceC1589g3.getPainter());
            if (interfaceC1589g2.getPainter() != interfaceC1589g3.getPainter()) {
                painter = interfaceC1589g2.getPainter();
                if (painter instanceof InterfaceC6034v0) {
                    interfaceC6034v0 = (InterfaceC6034v0) painter;
                } else {
                    interfaceC6034v0 = null;
                }
                if (interfaceC6034v0 != null) {
                    interfaceC6034v0.mo2150c();
                }
                Object painter2 = interfaceC1589g3.getPainter();
                interfaceC6034v1 = painter2 instanceof InterfaceC6034v0 ? (InterfaceC6034v0) painter2 : null;
                if (interfaceC6034v1 != null) {
                    interfaceC6034v1.mo2151d();
                }
            }
            interfaceC1436k = asyncImagePainter.f35915z0;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(interfaceC1589g3);
            }
        }
        interfaceC6357j = ((AsyncImagePainter$State$Success) interfaceC1589g3).f35917a;
        ((C7257a) AbstractC0833q.m1891d(interfaceC6357j.getRequest(), AbstractC6356i.f20685b)).getClass();
        asyncImagePainter.f35909t0.setValue(interfaceC1589g3.getPainter());
        if (interfaceC1589g2.getPainter() != interfaceC1589g3.getPainter()) {
            painter = interfaceC1589g2.getPainter();
            if (painter instanceof InterfaceC6034v0) {
                interfaceC6034v0 = (InterfaceC6034v0) painter;
            } else {
                interfaceC6034v0 = null;
            }
            if (interfaceC6034v0 != null) {
                interfaceC6034v0.mo2150c();
            }
            Object painter3 = interfaceC1589g3.getPainter();
            if (painter3 instanceof InterfaceC6034v0) {
            }
            if (interfaceC6034v1 != null) {
                interfaceC6034v1.mo2151d();
            }
        }
        interfaceC1436k = asyncImagePainter.f35915z0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(interfaceC1589g3);
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        C0564B0 c0564b0 = this.f35912w0;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        this.f35912w0 = null;
        Object obj = (AbstractC17140a) this.f35909t0.getValue();
        InterfaceC6034v0 interfaceC6034v0 = obj instanceof InterfaceC6034v0 ? (InterfaceC6034v0) obj : null;
        if (interfaceC6034v0 != null) {
            interfaceC6034v0.mo2149a();
        }
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        this.f35910u0.m6410h(f10);
        return true;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        C0564B0 c0564b0 = this.f35912w0;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        this.f35912w0 = null;
        Object obj = (AbstractC17140a) this.f35909t0.getValue();
        InterfaceC6034v0 interfaceC6034v0 = obj instanceof InterfaceC6034v0 ? (InterfaceC6034v0) obj : null;
        if (interfaceC6034v0 != null) {
            interfaceC6034v0.mo2150c();
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (AbstractC17140a) this.f35909t0.getValue();
            InterfaceC6034v0 interfaceC6034v0 = obj instanceof InterfaceC6034v0 ? (InterfaceC6034v0) obj : null;
            if (interfaceC6034v0 != null) {
                interfaceC6034v0.mo2151d();
            }
            InterfaceC0571F interfaceC0571F = this.f35913x0;
            if (interfaceC0571F == null) {
                AbstractC16544l.m18103p("scope");
                throw null;
            }
            C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(interfaceC0571F, null, null, new C1593k(this, null), 3);
            C0564B0 c0564b0 = this.f35912w0;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
            this.f35912w0 = c0564b0M1156D;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        this.f35911v0.setValue(c14356l);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        AbstractC17140a abstractC17140a = (AbstractC17140a) this.f35909t0.getValue();
        if (abstractC17140a != null) {
            return abstractC17140a.getF38830r0();
        }
        return 9205357640488583168L;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        this.f35907r0.mo3231f(new C13803e(interfaceC16039d.mo17602i()));
        AbstractC17140a abstractC17140a = (AbstractC17140a) this.f35909t0.getValue();
        if (abstractC17140a != null) {
            abstractC17140a.m18904g(interfaceC16039d, interfaceC16039d.mo17602i(), this.f35910u0.m6409g(), (C14356l) this.f35911v0.getValue());
        }
    }
}
