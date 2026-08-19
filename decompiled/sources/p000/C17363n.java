package p000;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p278L0.AbstractC4879i0;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8742y;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: classes.dex */
public final class C17363n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55393Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f55394Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f55395o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f55396p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17363n(long j10, InterfaceC17302e interfaceC17302e, int i10, int i11) {
        super(2);
        this.f55393Y = i11;
        this.f55394Z = j10;
        this.f55396p0 = interfaceC17302e;
        this.f55395o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f55393Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC17714o.m19455e(this.f55394Z, (InterfaceC1426a) this.f55396p0, c6021p, C5997d.m6447d0(this.f55395o0 | 1));
                break;
            case 1:
                AbstractC8742y.m9484a((InterfaceC10459q) this.f55396p0, this.f55394Z, c6021p, C5997d.m6447d0(this.f55395o0 | 1));
                break;
            default:
                AbstractC4879i0.m5511c(this.f55394Z, (InterfaceC1439n) this.f55396p0, c6021p, C5997d.m6447d0(this.f55395o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17363n(InterfaceC10459q interfaceC10459q, long j10, int i10) {
        super(2);
        this.f55393Y = 1;
        this.f55396p0 = interfaceC10459q;
        this.f55394Z = j10;
        this.f55395o0 = i10;
    }
}
