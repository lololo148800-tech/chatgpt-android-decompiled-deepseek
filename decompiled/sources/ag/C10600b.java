package ag;

import ge.C14111x0;
import ge.EnumC14057V0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p293Lh.EnumC5070p;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8106i0;
import p635a1.InterfaceC10459q;
import p870le.AbstractC16868Z;
import p882m1.AbstractC17140a;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: ag.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10600b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31453Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f31454Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f31455o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17763i0 f31456p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f31457q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f31458r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f31459s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f31460t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f31461u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f31462v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ InterfaceC17302e f31463w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ Object f31464x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10600b(InterfaceC10459q interfaceC10459q, String str, InterfaceC17763i0 interfaceC17763i0, InterfaceC17763i0 interfaceC17763i1, EnumC5070p enumC5070p, InterfaceC1426a interfaceC1426a, AbstractC17140a abstractC17140a, InterfaceC1439n interfaceC1439n, InterfaceC1440o interfaceC1440o, int i10, int i11) {
        super(2);
        this.f31455o0 = interfaceC10459q;
        this.f31459s0 = str;
        this.f31456p0 = interfaceC17763i0;
        this.f31460t0 = interfaceC17763i1;
        this.f31461u0 = enumC5070p;
        this.f31454Z = interfaceC1426a;
        this.f31462v0 = abstractC17140a;
        this.f31463w0 = interfaceC1439n;
        this.f31464x0 = interfaceC1440o;
        this.f31457q0 = i10;
        this.f31458r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31453Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f31457q0 | 1);
                AbstractC17140a abstractC17140a = (AbstractC17140a) this.f31462v0;
                AbstractC8106i0.m8586a(this.f31455o0, (String) this.f31459s0, this.f31456p0, (InterfaceC17763i0) this.f31460t0, (EnumC5070p) this.f31461u0, this.f31454Z, abstractC17140a, (InterfaceC1439n) this.f31463w0, (InterfaceC1440o) this.f31464x0, (C6021p) obj, iM6447d0, this.f31458r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f31457q0 | 1);
                C14111x0 c14111x0 = (C14111x0) this.f31459s0;
                InterfaceC10459q interfaceC10459q = this.f31455o0;
                AbstractC16868Z.m18578a(c14111x0, this.f31454Z, (InterfaceC1436k) this.f31460t0, (InterfaceC1426a) this.f31461u0, (InterfaceC1426a) this.f31462v0, (InterfaceC1426a) this.f31463w0, interfaceC10459q, (EnumC14057V0) this.f31464x0, this.f31456p0, (C6021p) obj, iM6447d1, this.f31458r0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10600b(C14111x0 c14111x0, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, InterfaceC1426a interfaceC1426a4, InterfaceC10459q interfaceC10459q, EnumC14057V0 enumC14057V0, InterfaceC17763i0 interfaceC17763i0, int i10, int i11) {
        super(2);
        this.f31459s0 = c14111x0;
        this.f31454Z = interfaceC1426a;
        this.f31460t0 = interfaceC1436k;
        this.f31461u0 = interfaceC1426a2;
        this.f31462v0 = interfaceC1426a3;
        this.f31463w0 = interfaceC1426a4;
        this.f31455o0 = interfaceC10459q;
        this.f31464x0 = enumC14057V0;
        this.f31456p0 = interfaceC17763i0;
        this.f31457q0 = i10;
        this.f31458r0 = i11;
    }
}
