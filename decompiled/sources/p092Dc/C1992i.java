package p092Dc;

import android.net.ConnectivityManager;
import id.C14970i;
import io.sentry.clientreport.C15333a;
import io.sentry.hints.C15370i;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17356w;
import p016Ae.C0453o;
import p021Aj.C0539x;
import p071Ch.C1677h;
import p075Cl.C1719b;
import p1009s9.C19506i;
import p1061vb.C20513d;
import p110E4.C2307e;
import p1156zj.C22104J;
import p1156zj.C22116P;
import p1156zj.C22133Y;
import p1156zj.C22189r0;
import p140Fa.C2685e;
import p151Fl.C2901g;
import p151Fl.C2913s;
import p167Gb.C3032c;
import p247Jj.C4375C;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p322Ml.C5489b;
import p324Mn.C5531a;
import p386Pk.C6450b;
import p432Rh.C6901n;
import p446S6.C7022a;
import p451Sb.C7102a;
import p477Tb.C7296c;
import p486Tl.C7507f;
import p504Ue.C7634d;
import p544W9.AbstractC8446A2;
import p604Yk.C10077b;
import p647ak.C10635C;
import p647ak.C10657N;
import p647ak.C10668T;
import p647ak.C10718n0;
import p658b5.C11248s;
import p720e6.C13288c;
import p769gj.InterfaceC14147A;
import p770gk.InterfaceC14185a;
import p784hb.C14438g;
import p814ik.C15033e;
import p838jj.C16223d;
import p841k.C16288h;
import p905nd.C17591s;
import p909nm.AbstractC17678l;
import p909nm.C17691y;
import p931ok.C18230k;
import p949pj.C18470i0;
import p960q9.C18655i;

/* JADX INFO: renamed from: Dc.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1992i implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5890a;

    /* JADX INFO: renamed from: b */
    public final Object f5891b;

    public /* synthetic */ C1992i(Object obj, int i10) {
        this.f5890a = i10;
        this.f5891b = obj;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        C17691y c17691y = C17691y.f56482Y;
        Object obj = this.f5891b;
        switch (this.f5890a) {
            case 0:
                ((C20513d) obj).getClass();
                return C5531a.f17986a;
            case 1:
                ((C2685e) obj).getClass();
                return c17691y;
            case 2:
                ((C7102a) obj).getClass();
                return C6450b.f20928a;
            case 3:
                return ((C1719b) ((C1992i) obj).get()).f4934b;
            case 4:
                C1719b c1719b = (C1719b) ((C2901g) obj).get();
                return c1719b == null ? new C1719b() : c1719b;
            case 5:
                return (C7507f) ((C0453o) obj).get();
            case 6:
                return new C5489b((ConnectivityManager) ((C1993j) obj).get());
            case 7:
                C17356w c17356w = (C17356w) ((C2901g) obj).get();
                return c17356w == null ? new C17356w() : c17356w;
            case 8:
                return (String) ((C11248s) obj).f34081Z;
            case 9:
                C16288h c16288h = (C16288h) ((C13288c) obj).f42001Y;
                AbstractC8446A2.m9048a(c16288h);
                return c16288h;
            case 10:
                C16288h c16288h2 = (C16288h) ((C18655i) obj).f59414Z;
                AbstractC8446A2.m9048a(c16288h2);
                return c16288h2;
            case 11:
                C16288h c16288h3 = (C16288h) ((C19506i) obj).f61960Z;
                AbstractC8446A2.m9048a(c16288h3);
                return c16288h3;
            case 12:
                C16288h c16288h4 = (C16288h) ((C3032c) obj).f9127Z;
                AbstractC8446A2.m9048a(c16288h4);
                return c16288h4;
            case 13:
                C15370i module = (C15370i) obj;
                AbstractC16544l.m18094g(module, "module");
                return c17691y;
            case 14:
                Object obj2 = ((C4471b) obj).get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                return new C7634d((C6901n) obj2);
            case 15:
                C16288h c16288h5 = (C16288h) ((C7296c) obj).f23104Z;
                AbstractC8446A2.m9048a(c16288h5);
                return c16288h5;
            case 16:
                return new C10635C(new C14438g(), (C18470i0) ((C14970i) obj).get());
            case 17:
                return AbstractC17678l.m19293P(new InterfaceC14147A[]{C10657N.f31640c, (C10635C) ((C1992i) obj).get(), C10718n0.f31843c, C10668T.f31665a});
            case 18:
                return (C15033e) ((C4375C) obj).get();
            case 19:
                InterfaceC14185a interfaceC14185a = (InterfaceC14185a) ((C10077b) obj).f29833Z;
                AbstractC8446A2.m9048a(interfaceC14185a);
                return interfaceC14185a;
            case 20:
                return (C2307e) ((C15333a) obj).f47885Y;
            case 21:
                return new C7022a((C17591s) ((C1677h) obj).get());
            default:
                return AbstractC17678l.m19293P(new InterfaceC14147A[]{C22116P.f69904e, (C22104J) ((C2913s) obj).get(), C22133Y.f69965e, C22189r0.f70257c, C16223d.f50336t0, C18230k.f58081p0, C0539x.f1715c});
        }
    }

    public /* synthetic */ C1992i(Object obj, InterfaceC4473d interfaceC4473d, int i10) {
        this.f5890a = i10;
        this.f5891b = interfaceC4473d;
    }

    public C1992i(C4471b requester) {
        this.f5890a = 14;
        AbstractC16544l.m18094g(requester, "requester");
        this.f5891b = requester;
    }
}
