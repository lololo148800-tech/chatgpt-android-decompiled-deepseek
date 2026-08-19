package p873lh;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17628b;
import ni.C17629c;
import ni.C17635i;
import ni.C17637k;
import ni.C17642p;
import p016Ae.C0452n;
import p071Ch.C1676g;
import p1039ud.C20192i;
import p1041uf.C20212a;
import p1081wc.InterfaceC20904w;
import p1083we.C20921g;
import p1084wg.C20949d;
import p148Fi.C2786R0;
import p248Jk.InterfaceC4473d;
import p432Rh.C6889b;
import p432Rh.C6895h;
import p580Xi.C9517c;
import p876lm.InterfaceC17068a;
import p905nd.C17572E;
import p909nm.C17691y;
import p925oe.C18102a0;
import p925oe.C18120j0;
import p925oe.C18122k0;
import p925oe.C18129r;
import p928oh.C18196c;
import p947pd.C18367g;
import p948pi.C18422e;
import p966qg.C18710h;
import sk.C19662a;
import ve.C20577a;
import ve.C20584h;
import vi.C20620b;
import vi.C20622d;

/* JADX INFO: renamed from: lh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16951b implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54403a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f54404b;

    public C16951b(InterfaceC17068a dependencies, int i10) {
        this.f54403a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(dependencies, "dependencies");
                this.f54404b = dependencies;
                break;
            case 2:
                AbstractC16544l.m18094g(dependencies, "appCoroutineScope");
                this.f54404b = dependencies;
                break;
            case 3:
                AbstractC16544l.m18094g(dependencies, "appCoroutineScope");
                this.f54404b = dependencies;
                break;
            case 4:
                AbstractC16544l.m18094g(dependencies, "appCoroutineScope");
                this.f54404b = dependencies;
                break;
            case 5:
                AbstractC16544l.m18094g(dependencies, "appCoroutineScope");
                this.f54404b = dependencies;
                break;
            case 6:
                AbstractC16544l.m18094g(dependencies, "dependencies");
                this.f54404b = dependencies;
                break;
            case 7:
                AbstractC16544l.m18094g(dependencies, "dependencies");
                this.f54404b = dependencies;
                break;
            case 8:
                AbstractC16544l.m18094g(dependencies, "requester");
                this.f54404b = dependencies;
                break;
            case 9:
                AbstractC16544l.m18094g(dependencies, "requester");
                this.f54404b = dependencies;
                break;
            case 10:
                AbstractC16544l.m18094g(dependencies, "requester");
                this.f54404b = dependencies;
                break;
            case 11:
                AbstractC16544l.m18094g(dependencies, "apiService");
                this.f54404b = dependencies;
                break;
            case 12:
                AbstractC16544l.m18094g(dependencies, "analyticsService");
                this.f54404b = dependencies;
                break;
            case 13:
                AbstractC16544l.m18094g(dependencies, "dependencies");
                this.f54404b = dependencies;
                break;
            case 14:
                AbstractC16544l.m18094g(dependencies, "devicePreferences");
                this.f54404b = dependencies;
                break;
            case 15:
                AbstractC16544l.m18094g(dependencies, "requester");
                this.f54404b = dependencies;
                break;
            case 16:
                AbstractC16544l.m18094g(dependencies, "analyticsService");
                this.f54404b = dependencies;
                break;
            default:
                AbstractC16544l.m18094g(dependencies, "dependencies");
                this.f54404b = dependencies;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f54403a) {
            case 0:
                Object obj = this.f54404b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                return new C16950a((C20620b) obj, "voice_options", new C19662a(C2786R0.Companion.serializer()), null);
            case 1:
                Object obj2 = this.f54404b.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C17572E((C20622d) obj2, ParameterNames.SESSION, new C19662a(C18422e.Companion.serializer()), null);
            case 2:
                Object obj3 = this.f54404b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C17628b((C17629c) obj3);
            case 3:
                Object obj4 = this.f54404b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C17635i((C17629c) obj4);
            case 4:
                Object obj5 = this.f54404b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                return new C17637k((C17629c) obj5);
            case 5:
                Object obj6 = this.f54404b.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C17642p((C17629c) obj6);
            case 6:
                Object obj7 = this.f54404b.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                return new C18129r((C20620b) obj7, "actively_streaming", new C19662a(C18102a0.Companion.serializer()), new C18102a0(C17691y.f56482Y));
            case 7:
                Object obj8 = this.f54404b.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                C19662a c19662a = new C19662a(C18120j0.Companion.serializer());
                C17691y c17691y = C17691y.f56482Y;
                return new C18122k0((C20620b) obj8, "unread_conversation", c19662a, new C18120j0(c17691y, c17691y));
            case 8:
                Object obj9 = this.f54404b.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                return new C18196c((C6889b) obj9);
            case 9:
                Object obj10 = this.f54404b.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C18367g((C6895h) obj10);
            case 10:
                Object obj11 = this.f54404b.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                return new C18710h((C6889b) obj11);
            case 11:
                Object obj12 = this.f54404b.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C20192i((C0452n) obj12);
            case 12:
                Object obj13 = this.f54404b.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                return new C20212a((InterfaceC20904w) obj13);
            case 13:
                Object obj14 = this.f54404b.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                return new C20577a((C20620b) obj14, "custom_instructions", new C19662a(C20584h.Companion.serializer()), null);
            case 14:
                Object obj15 = this.f54404b.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                return new C9517c((C1676g) obj15, 1);
            case 15:
                Object obj16 = this.f54404b.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C20921g((C6889b) obj16);
            default:
                Object obj17 = this.f54404b.get();
                AbstractC16544l.m18093f(obj17, "get(...)");
                return new C20949d((InterfaceC20904w) obj17);
        }
    }
}
