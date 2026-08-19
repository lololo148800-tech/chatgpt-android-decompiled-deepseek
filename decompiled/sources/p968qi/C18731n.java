package p968qi;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p283L5.AbstractC4941g;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: qi.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18731n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18742y f59582Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18739v f59583o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f59584p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f59585q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18731n(int i10, int i11, InterfaceC1436k interfaceC1436k, C18739v c18739v, C18742y c18742y) {
        super(2);
        this.f59581Y = i11;
        this.f59582Z = c18742y;
        this.f59583o0 = c18739v;
        this.f59584p0 = interfaceC1436k;
        this.f59585q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f59581Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f59585q0 | 1);
                AbstractC4941g.m5549H(this.f59582Z, this.f59583o0, this.f59584p0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f59585q0 | 1);
                AbstractC4941g.m5550I(this.f59582Z, this.f59583o0, this.f59584p0, c6021p, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
