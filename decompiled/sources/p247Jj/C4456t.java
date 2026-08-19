package p247Jj;

import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import ck.C11773j;
import com.withpersona.sdk2.inquiry.network.NetworkModule;
import com.withpersona.sdk2.inquiry.network.NetworkModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.NetworkModule_UseServerStylesFactory;
import fo.C13711h;
import id.C14970i;
import io.sentry.C15358g1;
import io.sentry.clientreport.C15333a;
import io.sentry.hints.C15370i;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0017I0;
import p016Ae.C0453o;
import p046Bk.AbstractC1340N;
import p046Bk.C1326G;
import p046Bk.C1342O;
import p046Bk.C1379e1;
import p092Dc.C1992i;
import p1009s9.C19506i;
import p1044uj.AbstractC20358r;
import p105E.C2222a;
import p1139z0.C21585H;
import p1156zj.AbstractC22121S;
import p1156zj.C22102I;
import p117Eb.C2392v;
import p125Ej.C2562f;
import p125Ej.C2563g;
import p142Fc.C2709c;
import p149Fj.C2892z;
import p151Fl.C2896b;
import p151Fl.C2913s;
import p167Gb.C3032c;
import p248Jk.C4472c;
import p248Jk.C4474e;
import p248Jk.C4475f;
import p248Jk.C4476g;
import p248Jk.C4479j;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import p310M9.C5311e;
import p320Mj.C5457j;
import p342Nj.AbstractC5814h;
import p342Nj.C5815i;
import p385Pj.C6429d;
import p408Qj.AbstractC6743i;
import p477Tb.C7296c;
import p531Vj.AbstractC8367f0;
import p531Vj.C8361c0;
import p531Vj.C8376o;
import p531Vj.C8387z;
import p544W9.AbstractC8452B2;
import p603Yj.AbstractC10070c;
import p604Yk.C10077b;
import p647ak.C10633B;
import p658b5.C11241l;
import p658b5.C11242m;
import p658b5.C11248s;
import p720e6.C13287b;
import p720e6.C13288c;
import p813ij.C15026j;
import p839jk.C16252i;
import p841k.AbstractC16283c;
import p949pj.C18433F;
import p949pj.C18490u;
import p949pj.C18491v;
import p960q9.C18655i;
import p993rj.C19026F;

/* JADX INFO: renamed from: Jj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C4456t {

    /* JADX INFO: renamed from: A */
    public final InterfaceC4478i f14504A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC4478i f14505B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC4478i f14506C;

    /* JADX INFO: renamed from: D */
    public final C14970i f14507D;

    /* JADX INFO: renamed from: E */
    public final C0017I0 f14508E;

    /* JADX INFO: renamed from: F */
    public final C4474e f14509F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC4478i f14510G;

    /* JADX INFO: renamed from: H */
    public final C15358g1 f14511H;

    /* JADX INFO: renamed from: I */
    public final C4474e f14512I;

    /* JADX INFO: renamed from: J */
    public final C11241l f14513J;

    /* JADX INFO: renamed from: K */
    public final C4474e f14514K;

    /* JADX INFO: renamed from: L */
    public final C1992i f14515L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC4478i f14516M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC4478i f14517N;

    /* JADX INFO: renamed from: O */
    public final C11248s f14518O;

    /* JADX INFO: renamed from: P */
    public final C4474e f14519P;

    /* JADX INFO: renamed from: Q */
    public final C14970i f14520Q;

    /* JADX INFO: renamed from: R */
    public final C2562f f14521R;

    /* JADX INFO: renamed from: S */
    public final C4474e f14522S;

    /* JADX INFO: renamed from: T */
    public final C2562f f14523T;

    /* JADX INFO: renamed from: U */
    public final C4474e f14524U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC4478i f14525V;

    /* JADX INFO: renamed from: W */
    public final InterfaceC4478i f14526W;

    /* JADX INFO: renamed from: X */
    public final InterfaceC4478i f14527X;

    /* JADX INFO: renamed from: Y */
    public final C2392v f14528Y;

    /* JADX INFO: renamed from: Z */
    public final C4474e f14529Z;

    /* JADX INFO: renamed from: a */
    public final C13287b f14530a;

    /* JADX INFO: renamed from: a0 */
    public final InterfaceC4478i f14531a0;

    /* JADX INFO: renamed from: b */
    public final C10077b f14532b;

    /* JADX INFO: renamed from: b0 */
    public final C14970i f14533b0;

    /* JADX INFO: renamed from: c */
    public final C15333a f14534c;

    /* JADX INFO: renamed from: c0 */
    public final C15384c f14535c0;

    /* JADX INFO: renamed from: d */
    public final C1992i f14536d;

    /* JADX INFO: renamed from: d0 */
    public final C4474e f14537d0;

    /* JADX INFO: renamed from: e */
    public final C4479j f14538e;

    /* JADX INFO: renamed from: e0 */
    public final InterfaceC4478i f14539e0;

    /* JADX INFO: renamed from: f */
    public final C4479j f14540f;

    /* JADX INFO: renamed from: f0 */
    public final InterfaceC4478i f14541f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4478i f14542g;

    /* JADX INFO: renamed from: g0 */
    public final InterfaceC4478i f14543g0;

    /* JADX INFO: renamed from: h */
    public final NetworkModule_ResponseInterceptorFactory f14544h;

    /* JADX INFO: renamed from: h0 */
    public final C5311e f14545h0;

    /* JADX INFO: renamed from: i */
    public final NetworkModule_InterceptorFactory f14546i;

    /* JADX INFO: renamed from: i0 */
    public final C4474e f14547i0;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4478i f14548j;

    /* JADX INFO: renamed from: j0 */
    public final C13711h f14549j0;

    /* JADX INFO: renamed from: k */
    public final C0453o f14550k;

    /* JADX INFO: renamed from: k0 */
    public final C4474e f14551k0;

    /* JADX INFO: renamed from: l */
    public final C4479j f14552l;

    /* JADX INFO: renamed from: l0 */
    public final InterfaceC4478i f14553l0;

    /* JADX INFO: renamed from: m */
    public final NetworkModule_KeyInflectionFactory f14554m;

    /* JADX INFO: renamed from: m0 */
    public final InterfaceC4478i f14555m0;

    /* JADX INFO: renamed from: n */
    public final NetworkModule_UseServerStylesFactory f14556n;

    /* JADX INFO: renamed from: n0 */
    public final InterfaceC4478i f14557n0;

    /* JADX INFO: renamed from: o */
    public final C4476g f14558o;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC4478i f14559o0;

    /* JADX INFO: renamed from: p */
    public final C4373B f14560p;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC4478i f14561p0;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4478i f14562q;

    /* JADX INFO: renamed from: q0 */
    public final C4373B f14563q0;

    /* JADX INFO: renamed from: r */
    public final InterfaceC4478i f14564r;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC4478i f14565r0;

    /* JADX INFO: renamed from: s */
    public final InterfaceC4478i f14566s;

    /* JADX INFO: renamed from: s0 */
    public final C2913s f14567s0;

    /* JADX INFO: renamed from: t */
    public final C2709c f14568t;

    /* JADX INFO: renamed from: t0 */
    public final C1992i f14569t0;

    /* JADX INFO: renamed from: u */
    public final InterfaceC4478i f14570u;

    /* JADX INFO: renamed from: u0 */
    public final C1992i f14571u0;

    /* JADX INFO: renamed from: v */
    public final InterfaceC4478i f14572v;

    /* JADX INFO: renamed from: v0 */
    public final C1992i f14573v0;

    /* JADX INFO: renamed from: w */
    public final C4474e f14574w;

    /* JADX INFO: renamed from: w0 */
    public final C4479j f14575w0;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4478i f14576x;

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC4478i f14577x0;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4478i f14578y;

    /* JADX INFO: renamed from: y0 */
    public final C4375C f14579y0;

    /* JADX INFO: renamed from: z */
    public final C1992i f14580z;

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC4478i f14581z0;

    public C4456t(NetworkModule networkModule, C11248s c11248s, C18655i c18655i, C18490u c18490u, C19506i c19506i, C13287b c13287b, C13288c c13288c, C11242m c11242m, C15370i c15370i, C7296c c7296c, C10077b c10077b, C15370i c15370i2, C2222a c2222a, C3032c c3032c, C15333a c15333a, C3032c c3032c2) {
        this.f14530a = c13287b;
        this.f14532b = c10077b;
        this.f14534c = c15333a;
        this.f14536d = new C1992i(c11248s, 8);
        C4474e c4474e = C4479j.f14619c;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(AbstractC8452B2.m9063b(AbstractC5814h.f18980c));
        this.f14538e = new C4479j(listEmptyList, arrayList);
        List listEmptyList2 = Collections.emptyList();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(AbstractC8452B2.m9063b(AbstractC5814h.f18979b));
        this.f14540f = new C4479j(listEmptyList2, arrayList2);
        List listEmptyList3 = Collections.emptyList();
        ArrayList arrayList3 = new ArrayList(3);
        arrayList3.add(AbstractC8452B2.m9063b(NetworkModule_ProvideMoshiJsonAdapterFactoryFactory.create()));
        arrayList3.add(AbstractC8452B2.m9063b(AbstractC5814h.f18981d));
        arrayList3.add(AbstractC8452B2.m9063b(AbstractC22121S.f69931a));
        InterfaceC4478i interfaceC4478iM5205a = C4472c.m5205a(AbstractC8452B2.m9063b(NetworkModule_MoshiFactory.create(networkModule, this.f14538e, this.f14540f, new C4479j(listEmptyList3, arrayList3))));
        this.f14542g = interfaceC4478iM5205a;
        this.f14544h = NetworkModule_ResponseInterceptorFactory.create(networkModule, interfaceC4478iM5205a);
        this.f14546i = NetworkModule_InterceptorFactory.create(networkModule, this.f14542g);
        InterfaceC4478i interfaceC4478iM5205a2 = C4472c.m5205a(AbstractC8452B2.m9063b(AbstractC10070c.f29818a));
        this.f14548j = interfaceC4478iM5205a2;
        this.f14550k = new C0453o(c15370i, interfaceC4478iM5205a2, 26);
        ArrayList arrayList4 = new ArrayList(3);
        List listEmptyList4 = Collections.emptyList();
        arrayList4.add(AbstractC8452B2.m9063b(this.f14544h));
        arrayList4.add(AbstractC8452B2.m9063b(this.f14546i));
        arrayList4.add(AbstractC8452B2.m9063b(this.f14550k));
        this.f14552l = new C4479j(arrayList4, listEmptyList4);
        this.f14554m = NetworkModule_KeyInflectionFactory.create(networkModule);
        this.f14556n = NetworkModule_UseServerStylesFactory.create(networkModule);
        int i10 = C4476g.f14618b;
        C4475f c4475f = new C4475f(3, 1);
        c4475f.m4521L("Key-Inflection", AbstractC8452B2.m9063b(this.f14554m));
        c4475f.m4521L("Persona-Use-Mobile-Server-Styles", AbstractC8452B2.m9063b(this.f14556n));
        c4475f.m4521L(SIPHeaderNames.USER_AGENT, AbstractC8452B2.m9063b(AbstractC5814h.f18978a));
        this.f14558o = new C4476g((LinkedHashMap) c4475f.f11539Z);
        this.f14560p = new C4373B(c13287b, 0);
        this.f14562q = C4472c.m5205a(AbstractC8452B2.m9063b(new C1342O(c2222a, 24)));
        int i11 = 4;
        InterfaceC4478i interfaceC4478iM5205a3 = C4472c.m5205a(AbstractC8452B2.m9063b(NetworkModule_RetrofitFactory.create(networkModule, this.f14536d, NetworkModule_OkhttpClientFactory.create(networkModule, this.f14552l, this.f14558o, this.f14560p, this.f14562q, C4472c.m5205a(AbstractC8452B2.m9063b(new C1342O(c2222a, 25)))), this.f14542g)));
        this.f14564r = interfaceC4478iM5205a3;
        this.f14566s = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c11248s, interfaceC4478iM5205a3, 15)));
        InterfaceC4478i interfaceC4478iM5205a4 = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c15370i2, this.f14564r, 12)));
        InterfaceC4478i interfaceC4478i = this.f14542g;
        this.f14568t = new C2709c(interfaceC4478iM5205a4, interfaceC4478i, i11);
        this.f14570u = C4472c.m5205a(AbstractC8452B2.m9063b(new C2913s(new C2896b(c3032c, this.f14568t, C4474e.m5206a(new C5457j(new C21585H(interfaceC4478i, 6, this.f14560p))), 3), this.f14542g, 5)));
        InterfaceC4478i interfaceC4478iM5205a5 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(c2222a, new C4375C(this.f14560p, 2), 18)));
        this.f14572v = interfaceC4478iM5205a5;
        this.f14574w = C4474e.m5206a(new C4432h(new C2392v(this.f14560p, this.f14566s, interfaceC4478iM5205a5, this.f14548j, this.f14570u, 10)));
        this.f14576x = C4472c.m5205a(AbstractC8452B2.m9063b(new C4375C(c13287b, this.f14560p)));
        this.f14578y = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c11248s, this.f14564r, 14)));
        this.f14580z = new C1992i(c10077b, 19);
        int i12 = 11;
        this.f14504A = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c15370i2, this.f14570u, i12)));
        this.f14505B = C4472c.m5205a(AbstractC8452B2.m9063b(new C1342O(c2222a, 27)));
        InterfaceC4478i interfaceC4478iM5205a6 = C4472c.m5205a(AbstractC8452B2.m9063b(new C4375C(this.f14560p, 3)));
        this.f14506C = interfaceC4478iM5205a6;
        this.f14507D = new C14970i(c18490u, interfaceC4478iM5205a6, 2);
        C4373B c4373b = this.f14560p;
        InterfaceC4478i interfaceC4478i2 = this.f14578y;
        C1992i c1992i = this.f14580z;
        InterfaceC4478i interfaceC4478i3 = this.f14504A;
        InterfaceC4478i interfaceC4478i4 = this.f14505B;
        C14970i c14970i = this.f14507D;
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f64Y = c4373b;
        c0017i0.f65Z = interfaceC4478i2;
        c0017i0.f66o0 = c1992i;
        c0017i0.f67p0 = interfaceC4478i3;
        c0017i0.f68q0 = interfaceC4478i4;
        c0017i0.f69r0 = c14970i;
        this.f14508E = c0017i0;
        this.f14509F = C4474e.m5206a(new C2892z(this.f14508E));
        this.f14510G = C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(c18655i, 10)));
        this.f14511H = new C15358g1(this.f14560p, this.f14507D);
        this.f14512I = C4474e.m5206a(new C18433F(this.f14511H));
        this.f14513J = new C11241l(this.f14560p, this.f14507D);
        this.f14514K = C4474e.m5206a(new C19026F(this.f14513J));
        this.f14515L = new C1992i(c15333a, 20);
        this.f14516M = C4472c.m5205a(AbstractC8452B2.m9063b(new C16252i(this.f14515L, 1)));
        this.f14517N = C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(c19506i, i12)));
        this.f14518O = new C11248s(C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(c3032c2, 12))), this.f14560p, false, 15);
        this.f14519P = C4474e.m5206a(new C8376o(this.f14518O));
        this.f14520Q = new C14970i(C4472c.m5205a(AbstractC8452B2.m9063b(new C18491v(c18490u, 0))), 3);
        this.f14521R = new C2562f(this.f14560p, this.f14520Q);
        this.f14522S = C4474e.m5206a(new C22102I(this.f14521R));
        this.f14523T = new C2562f(this.f14560p, this.f14520Q);
        this.f14524U = C4474e.m5206a(new C2563g(this.f14523T));
        this.f14525V = C4472c.m5205a(AbstractC8452B2.m9063b(new C2913s(c11248s, this.f14564r, 6)));
        this.f14526W = C4472c.m5205a(AbstractC8452B2.m9063b(new C16252i(this.f14515L, 0)));
        int i13 = 16;
        this.f14527X = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c11248s, this.f14564r, i13)));
        this.f14528Y = new C2392v(this.f14560p, this.f14527X, this.f14580z, this.f14504A, this.f14505B, 28);
        this.f14529Z = C4474e.m5206a(new C11773j(this.f14528Y));
        InterfaceC4478i interfaceC4478iM5205a7 = C4472c.m5205a(AbstractC8452B2.m9063b(new C18491v(c18490u, 1)));
        this.f14531a0 = interfaceC4478iM5205a7;
        this.f14533b0 = new C14970i(interfaceC4478iM5205a7, i11);
        this.f14535c0 = new C15384c(this.f14560p, 19, this.f14533b0);
        this.f14537d0 = C4474e.m5206a(new C10633B(this.f14535c0));
        int i14 = 17;
        this.f14539e0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c11248s, this.f14564r, i14)));
        this.f14541f0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(c7296c, 15)));
        this.f14543g0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1992i(c13288c, 9)));
        this.f14545h0 = new C5311e(this.f14539e0, this.f14572v, this.f14543g0, 2);
        this.f14547i0 = C4474e.m5206a(new C1326G(this.f14545h0));
        this.f14549j0 = new C13711h(this.f14543g0, this.f14539e0, this.f14572v, 2);
        this.f14551k0 = C4474e.m5206a(new C1379e1(this.f14549j0));
        this.f14553l0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C6429d(c11242m, 2)));
        this.f14555m0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C6429d(c11242m, 0)));
        this.f14557n0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C6429d(c11242m, 1)));
        this.f14559o0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C0453o(c11248s, this.f14564r, 13)));
        this.f14561p0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C1342O(c2222a, 26)));
        this.f14563q0 = new C4373B(c13287b, 1);
        this.f14565r0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2913s((Object) c2222a, (InterfaceC4473d) this.f14563q0, 7)));
        this.f14567s0 = new C2913s(this.f14520Q, this.f14565r0, 12);
        this.f14569t0 = new C1992i(this.f14567s0, 22);
        this.f14571u0 = new C1992i(this.f14533b0, i13);
        this.f14573v0 = new C1992i(this.f14571u0, i14);
        List listEmptyList5 = Collections.emptyList();
        ArrayList arrayList5 = new ArrayList(8);
        arrayList5.add(AbstractC8452B2.m9063b(AbstractC5814h.f18982e));
        arrayList5.add(AbstractC8452B2.m9063b(this.f14569t0));
        arrayList5.add(AbstractC8452B2.m9063b(AbstractC1340N.f3540a));
        arrayList5.add(AbstractC8452B2.m9063b(this.f14573v0));
        arrayList5.add(AbstractC8452B2.m9063b(AbstractC20358r.f64365a));
        arrayList5.add(AbstractC8452B2.m9063b(AbstractC10070c.f29819b));
        arrayList5.add(AbstractC8452B2.m9063b(AbstractC6743i.f21648a));
        arrayList5.add(AbstractC8452B2.m9063b(AbstractC8367f0.f26063a));
        this.f14575w0 = new C4479j(listEmptyList5, arrayList5);
        this.f14577x0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C5815i(this.f14575w0, 0)));
        this.f14579y0 = new C4375C(this.f14560p, 1);
        this.f14581z0 = C4472c.m5205a(AbstractC8452B2.m9063b(new C2896b(this.f14566s, this.f14542g, this.f14579y0, 2)));
    }

    /* JADX INFO: renamed from: a */
    public final C8361c0 m5203a() {
        C13287b c13287b = this.f14530a;
        Context contextM5169a = C4373B.m5169a(c13287b);
        Context contextM5169a2 = C4373B.m5169a(c13287b);
        AbstractC16283c requestPermissionsLauncher = (AbstractC16283c) this.f14517N.get();
        AbstractC16544l.m18094g(requestPermissionsLauncher, "requestPermissionsLauncher");
        C15026j c15026j = new C15026j();
        c15026j.f46724Y = contextM5169a2;
        c15026j.f46725Z = requestPermissionsLauncher;
        return new C8361c0(contextM5169a, c15026j, new C8387z(C4373B.m5169a(c13287b), (C8376o) this.f14519P.f14617a), 0);
    }
}
