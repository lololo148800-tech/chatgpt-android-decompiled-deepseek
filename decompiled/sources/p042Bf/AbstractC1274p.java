package p042Bf;

import android.content.Context;
import android.gov.nist.core.Separators;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0184L0;
import p003A1.InterfaceC0309z1;
import p006A4.C0339D;
import p006A4.C0364y;
import p025An.C0644w;
import p040Bd.C0887A;
import p040Bd.C1166t;
import p049Bm.InterfaceC1426a;
import p080D0.C1832u;
import p098Di.InterfaceC2062k;
import p1113xn.AbstractC21322p;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3756d;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p254K0.C4518o;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8500J2;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13764h;
import p817j$.time.Clock;
import p817j$.time.DayOfWeek;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.LocalTime;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.temporal.TemporalAdjusters;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p926of.C18160X;

/* JADX INFO: renamed from: Bf.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1274p {

    /* JADX INFO: renamed from: a */
    public static final float f3385a = 128;

    /* JADX INFO: renamed from: b */
    public static final float f3386b = 96;

    /* JADX WARN: Code duplicated, block: B:92:0x0429  */
    /* JADX WARN: Code duplicated, block: B:94:0x0431  */
    /* JADX WARN: Code duplicated, block: B:99:0x044f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m1986a(C1166t business, InterfaceC10459q interfaceC10459q, Clock clock, C6021p c6021p, int i10) {
        int i11;
        Clock clock2;
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        C21694h c21694h;
        String str;
        float f10;
        C10456n c10456n;
        C6021p c6021p2;
        Object obj;
        int i14;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h2;
        C21694h c21694h3;
        C21694h c21694h4;
        int i15;
        C6021p c6021p3;
        C10450h c10450h;
        C21694h c21694h5;
        C21694h c21694h6;
        float f11;
        InterfaceC1426a interfaceC1426a2;
        C1166t c1166t;
        C10456n c10456n2;
        C6021p c6021p4;
        boolean z6;
        C21694h c21694h7;
        C21694h c21694h8;
        C21694h c21694h9;
        C21694h c21694h10;
        InterfaceC0309z1 interfaceC0309z1;
        C10450h c10450h2;
        float f12;
        boolean z10;
        float f13;
        boolean z11;
        Clock clock3;
        InterfaceC10459q interfaceC10459q3;
        C21694h c21694h11;
        InterfaceC2062k interfaceC2062k;
        AbstractC16544l.m18094g(business, "business");
        c6021p.m6526U(1299441417);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(business) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i16 = i11 | 48;
        if ((i10 & 384) == 0) {
            i16 = i11 | 176;
        }
        if ((i16 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            clock3 = clock;
        } else {
            c6021p.m6519N();
            int i17 = i10 & 1;
            C10456n c10456n3 = C10456n.f30959Y;
            if (i17 == 0 || c6021p.m6561x()) {
                Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                AbstractC16544l.m18093f(clockSystemDefaultZone, "systemDefaultZone(...)");
                clock2 = clockSystemDefaultZone;
                i12 = i16 & (-897);
                interfaceC10459q2 = c10456n3;
            } else {
                c6021p.m6517L();
                i12 = i16 & (-897);
                interfaceC10459q2 = interfaceC10459q;
                clock2 = clock;
            }
            c6021p.m6554q();
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC8479G.m9126g(interfaceC10459q2, AbstractC8479G.m9124e(c6021p), 14), AbstractC7313q.f23201f, 0.0f, 2);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i18 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a3 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a3);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h12 = C21698j.f68873f;
            C5997d.m6439Z(c21694h12, c6021p, c17790wM19515a);
            C21694h c21694h13 = C21698j.f68872e;
            C5997d.m6439Z(c21694h13, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h14 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i18))) {
                AbstractC0168G.m537z(i18, c6021p, i18, c21694h14);
            }
            C21694h c21694h15 = C21698j.f68871d;
            C5997d.m6439Z(c21694h15, c6021p, interfaceC10459qM10923d);
            C21694h c21694h16 = c21694h14;
            AbstractC4124r4.m4768b(business.f3096f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12151g, c6021p, 0, 0, 65534);
            int i19 = i12 & 14;
            AbstractC1277s.m1991c(business, null, AbstractC3984T1.m4678F(c6021p).f12154j, c6021p, i19);
            int i20 = (i12 << 3) & 112;
            InterfaceC10459q interfaceC10459q4 = interfaceC10459q2;
            C6021p c6021p5 = c6021p;
            AbstractC1277s.m1990b(clock2, business, null, AbstractC3984T1.m4678F(c6021p).f12154j, c6021p, i20, 4);
            AbstractC1277s.m1989a(business, null, c6021p5, i19);
            c6021p5.m6524S(-1754141380);
            List list = business.f3101k;
            List list2 = list;
            C5975S c5975s = C6013l.f19514a;
            if (list2 == null || list2.isEmpty()) {
                i13 = 1;
                c21694h = c21694h13;
                str = null;
                f10 = 0.0f;
            } else {
                c6021p5.m6524S(-1020152108);
                Context context = (Context) c6021p5.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p5.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list3 = (List) c6021p5.m6548k(AbstractC16421b.f50950a);
                c6021p5.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p5.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p5.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(MessagesViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C18160X.class);
                c6021p5.m6524S(-1395498839);
                boolean zM6542f = c6021p5.m6542f(interfaceC3756dMo5693b2) | c6021p5.m6542f(interfaceC3756dMo5693b) | c6021p5.m6542f(list3) | c6021p5.m6544g(zBooleanValue) | c6021p5.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == c5975s) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a, list3);
                    c6021p5.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p5.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p5, 0);
                c6021p5.m6553p(false);
                MessagesViewModel messagesViewModel = (MessagesViewModel) baseViewModel;
                c6021p5.m6524S(-1754137031);
                boolean zM6545h = c6021p5.m6545h(list);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h || objM6514H2 == c5975s) {
                    objM6514H2 = new C1267i(1, list);
                    c6021p5.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H2;
                c6021p5.m6553p(false);
                Object[] objArr = new Object[0];
                C21585H c21585h = C4518o.f14759c;
                boolean zM6542f2 = c6021p5.m6542f(interfaceC1426a4) | c6021p5.m6538d(0);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f2 || objM6514H3 == c5975s) {
                    objM6514H3 = new C1832u(0, interfaceC1426a4, 1);
                    c6021p5.m6537c0(objM6514H3);
                }
                C4518o c4518o = (C4518o) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H3, c6021p, 0, 4);
                c4518o.f14760a.setValue(interfaceC1426a4);
                InterfaceC10459q interfaceC10459qM11245e = AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n3, 1.0f), f3385a);
                float f14 = AbstractC7313q.f23199d;
                i13 = 1;
                f10 = 0.0f;
                c21694h = c21694h13;
                AbstractC8500J2.m9164b(c4518o, AbstractC10842a.m11235m(interfaceC10459qM11245e, 0.0f, f14, 1), f14, null, 0.0f, 0.0f, null, AbstractC8411c.m8969c(2136535168, c6021p5, new C0364y(list, 2, messagesViewModel)), c6021p, 100663352);
                str = null;
            }
            ?? r15 = 0;
            c6021p5.m6553p(false);
            c6021p5.m6524S(-1754086933);
            String str2 = business.f3098h;
            if (str2 != null) {
                float f15 = AbstractC7313q.f23199d;
                AbstractC3984T1.m4692k(AbstractC10842a.m11235m(r13, f10, f15, i13), 0.0f, 0L, c6021p, 0, 6);
                AbstractC17758g.m19482b(c6021p5, AbstractC10844c.m11245e(c10456n3, f15));
                c10456n = c10456n3;
                c21694h = c21694h;
                C6021p c6021p6 = c6021p5;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.business_about, c6021p5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12152h, c6021p, 0, 0, 65534);
                AbstractC4124r4.m4768b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12155k, c6021p, 0, 0, 65534);
                AbstractC17758g.m19482b(c6021p6, AbstractC10844c.m11245e(c10456n, f15));
                r15 = 0;
                c6021p2 = c6021p6;
            } else {
                c10456n = r13;
                c6021p2 = c6021p5;
            }
            c6021p2.m6553p(r15);
            InterfaceC0309z1 interfaceC0309z2 = (InterfaceC0309z1) c6021p2.m6548k(AbstractC0187M0.f714p);
            float f16 = AbstractC7313q.f23199d;
            String str3 = str;
            C21694h c21694h17 = c21694h;
            C6021p c6021p7 = c6021p2;
            C10456n c10456n4 = c10456n;
            AbstractC3984T1.m4692k(AbstractC10842a.m11235m(c10456n, 0.0f, f16, 1), 0.0f, 0L, c6021p, 0, 6);
            AbstractC17758g.m19482b(c6021p7, AbstractC10844c.m11245e(c10456n4, f16));
            c6021p7.m6524S(-1754067918);
            C10450h c10450h3 = C10444b.f30944w0;
            String str4 = business.f3097g;
            if (str4 == null) {
                c6021p3 = c6021p7;
                c21694h4 = c21694h15;
                interfaceC1426a = interfaceC1426a3;
                c21694h2 = c21694h12;
                obj = c5975s;
                i15 = 1;
            } else {
                String str5 = business.f3094d + Separators.COMMA + business.f3095e;
                c6021p7.m6524S(1682439768);
                boolean zM6545h2 = c6021p7.m6545h(interfaceC0309z2) | c6021p7.m6542f(str5) | c6021p7.m6542f(str4);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6545h2) {
                    obj = c5975s;
                } else {
                    obj = c5975s;
                    if (objM6514H4 == obj) {
                    }
                    c6021p7.m6553p(r15);
                    InterfaceC10459q interfaceC10459qM11235m2 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10833a.m11209d(c10456n4, r15, str3, (InterfaceC1426a) objM6514H4, 7), 1.0f), 0.0f, f16, 1);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f16), c10450h3, c6021p7, 48);
                    i14 = c6021p7.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p7, interfaceC10459qM11235m2);
                    c6021p.m6528W();
                    if (c6021p7.f19563O) {
                        interfaceC1426a = interfaceC1426a3;
                        c6021p7.m6549l(interfaceC1426a);
                    } else {
                        interfaceC1426a = interfaceC1426a3;
                        c6021p.m6543f0();
                    }
                    c21694h2 = c21694h12;
                    C5997d.m6439Z(c21694h2, c6021p7, c17781r0M19506b);
                    C5997d.m6439Z(c21694h17, c6021p7, interfaceC6008i0M6550m2);
                    if (c6021p7.f19563O && AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                        c21694h3 = c21694h16;
                    } else {
                        c21694h3 = c21694h16;
                        AbstractC0168G.m537z(i14, c6021p7, i14, c21694h3);
                    }
                    C5997d.m6439Z(c21694h15, c6021p7, interfaceC10459qM10923d2);
                    c21694h4 = c21694h15;
                    c21694h16 = c21694h3;
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.pin_location, c6021p7, r15), null, null, 0L, c6021p, 48, 12);
                    AbstractC4124r4.m4768b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12155k, c6021p, 0, 0, 65534);
                    C6021p c6021p8 = c6021p;
                    i15 = 1;
                    c6021p8.m6553p(true);
                    c6021p3 = c6021p8;
                }
                objM6514H4 = new C0155B1(interfaceC0309z2, str5, str4, 3);
                c6021p7.m6537c0(objM6514H4);
                c6021p7.m6553p(r15);
                InterfaceC10459q interfaceC10459qM11235m3 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10833a.m11209d(c10456n4, r15, str3, (InterfaceC1426a) objM6514H4, 7), 1.0f), 0.0f, f16, 1);
                C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f16), c10450h3, c6021p7, 48);
                i14 = c6021p7.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p7, interfaceC10459qM11235m3);
                c6021p.m6528W();
                if (c6021p7.f19563O) {
                    interfaceC1426a = interfaceC1426a3;
                    c6021p7.m6549l(interfaceC1426a);
                } else {
                    interfaceC1426a = interfaceC1426a3;
                    c6021p.m6543f0();
                }
                c21694h2 = c21694h12;
                C5997d.m6439Z(c21694h2, c6021p7, c17781r0M19506b2);
                C5997d.m6439Z(c21694h17, c6021p7, interfaceC6008i0M6550m3);
                if (c6021p7.f19563O) {
                    c21694h3 = c21694h16;
                    AbstractC0168G.m537z(i14, c6021p7, i14, c21694h3);
                } else {
                    c21694h3 = c21694h16;
                    AbstractC0168G.m537z(i14, c6021p7, i14, c21694h3);
                }
                C5997d.m6439Z(c21694h15, c6021p7, interfaceC10459qM10923d3);
                c21694h4 = c21694h15;
                c21694h16 = c21694h3;
                AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.pin_location, c6021p7, r15), null, null, 0L, c6021p, 48, 12);
                AbstractC4124r4.m4768b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12155k, c6021p, 0, 0, 65534);
                C6021p c6021p9 = c6021p;
                i15 = 1;
                c6021p9.m6553p(true);
                c6021p3 = c6021p9;
            }
            c6021p3.m6553p(r15);
            c6021p3.m6524S(-1754040765);
            if (business.f3108r == null || business.f3109s == null) {
                c10450h = c10450h3;
                c21694h5 = c21694h16;
                c21694h6 = c21694h4;
                f11 = f16;
                interfaceC1426a2 = interfaceC1426a;
                c1166t = business;
                c10456n2 = c10456n4;
                C21694h c21694h18 = c21694h2;
                c6021p4 = c6021p3;
                z6 = r15;
                c21694h7 = c21694h17;
                c21694h8 = c21694h18;
            } else {
                c6021p3.m6524S(-1754039319);
                Object objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p3.m6537c0(objM6514H5);
                }
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H5;
                Object objM530s = AbstractC0168G.m530s(-1754035511, c6021p3, r15);
                Object obj2 = objM530s;
                if (objM530s == obj) {
                    Object c0339d = new C0339D(interfaceC5985X, 4);
                    c6021p3.m6537c0(c0339d);
                    obj2 = c0339d;
                }
                c6021p3.m6553p(r15);
                InterfaceC10459q interfaceC10459qM11235m4 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10833a.m11209d(c10456n4, r15, null, (InterfaceC1426a) obj2, 7), 1.0f), 0.0f, f16, i15);
                C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f16), c10450h3, c6021p3, 48);
                int i21 = c6021p3.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p3, interfaceC10459qM11235m4);
                c6021p.m6528W();
                if (c6021p3.f19563O) {
                    c6021p3.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p3, c17781r0M19506b3);
                C5997d.m6439Z(c21694h17, c6021p3, interfaceC6008i0M6550m4);
                if (c6021p3.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i21))) {
                    c21694h11 = c21694h16;
                    AbstractC0168G.m537z(i21, c6021p3, i21, c21694h11);
                } else {
                    c21694h11 = c21694h16;
                }
                C21694h c21694h19 = c21694h4;
                C5997d.m6439Z(c21694h19, c6021p3, interfaceC10459qM10923d4);
                C17785t0 c17785t0 = C17785t0.f56761a;
                f11 = f16;
                c21694h6 = c21694h19;
                C21694h c21694h20 = c21694h11;
                AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.recent, c6021p3, r15), null, null, 0L, c6021p, 48, 12);
                C6021p c6021p10 = c6021p3;
                Object obj3 = obj;
                C21694h c21694h21 = c21694h2;
                InterfaceC1426a interfaceC1426a5 = interfaceC1426a;
                c10450h = c10450h3;
                c10456n2 = c10456n4;
                AbstractC1277s.m1990b(clock2, business, c17785t0.m19513a(c10456n4, 1.0f, true), AbstractC3984T1.m4678F(c6021p).f12155k, c6021p, i20, 0);
                InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(((Boolean) interfaceC5985X.getValue()).booleanValue() ? 180.0f : 0.0f, null, "IconRotationAnimation", c6021p, 3072, 22);
                AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.chevron_down_sm, c6021p10, 0);
                InterfaceC10459q interfaceC10459qM8534c = AbstractC8087f5.m8534c(AbstractC10844c.m11252l(c10456n2, AbstractC7312p.f23186c), ((Number) interfaceC5982V0M15261b.getValue()).floatValue());
                interfaceC1426a2 = interfaceC1426a5;
                c21694h8 = c21694h21;
                z6 = 0;
                c21694h5 = c21694h20;
                obj = obj3;
                c21694h7 = c21694h17;
                C6021p c6021p11 = c6021p10;
                AbstractC3878A1.m4596a(abstractC17140aM8631b, null, interfaceC10459qM8534c, 0L, c6021p, 48, 8);
                c6021p11.m6553p(true);
                c1166t = business;
                AbstractC10831a.m11202e(((Boolean) interfaceC5985X.getValue()).booleanValue(), null, AbstractC13508z.m15012d(null, 15), AbstractC13508z.m15020l(null, 15), null, AbstractC8411c.m8969c(401353288, c6021p11, new C1272n(c1166t, 0)), c6021p, 1600518, 18);
                c6021p4 = c6021p11;
            }
            c6021p4.m6553p(z6);
            c6021p4.m6524S(-1753986492);
            String str6 = c1166t.f3106p;
            if (str6 == null) {
                interfaceC0309z1 = interfaceC0309z2;
                f12 = f11;
                c10450h2 = c10450h;
                c21694h10 = c21694h5;
                z10 = z6;
            } else {
                c6021p4.m6524S(1682518952);
                boolean zM6545h3 = c6021p4.m6545h(interfaceC0309z2) | c6021p4.m6542f(str6);
                Object objM6514H6 = c6021p.m6514H();
                if (zM6545h3 || objM6514H6 == obj) {
                    objM6514H6 = new C1273o(interfaceC0309z2, str6, 0);
                    c6021p4.m6537c0(objM6514H6);
                }
                c6021p4.m6553p(z6);
                float f17 = f11;
                InterfaceC10459q interfaceC10459qM11235m5 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10833a.m11209d(c10456n2, z6, null, (InterfaceC1426a) objM6514H6, 7), 1.0f), 0.0f, f17, 1);
                C17764j c17764jM19500g = AbstractC17770m.m19500g(f17);
                C10450h c10450h4 = c10450h;
                C17781r0 c17781r0M19506b4 = AbstractC17777p0.m19506b(c17764jM19500g, c10450h4, c6021p4, 48);
                int i22 = c6021p4.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11235m5);
                c6021p.m6528W();
                if (c6021p4.f19563O) {
                    c6021p4.m6549l(interfaceC1426a2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h8, c6021p4, c17781r0M19506b4);
                C5997d.m6439Z(c21694h7, c6021p4, interfaceC6008i0M6550m5);
                if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i22))) {
                    c21694h9 = c21694h5;
                    AbstractC0168G.m537z(i22, c6021p4, i22, c21694h9);
                } else {
                    c21694h9 = c21694h5;
                }
                C5997d.m6439Z(c21694h6, c6021p4, interfaceC10459qM10923d5);
                c21694h10 = c21694h9;
                interfaceC0309z1 = interfaceC0309z2;
                c10450h2 = c10450h4;
                f12 = f17;
                AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.external_link, c6021p4, z6 ? 1 : 0), null, null, 0L, c6021p, 48, 12);
                AbstractC4124r4.m4768b(AbstractC21322p.m21688V(AbstractC21322p.m21688V(str6, "http://"), "https://"), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12155k, c6021p, 0, 0, 65534);
                c6021p4.m6553p(true);
                z10 = false;
            }
            c6021p4.m6553p(z10);
            c6021p4.m6524S(-1753959247);
            String str7 = c1166t.f3110t;
            if (str7 == null) {
                f13 = f12;
                z11 = true;
            } else {
                c6021p4.m6524S(1682546154);
                InterfaceC0309z1 interfaceC0309z3 = interfaceC0309z1;
                boolean zM6545h4 = c6021p4.m6545h(interfaceC0309z3) | c6021p4.m6542f(str7);
                Object objM6514H7 = c6021p.m6514H();
                if (zM6545h4 || objM6514H7 == obj) {
                    objM6514H7 = new C1273o(interfaceC0309z3, str7, 1);
                    c6021p4.m6537c0(objM6514H7);
                }
                c6021p4.m6553p(false);
                float f18 = f12;
                InterfaceC10459q interfaceC10459qM11235m6 = AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10833a.m11209d(c10456n2, false, null, (InterfaceC1426a) objM6514H7, 7), 1.0f), 0.0f, f18, 1);
                C17781r0 c17781r0M19506b5 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(f18), c10450h2, c6021p4, 48);
                int i23 = c6021p4.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11235m6);
                c6021p.m6528W();
                if (c6021p4.f19563O) {
                    c6021p4.m6549l(interfaceC1426a2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h8, c6021p4, c17781r0M19506b5);
                C5997d.m6439Z(c21694h7, c6021p4, interfaceC6008i0M6550m6);
                if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i23))) {
                    AbstractC0168G.m537z(i23, c6021p4, i23, c21694h10);
                }
                C5997d.m6439Z(c21694h6, c6021p4, interfaceC10459qM10923d6);
                f13 = f18;
                AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.phone, c6021p4, 0), null, null, 0L, c6021p, 48, 12);
                AbstractC4124r4.m4768b(str7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC3984T1.m4678F(c6021p).f12155k, c6021p, 0, 0, 65534);
                z11 = true;
                c6021p4.m6553p(true);
            }
            c6021p4.m6553p(false);
            AbstractC17758g.m19482b(c6021p4, AbstractC10844c.m11245e(c10456n2, f13));
            c6021p4.m6553p(z11);
            clock3 = clock2;
            interfaceC10459q3 = interfaceC10459q4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(business, interfaceC10459q3, clock3, i10, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1987b(InterfaceC1426a onDismiss, C1166t c1166t, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(-1459029042);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(onDismiss) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c1166t) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C3880A3 c3880a3M4785f = AbstractC4152w2.m4785f(0, 3, c6021p, false);
            if (c1166t != null) {
                AbstractC4152w2.m4780a(onDismiss, c10456n, c3880a3M4785f, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(1470251206, c6021p, new C1272n(c1166t, 1)), c6021p, (i12 & 14) | ((i12 >> 3) & 112), 384, 4088);
            }
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(onDismiss, c1166t, interfaceC10459q2, i10, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v0, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: c */
    public static final void m1988c(List list, InterfaceC10459q interfaceC10459q, Clock clock, C6021p c6021p, int i10) {
        Clock clock2;
        InterfaceC10459q interfaceC10459q2;
        Clock clock3;
        InterfaceC10459q interfaceC10459q3;
        boolean z6;
        boolean z10 = true;
        c6021p.m6526U(-103362479);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6545h(list) ? 4 : 2) | i10 : i10;
        int i12 = i11 | 48;
        if ((i10 & 384) == 0) {
            i12 = i11 | 176;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            clock3 = clock;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            C10456n c10456n = C10456n.f30959Y;
            if (i13 == 0 || c6021p.m6561x()) {
                Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                AbstractC16544l.m18093f(clockSystemDefaultZone, "systemDefaultZone(...)");
                clock2 = clockSystemDefaultZone;
                interfaceC10459q2 = c10456n;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                clock2 = clock;
            }
            c6021p.m6554q();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Integer numValueOf = Integer.valueOf(((C0887A) obj).f2610a);
                Object arrayList = linkedHashMap.get(numValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10449g c10449g = C10444b.f30946y0;
            ?? r10 = 0;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, c10449g, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1014011979);
            int i15 = 0;
            while (i15 < 7) {
                List list2 = (List) linkedHashMap.get(Integer.valueOf(i15));
                if (list2 == null) {
                    list2 = C17689w.f56480Y;
                }
                List<C0887A> list3 = list2;
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, r10);
                int i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i2);
                } else {
                    c6021p.m6543f0();
                }
                C21694h c21694h2 = C21698j.f68873f;
                C5997d.m6439Z(c21694h2, c6021p, c17781r0M19506b);
                C21694h c21694h3 = C21698j.f68872e;
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                C21694h c21694h4 = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h4);
                }
                C21694h c21694h5 = C21698j.f68871d;
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d2);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n, AbstractC7312p.f23186c + AbstractC7313q.f23199d));
                int i17 = AbstractC1277s.f3400a;
                AbstractC16544l.m18094g(clock2, "clock");
                int i18 = i15 + 1;
                String str = LocalDateTime.now(clock2).mo16841c().mo16819k(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(i18))).format(DateTimeFormatter.ofPattern("EEEE"));
                AbstractC16544l.m18093f(str, "format(...)");
                C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                C10449g c10449g2 = c10449g;
                Clock clock4 = clock2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                InterfaceC10459q interfaceC10459q4 = interfaceC10459q2;
                C10456n c10456n2 = c10456n;
                AbstractC4124r4.m4768b(str, AbstractC10844c.m11256p(c10456n, f3386b), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, 48, 0, 65532);
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g2, c6021p, 0);
                int i19 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n2);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a2);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m3);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i19))) {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h4);
                }
                C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d3);
                c6021p.m6524S(510220286);
                if (list3.isEmpty()) {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.business_closed, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, 0, 0, 65534);
                    z6 = false;
                } else {
                    z6 = false;
                }
                c6021p.m6553p(z6);
                c6021p.m6524S(510229470);
                for (C0887A c0887a : list3) {
                    int i20 = c0887a.f2610a;
                    String hour1 = c0887a.f2611b;
                    AbstractC16544l.m18094g(hour1, "hour1");
                    String hour2 = c0887a.f2612c;
                    AbstractC16544l.m18094g(hour2, "hour2");
                    LocalDate localDateMo16819k = LocalDateTime.now(clock4).mo16841c().mo16819k(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(i20 + 1)));
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("hh:mm a");
                    AbstractC4124r4.m4768b(AbstractC9306j0.m9890i(LocalDateTime.m16830of(localDateMo16819k, LocalTime.parse(hour1, DateTimeFormatter.ofPattern("HHmm"))).format(dateTimeFormatterOfPattern), " - ", LocalDateTime.m16830of(localDateMo16819k, LocalTime.parse(hour2, DateTimeFormatter.ofPattern("HHmm"))).format(dateTimeFormatterOfPattern)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65534);
                }
                AbstractC3794B0.m4471F(c6021p, z6, true, true);
                r10 = z6;
                z10 = true;
                i15 = i18;
                c10456n = c10456n2;
                c10449g = c10449g2;
                clock2 = clock4;
                linkedHashMap = linkedHashMap2;
                interfaceC10459q2 = interfaceC10459q4;
            }
            c6021p.m6553p(r10);
            c6021p.m6553p(z10);
            clock3 = clock2;
            interfaceC10459q3 = interfaceC10459q2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(list, interfaceC10459q3, clock3, i10, 9);
        }
    }
}
