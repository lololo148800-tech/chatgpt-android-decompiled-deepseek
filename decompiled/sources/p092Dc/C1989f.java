package p092Dc;

import android.os.Build;
import bo.AbstractC11516d;
import gd.C13969n2;
import gd.InterfaceC13849E;
import java.util.Set;
import ke.C16382j;
import kotlin.jvm.internal.AbstractC16544l;
import li.C16968g;
import md.C17236j;
import me.C17238a;
import mo.C17356w;
import mo.InterfaceC17332I;
import ni.C17629c;
import ni.C17634h;
import ni.C17641o;
import ni.C17642p;
import p016Ae.C0453o;
import p025An.AbstractC0563B;
import p041Be.C1222O;
import p071Ch.C1676g;
import p075Cl.C1719b;
import p101Dl.C2117r;
import p101Dl.C2118s;
import p101Dl.InterfaceC2112m;
import p1053v3.p1054lN.IGDwkYw;
import p1081wc.C20881a0;
import p151Fl.AbstractC2897c;
import p151Fl.C2895a;
import p151Fl.C2901g;
import p215Ic.C3692i;
import p220Ih.InterfaceC3721c;
import p224Il.C3741a;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p266Kc.C4636e;
import p268Kf.C4666u;
import p268Kf.C4668w;
import p273Kl.C4750V0;
import p289Lc.C4996d;
import p510Ul.C7720a;
import p708dh.C13149c;
import p728ei.C13406b;
import p787he.C14459O;
import p876lm.InterfaceC17068a;
import p925oe.C18089N;
import p925oe.C18092Q;

/* JADX INFO: renamed from: Dc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1989f implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5879a = 5;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f5880b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f5881c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f5882d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f5883e;

    public C1989f(C4471b conversationCoordinator, InterfaceC17068a configurationManager, InterfaceC4478i interfaceC4478i, InterfaceC17068a assistantSessionProvider) {
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        AbstractC16544l.m18094g(assistantSessionProvider, "assistantSessionProvider");
        this.f5881c = conversationCoordinator;
        this.f5882d = configurationManager;
        this.f5880b = interfaceC4478i;
        this.f5883e = assistantSessionProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f5879a) {
            case 0:
                return new C1988e((C13149c) ((InterfaceC4478i) this.f5880b).get(), (C17641o) ((C4474e) this.f5882d).f14617a, (C17642p) ((InterfaceC4478i) this.f5881c).get(), (C1994k) ((C2000q) this.f5883e).get());
            case 1:
                boolean zBooleanValue = ((Boolean) ((C2901g) this.f5882d).get()).booleanValue();
                C1719b c1719b = (C1719b) ((C1992i) this.f5883e).get();
                C3741a closeableManager = (C3741a) ((InterfaceC4478i) this.f5880b).get();
                AbstractC16544l.m18094g(closeableManager, "closeableManager");
                InterfaceC4478i interfaceC4478i = (InterfaceC4478i) this.f5881c;
                if (zBooleanValue || Build.VERSION.SDK_INT < 30 || c1719b.f4933a != 3) {
                    return new C2118s();
                }
                Object obj = interfaceC4478i.get();
                closeableManager.m4434a(new C2895a((C2117r) obj, 0));
                AbstractC16544l.m18091d(obj);
                return (InterfaceC2112m) obj;
            case 2:
                return new C3692i((InterfaceC13849E) ((InterfaceC4478i) this.f5880b).get(), (C20881a0) ((InterfaceC4478i) this.f5881c).get(), (InterfaceC13849E) ((InterfaceC4478i) this.f5882d).get(), (C20881a0) ((InterfaceC4478i) this.f5883e).get());
            case 3:
                return new C4636e((C17629c) ((InterfaceC4478i) this.f5880b).get(), (Set) ((C4479j) this.f5882d).get(), (Set) ((C4479j) this.f5883e).get(), (C13406b) ((InterfaceC4478i) this.f5881c).get());
            case 4:
                Object obj2 = ((C4471b) this.f5881c).get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f5882d.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = ((InterfaceC4478i) this.f5880b).get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = this.f5883e.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C4666u((C14459O) obj2, (C13969n2) obj3, (C4668w) obj4, (C17236j) obj5);
            case 5:
                return new C4750V0((InterfaceC17332I) ((C0453o) this.f5882d).get(), (AbstractC11516d) ((InterfaceC4478i) this.f5880b).get(), (C17356w) ((InterfaceC4478i) this.f5881c).get(), (AbstractC0563B) AbstractC2897c.f8708a.get(), (C7720a) ((InterfaceC4478i) this.f5883e).get());
            case 6:
                Object obj6 = this.f5880b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                Object obj7 = this.f5881c.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f5882d.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                Object obj9 = this.f5883e.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                return new C16968g((C17629c) obj6, (C4996d) obj7, (C1676g) obj8, (C13969n2) obj9);
            case 7:
                Object obj10 = this.f5880b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                Object obj11 = this.f5881c.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = ((C4471b) this.f5882d).get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                Object obj13 = this.f5883e.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                return new C18089N((C1222O) obj10, (C16382j) obj11, (C14459O) obj12, (InterfaceC3721c) obj13);
            default:
                Object obj14 = ((C4474e) this.f5882d).f14617a;
                AbstractC16544l.m18093f(obj14, "get(...)");
                Object obj15 = ((C4471b) this.f5880b).get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                Object obj16 = this.f5881c.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                Object obj17 = this.f5883e.get();
                AbstractC16544l.m18093f(obj17, "get(...)");
                return new C18092Q((C17634h) obj14, (C17238a) obj15, (C1991h) obj16, (InterfaceC13849E) obj17);
        }
    }

    public C1989f(C4471b conversationCoordinator, InterfaceC17068a api, InterfaceC17068a gizmoIdProvider, InterfaceC17068a interfaceC17068a) {
        AbstractC16544l.m18094g(api, "api");
        AbstractC16544l.m18094g(gizmoIdProvider, "gizmoIdProvider");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        AbstractC16544l.m18094g(interfaceC17068a, IGDwkYw.vqigpbASdeN);
        this.f5880b = api;
        this.f5881c = gizmoIdProvider;
        this.f5882d = conversationCoordinator;
        this.f5883e = interfaceC17068a;
    }

    public C1989f(C4474e coroutineScope, C4471b c4471b, InterfaceC17068a stringResolver, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(stringResolver, "stringResolver");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f5882d = coroutineScope;
        this.f5880b = c4471b;
        this.f5881c = stringResolver;
        this.f5883e = experimentManager;
    }

    public C1989f(InterfaceC17068a coroutineScope, InterfaceC17068a logObserver, InterfaceC17068a devicePreferences, InterfaceC17068a configurationManager) {
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(logObserver, "logObserver");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        this.f5880b = coroutineScope;
        this.f5881c = logObserver;
        this.f5882d = devicePreferences;
        this.f5883e = configurationManager;
    }

    public C1989f(C2901g c2901g, C1992i c1992i, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2) {
        this.f5882d = c2901g;
        this.f5883e = c1992i;
        this.f5880b = interfaceC4478i;
        this.f5881c = interfaceC4478i2;
    }

    public C1989f(C0453o c0453o, InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, InterfaceC4478i interfaceC4478i3) {
        this.f5882d = c0453o;
        this.f5880b = interfaceC4478i;
        this.f5881c = interfaceC4478i2;
        this.f5883e = interfaceC4478i3;
    }

    public C1989f(InterfaceC4478i interfaceC4478i, C4474e c4474e, InterfaceC4478i interfaceC4478i2, C2000q c2000q) {
        this.f5880b = interfaceC4478i;
        this.f5882d = c4474e;
        this.f5881c = interfaceC4478i2;
        this.f5883e = c2000q;
    }

    public C1989f(InterfaceC4478i interfaceC4478i, C4479j c4479j, C4479j c4479j2, InterfaceC4478i interfaceC4478i2) {
        this.f5880b = interfaceC4478i;
        this.f5882d = c4479j;
        this.f5883e = c4479j2;
        this.f5881c = interfaceC4478i2;
    }

    public C1989f(InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, InterfaceC4478i interfaceC4478i3, InterfaceC4478i interfaceC4478i4) {
        this.f5880b = interfaceC4478i;
        this.f5881c = interfaceC4478i2;
        this.f5882d = interfaceC4478i3;
        this.f5883e = interfaceC4478i4;
    }
}
