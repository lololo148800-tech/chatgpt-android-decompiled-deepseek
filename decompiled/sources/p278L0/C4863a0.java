package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;

/* JADX INFO: renamed from: L0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4863a0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15833Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f15834Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f15835o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4863a0(long j10, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f15833Y = i10;
        this.f15834Z = j10;
        this.f15835o0 = interfaceC1439n;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15833Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4879i0.m5511c(this.f15834Z, this.f15835o0, c6021p, 0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4879i0.m5511c(this.f15834Z, this.f15835o0, c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
