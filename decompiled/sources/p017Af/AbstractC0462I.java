package p017Af;

import android.gov.nist.core.Separators;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.C0248f0;
import p003A1.C0257i0;
import p003A1.C0286s;
import p025An.C0644w;
import p030B2.C0742X;
import p040Bd.C1058c1;
import p040Bd.C1065d1;
import p040Bd.C1086g1;
import p040Bd.C1107j1;
import p040Bd.C1126m1;
import p040Bd.C1144p1;
import p040Bd.C1147p4;
import p040Bd.C1162s1;
import p040Bd.C1168t1;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19744u;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3587c;
import p204I1.C3590f;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p324Mn.C5521B;
import p328N1.C5609y;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p467T1.C7199i;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8455C;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p817j$.time.LocalDateTime;
import p817j$.time.format.DateTimeFormatter;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import tm.C20007b;

/* JADX INFO: renamed from: Af.I */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0462I {

    /* JADX INFO: renamed from: a */
    public static final float f1499a = 320;

    /* JADX INFO: renamed from: b */
    public static final float f1500b;

    static {
        float f10 = AbstractC7313q.f23196a;
        f1500b = AbstractC7313q.f23203h;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1111a(EnumC0463J enumC0463J, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        C6021p c6021p2 = c6021p;
        c6021p2.m6526U(-1298898825);
        if ((i10 & 6) == 0) {
            i11 = (c6021p2.m6542f(enumC0463J) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p2.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C20007b c20007b = EnumC0463J.f1503r0;
            int iIndexOf = c20007b.indexOf(enumC0463J);
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(iIndexOf, null, "Start weight", c6021p, 3072, 22);
            InterfaceC5982V0 interfaceC5982V0M15261b2 = AbstractC13764h.m15261b((c20007b.mo1316f() - iIndexOf) - 1, null, "End weight", c6021p, 3072, 22);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11244d);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p2, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p2, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p2, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p2, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
            C10451i c10451i = C10444b.f30941t0;
            InterfaceC10459q interfaceC10459qM11240a = c10843b.m11240a(interfaceC10459qM11244d2, c10451i);
            C10451i c10451i2 = c10451i;
            C17756f c17756f = AbstractC17770m.f56724a;
            C10843b c10843b2 = c10843b;
            C10450h c10450h = C10444b.f30943v0;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17756f, c10450h, c6021p2, 0);
            int i14 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11240a);
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p2, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p2, interfaceC6008i0M6550m2);
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p2, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p2, interfaceC10459qM10923d2);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p2.m6524S(740767619);
            float f10 = 0.0f;
            if (((Number) interfaceC5982V0M15261b.getValue()).floatValue() > 0.0f) {
                z6 = true;
                AbstractC17758g.m19482b(c6021p2, c17785t0.m19513a(c10456n, ((Number) interfaceC5982V0M15261b.getValue()).floatValue(), true));
            } else {
                z6 = true;
            }
            c6021p2.m6553p(false);
            AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC10844c.m11245e(c17785t0.m19513a(c10456n, 1.0f, z6), AbstractC7313q.f23198c), ((C14365u) c6021p2.m6548k(AbstractC4025b1.f12649a)).f45062a, AbstractC14334L.f44973a), c6021p2, 0);
            c6021p2.m6524S(740776991);
            if (((Number) interfaceC5982V0M15261b2.getValue()).floatValue() > 0.0f) {
                float fFloatValue = ((Number) interfaceC5982V0M15261b2.getValue()).floatValue();
                z10 = true;
                AbstractC17758g.m19482b(c6021p2, c17785t0.m19513a(c10456n, fFloatValue, true));
            } else {
                z10 = true;
            }
            c6021p2.m6553p(false);
            c6021p2.m6553p(z10);
            InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
            C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(c17756f, c10450h, c6021p2, 0);
            int i15 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11244d3);
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p2, c17781r0M19506b2);
            C5997d.m6439Z(c21694h2, c6021p2, interfaceC6008i0M6550m3);
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p2, i15, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p2, interfaceC10459qM10923d3);
            c6021p2.m6524S(740782872);
            c20007b.getClass();
            C0742X c0742x = new C0742X(c20007b, 8);
            while (c0742x.hasNext()) {
                EnumC0463J enumC0463J2 = (EnumC0463J) c0742x.next();
                String strM8676d = AbstractC8142m4.m8676d(enumC0463J2.f1504Y, c6021p2);
                C3582M c3582m = ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12158n;
                InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(c10456n, 1.0f, true);
                c6021p2.m6524S(-1951110107);
                boolean zM6542f = ((i12 & 112) == 32) | c6021p2.m6542f(enumC0463J2);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    objM6514H = new C0286s(interfaceC1436k, 5, enumC0463J2);
                    c6021p2.m6537c0(objM6514H);
                }
                c6021p2.m6553p(false);
                AbstractC4124r4.m4768b(strM8676d, AbstractC8071d5.m8483b(AbstractC10842a.m11235m(AbstractC10833a.m11209d(interfaceC10459qM19513a, false, null, (InterfaceC1426a) objM6514H, 7), f10, AbstractC7313q.f23200e, 1), enumC0463J2 == enumC0463J ? 1.0f : 0.38f), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65020);
                c6021p2 = c6021p;
                c10451i2 = c10451i2;
                c10843b2 = c10843b2;
                f10 = f10;
                c10456n = c10456n;
            }
            C6021p c6021p3 = c6021p2;
            c6021p3.m6553p(false);
            c6021p3.m6553p(true);
            AbstractC3984T1.m4692k(c10843b2.m11240a(c10456n, c10451i2), 0.0f, 0L, c6021p, 0, 6);
            c6021p3.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(enumC0463J, interfaceC1436k, i10, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x020e  */
    /* JADX WARN: Code duplicated, block: B:187:0x031f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0323  */
    /* JADX WARN: Code duplicated, block: B:193:0x0344  */
    /* JADX WARN: Code duplicated, block: B:198:0x0352  */
    /* JADX WARN: Code duplicated, block: B:201:0x0374  */
    /* JADX WARN: Code duplicated, block: B:202:0x0376  */
    /* JADX WARN: Code duplicated, block: B:210:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:214:0x0409  */
    /* JADX WARN: Code duplicated, block: B:216:0x0410  */
    /* JADX WARN: Code duplicated, block: B:219:0x044b  */
    /* JADX WARN: Code duplicated, block: B:220:0x044e  */
    /* JADX WARN: Code duplicated, block: B:223:0x047d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0482  */
    /* JADX WARN: Code duplicated, block: B:227:0x0484  */
    /* JADX WARN: Code duplicated, block: B:231:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:232:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:235:0x04b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r43v0, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v28, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public static final void m1113c(C1168t1 reference, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        Object next;
        List list;
        List list2;
        C1086g1 c1086g1;
        Map map;
        ?? M19323D0;
        C1058c1 c1058c1;
        C1162s1 c1162s1;
        C1147p4 c1147p4;
        C1058c1 c1058c2;
        C1162s1 c1162s2;
        C1147p4 c1147p5;
        Float f10;
        Object obj;
        Float fValueOf;
        Float f11;
        Float f12;
        int i11;
        long j10;
        int i12;
        long j11;
        int i13;
        C21696i c21696i;
        C21694h c21694h;
        String str;
        ?? r6;
        C1058c1 c1058c3;
        C1126m1 c1126m1;
        boolean z6;
        boolean z10;
        String strConcat;
        boolean z11;
        String str2;
        boolean zM6542f;
        Object objM6514H;
        C5975S c5975s;
        boolean z12;
        Object obj2;
        boolean z13;
        Object objM6514H2;
        Object obj3;
        InterfaceC10459q interfaceC10459q2;
        Float f13;
        Float fValueOf2;
        Float f14;
        Float fValueOf3;
        Float f15;
        C1107j1 c1107j1;
        C1107j1 c1107j2;
        C1086g1 c1086g2;
        Map map2;
        List list3;
        C1086g1 c1086g3;
        int iIntValue = 0;
        AbstractC16544l.m18094g(reference, "reference");
        c6021p.m6526U(710982317);
        if (((((i10 & 6) == 0 ? ((i10 & 8) == 0 ? c6021p.m6542f(reference) : c6021p.m6545h(reference) ? 4 : 2) | i10 : i10) | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C1144p1 c1144p1 = reference.f3116d;
            Map map3 = (c1144p1 == null || (c1086g3 = c1144p1.f3063c) == null) ? null : c1086g3.f2944a;
            c6021p.m6524S(2078563124);
            boolean zM6542f2 = c6021p.m6542f(map3);
            Object objM6514H3 = c6021p.m6514H();
            C5975S c5975s2 = C6013l.f19514a;
            C5975S c5975s3 = C5975S.f19448r0;
            Object obj4 = objM6514H3;
            if (zM6542f2 || objM6514H3 == c5975s2) {
                C20007b c20007b = EnumC0463J.f1503r0;
                c20007b.getClass();
                C0742X c0742x = new C0742X(c20007b, 8);
                do {
                    if (!c0742x.hasNext()) {
                        next = null;
                        break;
                    }
                    next = c0742x.next();
                    if (c1144p1 == null || (c1086g1 = c1144p1.f3063c) == null || (map = c1086g1.f2944a) == null) {
                        list = null;
                    } else {
                        EnumC0463J enumC0463J = EnumC0463J.OneDay;
                        list = (List) map.get("1d");
                    }
                    list2 = list;
                } while (list2 == null || list2.isEmpty());
                EnumC0463J enumC0463J2 = (EnumC0463J) next;
                if (enumC0463J2 == null) {
                    enumC0463J2 = EnumC0463J.OneDay;
                }
                C6002f0 c6002f0M6430Q = C5997d.m6430Q(enumC0463J2, c5975s3);
                c6021p.m6537c0(c6002f0M6430Q);
                obj4 = c6002f0M6430Q;
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj4;
            c6021p.m6553p(false);
            C1058c1 c1058c4 = c1144p1 != null ? c1144p1.f3061a : null;
            EnumC0463J enumC0463J3 = (EnumC0463J) interfaceC5985X.getValue();
            C1065d1 c1065d1 = C1168t1.Companion;
            c6021p.m6524S(-55448556);
            if (c1144p1 == null || (c1086g2 = c1144p1.f3063c) == null || (map2 = c1086g2.f2944a) == null) {
                M19323D0 = 0;
            } else {
                list3 = (List) map2.get(enumC0463J3.f1506o0);
            }
            if (M19323D0 == 0) {
                M19323D0 = list3;
                M19323D0 = C17689w.f56480Y;
            }
            M19323D0 = list3;
            c6021p.m6524S(780344805);
            boolean zM6542f3 = c6021p.m6542f(M19323D0) | c6021p.m6542f(enumC0463J3);
            Object objM6514H4 = c6021p.m6514H();
            ?? r10 = objM6514H4;
            if (zM6542f3 || objM6514H4 == c5975s2) {
                if (enumC0463J3 == EnumC0463J.OneDay) {
                    Integer numValueOf = (c1144p1 == null || (c1058c2 = c1144p1.f3061a) == null || (c1162s2 = c1058c2.f2894c) == null || (c1147p5 = c1162s2.f3085a) == null) ? null : Integer.valueOf(c1147p5.f3066a);
                    Integer numValueOf2 = (c1144p1 == null || (c1058c1 = c1144p1.f3061a) == null || (c1162s1 = c1058c1.f2894c) == null || (c1147p4 = c1162s1.f3085a) == null) ? null : Integer.valueOf(c1147p4.f3068c);
                    ArrayList arrayList = new ArrayList();
                    boolean z14 = false;
                    for (Object obj5 : (Iterable) M19323D0) {
                        if (z14) {
                            arrayList.add(obj5);
                        } else {
                            int i14 = ((C1126m1) obj5).f3040a;
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            }
                            if (i14 >= iIntValue) {
                                arrayList.add(obj5);
                                iIntValue = 0;
                                z14 = true;
                            }
                        }
                        iIntValue = 0;
                    }
                    M19323D0 = AbstractC17680n.m19323D0(arrayList);
                    C1126m1 c1126m2 = (C1126m1) AbstractC17680n.m19353c0(M19323D0);
                    if (c1126m2 != null) {
                        numValueOf = Integer.valueOf(c1126m2.f3040a);
                    }
                    for (Integer numValueOf3 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 600) : null; numValueOf3 != null; numValueOf3 = Integer.valueOf(numValueOf3.intValue() + 600)) {
                        if (numValueOf3.intValue() >= (numValueOf2 != null ? numValueOf2.intValue() : 0)) {
                            break;
                        }
                        M19323D0.add(new C1126m1(numValueOf3.intValue()));
                    }
                }
                c6021p.m6537c0(M19323D0);
                r10 = M19323D0;
            }
            List list4 = (List) r10;
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            c6021p.m6524S(2078578694);
            Object objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == c5975s2) {
                f10 = null;
                C6002f0 c6002f0M6430Q2 = C5997d.m6430Q(null, c5975s3);
                c6021p.m6537c0(c6002f0M6430Q2);
                obj = c6002f0M6430Q2;
            } else {
                f10 = null;
                obj = objM6514H5;
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) obj;
            c6021p.m6553p(false);
            Float fValueOf4 = (c1144p1 == null || (c1107j2 = c1144p1.f3062b) == null) ? f10 : Float.valueOf(c1107j2.f3008a);
            if (((EnumC0463J) interfaceC5985X.getValue()) == EnumC0463J.OneDay) {
                Float f16 = (c1144p1 == null || (c1107j1 = c1144p1.f3062b) == null) ? f10 : c1107j1.f3010c;
                if (fValueOf4 == null || f16 == null) {
                    fValueOf = f10;
                } else {
                    fValueOf = Float.valueOf(fValueOf4.floatValue() - f16.floatValue());
                }
            } else {
                C1126m1 c1126m3 = (C1126m1) AbstractC17680n.m19343S(list4);
                if (c1126m3 != null) {
                    fValueOf = c1126m3.f3041b;
                } else {
                    fValueOf = f10;
                }
            }
            if (fValueOf4 == null || fValueOf == null || AbstractC16544l.m18088a(fValueOf, 0.0f)) {
                f11 = f10;
            } else {
                if (((C1126m1) interfaceC5985X2.getValue()) != null) {
                    C1126m1 c1126m4 = (C1126m1) interfaceC5985X2.getValue();
                    fValueOf3 = Float.valueOf((((c1126m4 == null || (f15 = c1126m4.f3041b) == null) ? 0.0f : f15.floatValue()) - fValueOf.floatValue()) / fValueOf.floatValue());
                } else {
                    fValueOf3 = Float.valueOf((fValueOf4.floatValue() - fValueOf.floatValue()) / fValueOf.floatValue());
                }
                f11 = fValueOf3;
            }
            if (fValueOf4 == null || fValueOf == null) {
                f12 = f10;
            } else {
                if (((C1126m1) interfaceC5985X2.getValue()) != null) {
                    C1126m1 c1126m5 = (C1126m1) interfaceC5985X2.getValue();
                    fValueOf2 = Float.valueOf(((c1126m5 == null || (f14 = c1126m5.f3041b) == null) ? fValueOf.floatValue() : f14.floatValue()) - fValueOf.floatValue());
                } else {
                    fValueOf2 = Float.valueOf(fValueOf4.floatValue() - fValueOf.floatValue());
                }
                f12 = fValueOf2;
            }
            if (f11 == null) {
                c6021p.m6524S(2078616172);
                j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                i11 = 0;
                c6021p.m6553p(false);
            } else {
                i11 = 0;
                if (f11.floatValue() > 0.0f) {
                    c6021p.m6524S(2078617577);
                    c6021p.m6553p(false);
                    j10 = AbstractC7302f.f23125a;
                } else if (f11.floatValue() < 0.0f) {
                    c6021p.m6524S(2078618895);
                    c6021p.m6553p(false);
                    j11 = AbstractC7302f.f23133i;
                    i12 = 0;
                } else {
                    c6021p.m6524S(2078620332);
                    j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                    i12 = 0;
                    c6021p.m6553p(false);
                    j11 = j10;
                }
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, i12);
                i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                if (c1058c4 != null || (str = c1058c4.f2892a) == null) {
                    str = "            ";
                }
                String strM9891j = AbstractC9306j0.m9891j(reference.f3115c, Separators.RPAREN, AbstractC9306j0.m9895n(str, " ("));
                long jM9650c = AbstractC9119D4.m9650c(16);
                long j12 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12219d;
                if (c1058c4 == null) {
                    r6 = 1;
                } else {
                    r6 = i12;
                }
                c1058c3 = c1058c4;
                AbstractC4124r4.m4768b(strM9891j, AbstractC9818V.m10458b(c10456n, r6, true, 0.0f, 12), j12, jM9650c, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 3072, 0, 131056);
                c1126m1 = (C1126m1) interfaceC5985X2.getValue();
                if (c1126m1 != null && (f13 = c1126m1.f3041b) != null) {
                    fValueOf4 = f13;
                }
                if (fValueOf4 == null) {
                    strConcat = "$      ";
                    z6 = true;
                    z10 = false;
                } else {
                    z6 = true;
                    z10 = false;
                    strConcat = "$".concat(String.format("%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1)));
                }
                C3582M c3582m = new C3582M(0L, AbstractC9119D4.m9650c(36), C5609y.f18152o0, 0L, 0, 0L, 16777209);
                if (fValueOf4 == null) {
                    z11 = z6;
                } else {
                    z11 = z10;
                }
                AbstractC4124r4.m4768b(strConcat, AbstractC9818V.m10458b(c10456n, z11, z6, 0.0f, 12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 1572864, 65532);
                C1126m1 c1126m6 = (C1126m1) interfaceC5985X2.getValue();
                if (c1058c3 != null) {
                    str2 = c1058c3.f2895d;
                } else {
                    str2 = null;
                }
                m1112b(c1126m6, str2, f11, f12, (EnumC0463J) interfaceC5985X.getValue(), j11, c6021p, 0);
                EnumC0463J enumC0463J4 = (EnumC0463J) interfaceC5985X.getValue();
                c6021p.m6524S(-470120002);
                zM6542f = c6021p.m6542f(interfaceC5985X);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    c5975s = c5975s2;
                } else {
                    c5975s = c5975s2;
                    if (objM6514H == c5975s) {
                        z12 = true;
                        obj2 = objM6514H;
                    }
                    c6021p.m6553p(false);
                    m1111a(enumC0463J4, (InterfaceC1436k) obj2, c6021p, 0);
                    C1126m1 c1126m7 = (C1126m1) interfaceC5985X2.getValue();
                    if (c1058c3 == null) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    c6021p.m6524S(-470113798);
                    objM6514H2 = c6021p.m6514H();
                    obj3 = objM6514H2;
                    if (objM6514H2 == c5975s) {
                        C0248f0 c0248f0 = new C0248f0(interfaceC5985X2, 2);
                        c6021p.m6537c0(c0248f0);
                        obj3 = c0248f0;
                    }
                    c6021p.m6553p(false);
                    m1114d(list4, c1126m7, j11, z13, (InterfaceC1436k) obj3, null, c6021p, 24576);
                    c6021p.m6553p(z12);
                    interfaceC10459q2 = c10456n;
                }
                z12 = true;
                C0248f0 c0248f1 = new C0248f0(interfaceC5985X, true ? 1 : 0);
                c6021p.m6537c0(c0248f1);
                obj2 = c0248f1;
                c6021p.m6553p(false);
                m1111a(enumC0463J4, (InterfaceC1436k) obj2, c6021p, 0);
                C1126m1 c1126m8 = (C1126m1) interfaceC5985X2.getValue();
                if (c1058c3 == null) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                c6021p.m6524S(-470113798);
                objM6514H2 = c6021p.m6514H();
                obj3 = objM6514H2;
                if (objM6514H2 == c5975s) {
                    C0248f0 c0248f2 = new C0248f0(interfaceC5985X2, 2);
                    c6021p.m6537c0(c0248f2);
                    obj3 = c0248f2;
                }
                c6021p.m6553p(false);
                m1114d(list4, c1126m8, j11, z13, (InterfaceC1436k) obj3, null, c6021p, 24576);
                c6021p.m6553p(z12);
                interfaceC10459q2 = c10456n;
            }
            i12 = i11;
            j11 = j10;
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, i12);
            i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            } else {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            if (c1058c4 != null) {
                str = "            ";
            } else {
                str = "            ";
            }
            String strM9891j2 = AbstractC9306j0.m9891j(reference.f3115c, Separators.RPAREN, AbstractC9306j0.m9895n(str, " ("));
            long jM9650c2 = AbstractC9119D4.m9650c(16);
            long j13 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12219d;
            if (c1058c4 == null) {
                r6 = 1;
            } else {
                r6 = i12;
            }
            c1058c3 = c1058c4;
            AbstractC4124r4.m4768b(strM9891j2, AbstractC9818V.m10458b(c10456n, r6, true, 0.0f, 12), j13, jM9650c2, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 3072, 0, 131056);
            c1126m1 = (C1126m1) interfaceC5985X2.getValue();
            if (c1126m1 != null) {
                fValueOf4 = f13;
            }
            if (fValueOf4 == null) {
                strConcat = "$      ";
                z6 = true;
                z10 = false;
            } else {
                z6 = true;
                z10 = false;
                strConcat = "$".concat(String.format("%.2f", Arrays.copyOf(new Object[]{fValueOf4}, 1)));
            }
            C3582M c3582m2 = new C3582M(0L, AbstractC9119D4.m9650c(36), C5609y.f18152o0, 0L, 0, 0L, 16777209);
            if (fValueOf4 == null) {
                z11 = z6;
            } else {
                z11 = z10;
            }
            AbstractC4124r4.m4768b(strConcat, AbstractC9818V.m10458b(c10456n, z11, z6, 0.0f, 12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m2, c6021p, 0, 1572864, 65532);
            C1126m1 c1126m9 = (C1126m1) interfaceC5985X2.getValue();
            if (c1058c3 != null) {
                str2 = c1058c3.f2895d;
            } else {
                str2 = null;
            }
            m1112b(c1126m9, str2, f11, f12, (EnumC0463J) interfaceC5985X.getValue(), j11, c6021p, 0);
            EnumC0463J enumC0463J5 = (EnumC0463J) interfaceC5985X.getValue();
            c6021p.m6524S(-470120002);
            zM6542f = c6021p.m6542f(interfaceC5985X);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                c5975s = c5975s2;
                if (objM6514H == c5975s) {
                    z12 = true;
                    obj2 = objM6514H;
                }
                c6021p.m6553p(false);
                m1111a(enumC0463J5, (InterfaceC1436k) obj2, c6021p, 0);
                C1126m1 c1126m10 = (C1126m1) interfaceC5985X2.getValue();
                if (c1058c3 == null) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                c6021p.m6524S(-470113798);
                objM6514H2 = c6021p.m6514H();
                obj3 = objM6514H2;
                if (objM6514H2 == c5975s) {
                    C0248f0 c0248f3 = new C0248f0(interfaceC5985X2, 2);
                    c6021p.m6537c0(c0248f3);
                    obj3 = c0248f3;
                }
                c6021p.m6553p(false);
                m1114d(list4, c1126m10, j11, z13, (InterfaceC1436k) obj3, null, c6021p, 24576);
                c6021p.m6553p(z12);
                interfaceC10459q2 = c10456n;
            } else {
                c5975s = c5975s2;
            }
            z12 = true;
            C0248f0 c0248f4 = new C0248f0(interfaceC5985X, true ? 1 : 0);
            c6021p.m6537c0(c0248f4);
            obj2 = c0248f4;
            c6021p.m6553p(false);
            m1111a(enumC0463J5, (InterfaceC1436k) obj2, c6021p, 0);
            C1126m1 c1126m11 = (C1126m1) interfaceC5985X2.getValue();
            if (c1058c3 == null) {
                z13 = z12;
            } else {
                z13 = false;
            }
            c6021p.m6524S(-470113798);
            objM6514H2 = c6021p.m6514H();
            obj3 = objM6514H2;
            if (objM6514H2 == c5975s) {
                C0248f0 c0248f5 = new C0248f0(interfaceC5985X2, 2);
                c6021p.m6537c0(c0248f5);
                obj3 = c0248f5;
            }
            c6021p.m6553p(false);
            m1114d(list4, c1126m11, j11, z13, (InterfaceC1436k) obj3, null, c6021p, 24576);
            c6021p.m6553p(z12);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(reference, interfaceC10459q2, i10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX INFO: renamed from: d */
    public static final void m1114d(List list, C1126m1 c1126m1, long j10, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Float fValueOf;
        Float fValueOf2;
        InterfaceC10459q interfaceC10459q2;
        C1126m1 c1126m2;
        C1126m1 c1126m3;
        c6021p.m6526U(-1632719021);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c1126m1) : c6021p.m6545h(c1126m1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6540e(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Float f10 = ((C1126m1) it.next()).f3041b;
                    float fFloatValue = f10 != null ? f10.floatValue() : Float.POSITIVE_INFINITY;
                    while (it.hasNext()) {
                        Float f11 = ((C1126m1) it.next()).f3041b;
                        fFloatValue = Math.min(fFloatValue, f11 != null ? f11.floatValue() : Float.POSITIVE_INFINITY);
                    }
                    fValueOf = Float.valueOf(fFloatValue);
                } else {
                    fValueOf = null;
                }
            } else {
                fValueOf = null;
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    Float f12 = ((C1126m1) it2.next()).f3041b;
                    float fFloatValue2 = f12 != null ? f12.floatValue() : Float.NEGATIVE_INFINITY;
                    while (it2.hasNext()) {
                        Float f13 = ((C1126m1) it2.next()).f3041b;
                        fFloatValue2 = Math.max(fFloatValue2, f13 != null ? f13.floatValue() : Float.NEGATIVE_INFINITY);
                    }
                    fValueOf2 = Float.valueOf(fFloatValue2);
                } else {
                    fValueOf2 = null;
                }
            } else {
                fValueOf2 = null;
            }
            Integer numValueOf = (list == null || (c1126m3 = (C1126m1) AbstractC17680n.m19343S(list)) == null) ? null : Integer.valueOf(c1126m3.f3040a);
            Integer numValueOf2 = (list == null || (c1126m2 = (C1126m1) AbstractC17680n.m19353c0(list)) == null) ? null : Integer.valueOf(c1126m2.f3040a);
            c6021p.m6524S(1484454885);
            float f14 = f1499a;
            if (list == null || fValueOf == null || fValueOf2 == null || numValueOf == null || numValueOf2 == null) {
                C10451i c10451i = C10444b.f30938q0;
                InterfaceC10459q interfaceC10459qM11245e = AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n, 1.0f), f14);
                AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
                InterfaceC10459q interfaceC10459qM10458b = AbstractC9818V.m10458b(AbstractC10833a.m11207b(interfaceC10459qM11245e, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12194H, AbstractC14334L.f44973a), z6, false, 0, 6);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
                int i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM10458b);
                InterfaceC21700k.f68875m0.getClass();
                InterfaceC1426a interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
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
                c6021p.m6524S(-363009123);
                if (!z6) {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.stock_no_data_available, c6021p), null, ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
                }
                r14.m6553p(false);
                r14.m6553p(true);
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C0458E(list, c1126m1, j10, z6, interfaceC1436k, c10456n, i10, 0);
                    return;
                }
                return;
            }
            Object objM530s = AbstractC0168G.m530s(1484476156, c6021p, false);
            Object obj = C6013l.f19514a;
            if (objM530s == obj) {
                objM530s = AbstractC14334L.m15631i();
                c6021p.m6537c0(objM530s);
            }
            InterfaceC14333K interfaceC14333K = (InterfaceC14333K) objM530s;
            c6021p.m6553p(false);
            long jM15774b = C14365u.m15774b(0.38f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q);
            InterfaceC10459q interfaceC10459qM11245e2 = AbstractC10844c.m11245e(AbstractC10844c.m11244d(c10456n, 1.0f), f14);
            c6021p.m6524S(1484484127);
            boolean zM6545h = ((57344 & i12) == 16384) | c6021p.m6545h(list);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C0460G(interfaceC1436k, list, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM11245e2, list, (InterfaceC1439n) objM6514H);
            c6021p.m6524S(1484502121);
            Float f15 = fValueOf2;
            boolean zM6542f = c6021p.m6542f(fValueOf) | c6021p.m6542f(fValueOf2) | c6021p.m6545h(list) | c6021p.m6545h(interfaceC14333K) | ((i12 & 896) == 256) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && c6021p.m6545h(c1126m1))) | c6021p.m6540e(jM15774b);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                Object c0461h = new C0461H(interfaceC14333K, list, j10, c1126m1, fValueOf, f15, jM15774b);
                c6021p.m6537c0(c0461h);
                objM6514H2 = c0461h;
            }
            c6021p.m6553p(false);
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H2, c6021p, interfaceC10459qM20694b);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C0458E(list, c1126m1, j10, z6, interfaceC1436k, interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1112b(C1126m1 c1126m1, String str, Float f10, Float f11, EnumC0463J enumC0463J, long j10, C6021p c6021p, int i10) {
        int i11;
        float fFloatValue;
        float f12;
        boolean z6;
        String strM8676d;
        String str2;
        LocalDateTime localDateTime;
        c6021p.m6526U(-2106219170);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c1126m1) : c6021p.m6545h(c1126m1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(f10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(f11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(enumC0463J) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6540e(j10) ? 131072 : 65536;
        }
        if ((i11 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1110205080);
            boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && c6021p.m6542f(c1126m1));
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6421H(new C0286s(c1126m1, 6, str));
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H;
            c6021p.m6553p(false);
            C10450h c10450h = C10444b.f30944w0;
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23197b);
            InterfaceC10459q interfaceC10459qM8534c = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM10458b = AbstractC9818V.m10458b(interfaceC10459qM8534c, f10 == null, false, 0.0f, 14);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM10458b);
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
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.stock_change_arrow, c6021p, 0);
            if (f10 != null) {
                interfaceC10459qM8534c = AbstractC8087f5.m8534c(interfaceC10459qM8534c, f10.floatValue() > 0.0f ? 0.0f : 180.0f);
            }
            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, interfaceC10459qM8534c, j10, c6021p, ((i11 >> 6) & 7168) | 48, 0);
            c6021p.m6524S(-28478832);
            C3587c c3587c = new C3587c();
            int iM4296h = c3587c.m4296h(new C3573D(j10, 0L, C5609y.f18152o0, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
            if (f10 != null) {
                try {
                    fFloatValue = f10.floatValue();
                    f12 = 0.0f;
                } catch (Throwable th2) {
                    c3587c.m4293e(iM4296h);
                    throw th2;
                }
            } else {
                f12 = 0.0f;
                fFloatValue = 0.0f;
            }
            if (fFloatValue > f12) {
                c3587c.m4291c(SfpOlmlMATQ.GIbKDbl);
            }
            if ((f10 != null ? f10.floatValue() : 0.0f) < 0.0f) {
                c3587c.m4291c("-");
            }
            c3587c.m4291c("$");
            if (f11 != null) {
                c3587c.m4291c(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(Math.abs(f11.floatValue()))}, 1)));
            }
            c3587c.m4291c(" (");
            if (f10 != null) {
                z6 = true;
                c3587c.m4291c(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue() * 100.0f)}, 1)));
            } else {
                z6 = true;
            }
            c3587c.m4291c("%) ");
            c3587c.m4293e(iM4296h);
            c6021p.m6524S(-28450159);
            if (c1126m1 == null || ((C5521B) interfaceC5982V0.getValue()) == null) {
                strM8676d = AbstractC8142m4.m8676d(enumC0463J.f1505Z, c6021p);
            } else {
                switch (enumC0463J.ordinal()) {
                    case 0:
                        str2 = "hh:mm a";
                        break;
                    case 1:
                        str2 = "eee hh:mm a";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        str2 = "MMMM dd";
                        break;
                    case 5:
                    case 6:
                        str2 = "MMMM dd, y";
                        break;
                    default:
                        throw new C0644w();
                }
                C5521B c5521b = (C5521B) interfaceC5982V0.getValue();
                strM8676d = (c5521b == null || (localDateTime = c5521b.f17975Y) == null) ? null : localDateTime.format(DateTimeFormatter.ofPattern(str2));
            }
            c6021p.m6553p(false);
            c3587c.f10925Y.append((CharSequence) strM8676d);
            C3590f c3590fM4297i = c3587c.m4297i();
            c6021p.m6553p(false);
            AbstractC4124r4.m4769c(c3590fM4297i, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p, 0, 0, 262142);
            c6021p.m6553p(z6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0457D(c1126m1, str, f10, f11, enumC0463J, j10, i10);
        }
    }
}
