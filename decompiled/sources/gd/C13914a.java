package gd;

import android.app.Application;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.C0611f0;
import p1061vb.C20513d;
import p1081wc.C20884c;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p530Vi.C8307c;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p530Vi.C8327w;
import p554Wi.InterfaceC8882i;
import p580Xi.C9519e;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: gd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13914a implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43963a = 0;

    /* JADX INFO: renamed from: b */
    public final C4474e f43964b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f43965c;

    /* JADX INFO: renamed from: d */
    public final C4479j f43966d;

    public C13914a(C20513d c20513d, C4474e coroutineScope, InterfaceC17068a statsigInstance, C4479j evaluationListeners) {
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(statsigInstance, "statsigInstance");
        AbstractC16544l.m18094g(evaluationListeners, "evaluationListeners");
        this.f43964b = coroutineScope;
        this.f43965c = statsigInstance;
        this.f43966d = evaluationListeners;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f43963a) {
            case 0:
                Object obj = this.f43964b.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f43965c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f43966d.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C14005w2((C17627a) obj, (C13985r2) obj2, (Set) obj3);
            default:
                Object obj4 = this.f43964b.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = this.f43965c.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f43966d.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                C8312h c8312h = new C8312h(new C8317m((Application) obj4));
                C9519e c9519e = new C9519e();
                Iterator it = ((Set) obj6).iterator();
                while (it.hasNext()) {
                    c8312h.m8931a((InterfaceC8882i) it.next());
                }
                c8312h.m8931a(c9519e);
                C2392v c2392v = c8312h.f25903Z;
                AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8327w(c8312h, c9519e, null), 2);
                C8312h.Companion.getClass();
                C8312h.f25900s0 = true;
                c8312h.f25907r0 = true;
                AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7438p0, null, new C8307c(c8312h, true, null), 2);
                return c8312h;
        }
    }

    public C13914a(C20884c c20884c, C4474e context, InterfaceC17068a servicesConfig, C4479j c4479j) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        this.f43964b = context;
        this.f43965c = servicesConfig;
        this.f43966d = c4479j;
    }
}
