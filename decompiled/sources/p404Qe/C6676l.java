package p404Qe;

import android.app.Application;
import be.C11345b;
import gd.C13969n2;
import kotlin.jvm.internal.AbstractC16544l;
import me.C17238a;
import ni.C17627a;
import ni.C17628b;
import p041Be.C1223P;
import p092Dc.C1992i;
import p1081wc.InterfaceC20904w;
import p148Fi.C2854t0;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p480Te.C7392q;
import p504Ue.C7634d;
import p708dh.C13132J;
import p708dh.C13133K;
import p873lh.C16950a;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;
import p906nh.C17625g;
import p928oh.C18196c;
import p948pi.C18418a;

/* JADX INFO: renamed from: Qe.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6676l implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21464a = 2;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f21465b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f21466c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f21467d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC17068a f21468e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17068a f21469f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC17068a f21470g;

    public C6676l(InterfaceC17068a conversationIdsProvider, C4474e application, C1223P c1223p, InterfaceC17068a fileServiceApi, C1992i fileDownloader, C4471b inputDecorationProvider) {
        AbstractC16544l.m18094g(conversationIdsProvider, "conversationIdsProvider");
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(fileServiceApi, "fileServiceApi");
        AbstractC16544l.m18094g(fileDownloader, "fileDownloader");
        AbstractC16544l.m18094g(inputDecorationProvider, "inputDecorationProvider");
        this.f21465b = conversationIdsProvider;
        this.f21467d = application;
        this.f21468e = c1223p;
        this.f21466c = fileServiceApi;
        this.f21469f = fileDownloader;
        this.f21470g = inputDecorationProvider;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f21464a) {
            case 0:
                Object obj = this.f21465b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                C11345b c11345b = (C11345b) obj;
                Object obj2 = ((C4474e) this.f21467d).f14617a;
                AbstractC16544l.m18093f(obj2, "get(...)");
                Application application = (Application) obj2;
                C6667c c6667c = (C6667c) ((C1223P) this.f21468e).get();
                Object obj3 = this.f21466c.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C7392q c7392q = (C7392q) obj3;
                C7634d c7634d = (C7634d) ((C1992i) this.f21469f).get();
                Object obj4 = ((C4471b) this.f21470g).get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C6675k(c11345b, application, c6667c, c7392q, c7634d, (C17238a) obj4);
            case 1:
                Object obj5 = this.f21465b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                C2854t0 c2854t0 = (C2854t0) obj5;
                Object obj6 = this.f21467d.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                C16950a c16950a = (C16950a) obj6;
                Object obj7 = this.f21466c.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                C13132J c13132j = (C13132J) obj7;
                Object obj8 = this.f21468e.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                C13133K c13133k = (C13133K) obj8;
                Object obj9 = this.f21469f.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj9;
                Object obj10 = this.f21470g.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C16961l(c2854t0, c16950a, c13132j, c13133k, interfaceC20904w, (C13969n2) obj10);
            default:
                Object obj11 = ((C4474e) this.f21467d).f14617a;
                AbstractC16544l.m18093f(obj11, "get(...)");
                Application application2 = (Application) obj11;
                Object obj12 = this.f21465b.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                C13132J c13132j2 = (C13132J) obj12;
                Object obj13 = ((InterfaceC4478i) this.f21468e).get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                C18196c c18196c = (C18196c) obj13;
                Object obj14 = ((C4474e) this.f21469f).f14617a;
                AbstractC16544l.m18093f(obj14, "get(...)");
                C17627a c17627a = (C17627a) obj14;
                Object obj15 = ((C4474e) this.f21470g).f14617a;
                AbstractC16544l.m18093f(obj15, "get(...)");
                C18418a c18418a = (C18418a) obj15;
                Object obj16 = this.f21466c.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C17625g(application2, c13132j2, c18196c, c17627a, c18418a, (C17628b) obj16);
        }
    }

    public C6676l(InterfaceC17068a voiceApi, InterfaceC4478i interfaceC4478i, InterfaceC17068a remoteSettingsRepository, InterfaceC17068a localSettingsRepository, InterfaceC17068a analytics, InterfaceC17068a configurationManager) {
        AbstractC16544l.m18094g(voiceApi, "voiceApi");
        AbstractC16544l.m18094g(remoteSettingsRepository, "remoteSettingsRepository");
        AbstractC16544l.m18094g(localSettingsRepository, "localSettingsRepository");
        AbstractC16544l.m18094g(analytics, "analytics");
        AbstractC16544l.m18094g(configurationManager, "configurationManager");
        this.f21465b = voiceApi;
        this.f21467d = interfaceC4478i;
        this.f21466c = remoteSettingsRepository;
        this.f21468e = localSettingsRepository;
        this.f21469f = analytics;
        this.f21470g = configurationManager;
    }

    public C6676l(C4474e context, InterfaceC17068a remoteUserSettingsRepository, InterfaceC4478i interfaceC4478i, C4474e coroutineScope, C4474e accountSession, InterfaceC17068a releaseCompletable) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(remoteUserSettingsRepository, "remoteUserSettingsRepository");
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        this.f21467d = context;
        this.f21465b = remoteUserSettingsRepository;
        this.f21468e = interfaceC4478i;
        this.f21469f = coroutineScope;
        this.f21470g = accountSession;
        this.f21466c = releaseCompletable;
    }
}
