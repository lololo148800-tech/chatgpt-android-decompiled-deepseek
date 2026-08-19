package p769gj;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1441p;
import p544W9.AbstractC8682o;

/* JADX INFO: renamed from: gj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14164f extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C14164f f44540Y = new C14164f(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        InterfaceC1439n innerShowRendering = (InterfaceC1439n) obj2;
        C14165g outerRendering = (C14165g) obj3;
        C14183y viewEnvironment = (C14183y) obj4;
        AbstractC16544l.m18094g(view, "view");
        AbstractC16544l.m18094g(innerShowRendering, "innerShowRendering");
        AbstractC16544l.m18094g(outerRendering, "outerRendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        InterfaceC1426a interfaceC1426a = outerRendering.f44543o0;
        boolean z6 = outerRendering.f44542Z;
        if (!z6) {
            AbstractC8682o.m9380c(interfaceC1426a, view);
        }
        innerShowRendering.invoke(outerRendering.f44541Y, viewEnvironment);
        if (z6) {
            AbstractC8682o.m9380c(interfaceC1426a, view);
        }
        return C17296C.f55119a;
    }
}
