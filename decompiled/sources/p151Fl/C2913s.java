package p151Fl;

import android.app.Application;
import android.javax.sip.C10808o;
import android.view.Window;
import bj.C11447L;
import ci.C11759b;
import gd.C13969n2;
import gd.C13985r2;
import id.C14970i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.AbstractC17039i;
import livekit.org.webrtc.EglBase;
import ni.C17627a;
import ni.C17634h;
import p001A.C0017I0;
import p002A0.C0122V;
import p092Dc.C1992i;
import p092Dc.C1995l;
import p092Dc.C1999p;
import p101Dl.C2102c;
import p1027tp.AbstractC20060d;
import p1027tp.AbstractC20066j;
import p1027tp.C20044I;
import p1027tp.C20050O;
import p105E.C2222a;
import p1061vb.C20513d;
import p1081wc.C20881a0;
import p1081wc.C20884c;
import p1156zj.C22104J;
import p126Ek.InterfaceC2568a;
import p192He.C3294f;
import p193Hf.C3332T;
import p224Il.C3741a;
import p247Jj.C4373B;
import p248Jk.C4471b;
import p248Jk.C4474e;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p320Mj.C5461n;
import p320Mj.InterfaceC5448a;
import p322Ml.C5489b;
import p432Rh.C6901n;
import p446S6.C7022a;
import p472T6.C7258a;
import p557Wl.C8949e;
import p658b5.C11248s;
import p784hb.C14438g;
import p787he.C14459O;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p876lm.InterfaceC17068a;
import p905nd.C17592t;
import p905nd.C17595w;
import p908nk.C17645a;
import p949pj.C18438K;

/* JADX INFO: renamed from: Fl.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C2913s implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8739a;

    /* JADX INFO: renamed from: b */
    public final Object f8740b;

    /* JADX INFO: renamed from: c */
    public final Object f8741c;

    public /* synthetic */ C2913s(Object obj, InterfaceC4473d interfaceC4473d, int i10) {
        this.f8739a = i10;
        this.f8740b = obj;
        this.f8741c = interfaceC4473d;
    }

    public /* synthetic */ C2913s(Object obj, InterfaceC4478i interfaceC4478i, int i10) {
        this.f8739a = i10;
        this.f8741c = obj;
        this.f8740b = interfaceC4478i;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f8739a) {
            case 0:
                C2899e webrtcInitialization = (C2899e) ((InterfaceC4478i) this.f8740b).get();
                C2102c c2102c = (C2102c) ((C2901g) this.f8741c).get();
                AbstractC16544l.m18094g(webrtcInitialization, "webrtcInitialization");
                if (c2102c == null) {
                    c2102c = new C2102c();
                }
                return new C8949e(c2102c);
            case 1:
                EglBase eglBase = (EglBase) ((C2901g) this.f8741c).get();
                C3741a memoryManager = (C3741a) ((InterfaceC4478i) this.f8740b).get();
                AbstractC16544l.m18094g(memoryManager, "memoryManager");
                if (eglBase != null) {
                    return eglBase;
                }
                EglBase eglBaseM18861b = AbstractC17039i.m18861b();
                memoryManager.m4434a(new C2895a(eglBaseM18861b, 2));
                AbstractC16544l.m18093f(eglBaseM18861b, "apply(...)");
                return eglBaseM18861b;
            case 2:
                C3741a closeableManager = (C3741a) ((InterfaceC4478i) this.f8740b).get();
                C5489b c5489b = (C5489b) ((C1992i) this.f8741c).get();
                AbstractC16544l.m18094g(closeableManager, "closeableManager");
                return new C0122V(c5489b, 28, closeableManager);
            case 3:
                C1999p c1999p = (C1999p) ((C1995l) this.f8740b).get();
                Object obj = ((C4474e) this.f8741c).f14617a;
                AbstractC16544l.m18093f(obj, "get(...)");
                return new C3294f(c1999p, (C17627a) obj);
            case 4:
                Object obj2 = ((C4474e) this.f8740b).f14617a;
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = ((C4471b) this.f8741c).get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C3332T((C17634h) obj2, (C14459O) obj3);
            case 5:
                return new C5461n((InterfaceC5448a) ((C2896b) this.f8741c).get(), (C11447L) ((InterfaceC4478i) this.f8740b).get());
            case 6:
                C20050O c20050o = (C20050O) ((InterfaceC4478i) this.f8740b).get();
                C11248s c11248s = (C11248s) this.f8741c;
                AbstractC16544l.m18094g(c20050o, FpwNpGDhomXHZ.xcDcLWYzo);
                C0017I0 c0017i0 = new C0017I0();
                c0017i0.f67p0 = new ArrayList();
                c0017i0.f68q0 = new ArrayList();
                C20044I c20044i = C20044I.f63473c;
                c0017i0.f64Y = c20044i;
                c0017i0.f65Z = c20050o.f63533b;
                c0017i0.f66o0 = c20050o.f63534c;
                List list = c20050o.f63535d;
                int size = list.size() - (c20044i.f63474a ? 1 : 0);
                for (int i10 = 1; i10 < size; i10++) {
                    ((ArrayList) c0017i0.f67p0).add((AbstractC20066j) list.get(i10));
                }
                List list2 = c20050o.f63536e;
                int size2 = list2.size() - (((C20044I) c0017i0.f64Y).f63474a ? 2 : 1);
                for (int i11 = 0; i11 < size2; i11++) {
                    ((ArrayList) c0017i0.f68q0).add((AbstractC20060d) list2.get(i11));
                }
                c0017i0.f69r0 = c20050o.f63537f;
                c0017i0.m74i((String) c11248s.f34082o0);
                Object objM20872b = c0017i0.m75j().m20872b(InterfaceC2568a.class);
                AbstractC16544l.m18093f(objM20872b, "create(...)");
                return (InterfaceC2568a) objM20872b;
            case 7:
                Window window = (Window) ((C4373B) this.f8741c).get();
                C2222a c2222a = (C2222a) this.f8740b;
                return new C17645a(window, c2222a.f6805a, c2222a.f6806b);
            case 8:
                Object obj4 = ((InterfaceC4478i) this.f8740b).get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = ((C4479j) this.f8741c).get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C13969n2((C13985r2) obj4, (Set) obj5);
            case 9:
                C7022a c7022a = (C7022a) ((C1992i) this.f8740b).get();
                Object obj6 = ((C4474e) this.f8741c).f14617a;
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C7258a(c7022a, new C10808o((Application) obj6));
            case 10:
                Object obj7 = ((C4471b) this.f8741c).get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                C20513d c20513d = new C20513d();
                Object obj8 = ((InterfaceC4478i) this.f8740b).get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C17595w((C6901n) obj7, c20513d, (C11759b) obj8);
            case 11:
                Object obj9 = ((InterfaceC17068a) this.f8741c).get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                C20884c module = (C20884c) this.f8740b;
                AbstractC16544l.m18094g(module, "module");
                return new C20881a0((C13985r2) obj9);
            default:
                return new C22104J((C18438K) ((C14970i) this.f8741c).get(), new C14438g(), (C17645a) ((InterfaceC4478i) this.f8740b).get());
        }
    }

    public C2913s(C1995l c1995l, C4474e coroutineScope) {
        this.f8739a = 3;
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        this.f8740b = c1995l;
        this.f8741c = coroutineScope;
    }

    public C2913s(C4474e coroutineScope, C4471b conversationCoordinator) {
        this.f8739a = 4;
        AbstractC16544l.m18094g(coroutineScope, "coroutineScope");
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        this.f8740b = coroutineScope;
        this.f8741c = conversationCoordinator;
    }

    public C2913s(C4471b requester, InterfaceC4478i interfaceC4478i) {
        this.f8739a = 10;
        AbstractC16544l.m18094g(requester, "requester");
        this.f8741c = requester;
        this.f8740b = interfaceC4478i;
    }

    public C2913s(C20884c c20884c, InterfaceC17068a statsigInstance) {
        this.f8739a = 11;
        AbstractC16544l.m18094g(statsigInstance, "statsigInstance");
        this.f8740b = c20884c;
        this.f8741c = statsigInstance;
    }

    public C2913s(C17592t c17592t, C1992i c1992i, C4474e context) {
        this.f8739a = 9;
        AbstractC16544l.m18094g(context, "context");
        this.f8740b = c1992i;
        this.f8741c = context;
    }

    public C2913s(C20513d c20513d, InterfaceC4478i interfaceC4478i, C4479j evaluationListeners) {
        this.f8739a = 8;
        AbstractC16544l.m18094g(evaluationListeners, "evaluationListeners");
        this.f8740b = interfaceC4478i;
        this.f8741c = evaluationListeners;
    }
}
