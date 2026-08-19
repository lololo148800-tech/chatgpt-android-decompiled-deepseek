package p073Cj;

import android.view.ViewGroup;
import android.widget.Space;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p030B2.C0794y0;
import p049Bm.InterfaceC1436k;
import p099Dj.C2065c;
import p979r2.C18862c;

/* JADX INFO: renamed from: Cj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1714b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2065c f4900Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714b(C2065c c2065c) {
        super(1);
        this.f4900Y = c2065c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C0794y0 insets = (C0794y0) obj;
        AbstractC16544l.m18094g(insets, "insets");
        C18862c c18862cMo1755g = insets.f2209a.mo1755g(7);
        AbstractC16544l.m18093f(c18862cMo1755g, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = this.f4900Y.f6316b;
        AbstractC16544l.m18093f(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = c18862cMo1755g.f60089d;
        bottomInset.setLayoutParams(layoutParams);
        return C17296C.f55119a;
    }
}
