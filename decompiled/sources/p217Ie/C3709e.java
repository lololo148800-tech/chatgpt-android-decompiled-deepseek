package p217Ie;

import android.app.Application;
import ke.C16382j;
import kotlin.jvm.internal.AbstractC16544l;
import me.C17238a;
import ni.C17641o;
import p1025te.C19864O;
import p1149zc.AbstractC21864z;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p708dh.C13145X;
import p708dh.C13146Y;
import p790hh.C14514c;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: Ie.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3709e implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11252a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f11253b;

    /* JADX INFO: renamed from: c */
    public final C4471b f11254c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f11255d;

    /* JADX INFO: renamed from: e */
    public final C4474e f11256e;

    public C3709e(InterfaceC17068a store, C4471b authSessionProvider, InterfaceC4478i interfaceC4478i, C4474e coroutineScope) {
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f11253b = store;
        this.f11254c = authSessionProvider;
        this.f11255d = interfaceC4478i;
        this.f11256e = coroutineScope;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f11252a) {
            case 0:
                Object obj = this.f11256e.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f11253b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f11254c.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f11255d.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C3708d((Application) obj, (C19864O) obj2, (C17238a) obj3, (C16382j) obj4);
            default:
                Object obj5 = this.f11253b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f11254c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                Object obj7 = this.f11255d.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f11256e.f14617a;
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C13145X((C13146Y) obj5, (AbstractC21864z) obj6, (C14514c) obj7, (C17641o) obj8);
        }
    }

    public C3709e(C4474e application, InterfaceC17068a inputStateFlow, C4471b inputDecorationProvider, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(inputStateFlow, "inputStateFlow");
        AbstractC16544l.m18094g(inputDecorationProvider, "inputDecorationProvider");
        this.f11256e = application;
        this.f11253b = inputStateFlow;
        this.f11254c = inputDecorationProvider;
        this.f11255d = interfaceC4478i;
    }
}
