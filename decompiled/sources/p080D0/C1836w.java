package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p544W9.AbstractC8644h3;
import p594Y9.AbstractC9973t4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: D0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1836w extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5301Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f5302Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f5303o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f5304p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1836w(InterfaceC10459q interfaceC10459q, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f5301Y = i11;
        this.f5302Z = interfaceC10459q;
        this.f5303o0 = c8410b;
        this.f5304p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f5301Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f5304p0 | 1);
                AbstractC1807h0.m2615d(this.f5302Z, this.f5303o0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f5304p0 | 1);
                AbstractC1807h0.m2618g(this.f5302Z, this.f5303o0, c6021p, iM6447d1);
                break;
            case 2:
                int iM6447d2 = C5997d.m6447d0(this.f5304p0 | 1);
                AbstractC8644h3.m9309a(this.f5302Z, this.f5303o0, c6021p, iM6447d2);
                break;
            default:
                int iM6447d3 = C5997d.m6447d0(this.f5304p0 | 1);
                AbstractC9973t4.m10618c(this.f5302Z, this.f5303o0, c6021p, iM6447d3);
                break;
        }
        return C17296C.f55119a;
    }
}
