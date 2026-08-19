package p021Aj;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p099Dj.C2063a;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: Aj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C0531p extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0532q f1695Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0531p(C0532q c0532q) {
        super(1);
        this.f1695Y = c0532q;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2063a binding = (C2063a) obj;
        AbstractC16544l.m18094g(binding, "binding");
        CoordinatorLayout coordinatorLayout = binding.f6286a;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC18223d.m19731a(coordinatorLayout, 15);
        return new C0528m(binding, 0, this.f1695Y);
    }
}
