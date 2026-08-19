package p406Qg;

import bh.C11431e;
import bh.C11434h;
import gd.C13993t2;
import gd.InterfaceC13849E;
import gh.C14146n;
import id.C14968g;
import id.C14971j;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import p092Dc.C1991h;
import p215Ic.C3685b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p620Zc.InterfaceC10277b;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p786hd.InterfaceC14444a;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p948pi.C18418a;

/* JADX INFO: renamed from: Qg.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C6730z implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21622a;

    /* JADX INFO: renamed from: b */
    public final C4474e f21623b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f21624c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f21625d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f21626e;

    public C6730z(C4474e accountSession, InterfaceC17068a store, InterfaceC17068a layerManager, InterfaceC17068a anonymousRepository, int i10) {
        this.f21622a = i10;
        switch (i10) {
            case 4:
                AbstractC16544l.m18094g(accountSession, "accountSession");
                AbstractC16544l.m18094g(store, "store");
                AbstractC16544l.m18094g(layerManager, "layerManager");
                AbstractC16544l.m18094g(anonymousRepository, "anonymousRepository");
                this.f21623b = accountSession;
                this.f21624c = store;
                this.f21625d = layerManager;
                this.f21626e = anonymousRepository;
                break;
            default:
                AbstractC16544l.m18094g(accountSession, "accountSession");
                AbstractC16544l.m18094g(store, "subscriptionManager");
                AbstractC16544l.m18094g(layerManager, "experimentManager");
                AbstractC16544l.m18094g(anonymousRepository, "stringResolver");
                this.f21623b = accountSession;
                this.f21624c = store;
                this.f21625d = layerManager;
                this.f21626e = anonymousRepository;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f21622a) {
            case 0:
                Object obj = this.f21624c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f21625d.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f21626e.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f21623b.f14617a;
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C3685b((C15000g) obj, (C13133K) obj2, (C13132J) obj3, (C18418a) obj4);
            case 1:
                Object obj5 = this.f21623b.f14617a;
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f21624c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                Object obj7 = this.f21625d.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f21626e.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C11434h((C18418a) obj5, (C11431e) obj6, (InterfaceC13849E) obj7, (C1991h) obj8);
            case 2:
                Object obj9 = this.f21624c.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f21625d.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                Object obj11 = this.f21626e.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = this.f21623b.f14617a;
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C13141T((C14146n) obj9, (C13132J) obj10, (C13133K) obj11, (C17627a) obj12);
            case 3:
                Object obj13 = this.f21624c.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                Object obj14 = this.f21625d.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                Object obj15 = this.f21626e.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                Object obj16 = this.f21623b.f14617a;
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C3685b((InterfaceC10277b) obj13, (InterfaceC13849E) obj14, (C13133K) obj15, (C17627a) obj16);
            default:
                Object obj17 = this.f21623b.f14617a;
                AbstractC16544l.m18093f(obj17, "get(...)");
                Object obj18 = this.f21624c.get();
                AbstractC16544l.m18093f(obj18, "get(...)");
                Object obj19 = this.f21625d.get();
                AbstractC16544l.m18093f(obj19, "get(...)");
                Object obj20 = this.f21626e.get();
                AbstractC16544l.m18093f(obj20, "get(...)");
                return new C14968g((C18418a) obj17, (C14971j) obj18, (C13993t2) obj19, (InterfaceC14444a) obj20);
        }
    }

    public C6730z(InterfaceC17068a userSettingsApi, InterfaceC17068a remoteRepository, InterfaceC17068a localRepository, C4474e accountUserCoroutineScope, int i10) {
        this.f21622a = i10;
        switch (i10) {
            case 2:
                AbstractC16544l.m18094g(userSettingsApi, "userSettingsApi");
                AbstractC16544l.m18094g(remoteRepository, "remoteRepository");
                AbstractC16544l.m18094g(localRepository, "localRepository");
                AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
                this.f21624c = userSettingsApi;
                this.f21625d = remoteRepository;
                this.f21626e = localRepository;
                this.f21623b = accountUserCoroutineScope;
                break;
            case 3:
                AbstractC16544l.m18094g(userSettingsApi, "hapticEngine");
                AbstractC16544l.m18094g(remoteRepository, "experimentManager");
                AbstractC16544l.m18094g(localRepository, "settingsRepository");
                AbstractC16544l.m18094g(accountUserCoroutineScope, "accountUserCoroutineScope");
                this.f21624c = userSettingsApi;
                this.f21625d = remoteRepository;
                this.f21626e = localRepository;
                this.f21623b = accountUserCoroutineScope;
                break;
            default:
                AbstractC16544l.m18094g(userSettingsApi, "accountUserProvider");
                AbstractC16544l.m18094g(remoteRepository, "settingsRepository");
                AbstractC16544l.m18094g(localRepository, "remoteUserSettingsRepository");
                AbstractC16544l.m18094g(accountUserCoroutineScope, "accountSession");
                this.f21624c = userSettingsApi;
                this.f21625d = remoteRepository;
                this.f21626e = localRepository;
                this.f21623b = accountUserCoroutineScope;
                break;
        }
    }
}
