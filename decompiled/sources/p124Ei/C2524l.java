package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p1071w0.AbstractC20740b0;
import p1071w0.C20701C;
import p1071w0.C20750g0;
import p1071w0.EnumC20730T;
import p1095x1.InterfaceC21098s;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p148Fi.C2825h0;
import p168Gd.C3034b;
import p193Hf.AbstractC3319M;
import p273Kl.C4727J0;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p350O1.C6045C;
import p350O1.InterfaceC6073v;
import p387Pl.C6501u;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7933L4;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ei.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C2524l extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7834Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f7835Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f7836o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f7837p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7838q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f7839r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f7840s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f7841t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f7842u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f7843v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2524l(Object obj, Object obj2, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        super(2);
        this.f7834Y = i11;
        this.f7840s0 = obj;
        this.f7841t0 = obj2;
        this.f7835Z = z6;
        this.f7836o0 = z10;
        this.f7837p0 = interfaceC1436k;
        this.f7842u0 = obj3;
        this.f7838q0 = obj4;
        this.f7843v0 = obj5;
        this.f7839r0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        boolean z6;
        switch (this.f7834Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f7839r0 | 1);
                AbstractC7933L4.m8223a((C4727J0) this.f7840s0, (C6501u) this.f7841t0, this.f7835Z, this.f7836o0, this.f7837p0, (InterfaceC1436k) this.f7842u0, (InterfaceC10459q) this.f7838q0, (C2825h0) this.f7843v0, (C6021p) obj, iM6447d0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f7839r0 | 1);
                AbstractC3319M.m4165a((String) this.f7840s0, (String) this.f7841t0, (C3034b) this.f7842u0, this.f7835Z, (String) this.f7843v0, this.f7836o0, this.f7837p0, (InterfaceC10459q) this.f7838q0, (C6021p) obj, iM6447d1);
                break;
            default:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC6073v interfaceC6073v = (InterfaceC6073v) this.f7838q0;
                    C20750g0 c20750g0 = (C20750g0) this.f7841t0;
                    C20701C c20701c = new C20701C(c20750g0, this.f7837p0, (C6045C) this.f7842u0, interfaceC6073v, (InterfaceC7537b) this.f7843v0, this.f7839r0);
                    C10456n c10456n = C10456n.f30959Y;
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c20701c);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6553p(true);
                    EnumC20730T enumC20730TM21291a = c20750g0.m21291a();
                    EnumC20730T enumC20730T = EnumC20730T.f65728Y;
                    boolean z10 = this.f7835Z;
                    if (enumC20730TM21291a != enumC20730T && c20750g0.m21293c() != null) {
                        InterfaceC21098s interfaceC21098sM21293c = c20750g0.m21293c();
                        AbstractC16544l.m18091d(interfaceC21098sM21293c);
                        z6 = interfaceC21098sM21293c.mo21522h() && z10;
                    }
                    C1837w0 c1837w0 = (C1837w0) this.f7840s0;
                    AbstractC20740b0.m21269j(c1837w0, z6, c6021p, 0);
                    if (c20750g0.m21291a() == EnumC20730T.f65730o0 && !this.f7836o0 && z10) {
                        c6021p.m6524S(-2032274);
                        AbstractC20740b0.m21268i(c1837w0, c6021p, 0);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-1955394);
                        c6021p.m6553p(false);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2524l(String str, String str2, C3034b c3034b, boolean z6, String str3, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f7834Y = 1;
        this.f7840s0 = str;
        this.f7841t0 = str2;
        this.f7842u0 = c3034b;
        this.f7835Z = z6;
        this.f7843v0 = str3;
        this.f7836o0 = z10;
        this.f7837p0 = interfaceC1436k;
        this.f7838q0 = interfaceC10459q;
        this.f7839r0 = i10;
    }
}
