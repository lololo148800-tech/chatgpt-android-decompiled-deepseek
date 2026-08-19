package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4164y2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3879A2 f13519Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f13520Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f13521o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC17406l f13522p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f13523q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C4052f4 f13524r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC14339Q f13525s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float f13526t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ float f13527u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f13528v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ int f13529w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4164y2(C3879A2 c3879a2, boolean z6, boolean z10, InterfaceC17406l interfaceC17406l, InterfaceC10459q interfaceC10459q, C4052f4 c4052f4, InterfaceC14339Q interfaceC14339Q, float f10, float f11, int i10, int i11) {
        super(2);
        this.f13519Y = c3879a2;
        this.f13520Z = z6;
        this.f13521o0 = z10;
        this.f13522p0 = interfaceC17406l;
        this.f13523q0 = interfaceC10459q;
        this.f13524r0 = c4052f4;
        this.f13525s0 = interfaceC14339Q;
        this.f13526t0 = f10;
        this.f13527u0 = f11;
        this.f13528v0 = i10;
        this.f13529w0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f13528v0 | 1);
        InterfaceC14339Q interfaceC14339Q = this.f13525s0;
        this.f13519Y.m4599a(this.f13520Z, this.f13521o0, this.f13522p0, this.f13523q0, this.f13524r0, interfaceC14339Q, this.f13526t0, this.f13527u0, (C6021p) obj, iM6447d0, this.f13529w0);
        return C17296C.f55119a;
    }
}
