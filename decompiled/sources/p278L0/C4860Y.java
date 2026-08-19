package p278L0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: L0.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C4860Y extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15818Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f15819Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3582M f15820o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1439n f15821p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f15822q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4860Y(long j10, C3582M c3582m, InterfaceC1439n interfaceC1439n, int i10, int i11) {
        super(2);
        this.f15818Y = i11;
        this.f15819Z = j10;
        this.f15820o0 = c3582m;
        this.f15821p0 = interfaceC1439n;
        this.f15822q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15818Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f15822q0 | 1);
                C3582M c3582m = this.f15820o0;
                InterfaceC1439n interfaceC1439n = this.f15821p0;
                AbstractC4846J.m5493b(this.f15819Z, c3582m, interfaceC1439n, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f15822q0 | 1);
                C3582M c3582m2 = this.f15820o0;
                InterfaceC1439n interfaceC1439n2 = this.f15821p0;
                AbstractC4879i0.m5510b(this.f15819Z, c3582m2, interfaceC1439n2, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
