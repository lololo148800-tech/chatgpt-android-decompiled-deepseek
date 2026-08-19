package p481Tf;

import android.app.Application;
import ch.C11757k;
import gd.C13993t2;
import gd.InterfaceC13849E;
import ie.C14975d;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import ni.C17628b;
import ni.C17642p;
import p046Bk.C1342O;
import p1061vb.C20513d;
import p1063vf.C20603k;
import p1063vf.C20608p;
import p1155zi.EnumC21895B;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p708dh.C13166t;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: renamed from: Tf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C7416u implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23496a;

    /* JADX INFO: renamed from: b */
    public final C4474e f23497b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f23498c;

    /* JADX INFO: renamed from: d */
    public final C4474e f23499d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f23500e;

    public C7416u(C4474e scope, C4474e session, InterfaceC17068a accountUserRepository, InterfaceC17068a experimentManager, int i10) {
        this.f23496a = i10;
        switch (i10) {
            case 3:
                AbstractC16544l.m18094g(scope, "scope");
                AbstractC16544l.m18094g(session, "session");
                AbstractC16544l.m18094g(accountUserRepository, "accountUserRepository");
                AbstractC16544l.m18094g(experimentManager, "experimentManager");
                this.f23497b = scope;
                this.f23499d = session;
                this.f23498c = accountUserRepository;
                this.f23500e = experimentManager;
                break;
            case 4:
                AbstractC16544l.m18094g(scope, "context");
                AbstractC16544l.m18094g(session, "scope");
                AbstractC16544l.m18094g(accountUserRepository, "releaseCompletable");
                AbstractC16544l.m18094g(experimentManager, "customDataSourceFactory");
                this.f23497b = scope;
                this.f23499d = session;
                this.f23498c = accountUserRepository;
                this.f23500e = experimentManager;
                break;
            default:
                AbstractC16544l.m18094g(scope, "context");
                AbstractC16544l.m18094g(session, "accountSession");
                AbstractC16544l.m18094g(accountUserRepository, "accountUserReleaseCompletable");
                AbstractC16544l.m18094g(experimentManager, "userReleaseCompletable");
                this.f23497b = scope;
                this.f23499d = session;
                this.f23498c = accountUserRepository;
                this.f23500e = experimentManager;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f23496a) {
            case 0:
                Object obj = this.f23498c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f23497b.f14617a;
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f23500e.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f23499d.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C7415t((C7409n) obj, (Application) obj2, (InterfaceC13849E) obj3, (C18418a) obj4);
            case 1:
                Object obj5 = this.f23497b.f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                Application application = (Application) obj5;
                Object obj6 = this.f23498c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                C13993t2 c13993t2 = (C13993t2) obj6;
                Object obj7 = this.f23499d.f14617a;
                AbstractC16544l.m18093f(obj7, "get(...)");
                C18418a c18418a = (C18418a) obj7;
                EnumC21895B enumC21895B = EnumC21895B.f69419Z;
                Object obj8 = this.f23500e.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C11757k(application, c13993t2, c18418a, enumC21895B, (C17628b) obj8);
            case 2:
                Object obj9 = this.f23497b.f14617a;
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f23499d.f14617a;
                AbstractC16544l.m18093f(obj10, "get(...)");
                Object obj11 = this.f23498c.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = this.f23500e.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C14975d((Application) obj9, (C18418a) obj10, (C17628b) obj11, (C17642p) obj12);
            case 3:
                Object obj13 = this.f23497b.f14617a;
                AbstractC16544l.m18093f(obj13, "get(...)");
                Object obj14 = this.f23499d.f14617a;
                AbstractC16544l.m18093f(obj14, "get(...)");
                Object obj15 = this.f23498c.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                Object obj16 = this.f23500e.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C15000g((C17627a) obj13, (C18418a) obj14, (C13166t) obj15, (InterfaceC13849E) obj16);
            default:
                Object obj17 = this.f23497b.f14617a;
                AbstractC16544l.m18093f(obj17, "get(...)");
                Application application2 = (Application) obj17;
                C20513d c20513d = new C20513d();
                Object obj18 = this.f23499d.f14617a;
                AbstractC16544l.m18093f(obj18, "get(...)");
                C17627a c17627a = (C17627a) obj18;
                Object obj19 = this.f23498c.get();
                AbstractC16544l.m18093f(obj19, "get(...)");
                C17628b c17628b = (C17628b) obj19;
                Object obj20 = this.f23500e.get();
                AbstractC16544l.m18093f(obj20, "get(...)");
                return new C20603k(application2, c20513d, c17627a, c17628b, (C20608p) obj20);
        }
    }

    public C7416u(InterfaceC17068a repository, C4474e application, InterfaceC17068a experimentManager, C4474e accountSession) {
        this.f23496a = 0;
        AbstractC16544l.m18094g(repository, "repository");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        this.f23498c = repository;
        this.f23497b = application;
        this.f23500e = experimentManager;
        this.f23499d = accountSession;
    }

    public C7416u(C4474e appContext, InterfaceC17068a layerManager, C4474e accountSession, C1342O c1342o, InterfaceC17068a releaseCompletable) {
        this.f23496a = 1;
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(layerManager, "layerManager");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        this.f23497b = appContext;
        this.f23498c = layerManager;
        this.f23499d = accountSession;
        this.f23500e = releaseCompletable;
    }
}
