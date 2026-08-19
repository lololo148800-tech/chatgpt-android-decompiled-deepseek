package p537W0;

import af.C10571a0;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import bf.C11349D;
import bf.C11364T;
import bf.InterfaceC11374b0;
import com.openai.feature.conversations.impl.conversation.AbstractC12312a;
import com.openai.feature.conversations.impl.variants.AbstractC12346a;
import com.openai.feature.conversations.impl.variants.VariantsInStreamViewModel;
import com.openai.feature.interstitial.FeatureInterstitialViewModel;
import com.openai.feature.onboarding.LoginViewModel;
import io.C15105o;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mh.AbstractC17270r;
import mh.C17274v;
import mm.C17296C;
import nc.AbstractC17566m;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4141u3;
import p229J0.C4135t3;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p403Qd.AbstractC6601G;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7987S3;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8050b0;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8106i0;
import p523V9.AbstractC8126k4;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8620d3;
import p544W9.AbstractC8650i3;
import p547Wc.C8786c;
import p547Wc.C8790e;
import p553Wh.C8870f;
import p562X0.C9013h;
import p562X0.InterfaceC9009d;
import p594Y9.AbstractC10009z4;
import p594Y9.AbstractC9698A4;
import p594Y9.AbstractC9798R3;
import p621Zd.C10282c;
import p623Zf.C10324t;
import p624Zg.AbstractC10374j;
import p624Zg.C10390v;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p842k0.AbstractC16306o;
import p842k0.C16293b;
import p882m1.AbstractC17140a;
import p895n1.C17425e;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p938p2.AbstractC18290d;
import p946pc.AbstractC18341g;
import p946pc.C18320E;
import p953q0.C18583h0;
import p965qf.AbstractC18702d;
import p990rg.C18982i;
import p990rg.C18983j;
import re.AbstractC18947B;
import sg.C19575q;
import sg.C19581w;

/* JADX INFO: renamed from: W0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8409a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26146Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f26147Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f26148o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f26149p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f26150q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8409a(InterfaceC9009d interfaceC9009d, Object obj, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f26146Y = i11;
        this.f26150q0 = interfaceC9009d;
        this.f26149p0 = obj;
        this.f26148o0 = c8410b;
        this.f26147Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f26150q0;
        Object obj4 = this.f26149p0;
        Object obj5 = this.f26148o0;
        int i10 = this.f26147Z;
        switch (this.f26146Y) {
            case 0:
                ((Number) obj2).intValue();
                ((C8410b) obj5).m8963b(obj4, obj3, (C6021p) obj, C5997d.m6447d0(i10) | 1);
                break;
            case 1:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
                    c6021p.m6524S(-1029645186);
                    C8790e c8790e = (C8790e) obj3;
                    C5984W0 c5984w0 = AbstractC4141u3.f13417a;
                    InterfaceC10459q interfaceC10459qM9045a = AbstractC8443A.m9045a((InterfaceC10459q) obj4, 0.0f, c8790e.f26888c, ((C4135t3) c6021p.m6548k(c5984w0)).f13379c);
                    C14365u c14365u = c8790e.f26889d;
                    if (c14365u != null) {
                        interfaceC10459qM9045a = AbstractC8443A.m9045a(interfaceC10459qM9045a, 0.0f, c14365u.f45062a, ((C4135t3) c6021p.m6548k(c5984w0)).f13379c);
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(AbstractC10842a.m11233k(AbstractC10833a.m11207b(interfaceC10459qM9045a, c8790e.f26887b, ((C4135t3) c6021p.m6548k(c5984w0)).f13379c), AbstractC7313q.f23200e), false, C8786c.f26851o0);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, C10444b.f30943v0, c6021p, 6);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM3789a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C21694h c21694h = C21698j.f68873f;
                    C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
                    C21694h c21694h2 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
                    }
                    C21694h c21694h4 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                    C17785t0 c17785t0 = C17785t0.f56761a;
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(i10, c6021p, 0), null, null, 0L, c6021p, 48, 12);
                    InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(C10456n.f30959Y, 1.0f, true);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19513a);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
                    }
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                    ((C8410b) obj5).invoke(c6021p, 0);
                    c6021p.m6553p(true);
                    c6021p.m6553p(true);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                C10282c c10282c = (C10282c) obj5;
                AbstractC9798R3.m10417c(c10282c, (String) obj4, (InterfaceC1436k) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                C9013h c9013h = (C9013h) obj3;
                c9013h.mo9594c(obj4, (C8410b) obj5, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                C10390v c10390v = (C10390v) obj5;
                AbstractC10374j.m10889c(c10390v, (InterfaceC1426a) obj4, (InterfaceC1426a) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                C8410b c8410b = (C8410b) obj5;
                AbstractC8050b0.m8440a(c8410b, (C8410b) obj4, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                C11364T c11364t = (C11364T) obj5;
                AbstractC8090g0.m8543b(c11364t, (C11349D) obj4, (InterfaceC1436k) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                C10571a0 c10571a0 = (C10571a0) obj5;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj4;
                AbstractC8090g0.m8559r(c10571a0, interfaceC1436k, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj5;
                AbstractC17140a abstractC17140a = (AbstractC17140a) obj4;
                AbstractC8106i0.m8588c(interfaceC1426a, abstractC17140a, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                AbstractC7987S3.m8289b((C10324t) obj5, (InterfaceC1436k) obj4, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                String str = (String) obj5;
                C8870f c8870f = (C8870f) obj4;
                AbstractC8018W4.m8344d(str, c8870f, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                InterfaceC11374b0 interfaceC11374b0 = (InterfaceC11374b0) obj5;
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj4;
                AbstractC8047a5.m8433f(interfaceC11374b0, interfaceC1426a2, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj5;
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) obj4;
                AbstractC12312a.m14260b(interfaceC1436k2, interfaceC10459q, (InterfaceC1436k) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                InterfaceC10459q interfaceC10459q2 = (InterfaceC10459q) obj5;
                FeatureInterstitialViewModel featureInterstitialViewModel = (FeatureInterstitialViewModel) obj4;
                AbstractC8620d3.m9269b(interfaceC10459q2, featureInterstitialViewModel, (LoginViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                C15105o c15105o = (C15105o) obj4;
                InterfaceC10459q interfaceC10459q3 = (InterfaceC10459q) obj3;
                AbstractC8650i3.m9321a(c15105o, interfaceC10459q3, (C8410b) obj5, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                C16293b c16293b = (C16293b) obj4;
                InterfaceC10459q interfaceC10459q4 = (InterfaceC10459q) obj3;
                AbstractC16306o.m17827a(c16293b, interfaceC10459q4, (C8410b) obj5, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                AbstractC17270r.m18973c((C17274v) obj5, (InterfaceC1426a) obj4, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 17:
                ((Number) obj2).intValue();
                String str2 = (String) obj5;
                AbstractC17566m.m19217a(str2, (String) obj4, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 18:
                ((Number) obj2).intValue();
                String str3 = (String) obj5;
                InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) obj4;
                AbstractC10009z4.m10648a(str3, interfaceC1436k3, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 19:
                ((Number) obj2).intValue();
                C18982i c18982i = (C18982i) obj5;
                InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) obj4;
                AbstractC9698A4.m10290a(c18982i, interfaceC1436k4, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 20:
                ((Number) obj2).intValue();
                C18983j c18983j = (C18983j) obj5;
                InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) obj4;
                AbstractC9698A4.m10291b(c18983j, interfaceC1436k5, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 21:
                ((Number) obj2).intValue();
                C18320E c18320e = (C18320E) obj5;
                String str4 = (String) obj4;
                AbstractC18341g.m19856b(c18320e, str4, (Boolean) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                C18320E c18320e2 = (C18320E) obj4;
                Boolean bool = (Boolean) obj3;
                AbstractC18341g.m19855a(c18320e2, bool, (C8410b) obj5, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 23:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    ((C8410b) obj5).mo985d((C18320E) obj4, ((List) obj3).get(i10), c6021p2, 0);
                }
                break;
            case 24:
                ((Number) obj2).intValue();
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) obj5;
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) obj4;
                AbstractC18290d.m19831a(interfaceC1426a3, interfaceC1426a4, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 25:
                ((Number) obj2).intValue();
                C18583h0 c18583h0 = (C18583h0) obj3;
                c18583h0.mo9594c(obj4, (C8410b) obj5, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 26:
                ((Number) obj2).intValue();
                C8870f c8870f2 = (C8870f) obj5;
                InterfaceC10459q interfaceC10459q5 = (InterfaceC10459q) obj4;
                AbstractC12346a.m14272a(c8870f2, interfaceC10459q5, (VariantsInStreamViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 27:
                ((Number) obj2).intValue();
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) obj5;
                AbstractC6601G abstractC6601G = (AbstractC6601G) obj4;
                AbstractC18702d.m20042a(interfaceC1426a5, abstractC6601G, (InterfaceC10459q) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 28:
                ((Number) obj2).intValue();
                InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) obj5;
                AbstractC18947B.m20276d(interfaceC1426a6, (C17425e) obj4, (String) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8086f4.m8522i((C19575q) obj5, (C19581w) obj4, (InterfaceC1436k) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8409a(InterfaceC10459q interfaceC10459q, C8790e c8790e, int i10, C8410b c8410b) {
        super(2);
        this.f26146Y = 1;
        this.f26149p0 = interfaceC10459q;
        this.f26150q0 = c8790e;
        this.f26147Z = i10;
        this.f26148o0 = c8410b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8409a(Object obj, Object obj2, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f26146Y = i11;
        this.f26149p0 = obj;
        this.f26150q0 = obj2;
        this.f26148o0 = c8410b;
        this.f26147Z = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8409a(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(2);
        this.f26146Y = i11;
        this.f26148o0 = obj;
        this.f26149p0 = obj2;
        this.f26150q0 = obj3;
        this.f26147Z = i10;
    }
}
