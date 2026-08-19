package p905nd;

import android.app.Application;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import gd.C13993t2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p071Ch.C1676g;
import p071Ch.C1677h;
import p092Dc.C1992i;
import p1081wc.InterfaceC20904w;
import p151Fl.C2913s;
import p241Jc.C4327b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p364Oh.C6226E;
import p446S6.C7022a;
import p472T6.C7258a;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: nd.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C17590r implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final C4474e f56310a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f56311b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f56312c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f56313d;

    /* JADX INFO: renamed from: e */
    public final C1677h f56314e;

    /* JADX INFO: renamed from: f */
    public final C1992i f56315f;

    /* JADX INFO: renamed from: g */
    public final C2913s f56316g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC17068a f56317h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17068a f56318i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17068a f56319j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17068a f56320k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f56321l;

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f56310a.f14617a;
        AbstractC16544l.m18093f(obj, "get(...)");
        Application application = (Application) obj;
        Object obj2 = this.f56311b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        C17572E c17572e = (C17572E) obj2;
        Object obj3 = this.f56312c.get();
        AbstractC16544l.m18093f(obj3, "get(...)");
        C17629c c17629c = (C17629c) obj3;
        Object obj4 = this.f56313d.get();
        AbstractC16544l.m18093f(obj4, "get(...)");
        C1676g c1676g = (C1676g) obj4;
        C17591s c17591s = (C17591s) this.f56314e.get();
        C7022a c7022a = (C7022a) this.f56315f.get();
        C7258a c7258a = (C7258a) this.f56316g.get();
        Object obj5 = this.f56317h.get();
        AbstractC16544l.m18093f(obj5, "get(...)");
        C6226E c6226e = (C6226E) obj5;
        Object obj6 = this.f56318i.get();
        AbstractC16544l.m18093f(obj6, "get(...)");
        C4327b c4327b = (C4327b) obj6;
        Object obj7 = this.f56319j.get();
        AbstractC16544l.m18093f(obj7, "get(...)");
        InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj7;
        Object obj8 = this.f56320k.get();
        AbstractC16544l.m18093f(obj8, "get(...)");
        InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj8;
        Object obj9 = this.f56321l.get();
        AbstractC16544l.m18093f(obj9, "get(...)");
        return new C17589q(application, c17572e, c17629c, c1676g, c17591s, c7022a, c7258a, c6226e, c4327b, interfaceC20904w, interfaceC13849E, (C13993t2) obj9);
    }

    public C17590r(C4474e context, InterfaceC17068a sessionStore, InterfaceC17068a coroutineScope, InterfaceC17068a devicePreferences, C1677h account, C1992i client, C2913s manager, InterfaceC17068a servicesConfig, InterfaceC17068a interfaceC17068a, InterfaceC17068a analyticsService, InterfaceC17068a experimentManager, InterfaceC17068a layerManager) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(sessionStore, "sessionStore");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(account, "account");
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(manager, "manager");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(interfaceC17068a, wNrQXvwLiB.pEBxXcbERNBOnKp);
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        this.f56310a = context;
        this.f56311b = sessionStore;
        this.f56312c = coroutineScope;
        this.f56313d = devicePreferences;
        this.f56314e = account;
        this.f56315f = client;
        this.f56316g = manager;
        this.f56317h = servicesConfig;
        this.f56318i = interfaceC17068a;
        this.f56319j = analyticsService;
        this.f56320k = experimentManager;
        this.f56321l = layerManager;
    }
}
