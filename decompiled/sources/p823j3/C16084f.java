package p823j3;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.google.android.material.button.MaterialButton;
import com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModel;
import com.openai.feature.licenses.impl.LicensesViewModel;
import com.openai.feature.reporting.ReportingViewModel;
import com.openai.feature.reporting.impl.ReportingViewModelImpl;
import com.withpersona.sdk2.inquiry.network.dto.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import nf.C17605d;
import nf.C17608g;
import ni.C17627a;
import p002A0.C0120T;
import p003A1.AbstractC0187M0;
import p003A1.C0185L1;
import p003A1.C0256i;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0182K1;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1000s0.C19408d;
import p1000s0.C19425u;
import p1000s0.C19426v;
import p1058v7.C20472d;
import p1062vd.C20522B;
import p1062vd.C20543X;
import p1062vd.C20567q;
import p1063vf.C20608p;
import p1063vf.C20613u;
import p1071w0.C20718K0;
import p1071w0.C20750g0;
import p1071w0.C20768p0;
import p1081wc.C20857C;
import p1081wc.C20859E;
import p1081wc.InterfaceC20904w;
import p1110xk.AbstractC21282e;
import p1113xn.AbstractC21322p;
import p1139z0.C21612e0;
import p1139z0.C21640s0;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p200Hm.C3508g;
import p204I1.C3581L;
import p204I1.C3587c;
import p204I1.C3590f;
import p207I4.InterfaceC3617d;
import p233J4.C4256b;
import p269Kh.C4679f;
import p269Kh.C4688o;
import p349O0.C5944C;
import p349O0.InterfaceC5985X;
import p350O1.C6045C;
import p350O1.C6064m;
import p350O1.C6065n;
import p403Qd.AbstractC6659u;
import p523V9.AbstractC8096g6;
import p547Wc.C8775T;
import p569X7.EnumC9072a;
import p571X9.AbstractC9113C4;
import p586Y0.C9566r;
import p593Y8.C9683j;
import p690cp.C12924j;
import p737f1.AbstractC13512d;
import p749fd.C13621f;
import p749fd.C13625j;
import p759g1.C13801c;
import p825j5.C16125b;
import p870le.AbstractC16848E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17690x;
import p926of.C18153P;
import p953q0.C18561T;
import p977r0.C18833e;
import p977r0.C18834f;
import p977r0.C18852x;
import p990rg.C18985l;
import sg.C19555T;
import sg.C19578t;
import ye.EnumC21517f;

/* JADX INFO: renamed from: j3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C16084f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f49809Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f49810Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f49811o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16084f(Object obj, int i10, Object obj2) {
        super(0);
        this.f49809Y = i10;
        this.f49810Z = obj;
        this.f49811o0 = obj2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C4256b c4256bMo4328d0;
        C3590f c3590fM4297i;
        int i10 = 2;
        int i11 = 1;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f49811o0;
        Object obj2 = this.f49810Z;
        switch (this.f49809Y) {
            case 0:
                AbstractC0575H.m1156D((InterfaceC0571F) obj2, null, null, new C16083e((C16099u) obj, null), 3);
                return c17296c;
            case 1:
                InterfaceC3617d interfaceC3617d = (InterfaceC3617d) ((C9683j) obj2).f29192Z;
                if (interfaceC3617d != null && (c4256bMo4328d0 = interfaceC3617d.mo4328d0()) != null) {
                    return c4256bMo4328d0;
                }
                C4256b c4256b = (C4256b) obj;
                AbstractC16544l.m18091d(c4256b);
                return c4256b;
            case 2:
                return new C16125b(((C9683j) obj2).m10271E().m5026k((String) obj));
            case 3:
                ((InterfaceC1436k) obj2).invoke(AbstractC16848E.f54035a[((EnumC21517f) obj).ordinal()] == 1 ? EnumC21517f.f68138Z : EnumC21517f.f68139o0);
                return c17296c;
            case 4:
                if (((C4688o) AbstractC17680n.m19343S(((C4679f) obj2).f15229b)) != null) {
                    ((InterfaceC1426a) obj).invoke();
                }
                return c17296c;
            case 5:
                ((InterfaceC1436k) obj2).invoke((C4679f) obj);
                return c17296c;
            case 6:
                ((LicensesViewModel) obj2).m14395k(new C17605d((C17608g) obj));
                return c17296c;
            case 7:
                ((InterfaceC1436k) obj2).invoke((C18985l) obj);
                return c17296c;
            case 8:
                ((ClipboardManager) obj2).setPrimaryClip(ClipData.newPlainText("", (String) obj));
                return c17296c;
            case 9:
                C18833e c18833e = (C18833e) ((C5944C) obj2).getValue();
                C18852x c18852x = (C18852x) obj;
                return new C18834f(c18852x, c18833e, new C0420b((C3508g) ((C18561T) c18852x.f60042a.f2242h).getValue(), c18833e));
            case 10:
                AbstractC21282e.m21624c((MaterialButton) obj2, (BaseButtonComponentStyle) obj, false, 6);
                return c17296c;
            case 11:
                AbstractC21282e.m21622a((ButtonWithLoadingIndicator) obj2, (BaseButtonComponentStyle) obj);
                return c17296c;
            case 12:
                C19425u c19425u = (C19425u) ((C5944C) obj2).getValue();
                C19408d c19408d = (C19408d) obj;
                return new C19426v(c19408d, c19425u, new C0420b((C3508g) ((C18561T) c19408d.f61440c.f209r0).getValue(), c19425u));
            case 13:
                ((InterfaceC1436k) obj2).invoke(new C19555T(((C19578t) obj).f62174h));
                return c17296c;
            case 14:
                ((ReportingViewModelImpl) ((ReportingViewModel) obj2)).m14341p();
                ((InterfaceC1426a) obj).invoke();
                return c17296c;
            case 15:
                C13801c c13801c = (C13801c) obj2;
                if (c13801c != null) {
                    return c13801c;
                }
                AbstractC21678Y abstractC21678Y = (AbstractC21678Y) obj;
                if (!abstractC21678Y.mo22159J0().f30972y0) {
                    abstractC21678Y = null;
                }
                if (abstractC21678Y != null) {
                    return AbstractC8096g6.m8568b(0L, AbstractC9113C4.m9645c(abstractC21678Y.f66983o0));
                }
                return null;
            case 16:
                C13625j c13625j = (C13625j) obj2;
                InterfaceC20904w analyticsService = (InterfaceC20904w) obj;
                AbstractC16544l.m18094g(analyticsService, "analyticsService");
                analyticsService.mo21447a(C20859E.f66351e, C17690x.f56481Y);
                C9566r c9566r = c13625j.f43049b;
                if (!c9566r.isEmpty()) {
                    c9566r.remove(AbstractC17681o.m19381j(c9566r));
                    C9566r c9566r2 = c13625j.f43051d;
                    c13625j.f43050c.add((C13621f) c9566r2.remove(AbstractC17681o.m19381j(c9566r2)));
                }
                return c17296c;
            case 17:
                return "Unexpected consent migration from " + ((EnumC9072a) obj2) + " to " + ((EnumC9072a) obj);
            case 18:
                return String.format(Locale.US, "The file provided (%s) doesn't belong to the current folder (%s)", Arrays.copyOf(new Object[]{((File) obj2).getPath(), ((C20472d) obj).f64982Y.getPath()}, 2));
            case 19:
                AbstractC0575H.m1156D((InterfaceC0571F) obj2, null, null, new C20543X((C8775T) obj, null), 3);
                return c17296c;
            case 20:
                ((InterfaceC20904w) obj2).mo21447a(C20857C.f66336r, C17690x.f56481Y);
                ((GizmosAndHistoryViewModel) obj).m14395k(C20522B.f65149a);
                return c17296c;
            case 21:
                C20608p c20608p = (C20608p) obj;
                return new C20613u((C17627a) obj2, c20608p.f65396o0.f65403a, new C20567q(c20608p, i11));
            case 22:
                C6045C c6045c = (C6045C) obj2;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj;
                if (!C3581L.m4266b(c6045c.f19683b, ((C6045C) interfaceC5985X.getValue()).f19683b) || !AbstractC16544l.m18089b(c6045c.f19684c, ((C6045C) interfaceC5985X.getValue()).f19684c)) {
                    interfaceC5985X.setValue(c6045c);
                }
                return c17296c;
            case 23:
                C20718K0 c20718k0 = (C20718K0) obj2;
                if (c20718k0 != null) {
                    C9566r c9566r3 = c20718k0.f65693d;
                    if (c9566r3.isEmpty()) {
                        c3590fM4297i = c20718k0.f65692c;
                    } else {
                        C3587c c3587c = new C3587c();
                        c3587c.m4290b(c20718k0.f65690a);
                        C20768p0 c20768p0 = new C20768p0(c3587c);
                        int size = c9566r3.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            ((InterfaceC1436k) c9566r3.get(i12)).invoke(c20768p0);
                        }
                        c3590fM4297i = c3587c.m4297i();
                    }
                    c20718k0.f65692c = c3590fM4297i;
                    if (c3590fM4297i != null) {
                        return c3590fM4297i;
                    }
                }
                return (C3590f) obj;
            case 24:
                ((C20750g0) obj2).f65830u.invoke(new C6064m(((C6065n) obj).f19760e));
                return Boolean.TRUE;
            case 25:
                String str = ((C12924j) obj).f41079l;
                AbstractC16544l.m18093f(str, "getLiteral(...)");
                ((InterfaceC1436k) obj2).invoke(AbstractC21322p.m21711s0(str).toString());
                return c17296c;
            case 26:
                ((InterfaceC1436k) obj2).invoke(new C18153P((AbstractC6659u) obj));
                return c17296c;
            case 27:
                ((C0256i) ((InterfaceC0172H0) obj2)).m827c((C3590f) obj);
                return c17296c;
            case 28:
                C21612e0 c21612e0 = (C21612e0) obj2;
                c21612e0.f68459E0.m21881c();
                if (c21612e0.f30972y0 && ((C0185L1) ((InterfaceC0182K1) AbstractC21690f.m22204i(c21612e0, AbstractC0187M0.f716r))).m565a()) {
                    i10 = 1;
                }
                C16558z c16558z = (C16558z) obj;
                Integer numValueOf = Integer.valueOf(i10 * c16558z.f51287Y);
                c16558z.f51287Y *= -1;
                return numValueOf;
            default:
                if (!((C0120T) obj2).f504f) {
                    AbstractC13512d.m15028A((C21640s0) obj);
                }
                return c17296c;
        }
    }
}
