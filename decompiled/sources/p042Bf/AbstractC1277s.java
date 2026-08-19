package p042Bf;

import android.gov.nist.core.Separators;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0184L0;
import p003A1.C0257i0;
import p003A1.InterfaceC0309z1;
import p033B5.InterfaceC0832p;
import p040Bd.C0887A;
import p040Bd.C1166t;
import p049Bm.InterfaceC1426a;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3587c;
import p204I1.C3590f;
import p229J0.AbstractC3924I;
import p229J0.AbstractC3943L0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p229J0.C4156x0;
import p349O0.AbstractC6012k0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8142m4;
import p537W0.C8410b;
import p579Xh.InterfaceC9514a;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p817j$.time.Clock;
import p817j$.time.DayOfWeek;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.LocalTime;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.temporal.TemporalAdjusters;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17790w;

/* JADX INFO: renamed from: Bf.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1277s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3400a = 0;

    static {
        new C1166t(AbstractC17681o.m19382k("Burgers", "Asian", "New American"), AbstractC17681o.m19382k(new C0887A(1), new C0887A(2), new C0887A(3), new C0887A(4), new C0887A(5), new C0887A(6), new C0887A(0)), new C0887A(2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m1989a(C1166t business, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object obj;
        InterfaceC0309z1 interfaceC0309z1;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(business, "business");
        c6021p.m6526U(-1371516319);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(business) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            InterfaceC0309z1 interfaceC0309z2 = (InterfaceC0309z1) c6021p.m6548k(AbstractC0187M0.f714p);
            String str = business.f3094d + Separators.COMMA + business.f3095e;
            c6021p.m6524S(-495352865);
            boolean zM6545h = c6021p.m6545h(interfaceC0309z2) | c6021p.m6542f(str);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (zM6545h || objM6514H == obj2) {
                objM6514H = new C1273o(interfaceC0309z2, str, 2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H;
            c6021p.m6553p(false);
            C8410b c8410b = AbstractC1257C.f3329a;
            C8410b c8410b2 = AbstractC1257C.f3330b;
            float f10 = AbstractC3924I.f12062a;
            AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
            C4156x0 c4156x0M4627a = AbstractC3924I.m4627a((C3949M0) c6021p.m6548k(abstractC6012k0));
            AbstractC3943L0.m4643a(interfaceC1426a2, c8410b, null, false, c8410b2, null, null, c4156x0M4627a.m4786a(((C3949M0) c6021p.m6548k(abstractC6012k0)).f12213a, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12215b, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12215b, c4156x0M4627a.f13468d, c4156x0M4627a.f13469e, c4156x0M4627a.f13470f, c4156x0M4627a.f13471g, c4156x0M4627a.f13472h), null, null, null, c6021p, 24624, 0, 1900);
            c6021p.m6524S(-495330649);
            String str2 = business.f3106p;
            if (str2 != null) {
                c6021p.m6524S(-495328402);
                boolean zM6545h2 = c6021p.m6545h(interfaceC0309z2) | c6021p.m6542f(str2);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h2 || objM6514H2 == obj2) {
                    objM6514H2 = new C1273o(interfaceC0309z2, str2, 3);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                obj = obj2;
                interfaceC0309z1 = interfaceC0309z2;
                AbstractC3943L0.m4643a((InterfaceC1426a) objM6514H2, AbstractC1257C.f3331c, null, false, null, null, null, null, null, null, null, c6021p, 48, 0, 2044);
            } else {
                obj = obj2;
                interfaceC0309z1 = interfaceC0309z2;
            }
            r15.m6553p(false);
            r15.m6524S(-495322239);
            String str3 = business.f3110t;
            if (str3 != null) {
                c6021p.m6524S(-495320144);
                InterfaceC0309z1 interfaceC0309z3 = interfaceC0309z1;
                boolean zM6545h3 = c6021p.m6545h(interfaceC0309z3) | c6021p.m6542f(str3);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6545h3 || objM6514H3 == obj) {
                    objM6514H3 = new C1273o(interfaceC0309z3, str3, 4);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                AbstractC3943L0.m4643a((InterfaceC1426a) objM6514H3, AbstractC1257C.f3332d, null, false, null, null, null, null, null, null, null, c6021p, 48, 0, 2044);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(business, interfaceC10459q2, i10, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x018c  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m1990b(Clock clock, C1166t business, InterfaceC10459q interfaceC10459q, C3582M c3582m, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC10459q interfaceC10459q4;
        C3587c c3587c;
        Boolean bool;
        C3590f c3590fM4297i;
        InterfaceC10459q interfaceC10459q5;
        C0887A c0887a;
        boolean zBooleanValue;
        int iM4296h;
        String str;
        LocalDate localDateMo16841c;
        LocalDate localDateMo16819k;
        LocalDateTime localDateTimeM16830of;
        String str2;
        int iM4296h2;
        C6018n0 c6018n0M6555r;
        int i13;
        AbstractC16544l.m18094g(clock, "clock");
        AbstractC16544l.m18094g(business, "business");
        c6021p.m6526U(-674851431);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(clock) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(business) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if (c6021p.m6542f(c3582m)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                c6021p.m6519N();
                if ((i10 & 1) != 0 || c6021p.m6561x()) {
                    if (i14 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    interfaceC10459q4 = interfaceC10459q3;
                } else {
                    c6021p.m6517L();
                    interfaceC10459q4 = interfaceC10459q2;
                }
                c6021p.m6554q();
                c6021p.m6524S(-1534725366);
                c3587c = new C3587c();
                c6021p.m6524S(-1534721745);
                bool = business.f3108r;
                if (bool != null && (c0887a = business.f3109s) != null) {
                    zBooleanValue = bool.booleanValue();
                    if (zBooleanValue) {
                        c6021p.m6524S(1550891904);
                        iM4296h2 = c3587c.m4296h(new C3573D(AbstractC7302f.f23125a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            c3587c.m4291c(AbstractC8142m4.m8676d(R.string.business_open, c6021p));
                            c3587c.m4293e(iM4296h2);
                            c6021p.m6553p(false);
                        } catch (Throwable th2) {
                            c3587c.m4293e(iM4296h2);
                            throw th2;
                        }
                    } else if (zBooleanValue) {
                        c6021p.m6524S(1551205128);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1551052856);
                        iM4296h = c3587c.m4296h(new C3573D(AbstractC7302f.f23133i, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            c3587c.m4291c(AbstractC8142m4.m8676d(R.string.business_closed, c6021p));
                            c3587c.m4293e(iM4296h);
                            c6021p.m6553p(false);
                        } catch (Throwable th3) {
                            c3587c.m4293e(iM4296h);
                            throw th3;
                        }
                    }
                    c3587c.f10925Y.append(' ');
                    if (bool.booleanValue()) {
                        str = c0887a.f2612c;
                    } else {
                        str = c0887a.f2611b;
                    }
                    LocalTime localTime = LocalTime.parse(str, DateTimeFormatter.ofPattern("HHmm"));
                    localDateMo16841c = LocalDateTime.now(clock).mo16841c();
                    localDateMo16819k = localDateMo16841c.mo16819k(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(c0887a.f2610a + 1)));
                    localDateTimeM16830of = LocalDateTime.m16830of(localDateMo16819k, localTime);
                    if (localDateMo16841c.equals(localDateMo16819k)) {
                        str2 = localDateTimeM16830of.format(DateTimeFormatter.ofPattern("hh:mm a"));
                        AbstractC16544l.m18091d(str2);
                    } else {
                        str2 = localDateTimeM16830of.format(DateTimeFormatter.ofPattern("EEE hh:mm a"));
                        AbstractC16544l.m18091d(str2);
                    }
                    c3587c.m4291c(AbstractC8142m4.m8677e(R.string.business_time, new Object[]{str2}, c6021p));
                }
                c6021p.m6553p(false);
                c3590fM4297i = c3587c.m4297i();
                c6021p.m6553p(false);
                if (c3590fM4297i.f10934Y.length() > 0) {
                    AbstractC4124r4.m4769c(c3590fM4297i, interfaceC10459q4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3582m, c6021p, (i12 >> 3) & 112, (i12 << 12) & 29360128, 131068);
                }
                interfaceC10459q5 = interfaceC10459q4;
            } else {
                c6021p.m6517L();
                interfaceC10459q5 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1275q(clock, business, interfaceC10459q5, c3582m, i10, i11, 0);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 3072) == 0) {
            if (c6021p.m6542f(c3582m)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                interfaceC10459q4 = interfaceC10459q3;
            }
            c6021p.m6554q();
            c6021p.m6524S(-1534725366);
            c3587c = new C3587c();
            c6021p.m6524S(-1534721745);
            bool = business.f3108r;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                if (zBooleanValue) {
                    c6021p.m6524S(1550891904);
                    iM4296h2 = c3587c.m4296h(new C3573D(AbstractC7302f.f23125a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    c3587c.m4291c(AbstractC8142m4.m8676d(R.string.business_open, c6021p));
                    c3587c.m4293e(iM4296h2);
                    c6021p.m6553p(false);
                } else if (zBooleanValue) {
                    c6021p.m6524S(1551052856);
                    iM4296h = c3587c.m4296h(new C3573D(AbstractC7302f.f23133i, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    c3587c.m4291c(AbstractC8142m4.m8676d(R.string.business_closed, c6021p));
                    c3587c.m4293e(iM4296h);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1551205128);
                    c6021p.m6553p(false);
                }
                c3587c.f10925Y.append(' ');
                if (bool.booleanValue()) {
                    str = c0887a.f2612c;
                } else {
                    str = c0887a.f2611b;
                }
                LocalTime localTime2 = LocalTime.parse(str, DateTimeFormatter.ofPattern("HHmm"));
                localDateMo16841c = LocalDateTime.now(clock).mo16841c();
                localDateMo16819k = localDateMo16841c.mo16819k(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(c0887a.f2610a + 1)));
                localDateTimeM16830of = LocalDateTime.m16830of(localDateMo16819k, localTime2);
                if (localDateMo16841c.equals(localDateMo16819k)) {
                    str2 = localDateTimeM16830of.format(DateTimeFormatter.ofPattern("hh:mm a"));
                    AbstractC16544l.m18091d(str2);
                } else {
                    str2 = localDateTimeM16830of.format(DateTimeFormatter.ofPattern("EEE hh:mm a"));
                    AbstractC16544l.m18091d(str2);
                }
                c3587c.m4291c(AbstractC8142m4.m8677e(R.string.business_time, new Object[]{str2}, c6021p));
            }
            c6021p.m6553p(false);
            c3590fM4297i = c3587c.m4297i();
            c6021p.m6553p(false);
            if (c3590fM4297i.f10934Y.length() > 0) {
                AbstractC4124r4.m4769c(c3590fM4297i, interfaceC10459q4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3582m, c6021p, (i12 >> 3) & 112, (i12 << 12) & 29360128, 131068);
            }
            interfaceC10459q5 = interfaceC10459q4;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                if (i14 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                interfaceC10459q4 = interfaceC10459q3;
            }
            c6021p.m6554q();
            c6021p.m6524S(-1534725366);
            c3587c = new C3587c();
            c6021p.m6524S(-1534721745);
            bool = business.f3108r;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                if (zBooleanValue) {
                    c6021p.m6524S(1550891904);
                    iM4296h2 = c3587c.m4296h(new C3573D(AbstractC7302f.f23125a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    c3587c.m4291c(AbstractC8142m4.m8676d(R.string.business_open, c6021p));
                    c3587c.m4293e(iM4296h2);
                    c6021p.m6553p(false);
                } else if (zBooleanValue) {
                    c6021p.m6524S(1551052856);
                    iM4296h = c3587c.m4296h(new C3573D(AbstractC7302f.f23133i, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    c3587c.m4291c(AbstractC8142m4.m8676d(R.string.business_closed, c6021p));
                    c3587c.m4293e(iM4296h);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1551205128);
                    c6021p.m6553p(false);
                }
                c3587c.f10925Y.append(' ');
                if (bool.booleanValue()) {
                    str = c0887a.f2612c;
                } else {
                    str = c0887a.f2611b;
                }
                LocalTime localTime3 = LocalTime.parse(str, DateTimeFormatter.ofPattern("HHmm"));
                localDateMo16841c = LocalDateTime.now(clock).mo16841c();
                localDateMo16819k = localDateMo16841c.mo16819k(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(c0887a.f2610a + 1)));
                localDateTimeM16830of = LocalDateTime.m16830of(localDateMo16819k, localTime3);
                if (localDateMo16841c.equals(localDateMo16819k)) {
                    str2 = localDateTimeM16830of.format(DateTimeFormatter.ofPattern("hh:mm a"));
                    AbstractC16544l.m18091d(str2);
                } else {
                    str2 = localDateTimeM16830of.format(DateTimeFormatter.ofPattern("EEE hh:mm a"));
                    AbstractC16544l.m18091d(str2);
                }
                c3587c.m4291c(AbstractC8142m4.m8677e(R.string.business_time, new Object[]{str2}, c6021p));
            }
            c6021p.m6553p(false);
            c3590fM4297i = c3587c.m4297i();
            c6021p.m6553p(false);
            if (c3590fM4297i.f10934Y.length() > 0) {
                AbstractC4124r4.m4769c(c3590fM4297i, interfaceC10459q4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3582m, c6021p, (i12 >> 3) & 112, (i12 << 12) & 29360128, 131068);
            }
            interfaceC10459q5 = interfaceC10459q4;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(clock, business, interfaceC10459q5, c3582m, i10, i11, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1991c(C1166t business, InterfaceC10459q interfaceC10459q, C3582M c3582m, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        AbstractC16544l.m18094g(business, "business");
        c6021p.m6526U(730134460);
        int i11 = ((i10 & 6) == 0 ? (c6021p.m6542f(business) ? 4 : 2) | i10 : i10) | 48;
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(c3582m) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                interfaceC10459q2 = C10456n.f30959Y;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
            }
            c6021p.m6554q();
            c6021p.m6524S(1545412036);
            C3587c c3587c = new C3587c();
            c6021p.m6524S(1545413382);
            Double d10 = business.f3102l;
            if (d10 != null) {
                c3587c.m4291c(String.format(Locale.getDefault(), "%.1f ", Arrays.copyOf(new Object[]{d10}, 1)));
                int iM4296h = c3587c.m4296h(new C3573D(AbstractC7302f.f23135k, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    c3587c.m4291c("★");
                    c3587c.m4293e(iM4296h);
                    Integer num = business.f3103m;
                    if (num != null) {
                        c6021p.m6524S(428296829);
                        long jM7772a = AbstractC7302f.m7772a(c6021p);
                        c6021p.m6553p(false);
                        int iM4296h2 = c3587c.m4296h(new C3573D(jM7772a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            c3587c.m4291c(" (" + num + Separators.RPAREN);
                            c3587c.m4293e(iM4296h2);
                        } catch (Throwable th2) {
                            c3587c.m4293e(iM4296h2);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    c3587c.m4293e(iM4296h);
                    throw th3;
                }
            }
            c6021p.m6553p(false);
            List list = business.f3105o;
            String str = list != null ? (String) AbstractC17680n.m19343S(list) : null;
            StringBuilder sb2 = c3587c.f10925Y;
            if (str != null) {
                if (sb2.length() > 0) {
                    c3587c.m4291c(" · ");
                }
                c3587c.m4291c(str);
            }
            c6021p.m6524S(1545436117);
            Integer num2 = business.f3104n;
            if (num2 != null) {
                if (sb2.length() > 0) {
                    c3587c.m4291c(" · ");
                }
                for (int i12 = 1; i12 < 5; i12++) {
                    try {
                        String symbol = Currency.getInstance(Locale.getDefault()).getSymbol();
                        AbstractC16544l.m18093f(symbol, "getSymbol(...)");
                        c3587c.m4291c(symbol);
                    } catch (IllegalArgumentException unused) {
                        c3587c.m4291c("$");
                    }
                    c6021p.m6524S(256816258);
                    if (i12 == num2.intValue()) {
                        int i13 = AbstractC7302f.f23136l;
                        c6021p.m6524S(428296829);
                        long jM7772a2 = AbstractC7302f.m7772a(c6021p);
                        c6021p.m6553p(false);
                        c3587c.m4296h(new C3573D(jM7772a2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    }
                    c6021p.m6553p(false);
                }
            }
            c6021p.m6553p(false);
            C3590f c3590fM4297i = c3587c.m4297i();
            c6021p.m6553p(false);
            if (c3590fM4297i.f10934Y.length() > 0) {
                AbstractC4124r4.m4769c(c3590fM4297i, interfaceC10459q2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3582m, c6021p, i11 & 112, (i11 << 15) & 29360128, 131068);
            }
            interfaceC10459q3 = interfaceC10459q2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(business, interfaceC10459q3, c3582m, i10, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088 A[PHI: r2 r3
      0x0088: PHI (r2v12 int) = (r2v7 int), (r2v7 int), (r2v13 int) binds: [B:50:0x0090, B:44:0x0084, B:45:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r3v8 a1.q) = (r3v3 a1.q), (r3v2 a1.q), (r3v2 a1.q) binds: [B:50:0x0090, B:44:0x0084, B:45:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01be  */
    /* JADX WARN: Code duplicated, block: B:93:0x023b  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v0 O0.p, new type: O0.p
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX INFO: renamed from: d */
    public static final void m1992d(C1166t business, InterfaceC10459q interfaceC10459q, Clock clock, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        Clock clock2;
        int i13;
        C10456n c10456n;
        Clock clock3;
        int i14;
        C21696i c21696i;
        C21694h c21694h;
        String str;
        int i15;
        C21696i c21696i2;
        C21694h c21694h2;
        InterfaceC10459q interfaceC10459q3;
        Clock clock4;
        Iterator it;
        Object next;
        Object objM19235b;
        InterfaceC9514a interfaceC9514a;
        InterfaceC0832p interfaceC0832pMo3165c;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(business, "business");
        c6021p.m6526U(-77843393);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(business) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) == 0) {
                    clock2 = clock;
                    int i17 = c6021p.m6545h(clock2) ? 256 : 128;
                    i12 |= i17;
                } else {
                    clock2 = clock;
                }
                i12 |= i17;
            } else {
                clock2 = clock;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i13 = i10 & 1;
                c10456n = C10456n.f30959Y;
                if (i13 != 0 || c6021p.m6561x()) {
                    if (i16 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    if ((i11 & 4) != 0) {
                        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                        AbstractC16544l.m18093f(clockSystemDefaultZone, "systemDefaultZone(...)");
                        i12 &= -897;
                        clock3 = clockSystemDefaultZone;
                    }
                    c6021p.m6554q();
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
                    i14 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                        AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(-449442553);
                    str = business.f3100j;
                    if (str != null) {
                        String strM8676d = AbstractC8142m4.m8676d(R.string.business_image_description, c6021p);
                        C21088i c21088i = C21089j.f67011Z;
                        c6021p.m6524S(617413469);
                        it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!(next instanceof InterfaceC9514a));
                        if (next != null) {
                            objM19235b = (InterfaceC9514a) next;
                            c6021p.m6553p(false);
                        } else {
                            objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                            c6021p.m6553p(false);
                        }
                        interfaceC9514a = (InterfaceC9514a) objM19235b;
                        if (interfaceC9514a != null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                            throw new IllegalStateException("No ImageLoader");
                        }
                        AbstractC7881F0.m8164c(str, strM8676d, interfaceC0832pMo3165c, AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10456n, 60), ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13379c), c21088i, c6021p, 12582912, 3952);
                    }
                    c6021p.m6553p(r14);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    i15 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i2 = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i2);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                    c21694h2 = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                    C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                    AbstractC4124r4.m4768b(business.f3096f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12153i, c6021p, 0, 0, 65534);
                    m1991c(business, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, i12 & 14);
                    m1990b(clock3, business, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, ((i12 >> 6) & 14) | ((i12 << 3) & 112), 4);
                    c6021p.m6553p(true);
                    c6021p.m6553p(true);
                    interfaceC10459q3 = interfaceC10459q2;
                    clock4 = clock3;
                } else {
                    c6021p.m6517L();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                clock3 = clock2;
                c6021p.m6554q();
                C17756f c17756f2 = AbstractC17770m.f56724a;
                C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                } else {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                c6021p.m6524S(-449442553);
                str = business.f3100j;
                if (str != null) {
                    String strM8676d2 = AbstractC8142m4.m8676d(R.string.business_image_description, c6021p);
                    C21088i c21088i2 = C21089j.f67011Z;
                    c6021p.m6524S(617413469);
                    it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(next instanceof InterfaceC9514a));
                    if (next != null) {
                        objM19235b = (InterfaceC9514a) next;
                        c6021p.m6553p(false);
                    } else {
                        objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                        c6021p.m6553p(false);
                    }
                    interfaceC9514a = (InterfaceC9514a) objM19235b;
                    if (interfaceC9514a != null) {
                    }
                    throw new IllegalStateException("No ImageLoader");
                }
                c6021p.m6553p(r14);
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                c21696i2 = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h2 = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                C5984W0 c5984w1 = AbstractC3947L4.f12183a;
                AbstractC4124r4.m4768b(business.f3096f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w1)).f12153i, c6021p, 0, 0, 65534);
                m1991c(business, null, ((C3941K4) c6021p.m6548k(c5984w1)).f12155k, c6021p, i12 & 14);
                m1990b(clock3, business, null, ((C3941K4) c6021p.m6548k(c5984w1)).f12155k, c6021p, ((i12 >> 6) & 14) | ((i12 << 3) & 112), 4);
                c6021p.m6553p(true);
                c6021p.m6553p(true);
                interfaceC10459q3 = interfaceC10459q2;
                clock4 = clock3;
            } else {
                c6021p.m6517L();
                interfaceC10459q3 = interfaceC10459q2;
                clock4 = clock2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r(business, interfaceC10459q3, clock4, i10, i11, 0);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                clock2 = clock;
                if (c6021p.m6545h(clock2)) {
                }
                i12 |= i17;
            } else {
                clock2 = clock;
            }
            i12 |= i17;
        } else {
            clock2 = clock;
        }
        if ((i12 & 147) == 146) {
            c6021p.m6519N();
            i13 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i13 != 0) {
                if (i16 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    Clock clockSystemDefaultZone2 = Clock.systemDefaultZone();
                    AbstractC16544l.m18093f(clockSystemDefaultZone2, "systemDefaultZone(...)");
                    i12 &= -897;
                    clock3 = clockSystemDefaultZone2;
                } else {
                    clock3 = clock2;
                }
            } else {
                if (i16 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    Clock clockSystemDefaultZone3 = Clock.systemDefaultZone();
                    AbstractC16544l.m18093f(clockSystemDefaultZone3, "systemDefaultZone(...)");
                    i12 &= -897;
                    clock3 = clockSystemDefaultZone3;
                } else {
                    clock3 = clock2;
                }
            }
            c6021p.m6554q();
            C17756f c17756f3 = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b3);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
            c6021p.m6524S(-449442553);
            str = business.f3100j;
            if (str != null) {
                String strM8676d3 = AbstractC8142m4.m8676d(R.string.business_image_description, c6021p);
                C21088i c21088i3 = C21089j.f67011Z;
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof InterfaceC9514a));
                if (next != null) {
                    objM19235b = (InterfaceC9514a) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(false);
                }
                interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a != null) {
                }
                throw new IllegalStateException("No ImageLoader");
            }
            c6021p.m6553p(r14);
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            c21696i2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i2);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a3);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            c21694h2 = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            C5984W0 c5984w2 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(business.f3096f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w2)).f12153i, c6021p, 0, 0, 65534);
            m1991c(business, null, ((C3941K4) c6021p.m6548k(c5984w2)).f12155k, c6021p, i12 & 14);
            m1990b(clock3, business, null, ((C3941K4) c6021p.m6548k(c5984w2)).f12155k, c6021p, ((i12 >> 6) & 14) | ((i12 << 3) & 112), 4);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            interfaceC10459q3 = interfaceC10459q2;
            clock4 = clock3;
        } else {
            c6021p.m6519N();
            i13 = i10 & 1;
            c10456n = C10456n.f30959Y;
            if (i13 != 0) {
                if (i16 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    Clock clockSystemDefaultZone4 = Clock.systemDefaultZone();
                    AbstractC16544l.m18093f(clockSystemDefaultZone4, "systemDefaultZone(...)");
                    i12 &= -897;
                    clock3 = clockSystemDefaultZone4;
                } else {
                    clock3 = clock2;
                }
            } else {
                if (i16 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                if ((i11 & 4) != 0) {
                    Clock clockSystemDefaultZone5 = Clock.systemDefaultZone();
                    AbstractC16544l.m18093f(clockSystemDefaultZone5, "systemDefaultZone(...)");
                    i12 &= -897;
                    clock3 = clockSystemDefaultZone5;
                } else {
                    clock3 = clock2;
                }
            }
            c6021p.m6554q();
            C17756f c17756f4 = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b4 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30943v0, c6021p, 0);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b4);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            c6021p.m6524S(-449442553);
            str = business.f3100j;
            if (str != null) {
                String strM8676d4 = AbstractC8142m4.m8676d(R.string.business_image_description, c6021p);
                C21088i c21088i4 = C21089j.f67011Z;
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof InterfaceC9514a));
                if (next != null) {
                    objM19235b = (InterfaceC9514a) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(false);
                }
                interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a != null) {
                }
                throw new IllegalStateException("No ImageLoader");
            }
            c6021p.m6553p(r14);
            C17790w c17790wM19515a4 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m8 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d8 = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            c21696i2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i2);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a4);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m8);
            c21694h2 = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h2);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d8);
            C5984W0 c5984w3 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(business.f3096f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w3)).f12153i, c6021p, 0, 0, 65534);
            m1991c(business, null, ((C3941K4) c6021p.m6548k(c5984w3)).f12155k, c6021p, i12 & 14);
            m1990b(clock3, business, null, ((C3941K4) c6021p.m6548k(c5984w3)).f12155k, c6021p, ((i12 >> 6) & 14) | ((i12 << 3) & 112), 4);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            interfaceC10459q3 = interfaceC10459q2;
            clock4 = clock3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(business, interfaceC10459q3, clock4, i10, i11, 0);
        }
    }
}
