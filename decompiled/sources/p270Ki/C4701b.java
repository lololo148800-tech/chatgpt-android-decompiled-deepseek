package p270Ki;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p273Kl.C4727J0;
import p349O0.C5997d;
import p349O0.C6021p;
import p387Pl.C6501u;
import p544W9.AbstractC8553S2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ki.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4701b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15282Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f15283Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6501u f15284o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C4727J0 f15285p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f15286q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4701b(InterfaceC10459q interfaceC10459q, C6501u c6501u, C4727J0 c4727j0, int i10, int i11) {
        super(2);
        this.f15282Y = i11;
        this.f15283Z = interfaceC10459q;
        this.f15284o0 = c6501u;
        this.f15285p0 = c4727j0;
        this.f15286q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15282Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f15286q0 | 1);
                AbstractC8553S2.m9211a(this.f15283Z, this.f15284o0, this.f15285p0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f15286q0 | 1);
                AbstractC8553S2.m9211a(this.f15283Z, this.f15284o0, this.f15285p0, c6021p, iM6447d1);
                break;
            default:
                int iM6447d2 = C5997d.m6447d0(this.f15286q0 | 1);
                AbstractC8553S2.m9211a(this.f15283Z, this.f15284o0, this.f15285p0, c6021p, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }
}
