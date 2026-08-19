package p016Ae;

import bg.C11400B;
import ck.InterfaceC11764a;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import ie.C14975d;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.ExternalAudioProcessingFactory;
import mo.C17356w;
import p020Ai.C0515d;
import p041Be.C1219L;
import p071Ch.C1681l;
import p071Ch.C1683n;
import p097Dh.C2051d;
import p100Dk.InterfaceC2094u;
import p1027tp.C20050O;
import p1061vb.C20513d;
import p1087wj.InterfaceC20971B;
import p120Ee.C2423q;
import p149Fj.InterfaceC2881o;
import p241Jc.C4327b;
import p242Je.C4329b;
import p242Je.C4330c;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p266Kc.C4638g;
import p313Mc.C5318b;
import p317Mg.C5350a;
import p320Mj.C5461n;
import p336Nc.C5706b;
import p342Nj.InterfaceC5816j;
import p361Oe.C6183j;
import p361Oe.C6185l;
import p431Rg.C6884c;
import p432Rh.C6889b;
import p432Rh.C6906s;
import p432Rh.C6907t;
import p456Sg.C7132c;
import p480Te.C7392q;
import p481Tf.C7401f;
import p486Tl.C7507f;
import p504Ue.C7635e;
import p529Vh.C8291d;
import p529Vh.C8292e;
import p544W9.AbstractC8446A2;
import p557Wl.C8949e;
import p577Xf.C9508g;
import p599Yf.C10058c;
import p603Yj.C10069b;
import p603Yj.C10071d;
import p623Zf.C10330z;
import p708dh.C13133K;
import p708dh.C13135M;
import p708dh.C13167u;
import p948pi.AbstractC18425h;
import p948pi.C18423f;
import sk.C19662a;
import vi.C20622d;
import vi.C20624f;
import vi.C20625g;
import vi.C20627i;

/* JADX INFO: renamed from: Ae.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C0453o implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1466a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f1467b;

    public /* synthetic */ C0453o(InterfaceC4478i interfaceC4478i, int i10) {
        this.f1466a = i10;
        this.f1467b = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f1466a) {
            case 0:
                Object obj = this.f1467b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                return new C0452n((C1219L) obj);
            case 1:
                Object obj2 = this.f1467b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C1683n((C20622d) obj2, "device_preferences", new C19662a(C1681l.Companion.serializer()), new C1681l());
            case 2:
                return new C2051d(this.f1467b);
            case 3:
                Object obj3 = this.f1467b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C2423q((C14975d) obj3, new C20513d());
            case 4:
                C8949e customAudioProcessingFactory = (C8949e) this.f1467b.get();
                AbstractC16544l.m18094g(customAudioProcessingFactory, "customAudioProcessingFactory");
                return customAudioProcessingFactory;
            case 5:
                C8949e customAudioProcessingFactory2 = (C8949e) this.f1467b.get();
                AbstractC16544l.m18094g(customAudioProcessingFactory2, "customAudioProcessingFactory");
                ExternalAudioProcessingFactory externalAudioProcessingFactory = customAudioProcessingFactory2.f27358a;
                AbstractC8446A2.m9048a(externalAudioProcessingFactory);
                return externalAudioProcessingFactory;
            case 6:
                C17356w okHttpClient = (C17356w) this.f1467b.get();
                AbstractC16544l.m18094g(okHttpClient, "okHttpClient");
                return okHttpClient;
            case 7:
                return new C4327b(this.f1467b);
            case 8:
                Object obj4 = this.f1467b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C4330c((C4329b) obj4);
            case 9:
                return new C4638g((C5350a) this.f1467b.get());
            case 10:
                return new C5318b((C5706b) this.f1467b.get());
            case 11:
                C5461n fallbackModeManager = (C5461n) this.f1467b.get();
                AbstractC16544l.m18094g(fallbackModeManager, "fallbackModeManager");
                return fallbackModeManager;
            case 12:
                C20050O retrofit = (C20050O) this.f1467b.get();
                AbstractC16544l.m18094g(retrofit, "retrofit");
                Object objM20872b = retrofit.m20872b(FallbackModeService.class);
                AbstractC16544l.m18093f(objM20872b, "create(...)");
                return (FallbackModeService) objM20872b;
            case 13:
                C20050O retrofit2 = (C20050O) this.f1467b.get();
                AbstractC16544l.m18094g(retrofit2, "retrofit");
                Object objM20872b2 = retrofit2.m20872b(InterfaceC20971B.class);
                AbstractC16544l.m18093f(objM20872b2, "create(...)");
                return (InterfaceC20971B) objM20872b2;
            case 14:
                C20050O retrofit3 = (C20050O) this.f1467b.get();
                AbstractC16544l.m18094g(retrofit3, "retrofit");
                Object objM20872b3 = retrofit3.m20872b(InterfaceC2881o.class);
                AbstractC16544l.m18093f(objM20872b3, "create(...)");
                return (InterfaceC2881o) objM20872b3;
            case 15:
                C20050O retrofit4 = (C20050O) this.f1467b.get();
                AbstractC16544l.m18094g(retrofit4, "retrofit");
                Object objM20872b4 = retrofit4.m20872b(InterfaceC5816j.class);
                AbstractC16544l.m18093f(objM20872b4, "create(...)");
                return (InterfaceC5816j) objM20872b4;
            case 16:
                C20050O retrofit5 = (C20050O) this.f1467b.get();
                AbstractC16544l.m18094g(retrofit5, "retrofit");
                Object objM20872b5 = retrofit5.m20872b(InterfaceC11764a.class);
                AbstractC16544l.m18093f(objM20872b5, "create(...)");
                return (InterfaceC11764a) objM20872b5;
            case 17:
                C20050O retrofit6 = (C20050O) this.f1467b.get();
                AbstractC16544l.m18094g(retrofit6, "retrofit");
                Object objM20872b6 = retrofit6.m20872b(InterfaceC2094u.class);
                AbstractC16544l.m18093f(objM20872b6, "create(...)");
                return (InterfaceC2094u) objM20872b6;
            case 18:
                Object obj5 = this.f1467b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C6183j((C6185l) obj5);
            case 19:
                Object obj6 = this.f1467b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C6906s((C6907t) obj6);
            case 20:
                Object obj7 = this.f1467b.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                return new C7132c((C6884c) obj7);
            case 21:
                Object obj8 = this.f1467b.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C7401f((C6889b) obj8);
            case 22:
                AbstractC16544l.m18094g((C17356w) this.f1467b.get(), "okHttpClient");
                return new C7507f();
            case 23:
                Object obj9 = this.f1467b.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                return new C7635e((C7392q) obj9);
            case 24:
                Object obj10 = this.f1467b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C8291d((C8292e) obj10);
            case 25:
                Object obj11 = this.f1467b.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                return new C9508g((C10058c) obj11);
            case 26:
                C10069b flags = (C10069b) this.f1467b.get();
                AbstractC16544l.m18094g(flags, "flags");
                return new C10071d(flags, 0);
            case 27:
                Object obj12 = this.f1467b.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                C20625g c20625g = (C20625g) obj12;
                C19662a c19662a = new C19662a(C10330z.Companion.serializer());
                C10330z c10330z = new C10330z(null, null, null, null, null);
                AbstractC18425h authSession = c20625g.f65463c;
                AbstractC16544l.m18094g(authSession, "authSession");
                C11400B c11400b = new C11400B(c20625g.f65461a, authSession instanceof C18423f ? "onboarding_".concat("onboarding") : "unauthenticated_".concat("onboarding"), c20625g.f65462b, c19662a, c10330z);
                c20625g.f65464d.m19237b(new C20624f(c11400b, null));
                return c11400b;
            case 28:
                Object obj13 = this.f1467b.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                return new C13167u((C20627i) obj13, "accountuser_state", new C19662a(C0515d.Companion.serializer()));
            default:
                Object obj14 = this.f1467b.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                return new C13133K((C13135M) obj14);
        }
    }

    public /* synthetic */ C0453o(Object obj, InterfaceC4478i interfaceC4478i, int i10) {
        this.f1466a = i10;
        this.f1467b = interfaceC4478i;
    }
}
