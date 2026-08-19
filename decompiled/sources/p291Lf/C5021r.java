package p291Lf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p946pc.C18320E;
import p946pc.C18334T;
import pf.InterfaceC18393i;

/* JADX INFO: renamed from: Lf.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C5021r extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5021r f16385Z = new C5021r(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5021r f16386o0 = new C5021r(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16387Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5021r(int i10, int i11) {
        super(i10);
        this.f16387Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f16387Y) {
            case 0:
                InterfaceC18393i it = (InterfaceC18393i) obj;
                AbstractC16544l.m18094g(it, "it");
                return C17296C.f55119a;
            default:
                C18320E copy = (C18320E) obj;
                AbstractC16544l.m18094g(copy, "$this$copy");
                return new C18334T(AbstractC5008e.f16340a);
        }
    }
}
