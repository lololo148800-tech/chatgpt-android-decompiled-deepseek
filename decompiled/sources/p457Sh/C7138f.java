package p457Sh;

import gd.C13969n2;
import gd.C13985r2;
import gd.C13993t2;
import io.sentry.hints.C15370i;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1061vb.C20513d;
import p1081wc.C20884c;
import p140Fa.C2685e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p409Qk.C6752c;
import p530Vi.C8312h;
import p554Wi.InterfaceC8882i;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Sh.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C7138f implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22705a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f22706b;

    /* JADX INFO: renamed from: c */
    public final C4479j f22707c;

    public C7138f(C15370i c15370i, InterfaceC17068a baseClient, C4479j c4479j) {
        this.f22705a = 0;
        AbstractC16544l.m18094g(baseClient, "baseClient");
        this.f22706b = baseClient;
        this.f22707c = c4479j;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f22705a) {
            case 0:
                Object obj = this.f22706b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f22707c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return ((C6752c) obj).m7188a(new C7133a(2, (Set) obj2));
            case 1:
                Object obj3 = this.f22706b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f22707c.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C13993t2((C13985r2) obj3, (Set) obj4);
            case 2:
                Object obj5 = this.f22706b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f22707c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C13969n2((C13985r2) obj5, (Set) obj6);
            case 3:
                Object obj7 = this.f22706b.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f22707c.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C13993t2((C13985r2) obj7, (Set) obj8);
            default:
                Object obj9 = this.f22706b.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                C8312h c8312h = (C8312h) obj9;
                Object obj10 = this.f22707c.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                Iterator it = ((Set) obj10).iterator();
                while (it.hasNext()) {
                    c8312h.m8931a((InterfaceC8882i) it.next());
                }
                return c8312h;
        }
    }

    public C7138f(C20884c c20884c, InterfaceC17068a analytics, C4479j c4479j) {
        this.f22705a = 4;
        AbstractC16544l.m18094g(analytics, "analytics");
        this.f22706b = analytics;
        this.f22707c = c4479j;
    }

    public C7138f(C2685e c2685e, InterfaceC17068a statsigInstance, C4479j evaluationListeners, int i10) {
        this.f22705a = i10;
        AbstractC16544l.m18094g(statsigInstance, "statsigInstance");
        AbstractC16544l.m18094g(evaluationListeners, "evaluationListeners");
        switch (i10) {
            case 3:
                this.f22706b = statsigInstance;
                this.f22707c = evaluationListeners;
                break;
            default:
                this.f22706b = statsigInstance;
                this.f22707c = evaluationListeners;
                break;
        }
    }

    public C7138f(C20513d c20513d, InterfaceC17068a statsigInstance, C4479j evaluationListeners) {
        this.f22705a = 1;
        AbstractC16544l.m18094g(statsigInstance, "statsigInstance");
        AbstractC16544l.m18094g(evaluationListeners, "evaluationListeners");
        this.f22706b = statsigInstance;
        this.f22707c = evaluationListeners;
    }
}
