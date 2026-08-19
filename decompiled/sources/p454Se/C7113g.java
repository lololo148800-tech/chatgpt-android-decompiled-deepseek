package p454Se;

import android.app.Application;
import bh.C11431e;
import gd.InterfaceC13849E;
import gh.C14146n;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import ni.C17628b;
import p1061vb.C20513d;
import p1081wc.InterfaceC20904w;
import p1083we.C20921g;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p480Te.C7392q;
import p624Zg.InterfaceC10334D;
import p708dh.C13132J;
import p708dh.C13158l;
import p708dh.C13169w;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;
import ve.C20577a;
import ve.C20592p;

/* JADX INFO: renamed from: Se.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7113g implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22647a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f22648b;

    /* JADX INFO: renamed from: c */
    public final C4474e f22649c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f22650d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f22651e;

    /* JADX INFO: renamed from: f */
    public final C4474e f22652f;

    public C7113g(InterfaceC17068a releaseCompletable, C4474e accountSession, InterfaceC17068a store, C4474e coroutineScope, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(store, "store");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f22650d = releaseCompletable;
        this.f22649c = accountSession;
        this.f22651e = store;
        this.f22652f = coroutineScope;
        this.f22648b = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f22647a) {
            case 0:
                Object obj = this.f22649c.f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                Application application = (Application) obj;
                Object obj2 = this.f22650d.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                C7392q c7392q = (C7392q) obj2;
                Object obj3 = this.f22651e.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C7115i c7115i = (C7115i) obj3;
                Object obj4 = this.f22652f.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                C18418a c18418a = (C18418a) obj4;
                Object obj5 = this.f22648b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C7112f(application, c7392q, c7115i, c18418a, (C17628b) obj5, new C20513d());
            case 1:
                Object obj6 = this.f22648b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                InterfaceC10334D interfaceC10334D = (InterfaceC10334D) obj6;
                Object obj7 = this.f22649c.f14617a;
                AbstractC16544l.m18093f(obj7, "get(...)");
                C18418a c18418a2 = (C18418a) obj7;
                Object obj8 = this.f22650d.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                C13158l c13158l = (C13158l) obj8;
                Object obj9 = this.f22651e.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                InterfaceC13849E interfaceC13849E = (InterfaceC13849E) obj9;
                Object obj10 = this.f22652f.f14617a;
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C11431e(interfaceC10334D, c18418a2, c13158l, interfaceC13849E, (C17627a) obj10);
            case 2:
                Object obj11 = this.f22650d.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                C14146n c14146n = (C14146n) obj11;
                Object obj12 = this.f22648b.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                C13169w c13169w = (C13169w) obj12;
                Object obj13 = this.f22649c.f14617a;
                AbstractC16544l.m18093f(obj13, "get(...)");
                C18418a c18418a3 = (C18418a) obj13;
                Object obj14 = this.f22652f.f14617a;
                AbstractC16544l.m18093f(obj14, "get(...)");
                C17627a c17627a = (C17627a) obj14;
                Object obj15 = this.f22651e.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                return new C13132J(c14146n, c13169w, c18418a3, c17627a, (InterfaceC20904w) obj15);
            default:
                Object obj16 = this.f22650d.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                C17628b c17628b = (C17628b) obj16;
                Object obj17 = this.f22649c.f14617a;
                AbstractC16544l.m18093f(obj17, "get(...)");
                C18418a c18418a4 = (C18418a) obj17;
                Object obj18 = this.f22651e.get();
                AbstractC16544l.m18093f(obj18, "get(...)");
                C20577a c20577a = (C20577a) obj18;
                Object obj19 = this.f22652f.f14617a;
                AbstractC16544l.m18093f(obj19, "get(...)");
                C17627a c17627a2 = (C17627a) obj19;
                Object obj20 = this.f22648b.get();
                AbstractC16544l.m18093f(obj20, "get(...)");
                return new C20592p(c17628b, c18418a4, c20577a, c17627a2, (C20921g) obj20);
        }
    }

    public C7113g(InterfaceC17068a userSettingsApi, InterfaceC4478i interfaceC4478i, C4474e accountSession, C4474e accountUserCoroutineScope, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(userSettingsApi, "userSettingsApi");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f22650d = userSettingsApi;
        this.f22648b = interfaceC4478i;
        this.f22649c = accountSession;
        this.f22652f = accountUserCoroutineScope;
        this.f22651e = analyticsService;
    }

    public C7113g(C4474e context, InterfaceC17068a fileServiceApi, InterfaceC17068a imageProcessor, C4474e accountSession, InterfaceC4478i interfaceC4478i) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(fileServiceApi, "fileServiceApi");
        AbstractC16544l.m18094g(imageProcessor, "imageProcessor");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f22649c = context;
        this.f22650d = fileServiceApi;
        this.f22651e = imageProcessor;
        this.f22652f = accountSession;
        this.f22648b = interfaceC4478i;
    }

    public C7113g(InterfaceC4478i interfaceC4478i, C4474e accountSession, InterfaceC17068a accountRepository, InterfaceC17068a experimentManager, C4474e scope) {
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(accountRepository, "accountRepository");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(scope, "scope");
        this.f22648b = interfaceC4478i;
        this.f22649c = accountSession;
        this.f22650d = accountRepository;
        this.f22651e = experimentManager;
        this.f22652f = scope;
    }
}
