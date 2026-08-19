package p576Xe;

import android.app.Application;
import com.statsig.androidsdk.StatsigUser;
import gd.C13985r2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import ni.C17629c;
import ni.C17641o;
import p046Bk.C1342O;
import p071Ch.C1676g;
import p1155zi.EnumC21895B;
import p140Fa.C2685e;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p364Oh.C6226E;
import p432Rh.C6888a;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8192s6;
import p598Ye.C10020F;
import p708dh.C13145X;
import p708dh.C13158l;
import p708dh.C13166t;
import p708dh.C13167u;
import p853kd.C16368c;
import p853kd.C16372g;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: renamed from: Xe.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9474G implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28517a = 2;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f28518b;

    /* JADX INFO: renamed from: c */
    public final C4474e f28519c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f28520d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4478i f28521e;

    public C9474G(C4474e accountUserCoroutineScope, InterfaceC4478i interfaceC4478i, InterfaceC17068a servicesConfig, InterfaceC17068a experimentManager) {
        AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        this.f28519c = accountUserCoroutineScope;
        this.f28521e = interfaceC4478i;
        this.f28518b = servicesConfig;
        this.f28520d = experimentManager;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f28517a) {
            case 0:
                Object obj = this.f28518b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f28520d.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f28519c.f14617a;
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f28521e.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C9473F((C9475H) obj, (C6888a) obj2, (C18418a) obj3, (C10020F) obj4);
            case 1:
                Object obj5 = this.f28518b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f28519c.f14617a;
                AbstractC16544l.m18093f(obj6, "get(...)");
                Object obj7 = this.f28520d.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f28521e.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C13166t((C13167u) obj5, (C17641o) obj6, (C13145X) obj7, (C13158l) obj8);
            case 2:
                Object obj9 = this.f28519c.f14617a;
                AbstractC16544l.m18093f(obj9, "get(...)");
                Application application = (Application) obj9;
                Object obj10 = this.f28518b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                C17629c c17629c = (C17629c) obj10;
                EnumC21895B enumC21895B = EnumC21895B.f69419Z;
                Object obj11 = this.f28520d.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                C1676g c1676g = (C1676g) obj11;
                Object obj12 = this.f28521e.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                StatsigUser statsigUser = new StatsigUser(null, 1, null);
                statsigUser.setCustom(AbstractC8192s6.m8793b(false));
                statsigUser.setLocale(AbstractC8012V5.m8334g(application).toLanguageTag());
                statsigUser.setUserAgent(((C6226E) obj12).f20269a);
                return new C13985r2(statsigUser, AbstractC8192s6.m8794c(enumC21895B, c1676g.m2506a()), application, c1676g, c17629c);
            default:
                Object obj13 = this.f28519c.f14617a;
                AbstractC16544l.m18093f(obj13, "get(...)");
                Object obj14 = this.f28521e.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                Object obj15 = this.f28518b.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                Object obj16 = this.f28520d.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C16368c((C17627a) obj13, (C16372g) obj14, (C6226E) obj15, (InterfaceC13849E) obj16);
        }
    }

    public C9474G(InterfaceC17068a store, C4474e coroutineScope, InterfaceC17068a userRepository, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(userRepository, "userRepository");
        this.f28518b = store;
        this.f28519c = coroutineScope;
        this.f28520d = userRepository;
        this.f28521e = interfaceC4478i;
    }

    public C9474G(InterfaceC17068a gizmosStore, InterfaceC17068a apolloRequester, C4474e accountSession, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(gizmosStore, "gizmosStore");
        AbstractC16544l.m18094g(apolloRequester, "apolloRequester");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f28518b = gizmosStore;
        this.f28520d = apolloRequester;
        this.f28519c = accountSession;
        this.f28521e = interfaceC4478i;
    }

    public C9474G(C2685e c2685e, C4474e application, InterfaceC17068a coroutineScope, C1342O c1342o, InterfaceC17068a devicePreferences, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        this.f28519c = application;
        this.f28518b = coroutineScope;
        this.f28520d = devicePreferences;
        this.f28521e = interfaceC4478i;
    }
}
