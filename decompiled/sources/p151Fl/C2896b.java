package p151Fl;

import android.app.Application;
import android.media.AudioAttributes;
import bj.C11447L;
import ci.C11759b;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C12869g;
import fk.C13684e;
import gd.C13969n2;
import gd.C13985r2;
import gd.C14005w2;
import io.sentry.hints.C15370i;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;
import ni.C17628b;
import ni.C17629c;
import p025An.C0644w;
import p033B5.InterfaceC0832p;
import p075Cl.C1719b;
import p092Dc.C1992i;
import p092Dc.C1993j;
import p096Dg.C2046c;
import p101Dl.C2109j;
import p101Dl.InterfaceC2101b;
import p1061vb.C20513d;
import p1063vf.C20610r;
import p1139z0.C21585H;
import p1149zc.AbstractC21864z;
import p140Fa.C2685e;
import p142Fc.C2709c;
import p167Gb.C3032c;
import p190Hc.C3282c;
import p247Jj.C4373B;
import p247Jj.C4375C;
import p247Jj.C4466y;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p292Lg.C5034f;
import p320Mj.C5449b;
import p320Mj.C5450c;
import p320Mj.C5456i;
import p320Mj.C5457j;
import p320Mj.InterfaceC5451d;
import p342Nj.InterfaceC5816j;
import p364Oh.C6226E;
import p409Qk.C6752c;
import p432Rh.C6894g;
import p432Rh.C6900m;
import p504Ue.C7634d;
import p876lm.InterfaceC17068a;
import p882m1.clb.WGTYqNchEpHca;
import p948pi.C18418a;
import p966qg.C18710h;
import pg.C18412b;
import wf.C20945e;

/* JADX INFO: renamed from: Fl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2896b implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8704a;

    /* JADX INFO: renamed from: b */
    public final Object f8705b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f8706c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f8707d;

    public /* synthetic */ C2896b(Object obj, InterfaceC4478i interfaceC4478i, InterfaceC4473d interfaceC4473d, int i10) {
        this.f8704a = i10;
        this.f8705b = obj;
        this.f8706c = interfaceC4478i;
        this.f8707d = interfaceC4473d;
    }

    public C2896b(C4471b authSessionProvider, InterfaceC17068a devNotificationManager, InterfaceC17068a servicesConfig) {
        this.f8704a = 4;
        AbstractC16544l.m18094g(authSessionProvider, "authSessionProvider");
        AbstractC16544l.m18094g(devNotificationManager, "devNotificationManager");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        this.f8705b = authSessionProvider;
        this.f8706c = devNotificationManager;
        this.f8707d = servicesConfig;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f8704a) {
            case 0:
                InterfaceC2101b interfaceC2101b = (InterfaceC2101b) ((C2901g) this.f8706c).get();
                C1719b c1719b = (C1719b) ((C1992i) this.f8707d).get();
                InterfaceC4478i interfaceC4478i = (InterfaceC4478i) this.f8705b;
                if (interfaceC2101b != null) {
                    return interfaceC2101b;
                }
                Object obj = interfaceC4478i.get();
                C2109j c2109j = (C2109j) obj;
                c2109j.f6463b = c1719b.f4933a;
                AudioAttributes audioAttributes = c1719b.f4934b;
                c2109j.f6466e = audioAttributes.getContentType();
                c2109j.f6465d = audioAttributes.getUsage();
                c2109j.f6464c = c1719b.f4935c;
                AbstractC16544l.m18093f(obj, "apply(...)");
                return (InterfaceC2101b) obj;
            case 1:
                return new C3282c((Set) ((C4479j) this.f8705b).get(), (Set) ((InterfaceC4473d) this.f8706c).get(), (C17627a) ((C4474e) this.f8707d).f14617a);
            case 2:
                return new C4466y((InterfaceC5816j) ((InterfaceC4478i) this.f8705b).get(), (C11447L) ((InterfaceC4478i) this.f8706c).get(), (C13684e) ((C4375C) this.f8707d).get());
            case 3:
                C12869g c12869g = (C12869g) ((C2709c) this.f8706c).get();
                C5457j offlineModeApiController = (C5457j) ((C4474e) this.f8707d).f14617a;
                C3032c c3032c = (C3032c) this.f8705b;
                AbstractC16544l.m18094g(offlineModeApiController, "offlineModeApiController");
                InterfaceC5451d interfaceC5451d = (InterfaceC5451d) c3032c.f9127Z;
                if (interfaceC5451d instanceof C5450c) {
                    C21585H c21585h = offlineModeApiController.f17820a;
                    return new C5456i((C11447L) ((InterfaceC4478i) c21585h.f68344Z).get(), C4373B.m5169a(((C4373B) c21585h.f68345o0).f14241b), ((C5450c) interfaceC5451d).f17798a);
                }
                if (interfaceC5451d instanceof C5449b) {
                    return c12869g;
                }
                throw new C0644w();
            case 4:
                Object obj2 = ((C4471b) this.f8705b).get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f8706c.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f8707d.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C6894g((AbstractC21864z) obj2, (C11759b) obj3, (C6226E) obj4);
            case 5:
                Object obj5 = ((InterfaceC4478i) this.f8705b).get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                C4471b unauthorizedLogoutObserver = (C4471b) this.f8706c;
                AbstractC16544l.m18094g(unauthorizedLogoutObserver, "unauthorizedLogoutObserver");
                InterfaceC17068a staleAccountInformationObserver = this.f8707d;
                AbstractC16544l.m18094g(staleAccountInformationObserver, "staleAccountInformationObserver");
                return new C6900m((C2046c) obj5, unauthorizedLogoutObserver, staleAccountInformationObserver);
            case 6:
                Object obj6 = ((InterfaceC17068a) this.f8705b).get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                Object obj7 = ((C4479j) this.f8706c).get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = ((C4479j) this.f8707d).get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return ((C6752c) obj6).m7188a(new C5034f((Set) obj8, 26, (Set) obj7));
            case 7:
                Object obj9 = ((InterfaceC17068a) this.f8705b).get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f8706c.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                Object obj11 = ((C4479j) this.f8707d).get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                return new C14005w2((C17629c) obj9, (C13985r2) obj10, (Set) obj11);
            case 8:
                Object obj12 = this.f8706c.get();
                String str = WGTYqNchEpHca.qqTRevzyxWeXa;
                AbstractC16544l.m18093f(obj12, str);
                Object obj13 = ((InterfaceC4478i) this.f8705b).get();
                AbstractC16544l.m18093f(obj13, str);
                return new C18412b((C13969n2) obj12, (C18710h) obj13, (Locale) ((C1993j) this.f8707d).get());
            case 9:
                Object obj14 = ((C4474e) this.f8705b).f14617a;
                AbstractC16544l.m18093f(obj14, "get(...)");
                Object obj15 = ((C4474e) this.f8706c).f14617a;
                AbstractC16544l.m18093f(obj15, "get(...)");
                Object obj16 = this.f8707d.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C20610r((Application) obj14, (C18418a) obj15, (C17628b) obj16);
            default:
                Object obj17 = ((C4474e) this.f8705b).f14617a;
                AbstractC16544l.m18093f(obj17, "get(...)");
                Object obj18 = this.f8706c.get();
                AbstractC16544l.m18093f(obj18, "get(...)");
                return new C20945e((Application) obj17, (InterfaceC0832p) obj18, (C7634d) ((C1992i) this.f8707d).get(), new C20513d());
        }
    }

    public C2896b(C4474e context, C4474e accountSession, InterfaceC17068a releaseCompletable) {
        this.f8704a = 9;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(releaseCompletable, "releaseCompletable");
        this.f8705b = context;
        this.f8706c = accountSession;
        this.f8707d = releaseCompletable;
    }

    public C2896b(InterfaceC17068a configManager, InterfaceC4478i interfaceC4478i, C1993j locale) {
        this.f8704a = 8;
        AbstractC16544l.m18094g(configManager, "configManager");
        AbstractC16544l.m18094g(locale, "locale");
        this.f8706c = configManager;
        this.f8705b = interfaceC4478i;
        this.f8707d = locale;
    }

    public C2896b(C4474e context, InterfaceC17068a imageLoader, C1992i fileDownloader) {
        this.f8704a = 10;
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(imageLoader, "imageLoader");
        AbstractC16544l.m18094g(fileDownloader, "fileDownloader");
        this.f8705b = context;
        this.f8706c = imageLoader;
        this.f8707d = fileDownloader;
    }

    public C2896b(InterfaceC4478i interfaceC4478i, C4471b unauthorizedLogoutObserver, InterfaceC17068a staleAccountInformationObserver) {
        this.f8704a = 5;
        AbstractC16544l.m18094g(unauthorizedLogoutObserver, "unauthorizedLogoutObserver");
        AbstractC16544l.m18094g(staleAccountInformationObserver, "staleAccountInformationObserver");
        this.f8705b = interfaceC4478i;
        this.f8706c = unauthorizedLogoutObserver;
        this.f8707d = staleAccountInformationObserver;
    }

    public C2896b(C15370i c15370i, InterfaceC17068a baseClient, C4479j authProviders, C4479j c4479j) {
        this.f8704a = 6;
        AbstractC16544l.m18094g(baseClient, "baseClient");
        AbstractC16544l.m18094g(authProviders, "authProviders");
        this.f8705b = baseClient;
        this.f8706c = authProviders;
        this.f8707d = c4479j;
    }

    public C2896b(C2685e c2685e, InterfaceC17068a coroutineScope, InterfaceC17068a statsigInstance, C4479j c4479j) {
        this.f8704a = 7;
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(statsigInstance, "statsigInstance");
        this.f8705b = coroutineScope;
        this.f8706c = statsigInstance;
        this.f8707d = c4479j;
    }
}
