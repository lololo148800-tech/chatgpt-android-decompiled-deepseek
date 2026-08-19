package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: J0.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4157x1 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f13473Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f13474Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f13475o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f13476p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC14339Q f13477q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C4151w1 f13478r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC17406l f13479s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C8410b f13480t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f13481u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f13482v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4157x1(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, boolean z6, InterfaceC14339Q interfaceC14339Q, C4151w1 c4151w1, InterfaceC17406l interfaceC17406l, C8410b c8410b, int i10, int i11, int i12) {
        super(2);
        this.f13473Y = i12;
        this.f13474Z = interfaceC1426a;
        this.f13475o0 = interfaceC10459q;
        this.f13476p0 = z6;
        this.f13477q0 = interfaceC14339Q;
        this.f13478r0 = c4151w1;
        this.f13479s0 = interfaceC17406l;
        this.f13480t0 = c8410b;
        this.f13481u0 = i10;
        this.f13482v0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13473Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f13481u0 | 1);
                C8410b c8410b = this.f13480t0;
                C4151w1 c4151w1 = this.f13478r0;
                AbstractC3984T1.m4690i(this.f13474Z, this.f13475o0, this.f13476p0, this.f13477q0, c4151w1, this.f13479s0, c8410b, (C6021p) obj, iM6447d0, this.f13482v0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f13481u0 | 1);
                C8410b c8410b2 = this.f13480t0;
                C4151w1 c4151w2 = this.f13478r0;
                AbstractC3984T1.m4691j(this.f13474Z, this.f13475o0, this.f13476p0, this.f13477q0, c4151w2, this.f13479s0, c8410b2, (C6021p) obj, iM6447d1, this.f13482v0);
                break;
        }
        return C17296C.f55119a;
    }
}
