package p042Bf;

import ad.AbstractC10541b;
import ad.C10540a;
import af.AbstractC10576d;
import af.C10545A;
import af.C10598z;
import ag.AbstractC10605g;
import android.content.Context;
import android.gov.nist.core.Separators;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.p650ui.focus.AbstractC10862a;
import bf.C11349D;
import bf.C11390r;
import bf.C11391s;
import bf.InterfaceC11374b0;
import cf.AbstractC11728d;
import cn.UfGr.EhBykzn;
import coil.compose.AsyncImagePainter;
import com.google.protobuf.AbstractC12107L1;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.chatgpt.R;
import com.openai.feature.conversationdetails.impl.ConversationDetailsViewModel;
import com.openai.feature.conversations.impl.input.AbstractC12341a;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import com.openai.feature.settings.impl.settings.C12507a;
import com.openai.feature.settings.impl.settings.SettingsViewModel;
import com.openai.feature.subscriptions.ChoosePlanViewModel;
import com.openai.feature.widget.impl.ConversationAction;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import ge.AbstractC14085k0;
import ge.C14103t0;
import ge.C14111x0;
import ge.EnumC14059W0;
import gf.C14127l;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kg.C16410p;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mg.AbstractC17251b;
import mg.C17252c;
import mm.C17296C;
import ng.C17618i;
import p003A1.AbstractC0168G;
import p003A1.C0155B1;
import p003A1.C0248f0;
import p003A1.C0292u;
import p006A4.C0339D;
import p020Ai.C0515d;
import p021Aj.C0537v;
import p025An.C0644w;
import p040Bd.C0893B;
import p040Bd.C1166t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p098Di.InterfaceC2062k;
import p1025te.C19866Q;
import p1042uh.C20263a0;
import p1048uo.AbstractC20397d;
import p1081wc.InterfaceC20904w;
import p1095x1.C21089j;
import p1095x1.InterfaceC21057K;
import p1135yn.C21555b;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1150zd.EnumC21875k;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.C21936L0;
import p1155zi.InterfaceC21925I1;
import p117Eb.C2385o;
import p124Ei.C2497c;
import p124Ei.C2517i1;
import p124Ei.C2529m1;
import p124Ei.C2535p;
import p145Ff.C2728f;
import p152Fm.AbstractC2922d;
import p169Gf.C3046j;
import p193Hf.C3325P;
import p204I1.C3582M;
import p204I1.C3590f;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4094m4;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4145v1;
import p229J0.AbstractC4150w0;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p244Jg.AbstractC4342f;
import p244Jg.C4339c;
import p244Jg.C4340d;
import p253K.AbstractC4502m;
import p269Kh.C4688o;
import p273Kl.C4714D;
import p283L5.AbstractC4941g;
import p291Lf.AbstractC5006c;
import p291Lf.C5013j;
import p292Lg.C5034f;
import p302M0.AbstractC5253e;
import p316Mf.AbstractC5336c;
import p316Mf.C5337d;
import p324Mn.C5554x;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p350O1.C6051I;
import p362Of.C6194i;
import p363Og.C6207k;
import p363Og.C6209m;
import p363Og.C6221y;
import p402Qc.C6593i;
import p406Qg.C6703N;
import p437Rn.C6959q;
import p467T1.C7199i;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7309m;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p478Tc.AbstractC7314r;
import p482Tg.AbstractC7451h;
import p482Tg.AbstractC7459p;
import p482Tg.C7439X;
import p482Tg.C7448e;
import p482Tg.EnumC7465v;
import p492U1.C7542g;
import p492U1.InterfaceC7537b;
import p502Uc.AbstractC7622f;
import p502Uc.AbstractC7625i;
import p523V9.AbstractC7987S3;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8114j0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8152n6;
import p531Vj.C8361c0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8473F;
import p544W9.AbstractC8497J;
import p544W9.AbstractC8532O4;
import p544W9.AbstractC8543Q3;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8739x2;
import p547Wc.AbstractC8757A;
import p547Wc.AbstractC8815y;
import p547Wc.C8764H;
import p547Wc.C8804n;
import p547Wc.C8816z;
import p550We.C8829j;
import p550We.EnumC8830k;
import p552Wg.C8847i;
import p553Wh.C8870f;
import p571X9.AbstractC9225V3;
import p571X9.AbstractC9264c0;
import p586Y0.C9566r;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9727F3;
import p594Y9.AbstractC9745I3;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9751J3;
import p594Y9.AbstractC9781O3;
import p594Y9.AbstractC9815U2;
import p594Y9.AbstractC9821V2;
import p623Zf.C10324t;
import p624Zg.AbstractC10374j;
import p624Zg.C10376k;
import p624Zg.C10378l;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p654b1.EnumC11216j;
import p729ej.AbstractC13422m;
import p729ej.C13421l;
import p737f1.C13522n;
import p752fg.C13642a;
import p774h1.C14365u;
import p776h3.C14392f;
import p776h3.C14400n;
import p776h3.C14404r;
import p789hg.AbstractC14503b;
import p810ig.AbstractC14982a;
import p810ig.AbstractC14985d;
import p837ji.C16218g;
import p858ko.C16482A;
import p884m3.C17146e;
import p893n.AbstractActivityC17375g;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17786u;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;
import p926of.AbstractC18176m;
import p926of.C18173j;
import p926of.C18174k;
import p963qd.C18678g;
import p963qd.C18686o;
import p963qd.C18687p;
import p968qi.C18729l;
import p968qi.C18734q;
import p968qi.C18739v;
import p968qi.C18742y;
import p968qi.EnumC18738u;
import ph.C18414b;
import ph.C18417e;
import tf.AbstractC19918c;
import tf.C19906K;
import tm.C20007b;
import ve.C20584h;

/* JADX INFO: renamed from: Bf.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281w extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3408Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3409Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3410o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f3411p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1281w(InterfaceC5985X interfaceC5985X, Object obj, Object obj2, int i10) {
        super(3);
        this.f3408Y = i10;
        this.f3411p0 = interfaceC5985X;
        this.f3409Z = obj;
        this.f3410o0 = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m1993a(Object obj, Object obj2, Object obj3) {
        C17794y DropdownMenu = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1250863264);
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f3409Z;
            boolean zM6542f = c6021p.m6542f(interfaceC1436k);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3411p0;
            if (zM6542f || objM6514H == c5975s) {
                objM6514H = new C3325P(interfaceC1436k, interfaceC5985X, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9821V2.m10461b(null, (InterfaceC1426a) objM6514H, null, c6021p, 6);
            for (C20263a0 c20263a0 : (List) this.f3410o0) {
                c6021p.m6524S(1250871405);
                boolean zM6542f2 = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(c20263a0);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == c5975s) {
                    objM6514H2 = new C6959q(interfaceC1436k, c20263a0, interfaceC5985X, 4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC9821V2.m10461b(c20263a0, (InterfaceC1426a) objM6514H2, null, c6021p, 0);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    private final Object m1994b(Object obj, Object obj2, Object obj3) {
        C10845a item = (C10845a) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(item, "$this$item");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8829j c8829j = (C8829j) this.f3409Z;
            Map map = c8829j.f27017c;
            EnumC8830k enumC8830k = map != null ? (EnumC8830k) map.get("all") : null;
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) ((InterfaceC3759g) this.f3411p0);
            C11390r c11390r = C11391s.Companion;
            AbstractC20397d.m21061c(c8829j, (C11391s) this.f3410o0, enumC8830k, interfaceC1436k, null, c6021p, 0);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    private final Object m1995c(Object obj, Object obj2, Object obj3) {
        InterfaceC17763i0 it = (InterfaceC17763i0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(it, "it");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3411p0;
            boolean zIsEmpty = ((C10378l) interfaceC5985X.getValue()).f30750a.isEmpty();
            C10456n c10456n = C10456n.f30959Y;
            if (zIsEmpty) {
                c6021p.m6524S(-936629840);
                float f10 = AbstractC7313q.f23201f;
                InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10456n, f10);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
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
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                AbstractC10374j.m10890d(0, c6021p);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
                AbstractC10374j.m10890d(0, c6021p);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-936383607);
                InterfaceC10459q interfaceC10459qM11233k2 = AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23201f);
                c6021p.m6524S(-168752239);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                ChoosePlanViewModel choosePlanViewModel = (ChoosePlanViewModel) this.f3409Z;
                boolean zM6542f2 = zM6542f | c6021p.m6542f(choosePlanViewModel);
                Object objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (zM6542f2 || objM6514H == c5975s) {
                    objM6514H = new C8847i(interfaceC5985X, 7, choosePlanViewModel);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9746I4.m10337a(interfaceC10459qM11233k2, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 254);
                C10376k c10376k = ((C10378l) interfaceC5985X.getValue()).f30751b;
                if (c10376k != null) {
                    String strM8676d = AbstractC8142m4.m8676d(R.string.subscriptions_choose_plan_confirm_dialog_title, c6021p);
                    String strM8676d2 = AbstractC8142m4.m8676d(R.string.subscriptions_choose_plan_confirm_dialog_primary_button_text, c6021p);
                    c6021p.m6524S(-168723579);
                    boolean zM6542f3 = c6021p.m6542f(choosePlanViewModel);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6542f3 || objM6514H2 == c5975s) {
                        objM6514H2 = new C6593i(choosePlanViewModel, 29);
                        c6021p.m6537c0(objM6514H2);
                    }
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H2;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-168720591);
                    boolean zM6542f4 = c6021p.m6542f(choosePlanViewModel);
                    AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) this.f3410o0;
                    boolean zM6545h = zM6542f4 | c6021p.m6545h(abstractActivityC17375g) | c6021p.m6542f(c10376k);
                    Object objM6514H3 = c6021p.m6514H();
                    if (zM6545h || objM6514H3 == c5975s) {
                        objM6514H3 = new C6959q(choosePlanViewModel, abstractActivityC17375g, c10376k, 7);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H3, c10376k.f30747a, strM8676d2, 0L, strM8676d, true, null, c6021p, 1572864, 144);
                }
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0347  */
    /* JADX WARN: Code duplicated, block: B:63:0x034f  */
    /* JADX WARN: Code duplicated, block: B:68:0x036d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0387  */
    /* JADX WARN: Code duplicated, block: B:76:0x03ab  */
    /* JADX INFO: renamed from: e */
    private final Object m1996e(Object obj, Object obj2, Object obj3) {
        C6021p c6021p;
        boolean z6;
        C21696i c21696i;
        C21694h c21694h;
        C5975S c5975s;
        int i10;
        boolean zM6542f;
        Object objM6514H;
        C17794y ScrollableContentScreen = (C17794y) obj;
        C6021p c6021p2 = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ScrollableContentScreen, "$this$ScrollableContentScreen");
        if ((iIntValue & 17) == 16 && c6021p2.m6562y()) {
            c6021p2.m6517L();
        } else {
            C10545A c10545a = (C10545A) this.f3409Z;
            C21936L0 c21936l0 = new C21936L0(c10545a.f31301a);
            c6021p2.m6524S(-1323661893);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) this.f3410o0;
            boolean zM6545h = c6021p2.m6545h(interfaceC20904w) | c6021p2.m6542f(c10545a);
            Object objM6514H2 = c6021p2.m6514H();
            C5975S c5975s2 = C6013l.f19514a;
            if (zM6545h || objM6514H2 == c5975s2) {
                objM6514H2 = new C10598z(interfaceC20904w, c10545a, null);
                c6021p2.m6537c0(objM6514H2);
            }
            c6021p2.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p2, c21936l0);
            C10451i c10451i = C10444b.f30938q0;
            C10456n c10456n = C10456n.f30959Y;
            C11349D c11349d = c10545a.f31302b;
            if (c11349d != null) {
                c6021p2.m6524S(1916393289);
                InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                float f10 = AbstractC7313q.f23201f;
                InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qM11244d, f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, f10, 7);
                C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
                C10449g c10449g = C10444b.f30947z0;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, c10449g, c6021p2, 48);
                int i11 = c6021p2.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11237o);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p2.m6528W();
                if (c6021p2.f19563O) {
                    c6021p2.m6549l(c21696i2);
                } else {
                    c6021p2.m6543f0();
                }
                C21694h c21694h2 = C21698j.f68873f;
                C5997d.m6439Z(c21694h2, c6021p2, c17790wM19515a);
                C21694h c21694h3 = C21698j.f68872e;
                C5997d.m6439Z(c21694h3, c6021p2, interfaceC6008i0M6550m);
                C21694h c21694h4 = C21698j.f68874g;
                if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                    AbstractC0168G.m537z(i11, c6021p2, i11, c21694h4);
                }
                C21694h c21694h5 = C21698j.f68871d;
                C5997d.m6439Z(c21694h5, c6021p2, interfaceC10459qM10923d);
                C17794y c17794y = C17794y.f56777a;
                AbstractC9815U2.m10443b(c11349d, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23190g), c6021p2, 0);
                String strM8677e = AbstractC8142m4.m8677e(R.string.gizmo_rating_title, new Object[]{c11349d.f34319b}, c6021p2);
                C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(strM8677e, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12151g, c6021p2, 0, 0, 65534);
                Integer num = c10545a.f31303c;
                int iIntValue2 = num != null ? num.intValue() : 0;
                c6021p2.m6524S(1619425788);
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f3411p0;
                boolean zM6542f2 = c6021p2.m6542f(interfaceC3759g);
                Object objM6514H3 = c6021p2.m6514H();
                if (zM6542f2 || objM6514H3 == c5975s2) {
                    objM6514H3 = new C4339c(interfaceC3759g, 18);
                    c6021p2.m6537c0(objM6514H3);
                }
                c6021p2.m6553p(false);
                AbstractC11728d.m13034b(iIntValue2, (InterfaceC1436k) objM6514H3, c17794y.m19543a(AbstractC10844c.m11259s(c10456n, c10451i), c10449g), 0, c6021p2, 6);
                AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11252l(c10456n, f10));
                c6021p2.m6524S(1619437644);
                if (c11349d.f34329l) {
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p2, 0);
                    int i12 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11244d2);
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c21696i = c21696i2;
                        c6021p2.m6549l(c21696i);
                    } else {
                        c21696i = c21696i2;
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p2, c17781r0M19506b);
                    C5997d.m6439Z(c21694h3, c6021p2, interfaceC6008i0M6550m2);
                    if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i12))) {
                        c21694h = c21694h4;
                        AbstractC0168G.m537z(i12, c6021p2, i12, c21694h);
                    } else {
                        c21694h = c21694h4;
                    }
                    C5997d.m6439Z(c21694h5, c6021p2, interfaceC10459qM10923d2);
                    C21694h c21694h6 = c21694h;
                    C21696i c21696i3 = c21696i;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.gizmo_rating_add_note, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12155k, c6021p2, 0, 0, 65534);
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.lock_key_hole, c6021p2, 0), AbstractC8142m4.m8676d(R.string.gizmo_rating_add_note_icon_cd, c6021p2), AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), 0L, c6021p2, 0, 8);
                    c6021p2.m6553p(true);
                    String str = c10545a.f31305e;
                    if (str == null) {
                        str = "";
                    }
                    InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p2.m6524S(1619464726);
                    boolean zM6542f3 = c6021p2.m6542f(interfaceC3759g);
                    Object objM6514H4 = c6021p2.m6514H();
                    if (zM6542f3 || objM6514H4 == c5975s2) {
                        objM6514H4 = new C4339c(interfaceC3759g, 19);
                        c6021p2.m6537c0(objM6514H4);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4094m4.m4753a(str, (InterfaceC1436k) objM6514H4, interfaceC10459qM11244d3, false, false, null, null, AbstractC10576d.f31414c, null, null, null, null, null, false, null, null, null, false, 5, 3, null, null, null, c6021p2, 12583296, 905969664, 0, 7602040);
                    C10450h c10450h = C10444b.f30944w0;
                    InterfaceC10459q interfaceC10459qM11244d4 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p2.m6524S(1619484507);
                    boolean zM6542f4 = c6021p2.m6542f(interfaceC3759g) | c6021p2.m6542f(c10545a);
                    Object objM6514H5 = c6021p2.m6514H();
                    if (zM6542f4) {
                        c5975s = c5975s2;
                    } else {
                        c5975s = c5975s2;
                        if (objM6514H5 == c5975s) {
                        }
                        c6021p2.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM11244d4, false, null, (InterfaceC1426a) objM6514H5, 7);
                        C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h, c6021p2, 48);
                        i10 = c6021p2.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p2.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11209d);
                        c6021p2.m6528W();
                        if (c6021p2.f19563O) {
                            c6021p2.m6549l(c21696i3);
                        } else {
                            c6021p2.m6543f0();
                        }
                        C5997d.m6439Z(c21694h2, c6021p2, c17781r0M19506b2);
                        C5997d.m6439Z(c21694h3, c6021p2, interfaceC6008i0M6550m3);
                        if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                            AbstractC0168G.m537z(i10, c6021p2, i10, c21694h6);
                        }
                        C5997d.m6439Z(c21694h5, c6021p2, interfaceC10459qM10923d3);
                        c6021p2.m6524S(193738954);
                        zM6542f = c6021p2.m6542f(interfaceC3759g);
                        objM6514H = c6021p2.m6514H();
                        if (zM6542f || objM6514H == c5975s) {
                            objM6514H = new C4339c(interfaceC3759g, 20);
                            c6021p2.m6537c0(objM6514H);
                        }
                        c6021p2.m6553p(false);
                        AbstractC4150w0.m4775a(c10545a.f31306f, (InterfaceC1436k) objM6514H, null, false, null, null, c6021p2, 0, 60);
                        String str2 = c10545a.f31307g;
                        c6021p = c6021p2;
                        AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.gizmo_rating_add_note_email, new Object[]{str2 != null ? str2 : ""}, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12155k, c6021p, 0, 0, 65534);
                        z6 = true;
                        c6021p.m6553p(true);
                    }
                    objM6514H5 = new C8816z(interfaceC3759g, 11, c10545a);
                    c6021p2.m6537c0(objM6514H5);
                    c6021p2.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11209d2 = AbstractC10833a.m11209d(interfaceC10459qM11244d4, false, null, (InterfaceC1426a) objM6514H5, 7);
                    C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h, c6021p2, 48);
                    i10 = c6021p2.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p2.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11209d2);
                    c6021p2.m6528W();
                    if (c6021p2.f19563O) {
                        c6021p2.m6549l(c21696i3);
                    } else {
                        c6021p2.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p2, c17781r0M19506b3);
                    C5997d.m6439Z(c21694h3, c6021p2, interfaceC6008i0M6550m4);
                    if (c6021p2.f19563O) {
                        AbstractC0168G.m537z(i10, c6021p2, i10, c21694h6);
                    } else {
                        AbstractC0168G.m537z(i10, c6021p2, i10, c21694h6);
                    }
                    C5997d.m6439Z(c21694h5, c6021p2, interfaceC10459qM10923d4);
                    c6021p2.m6524S(193738954);
                    zM6542f = c6021p2.m6542f(interfaceC3759g);
                    objM6514H = c6021p2.m6514H();
                    if (zM6542f) {
                        objM6514H = new C4339c(interfaceC3759g, 20);
                        c6021p2.m6537c0(objM6514H);
                    } else {
                        objM6514H = new C4339c(interfaceC3759g, 20);
                        c6021p2.m6537c0(objM6514H);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4150w0.m4775a(c10545a.f31306f, (InterfaceC1436k) objM6514H, null, false, null, null, c6021p2, 0, 60);
                    String str3 = c10545a.f31307g;
                    c6021p = c6021p2;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.gizmo_rating_add_note_email, new Object[]{str3 != null ? str3 : ""}, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12155k, c6021p, 0, 0, 65534);
                    z6 = true;
                    c6021p.m6553p(true);
                } else {
                    c6021p = c6021p2;
                    z6 = true;
                }
                AbstractC3794B0.m4471F(c6021p, false, z6, false);
            } else {
                c6021p2.m6524S(1919729695);
                FillElement fillElement = AbstractC10844c.f32512c;
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i13 = c6021p2.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p2.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p2, fillElement);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i4 = C21698j.f68869b;
                c6021p2.m6528W();
                if (c6021p2.f19563O) {
                    c6021p2.m6549l(c21696i4);
                } else {
                    c6021p2.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p2, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m5);
                C21694h c21694h7 = C21698j.f68874g;
                if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p2, i13, c21694h7);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d5);
                AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(c10456n, c10451i), 0L, 0.0f, 0L, 0, c6021p2, 0, 30);
                c6021p2.m6553p(true);
                c6021p2.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m1998h(Object obj, Object obj2, Object obj3) {
        C13421l c13421l = (C13421l) this.f3409Z;
        C8361c0 workflow = (C8361c0) this.f3411p0;
        AbstractC16544l.m18094g(workflow, "workflow");
        C13421l c13421l2 = c13421l instanceof C13421l ? c13421l : null;
        if (c13421l2 == null) {
            c13421l2 = new C13421l(workflow, c13421l);
        }
        return ((AbstractC13422m) this.f3410o0).mo2034c(obj, obj2, c13421l2);
    }

    /* JADX INFO: renamed from: i */
    private final Object m1999i(Object obj, Object obj2, Object obj3) {
        EnumC14059W0 topBarState = (EnumC14059W0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(topBarState, "topBarState");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(topBarState) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int iOrdinal = topBarState.ordinal();
            if (iOrdinal == 0) {
                c6021p.m6524S(1046107007);
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(1046123432);
                Object objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
                Object objM530s = AbstractC0168G.m530s(1046127320, c6021p, false);
                if (objM530s == c5975s) {
                    objM530s = new C14103t0((InterfaceC5985X) this.f3411p0, 3);
                    c6021p.m6537c0(objM530s);
                }
                c6021p.m6553p(false);
                AbstractC8634g.m9290d((C14111x0) this.f3409Z, AbstractC10833a.m11208c(c10456n, interfaceC17406l, null, false, null, (InterfaceC1426a) objM530s, 28), c6021p, 0, 0);
                c6021p.m6553p(false);
            } else if (iOrdinal == 1) {
                c6021p.m6524S(1046131588);
                AbstractC14085k0.m15488c(0, (InterfaceC1436k) ((InterfaceC3759g) this.f3410o0), c6021p, null);
                c6021p.m6553p(false);
            } else if (iOrdinal != 2) {
                c6021p.m6524S(-1929607647);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1929704801);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m2000k(Object obj, Object obj2, Object obj3) {
        C14365u c14365u;
        InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(57528764);
            Integer num = (Integer) this.f3409Z;
            if (num != null && (c14365u = (C14365u) this.f3410o0) != null) {
                AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(num.intValue(), c6021p, 0), null, null, c14365u.f45062a, c6021p, 48, 4);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(C10456n.f30959Y, AbstractC7313q.f23199d));
            }
            c6021p.m6553p(false);
            AbstractC4124r4.m4768b((String) this.f3411p0, null, AbstractC7302f.m7772a(c6021p), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m2001l(Object obj, Object obj2, Object obj3) {
        C17794y BaseOnboardingScreen = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(BaseOnboardingScreen, "$this$BaseOnboardingScreen");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C16410p c16410p = (C16410p) this.f3409Z;
            String str = c16410p.f50934a;
            if (str == null) {
                str = "";
            }
            AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.onboarding_verify_email_subtitle, new Object[]{str}, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            C10456n c10456n = C10456n.f30959Y;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23202g));
            AbstractC3984T1.m4700s((InterfaceC1426a) this.f3410o0, null, false, null, null, null, null, AbstractC10842a.m11223a(0.0f, 0.0f, 3), null, AbstractC14503b.f45713a, c6021p, 817889280, 382);
            InterfaceC21925I1 interfaceC21925I1 = c16410p.f50936c;
            if (interfaceC21925I1 instanceof C21917G1) {
                c6021p.m6524S(2054649333);
                AbstractC3980S2.m4668b(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c), 0L, AbstractC7314r.f23208a, 0L, 0, c6021p, 0, 26);
                c6021p.m6553p(false);
            } else if (interfaceC21925I1 instanceof C21921H1) {
                c6021p.m6524S(2054853871);
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.onboarding_email_resent, c6021p), null, AbstractC10605g.f31475a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, 0, 0, 65530);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(2055078187);
                AbstractC3984T1.m4700s((InterfaceC1426a) this.f3411p0, null, false, null, null, null, null, AbstractC10842a.m11223a(0.0f, 0.0f, 3), null, AbstractC14503b.f45714b, c6021p, 817889280, 382);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m2002m(Object obj, Object obj2, Object obj3) {
        C17794y ModalBottomSheet = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(ModalBottomSheet) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.onboarding_birthday_title, c6021p), AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12151g, c6021p, 0, 0, 65020);
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3411p0;
            C5554x c5554x = (C5554x) interfaceC5985X.getValue();
            c6021p.m6524S(454167944);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C6194i(interfaceC5985X, 12);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8815y.m9537a(c5554x, (InterfaceC1436k) objM6514H, AbstractC10844c.m11245e(AbstractC10842a.m11235m(c10456n, 0.0f, AbstractC7313q.f23203h, 1), AbstractC14982a.f46641a), c6021p, 48);
            InterfaceC10459q interfaceC10459qM19543a = ModalBottomSheet.m19543a(AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23206k, 7), C10444b.f30947z0);
            c6021p.m6524S(454178897);
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f3409Z;
            boolean zM6542f = c6021p.m6542f(interfaceC1436k);
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f3410o0;
            boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1426a);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == c5975s) {
                objM6514H2 = new C8764H(interfaceC1436k, interfaceC1426a, interfaceC5985X, 2);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H2, interfaceC10459qM19543a, false, null, null, null, null, null, null, AbstractC14985d.f46649c, c6021p, 805306368, 508);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m2003n(Object obj, Object obj2, Object obj3) {
        InterfaceC1439n innerTextField = (InterfaceC1439n) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(innerTextField, "innerTextField");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6545h(innerTextField) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC12341a.m14267d((C19866Q) this.f3409Z, ((C5996c0) this.f3411p0).m6412g(), (InterfaceC1436k) ((InterfaceC3759g) this.f3410o0), innerTextField, null, c6021p, (iIntValue << 9) & 7168);
        }
        return C17296C.f55119a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v14 ??, still in use, count: 1, list:
          (r11v14 ?? I:java.lang.Object) from 0x008c: INVOKE (r6v1 ?? I:O0.p), (r11v14 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:141)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: o */
    private final java.lang.Object m2004o(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v14 ??, still in use, count: 1, list:
          (r11v14 ?? I:java.lang.Object) from 0x008c: INVOKE (r6v1 ?? I:O0.p), (r11v14 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:141)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: p */
    private final Object m2005p(Object obj, Object obj2, Object obj3) {
        C17794y BaseOnboardingScreen = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(BaseOnboardingScreen, "$this$BaseOnboardingScreen");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3411p0;
            String str = ((C17618i) interfaceC5985X.getValue()).f56375a;
            if (str == null) {
                str = "";
            }
            AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.onboarding_check_email_code_screen_subtitle, new Object[]{str}, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            C10456n c10456n = C10456n.f30959Y;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23202g));
            EnumC11216j enumC11216j = EnumC11216j.f33915V0;
            String str2 = ((C17618i) interfaceC5985X.getValue()).f56376b;
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) this.f3410o0;
            String strM8676d = AbstractC8142m4.m8676d(((Boolean) interfaceC5985X2.getValue()).booleanValue() ? R.string.onboarding_check_email_code_screen_textfield_label : R.string.onboarding_check_email_code_screen_textfield_placeholder, c6021p);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            c6021p.m6524S(-2028422608);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C6194i(interfaceC5985X2, 24);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11300b = AbstractC10862a.m11300b(interfaceC10459qM11244d, (InterfaceC1436k) objM6514H);
            c6021p.m6524S(-2028437327);
            VerifyEmailCodeViewModel verifyEmailCodeViewModel = (VerifyEmailCodeViewModel) this.f3409Z;
            boolean zM6542f = c6021p.m6542f(verifyEmailCodeViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == c5975s) {
                objM6514H2 = new C16482A(verifyEmailCodeViewModel, 10);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC8114j0.m8612c(str2, (InterfaceC1436k) objM6514H2, strM8676d, enumC11216j, interfaceC10459qM11300b, null, c6021p, 3072, 32);
            float f10 = AbstractC7313q.f23201f;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
            String strM8676d2 = AbstractC8142m4.m8676d(R.string.onboarding_check_email_code_screen_verify_code_button_text, c6021p);
            boolean z6 = ((C17618i) interfaceC5985X.getValue()).f56377c;
            boolean z10 = ((C17618i) interfaceC5985X.getValue()).f56378d instanceof C21917G1;
            c6021p.m6524S(-2028410595);
            boolean zM6542f2 = c6021p.m6542f(verifyEmailCodeViewModel);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == c5975s) {
                objM6514H3 = new C17252c(verifyEmailCodeViewModel, 0);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8114j0.m8611b(strM8676d2, z6, z10, (InterfaceC1426a) objM6514H3, c6021p, 0, 0);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.onboarding_check_email_code_screen_resend_code_description, c6021p), AbstractC10844c.m11244d(c10456n, 1.0f), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, null, c6021p, 48, 0, 130556);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
            c6021p.m6524S(-2028395763);
            boolean zM6542f3 = c6021p.m6542f(verifyEmailCodeViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == c5975s) {
                objM6514H4 = new C17252c(verifyEmailCodeViewModel, 1);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H4, AbstractC10844c.m11244d(c10456n, 1.0f), null, ((C17618i) interfaceC5985X.getValue()).f56379e instanceof C21917G1, false, AbstractC17251b.f55040a, c6021p, 196656, 20);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m2006q(Object obj, Object obj2, Object obj3) {
        C17786u BoxWithConstraints = (C17786u) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 14) == 0) {
            iIntValue |= c6021p.m6542f(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6525T(511388516);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) this.f3409Z;
            boolean zM6542f = c6021p.m6542f(interfaceC7537b);
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f3410o0;
            boolean zM6542f2 = zM6542f | c6021p.m6542f(asyncImagePainter);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f2 || objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6421H(new C15272c(asyncImagePainter, BoxWithConstraints, interfaceC7537b, 14));
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8473F.m9106a(asyncImagePainter, (String) this.f3411p0, (InterfaceC10459q) ((InterfaceC5982V0) objM6514H).getValue(), null, C21089j.f67013p0, 0.0f, null, c6021p, 0, 104);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m2007r(Object obj, Object obj2, Object obj3) {
        String string;
        C14392f Column = (C14392f) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Column, "$this$Column");
        c6021p.m6524S(1466351419);
        C18414b c18414b = (C18414b) this.f3409Z;
        boolean z6 = c18414b.f58750a;
        C18417e c18417e = (C18417e) this.f3410o0;
        if (z6) {
            if (c18414b.f58751b <= 1) {
                c6021p.m6524S(-1787561939);
                C18417e.m19871d((C18417e) this.f3410o0, R.drawable.ic_chatgpt, c18414b.f58752c, ConversationAction.class, c6021p, 4096);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1787419959);
                boolean z10 = Float.compare(C7542g.m7877b(c18414b.f58755f), C7542g.m7877b(C18417e.f58769l.f58755f)) >= 0;
                Context context = (Context) this.f3411p0;
                if (z10) {
                    string = context.getString(R.string.widget_message);
                } else {
                    if (z10) {
                        throw new C0644w();
                    }
                    string = context.getString(R.string.widget_message_short);
                }
                AbstractC16544l.m18091d(string);
                C18417e.m19872e(c18417e, c18414b.f58754e, string, c6021p, 512);
                c6021p.m6553p(false);
            }
        }
        c6021p.m6553p(false);
        float f10 = 0;
        AbstractC8739x2.m9474c(new C14400n(AbstractC8497J.m9162d(f10), AbstractC8497J.m9162d(z6 ? C18417e.f58767j : 0), AbstractC8497J.m9162d(f10), AbstractC8497J.m9162d(f10)).mo10952b(new C14404r(C17146e.f54816a)), 1, 0, AbstractC8411c.m8969c(-1427361279, c6021p, new C14127l(c18414b, 10, c18417e)), c6021p, 3072, 4);
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m2008s(Object obj, Object obj2, Object obj3) {
        C17794y ScrollableContentScreen = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ScrollableContentScreen, "$this$ScrollableContentScreen");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3411p0;
            C11349D c11349d = ((C18686o) interfaceC5985X.getValue()).f59489c;
            InterfaceC11374b0 interfaceC11374b0 = ((C18686o) interfaceC5985X.getValue()).f59490d;
            C4688o c4688o = ((C18686o) interfaceC5985X.getValue()).f59488b;
            C20584h c20584h = ((C18686o) interfaceC5985X.getValue()).f59491e;
            C18687p c18687p = ((C18686o) interfaceC5985X.getValue()).f59494h;
            boolean z6 = ((C18686o) interfaceC5985X.getValue()).f59495i;
            c6021p.m6524S(758760409);
            C8870f c8870f = (C8870f) this.f3410o0;
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6545h || objM6514H == c5975s) {
                objM6514H = new C6703N(c8870f, 4);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(758763546);
            boolean zM6545h2 = c6021p.m6545h(c8870f);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h2 || objM6514H2 == c5975s) {
                objM6514H2 = new C6703N(c8870f, 5);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(758770203);
            ConversationDetailsViewModel conversationDetailsViewModel = (ConversationDetailsViewModel) this.f3409Z;
            boolean zM6542f = c6021p.m6542f(conversationDetailsViewModel);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f || objM6514H3 == c5975s) {
                objM6514H3 = new C18678g(conversationDetailsViewModel, 1);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(758766658);
            boolean zM6542f2 = c6021p.m6542f(conversationDetailsViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == c5975s) {
                objM6514H4 = new C18678g(conversationDetailsViewModel, 2);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(758773756);
            boolean zM6542f3 = c6021p.m6542f(conversationDetailsViewModel);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f3 || objM6514H5 == c5975s) {
                objM6514H5 = new C18678g(conversationDetailsViewModel, 3);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            AbstractC4502m.m5239b(c11349d, interfaceC11374b0, c4688o, c20584h, c18687p, z6, interfaceC1436k, interfaceC1436k2, interfaceC1426a, interfaceC1426a2, (InterfaceC1426a) objM6514H5, c6021p, 0, 0);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX INFO: renamed from: t */
    private final Object m2009t(Object obj, Object obj2, Object obj3) {
        boolean z6;
        int iIntValue = ((Number) obj).intValue();
        C6021p c6021p = (C6021p) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= c6021p.m6538d(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i10 = iIntValue - 1;
            C18739v c18739v = (C18739v) this.f3409Z;
            if (c18739v != null) {
                z6 = c18739v.f59610b.contains(Integer.valueOf(i10));
            }
            EnumC18738u enumC18738u = z6 ? EnumC18738u.SelectedRowOrColumn : EnumC18738u.Normal;
            if (iIntValue == 0) {
                c6021p.m6524S(-1551768067);
                AbstractC4941g.m5553L(Separators.POUND, enumC18738u, z6, null, c6021p, 6, 8);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1551676121);
                String str = ((C18729l) ((C18742y) this.f3410o0).f59616b.get(i10)).f59571a;
                c6021p.m6524S(-604236548);
                boolean zM6542f = c6021p.m6542f(c18739v);
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f3411p0;
                boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1436k) | c6021p.m6538d(i10);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f2 || objM6514H == C6013l.f19514a) {
                    objM6514H = new C18734q(c18739v, interfaceC1436k, i10, 0);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC4941g.m5552K(str, enumC18738u, z6, (InterfaceC1426a) objM6514H, c6021p, 0);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z6;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i10 = 5;
        C10456n c10456n = C10456n.f30959Y;
        int i11 = 6;
        C5975S c5975s = C6013l.f19514a;
        C17296C c17296c = C17296C.f55119a;
        Object obj10 = this.f3410o0;
        Object obj11 = this.f3411p0;
        int i12 = 0;
        Object obj12 = this.f3409Z;
        switch (this.f3408Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g((InterfaceC17763i0) obj, "it");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i13 = c6021p.f19564P;
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
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                        AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    C0893B c0893b = (C0893B) obj12;
                    List<C1166t> list = c0893b.f2620c;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    for (C1166t c1166t : list) {
                        arrayList.add(new C16218g(c1166t.f3091a, c1166t.f3094d, c1166t.f3095e, c1166t.f3102l));
                        obj10 = obj10;
                        c10456n = c10456n;
                    }
                    Object obj13 = obj10;
                    C10456n c10456n2 = c10456n;
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj11;
                    C1166t c1166t2 = (C1166t) interfaceC5985X.getValue();
                    Double dValueOf = c1166t2 != null ? Double.valueOf(c1166t2.f3094d) : null;
                    C1166t c1166t3 = (C1166t) interfaceC5985X.getValue();
                    Double dValueOf2 = c1166t3 != null ? Double.valueOf(c1166t3.f3095e) : null;
                    FillElement fillElement = AbstractC10844c.f32512c;
                    float f10 = AbstractC1283y.f3415a;
                    c6021p.m6524S(-1544502236);
                    boolean zM6542f = c6021p.m6542f(c0893b);
                    Object objM6514H = c6021p.m6514H();
                    Object obj14 = objM6514H;
                    if (zM6542f || objM6514H == c5975s) {
                        C1279u c1279u = new C1279u(c0893b, interfaceC5985X, 1);
                        c6021p.m6537c0(c1279u);
                        obj14 = c1279u;
                    }
                    c6021p.m6553p(false);
                    AbstractC8543Q3.m9203a(arrayList, fillElement, dValueOf, dValueOf2, 0.0d, false, f10, (InterfaceC1436k) obj14, c6021p, 1572912, 48);
                    c6021p.m6524S(-1544496629);
                    C8870f c8870f = (C8870f) obj13;
                    boolean zM6545h = c6021p.m6545h(c8870f);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6545h || objM6514H2 == c5975s) {
                        z6 = false;
                        C1280v c1280v = new C1280v(c8870f, false ? 1 : 0);
                        c6021p.m6537c0(c1280v);
                        obj4 = c1280v;
                    } else {
                        z6 = false;
                        obj4 = objM6514H2;
                    }
                    c6021p.m6553p(z6);
                    InterfaceC10459q interfaceC10459qM19490l = AbstractC17758g.m19490l(AbstractC10842a.m11233k(c10456n2, AbstractC7313q.f23199d));
                    C8410b c8410b = AbstractC1258D.f3333a;
                    AbstractC4145v1.m4773b((InterfaceC1426a) obj4, interfaceC10459qM19490l, null, 0L, 0L, null, null, c6021p, 12582912);
                    Object objM530s = AbstractC0168G.m530s(-1237961509, c6021p, true);
                    Object obj15 = objM530s;
                    if (objM530s == c5975s) {
                        C0339D c0339d = new C0339D(interfaceC5985X, 5);
                        c6021p.m6537c0(c0339d);
                        obj15 = c0339d;
                    }
                    c6021p.m6553p(false);
                    AbstractC1274p.m1987b((InterfaceC1426a) obj15, (C1166t) interfaceC5985X.getValue(), null, c6021p, 6);
                }
                return c17296c;
            case 1:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(-918085202);
                    C3880A3 c3880a3 = (C3880A3) obj10;
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj11;
                    boolean zM6542f2 = c6021p2.m6542f(c3880a3) | c6021p2.m6542f(interfaceC1426a);
                    Object objM6514H3 = c6021p2.m6514H();
                    Object obj16 = objM6514H3;
                    if (zM6542f2 || objM6514H3 == c5975s) {
                        C2517i1 c2517i1 = new C2517i1(c3880a3, interfaceC1426a, null);
                        c6021p2.m6537c0(c2517i1);
                        obj16 = c2517i1;
                    }
                    c6021p2.m6553p(false);
                    AbstractC8018W4.m8346f((C2529m1) obj12, (InterfaceC1436k) obj16, c6021p2, 0);
                }
                return c17296c;
            case 2:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p3, 0);
                    int i14 = c6021p3.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p3.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p3.m6528W();
                    if (c6021p3.f19563O) {
                        c6021p3.m6549l(c21696i2);
                    } else {
                        c6021p3.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p3, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p3, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p3.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p3, i14, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p3, interfaceC10459qM10923d2);
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.settings_data_controls, c6021p3), null, 0L, c6021p3, 0, 6);
                    boolean z10 = ((C4340d) obj12).f14128a;
                    C3590f c3590fM9795b = AbstractC9225V3.m9795b(R.string.settings_data_training_description, null, c6021p3, 2);
                    c6021p3.m6524S(-572551290);
                    InterfaceC3759g interfaceC3759g = (InterfaceC3759g) obj10;
                    boolean zM6542f3 = c6021p3.m6542f(interfaceC3759g);
                    Object objM6514H4 = c6021p3.m6514H();
                    Object obj17 = objM6514H4;
                    if (zM6542f3 || objM6514H4 == c5975s) {
                        C4339c c4339c = new C4339c(interfaceC3759g, i12);
                        c6021p3.m6537c0(c4339c);
                        obj17 = c4339c;
                    }
                    c6021p3.m6553p(false);
                    AbstractC9727F3.m10316a(z10, (InterfaceC1436k) obj17, AbstractC4342f.f14134b, null, c3590fM9795b, AbstractC4342f.f14135c, null, false, c6021p3, 196992, RCHTTPStatusCodes.SUCCESS);
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.settings_app, c6021p3), null, 0L, c6021p3, 0, 6);
                    AbstractC9264c0.m9838a(EnumC7465v.f23719Y, (Context) obj11, null, null, c6021p3, 6);
                    c6021p3.m6553p(true);
                }
                return c17296c;
            case 3:
                C17794y DropdownMenuWithTapOffset = (C17794y) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(DropdownMenuWithTapOffset, "$this$DropdownMenuWithTapOffset");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    c6021p4.m6524S(406795373);
                    AbstractC18176m abstractC18176m = (AbstractC18176m) obj12;
                    if (abstractC18176m.mo19720c() != null) {
                        C8410b c8410b2 = AbstractC5006c.f16333a;
                        c6021p4.m6524S(406800465);
                        InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj10;
                        boolean zM6542f4 = c6021p4.m6542f(interfaceC1426a2);
                        Object objM6514H5 = c6021p4.m6514H();
                        if (zM6542f4 || objM6514H5 == c5975s) {
                            obj6 = objM6514H5;
                            C2535p c2535p = new C2535p(10, interfaceC1426a2);
                            c6021p4.m6537c0(c2535p);
                            obj6 = c2535p;
                        }
                        c6021p4.m6553p(false);
                        AbstractC4101o.m4761b(c8410b2, (InterfaceC1426a) obj6, null, AbstractC5006c.f16334b, null, false, null, null, null, c6021p4, 3078, 500);
                    }
                    c6021p4.m6553p(false);
                    if (abstractC18176m instanceof C18174k) {
                        C8410b c8410b3 = AbstractC5006c.f16335c;
                        c6021p4.m6524S(406811132);
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj11;
                        boolean zM6542f5 = c6021p4.m6542f(interfaceC1436k) | c6021p4.m6542f(abstractC18176m);
                        Object objM6514H6 = c6021p4.m6514H();
                        if (zM6542f5 || objM6514H6 == c5975s) {
                            obj5 = objM6514H6;
                            C5013j c5013j = new C5013j(interfaceC1436k, abstractC18176m, 1);
                            c6021p4.m6537c0(c5013j);
                            obj5 = c5013j;
                        }
                        c6021p4.m6553p(false);
                        AbstractC4101o.m4761b(c8410b3, (InterfaceC1426a) obj5, null, AbstractC5006c.f16336d, null, false, null, null, null, c6021p4, 3078, 500);
                        C8410b c8410b4 = AbstractC5006c.f16337e;
                        c6021p4.m6524S(406821214);
                        boolean zM6542f6 = c6021p4.m6542f(interfaceC1436k) | c6021p4.m6542f(abstractC18176m);
                        Object objM6514H7 = c6021p4.m6514H();
                        Object obj18 = objM6514H7;
                        if (zM6542f6 || objM6514H7 == c5975s) {
                            C5013j c5013j2 = new C5013j(interfaceC1436k, abstractC18176m, 2);
                            c6021p4.m6537c0(c5013j2);
                            obj18 = c5013j2;
                        }
                        c6021p4.m6553p(false);
                        AbstractC4101o.m4761b(c8410b4, (InterfaceC1426a) obj18, null, AbstractC5006c.f16338f, null, false, null, null, null, c6021p4, 3078, 500);
                    }
                }
                return c17296c;
            case 4:
                InterfaceC17763i0 it = (InterfaceC17763i0) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6021p5.m6542f(it) ? 4 : 2;
                }
                if ((iIntValue5 & 19) == 18 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    ((C8410b) obj12).mo2052j(it, (InterfaceC2062k) obj10, (InterfaceC3759g) obj11, c6021p5, Integer.valueOf(iIntValue5 & 14));
                }
                return c17296c;
            case 5:
                C17794y FormDialog = (C17794y) obj;
                C6021p c6021p6 = (C6021p) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(FormDialog, "$this$FormDialog");
                if ((iIntValue6 & 17) == 16 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    String strM8676d = AbstractC8142m4.m8676d(R.string.message_feedback_title, c6021p6);
                    C3582M c3582m = ((C3941K4) c6021p6.m6548k(AbstractC3947L4.f12183a)).f12153i;
                    float f11 = AbstractC4017a.f12601a;
                    AbstractC4124r4.m4768b(strM8676d, null, AbstractC3959O0.m4662d(AbstractC5253e.f17196b, c6021p6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p6, 0, 0, 65530);
                    c6021p6.m6524S(1292658199);
                    Object objM6514H8 = c6021p6.m6514H();
                    Object obj19 = objM6514H8;
                    if (objM6514H8 == c5975s) {
                        C13522n c13522n = new C13522n();
                        c6021p6.m6537c0(c13522n);
                        obj19 = c13522n;
                    }
                    C13522n c13522n2 = (C13522n) obj19;
                    Object objM530s2 = AbstractC0168G.m530s(1292660095, c6021p6, false);
                    Object obj20 = objM530s2;
                    if (objM530s2 == c5975s) {
                        C5337d c5337d = new C5337d(c13522n2, null);
                        c6021p6.m6537c0(c5337d);
                        obj20 = c5337d;
                    }
                    c6021p6.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) obj20, c6021p6, c17296c);
                    InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) obj11;
                    String str = (String) interfaceC5985X2.getValue();
                    InterfaceC10459q interfaceC10459qM11299a = AbstractC10862a.m11299a(AbstractC10844c.m11244d(c10456n, 1.0f), c13522n2);
                    C2385o c2385o = C6051I.f19710a;
                    c6021p6.m6524S(1292664111);
                    boolean zM6542f7 = c6021p6.m6542f(interfaceC5985X2);
                    Object objM6514H9 = c6021p6.m6514H();
                    Object obj21 = objM6514H9;
                    if (zM6542f7 || objM6514H9 == c5975s) {
                        C0248f0 c0248f0 = new C0248f0(interfaceC5985X2, 27);
                        c6021p6.m6537c0(c0248f0);
                        obj21 = c0248f0;
                    }
                    c6021p6.m6553p(false);
                    AbstractC9781O3.m10394b(str, (InterfaceC1436k) obj21, interfaceC10459qM11299a, false, false, null, null, null, false, 0, 0, c2385o, null, null, null, AbstractC8411c.m8969c(1329130781, c6021p6, new C1260b(interfaceC5985X2, 1)), c6021p6, 100663296, 196656, 30456);
                    C20007b c20007b = EnumC21875k.f69360q0;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj22 : c20007b) {
                        if (((EnumC21875k) obj22).f69361Y) {
                            arrayList2.add(obj22);
                        }
                    }
                    c6021p6.m6524S(1292698834);
                    C9566r c9566r = (C9566r) obj12;
                    boolean zM6542f8 = c6021p6.m6542f(c9566r);
                    Object objM6514H10 = c6021p6.m6514H();
                    Object obj23 = objM6514H10;
                    if (zM6542f8 || objM6514H10 == c5975s) {
                        C0292u c0292u = new C0292u(1, c9566r, C9566r.class, "contains", "contains(Ljava/lang/Object;)Z", 0, 11);
                        c6021p6.m6537c0(c0292u);
                        obj23 = c0292u;
                    }
                    c6021p6.m6553p(false);
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) ((InterfaceC3759g) obj23);
                    c6021p6.m6524S(1292700368);
                    C9566r c9566r2 = (C9566r) obj12;
                    boolean zM6542f9 = c6021p6.m6542f(c9566r2);
                    Object objM6514H11 = c6021p6.m6514H();
                    Object obj24 = objM6514H11;
                    if (zM6542f9 || objM6514H11 == c5975s) {
                        C0292u c0292u2 = new C0292u(1, c9566r2, AbstractC8757A.class, "toggle", "toggle(Ljava/util/List;Ljava/lang/Object;)V", 1, 12);
                        c6021p6.m6537c0(c0292u2);
                        obj24 = c0292u2;
                    }
                    c6021p6.m6553p(false);
                    AbstractC8757A.m9525f(arrayList2, interfaceC1436k2, (InterfaceC1436k) ((InterfaceC3759g) obj24), AbstractC10844c.m11244d(c10456n, 1.0f), c6021p6, 24576);
                    AbstractC17758g.m19482b(c6021p6, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23198c));
                    c6021p6.m6524S(1292706156);
                    InterfaceC1439n interfaceC1439n = (InterfaceC1439n) obj10;
                    C9566r c9566r3 = (C9566r) obj12;
                    boolean zM6542f10 = c6021p6.m6542f(interfaceC1439n) | c6021p6.m6542f(interfaceC5985X2) | c6021p6.m6542f(c9566r3);
                    Object objM6514H12 = c6021p6.m6514H();
                    Object obj25 = objM6514H12;
                    if (zM6542f10 || objM6514H12 == c5975s) {
                        C0155B1 c0155b1 = new C0155B1(interfaceC1439n, c9566r3, interfaceC5985X2, 25);
                        c6021p6.m6537c0(c0155b1);
                        obj25 = c0155b1;
                    }
                    c6021p6.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) obj25, null, false, null, null, null, null, null, null, AbstractC5336c.f17553b, c6021p6, 805306368, 510);
                }
                return c17296c;
            case 6:
                InterfaceC17763i0 paddings2 = (InterfaceC17763i0) obj;
                C6021p c6021p7 = (C6021p) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings2, "paddings");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6021p7.m6542f(paddings2) ? 4 : 2;
                }
                if ((iIntValue7 & 19) == 18 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j2 = AbstractC10842a.m11232j(c10456n, paddings2);
                    C6221y c6221y = (C6221y) obj12;
                    InterfaceC3759g interfaceC3759g2 = (InterfaceC3759g) obj11;
                    if (!c6221y.f20249a) {
                        c6021p7.m6524S(-1882124783);
                        c6021p7.m6524S(-337805830);
                        boolean zM6542f11 = c6021p7.m6542f(interfaceC3759g2);
                        Object objM6514H13 = c6021p7.m6514H();
                        if (zM6542f11 || objM6514H13 == c5975s) {
                            obj7 = objM6514H13;
                            C6209m c6209m = new C6209m(interfaceC3759g2, 4);
                            c6021p7.m6537c0(c6209m);
                            obj7 = c6209m;
                        }
                        c6021p7.m6553p(false);
                        AbstractC8532O4.m9195b((InterfaceC1426a) obj7, interfaceC10459qM11232j2, AbstractC8142m4.m8676d(R.string.custom_instructions_continue, c6021p7), c6221y.f20250b, c6021p7, 0, 0);
                        c6021p7.m6553p(false);
                    } else if (c6221y.f20251c && c6221y.f20252d == null) {
                        c6021p7.m6524S(-1881702470);
                        AbstractC3980S2.m4670d(0.0f, 0, 0, 0L, 0L, c6021p7, interfaceC10459qM11232j2);
                        c6021p7.m6553p(false);
                    } else {
                        c6021p7.m6524S(-1881562226);
                        c6021p7.m6524S(-337784885);
                        C8870f c8870f2 = (C8870f) obj10;
                        boolean zM6545h2 = c6021p7.m6545h(c8870f2);
                        Object objM6514H14 = c6021p7.m6514H();
                        Object obj26 = objM6514H14;
                        if (zM6545h2 || objM6514H14 == c5975s) {
                            C1280v c1280v2 = new C1280v(c8870f2, 9);
                            c6021p7.m6537c0(c1280v2);
                            obj26 = c1280v2;
                        }
                        InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) obj26;
                        c6021p7.m6553p(false);
                        c6021p7.m6524S(-337774932);
                        boolean zM6545h3 = c6021p7.m6545h(c8870f2);
                        Object objM6514H15 = c6021p7.m6514H();
                        Object obj27 = objM6514H15;
                        if (zM6545h3 || objM6514H15 == c5975s) {
                            C1280v c1280v3 = new C1280v(c8870f2, 10);
                            c6021p7.m6537c0(c1280v3);
                            obj27 = c1280v3;
                        }
                        InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) obj27;
                        c6021p7.m6553p(false);
                        c6021p7.m6524S(-337765158);
                        boolean zM6545h4 = c6021p7.m6545h(c8870f2);
                        Object objM6514H16 = c6021p7.m6514H();
                        Object obj28 = objM6514H16;
                        if (zM6545h4 || objM6514H16 == c5975s) {
                            C1280v c1280v4 = new C1280v(c8870f2, 11);
                            c6021p7.m6537c0(c1280v4);
                            obj28 = c1280v4;
                        }
                        InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) obj28;
                        boolean zM13832w = AbstractC12107L1.m13832w(c6021p7, false, -337757953, interfaceC3759g2);
                        Object objM6514H17 = c6021p7.m6514H();
                        Object obj29 = objM6514H17;
                        if (zM13832w || objM6514H17 == c5975s) {
                            C4339c c4339c2 = new C4339c(interfaceC3759g2, 4);
                            c6021p7.m6537c0(c4339c2);
                            obj29 = c4339c2;
                        }
                        InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) obj29;
                        boolean zM13832w2 = AbstractC12107L1.m13832w(c6021p7, false, -337752675, interfaceC3759g2);
                        Object objM6514H18 = c6021p7.m6514H();
                        Object obj30 = objM6514H18;
                        if (zM13832w2 || objM6514H18 == c5975s) {
                            C4339c c4339c3 = new C4339c(interfaceC3759g2, i10);
                            c6021p7.m6537c0(c4339c3);
                            obj30 = c4339c3;
                        }
                        InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) obj30;
                        boolean zM13832w3 = AbstractC12107L1.m13832w(c6021p7, false, -337747490, interfaceC3759g2);
                        Object objM6514H19 = c6021p7.m6514H();
                        Object obj31 = objM6514H19;
                        if (zM13832w3 || objM6514H19 == c5975s) {
                            C4339c c4339c4 = new C4339c(interfaceC3759g2, i11);
                            c6021p7.m6537c0(c4339c4);
                            obj31 = c4339c4;
                        }
                        c6021p7.m6553p(false);
                        AbstractC8757A.m9520a(c6221y.f20252d, c6221y.f20253e, interfaceC1426a3, interfaceC1426a4, interfaceC1426a5, interfaceC1436k3, interfaceC1436k4, (InterfaceC1436k) obj31, interfaceC10459qM11232j2, c6021p7, 0);
                        c6021p7.m6553p(false);
                    }
                }
                return c17296c;
            case 7:
                C10845a item = (C10845a) obj;
                C6021p c6021p8 = (C6021p) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue8 & 17) == 16 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    c6021p8.m6524S(1016487288);
                    Object objM6514H20 = c6021p8.m6514H();
                    if (objM6514H20 == c5975s) {
                        objM6514H20 = C5997d.m6429P(0);
                        c6021p8.m6537c0(objM6514H20);
                    }
                    C5996c0 c5996c0 = (C5996c0) objM6514H20;
                    c6021p8.m6553p(false);
                    C8410b c8410b5 = AbstractC7451h.f23620j;
                    c6021p8.m6524S(1016494771);
                    InterfaceC10459q interfaceC10459qM11208c = C10456n.f30959Y;
                    if (!((C7439X) obj12).f23544e) {
                        c6021p8.m6524S(185915069);
                        Object objM6514H21 = c6021p8.m6514H();
                        if (objM6514H21 == c5975s) {
                            objM6514H21 = AbstractC0168G.m536y(c6021p8);
                        }
                        InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H21;
                        c6021p8.m6553p(false);
                        c6021p8.m6524S(185917627);
                        C8870f c8870f3 = (C8870f) obj10;
                        boolean zM6545h5 = c6021p8.m6545h(c8870f3);
                        Object objM6514H22 = c6021p8.m6514H();
                        if (zM6545h5 || objM6514H22 == c5975s) {
                            objM6514H22 = new C4714D(c8870f3, 23, c5996c0);
                            c6021p8.m6537c0(objM6514H22);
                        }
                        c6021p8.m6553p(false);
                        interfaceC10459qM11208c = AbstractC10833a.m11208c(interfaceC10459qM11208c, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H22, 28);
                    }
                    c6021p8.m6553p(false);
                    AbstractC3914G1.m4611a(c8410b5, interfaceC10459qM11208c, null, AbstractC8411c.m8969c(-228301118, c6021p8, new C3046j((String) obj11, 3)), AbstractC7451h.f23621k, null, null, 0.0f, 0.0f, c6021p8, 27654, 484);
                }
                return c17296c;
            case 8:
                InterfaceC17763i0 paddings3 = (InterfaceC17763i0) obj;
                C6021p c6021p9 = (C6021p) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings3, "paddings");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c6021p9.m6542f(paddings3) ? 4 : 2;
                }
                if ((iIntValue9 & 19) == 18 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(c10456n, paddings3).mo428M(AbstractC10844c.f32512c);
                    c6021p9.m6524S(-132685631);
                    C7439X c7439x = (C7439X) obj12;
                    InterfaceC10459q interfaceC10459q = (InterfaceC10459q) obj10;
                    InterfaceC3759g interfaceC3759g3 = (InterfaceC3759g) obj11;
                    boolean zM6545h6 = c6021p9.m6545h(c7439x) | c6021p9.m6542f(interfaceC10459q) | c6021p9.m6542f(interfaceC3759g3);
                    Object objM6514H23 = c6021p9.m6514H();
                    if (zM6545h6 || objM6514H23 == c5975s) {
                        objM6514H23 = new C7448e(c7439x, interfaceC10459q, interfaceC3759g3, i12);
                        c6021p9.m6537c0(objM6514H23);
                    }
                    c6021p9.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qMo428M, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H23, c6021p9, 0, 254);
                }
                return c17296c;
            case 9:
                InterfaceC17763i0 paddings4 = (InterfaceC17763i0) obj;
                C6021p c6021p10 = (C6021p) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings4, "paddings");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c6021p10.m6542f(paddings4) ? 4 : 2;
                }
                if ((iIntValue10 & 19) == 18 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qMo428M2 = AbstractC10842a.m11232j(c10456n, paddings4).mo428M(AbstractC10844c.f32512c);
                    c6021p10.m6524S(2068862758);
                    C7439X c7439x2 = (C7439X) obj12;
                    InterfaceC3759g interfaceC3759g4 = (InterfaceC3759g) obj10;
                    Context context = (Context) obj11;
                    boolean zM6545h7 = c6021p10.m6545h(c7439x2) | c6021p10.m6542f(interfaceC3759g4) | c6021p10.m6545h(context);
                    Object objM6514H24 = c6021p10.m6514H();
                    Object obj32 = objM6514H24;
                    if (zM6545h7 || objM6514H24 == c5975s) {
                        C7448e c7448e = new C7448e(c7439x2, interfaceC3759g4, context);
                        c6021p10.m6537c0(c7448e);
                        obj32 = c7448e;
                    }
                    c6021p10.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qMo428M2, null, null, false, null, null, null, false, (InterfaceC1436k) obj32, c6021p10, 0, 254);
                }
                return c17296c;
            case 10:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p11 = (C6021p) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue11 & 17) == 16 && c6021p11.m6562y()) {
                    c6021p11.m6517L();
                } else {
                    C0515d c0515d = ((C7439X) obj12).f23541b;
                    c6021p11.m6524S(-1437943526);
                    SwitchAccountViewModel switchAccountViewModel = (SwitchAccountViewModel) obj10;
                    Context context2 = (Context) obj11;
                    boolean zM6545h8 = c6021p11.m6545h(switchAccountViewModel) | c6021p11.m6545h(context2);
                    Object objM6514H25 = c6021p11.m6514H();
                    if (zM6545h8 || objM6514H25 == c5975s) {
                        objM6514H25 = new C5034f(switchAccountViewModel, 27, context2);
                        c6021p11.m6537c0(objM6514H25);
                    }
                    c6021p11.m6553p(false);
                    AbstractC8152n6.m8697a(c0515d, (InterfaceC1436k) objM6514H25, AbstractC10842a.m11233k(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f), null, false, true, false, c6021p11, 196608, 88);
                }
                return c17296c;
            case 11:
                C10845a item3 = (C10845a) obj;
                C6021p c6021p12 = (C6021p) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item3, "$this$item");
                if ((iIntValue12 & 17) == 16 && c6021p12.m6562y()) {
                    c6021p12.m6517L();
                } else {
                    C8410b c8410b6 = AbstractC7459p.f23699u;
                    c6021p12.m6524S(1903978847);
                    SettingsViewModel settingsViewModel = (SettingsViewModel) obj12;
                    Context context3 = (Context) obj10;
                    boolean zM6542f12 = c6021p12.m6542f(settingsViewModel) | c6021p12.m6545h(context3);
                    Object objM6514H26 = c6021p12.m6514H();
                    InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) obj11;
                    Object obj33 = objM6514H26;
                    if (zM6542f12 || objM6514H26 == c5975s) {
                        C12507a c12507a = new C12507a(settingsViewModel, context3, interfaceC5985X3);
                        c6021p12.m6537c0(c12507a);
                        obj33 = c12507a;
                    }
                    c6021p12.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) obj33, 7);
                    C8410b c8410b7 = AbstractC7459p.f23700v;
                    C8410b c8410bM8969c = AbstractC8411c.m8969c(665521608, c6021p12, new C2728f(interfaceC5985X3, i10));
                    float f12 = AbstractC3896D1.f11851a;
                    C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                    AbstractC3914G1.m4611a(c8410b6, interfaceC10459qM11209d, null, null, c8410b7, c8410bM8969c, AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p12.m6548k(c5984w0)).f12241w, ((C3949M0) c6021p12.m6548k(c5984w0)).f12241w, 0L, c6021p12, 505), 0.0f, 0.0f, c6021p12, 221190, 396);
                }
                return c17296c;
            case 12:
                return m1993a(obj, obj2, obj3);
            case 13:
                return m1994b(obj, obj2, obj3);
            case 14:
                return m1995c(obj, obj2, obj3);
            case 15:
                return m1996e(obj, obj2, obj3);
            case 16:
                return m1997f(obj, obj2, obj3);
            case 17:
                return m1998h(obj, obj2, obj3);
            case 18:
                return m1999i(obj, obj2, obj3);
            case 19:
                return m2000k(obj, obj2, obj3);
            case 20:
                return m2001l(obj, obj2, obj3);
            case 21:
                return m2002m(obj, obj2, obj3);
            case 22:
                return m2003n(obj, obj2, obj3);
            case 23:
                return m2004o(obj, obj2, obj3);
            case 24:
                return m2005p(obj, obj2, obj3);
            case 25:
                return m2006q(obj, obj2, obj3);
            case 26:
                return m2007r(obj, obj2, obj3);
            case 27:
                return m2008s(obj, obj2, obj3);
            case 28:
                return m2009t(obj, obj2, obj3);
            default:
                C17794y DropdownMenu = (C17794y) obj;
                C6021p c6021p13 = (C6021p) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(DropdownMenu, "$this$DropdownMenu");
                if ((iIntValue13 & 17) == 16 && c6021p13.m6562y()) {
                    c6021p13.m6517L();
                } else {
                    c6021p13.m6524S(-826347944);
                    C19906K c19906k = (C19906K) obj12;
                    C18173j c18173j = c19906k.f63092q;
                    InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) obj11;
                    InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) obj10;
                    if ((c18173j != null ? c18173j.f57972e : null) != null) {
                        C8410b c8410b8 = AbstractC19918c.f63163c;
                        c6021p13.m6524S(-826342043);
                        boolean zM6542f13 = c6021p13.m6542f(interfaceC1426a6) | c6021p13.m6542f(interfaceC1436k5);
                        Object objM6514H27 = c6021p13.m6514H();
                        if (zM6542f13 || objM6514H27 == c5975s) {
                            obj9 = objM6514H27;
                            C8804n c8804n = new C8804n(interfaceC1426a6, interfaceC1436k5, 5);
                            c6021p13.m6537c0(c8804n);
                            obj9 = c8804n;
                        }
                        c6021p13.m6553p(false);
                        AbstractC4101o.m4761b(c8410b8, (InterfaceC1426a) obj9, null, AbstractC19918c.f63164d, null, false, null, null, null, c6021p13, 3078, 500);
                    }
                    c6021p13.m6553p(false);
                    c6021p13.m6524S(-826331571);
                    if (c19906k.f63097v) {
                        C8410b c8410b9 = AbstractC19918c.f63165e;
                        c6021p13.m6524S(-826326294);
                        boolean zM6542f14 = c6021p13.m6542f(interfaceC1426a6) | c6021p13.m6542f(interfaceC1436k5);
                        Object objM6514H28 = c6021p13.m6514H();
                        if (zM6542f14 || objM6514H28 == c5975s) {
                            obj8 = objM6514H28;
                            C8804n c8804n2 = new C8804n(interfaceC1426a6, interfaceC1436k5, 6);
                            c6021p13.m6537c0(c8804n2);
                            obj8 = c8804n2;
                        }
                        c6021p13.m6553p(false);
                        AbstractC4101o.m4761b(c8410b9, (InterfaceC1426a) obj8, null, AbstractC19918c.f63166f, null, false, null, null, null, c6021p13, 3078, 500);
                        C8410b c8410b10 = AbstractC19918c.f63167g;
                        c6021p13.m6524S(-826314357);
                        boolean zM6542f15 = c6021p13.m6542f(interfaceC1426a6) | c6021p13.m6542f(interfaceC1436k5);
                        Object objM6514H29 = c6021p13.m6514H();
                        Object obj34 = objM6514H29;
                        if (zM6542f15 || objM6514H29 == c5975s) {
                            C8804n c8804n3 = new C8804n(interfaceC1426a6, interfaceC1436k5, 7);
                            c6021p13.m6537c0(c8804n3);
                            obj34 = c8804n3;
                        }
                        c6021p13.m6553p(false);
                        AbstractC4101o.m4761b(c8410b10, (InterfaceC1426a) obj34, null, AbstractC19918c.f63168h, null, false, null, null, null, c6021p13, 3078, 500);
                    }
                    c6021p13.m6553p(false);
                    C8410b c8410b11 = AbstractC19918c.f63169i;
                    c6021p13.m6524S(-826302504);
                    boolean zM6542f16 = c6021p13.m6542f(interfaceC1426a6) | c6021p13.m6542f(interfaceC1436k5);
                    Object objM6514H30 = c6021p13.m6514H();
                    Object obj35 = objM6514H30;
                    if (zM6542f16 || objM6514H30 == c5975s) {
                        C8804n c8804n4 = new C8804n(interfaceC1426a6, interfaceC1436k5, 8);
                        c6021p13.m6537c0(c8804n4);
                        obj35 = c8804n4;
                    }
                    c6021p13.m6553p(false);
                    AbstractC4101o.m4761b(c8410b11, (InterfaceC1426a) obj35, null, AbstractC19918c.f63170j, null, false, null, null, null, c6021p13, 3078, 500);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1281w(C8870f c8870f, ConversationDetailsViewModel conversationDetailsViewModel, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f3408Y = 27;
        this.f3410o0 = c8870f;
        this.f3409Z = conversationDetailsViewModel;
        this.f3411p0 = interfaceC5985X;
    }

    /* JADX INFO: renamed from: f */
    private final Object m1997f(Object obj, Object obj2, Object obj3) {
        Object obj4;
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(paddings) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC2922d random = (AbstractC2922d) c6021p.m6548k(AbstractC7309m.f23152a);
            AbstractC16544l.m18094g(random, "random");
            c6021p.m6524S(1522464867);
            List list = AbstractC10541b.f31288q;
            AbstractC16544l.m18094g(list, EhBykzn.wOtmuJLzpDNKUT);
            List listM19324E0 = AbstractC17680n.m19324E0(list);
            for (int iM19381j = AbstractC17681o.m19381j(listM19324E0); iM19381j > 0; iM19381j--) {
                int iMo3723c = random.mo3723c(iM19381j + 1);
                ArrayList arrayList = (ArrayList) listM19324E0;
                arrayList.set(iMo3723c, arrayList.set(iM19381j, arrayList.get(iMo3723c)));
            }
            List listM19382k = AbstractC17681o.m19382k("", AbstractC8142m4.m8676d(R.string.login_greeting1, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting2, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting3, c6021p), "", AbstractC8142m4.m8676d(R.string.app_title, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting4, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting5, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting6, c6021p), "", AbstractC8142m4.m8676d(R.string.app_title, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting7, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting8, c6021p), "", AbstractC8142m4.m8676d(R.string.login_greeting9, c6021p), "", AbstractC8142m4.m8676d(R.string.app_title, c6021p));
            List list2 = listM19382k;
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            int i10 = 0;
            for (Object obj5 : list2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                String str = (String) obj5;
                ArrayList arrayList3 = (ArrayList) listM19324E0;
                Object obj6 = arrayList3.get((i10 / 2) % arrayList3.size());
                String str2 = (String) AbstractC17680n.m19344T(i10 - 1, listM19382k);
                if (str2 == null) {
                    str2 = "";
                }
                C10540a c10540a = (C10540a) obj6;
                arrayList2.add(new C13642a(str, c10540a.f31271b, c10540a.f31270a, C21555b.m21840j(str2.length(), AbstractC7622f.f24091a)));
                i10 = i11;
            }
            Object objM530s = AbstractC0168G.m530s(137371105, c6021p, false);
            C5975S c5975s = C6013l.f19514a;
            if (objM530s == c5975s) {
                c6021p.m6537c0(arrayList2);
                obj4 = arrayList2;
            } else {
                obj4 = objM530s;
            }
            c6021p.m6553p(false);
            C10324t c10324t = (C10324t) this.f3410o0;
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f3409Z;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f3411p0;
            AbstractC7625i.m7963a((List) obj4, true, 0L, 0L, AbstractC8411c.m8969c(-2013331678, c6021p, new C2497c(paddings, interfaceC1436k, c10324t, interfaceC5985X, 5)), c6021p, 24624, 12);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(137541846);
                boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == c5975s) {
                    objM6514H = new C0537v(16, interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H;
                Object objM530s2 = AbstractC0168G.m530s(137544360, c6021p, false);
                if (objM530s2 == c5975s) {
                    objM530s2 = new C6207k(interfaceC5985X, 25);
                    c6021p.m6537c0(objM530s2);
                }
                c6021p.m6553p(false);
                AbstractC7987S3.m8290c(48, (InterfaceC1426a) objM530s2, interfaceC1436k2, c6021p);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1281w(Object obj, Object obj2, Object obj3, int i10) {
        super(3);
        this.f3408Y = i10;
        this.f3409Z = obj;
        this.f3410o0 = obj2;
        this.f3411p0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1281w(Object obj, Object obj2, boolean z6, Object obj3, int i10) {
        super(3);
        this.f3408Y = i10;
        this.f3409Z = obj;
        this.f3411p0 = obj2;
        this.f3410o0 = obj3;
    }
}
