package p292Lg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1155zi.InterfaceC21925I1;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8656j3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Lg.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C5052x extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16498Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC21925I1 f16499Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f16500o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f16501p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f16502q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5052x(InterfaceC21925I1 interfaceC21925I1, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f16498Y = i11;
        this.f16499Z = interfaceC21925I1;
        this.f16500o0 = interfaceC1426a;
        this.f16501p0 = interfaceC10459q;
        this.f16502q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16498Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f16502q0 | 1);
                AbstractC8656j3.m9334b(this.f16499Z, this.f16500o0, this.f16501p0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f16502q0 | 1);
                AbstractC8656j3.m9336d(this.f16499Z, this.f16500o0, this.f16501p0, c6021p, iM6447d1);
                break;
            default:
                int iM6447d2 = C5997d.m6447d0(this.f16502q0 | 1);
                AbstractC8656j3.m9337e(this.f16499Z, this.f16500o0, this.f16501p0, c6021p, iM6447d2);
                break;
        }
        return C17296C.f55119a;
    }
}
