package p1044uj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1087wj.AbstractC20982c;
import p1087wj.C20980a;
import p729ej.C13430u;

/* JADX INFO: renamed from: uj.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20351n0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC20982c f64351Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20351n0(AbstractC20982c abstractC20982c) {
        super(1);
        this.f64351Y = abstractC20982c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C20980a c20980a = (C20980a) this.f64351Y;
        if (!c20980a.f66804a.isRecoverable()) {
            action.m14964a(new C20319V(c20980a.f66804a));
        }
        return C17296C.f55119a;
    }
}
