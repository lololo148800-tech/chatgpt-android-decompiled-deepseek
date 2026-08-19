package p1156zj;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p021Aj.C0528m;
import p049Bm.InterfaceC1436k;
import p099Dj.C2066d;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: zj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C22191s extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22194t f70261Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22191s(C22194t c22194t) {
        super(1);
        this.f70261Y = c22194t;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2066d binding = (C2066d) obj;
        AbstractC16544l.m18094g(binding, "binding");
        CoordinatorLayout coordinatorLayout = binding.f6326a;
        AbstractC16544l.m18093f(coordinatorLayout, "getRoot(...)");
        AbstractC18223d.m19731a(coordinatorLayout, 15);
        return new C0528m(binding, 3, this.f70261Y);
    }
}
