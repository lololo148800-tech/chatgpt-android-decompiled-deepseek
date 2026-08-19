package p603Yj;

import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0536u;
import p046Bk.ViewOnClickListenerC1332J;
import p160G5.p161rK.TVCuK;
import p402Qc.C6593i;
import p627Zj.C10401a;
import p769gj.C14183y;
import p769gj.InterfaceC14170l;
import p931ok.AbstractC18223d;

/* JADX INFO: renamed from: Yj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10075h implements InterfaceC14170l {

    /* JADX INFO: renamed from: b */
    public static final C0536u f29827b = new C0536u(1);

    /* JADX INFO: renamed from: a */
    public final C10401a f29828a;

    @Override // p769gj.InterfaceC14170l
    /* JADX INFO: renamed from: a */
    public final void mo1133a(Object obj, C14183y viewEnvironment) {
        C10072e rendering = (C10072e) obj;
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        C10401a c10401a = this.f29828a;
        c10401a.f30824c.setOnClickListener(new ViewOnClickListenerC1332J(rendering, 2, c10401a));
        AbstractC18223d.m19732b(c10401a.f30824c, new C6593i(this, 27));
        c10401a.f30823b.m14525a(rendering.f29822a, viewEnvironment);
    }

    public C10075h(C10401a c10401a) {
        AbstractC16544l.m18094g(c10401a, TVCuK.GqdmSRH);
        this.f29828a = c10401a;
    }
}
