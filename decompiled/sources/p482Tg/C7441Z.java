package p482Tg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1155zi.EnumC21905D1;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9334n4;

/* JADX INFO: renamed from: Tg.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7441Z extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23552Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC21905D1 f23553Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f23554o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f23555p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7441Z(EnumC21905D1 enumC21905D1, InterfaceC1426a interfaceC1426a, int i10, int i11) {
        super(2);
        this.f23552Y = i11;
        this.f23553Z = enumC21905D1;
        this.f23554o0 = interfaceC1426a;
        this.f23555p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f23552Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9334n4.m9932a(this.f23553Z, this.f23554o0, c6021p, C5997d.m6447d0(this.f23555p0 | 1));
                break;
            default:
                AbstractC9334n4.m9933b(this.f23553Z, this.f23554o0, c6021p, C5997d.m6447d0(this.f23555p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
