package p042Bf;

import android.app.ApplicationExitInfo;
import android.gov.nist.core.Separators;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.material3.C10858c;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.focus.AbstractC10862a;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import bf.C11391s;
import cd.AbstractC11703c;
import cd.C11709i;
import com.openai.chatgpt.R;
import com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel;
import com.openai.feature.messages.impl.listitem.content.reference.weather.WeatherViewModel;
import com.openai.feature.subscriptions.SubscriptionsViewModel;
import gd.C13915a0;
import io.opentracing.util.GlobalTracer;
import io.sentry.internal.debugmeta.C15384c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import lk.EnumC17058a;
import mm.C17296C;
import mm.InterfaceC17302e;
import p001A.AbstractC0010F;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0227a;
import p003A1.C0254h0;
import p017Af.C0459F;
import p017Af.C0468O;
import p025An.C0644w;
import p035B7.C0846c;
import p039Bc.C0884r;
import p040Bd.C1078f0;
import p040Bd.C1085g0;
import p040Bd.C1166t;
import p046Bk.AbstractC1391k0;
import p046Bk.C1327G0;
import p046Bk.C1329H0;
import p046Bk.C1360X0;
import p046Bk.C1383g0;
import p046Bk.C1393l0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p072Ci.EnumC1711p;
import p080D0.AbstractC1823p0;
import p080D0.C1803f0;
import p080D0.C1821o0;
import p1000s0.AbstractC19402K;
import p1000s0.C19408d;
import p1008s8.C19470A;
import p1008s8.C19472a;
import p1008s8.C19473b;
import p1008s8.C19474c;
import p1008s8.C19475d;
import p1008s8.C19476e;
import p1008s8.C19478g;
import p1008s8.C19479h;
import p1008s8.C19480i;
import p1008s8.C19481j;
import p1008s8.C19490s;
import p1008s8.C19491t;
import p1008s8.C19492u;
import p1008s8.C19493v;
import p1008s8.C19494w;
import p1008s8.C19495x;
import p1008s8.C19496y;
import p1008s8.C19497z;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p1113xn.C21317k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22071w0;
import p1156zj.AbstractC22120R0;
import p1156zj.C22092D;
import p1156zj.C22156g0;
import p1156zj.C22195t0;
import p1156zj.C22205x;
import p1156zj.EnumC22088B;
import p1156zj.EnumC22094E;
import p1156zj.InterfaceC22096F;
import p121Ef.C2424a;
import p124Ei.C2450F;
import p124Ei.C2497c;
import p140Fa.C2685e;
import p153Fn.C2925c;
import p193Hf.AbstractC3319M;
import p193Hf.AbstractC3343Y0;
import p193Hf.AbstractC3365g0;
import p193Hf.AbstractC3366g1;
import p193Hf.C3317L;
import p193Hf.C3321N;
import p193Hf.C3325P;
import p193Hf.C3357d1;
import p193Hf.C3363f1;
import p193Hf.C3369h1;
import p204I1.C3582M;
import p225Im.AbstractC3751J;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3918H;
import p229J0.AbstractC3927I2;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4005X2;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4031c1;
import p229J0.AbstractC4033c3;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p236J7.AbstractC4283g;
import p236J7.C4277a;
import p236J7.C4278b;
import p236J7.C4279c;
import p236J7.C4280d;
import p236J7.C4282f;
import p243Jf.C4334d;
import p278L0.C4865b0;
import p284L7.C4957b;
import p302M0.AbstractC5253e;
import p328N1.C5609y;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p350O1.C6045C;
import p360Od.C6172d;
import p362Of.C6194i;
import p363Og.C6207k;
import p403Qd.AbstractC6659u;
import p403Qd.C6597C;
import p403Qd.C6600F;
import p403Qd.C6656s;
import p403Qd.C6664z;
import p404Qe.C6677m;
import p404Qe.C6682r;
import p437Rn.C6959q;
import p467T1.C7199i;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p478Tc.C7299c;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.C7364o;
import p479Td.EnumC7359j0;
import p482Tg.C7448e;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7877E4;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;
import p523V9.AbstractC7997T5;
import p523V9.AbstractC8056b6;
import p523V9.AbstractC8064c6;
import p523V9.AbstractC8080e6;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8190s4;
import p523V9.AbstractC8210v0;
import p523V9.AbstractC8215v5;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8543Q3;
import p547Wc.C8805o;
import p550We.C8829j;
import p550We.EnumC8830k;
import p552Wg.AbstractC8842d;
import p552Wg.C8838B;
import p552Wg.C8846h;
import p552Wg.C8864z;
import p553Wh.C8870f;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9245Z;
import p571X9.AbstractC9274d4;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p575Xd.C9436E;
import p594Y9.AbstractC9746I4;
import p624Zg.AbstractC10381m0;
import p624Zg.AbstractC10384p;
import p624Zg.C10372i;
import p624Zg.C10375j0;
import p624Zg.C10377k0;
import p624Zg.C10379l0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p642a8.C10518a;
import p642a8.C10519b;
import p642a8.C10523f;
import p642a8.C10525h;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p662b8.C11258b;
import p662b8.C11260d;
import p662b8.C11261e;
import p676c7.C11682a;
import p676c7.C11683b;
import p677c8.C11689a;
import p722e8.C13296F;
import p729ej.C13421l;
import p729ej.InterfaceC13410a;
import p736f0.AbstractC13508z;
import p736f0.C13467E;
import p736f0.C13468F;
import p737f1.C13522n;
import p743f7.InterfaceC13575a;
import p743f7.InterfaceC13576b;
import p758g0.AbstractC13779o0;
import p758g0.AbstractC13785r0;
import p758g0.C13740P;
import p758g0.C13767i0;
import p758g0.C13771k0;
import p758g0.C13783q0;
import p758g0.InterfaceC13726B;
import p765g7.InterfaceC13823a;
import p774h1.AbstractC14334L;
import p774h1.C14343V;
import p781h8.C14428c;
import p817j$.util.concurrent.ConcurrentHashMap;
import p827j7.C16173a;
import p827j7.C16175c;
import p837ji.C16218g;
import p846k4.C16340i;
import p849k7.C16360m;
import p867l8.C16831c;
import p882m1.AbstractC17140a;
import p893n.AbstractActivityC17375g;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p909nm.C17691y;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p919o8.C17937T1;
import p919o8.C17946W1;
import p919o8.C17984k0;
import p946pc.AbstractC18324I;
import p946pc.C18320E;
import p946pc.C18328M;
import p949pj.C18428A;
import p959q8.C18643e;
import p984r8.C18887a;
import p984r8.C18888b;
import p984r8.C18889c;
import p989rd.AbstractC18941c;
import p989rd.C18943e;
import p994rk.InterfaceC19201o2;
import sj.hJY.CsqksqyPE;
import ye.C21522k;
import ye.C21523l;
import ye.EnumC21524m;

/* JADX INFO: renamed from: Bf.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3364Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3365Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3366o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f3367p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f3368q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268j(InterfaceC1426a interfaceC1426a, C6172d c6172d, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        super(2);
        this.f3364Y = 8;
        this.f3367p0 = interfaceC1426a;
        this.f3365Z = c6172d;
        this.f3368q0 = interfaceC1436k;
        this.f3366o0 = interfaceC1436k2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m1971a(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3918H.m4622d(AbstractC8842d.f27066a, null, AbstractC8411c.m8969c(2072412247, c6021p, new C8805o((C8870f) this.f3365Z, 4, (AbstractActivityC17375g) this.f3366o0)), AbstractC8411c.m8969c(1858084096, c6021p, new C8864z((C8838B) this.f3367p0, (InterfaceC3759g) this.f3368q0, 0)), 0.0f, null, null, null, c6021p, 3462, 242);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    private final Object m1972b(Object obj, Object obj2) {
        InterfaceC5985X interfaceC5985X;
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-996359323);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-996356486, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = new C6207k(interfaceC5985X2, 22);
                c6021p.m6537c0(objM530s);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4695n((InterfaceC1426a) objM530s, null, false, null, null, null, null, null, null, AbstractC8411c.m8969c(611228918, c6021p, new C0468O((EnumC8830k) this.f3365Z, 19)), c6021p, 805306374, 510);
            boolean zBooleanValue = ((Boolean) interfaceC5985X2.getValue()).booleanValue();
            c6021p.m6524S(-996340261);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                interfaceC5985X = interfaceC5985X2;
                objM6514H2 = new C6207k(interfaceC5985X, 23);
                c6021p.m6537c0(objM6514H2);
            } else {
                interfaceC5985X = interfaceC5985X2;
            }
            c6021p.m6553p(false);
            AbstractC8190s4.m8770a(zBooleanValue, (InterfaceC1426a) objM6514H2, null, 0L, null, null, AbstractC8411c.m8969c(-1523261001, c6021p, new C2497c((InterfaceC1436k) this.f3368q0, this.f3366o0, this.f3367p0, interfaceC5985X, 4)), c6021p, 1572912, 60);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    private final Object m1973c(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(184814587);
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f3365Z;
            boolean zM6542f = c6021p.m6542f(interfaceC3759g);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                objM6514H = new C8846h(interfaceC3759g, 3);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, AbstractC10844c.m11244d(c10456n, 1.0f), false, null, null, null, null, null, null, AbstractC10384p.f30777b, c6021p, 805306416, 508);
            AbstractC10381m0 abstractC10381m0 = (AbstractC10381m0) this.f3366o0;
            if (abstractC10381m0 instanceof C10377k0) {
                c6021p.m6524S(1434763853);
                AbstractC3751J.m4439d(null, R.string.subscriptions_loading, C10372i.f30737s0, false, true, null, c6021p, 28038);
                c6021p.m6553p(false);
            } else if (abstractC10381m0 instanceof C10375j0) {
                c6021p.m6524S(1435198907);
                AbstractC3751J.m4439d(null, ((C10375j0) abstractC10381m0).f30745a, C10372i.f30738t0, false, false, null, c6021p, 28038);
                c6021p.m6553p(false);
            } else if (abstractC10381m0 instanceof C10379l0) {
                c6021p.m6524S(1435634302);
                c6021p.m6524S(184859241);
                boolean zM6542f2 = c6021p.m6542f(abstractC10381m0);
                SubscriptionsViewModel subscriptionsViewModel = (SubscriptionsViewModel) this.f3367p0;
                boolean zM6542f3 = zM6542f2 | c6021p.m6542f(subscriptionsViewModel);
                AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) this.f3368q0;
                boolean zM6545h = zM6542f3 | c6021p.m6545h(abstractActivityC17375g);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h || objM6514H2 == c5975s) {
                    objM6514H2 = new C7448e(abstractC10381m0, subscriptionsViewModel, abstractActivityC17375g, 9);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC9746I4.m10337a(null, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H2, c6021p, 0, 255);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1436603548);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m1975f(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC11703c.m13030a((C13740P) this.f3366o0, ((C14343V) ((InterfaceC5985X) this.f3367p0).getValue()).f45025a, (InterfaceC10459q) this.f3365Z, (C8410b) this.f3368q0, c6021p, 0);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m1976h(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C0468O c0468o = new C0468O((InterfaceC13726B) this.f3366o0, 26);
            C13783q0 c13783q0 = AbstractC13785r0.f43528a;
            C13771k0 c13771k0 = (C13771k0) this.f3365Z;
            Object objM15272c = c13771k0.m15272c();
            c6021p.m6524S(-438678252);
            Object obj3 = this.f3367p0;
            float f10 = AbstractC16544l.m18089b(objM15272c, obj3) ? 1.0f : 0.0f;
            c6021p.m6553p(false);
            Float fValueOf = Float.valueOf(f10);
            Object value = c13771k0.f43492d.getValue();
            c6021p.m6524S(-438678252);
            float f11 = AbstractC16544l.m18089b(value, obj3) ? 1.0f : 0.0f;
            c6021p.m6553p(false);
            C13767i0 c13767i0M15289b = AbstractC13779o0.m15289b(c13771k0, fValueOf, Float.valueOf(f11), (InterfaceC13726B) c0468o.invoke(c13771k0.m15275f(), c6021p, 0), c13783q0, c6021p, 0);
            C10456n c10456n = C10456n.f30959Y;
            boolean zM6542f = c6021p.m6542f(c13767i0M15289b);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C4865b0(c13767i0M15289b, 3);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC10459q interfaceC10459qM11305a = AbstractC10864a.m11305a(c10456n, (InterfaceC1436k) objM6514H);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11305a);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            ((C8410b) this.f3368q0).invoke(obj3, c6021p, 0);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m1977i(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10833a.m11209d((InterfaceC10459q) this.f3365Z, false, null, (InterfaceC1426a) this.f3367p0, 7), 1.0f);
            C5984W0 c5984w0 = AbstractC3884B1.f11770a;
            InterfaceC10459q interfaceC10459qMo428M = interfaceC10459qM11244d.mo428M(MinimumInteractiveModifier.f32651Y);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56728e, C10444b.f30944w0, c6021p, 54);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC3878A1.m4596a((AbstractC17140a) this.f3366o0, null, null, 0L, c6021p, 48, 12);
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23199d;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, f10));
            AbstractC4124r4.m4768b((String) this.f3368q0, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, f10));
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.info, c6021p, 0), null, null, 0L, c6021p, 48, 12);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m1978k(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC18324I.m19851a((C18320E) this.f3366o0, c6021p).mo985d((C3582M) this.f3367p0, AbstractC8411c.m8968b(599927538, c6021p, new C18328M((InterfaceC10459q) this.f3365Z, (InterfaceC1440o) this.f3368q0, 0)), c6021p, 48);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:192:0x0435  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: l */
    private final Object m1979l(Object obj, Object obj2) {
        InterfaceC13576b interfaceC13576b;
        Object c19481j;
        C10523f c10523f;
        boolean zBooleanValue;
        char c9;
        String str;
        boolean z6;
        int i10;
        String str2;
        int i11;
        C17296C c17296c;
        int i12;
        C11682a datadogContext = (C11682a) obj;
        InterfaceC13576b eventBatchWriter = (InterfaceC13576b) obj2;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        AbstractC16544l.m18094g(eventBatchWriter, "eventBatchWriter");
        long j10 = ((C13296F) this.f3365Z).f42031c.f35476a + datadogContext.f35417i.f35450d;
        AbstractC4283g abstractC4283g = (AbstractC4283g) this.f3366o0;
        boolean z10 = abstractC4283g instanceof C4279c;
        C17296C c17296c2 = C17296C.f55119a;
        C18889c c18889c = (C18889c) this.f3367p0;
        if (!z10) {
            if (abstractC4283g instanceof C4282f) {
                C4282f c4282f = (C4282f) abstractC4283g;
                c19481j = C18889c.m20202a(c18889c, datadogContext, j10, c4282f.f13948a, c4282f.f13949b);
            } else {
                boolean z11 = abstractC4283g instanceof C4280d;
                EnumC11255b enumC11255b = EnumC11255b.f34098Y;
                C11683b c11683b = datadogContext.f35420l;
                InterfaceC13823a interfaceC13823a = c18889c.f60216Y;
                String str3 = c11683b.f35430f;
                String str4 = c11683b.f35429e;
                String str5 = c11683b.f35432h;
                String str6 = c11683b.f35427c;
                interfaceC13576b = eventBatchWriter;
                String str7 = c11683b.f35426b;
                String str8 = c11683b.f35433i;
                String source = datadogContext.f35415g;
                if (z11) {
                    C11689a c11689aM20203b = C18889c.m20203b(datadogContext);
                    C4280d c4280d = (C4280d) abstractC4283g;
                    String str9 = c4280d.f13945d;
                    C15384c c15384c = c18889c.f60219p0;
                    c15384c.getClass();
                    String sessionId = c11689aM20203b.f35458b;
                    AbstractC16544l.m18094g(sessionId, "sessionId");
                    C14428c c14428c = (C14428c) ((ConcurrentHashMap) c15384c.f47968o0).get(sessionId);
                    if (c14428c != null) {
                        String str10 = str9 == null ? "Empty error kind" : str9;
                        LinkedHashMap linkedHashMap = c14428c.f45354e;
                        Integer num = (Integer) linkedHashMap.get(str10);
                        linkedHashMap.put(str10, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        c17296c = c17296c2;
                    } else {
                        str3 = str3;
                        c17296c = null;
                    }
                    if (c17296c == null) {
                        AbstractC7889G0.m8184b((InterfaceC11256c) c15384c.f47967Z, 3, EnumC11255b.f34099Z, new C6959q(c15384c, sessionId, str9, 25), null, false, 56);
                    }
                    C11689a c11689aM20203b2 = C18889c.m20203b(datadogContext);
                    Map map = c4280d.f13947b;
                    LinkedHashMap linkedHashMapM19256r = map != null ? AbstractC17659D.m19256r(map) : new LinkedHashMap();
                    C16831c c16831c = new C16831c();
                    InterfaceC11256c internalLogger = interfaceC13823a.mo15463s();
                    AbstractC16544l.m18094g(source, "source");
                    AbstractC16544l.m18094g(internalLogger, "internalLogger");
                    try {
                        int[] iArrM27k = AbstractC0010F.m27k(7);
                        int length = iArrM27k.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            int i14 = iArrM27k[i13];
                            if (AbstractC17792x.m19527j(i14).equals(source)) {
                                i12 = i14;
                                break;
                            }
                            i13++;
                        }
                    } catch (NoSuchElementException e10) {
                        AbstractC7889G0.m8184b(internalLogger, 5, enumC11255b, new C0846c(source, 29), e10, false, 48);
                        i12 = 0;
                    }
                    int i15 = i12 == 0 ? 1 : i12;
                    C19491t c19491t = new C19491t(c11689aM20203b2.f35457a);
                    C19495x c19495x = new C19495x(c11689aM20203b2.f35458b);
                    String str11 = c11689aM20203b2.f35460d;
                    C19497z c19497z = str11 != null ? new C19497z(str11) : null;
                    String str12 = c11689aM20203b2.f35463g;
                    C19490s c19490s = str12 != null ? new C19490s(str12) : null;
                    String str13 = c4280d.f13944c;
                    String str14 = c4280d.f13945d;
                    c19481j = new C19470A(c16831c, j10, "dd-sdk-android", i15, datadogContext.f35416h, c19491t, c19495x, c19497z, c19490s, null, new C19496y(new C19492u(str8, str7, str6), new C19494w(str4, str3, str5), c4280d.f13946a, (str13 == null && str14 == null) ? null : new C19493v(str13, str14), linkedHashMapM19256r));
                } else if (abstractC4283g instanceof C4277a) {
                    C4277a c4277a = (C4277a) abstractC4283g;
                    C16360m c16360mMo15458n = interfaceC13823a.mo15458n("tracing");
                    Map mapMo15448d = interfaceC13823a.mo15448d("session-replay");
                    Object obj3 = mapMo15448d.get("session_replay_sample_rate");
                    Long l4 = obj3 instanceof Long ? (Long) obj3 : null;
                    Object obj4 = mapMo15448d.get("session_replay_start_immediate_recording");
                    Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                    Object obj5 = mapMo15448d.get("session_replay_image_privacy");
                    String str15 = obj5 instanceof String ? (String) obj5 : null;
                    Object obj6 = mapMo15448d.get("session_replay_touch_privacy");
                    String str16 = obj6 instanceof String ? (String) obj6 : null;
                    Object obj7 = mapMo15448d.get("session_replay_text_and_input_privacy");
                    String str17 = obj7 instanceof String ? (String) obj7 : null;
                    C16360m c16360mMo15458n2 = interfaceC13823a.mo15458n("rum");
                    C10523f c10523f2 = c16360mMo15458n2 != null ? ((C10525h) c16360mMo15458n2.f50808b).f31222Z : null;
                    boolean z12 = (c10523f2 != null ? c10523f2.f31193h : null) instanceof C18643e;
                    C11689a c11689aM20203b3 = C18889c.m20203b(datadogContext);
                    Map mapMo15448d2 = interfaceC13823a.mo15448d("tracing");
                    Object obj8 = mapMo15448d2.get("is_opentelemetry_enabled");
                    Boolean bool2 = obj8 instanceof Boolean ? (Boolean) obj8 : null;
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        c10523f = c10523f2;
                        c9 = 1;
                    } else {
                        try {
                            GlobalTracer globalTracer = GlobalTracer.f46995Y;
                            c10523f = c10523f2;
                            try {
                                Object objInvoke = GlobalTracer.class.getMethod("isRegistered", null).invoke(null, null);
                                AbstractC16544l.m18092e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                            } catch (Throwable th2) {
                                try {
                                    AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 5, EnumC11255b.f34100o0, C18888b.f60214o0, th2, false, 48);
                                } catch (Throwable unused) {
                                }
                                zBooleanValue = false;
                            }
                        } catch (Throwable unused2) {
                            c10523f = c10523f2;
                        }
                        c9 = zBooleanValue ? (char) 2 : (char) 0;
                    }
                    if (c9 == 1) {
                        Object obj9 = mapMo15448d2.get("opentelemetry_api_version");
                        if (obj9 instanceof String) {
                            str = (String) obj9;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    boolean z13 = (c16360mMo15458n == null || c9 == 0) ? false : true;
                    C16340i c16340i = new C16340i();
                    InterfaceC11256c internalLogger2 = interfaceC13823a.mo15463s();
                    AbstractC16544l.m18094g(source, "source");
                    AbstractC16544l.m18094g(internalLogger2, "internalLogger");
                    try {
                        int[] iArrM27k2 = AbstractC0010F.m27k(7);
                        int length2 = iArrM27k2.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= length2) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            i10 = iArrM27k2[i16];
                            int[] iArr = iArrM27k2;
                            if (AbstractC17792x.m19525h(i10).equals(source)) {
                                z6 = false;
                                break;
                            }
                            i16++;
                            iArrM27k2 = iArr;
                        }
                    } catch (NoSuchElementException e11) {
                        z6 = false;
                        AbstractC7889G0.m8184b(internalLogger2, 5, enumC11255b, new C18887a(source, 0 == true ? 1 : 0), e11, false, 48);
                        i10 = 0;
                    }
                    int i17 = i10 == 0 ? 1 : i10;
                    C19473b c19473b = new C19473b(c11689aM20203b3.f35457a);
                    C19478g c19478g = new C19478g(c11689aM20203b3.f35458b);
                    String str18 = c11689aM20203b3.f35460d;
                    C19480i c19480i = str18 != null ? new C19480i(str18) : null;
                    String str19 = c11689aM20203b3.f35463g;
                    C19472a c19472a = str19 != null ? new C19472a(str19) : null;
                    C19475d c19475d = new C19475d(str8, str7, str6);
                    C19476e c19476e = new C19476e(str4, str3, str5);
                    C10523f c10523f3 = c10523f;
                    Long lValueOf = c10523f != null ? Long.valueOf((long) c10523f3.f31187b) : null;
                    Long lValueOf2 = c10523f3 != null ? Long.valueOf((long) c10523f3.f31188c) : null;
                    boolean z14 = r36.f13941d;
                    Boolean boolValueOf = c10523f3 != null ? Boolean.valueOf(c10523f3.f31202q) : null;
                    Boolean boolValueOf2 = c10523f3 != null ? Boolean.valueOf(c10523f3.f31201p) : null;
                    boolean z15 = (c10523f3 != null ? Boolean.valueOf(c10523f3.f31190e) : null) != null ? true : z6;
                    if ((c10523f3 != null ? c10523f3.f31194i : null) != null) {
                        z6 = true;
                    }
                    Long lValueOf3 = (c10523f3 == null || (i11 = c10523f3.f31204s) == 0) ? null : Long.valueOf(AbstractC9306j0.m9885d(i11));
                    if (c9 == 0) {
                        str2 = null;
                    } else if (c9 == 1) {
                        str2 = "OpenTelemetry";
                    } else {
                        if (c9 != 2) {
                            throw null;
                        }
                        str2 = "OpenTracing";
                    }
                    c19481j = new C19481j(c16340i, j10, i17, datadogContext.f35416h, c19473b, c19478g, c19480i, c19472a, new C19479h(c19475d, c19476e, new C19474c(lValueOf, lValueOf2, l4, bool, Boolean.valueOf(z14), str17, str15, str16, boolValueOf, Boolean.valueOf(z15), Boolean.FALSE, z12 ? 1 : 0, boolValueOf2, lValueOf3, Boolean.valueOf(r36.f13938a), Boolean.valueOf(c18889c.f60221r0), Boolean.valueOf(z13), Boolean.valueOf(z6), Long.valueOf(r36.f13939b), Long.valueOf(c4277a.f13940c), Long.valueOf(r36.f13942e), str2, str)));
                } else {
                    c19481j = null;
                    if (!(abstractC4283g instanceof C4278b)) {
                        throw new C0644w();
                    }
                    c18889c.f60221r0 = true;
                }
            }
            if (c19481j != null) {
                ((InterfaceC13575a) this.f3368q0).mo12662a(interfaceC13576b, c19481j, 3);
            }
            return c17296c2;
        }
        C4279c c4279c = (C4279c) abstractC4283g;
        c19481j = C18889c.m20202a(c18889c, datadogContext, j10, c4279c.f13946a, c4279c.f13947b);
        interfaceC13576b = eventBatchWriter;
        if (c19481j != null) {
            ((InterfaceC13575a) this.f3368q0).mo12662a(interfaceC13576b, c19481j, 3);
        }
        return c17296c2;
    }

    /* JADX INFO: renamed from: m */
    private final Object m1980m(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        C17296C c17296c = C17296C.f55119a;
        if (iIntValue == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            return c17296c;
        }
        C10456n c10456n = C10456n.f30959Y;
        InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23202g);
        C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30932A0, c6021p, 48);
        int i10 = c6021p.f19564P;
        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
        InterfaceC21700k.f68875m0.getClass();
        C21696i c21696i = C21698j.f68869b;
        c6021p.m6528W();
        if (c6021p.f19563O) {
            c6021p.m6549l(c21696i);
        } else {
            c6021p.m6543f0();
        }
        C21694h c21694h = C21698j.f68873f;
        C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
        C21694h c21694h2 = C21698j.f68872e;
        C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
        C21694h c21694h3 = C21698j.f68874g;
        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
            AbstractC0168G.m537z(i10, c6021p, i10, c21694h3);
        }
        C21694h c21694h4 = C21698j.f68871d;
        C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
        c6021p.m6524S(1174509258);
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = new C13522n();
            c6021p.m6537c0(objM6514H);
        }
        C13522n c13522n = (C13522n) objM6514H;
        c6021p.m6553p(false);
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3365Z;
        C6045C c6045c = (C6045C) interfaceC5985X.getValue();
        c6021p.m6524S(1174513884);
        boolean zM6542f = c6021p.m6542f(interfaceC5985X);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6542f || objM6514H2 == c5975s) {
            objM6514H2 = new C6194i(interfaceC5985X, 26);
            c6021p.m6537c0(objM6514H2);
        }
        c6021p.m6553p(false);
        AbstractC3927I2.m4628a(c6045c, (InterfaceC1436k) objM6514H2, AbstractC10862a.m11299a(AbstractC10844c.m11244d(c10456n, 1.0f), c13522n), false, false, null, AbstractC18941c.f60467a, null, null, null, null, null, null, false, null, null, null, false, 5, 0, null, null, null, c6021p, 1572864, 100663296, 0);
        c6021p.m6524S(1174530290);
        Object objM6514H3 = c6021p.m6514H();
        if (objM6514H3 == c5975s) {
            objM6514H3 = new C18943e(c13522n, null);
            c6021p.m6537c0(objM6514H3);
        }
        c6021p.m6553p(false);
        C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17296c);
        C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
        int i11 = c6021p.f19564P;
        InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
        InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
        c6021p.m6528W();
        if (c6021p.f19563O) {
            c6021p.m6549l(c21696i);
        } else {
            c6021p.m6543f0();
        }
        C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
        C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
            AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
        }
        C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
        AbstractC3984T1.m4700s((InterfaceC1426a) this.f3367p0, null, false, null, null, null, null, null, null, AbstractC18941c.f60468b, c6021p, 805306368, 510);
        c6021p.m6524S(-855336720);
        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f3368q0;
        boolean zM6542f2 = c6021p.m6542f(interfaceC1436k) | c6021p.m6542f(interfaceC5985X);
        Object objM6514H4 = c6021p.m6514H();
        if (zM6542f2 || objM6514H4 == c5975s) {
            objM6514H4 = new C3325P(interfaceC1436k, interfaceC5985X, 6);
            c6021p.m6537c0(objM6514H4);
        }
        InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H4;
        c6021p.m6553p(false);
        AbstractC3984T1.m4700s(interfaceC1426a, null, (AbstractC21322p.m21681O(((C6045C) interfaceC5985X.getValue()).f19682a.f10934Y) || AbstractC16544l.m18089b(AbstractC21322p.m21711s0(((C6045C) interfaceC5985X.getValue()).f19682a.f10934Y).toString(), (String) this.f3366o0)) ? false : true, null, null, null, null, null, null, AbstractC18941c.f60469c, c6021p, 805306368, 506);
        c6021p.m6553p(true);
        c6021p.m6553p(true);
        return c17296c;
    }

    /* JADX INFO: renamed from: n */
    private final Object m1981n(Object obj, Object obj2) {
        Object obj3 = this.f3365Z;
        Object obj4 = this.f3367p0;
        Object obj5 = this.f3368q0;
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC6659u abstractC6659u = (AbstractC6659u) this.f3366o0;
            if (abstractC6659u instanceof C6597C) {
                c6021p.m6524S(-1019721595);
                C6597C c6597c = (C6597C) abstractC6659u;
                String str = c6597c.f21307c.f23288c;
                EnumC7359j0 enumC7359j0M7174f = abstractC6659u.m7174f();
                C7351f0 c7351f0 = c6597c.f21307c;
                C22071w0 c22071w0 = c7351f0.f23265A;
                boolean z6 = c7351f0.f23290e == EnumC7359j0.f23344o0 && !c7351f0.f23280P;
                C7364o c7364o = AbstractC7343b0.Companion;
                AbstractC8064c6.m8470a(str, enumC7359j0M7174f, c22071w0, c7351f0.f23286a, c7351f0.f23291f, (C9436E) obj4, (InterfaceC1436k) obj5, (InterfaceC10459q) obj3, z6, c6021p, 0, 0);
                c6021p.m6553p(false);
            } else {
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) obj3;
                if (abstractC6659u instanceof C6664z) {
                    c6021p.m6524S(-2111084118);
                    AbstractC8096g6.m8567a(interfaceC10459q, c6021p, 0);
                    c6021p.m6553p(false);
                } else if (abstractC6659u instanceof C6600F) {
                    c6021p.m6524S(-1018961196);
                    AbstractC7997T5.m8302b((C6600F) abstractC6659u, (C9436E) obj4, (InterfaceC1436k) obj5, null, c6021p, 0);
                    c6021p.m6553p(false);
                } else if (abstractC6659u instanceof C6656s) {
                    c6021p.m6524S(-2111070204);
                    C7351f0 c7351f1 = ((C6656s) abstractC6659u).f21421c;
                    AbstractC7343b0 abstractC7343b0 = c7351f1.f23291f;
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(interfaceC10459q, AbstractC7313q.f23199d, 0.0f, 2);
                    C7364o c7364o2 = AbstractC7343b0.Companion;
                    AbstractC8056b6.m8450a(abstractC7343b0, c7351f1.f23286a, (InterfaceC1436k) obj5, interfaceC10459qM11235m, c6021p, 0);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-2111059975);
                    c6021p.m6553p(false);
                }
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ?? r6;
        Object obj3;
        C21523l c21523l;
        Object obj4;
        boolean z6;
        boolean z10;
        InterfaceC10459q interfaceC10459q;
        Object objM529r;
        Object obj5;
        Object obj6;
        boolean z11;
        Object obj7;
        C10843b c10843b = C10843b.f32509a;
        C10456n c10456n = C10456n.f30959Y;
        C5975S c5975s = C6013l.f19514a;
        C17296C c17296c = C17296C.f55119a;
        Object obj8 = this.f3368q0;
        Object obj9 = this.f3367p0;
        Object obj10 = this.f3366o0;
        Object obj11 = this.f3365Z;
        int i10 = 2;
        switch (this.f3364Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, (InterfaceC10459q) obj11);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(1499740126);
                    List list = (List) obj10;
                    boolean zM6545h = c6021p.m6545h(list);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == c5975s) {
                        r6 = 0;
                        C1267i c1267i = new C1267i(0, list);
                        c6021p.m6537c0(c1267i);
                        obj3 = c1267i;
                    } else {
                        r6 = 0;
                        obj3 = objM6514H;
                    }
                    c6021p.m6553p(r6);
                    C19408d c19408dM20508b = AbstractC19402K.m20508b(r6, (InterfaceC1426a) obj3, c6021p, 3);
                    C1166t c1166t = (C1166t) list.get(c19408dM20508b.m20498j());
                    double d10 = c1166t.f3094d;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    int i12 = 0;
                    for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                        Object next = it.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        C1166t c1166t2 = (C1166t) next;
                        arrayList.add(new C16218g(c1166t2.f3091a, c1166t2.f3094d, c1166t2.f3095e, i12 == c19408dM20508b.m20498j() ? c1166t2.f3102l : null));
                        i12 = i13;
                        c19408dM20508b = c19408dM20508b;
                    }
                    C19408d c19408d = c19408dM20508b;
                    AbstractC8543Q3.m9203a(arrayList, AbstractC10844c.f32512c, Double.valueOf(d10), Double.valueOf(c1166t.f3095e), 0.0d, false, 0.0f, null, c6021p, 196656, 208);
                    c6021p.m6524S(1499762446);
                    if (AbstractC8160o6.m8729d(C13915a0.f43967c, c6021p)) {
                        AbstractC3984T1.m4691j((InterfaceC1426a) obj9, AbstractC10842a.m11237o(c10843b.m11240a(c10456n, C10444b.f30936o0), 0.0f, AbstractC7313q.f23199d, AbstractC7313q.f23201f, 0.0f, 9), false, null, null, null, AbstractC1256B.f3328c, c6021p, 1572864, 60);
                    }
                    c6021p.m6553p(false);
                    AbstractC8210v0.m8835b(c19408d, c10843b.m11240a(AbstractC10844c.m11244d(c10456n, 1.0f), C10444b.f30941t0), AbstractC10842a.m11223a(AbstractC7313q.f23201f, 0.0f, 2), null, 0, 0.0f, null, null, false, false, null, null, null, AbstractC8411c.m8969c(11292964, c6021p, new C1266h(list, (InterfaceC1436k) obj8, 0)), c6021p, 0, 3072, 8184);
                    c6021p.m6553p(true);
                }
                return c17296c;
            case 1:
                InterfaceC19201o2 uiComponent = (InterfaceC19201o2) obj;
                Map componentParams = (Map) obj2;
                AbstractC16544l.m18094g(uiComponent, "uiComponent");
                AbstractC16544l.m18094g(componentParams, "componentParams");
                AbstractC1391k0 abstractC1391k0 = (AbstractC1391k0) obj10;
                C1383g0 c1383g0 = (C1383g0) abstractC1391k0;
                C1360X0 c1360x0 = (C1360X0) obj11;
                C1360X0.m2031e(c1360x0, uiComponent, c1383g0);
                EnumC17058a enumC17058a = ((C1393l0) obj9).f3714h.f54534Y;
                EnumC17058a enumC17058a2 = EnumC17058a.f54523o0;
                InterfaceC13410a interfaceC13410a = ((C13421l) obj8).f42503Y;
                if (enumC17058a == enumC17058a2 || c1383g0.f3684u0) {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, new C1329H0(componentParams, uiComponent)));
                } else {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c1360x0, new C1327G0(abstractC1391k0, componentParams, uiComponent)));
                }
                return c17296c;
            case 2:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C5997d.m6440a(AbstractC1823p0.f5256a.mo6405a((C1821o0) obj10), AbstractC8411c.m8969c(935424596, c6021p2, new C0148y((InterfaceC10459q) obj11, (C1803f0) obj9, (C8410b) obj8, 6)), c6021p2, 56);
                }
                return c17296c;
            case 3:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C10456n c10456n2 = C10456n.f30959Y;
                    float f10 = AbstractC7313q.f23199d;
                    InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(c10456n2, 0.0f, 0.0f, 0.0f, f10, 7);
                    C17756f c17756f = AbstractC17770m.f56726c;
                    C10449g c10449g = C10444b.f30946y0;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p3, 0);
                    int i14 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11237o);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C21694h c21694h2 = C21698j.f68873f;
                    C5997d.m6439Z(c21694h2, c6021p3, c17790wM19515a);
                    C21694h c21694h3 = C21698j.f68872e;
                    C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m2);
                    C21694h c21694h4 = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p3, i14, c21694h4);
                    }
                    C21694h c21694h5 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d2);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23198c), c10449g, c6021p3, 0);
                    int i15 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p3, c10456n2);
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p3, c17790wM19515a2);
                    C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m3);
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p3, i15, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d3);
                    C10450h c10450h = C10444b.f30944w0;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n2, 1.0f);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h, c6021p3, 48);
                    int i16 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11244d);
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p3, c17781r0M19506b);
                    C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m4);
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i16))) {
                        AbstractC0168G.m537z(i16, c6021p3, i16, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d4);
                    C17785t0 c17785t0 = C17785t0.f56761a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23197b);
                    InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(c10456n2, 1.0f, true);
                    C17790w c17790wM19515a3 = AbstractC17788v.m19515a(c17764jM19500g, c10449g, c6021p3, 0);
                    int i17 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM19513a);
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p3, c17790wM19515a3);
                    C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m5);
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i17))) {
                        AbstractC0168G.m537z(i17, c6021p3, i17, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d5);
                    C1085g0 c1085g0 = (C1085g0) obj11;
                    Double d11 = c1085g0.f2940b.f2932b.f2918a;
                    c6021p3.m6524S(-981400979);
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj10;
                    if (d11 != null) {
                        AbstractC4124r4.m4768b(AbstractC17680n.m19349Y(AbstractC17681o.m19382k(AbstractC7877E4.m8157o(d11.doubleValue(), (EnumC1711p) interfaceC5985X.getValue()), c1085g0.f2940b.f2931a.f2876c), " · ", null, null, 0, null, null, 62), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C3582M(0L, AbstractC9119D4.m9650c(18), C5609y.f18152o0, 0L, 0, 0L, 16777209), c6021p3, 0, 1572864, 65534);
                    }
                    c6021p3.m6553p(false);
                    String str = c1085g0.f2939a.f2822a;
                    c6021p3.m6524S(-981381659);
                    if (str != null) {
                        AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C3582M(AbstractC7302f.f23131g, AbstractC9119D4.m9650c(16), null, 0L, 0, 0L, 16777212), c6021p3, 0, 0, 65534);
                    }
                    c6021p3.m6553p(false);
                    c6021p3.m6553p(true);
                    c6021p3.m6524S(-718404666);
                    Object objM6514H2 = c6021p3.m6514H();
                    Object obj12 = objM6514H2;
                    if (objM6514H2 == c5975s) {
                        C7299c c7299c = new C7299c();
                        c6021p3.m6537c0(c7299c);
                        obj12 = c7299c;
                    }
                    C7299c c7299c2 = (C7299c) obj12;
                    c6021p3.m6553p(false);
                    InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i18 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p3, c10456n2);
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p3, interfaceC21057KM19511e2);
                    C5997d.m6439Z(c21694h3, c6021p3, interfaceC6008i0M6550m6);
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i18))) {
                        AbstractC0168G.m537z(i18, c6021p3, i18, c21694h4);
                    }
                    C5997d.m6439Z(c21694h5, c6021p3, interfaceC10459qM10923d6);
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.dots_vertical, c6021p3, 0);
                    String strM8676d = AbstractC8142m4.m8676d(R.string.image_settings_content_description, c6021p3);
                    long j10 = AbstractC7302f.f23131g;
                    InterfaceC10459q interfaceC10459qM11231i = AbstractC10842a.m11231i(c10456n2, f10, 0.0f, 2);
                    C10858c c10858cM4717b = AbstractC4005X2.m4717b(0.0f, 6, 0L, false);
                    c6021p3.m6524S(-981350859);
                    C11709i c11709i = (C11709i) obj9;
                    boolean zM6545h2 = c6021p3.m6545h(c11709i);
                    Object objM6514H3 = c6021p3.m6514H();
                    Object obj13 = objM6514H3;
                    if (zM6545h2 || objM6514H3 == c5975s) {
                        C2424a c2424a = new C2424a(c11709i, c7299c2);
                        c6021p3.m6537c0(c2424a);
                        obj13 = c2424a;
                    }
                    c6021p3.m6553p(false);
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, strM8676d, AbstractC10844c.m11252l(AbstractC10842a.m11233k(AbstractC10833a.m11208c(interfaceC10459qM11231i, c7299c2, c10858cM4717b, false, null, (InterfaceC1426a) obj13, 28), f10), AbstractC7312p.f23186c), j10, c6021p3, 0, 0);
                    EnumC1711p enumC1711p = (EnumC1711p) interfaceC5985X.getValue();
                    c6021p3.m6524S(-981335199);
                    WeatherViewModel weatherViewModel = (WeatherViewModel) obj8;
                    boolean zM6542f = c6021p3.m6542f(weatherViewModel);
                    Object objM6514H4 = c6021p3.m6514H();
                    Object obj14 = objM6514H4;
                    if (zM6542f || objM6514H4 == c5975s) {
                        C0254h0 c0254h0 = new C0254h0(weatherViewModel, 15);
                        c6021p3.m6537c0(c0254h0);
                        obj14 = c0254h0;
                    }
                    c6021p3.m6553p(false);
                    AbstractC7877E4.m8155h(c11709i, enumC1711p, (InterfaceC1436k) obj14, c6021p3, 0);
                    c6021p3.m6553p(true);
                    c6021p3.m6553p(true);
                    c6021p3.m6553p(true);
                    c6021p3.m6524S(-458596905);
                    Iterator it2 = AbstractC17680n.m19373w0(c1085g0.f2941c, 7).iterator();
                    while (it2.hasNext()) {
                        AbstractC7877E4.m8154d((C1078f0) it2.next(), (EnumC1711p) interfaceC5985X.getValue(), c6021p3, 0);
                    }
                    c6021p3.m6553p(false);
                    c6021p3.m6553p(true);
                }
                return c17296c;
            case 4:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    C10450h c10450h2 = C10444b.f30944w0;
                    float f11 = AbstractC7313q.f23199d;
                    InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10456n, f11);
                    C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h2, c6021p4, 48);
                    int i19 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11233k);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i3 = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i3);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p4, c17781r0M19506b2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m7);
                    C21694h c21694h6 = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i19))) {
                        AbstractC0168G.m537z(i19, c6021p4, i19, c21694h6);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d7);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.temperature, c6021p4), AbstractC10842a.m11235m(c10456n, f11, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C3582M.m4274b(((C3941K4) c6021p4.m6548k(AbstractC3947L4.f12183a)).f12157m, AbstractC7302f.f23131g, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214), c6021p4, 0, 0, 65532);
                    String strM8676d2 = AbstractC8142m4.m8676d(R.string.degrees_fahrenheit, c6021p4);
                    EnumC1711p enumC1711p2 = (EnumC1711p) obj11;
                    C3582M c3582mM8158q = AbstractC7877E4.m8158q(enumC1711p2 == EnumC1711p.Fahrenheit, c6021p4);
                    c6021p4.m6524S(669823864);
                    Object objM6514H5 = c6021p4.m6514H();
                    C5996c0 c5996c0 = (C5996c0) obj9;
                    Object obj15 = objM6514H5;
                    if (objM6514H5 == c5975s) {
                        C0884r c0884r = new C0884r(c5996c0, i10);
                        c6021p4.m6537c0(c0884r);
                        obj15 = c0884r;
                    }
                    c6021p4.m6553p(false);
                    InterfaceC7537b interfaceC7537b = (InterfaceC7537b) obj10;
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11257q(AbstractC10868a.m11319e(c10456n, (InterfaceC1436k) obj15), AbstractC9245Z.m9819a(c5996c0.m6412g(), interfaceC7537b), 0.0f, 2), f11, 0.0f, 2);
                    c6021p4.m6524S(669831535);
                    Object objM6514H6 = c6021p4.m6514H();
                    Object objM536y = objM6514H6;
                    if (objM6514H6 == c5975s) {
                        objM536y = AbstractC0168G.m536y(c6021p4);
                    }
                    InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM536y;
                    c6021p4.m6553p(false);
                    C10858c c10858cM4717b2 = AbstractC4005X2.m4717b(0.0f, 6, 0L, false);
                    c6021p4.m6524S(669835799);
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj8;
                    boolean zM6542f2 = c6021p4.m6542f(interfaceC1436k);
                    Object objM6514H7 = c6021p4.m6514H();
                    Object obj16 = objM6514H7;
                    if (zM6542f2 || objM6514H7 == c5975s) {
                        C0459F c0459f = new C0459F(1, interfaceC1436k);
                        c6021p4.m6537c0(c0459f);
                        obj16 = c0459f;
                    }
                    c6021p4.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(interfaceC10459qM11235m, interfaceC17406l, c10858cM4717b2, false, null, (InterfaceC1426a) obj16, 28);
                    float f12 = AbstractC7313q.f23198c;
                    AbstractC4124r4.m4768b(strM8676d2, AbstractC10842a.m11233k(interfaceC10459qM11208c, f12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582mM8158q, c6021p4, 0, 0, 65532);
                    AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC10844c.m11256p(AbstractC10844c.m11245e(c10456n, 24), 2), AbstractC4031c1.m4722a(c6021p4), AbstractC14334L.f44973a), c6021p4, 0);
                    String strM8676d3 = AbstractC8142m4.m8676d(R.string.degrees_celsius, c6021p4);
                    C3582M c3582mM8158q2 = AbstractC7877E4.m8158q(enumC1711p2 == EnumC1711p.Celsius, c6021p4);
                    c6021p4.m6524S(669854200);
                    Object objM6514H8 = c6021p4.m6514H();
                    Object obj17 = objM6514H8;
                    if (objM6514H8 == c5975s) {
                        C0884r c0884r2 = new C0884r(c5996c0, 3);
                        c6021p4.m6537c0(c0884r2);
                        obj17 = c0884r2;
                    }
                    c6021p4.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(AbstractC10844c.m11257q(AbstractC10868a.m11319e(c10456n, (InterfaceC1436k) obj17), interfaceC7537b.mo7861O(c5996c0.m6412g()), 0.0f, 2), f11, 0.0f, 2);
                    c6021p4.m6524S(669861871);
                    Object objM6514H9 = c6021p4.m6514H();
                    Object objM536y2 = objM6514H9;
                    if (objM6514H9 == c5975s) {
                        objM536y2 = AbstractC0168G.m536y(c6021p4);
                    }
                    InterfaceC17406l interfaceC17406l2 = (InterfaceC17406l) objM536y2;
                    c6021p4.m6553p(false);
                    C10858c c10858cM4717b3 = AbstractC4005X2.m4717b(0.0f, 6, 0L, false);
                    c6021p4.m6524S(669866132);
                    boolean zM6542f3 = c6021p4.m6542f(interfaceC1436k);
                    Object objM6514H10 = c6021p4.m6514H();
                    Object obj18 = objM6514H10;
                    if (zM6542f3 || objM6514H10 == c5975s) {
                        C0459F c0459f2 = new C0459F(i10, interfaceC1436k);
                        c6021p4.m6537c0(c0459f2);
                        obj18 = c0459f2;
                    }
                    c6021p4.m6553p(false);
                    AbstractC4124r4.m4768b(strM8676d3, AbstractC10842a.m11233k(AbstractC10833a.m11208c(interfaceC10459qM11235m2, interfaceC17406l2, c10858cM4717b3, false, null, (InterfaceC1426a) obj18, 28), f12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582mM8158q2, c6021p4, 0, 0, 65532);
                    c6021p4.m6553p(true);
                }
                return c17296c;
            case 5:
                File file = (File) obj;
                C18428A cameraProperties = (C18428A) obj2;
                AbstractC16544l.m18094g(file, "file");
                AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
                C22156g0 c22156g0 = (C22156g0) obj11;
                List list3 = c22156g0.f70051o0;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((InterfaceC22096F) it3.next()).mo22351v0());
                }
                EnumC22094E enumC22094E = EnumC22094E.f69838Y;
                boolean zContains = arrayList2.contains(enumC22094E);
                EnumC22094E enumC22094E2 = EnumC22094E.f69839Z;
                boolean zContains2 = arrayList2.contains(enumC22094E2);
                String absolutePath = file.getAbsolutePath();
                AbstractC16544l.m18093f(absolutePath, "getAbsolutePath(...)");
                List listM9974d = AbstractC9393x3.m9974d(new C22205x(absolutePath, "video/*"));
                if (zContains && zContains2) {
                    enumC22094E = EnumC22094E.f69840o0;
                } else if (!zContains && zContains2) {
                    enumC22094E = enumC22094E2;
                }
                AbstractC22120R0.m22361h(c22156g0, (C13421l) obj10, (C22195t0) obj9, new C22092D(listM9974d, enumC22094E, c22156g0.f70050Z.f69957Y, EnumC22088B.f69817Z), c22156g0.f70050Z, (C2685e) obj8, cameraProperties, false, null, 0, 1792);
                return c17296c;
            case 6:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                    return c17296c;
                }
                FillElement fillElement = AbstractC10844c.f32512c;
                InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i20 = c6021p5.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m8 = c6021p5.m6550m();
                InterfaceC10459q interfaceC10459qM10923d8 = AbstractC10443a.m10923d(c6021p5, fillElement);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i4 = C21698j.f68869b;
                c6021p5.m6528W();
                if (c6021p5.f19563O) {
                    c6021p5.m6549l(c21696i4);
                } else {
                    c6021p5.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p5, interfaceC21057KM19511e3);
                C5997d.m6439Z(C21698j.f68872e, c6021p5, interfaceC6008i0M6550m8);
                C21694h c21694h7 = C21698j.f68874g;
                if (c6021p5.f19563O || !AbstractC16544l.m18089b(c6021p5.m6514H(), Integer.valueOf(i20))) {
                    AbstractC0168G.m537z(i20, c6021p5, i20, c21694h7);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p5, interfaceC10459qM10923d8);
                c6021p5.m6524S(1681888038);
                C21522k c21522k = (C21522k) obj11;
                if (c21522k != null) {
                    float f13 = AbstractC3366g1.f10276a;
                    c6021p5.m6524S(-2059823413);
                    c6021p5.m6524S(1383052752);
                    Object objM6514H11 = c6021p5.m6514H();
                    if (objM6514H11 == c5975s) {
                        obj4 = objM6514H11;
                        C3369h1 c3369h1 = new C3369h1();
                        c6021p5.m6537c0(c3369h1);
                        obj4 = c3369h1;
                    }
                    obj4 = objM6514H11;
                    C3369h1 state = (C3369h1) obj4;
                    c6021p5.m6553p(false);
                    c6021p5.m6553p(false);
                    c6021p5.m6524S(1681892581);
                    String str2 = (String) obj10;
                    String str3 = (String) obj9;
                    C21523l c21523l2 = c21522k.f68154c;
                    if (c21523l2 != null) {
                        C9436E c9436e = new C9436E(3, (Set) null);
                        C3317L c3317l = C3317L.f10106Z;
                        InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                        AbstractC16544l.m18094g(interfaceC10459qM11244d2, "<this>");
                        AbstractC16544l.m18094g(state, "state");
                        c6021p5.m6524S(1562048402);
                        long jM4182b = AbstractC3365g0.m4182b(c6021p5);
                        c6021p5.m6524S(673084120);
                        boolean zM6545h3 = c6021p5.m6545h(state) | c6021p5.m6540e(jM4182b);
                        Object objM6514H12 = c6021p5.m6514H();
                        if (zM6545h3 || objM6514H12 == c5975s) {
                            z11 = false;
                            C3357d1 c3357d1 = new C3357d1(state, jM4182b, false ? 1 : 0);
                            c6021p5.m6537c0(c3357d1);
                            obj7 = c3357d1;
                        } else {
                            z11 = false;
                            obj7 = objM6514H12;
                        }
                        c6021p5.m6553p(z11);
                        InterfaceC10459q interfaceC10459qM11297c = AbstractC10861a.m11297c(interfaceC10459qM11244d2, (InterfaceC1436k) obj7);
                        c6021p5.m6553p(z11);
                        InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(interfaceC10459qM11297c, AbstractC8479G.m9124e(c6021p5), 12);
                        float f14 = AbstractC3319M.f10122a;
                        AbstractC8080e6.m8506a(str2, str3, c21523l2.f68160f, false, c9436e, c3317l, AbstractC10842a.m11237o(interfaceC10459qM9126g, f14, 0.0f, f14, f14, 2), c6021p5, 224256);
                    }
                    c6021p5.m6553p(false);
                    C21523l c21523l3 = c21522k.f68152a;
                    C7320F c7320f = c21523l3.f68160f;
                    boolean z12 = c21523l3.f68162h == EnumC21524m.f68163Y;
                    C9436E c9436e2 = new C9436E(3, (Set) null);
                    c6021p5.m6524S(1681943404);
                    c6021p5.m6524S(1681933706);
                    InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    if (c21523l2 != null) {
                        AbstractC16544l.m18094g(interfaceC10459qM11244d3, "<this>");
                        AbstractC16544l.m18094g(state, "state");
                        c6021p5.m6524S(643685597);
                        long jM4182b2 = AbstractC3365g0.m4182b(c6021p5);
                        c6021p5.m6524S(-1184362213);
                        boolean zM6545h4 = c6021p5.m6545h(state) | c6021p5.m6540e(jM4182b2);
                        Object objM6514H13 = c6021p5.m6514H();
                        if (zM6545h4 || objM6514H13 == c5975s) {
                            obj6 = objM6514H13;
                            C3357d1 c3357d2 = new C3357d1(state, jM4182b2, 1);
                            c6021p5.m6537c0(c3357d2);
                            obj6 = c3357d2;
                        }
                        z6 = false;
                        c6021p5.m6553p(false);
                        interfaceC10459qM11244d3 = AbstractC10861a.m11297c(interfaceC10459qM11244d3, (InterfaceC1436k) obj6);
                        c6021p5.m6553p(false);
                    } else {
                        z6 = false;
                    }
                    c6021p5.m6553p(z6);
                    InterfaceC10459q interfaceC10459qM9126g2 = AbstractC8479G.m9126g(interfaceC10459qM11244d3, AbstractC8479G.m9124e(c6021p5), 12);
                    float f15 = AbstractC3319M.f10122a;
                    InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(interfaceC10459qM9126g2, 0.0f, 0.0f, 0.0f, f15, 7);
                    if (c21523l2 != null) {
                        AbstractC16544l.m18094g(interfaceC10459qM11237o2, "<this>");
                        AbstractC16544l.m18094g(state, "state");
                        c6021p5.m6524S(553314463);
                        Object objM6514H14 = c6021p5.m6514H();
                        if (objM6514H14 == c5975s) {
                            objM529r = objM6514H14;
                            objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p5), c6021p5);
                        }
                        objM529r = objM6514H14;
                        C2925c c2925c = ((C6035w) objM529r).f19668Y;
                        InterfaceC7537b density = (InterfaceC7537b) c6021p5.m6548k(AbstractC0187M0.f704f);
                        float f16 = AbstractC3366g1.f10276a;
                        AbstractC16544l.m18094g(density, "density");
                        float fMo7864b0 = density.mo7864b0(f16);
                        c6021p5.m6524S(1833232316);
                        boolean zM6536c = c6021p5.m6536c(fMo7864b0) | c6021p5.m6545h(c2925c) | c6021p5.m6545h(state);
                        Object objM6514H15 = c6021p5.m6514H();
                        if (zM6536c || objM6514H15 == c5975s) {
                            z10 = false;
                            C3363f1 c3363f1 = new C3363f1(fMo7864b0, (Object) c2925c, (Object) state, (int) (false ? 1 : 0));
                            c6021p5.m6537c0(c3363f1);
                            obj5 = c3363f1;
                        } else {
                            z10 = false;
                            obj5 = objM6514H15;
                        }
                        c6021p5.m6553p(z10);
                        InterfaceC10459q interfaceC10459qM11319e = AbstractC10868a.m11319e(interfaceC10459qM11237o2, (InterfaceC1436k) obj5);
                        c6021p5.m6553p(z10);
                        interfaceC10459q = interfaceC10459qM11319e;
                    } else {
                        z10 = false;
                        interfaceC10459q = interfaceC10459qM11237o2;
                    }
                    c6021p5.m6553p(z10);
                    AbstractC8080e6.m8506a(str2, str3, c7320f, z12, c9436e2, (InterfaceC1436k) obj8, AbstractC10842a.m11237o(interfaceC10459q, f15, 0.0f, f15, 0.0f, 10), c6021p5, 24576);
                } else {
                    c10843b = c10843b;
                    c10456n = c10456n;
                    c17296c = c17296c;
                }
                Object objM530s = AbstractC0168G.m530s(1681952719, c6021p5, false);
                Object obj19 = objM530s;
                if (objM530s == c5975s) {
                    C13740P c13740p = new C13740P(Boolean.FALSE);
                    c6021p5.m6537c0(c13740p);
                    obj19 = c13740p;
                }
                C13740P c13740p2 = (C13740P) obj19;
                c6021p5.m6553p(false);
                EnumC21524m enumC21524m = (c21522k == null || (c21523l = c21522k.f68152a) == null) ? null : c21523l.f68162h;
                c13740p2.f43331c.setValue(Boolean.valueOf(enumC21524m == EnumC21524m.f68163Y || enumC21524m == EnumC21524m.f68165o0));
                C13467E c13467eM14995a = AbstractC13508z.m15013e(null, 3).m14995a(AbstractC13508z.m15022n(null, C3317L.f10107o0, 1));
                C13468F c13468fM14996a = AbstractC13508z.m15014f(null, 3).m14996a(AbstractC13508z.m15024p(null, C3317L.f10108p0, 1));
                InterfaceC10459q interfaceC10459qM11237o3 = AbstractC10842a.m11237o(c10843b.m11240a(c10456n, C10444b.f30941t0), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
                C8410b c8410b = AbstractC3343Y0.f10205a;
                AbstractC10831a.m11199b(c13740p2, interfaceC10459qM11237o3, c13467eM14995a, c13468fM14996a, null, c6021p5, 200064);
                c6021p5.m6553p(true);
                return c17296c;
            case 7:
                C11682a datadogContext = (C11682a) obj;
                InterfaceC13576b eventBatchWriter = (InterfaceC13576b) obj2;
                AbstractC16544l.m18094g(datadogContext, "datadogContext");
                AbstractC16544l.m18094g(eventBatchWriter, "eventBatchWriter");
                C4957b c4957b = (C4957b) obj11;
                C16173a c16173a = (C16173a) obj10;
                c4957b.f16173o0.mo12662a(eventBatchWriter, c4957b.f16176r0.m16582j(9, c16173a.f50207d, c16173a.f50205b, (Map) obj9, C17691y.f56482Y, c16173a.f50206c, c16173a.f50204a, datadogContext, true, "crash", true, true, null, null, c16173a.f50208e), 2);
                ((CountDownLatch) obj8).countDown();
                return c17296c;
            case 8:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC4033c3.m4723a(null, AbstractC8411c.m8969c(562360425, c6021p6, new C3321N(5, (InterfaceC1426a) obj9)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(1538001214, c6021p6, new C2450F((C6172d) obj11, (InterfaceC1436k) obj8, (InterfaceC1436k) obj10, i10)), c6021p6, 805306416, 509);
                }
                return c17296c;
            case 9:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    C6682r c6682r = (C6682r) obj11;
                    AbstractC9274d4.m9842a(AbstractC8411c.m8969c(-75196956, c6021p7, new C0227a(c6682r, 22)), null, AbstractC8411c.m8969c(1011762594, c6021p7, new C4334d((C8870f) obj10, 8)), AbstractC8411c.m8969c(1283534041, c6021p7, new C6677m(c6682r, (ConversationSpreadsheetViewModel) obj9, (InterfaceC5985X) obj8)), false, null, c6021p7, 3462, 50);
                }
                return c17296c;
            case 10:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11235m3 = AbstractC10842a.m11235m(AbstractC10844c.m11256p((InterfaceC10459q) obj11, AbstractC7312p.f23193j), AbstractC7313q.f23201f, 0.0f, 2);
                    float f17 = AbstractC4017a.f12601a;
                    AbstractC4034c4.m4725a(interfaceC10459qM11235m3, AbstractC4141u3.m4770a(AbstractC5253e.f17195a, c6021p8), 0L, 0L, AbstractC7306j.f23147e, 0.0f, null, AbstractC8411c.m8969c(451046866, c6021p8, new C0148y((InterfaceC5985X) obj10, (InterfaceC1426a) obj9, (InterfaceC1436k) obj8, 17)), c6021p8, 12582912, 108);
                }
                return c17296c;
            case 11:
                return m1971a(obj, obj2);
            case 12:
                return m1972b(obj, obj2);
            case 13:
                return m1973c(obj, obj2);
            case 14:
                return m1974e(obj, obj2);
            case 15:
                return m1975f(obj, obj2);
            case 16:
                return m1976h(obj, obj2);
            case 17:
                return m1977i(obj, obj2);
            case 18:
                return m1978k(obj, obj2);
            case 19:
                return m1979l(obj, obj2);
            case 20:
                return m1980m(obj, obj2);
            case 21:
                return m1981n(obj, obj2);
            default:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    AbstractC7343b0 abstractC7343b0 = (AbstractC7343b0) obj10;
                    if (abstractC7343b0 instanceof C7326L) {
                        c6021p9.m6524S(-1485430575);
                        AbstractC4124r4.m4768b(((C7326L) abstractC7343b0).f23233c, (InterfaceC10459q) obj11, 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, c6021p9, 0, 0, 130556);
                        c6021p9.m6553p(false);
                    } else if (abstractC7343b0 instanceof C7320F) {
                        c6021p9.m6524S(367732788);
                        AbstractC8080e6.m8506a(null, (String) obj9, (C7320F) abstractC7343b0, false, new C9436E(C17691y.f56482Y, C17690x.f56481Y), (InterfaceC1436k) obj8, (InterfaceC10459q) obj11, c6021p9, 27654);
                        c6021p9.m6553p(false);
                    } else {
                        c6021p9.m6524S(367744407);
                        c6021p9.m6553p(false);
                    }
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268j(EnumC1711p enumC1711p, InterfaceC7537b interfaceC7537b, InterfaceC1436k interfaceC1436k, C5996c0 c5996c0) {
        super(2);
        this.f3364Y = 4;
        this.f3365Z = enumC1711p;
        this.f3366o0 = interfaceC7537b;
        this.f3368q0 = interfaceC1436k;
        this.f3367p0 = c5996c0;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    private final Object m1974e(Object obj, Object obj2) throws IOException {
        String strM8249b;
        InterfaceC13823a interfaceC13823a;
        String str;
        List list;
        List list2;
        Object next;
        Object obj3 = this.f3367p0;
        C11682a datadogContext = (C11682a) obj;
        InterfaceC13576b eventBatchWriter = (InterfaceC13576b) obj2;
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
        AbstractC16544l.m18094g(eventBatchWriter, "eventBatchWriter");
        C17946W1 c17946w1 = (C17946W1) this.f3365Z;
        C17937T1 c17937t1 = c17946w1.f57240g;
        C10519b c10519b = (C10519b) this.f3366o0;
        Map map = (Map) datadogContext.f35424p.get("rum");
        if (map == null) {
            map = C17690x.f56481Y;
        }
        Object obj4 = map.get("session_id");
        String str2 = null;
        if (!AbstractC16544l.m18089b(c17937t1.f57169a, obj4 instanceof String ? (String) obj4 : null)) {
            InterfaceC13823a interfaceC13823a2 = c10519b.f31182a;
            Long lMo15451g = interfaceC13823a2.mo15451g();
            long timestamp = ((ApplicationExitInfo) obj3).getTimestamp();
            if (lMo15451g == null || timestamp != lMo15451g.longValue()) {
                InputStream traceInputStream = ((ApplicationExitInfo) obj3).getTraceInputStream();
                C17689w c17689w = C17689w.f56480Y;
                EnumC11255b enumC11255b = EnumC11255b.f34098Y;
                String str3 = "";
                if (traceInputStream == null) {
                    AbstractC7889G0.m8184b(interfaceC13823a2.mo15463s(), 4, enumC11255b, C10518a.f31174q0, null, false, 56);
                    list2 = c17689w;
                    interfaceC13823a = interfaceC13823a2;
                    str = "";
                } else {
                    C11261e c11261e = c10519b.f31184c;
                    c11261e.getClass();
                    try {
                        try {
                            strM8249b = AbstractC7958O5.m8249b(new InputStreamReader(traceInputStream, C21307a.f67720a));
                            AbstractC7942M5.m8232a(traceInputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC7942M5.m8232a(traceInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (IOException e10) {
                        AbstractC7889G0.m8184b(c11261e.f34114a, 5, enumC11255b, C11258b.f34106p0, e10, false, 48);
                        strM8249b = "";
                    }
                    if (AbstractC21322p.m21681O(strM8249b)) {
                        interfaceC13823a = interfaceC13823a2;
                        str = "";
                        list = c17689w;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = AbstractC21322p.m21685S(strM8249b).iterator();
                        String str4 = null;
                        loop1: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (!it.hasNext()) {
                                    break loop1;
                                }
                                String str5 = (String) it.next();
                                if (AbstractC21322p.m21681O(str5) && z6) {
                                    if (!arrayList2.isEmpty() && str2 != null) {
                                        String str6 = str4 == null ? str3 : str4;
                                        if (str6.equals(CsqksqyPE.hljabJCt)) {
                                            str6 = "Timed_Waiting";
                                        }
                                        Locale locale = Locale.US;
                                        arrayList.add(new C16175c(str2, AbstractC0168G.m534w(locale, "US", str6, locale, "toLowerCase(...)"), str2.equals("main"), AbstractC17680n.m19349Y(arrayList2, Separators.RETURN, null, null, 0, null, null, 62)));
                                    }
                                    arrayList2.clear();
                                    it = it;
                                    interfaceC13823a2 = interfaceC13823a2;
                                    str3 = str3;
                                } else {
                                    it = it;
                                    interfaceC13823a2 = interfaceC13823a2;
                                    str3 = str3;
                                    if (AbstractC21322p.m21667A(str5, " prio=", false) && AbstractC21322p.m21667A(str5, " tid=", false)) {
                                        str4 = (String) AbstractC17680n.m19353c0(AbstractC21322p.m21697e0(str5, new String[]{Separators.f31991SP}, 0, 6));
                                        C21317k c21317kM21663c = C11261e.f34113b.m21663c(str5);
                                        str2 = c21317kM21663c != null ? (String) AbstractC17680n.m19344T(1, c21317kM21663c.m21657a()) : null;
                                        z6 = true;
                                    } else if (z6) {
                                        String string = AbstractC21322p.m21714v0(str5).toString();
                                        if (AbstractC21329w.m21734u(string, "at ", false) || AbstractC21329w.m21734u(string, "native: ", false)) {
                                            arrayList2.add(str5);
                                        }
                                    }
                                }
                            }
                        }
                        interfaceC13823a = interfaceC13823a2;
                        str = str3;
                        boolean zIsEmpty = arrayList.isEmpty();
                        list = arrayList;
                        if (zIsEmpty) {
                            AbstractC7889G0.m8185c(c11261e.f34114a, 5, AbstractC17681o.m19382k(EnumC11255b.f34099Z, EnumC11255b.f34100o0), C11258b.f34105o0, null, 56);
                            list = arrayList;
                        }
                    }
                    list2 = list;
                }
                if (!list2.isEmpty()) {
                    long timestamp2 = ((ApplicationExitInfo) obj3).getTimestamp();
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!((C16175c) next).f50212a.equals("main"));
                    C16175c c16175c = (C16175c) next;
                    String str7 = c16175c != null ? c16175c.f50214c : null;
                    String str8 = str7 == null ? str : str7;
                    String canonicalName = C11260d.class.getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = str;
                    }
                    InterfaceC13823a interfaceC13823a3 = interfaceC13823a;
                    C17984k0 c17984k0M10973a = C10519b.m10973a(c10519b, datadogContext, 1, 1, "Application Not Responding", timestamp2, null, str8, canonicalName, list2, c17946w1);
                    InterfaceC13575a interfaceC13575a = (InterfaceC13575a) this.f3368q0;
                    interfaceC13575a.mo12662a(eventBatchWriter, c17984k0M10973a, 2);
                    if (System.currentTimeMillis() - c17946w1.f57234a < C10519b.f31181d) {
                        interfaceC13575a.mo12662a(eventBatchWriter, C10519b.m10974b(c10519b, c17946w1), 2);
                    }
                    interfaceC13823a3.mo15462r(((ApplicationExitInfo) obj3).getTimestamp());
                }
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268j(InterfaceC5985X interfaceC5985X, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, String str) {
        super(2);
        this.f3364Y = 20;
        this.f3365Z = interfaceC5985X;
        this.f3367p0 = interfaceC1426a;
        this.f3368q0 = interfaceC1436k;
        this.f3366o0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268j(AbstractC6659u abstractC6659u, C9436E c9436e, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q) {
        super(2);
        this.f3364Y = 21;
        this.f3366o0 = abstractC6659u;
        this.f3367p0 = c9436e;
        this.f3368q0 = interfaceC1436k;
        this.f3365Z = interfaceC10459q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268j(EnumC8830k enumC8830k, InterfaceC1436k interfaceC1436k, C8829j c8829j, C11391s c11391s) {
        super(2);
        this.f3364Y = 12;
        this.f3365Z = enumC8830k;
        this.f3368q0 = interfaceC1436k;
        this.f3366o0 = c8829j;
        this.f3367p0 = c11391s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268j(InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, AbstractC17140a abstractC17140a, String str) {
        super(2);
        this.f3364Y = 17;
        this.f3365Z = interfaceC10459q;
        this.f3367p0 = interfaceC1426a;
        this.f3366o0 = abstractC17140a;
        this.f3368q0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1268j(Object obj, InterfaceC10459q interfaceC10459q, Object obj2, InterfaceC17302e interfaceC17302e, int i10) {
        super(2);
        this.f3364Y = i10;
        this.f3366o0 = obj;
        this.f3365Z = interfaceC10459q;
        this.f3367p0 = obj2;
        this.f3368q0 = interfaceC17302e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1268j(Object obj, Object obj2, InterfaceC10459q interfaceC10459q, InterfaceC1440o interfaceC1440o, int i10) {
        super(2);
        this.f3364Y = i10;
        this.f3366o0 = obj;
        this.f3367p0 = obj2;
        this.f3365Z = interfaceC10459q;
        this.f3368q0 = interfaceC1440o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1268j(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(2);
        this.f3364Y = i10;
        this.f3365Z = obj;
        this.f3366o0 = obj2;
        this.f3367p0 = obj3;
        this.f3368q0 = obj4;
    }
}
