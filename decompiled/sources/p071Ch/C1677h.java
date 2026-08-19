package p071Ch;

import gd.C14004w1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17629c;
import p122Eg.C2435d;
import p146Fg.C2734c;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p364Oh.C6226E;
import p541W6.C8431a;
import p541W6.InterfaceC8434d;
import p876lm.InterfaceC17068a;
import p905nd.C17591s;
import p905nd.C17592t;
import p905nd.C17595w;

/* JADX INFO: renamed from: Ch.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1677h implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4756a = 1;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f4757b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f4758c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f4759d;

    public C1677h(InterfaceC17068a oldStore, InterfaceC4478i interfaceC4478i, InterfaceC17068a scope) {
        AbstractC16544l.m18094g(oldStore, "oldStore");
        AbstractC16544l.m18094g(scope, "scope");
        this.f4758c = oldStore;
        this.f4757b = interfaceC4478i;
        this.f4759d = scope;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f4756a) {
            case 0:
                Object obj = this.f4758c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f4757b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f4759d.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C1676g((C1683n) obj, (C1678i) obj2, (C17629c) obj3);
            case 1:
                Object obj4 = this.f4757b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = this.f4758c.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f4759d.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C2435d((C2734c) obj4, (C6226E) obj5, (C17629c) obj6);
            default:
                Object obj7 = this.f4758c.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f4759d.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                InterfaceC8434d c8431a = (C17595w) obj8;
                Object obj9 = this.f4757b.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                C17591s c17591s = new C17591s((C6226E) obj7);
                if (!((C14005w2) ((InterfaceC13849E) obj9)).m15481a(C14004w1.f44081c)) {
                    c8431a = new C8431a();
                }
                c17591s.f56324c = c8431a;
                return c17591s;
        }
    }

    public C1677h(InterfaceC4478i interfaceC4478i, InterfaceC17068a servicesConfig, InterfaceC17068a coroutineScope) {
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f4757b = interfaceC4478i;
        this.f4758c = servicesConfig;
        this.f4759d = coroutineScope;
    }

    public C1677h(C17592t c17592t, InterfaceC17068a servicesConfig, InterfaceC17068a networkClient, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(networkClient, "networkClient");
        this.f4758c = servicesConfig;
        this.f4759d = networkClient;
        this.f4757b = interfaceC4478i;
    }
}
