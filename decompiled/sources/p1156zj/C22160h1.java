package p1156zj;

import android.widget.ScrollView;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p021Aj.C0528m;
import p049Bm.InterfaceC1436k;
import p099Dj.C2070h;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: zj.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22160h1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C22163i1 f70070Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22160h1(C22163i1 c22163i1) {
        super(1);
        this.f70070Y = c22163i1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2070h binding = (C2070h) obj;
        AbstractC16544l.m18094g(binding, "binding");
        ScrollView scrollView = binding.f6375a;
        AbstractC16544l.m18093f(scrollView, "getRoot(...)");
        AbstractC18223d.m19731a(scrollView, 15);
        return new C0528m(binding, 4, this.f70070Y);
    }
}
