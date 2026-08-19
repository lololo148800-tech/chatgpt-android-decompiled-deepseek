package p039Bc;

import af.AbstractC10574c;
import af.C10564U;
import af.C10571a0;
import af.C10573b0;
import af.C10575c0;
import af.C10589q;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.material3.AbstractC10859d;
import androidx.compose.p650ui.ZIndexElement;
import androidx.compose.p650ui.focus.AbstractC10862a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import bf.C11349D;
import bf.C11352G;
import bf.C11363S;
import bf.C11364T;
import bf.InterfaceC11374b0;
import cd.C11709i;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.conversation.AbstractC12312a;
import com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel;
import com.openai.feature.notification.NotificationTaskViewModel;
import com.openai.feature.settings.impl.instructions.CustomInstructionsIntroductionViewModel;
import fo.C13711h;
import gd.C13880O0;
import gd.C13897U0;
import gd.C13909Y0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import nc.AbstractC17563j;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0227a;
import p003A1.C0280q;
import p003A1.C0307z;
import p003A1.InterfaceC0309z1;
import p006A4.C0349j;
import p017Af.C0485p;
import p025An.C0644w;
import p040Bd.C0893B;
import p042Bf.C1279u;
import p042Bf.C1280v;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p054C0.C1501n;
import p080D0.AbstractC1793a0;
import p080D0.C1788W;
import p080D0.C1791Z;
import p1051v0.AbstractC20417e;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21059M;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21917G1;
import p1155zi.C21958S;
import p1155zi.C22068v1;
import p1155zi.C22072w1;
import p124Ei.C2529m1;
import p124Ei.C2535p;
import p169Gf.AbstractC3040d;
import p169Gf.AbstractC3051o;
import p169Gf.C3046j;
import p204I1.C3573D;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4042e0;
import p229J0.C4135t3;
import p244Jg.C4339c;
import p273Kl.C4714D;
import p279L1.C4911l;
import p291Lf.AbstractC5028y;
import p291Lf.C5020q;
import p296Lk.AbstractC5112i;
import p296Lk.C5107d;
import p296Lk.C5108e;
import p296Lk.C5113j;
import p328N1.AbstractC5599o;
import p328N1.C5583J;
import p328N1.C5600p;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p328N1.InterfaceC5584K;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p360Od.C6172d;
import p362Of.AbstractC6196k;
import p363Og.C6209m;
import p363Og.C6219w;
import p363Og.C6221y;
import p393Q1.C6551c;
import p403Qd.C6639j0;
import p406Qg.AbstractC6707c;
import p406Qg.AbstractC6709e;
import p406Qg.C6690A;
import p406Qg.C6723s;
import p406Qg.C6724t;
import p406Qg.C6725u;
import p478Tc.AbstractC7313q;
import p478Tc.C7299c;
import p482Tg.C7448e;
import p492U1.C7536a;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8025X4;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8532O4;
import p544W9.AbstractC8640h;
import p544W9.AbstractC8644h3;
import p544W9.AbstractC8651i4;
import p547Wc.C8805o;
import p547Wc.C8816z;
import p552Wg.AbstractC8840b;
import p552Wg.AbstractC8842d;
import p552Wg.C8846h;
import p552Wg.C8847i;
import p552Wg.C8856r;
import p552Wg.C8863y;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9147I2;
import p571X9.AbstractC9153J2;
import p571X9.AbstractC9165L2;
import p571X9.AbstractC9225V3;
import p571X9.AbstractC9393x3;
import p575Xd.InterfaceC9461t;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9751J3;
import p594Y9.AbstractC9798R3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p654b1.C11214h;
import p654b1.C11215i;
import p654b1.EnumC11216j;
import p654b1.InterfaceC11209c;
import p706df.C13103w;
import p736f0.InterfaceC13499q;
import p758g0.C13756d;
import p758g0.C13771k0;
import p758g0.C13774m;
import p759g1.C13800b;
import p773h0.InterfaceC14267W;
import p909nm.C17690x;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17736P;
import p911o0.C17739T;
import p911o0.C17756f;
import p911o0.C17782s;
import p911o0.C17786u;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17740U;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;
import p946pc.C18320E;
import p953q0.C18580g;
import ve.C20584h;

/* JADX INFO: renamed from: Bc.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C0885s extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2602Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f2603Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f2604o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0885s(InterfaceC1436k interfaceC1436k, C13771k0 c13771k0) {
        super(3);
        this.f2602Y = 28;
        this.f2603Z = (AbstractC16546n) interfaceC1436k;
        this.f2604o0 = c13771k0;
    }

    /* JADX INFO: renamed from: a */
    private final Object m1947a(Object obj, Object obj2, Object obj3) {
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
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(AbstractC10842a.m11233k(interfaceC10459qM11244d, f10), paddings);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
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
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.notification_task_screen_settings_description, c6021p), AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, 0.0f, 2), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131064);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
            c6021p.m6524S(-377096804);
            C22072w1 c22072w1 = (C22072w1) this.f2603Z;
            for (C22068v1 c22068v1 : c22072w1.f69787d) {
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(526150199, c6021p, new C0227a(c22068v1, 27)), null, null, null, null, AbstractC8411c.m8969c(1064394492, c6021p, new C0349j(c22068v1, 27, (NotificationTaskViewModel) this.f2604o0)), null, 0.0f, 0.0f, c6021p, 196614, 478);
            }
            c6021p.m6553p(false);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
            AbstractC4124r4.m4768b(c22072w1.f69786c, AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23201f, 0.0f, 2), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131064);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: b */
    private final Object m1948b(Object obj, Object obj2, Object obj3) {
        C17794y ModalBottomSheet = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            C10449g c10449g = C10444b.f30947z0;
            C17756f c17756f = AbstractC17770m.f56726c;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 48);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
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
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(AbstractC10842a.m11237o(c10456n, f10, 0.0f, f10, f10, 2), 1.0f);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            ((InterfaceC1439n) this.f2603Z).invoke(c6021p, 0);
            c6021p.m6553p(true);
            InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC8479G.m9124e(c6021p), 14);
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 54);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
            ((C8410b) this.f2604o0).invoke(c6021p, 0);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: c */
    private final Object m1949c(Object obj, Object obj2, Object obj3) {
        C6021p c6021p;
        String strM8676d;
        boolean z6;
        Object obj4;
        InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
        C6021p c6021p2 = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(paddings, "paddings");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p2.m6542f(paddings) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p2.m6562y()) {
            c6021p2.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23201f;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f10), C10444b.f30946y0, c6021p2, 0);
            int i10 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11232j);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p2.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p2.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i10))) {
                AbstractC0168G.m537z(i10, c6021p2, i10, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
            C17794y c17794y = C17794y.f56777a;
            C8856r c8856r = (C8856r) this.f2603Z;
            String strM8676d2 = AbstractC8142m4.m8676d(c8856r.f27117h ? R.string.share_screen_description_already_shared : R.string.share_screen_description, c6021p2);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2);
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM8676d2, interfaceC10459qM11235m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12155k, c6021p2, 0, 0, 65532);
            boolean z10 = c8856r.f27112c;
            if (z10) {
                c6021p = c6021p2;
                c6021p.m6524S(1527256852);
                strM8676d = AbstractC8142m4.m8676d(R.string.share_screen_plugin_content_warning, c6021p);
                c6021p.m6553p(false);
            } else {
                c6021p = c6021p2;
                if (z10) {
                    c6021p.m6524S(1527092755);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                c6021p.m6524S(1527259764);
                strM8676d = AbstractC8142m4.m8676d(R.string.share_screen_custom_profile_warning, c6021p);
                c6021p.m6553p(false);
            }
            C6021p c6021p3 = c6021p;
            AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p3, 0, 0, 65532);
            InterfaceC10459q interfaceC10459qM19544b = c17794y.m19544b(c10456n, true);
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f2604o0;
            AbstractC9798R3.m10415a(c8856r.f27113d, c8856r.f27116g, c8856r.f27111b, c8856r.f27115f, interfaceC10459qM19544b, false, null, AbstractC8411c.m8969c(-388649025, c6021p3, new C8805o(c8856r, 3, interfaceC3759g)), c6021p3, 12582912, 96);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11234l(c10456n, f10, f10), 1.0f);
            C4042e0 c4042e0M4732a = AbstractC4048f0.m4732a(c6021p3);
            boolean z11 = c8856r.f27118i != null;
            c6021p3.m6524S(1527314347);
            boolean zM6542f = c6021p3.m6542f(interfaceC3759g);
            Object objM6514H = c6021p3.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                z6 = false;
                C8846h c8846h = new C8846h(interfaceC3759g, false ? 1 : 0);
                c6021p3.m6537c0(c8846h);
                obj4 = c8846h;
            } else {
                z6 = false;
                obj4 = objM6514H;
            }
            c6021p3.m6553p(z6);
            AbstractC9751J3.m10349b((InterfaceC1426a) obj4, interfaceC10459qM11244d, c4042e0M4732a, c8856r.f27119j, z11, AbstractC8840b.f27060d, c6021p3, 196608, 0);
            c6021p3.m6553p(true);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m1950e(Object obj, Object obj2, Object obj3) {
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
            C10589q c10589q = (C10589q) this.f2603Z;
            C11352G c11352g = c10589q.f31440b;
            C11349D c11349d = c11352g != null ? c11352g.f34346a : null;
            C10456n c10456n = C10456n.f30959Y;
            if (c11349d != null) {
                c6021p.m6524S(-1300459316);
                InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                int i10 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
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
                InterfaceC10459q interfaceC10459qM19544b = C17794y.f56777a.m19544b(c10456n, true);
                c6021p.m6524S(800698744);
                boolean zM6542f = c6021p.m6542f(c11349d);
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f2604o0;
                boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC3759g) | c6021p.m6542f(c10589q);
                Object objM6514H = c6021p.m6514H();
                C5975S c5975s = C6013l.f19514a;
                if (zM6542f2 || objM6514H == c5975s) {
                    objM6514H = new C7448e(c11349d, c10589q, interfaceC3759g, 10);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC9746I4.m10337a(interfaceC10459qM19544b, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 0, 254);
                c6021p.m6524S(800923353);
                boolean zM6542f3 = c6021p.m6542f(interfaceC3759g);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f3 || objM6514H2 == c5975s) {
                    objM6514H2 = new C8846h(interfaceC3759g, 4);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H2, AbstractC10842a.m11233k(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f), false, null, null, null, null, null, null, AbstractC10574c.f31407f, c6021p, 805306368, 508);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1293080665);
                InterfaceC10459q interfaceC10459qMo428M = AbstractC10842a.m11232j(c10456n, paddings).mo428M(AbstractC10844c.f32512c);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i11 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                C21694h c21694h2 = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                    AbstractC0168G.m537z(i11, c6021p, i11, c21694h2);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(c10456n, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m1951f(Object obj, Object obj2, Object obj3) {
        C17794y Card = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8090g0.m8546e((C11364T) this.f2603Z, (C11349D) this.f2604o0, null, AbstractC10842a.m11235m(C10456n.f30959Y, 0.0f, AbstractC7313q.f23199d, 1), 0.0f, null, false, false, c6021p, 384, 240);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private final Object m1952h(Object obj, Object obj2, Object obj3) {
        InterfaceC10459q interfaceC10459q;
        boolean z6;
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
            C10573b0 c10573b0 = (C10573b0) this.f2603Z;
            C10571a0 c10571a0 = c10573b0.f31400d;
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f2604o0;
            if (c10571a0 != null) {
                c6021p.m6524S(1253333861);
                AbstractC8090g0.m8559r(c10573b0.f31400d, (InterfaceC1436k) interfaceC3759g, AbstractC10842a.m11232j(c10456n, paddings), c6021p, 0);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1253584496);
                InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(c10456n, paddings);
                C17756f c17756f = AbstractC17770m.f56726c;
                C10449g c10449g = C10444b.f30946y0;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
                int i10 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
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
                List list = c10573b0.f31397a;
                List list2 = list;
                if (list2.isEmpty()) {
                    c6021p.m6524S(-2086879813);
                    interfaceC10459q = null;
                    AbstractC8090g0.m8557p(null, c6021p, 0);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-2086889389);
                    AbstractC8090g0.m8556o(c10573b0.f31397a, c10573b0.f31399c, c10573b0.f31398b, (InterfaceC1436k) interfaceC3759g, null, c6021p, 0);
                    c6021p.m6553p(false);
                    interfaceC10459q = null;
                }
                C10575c0 c10575c0 = c10573b0.f31401e;
                Object obj4 = c10575c0 != null ? c10575c0.f31411c : interfaceC10459q;
                if (obj4 != null) {
                    c6021p.m6524S(-268588123);
                    AbstractC8090g0.m8554m(obj4, AbstractC16544l.m18089b(c10575c0, c10573b0.f31399c), c10575c0.f31410b instanceof C21917G1, (InterfaceC1436k) interfaceC3759g, c6021p, 0);
                    c6021p.m6553p(false);
                    z6 = false;
                } else {
                    c6021p.m6524S(-268185402);
                    InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(c10456n, AbstractC8479G.m9124e(c6021p), 14);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
                    C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h3);
                    }
                    C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                    if (list2.isEmpty()) {
                        z6 = false;
                        c6021p.m6524S(-1740564998);
                        AbstractC8090g0.m8558q(0, c6021p);
                        AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
                        AbstractC8090g0.m8552k(interfaceC10459q, c6021p, 6);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-1740955908);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC8090g0.m8555n((C10575c0) it.next(), (InterfaceC1436k) interfaceC3759g, c6021p, 0);
                        }
                        z6 = false;
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(true);
                    c6021p.m6553p(z6);
                }
                c6021p.m6553p(true);
                c6021p.m6553p(z6);
            }
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m1953i(Object obj, Object obj2, Object obj3) {
        int i10;
        C10845a item = (C10845a) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(item, "$this$item");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (((C11363S) this.f2603Z) != null) {
                i10 = ((C10575c0) this.f2604o0).f31411c.f34360b.isEmpty() ? R.string.gizmos_store_search_no_results : R.string.gizmos_store_search_results;
            } else {
                i10 = R.string.gizmos_store_search_progress;
            }
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p), AbstractC10842a.m11234l(C10456n.f30959Y, AbstractC7313q.f23201f, AbstractC7313q.f23199d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12151g, c6021p, 0, 0, 65532);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m1954k(Object obj, Object obj2, Object obj3) {
        InterfaceC10459q composed = (InterfaceC10459q) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        AbstractC16544l.m18094g(composed, "$this$composed");
        c6021p.m6524S(935941467);
        InterfaceC11209c interfaceC11209c = (InterfaceC11209c) c6021p.m6548k(AbstractC0187M0.f700b);
        C11214h c11214h = new C11214h(AbstractC9393x3.m9974d((EnumC11216j) this.f2603Z), (InterfaceC1436k) this.f2604o0);
        ((C11215i) c6021p.m6548k(AbstractC0187M0.f701c)).f33893a.put(Integer.valueOf(c11214h.f33892d), c11214h);
        c6021p.m6524S(-1054777933);
        boolean zM6545h = c6021p.m6545h(c11214h);
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (zM6545h || objM6514H == c5975s) {
            objM6514H = new C10564U(c11214h, 1);
            c6021p.m6537c0(objM6514H);
        }
        c6021p.m6553p(false);
        InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(composed, (InterfaceC1436k) objM6514H);
        c6021p.m6524S(-1054775264);
        boolean zM6545h2 = c6021p.m6545h(interfaceC11209c) | c6021p.m6545h(c11214h);
        Object objM6514H2 = c6021p.m6514H();
        if (zM6545h2 || objM6514H2 == c5975s) {
            objM6514H2 = new C8847i(interfaceC11209c, 11, c11214h);
            c6021p.m6537c0(objM6514H2);
        }
        c6021p.m6553p(false);
        InterfaceC10459q interfaceC10459qM11300b = AbstractC10862a.m11300b(interfaceC10459qM11318d, (InterfaceC1436k) objM6514H2);
        c6021p.m6553p(false);
        return interfaceC10459qM11300b;
    }

    /* JADX INFO: renamed from: l */
    private final Object m1955l(Object obj, Object obj2, Object obj3) {
        C18320E RichText = (C18320E) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(RichText, "$this$RichText");
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6021p.m6542f(RichText) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p.m6548k(AbstractC0187M0.f714p);
            c6021p.m6524S(2034421437);
            C8870f c8870f = (C8870f) this.f2604o0;
            boolean zM6545h = c6021p.m6545h(c8870f) | c6021p.m6545h(interfaceC0309z1);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C8847i(c8870f, 17, interfaceC0309z1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC17563j.m19214b(RichText, (String) this.f2603Z, null, null, (InterfaceC1436k) objM6514H, null, null, c6021p, iIntValue & 14, 54);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m1956m(Object obj, Object obj2, Object obj3) {
        C17794y ModalBottomSheet = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8025X4.m8367b((C21958S) this.f2603Z, (InterfaceC1426a) this.f2604o0, c6021p, 0);
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m1957n(Object obj, Object obj2, Object obj3) {
        C10845a item = (C10845a) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(item, "$this$item");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1030665534);
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f2604o0;
            boolean zM6542f = c6021p.m6542f(interfaceC3759g);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                objM6514H = new C8846h(interfaceC3759g, 6);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8047a5.m8433f((InterfaceC11374b0) this.f2603Z, (InterfaceC1426a) objM6514H, null, c6021p, 0);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7313q.f23201f));
        }
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m1958o(Object obj, Object obj2, Object obj3) {
        C10845a item = (C10845a) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(item, "$this$item");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8047a5.m8434g(0, c6021p);
            c6021p.m6524S(-1030635533);
            String str = (String) this.f2603Z;
            boolean zM6542f = c6021p.m6542f(str);
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) this.f2604o0;
            boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC3759g);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f2 || objM6514H == C6013l.f19514a) {
                objM6514H = new C13103w(str, interfaceC3759g, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, str);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Type inference failed for: r0v7, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: p */
    private final Object m1959p(Object obj, Object obj2, Object obj3) {
        long jM9643a;
        InterfaceC21059M interfaceC21059M = (InterfaceC21059M) obj;
        AbstractC21069X abstractC21069XMo21533p = ((InterfaceC21056J) obj2).mo21533p(((C7536a) obj3).f23888a);
        if (interfaceC21059M.mo19937Z()) {
            if (((Boolean) ((AbstractC16546n) this.f2603Z).invoke(((C13771k0) this.f2604o0).f43492d.getValue())).booleanValue()) {
                jM9643a = AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z);
            } else {
                jM9643a = 0;
            }
        } else {
            jM9643a = AbstractC9113C4.m9643a(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z);
        }
        return interfaceC21059M.mo19936R((int) (jM9643a >> 32), (int) (jM9643a & 4294967295L), C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 4));
    }

    /* JADX WARN: Type inference failed for: r5v50, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC1436k interfaceC1436k;
        float f10;
        InterfaceC10459q interfaceC10459qM11209d;
        Typeface typeface;
        int i10 = 14;
        C10456n c10456n = C10456n.f30959Y;
        int i11 = 16;
        int i12 = 1;
        C5975S c5975s = C6013l.f19514a;
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f2604o0;
        Object obj5 = this.f2603Z;
        int i13 = 0;
        switch (this.f2602Y) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((6 & iIntValue) == 0) {
                    iIntValue |= c6021p.m6544g(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(-79171627);
                    if (zBooleanValue) {
                        c6021p.m6524S(-79170269);
                        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj5;
                        boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                        Object objM6514H = c6021p.m6514H();
                        if (zM6542f || objM6514H == c5975s) {
                            objM6514H = new C0883q(interfaceC5985X, null);
                            c6021p.m6537c0(objM6514H);
                        }
                        interfaceC1436k = (InterfaceC1436k) objM6514H;
                        c6021p.m6553p(false);
                    } else {
                        interfaceC1436k = null;
                    }
                    Object objM530s = AbstractC0168G.m530s(-79165311, c6021p, false);
                    if (objM530s == c5975s) {
                        objM530s = new C0884r((C5996c0) obj4, i13);
                        c6021p.m6537c0(objM530s);
                    }
                    c6021p.m6553p(false);
                    AbstractC12312a.m14260b(interfaceC1436k, null, (InterfaceC1436k) objM530s, c6021p, 384);
                }
                return c17296c;
            case 1:
                C17794y BottomSheetScaffold = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BottomSheetScaffold, "$this$BottomSheetScaffold");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM10921b = AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C17736P(3, 4));
                    c6021p2.m6524S(-1238014450);
                    C0893B c0893b = (C0893B) obj4;
                    boolean zM6542f2 = c6021p2.m6542f(c0893b);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C1279u(c0893b, (InterfaceC5985X) obj5, i13);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qM10921b, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H2, c6021p2, 0, 254);
                }
                return c17296c;
            case 2:
                C6021p c6021p3 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p3.m6524S(759876635);
                Object objM6514H3 = c6021p3.m6514H();
                if (objM6514H3 == c5975s) {
                    objM6514H3 = C5997d.m6421H((InterfaceC1426a) obj5);
                    c6021p3.m6537c0(objM6514H3);
                }
                InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H3;
                Object objM6514H4 = c6021p3.m6514H();
                if (objM6514H4 == c5975s) {
                    objM6514H4 = new C13756d(new C13800b(((C13800b) interfaceC5982V0.getValue()).f43584a), AbstractC1793a0.f5139b, new C13800b(AbstractC1793a0.f5140c), 8);
                    c6021p3.m6537c0(objM6514H4);
                }
                C13756d c13756d = (C13756d) objM6514H4;
                boolean zM6545h = c6021p3.m6545h(c13756d);
                Object objM6514H5 = c6021p3.m6514H();
                if (zM6545h || objM6514H5 == c5975s) {
                    objM6514H5 = new C1791Z(interfaceC5982V0, c13756d, null);
                    c6021p3.m6537c0(objM6514H5);
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H5, c6021p3, c17296c);
                C13774m c13774m = c13756d.f43411c;
                boolean zM6542f3 = c6021p3.m6542f(c13774m);
                Object objM6514H6 = c6021p3.m6514H();
                if (zM6542f3 || objM6514H6 == c5975s) {
                    objM6514H6 = new C1788W(0, c13774m);
                    c6021p3.m6537c0(objM6514H6);
                }
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) ((InterfaceC1436k) obj4).invoke((InterfaceC1426a) objM6514H6);
                c6021p3.m6553p(false);
                return interfaceC10459q;
            case 3:
                C18320E RichText = (C18320E) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(RichText, "$this$RichText");
                if ((6 & iIntValue3) == 0) {
                    iIntValue3 |= c6021p4.m6542f(RichText) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p4.m6548k(AbstractC0187M0.f714p);
                    C2529m1 c2529m1 = (C2529m1) obj5;
                    String str = c2529m1.f7861b;
                    c6021p4.m6524S(-1055180934);
                    InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj4;
                    boolean zM6545h2 = c6021p4.m6545h(interfaceC0309z1) | c6021p4.m6545h(interfaceC20904w) | c6021p4.m6542f(c2529m1);
                    Object objM6514H7 = c6021p4.m6514H();
                    if (zM6545h2 || objM6514H7 == c5975s) {
                        objM6514H7 = new C0146w(interfaceC0309z1, interfaceC20904w, c2529m1, i10);
                        c6021p4.m6537c0(objM6514H7);
                    }
                    c6021p4.m6553p(false);
                    AbstractC17563j.m19214b(RichText, str, null, null, (InterfaceC1436k) objM6514H7, null, null, c6021p4, iIntValue3 & 14, 54);
                }
                return c17296c;
            case 4:
                C17794y DropdownMenuWithTapOffset = (C17794y) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(DropdownMenuWithTapOffset, "$this$DropdownMenuWithTapOffset");
                if ((iIntValue4 & 17) == 16 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    c6021p5.m6524S(-1636921831);
                    Iterator it = ((C6639j0) obj5).f21402b.iterator();
                    while (it.hasNext()) {
                        AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-1947794802, c6021p5, new C3046j((String) it.next(), i13)), null, null, null, null, null, null, 0.0f, 0.0f, c6021p5, 6, 510);
                    }
                    c6021p5.m6553p(false);
                    AbstractC3984T1.m4692k(AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, AbstractC7313q.f23198c, 1), 0.0f, 0L, c6021p5, 0, 6);
                    C8410b c8410b = AbstractC3040d.f9143a;
                    c6021p5.m6524S(-1636907029);
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj4;
                    boolean zM6542f4 = c6021p5.m6542f(interfaceC1426a);
                    Object objM6514H8 = c6021p5.m6514H();
                    if (zM6542f4 || objM6514H8 == c5975s) {
                        objM6514H8 = new C2535p(i12, interfaceC1426a);
                        c6021p5.m6537c0(objM6514H8);
                    }
                    c6021p5.m6553p(false);
                    AbstractC4101o.m4761b(c8410b, (InterfaceC1426a) objM6514H8, null, AbstractC3040d.f9144b, null, false, null, null, null, c6021p5, 3078, 500);
                }
                return c17296c;
            case 5:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p6 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC8651i4.m9323a(0, 4, c6021p6, AbstractC8071d5.m8483b(AbstractC10844c.m11252l(AbstractC10842a.m11233k(AbstractC10833a.m11207b(c10456n, ((C3949M0) c6021p6.m6548k(AbstractC3959O0.f12302a)).f12234p, AbstractC20417e.f64539a), AbstractC7313q.f23197b), AbstractC3051o.f9208a), ((Number) ((InterfaceC5982V0) obj4).getValue()).floatValue()), (String) obj5, false);
                return c17296c;
            case 6:
                C17786u BoxWithConstraints = (C17786u) obj;
                C6021p c6021p7 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((6 & iIntValue5) == 0) {
                    iIntValue5 |= c6021p7.m6542f(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue5 & 19) == 18 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC10844c.m11257q(c10456n, 0.0f, ((InterfaceC7537b) obj5).mo7861O(C7536a.m7854i(BoxWithConstraints.f56763b)) * 0.78f, 1), ((C4135t3) c6021p7.m6548k(AbstractC4141u3.f13417a)).f13380d);
                    c6021p7.m6524S(524658133);
                    Object objM6514H9 = c6021p7.m6514H();
                    if (objM6514H9 == c5975s) {
                        objM6514H9 = new C7299c();
                        c6021p7.m6537c0(objM6514H9);
                    }
                    c6021p7.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC10833a.m11207b(AbstractC8644h3.m9311c(interfaceC10459qM8501a, (C5020q) c6021p7.m6548k(AbstractC5028y.f16441b), (C7299c) objM6514H9, (InterfaceC14267W) c6021p7.m6548k(AbstractC10839g.f32446a)), ((C3949M0) c6021p7.m6548k(AbstractC3959O0.f12302a)).f12192F, AbstractC20417e.m21079a(20)), AbstractC7313q.f23200e, AbstractC7313q.f23199d);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i14 = c6021p7.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p7.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p7, interfaceC10459qM11234l);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p7.m6528W();
                    if (c6021p7.f19563O) {
                        c6021p7.m6549l(c21696i);
                    } else {
                        c6021p7.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p7, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p7, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p7.f19563O || !AbstractC16544l.m18089b(c6021p7.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p7, i14, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p7, interfaceC10459qM10923d);
                    ((C8410b) obj4).invoke(c6021p7, 0);
                    c6021p7.m6553p(true);
                }
                return c17296c;
            case 7:
                int iIntValue6 = ((Number) obj).intValue();
                C6021p c6021p8 = (C6021p) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 14) == 0) {
                    iIntValue7 |= c6021p8.m6538d(iIntValue6) ? 4 : 2;
                }
                if ((iIntValue7 & 91) == 18 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    C18580g c18580g = (C18580g) obj5;
                    C5107d c5107d = (C5107d) ((C5108e) c18580g.f59184c).f16689a.invoke(Integer.valueOf(iIntValue6));
                    int i15 = AbstractC5112i.f16710a;
                    int i16 = c5107d.f16685a;
                    C5113j c5113j = (C5113j) obj4;
                    C0307z c0307z = c5113j.f16711a;
                    int i17 = c5107d.f16686b;
                    boolean z6 = i16 < ((Number) c0307z.invoke(Integer.valueOf(i17))).intValue();
                    boolean z10 = i17 < ((Number) c5113j.f16712b.invoke(Integer.valueOf(c5107d.f16685a))).intValue();
                    boolean z11 = c5107d.f16688d - i17 >= 1 && c5113j.f16713c;
                    if (z6 && z10) {
                        f10 = 2.0f;
                    } else if (z6 && z11) {
                        f10 = 3.0f;
                    } else {
                        f10 = (z6 || z10 || z11) ? 1.0f : 0.0f;
                    }
                    ZIndexElement zIndexElement = new ZIndexElement(f10);
                    c6021p8.m6525T(733328855);
                    C17782s c17782sM19512f = AbstractC17780r.m19512f(48, c6021p8, true);
                    c6021p8.m6525T(-1323940314);
                    int i18 = c6021p8.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p8.m6550m();
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    C8410b c8410bM21570k = AbstractC21075b0.m21570k(zIndexElement);
                    c6021p8.m6528W();
                    if (c6021p8.f19563O) {
                        c6021p8.m6549l(c21696i2);
                    } else {
                        c6021p8.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p8, c17782sM19512f);
                    C5997d.m6439Z(C21698j.f68872e, c6021p8, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p8.f19563O || !AbstractC16544l.m18089b(c6021p8.m6514H(), Integer.valueOf(i18))) {
                        AbstractC0168G.m537z(i18, c6021p8, i18, c21694h2);
                    }
                    c8410bM21570k.invoke(new C6042z0(c6021p8), c6021p8, 0);
                    c6021p8.m6525T(2058660585);
                    ((C5108e) c18580g.f59184c).f16692d.invoke(Integer.valueOf(iIntValue6), c6021p8, Integer.valueOf(iIntValue7 & 14));
                    c6021p8.m6553p(false);
                    AbstractC3794B0.m4471F(c6021p8, true, false, false);
                }
                return c17296c;
            case 8:
                InterfaceC17740U FlowRow = (InterfaceC17740U) obj;
                C6021p c6021p9 = (C6021p) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(FlowRow, "$this$FlowRow");
                if ((iIntValue8 & 17) == 16 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    C6172d c6172d = (C6172d) obj5;
                    Iterator it2 = c6172d.f20091a.f28485g.iterator();
                    while (it2.hasNext()) {
                        AbstractC6196k.m6727d((InterfaceC9461t) it2.next(), (InterfaceC1436k) obj4, c6172d, null, c6021p9, 0, 8);
                    }
                }
                return c17296c;
            case 9:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p10 = (C6021p) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((6 & iIntValue9) == 0) {
                    iIntValue9 |= c6021p10.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue9 & 19) == 18 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    c6021p10.m6524S(1775616993);
                    C8870f c8870f = (C8870f) obj5;
                    boolean zM6545h3 = c6021p10.m6545h(c8870f);
                    Object objM6514H10 = c6021p10.m6514H();
                    if (zM6545h3 || objM6514H10 == c5975s) {
                        objM6514H10 = new C1280v(c8870f, 7);
                        c6021p10.m6537c0(objM6514H10);
                    }
                    c6021p10.m6553p(false);
                    AbstractC8532O4.m9195b((InterfaceC1426a) objM6514H10, AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings), null, ((C6219w) AbstractC9112C3.m9642d(((CustomInstructionsIntroductionViewModel) obj4).f40343c, c6021p10).getValue()).f20237a, c6021p10, 0, 4);
                }
                return c17296c;
            case 10:
                InterfaceC17783s0 TopAppBar = (InterfaceC17783s0) obj;
                C6021p c6021p11 = (C6021p) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TopAppBar, "$this$TopAppBar");
                if ((iIntValue10 & 17) == 16 && c6021p11.m6562y()) {
                    c6021p11.m6517L();
                } else {
                    C6221y c6221y = (C6221y) obj5;
                    if (c6221y.f20249a) {
                        C20584h c20584h = c6221y.f20252d;
                        boolean z12 = c20584h != null ? c20584h.f65315a : false;
                        c6021p11.m6524S(1291134900);
                        InterfaceC3759g interfaceC3759g = (InterfaceC3759g) obj4;
                        boolean zM6542f5 = c6021p11.m6542f(interfaceC3759g);
                        Object objM6514H11 = c6021p11.m6514H();
                        if (zM6542f5 || objM6514H11 == c5975s) {
                            objM6514H11 = new C4339c(interfaceC3759g, 3);
                            c6021p11.m6537c0(objM6514H11);
                        }
                        c6021p11.m6553p(false);
                        AbstractC10859d.m11284a(z12, (InterfaceC1436k) objM6514H11, AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23199d, 0.0f, 2), null, false, null, null, c6021p11, 0, 120);
                    }
                }
                return c17296c;
            case 11:
                InterfaceC13499q AnimatedVisibility2 = (InterfaceC13499q) obj;
                C6021p c6021p12 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility2, "$this$AnimatedVisibility");
                c6021p12.m6524S(1629697404);
                ConversationSpreadsheetViewModel conversationSpreadsheetViewModel = (ConversationSpreadsheetViewModel) obj4;
                boolean zM6545h4 = c6021p12.m6545h(conversationSpreadsheetViewModel);
                Object objM6514H12 = c6021p12.m6514H();
                if (zM6545h4 || objM6514H12 == c5975s) {
                    objM6514H12 = new C4714D(conversationSpreadsheetViewModel, i11, (InterfaceC5985X) obj5);
                    c6021p12.m6537c0(objM6514H12);
                }
                c6021p12.m6553p(false);
                AbstractC9147I2.m9694c((InterfaceC1426a) objM6514H12, c6021p12, 0);
                return c17296c;
            case 12:
                InterfaceC17763i0 paddings2 = (InterfaceC17763i0) obj;
                C6021p c6021p13 = (C6021p) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings2, "paddings");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= c6021p13.m6542f(paddings2) ? 4 : 2;
                }
                if ((iIntValue11 & 19) == 18 && c6021p13.m6562y()) {
                    c6021p13.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(AbstractC10842a.m11232j(c10456n, paddings2), AbstractC8479G.m9124e(c6021p13), 14);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p13, 0);
                    int i19 = c6021p13.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p13.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p13, interfaceC10459qM9126g);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i3 = C21698j.f68869b;
                    c6021p13.m6528W();
                    if (c6021p13.f19563O) {
                        c6021p13.m6549l(c21696i3);
                    } else {
                        c6021p13.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p13, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p13, interfaceC6008i0M6550m3);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p13.f19563O || !AbstractC16544l.m18089b(c6021p13.m6514H(), Integer.valueOf(i19))) {
                        AbstractC0168G.m537z(i19, c6021p13, i19, c21694h3);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p13, interfaceC10459qM10923d2);
                    C8410b c8410b2 = AbstractC6707c.f21560b;
                    c6021p13.m6524S(250758214);
                    InterfaceC3759g interfaceC3759g2 = (InterfaceC3759g) obj5;
                    boolean zM6542f6 = c6021p13.m6542f(interfaceC3759g2);
                    Object objM6514H13 = c6021p13.m6514H();
                    if (zM6542f6 || objM6514H13 == c5975s) {
                        objM6514H13 = new C6209m(interfaceC3759g2, 5);
                        c6021p13.m6537c0(objM6514H13);
                    }
                    c6021p13.m6553p(false);
                    C6725u c6725u = (C6725u) obj4;
                    AbstractC3914G1.m4611a(c8410b2, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H13, 7), null, null, null, AbstractC8411c.m8969c(-1896286091, c6021p13, new C0227a(c6725u, 23)), null, 0.0f, 0.0f, c6021p13, 196614, 476);
                    c6021p13.m6524S(250786070);
                    c6021p13.m6524S(250786325);
                    boolean z13 = AbstractC8160o6.m8729d(C13880O0.f43918c, c6021p13) && !AbstractC8160o6.m8729d(C13909Y0.f43959c, c6021p13);
                    c6021p13.m6553p(false);
                    if (z13) {
                        boolean z14 = c6725u.f21601e;
                        c6021p13.m6524S(250796335);
                        boolean zM6542f7 = c6021p13.m6542f(interfaceC3759g2);
                        Object objM6514H14 = c6021p13.m6514H();
                        if (zM6542f7 || objM6514H14 == c5975s) {
                            objM6514H14 = new C4339c(interfaceC3759g2, 7);
                            c6021p13.m6537c0(objM6514H14);
                        }
                        c6021p13.m6553p(false);
                        AbstractC9165L2.m9714a(384, (InterfaceC1436k) objM6514H14, c6021p13, AbstractC10844c.m11244d(c10456n, 1.0f), z14);
                    }
                    c6021p13.m6553p(false);
                    Boolean bool = c6725u.f21597a;
                    boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                    C8410b c8410b3 = AbstractC6707c.f21561c;
                    c6021p13.m6524S(250810055);
                    boolean zM6542f8 = c6021p13.m6542f(interfaceC3759g2) | c6021p13.m6544g(zBooleanValue2);
                    Object objM6514H15 = c6021p13.m6514H();
                    if (zM6542f8 || objM6514H15 == c5975s) {
                        objM6514H15 = new C6723s(0, interfaceC3759g2, zBooleanValue2);
                        c6021p13.m6537c0(objM6514H15);
                    }
                    c6021p13.m6553p(false);
                    AbstractC3914G1.m4611a(c8410b3, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H15, 7), null, null, null, AbstractC8411c.m8969c(-693224482, c6021p13, new C6724t(zBooleanValue2, interfaceC3759g2, c6725u, i13)), null, 0.0f, 0.0f, c6021p13, 196614, 476);
                    float f11 = AbstractC7313q.f23201f;
                    AbstractC17758g.m19482b(c6021p13, AbstractC10844c.m11245e(c10456n, f11));
                    AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(R.string.settings_memory_description, null, c6021p13, 2), AbstractC10842a.m11235m(c10456n, f11, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p13, 0, 0, 262140);
                    c6021p13.m6524S(250831833);
                    if (c6725u.f21598b) {
                        Boolean bool2 = Boolean.TRUE;
                        Boolean bool3 = c6725u.f21597a;
                        boolean z15 = AbstractC16544l.m18089b(bool3, bool2) && AbstractC16544l.m18089b(c6725u.f21599c, bool2);
                        AbstractC17758g.m19482b(c6021p13, AbstractC10844c.m11245e(c10456n, f11));
                        C8410b c8410b4 = AbstractC6707c.f21562d;
                        c6021p13.m6524S(250843397);
                        if (AbstractC16544l.m18089b(bool3, bool2)) {
                            c6021p13.m6524S(1867807514);
                            boolean zM6542f9 = c6021p13.m6542f(interfaceC3759g2) | c6021p13.m6544g(z15);
                            Object objM6514H16 = c6021p13.m6514H();
                            if (zM6542f9 || objM6514H16 == c5975s) {
                                objM6514H16 = new C6723s(1, interfaceC3759g2, z15);
                                c6021p13.m6537c0(objM6514H16);
                            }
                            c6021p13.m6553p(false);
                            interfaceC10459qM11209d = AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H16, 7);
                        } else {
                            interfaceC10459qM11209d = c10456n;
                        }
                        c6021p13.m6553p(false);
                        AbstractC3914G1.m4611a(c8410b4, interfaceC10459qM11209d, null, null, null, AbstractC8411c.m8969c(-431726237, c6021p13, new C6724t(z15, interfaceC3759g2, c6725u, i12)), null, 0.0f, 0.0f, c6021p13, 196614, 476);
                        AbstractC17758g.m19482b(c6021p13, AbstractC10844c.m11245e(c10456n, f11));
                        AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(R.string.settings_search_memory_description, null, c6021p13, 2), AbstractC10842a.m11235m(c10456n, f11, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p13, 0, 0, 262140);
                    }
                    c6021p13.m6553p(false);
                    boolean zM8729d = AbstractC8160o6.m8729d(C13897U0.f43946c, c6021p13);
                    c6021p13.m6524S(250873997);
                    if (zM8729d) {
                        c6021p13.m6524S(250874833);
                        if (c6725u.f21600d) {
                            AbstractC17758g.m19482b(c6021p13, AbstractC10844c.m11245e(c10456n, f11));
                            AbstractC9153J2.m9700a(c6725u.f21602f, true, AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), f11, 0.0f, 2), c6021p13, 48);
                        }
                        c6021p13.m6553p(false);
                        AbstractC17758g.m19482b(c6021p13, AbstractC10844c.m11245e(c10456n, f11));
                        c6021p13.m6524S(250891518);
                        boolean zM6542f10 = c6021p13.m6542f(interfaceC3759g2);
                        Object objM6514H17 = c6021p13.m6514H();
                        if (zM6542f10 || objM6514H17 == c5975s) {
                            objM6514H17 = new C6209m(interfaceC3759g2, 6);
                            c6021p13.m6537c0(objM6514H17);
                        }
                        c6021p13.m6553p(false);
                        AbstractC3984T1.m4695n((InterfaceC1426a) objM6514H17, AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), f11, 0.0f, 2), false, null, null, null, null, null, null, AbstractC6707c.f21563e, c6021p13, 805306368, 508);
                    }
                    c6021p13.m6553p(false);
                    c6021p13.m6553p(true);
                }
                return c17296c;
            case 13:
                C17794y DropdownMenuWithTapOffset2 = (C17794y) obj;
                C6021p c6021p14 = (C6021p) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(DropdownMenuWithTapOffset2, "$this$DropdownMenuWithTapOffset");
                if ((iIntValue12 & 17) == 16 && c6021p14.m6562y()) {
                    c6021p14.m6517L();
                } else {
                    C8410b c8410b5 = AbstractC6709e.f21565a;
                    c6021p14.m6524S(-1264367292);
                    C11709i c11709i = (C11709i) obj4;
                    boolean zM6545h5 = c6021p14.m6545h(c11709i);
                    Object objM6514H18 = c6021p14.m6514H();
                    if (zM6545h5 || objM6514H18 == c5975s) {
                        objM6514H18 = new C6690A(c11709i, (InterfaceC5985X) obj5, 0);
                        c6021p14.m6537c0(objM6514H18);
                    }
                    c6021p14.m6553p(false);
                    AbstractC4101o.m4761b(c8410b5, (InterfaceC1426a) objM6514H18, null, AbstractC6709e.f21566b, null, false, null, null, null, c6021p14, 3078, 500);
                }
                return c17296c;
            case 14:
                C3573D c3573d = (C3573D) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                int iIntValue14 = ((Number) obj3).intValue();
                AbstractC5599o abstractC5599o = c3573d.f10864f;
                C5609y c5609y = c3573d.f10861c;
                if (c5609y == null) {
                    c5609y = C5609y.f18155r0;
                }
                C5605u c5605u = c3573d.f10862d;
                int i20 = c5605u != null ? c5605u.f18148a : 0;
                C5606v c5606v = c3573d.f10863e;
                i12 = c5606v != null ? c5606v.f18149a : 1;
                C6551c c6551c = (C6551c) ((C0485p) obj4).f1575Z;
                InterfaceC5584K interfaceC5584KM5991b = ((C5600p) c6551c.f21201q0).m5991b(abstractC5599o, c5609y, i20, i12);
                if (interfaceC5584KM5991b instanceof C5583J) {
                    Object obj6 = ((C5583J) interfaceC5584KM5991b).f18090Y;
                    AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj6;
                } else {
                    C13711h c13711h = new C13711h(interfaceC5584KM5991b, c6551c.f21206v0);
                    c6551c.f21206v0 = c13711h;
                    Object obj7 = c13711h.f43261p0;
                    AbstractC16544l.m18092e(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj7;
                }
                ((Spannable) obj5).setSpan(new C4911l(typeface, 0), iIntValue13, iIntValue14, 33);
                return c17296c;
            case 15:
                return m1947a(obj, obj2, obj3);
            case 16:
                return m1948b(obj, obj2, obj3);
            case 17:
                return m1949c(obj, obj2, obj3);
            case 18:
                C17794y DropdownMenu = (C17794y) obj;
                C6021p c6021p15 = (C6021p) obj2;
                int iIntValue15 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(DropdownMenu, "$this$DropdownMenu");
                if ((iIntValue15 & 17) == 16 && c6021p15.m6562y()) {
                    c6021p15.m6517L();
                } else {
                    C8410b c8410b6 = AbstractC8842d.f27069d;
                    c6021p15.m6524S(-896928477);
                    InterfaceC3759g interfaceC3759g3 = (InterfaceC3759g) obj5;
                    boolean zM6542f11 = c6021p15.m6542f(interfaceC3759g3);
                    Object objM6514H19 = c6021p15.m6514H();
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj4;
                    if (zM6542f11 || objM6514H19 == c5975s) {
                        objM6514H19 = new C8863y(interfaceC1426a2, interfaceC3759g3, 0);
                        c6021p15.m6537c0(objM6514H19);
                    }
                    c6021p15.m6553p(false);
                    AbstractC4101o.m4761b(c8410b6, (InterfaceC1426a) objM6514H19, null, AbstractC8842d.f27070e, null, false, null, null, null, c6021p15, 3078, 500);
                    C8410b c8410b7 = AbstractC8842d.f27071f;
                    c6021p15.m6524S(-896903319);
                    boolean zM6542f12 = c6021p15.m6542f(interfaceC3759g3);
                    Object objM6514H20 = c6021p15.m6514H();
                    if (zM6542f12 || objM6514H20 == c5975s) {
                        objM6514H20 = new C8863y(interfaceC1426a2, interfaceC3759g3, 1);
                        c6021p15.m6537c0(objM6514H20);
                    }
                    c6021p15.m6553p(false);
                    AbstractC4101o.m4761b(c8410b7, (InterfaceC1426a) objM6514H20, null, AbstractC8842d.f27072g, null, false, null, null, null, c6021p15, 3078, 500);
                }
                return c17296c;
            case 19:
                return m1950e(obj, obj2, obj3);
            case 20:
                return m1951f(obj, obj2, obj3);
            case 21:
                return m1952h(obj, obj2, obj3);
            case 22:
                return m1953i(obj, obj2, obj3);
            case 23:
                return m1954k(obj, obj2, obj3);
            case 24:
                return m1955l(obj, obj2, obj3);
            case 25:
                return m1956m(obj, obj2, obj3);
            case 26:
                return m1957n(obj, obj2, obj3);
            case 27:
                return m1958o(obj, obj2, obj3);
            case 28:
                return m1959p(obj, obj2, obj3);
            default:
                C17739T expandIndicator = (C17739T) obj;
                C6021p c6021p16 = (C6021p) obj2;
                int iIntValue16 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(expandIndicator, "$this$expandIndicator");
                if ((iIntValue16 & 17) == 16 && c6021p16.m6562y()) {
                    c6021p16.m6517L();
                } else {
                    c6021p16.m6524S(733889473);
                    InterfaceC20904w interfaceC20904w2 = (InterfaceC20904w) obj5;
                    boolean zM6545h6 = c6021p16.m6545h(interfaceC20904w2);
                    Object objM6514H21 = c6021p16.m6514H();
                    if (zM6545h6 || objM6514H21 == c5975s) {
                        objM6514H21 = new C8816z(interfaceC20904w2, 25, (C5996c0) obj4);
                        c6021p16.m6537c0(objM6514H21);
                    }
                    c6021p16.m6553p(false);
                    AbstractC8640h.m9303b((InterfaceC1426a) objM6514H21, AbstractC8142m4.m8676d(R.string.conversations_home_more_prompt_button_text, c6021p16), null, null, null, c6021p16, 0, 28);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0885s(Object obj, int i10, Object obj2) {
        super(3);
        this.f2602Y = i10;
        this.f2603Z = obj;
        this.f2604o0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0885s(Object obj, InterfaceC5985X interfaceC5985X, int i10) {
        super(3);
        this.f2602Y = i10;
        this.f2604o0 = obj;
        this.f2603Z = interfaceC5985X;
    }
}
