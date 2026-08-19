package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p537W0.C8410b;
import p774h1.InterfaceC14339Q;

/* JADX INFO: renamed from: J0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C3958O extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4036d0 f12291Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12292Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f12293o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f12294p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC14339Q f12295q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long f12296r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f12297s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float f12298t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ float f12299u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ InterfaceC1439n f12300v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C8410b f12301w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3958O(C4036d0 c4036d0, float f10, float f11, boolean z6, InterfaceC14339Q interfaceC14339Q, long j10, long j11, float f12, float f13, InterfaceC1439n interfaceC1439n, C8410b c8410b) {
        super(2);
        this.f12291Y = c4036d0;
        this.f12292Z = f10;
        this.f12293o0 = f11;
        this.f12294p0 = z6;
        this.f12295q0 = interfaceC14339Q;
        this.f12296r0 = j10;
        this.f12297s0 = j11;
        this.f12298t0 = f12;
        this.f12299u0 = f13;
        this.f12300v0 = interfaceC1439n;
        this.f12301w0 = c8410b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C4036d0 c4036d0 = this.f12291Y;
            AbstractC3984T1.m4702u(c4036d0.f12708a, this.f12292Z, this.f12293o0, this.f12294p0, this.f12295q0, this.f12296r0, this.f12297s0, this.f12298t0, this.f12299u0, this.f12300v0, this.f12301w0, c6021p, 0, 0);
        }
        return C17296C.f55119a;
    }
}
