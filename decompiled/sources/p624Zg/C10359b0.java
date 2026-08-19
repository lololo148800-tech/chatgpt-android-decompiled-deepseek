package p624Zg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p225Im.AbstractC3751J;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: renamed from: Zg.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10359b0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30706Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f30707Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f30708o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10359b0(int i10, int i11, int i12) {
        super(2);
        this.f30706Y = i12;
        this.f30707Z = i10;
        this.f30708o0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30706Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC3751J.m4437b(this.f30707Z, c6021p, C5997d.m6447d0(this.f30708o0 | 1));
                break;
            default:
                AbstractC3751J.m4438c(this.f30707Z, c6021p, C5997d.m6447d0(this.f30708o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
