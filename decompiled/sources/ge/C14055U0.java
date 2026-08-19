package ge;

import gd.C13993t2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p1105xc.C21185o;
import p1105xc.C21189s;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p708dh.C13133K;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: ge.U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14055U0 implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44179a = 1;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f44180b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f44181c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f44182d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f44183e;

    public C14055U0(InterfaceC4478i interfaceC4478i, InterfaceC17068a scope, InterfaceC17068a experimentManager, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(scope, "scope");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f44180b = interfaceC4478i;
        this.f44181c = scope;
        this.f44182d = experimentManager;
        this.f44183e = analyticsService;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f44179a) {
            case 0:
                Object obj = this.f44181c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f44182d.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f44183e.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f44180b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C14053T0((C13133K) obj, (InterfaceC13849E) obj2, (C13993t2) obj3, (C16961l) obj4);
            default:
                Object obj5 = this.f44180b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                C21185o c21185o = (C21185o) obj5;
                Object obj6 = this.f44181c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                C17629c c17629c = (C17629c) obj6;
                C20513d c20513d = new C20513d();
                Object obj7 = this.f44182d.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj7;
                Object obj8 = this.f44183e.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C21189s(c21185o, c17629c, c20513d, interfaceC13849E, (InterfaceC20904w) obj8);
        }
    }

    public C14055U0(InterfaceC17068a settingsRepository, InterfaceC17068a experimentManager, InterfaceC17068a layerManager, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(settingsRepository, "settingsRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        this.f44181c = settingsRepository;
        this.f44182d = experimentManager;
        this.f44183e = layerManager;
        this.f44180b = interfaceC4478i;
    }
}
