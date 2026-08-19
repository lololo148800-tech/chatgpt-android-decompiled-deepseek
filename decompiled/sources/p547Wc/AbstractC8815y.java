package p547Wc;

import ai.AbstractC10620k;
import androidx.compose.foundation.layout.AbstractC10844c;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p229J0.C4041e;
import p324Mn.C5554x;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p492U1.InterfaceC7537b;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13481T;
import p758g0.AbstractC13758e;
import p758g0.C13796x;
import p817j$.time.LocalDate;
import p881m0.AbstractC17136m;
import p881m0.C17126c;
import p881m0.C17133j;
import p881m0.C17138o;
import p881m0.InterfaceC17137n;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p936p0.AbstractC18283w;
import p936p0.C18280t;

/* JADX INFO: renamed from: Wc.y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8815y {

    /* JADX INFO: renamed from: a */
    public static final int f26995a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f26996b;

    /* JADX INFO: renamed from: c */
    public static final List f26997c;

    static {
        int year = AbstractC10620k.m10992h().f18006Y.getYear() - 100;
        f26995a = year;
        C3508g c3508g = new C3508g(year, AbstractC10620k.m10992h().f18006Y.getYear(), 1);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508g, 10));
        C3507f it = c3508g.iterator();
        while (it.f10596o0) {
            arrayList.add(String.valueOf(it.mo4199a()));
        }
        f26996b = arrayList;
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        AbstractC16544l.m18093f(shortMonths, "getShortMonths(...)");
        f26997c = AbstractC17678l.m19291N(shortMonths);
    }

    /* JADX INFO: renamed from: a */
    public static final void m9537a(C5554x selectedDate, InterfaceC1436k onValueChange, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(selectedDate, "selectedDate");
        AbstractC16544l.m18094g(onValueChange, "onValueChange");
        c6021p.m6526U(1093548187);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(selectedDate) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onValueChange) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q, 1.0f);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
            int i12 = c6021p.f19564P;
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(C17785t0.f56761a.m19513a(c10456n, 1.0f, true), 1.0f);
            int i13 = AbstractC10620k.f31511a;
            DateFormat dateInstance = DateFormat.getDateInstance(3);
            AbstractC16544l.m18092e(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            AbstractC16544l.m18091d(pattern);
            String lowerCase = pattern.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
            if (AbstractC21322p.m21678L(lowerCase, 'm', 0, false, 6) < AbstractC21322p.m21678L(pattern, 'd', 0, false, 6)) {
                c6021p.m6524S(1676757028);
                int i14 = i11 & 126;
                m9539c(selectedDate, onValueChange, interfaceC10459qM11243c, c6021p, i14);
                m9538b(selectedDate, onValueChange, interfaceC10459qM11243c, c6021p, i14);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(1676906820);
                int i15 = i11 & 126;
                m9538b(selectedDate, onValueChange, interfaceC10459qM11243c, c6021p, i15);
                m9539c(selectedDate, onValueChange, interfaceC10459qM11243c, c6021p, i15);
                c6021p.m6553p(false);
            }
            m9541e(selectedDate, onValueChange, interfaceC10459qM11243c, c6021p, i11 & 126);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8809s(selectedDate, onValueChange, interfaceC10459q, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9538b(C5554x c5554x, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1650617993);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c5554x) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int year = c5554x.f18006Y.getYear();
            LocalDate localDate = c5554x.f18006Y;
            int monthValue = localDate.getMonthValue();
            int i12 = AbstractC10620k.f31511a;
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, monthValue - 1, 1);
            C3508g c3508g = new C3508g(1, calendar.getActualMaximum(5), 1);
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508g, 10));
            C3507f it = c3508g.iterator();
            while (it.f10596o0) {
                arrayList.add(String.valueOf(it.mo4199a()));
            }
            c6021p.m6524S(1108528139);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6429P(m9542f(arrayList.size()));
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            int iM9542f = m9542f(arrayList.size()) - ((C5996c0) objM6514H).m6412g();
            int dayOfMonth = (localDate.getDayOfMonth() - 3) + m9542f(arrayList.size());
            c6021p.m6524S(1108537001);
            boolean zM6545h = c6021p.m6545h(c5554x) | ((i11 & 112) == 32);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == c5975s) {
                objM6514H2 = new C8810t(c5554x, interfaceC1436k, 0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            m9540d(arrayList, iM9542f, dayOfMonth, (InterfaceC1436k) objM6514H2, interfaceC10459q, c6021p, (i11 << 6) & 57344);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8809s(c5554x, interfaceC1436k, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9539c(C5554x c5554x, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1687743909);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c5554x) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int monthValue = c5554x.f18006Y.getMonthValue() - 3;
            List list = f26997c;
            int iM9542f = m9542f(list.size()) + monthValue;
            c6021p.m6524S(250775521);
            boolean zM6545h = c6021p.m6545h(c5554x) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C8810t(c5554x, interfaceC1436k, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            m9540d(list, 0, iM9542f, (InterfaceC1436k) objM6514H, interfaceC10459q, c6021p, ((i11 << 6) & 57344) | 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8809s(c5554x, interfaceC1436k, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9540d(List list, int i10, int i11, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i12) {
        int i13;
        c6021p.m6526U(-1550342667);
        if ((i12 & 6) == 0) {
            i13 = (c6021p.m6545h(list) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= c6021p.m6538d(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i14 = i13;
        if ((i14 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C18280t c18280tM19827a = AbstractC18283w.m19827a(i11, c6021p, (i14 >> 6) & 14, 2);
            C17138o c17138o = C17138o.f54800Z;
            boolean zM6542f = c6021p.m6542f(c18280tM19827a);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C17126c(c18280tM19827a, c17138o);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC17137n interfaceC17137n = (InterfaceC17137n) objM6514H;
            float f10 = AbstractC17136m.f54799a;
            Object obj2 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            C13796x c13796xM15000a = AbstractC13481T.m15000a(c6021p);
            boolean zM6542f2 = c6021p.m6542f(obj2) | c6021p.m6542f(interfaceC17137n) | c6021p.m6542f(c13796xM15000a);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C17133j(interfaceC17137n, c13796xM15000a, AbstractC13758e.m15254s(0.0f, 400.0f, null, 5));
                c6021p.m6537c0(objM6514H2);
            }
            C17133j c17133j = (C17133j) objM6514H2;
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(1775551124);
            boolean zM6542f3 = c6021p.m6542f(c18280tM19827a) | c6021p.m6542f(c17133j);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C8812v(c18280tM19827a, c17133j, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17296c);
            C10449g c10449g = C10444b.f30947z0;
            c6021p.m6524S(1775560493);
            boolean zM6545h = ((i14 & 112) == 32) | c6021p.m6545h(list) | c6021p.m6542f(c18280tM19827a) | ((i14 & 7168) == 2048);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == obj) {
                Object c4041e = new C4041e(i10, list, c18280tM19827a, interfaceC1436k, 2);
                c6021p.m6537c0(c4041e);
                objM6514H4 = c4041e;
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(interfaceC10459q, c18280tM19827a, null, false, null, c10449g, c17133j, false, (InterfaceC1436k) objM6514H4, c6021p, ((i14 >> 12) & 14) | 196608, 156);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8814x(list, i10, i11, interfaceC1436k, interfaceC10459q, i12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9541e(C5554x c5554x, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1221609812);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c5554x) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            ArrayList arrayList = f26996b;
            int iM9542f = m9542f(arrayList.size()) + ((c5554x.f18006Y.getYear() - f26995a) - 2);
            c6021p.m6524S(-896937590);
            boolean zM6545h = c6021p.m6545h(c5554x) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C8810t(c5554x, interfaceC1436k, 2);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            m9540d(arrayList, 0, iM9542f, (InterfaceC1436k) objM6514H, interfaceC10459q, c6021p, ((i11 << 6) & 57344) | 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8809s(c5554x, interfaceC1436k, interfaceC10459q, i10, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m9542f(int i10) {
        int i11 = 1073741823 % i10;
        return i11 < i10 / 2 ? 1073741823 - i11 : (i10 + 1073741823) - i11;
    }

    /* JADX INFO: renamed from: g */
    public static C5554x m9543g(C5554x c5554x, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = c5554x.f18006Y.getYear();
        }
        if ((i13 & 2) != 0) {
            i11 = c5554x.f18006Y.getMonthValue();
        }
        if ((i13 & 4) != 0) {
            i12 = c5554x.f18006Y.getDayOfMonth();
        }
        int i14 = AbstractC10620k.f31511a;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i11 - 1, 1);
        return new C5554x(i10, i11, Math.min(i12, calendar.getActualMaximum(5)));
    }
}
