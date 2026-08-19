package p042Bf;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0155B1;
import p003A1.C0248f0;
import p003A1.C0286s;
import p003A1.InterfaceC0309z1;
import p006A4.C0339D;
import p040Bd.C0893B;
import p040Bd.C1166t;
import p040Bd.C1184w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22011h0;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4099n3;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8098h0;
import p523V9.AbstractC8134l4;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
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

/* JADX INFO: renamed from: Bf.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1270l {

    /* JADX INFO: renamed from: a */
    public static final float f3375a = 320;

    /* JADX INFO: renamed from: a */
    public static final void m1982a(String str, String messageId, C0893B reference, C6021p c6021p, int i10) {
        int i11;
        InterfaceC5985X interfaceC5985X;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(reference, "reference");
        c6021p.m6526U(1245322328);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(reference) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            List list = reference.f2620c;
            if (list.isEmpty()) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C1259a(str, messageId, reference, i10, 0);
                    return;
                }
                return;
            }
            c6021p.m6524S(-1320738821);
            if (AbstractC16544l.m18089b(reference.f2621d, Boolean.TRUE)) {
                List list2 = reference.f2622e;
                if (list2 == null) {
                    list2 = C17689w.f56480Y;
                }
                m1983b(0, c6021p, null, list2);
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                if (c6018n0M6555r2 != null) {
                    c6018n0M6555r2.f19536d = new C1259a(str, messageId, reference, i10, 1);
                    return;
                }
                return;
            }
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C1261c.f3341Z, c6021p, 3072, 6);
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C1261c.f3342o0, c6021p, 3072, 6);
            Integer num = (Integer) interfaceC5985X3.getValue();
            C1166t c1166t = num != null ? (C1166t) AbstractC17680n.m19344T(num.intValue(), list) : null;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
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
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C17785t0 c17785t0 = C17785t0.f56761a;
            int size = list.size();
            C1166t c1166t2 = c1166t;
            AbstractC4124r4.m4768b(AbstractC8134l4.m8653c(c6021p).getQuantityString(R.plurals.business_count, size, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, 0, 0, 65534);
            AbstractC17758g.m19482b(c6021p, c17785t0.m19513a(c10456n, 1.0f, true));
            AbstractC4099n3.m4758b(null, 0.0f, AbstractC8411c.m8969c(-735266873, c6021p, new C1260b(interfaceC5985X2, 0)), c6021p, 384);
            c6021p.m6553p(true);
            boolean zBooleanValue = ((Boolean) interfaceC5985X2.getValue()).booleanValue();
            Object obj = C6013l.f19514a;
            if (zBooleanValue) {
                c6021p.m6524S(-1799239251);
                Object obj2 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(911795927);
                interfaceC5985X = interfaceC5985X3;
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C0248f0(interfaceC5985X, 3);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(911797913);
                boolean zM6545h = ((i12 & 14) == 4) | c6021p.m6545h(obj2) | ((i12 & 112) == 32);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6545h || objM6514H2 == obj) {
                    objM6514H2 = new C0155B1(str, obj2, messageId, 2);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                m1985d(reference.f2620c, interfaceC1436k, (InterfaceC1426a) objM6514H2, AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n, 1.0f), f3375a), c6021p, 3072);
                c6021p.m6553p(false);
            } else {
                interfaceC5985X = interfaceC5985X3;
                int i15 = 4;
                c6021p.m6524S(-1798744956);
                c6021p.m6524S(911810679);
                boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f2 || objM6514H3 == obj) {
                    objM6514H3 = new C0248f0(interfaceC5985X, i15);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                m1984c(list, (InterfaceC1436k) objM6514H3, null, c6021p, 0);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(true);
            c6021p.m6524S(-1320664422);
            boolean zM6542f3 = c6021p.m6542f(interfaceC5985X);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == obj) {
                objM6514H4 = new C0339D(interfaceC5985X, 3);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            AbstractC1274p.m1987b((InterfaceC1426a) objM6514H4, c1166t2, null, c6021p, 0);
        }
        C6018n0 c6018n0M6555r3 = c6021p.m6555r();
        if (c6018n0M6555r3 != null) {
            c6018n0M6555r3.f19536d = new C1259a(str, messageId, reference, i10, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v1, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v18, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX INFO: renamed from: b */
    public static final void m1983b(int i10, C6021p c6021p, InterfaceC10459q interfaceC10459q, List list) {
        InterfaceC10459q interfaceC10459q2;
        ?? r6;
        C6021p c6021p2 = c6021p;
        int i11 = 1;
        ?? r12 = 0;
        c6021p2.m6526U(795183301);
        if (((((i10 & 6) == 0 ? (c6021p2.m6545h(list) ? 4 : 2) | i10 : i10) | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            r6 = 0;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p2.m6548k(AbstractC0187M0.f714p);
            C17756f c17756f = AbstractC17770m.f56726c;
            C10449g c10449g = C10444b.f30946y0;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p2, 0);
            int i12 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p2, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p2, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
            c6021p2.m6524S(-440390479);
            int i13 = 0;
            ?? r14 = c6021p2;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                C1184w c1184w = (C1184w) obj;
                r14.m6524S(-440389499);
                if (i13 > 0) {
                    AbstractC3984T1.m4692k(AbstractC10842a.m11235m(c10456n, 0.0f, AbstractC7313q.f23199d, i11), 0.0f, 0L, c6021p, 0, 6);
                }
                r14.m6553p(r12);
                C17756f c17756f2 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23198c), c10449g, r14, r12);
                int i15 = r14.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(r14, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i2 = C21698j.f68869b;
                c6021p.m6528W();
                if (r14.f19563O) {
                    r14.m6549l(c21696i2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, r14, c17790wM19515a2);
                C5997d.m6439Z(C21698j.f68872e, r14, interfaceC6008i0M6550m2);
                C21694h c21694h2 = C21698j.f68874g;
                if (r14.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, r14, i15, c21694h2);
                }
                C5997d.m6439Z(C21698j.f68871d, r14, interfaceC10459qM10923d2);
                String str = c1184w.f3131a;
                C5984W0 c5984w0 = AbstractC3947L4.f12183a;
                C10449g c10449g2 = c10449g;
                C10456n c10456n2 = c10456n;
                InterfaceC0309z1 interfaceC0309z2 = interfaceC0309z1;
                AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) r14.m6548k(c5984w0)).f12152h, c6021p, 0, 0, 65534);
                C3582M c3582m = ((C3941K4) c6021p.m6548k(c5984w0)).f12155k;
                long jM7773b = AbstractC7302f.m7773b(c6021p);
                c6021p.m6524S(-846418812);
                boolean zM6545h = c6021p.m6545h(interfaceC0309z2) | c6021p.m6545h(c1184w);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C0286s(interfaceC0309z2, 10, c1184w);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC4124r4.m4768b(c1184w.f3132b, AbstractC10833a.m11209d(c10456n2, false, null, (InterfaceC1426a) objM6514H, 7), jM7773b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65528);
                AbstractC4124r4.m4768b(c1184w.f3133c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, 0, 0, 65534);
                c6021p.m6553p(true);
                r14 = c6021p;
                i11 = 1;
                i13 = i14;
                c10456n = c10456n2;
                interfaceC0309z1 = interfaceC0309z2;
                c10449g = c10449g2;
                r12 = 0;
            }
            ?? r10 = r12;
            ?? r11 = r14;
            r11.m6553p(r10);
            r11.m6553p(i11);
            interfaceC10459q2 = c10456n;
            r6 = r10;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1262d(list, interfaceC10459q2, i10, r6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1984c(List list, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-277585004);
        int i11 = (i10 & 6) == 0 ? i10 | (c6021p.m6545h(list) ? 4 : 2) : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(1111366110);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                C1166t c1166t = (C1166t) obj;
                c6021p.m6524S(1111367320);
                if (i14 > 0) {
                    AbstractC3984T1.m4692k(null, 0.0f, 0L, c6021p, 0, 7);
                }
                c6021p.m6553p(false);
                c6021p.m6524S(236771504);
                boolean zM6538d = c6021p.m6538d(i14) | ((i12 & 112) == 32);
                Object objM6514H = c6021p.m6514H();
                if (zM6538d || objM6514H == C6013l.f19514a) {
                    objM6514H = new C1263e(i14, 0, interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC1277s.m1992d(c1166t, AbstractC10842a.m11235m(AbstractC10844c.m11244d(AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H, 7), 1.0f), 0.0f, AbstractC7313q.f23199d, 1), null, c6021p, 0, 4);
                i14 = i15;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1264f(list, interfaceC1436k, interfaceC10459q2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1985d(List list, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1927606102);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8098h0.m8569a(null, 0.0f, 0.0f, AbstractC8411c.m8969c(-68859140, c6021p, new C1268j(interfaceC10459q, list, interfaceC1426a, interfaceC1436k, 0)), c6021p, 3072, 7);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(i10, 0, list, interfaceC1436k, interfaceC1426a, interfaceC10459q);
        }
    }
}
