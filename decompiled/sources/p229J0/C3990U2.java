package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p225Im.AbstractC3751J;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.U2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3990U2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12519Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f12520Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f12521o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f12522p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f12523q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12524r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f12525s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f12526t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3990U2(String str, int i10, InterfaceC1426a interfaceC1426a, boolean z6, boolean z10, InterfaceC10459q interfaceC10459q, int i11) {
        super(2);
        this.f12525s0 = str;
        this.f12520Z = i10;
        this.f12526t0 = interfaceC1426a;
        this.f12521o0 = z6;
        this.f12522p0 = z10;
        this.f12523q0 = interfaceC10459q;
        this.f12524r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12519Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f12520Z | 1);
                boolean z6 = this.f12522p0;
                AbstractC3995V2.m4711a(this.f12521o0, this.f12523q0, z6, (C3985T2) this.f12525s0, (InterfaceC17406l) this.f12526t0, (C6021p) obj, iM6447d0, this.f12524r0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f12524r0 | 1);
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f12526t0;
                boolean z10 = this.f12521o0;
                AbstractC3751J.m4439d((String) this.f12525s0, this.f12520Z, interfaceC1426a, z10, this.f12522p0, this.f12523q0, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3990U2(boolean z6, InterfaceC10459q interfaceC10459q, boolean z10, C3985T2 c3985t2, InterfaceC17406l interfaceC17406l, int i10, int i11) {
        super(2);
        this.f12521o0 = z6;
        this.f12523q0 = interfaceC10459q;
        this.f12522p0 = z10;
        this.f12525s0 = c3985t2;
        this.f12526t0 = interfaceC17406l;
        this.f12520Z = i10;
        this.f12524r0 = i11;
    }
}
