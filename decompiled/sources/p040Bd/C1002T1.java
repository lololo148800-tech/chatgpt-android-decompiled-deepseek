package p040Bd;

import cg.C11745q;
import com.openai.feature.rootviewmodel.RootViewModel;
import gd.C13969n2;
import gd.C13993t2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import p041Be.C1219L;
import p068Ce.C1641i;
import p1041uf.C20217f;
import p1081wc.InterfaceC20904w;
import p215Ic.C3690g;
import p248Jk.InterfaceC4473d;
import p315Me.C5330j;
import p338Ne.C5718f;
import p364Oh.C6226E;
import p374P5.C6358k;
import p409Qk.C6752c;
import p432Rh.C6889b;
import p432Rh.C6895h;
import p480Te.C7392q;
import p481Tf.C7403h;
import p708dh.C13133K;
import p727eh.C13404b;
import p811ih.C15000g;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;
import tg.C19945d;
import wf.C20945e;

/* JADX INFO: renamed from: Bd.T1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1002T1 implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2794a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f2795b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f2796c;

    public C1002T1(InterfaceC17068a httpClient, InterfaceC17068a requester, int i10) {
        this.f2794a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(httpClient, "httpClient");
                AbstractC16544l.m18094g(requester, "requester");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 2:
                AbstractC16544l.m18094g(httpClient, "analyticsService");
                AbstractC16544l.m18094g(requester, "experimentManager");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 3:
                AbstractC16544l.m18094g(httpClient, "api");
                AbstractC16544l.m18094g(requester, "conversationRepository");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 4:
                AbstractC16544l.m18094g(httpClient, "settingsRepository");
                AbstractC16544l.m18094g(requester, "accountUserProvider");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 5:
                AbstractC16544l.m18094g(httpClient, "requester");
                AbstractC16544l.m18094g(requester, "experimentManager");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 6:
                AbstractC16544l.m18094g(httpClient, "layerManager");
                AbstractC16544l.m18094g(requester, "rootEffectEmitter");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 7:
                AbstractC16544l.m18094g(httpClient, "requester");
                AbstractC16544l.m18094g(requester, "servicesConfig");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 8:
                AbstractC16544l.m18094g(httpClient, "experimentManager");
                AbstractC16544l.m18094g(requester, "configurationManager");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 9:
                AbstractC16544l.m18094g(httpClient, "configurationManager");
                AbstractC16544l.m18094g(requester, "analyticsService");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 10:
                AbstractC16544l.m18094g(httpClient, "manager");
                AbstractC16544l.m18094g(requester, "accountUserProvider");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 11:
                AbstractC16544l.m18094g(httpClient, "requester");
                AbstractC16544l.m18094g(requester, "analyticsService");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            case 12:
                AbstractC16544l.m18094g(httpClient, "imageDownloader");
                AbstractC16544l.m18094g(requester, "fileServiceApi");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
            default:
                AbstractC16544l.m18094g(httpClient, "experimentManager");
                AbstractC16544l.m18094g(requester, "configurationManager");
                this.f2795b = httpClient;
                this.f2796c = requester;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f2794a) {
            case 0:
                Object obj = this.f2795b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f2796c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C0996S1((InterfaceC13849E) obj, (C13969n2) obj2);
            case 1:
                Object obj3 = this.f2795b.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                Object obj4 = this.f2796c.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                return new C1219L((C6752c) obj3, (C6889b) obj4);
            case 2:
                Object obj5 = this.f2795b.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f2796c.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C5330j((InterfaceC20904w) obj5, (InterfaceC13849E) obj6);
            case 3:
                Object obj7 = this.f2795b.get();
                AbstractC16544l.m18093f(obj7, "get(...)");
                Object obj8 = this.f2796c.get();
                AbstractC16544l.m18093f(obj8, "get(...)");
                return new C5718f((C1641i) obj7, (C18077B) obj8);
            case 4:
                Object obj9 = this.f2795b.get();
                AbstractC16544l.m18093f(obj9, "get(...)");
                Object obj10 = this.f2796c.get();
                AbstractC16544l.m18093f(obj10, "get(...)");
                return new C3690g((C13133K) obj9, (C15000g) obj10, 1);
            case 5:
                Object obj11 = this.f2795b.get();
                AbstractC16544l.m18093f(obj11, "get(...)");
                Object obj12 = this.f2796c.get();
                AbstractC16544l.m18093f(obj12, "get(...)");
                return new C7392q((C6895h) obj11, (InterfaceC13849E) obj12);
            case 6:
                Object obj13 = this.f2795b.get();
                AbstractC16544l.m18093f(obj13, "get(...)");
                Object obj14 = this.f2796c.get();
                AbstractC16544l.m18093f(obj14, "get(...)");
                return new C7403h((C13993t2) obj13, (RootViewModel) obj14);
            case 7:
                Object obj15 = this.f2795b.get();
                AbstractC16544l.m18093f(obj15, "get(...)");
                Object obj16 = this.f2796c.get();
                AbstractC16544l.m18093f(obj16, "get(...)");
                return new C11745q((C6895h) obj15, (C6226E) obj16);
            case 8:
                Object obj17 = this.f2795b.get();
                AbstractC16544l.m18093f(obj17, "get(...)");
                Object obj18 = this.f2796c.get();
                AbstractC16544l.m18093f(obj18, "get(...)");
                return new C13404b((InterfaceC13849E) obj17, (C13969n2) obj18);
            case 9:
                Object obj19 = this.f2795b.get();
                AbstractC16544l.m18093f(obj19, "get(...)");
                Object obj20 = this.f2796c.get();
                AbstractC16544l.m18093f(obj20, "get(...)");
                return new C6358k((C13969n2) obj19, 2, (InterfaceC20904w) obj20);
            case 10:
                Object obj21 = this.f2795b.get();
                AbstractC16544l.m18093f(obj21, "get(...)");
                Object obj22 = this.f2796c.get();
                AbstractC16544l.m18093f(obj22, "get(...)");
                return new C3690g((InterfaceC13849E) obj21, (C15000g) obj22, 3);
            case 11:
                Object obj23 = this.f2795b.get();
                AbstractC16544l.m18093f(obj23, "get(...)");
                Object obj24 = this.f2796c.get();
                AbstractC16544l.m18093f(obj24, "get(...)");
                return new C19945d((C6889b) obj23, (InterfaceC20904w) obj24);
            default:
                Object obj25 = this.f2795b.get();
                AbstractC16544l.m18093f(obj25, "get(...)");
                Object obj26 = this.f2796c.get();
                AbstractC16544l.m18093f(obj26, "get(...)");
                return new C20217f((C20945e) obj25, (C7392q) obj26);
        }
    }
}
