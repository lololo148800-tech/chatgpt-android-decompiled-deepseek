package p742f6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Path;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Collections;
import p001A.AbstractC0010F;
import p520V5.C7781j;
import p523V9.AbstractC7846A5;
import p660b6.C11249a;
import p660b6.C11250b;
import p660b6.C11252d;
import p660b6.InterfaceC11253e;
import p675c6.C11666a;
import p675c6.C11669d;
import p675c6.C11670e;
import p675c6.C11672g;
import p675c6.C11673h;
import p675c6.C11674i;
import p675c6.C11675j;
import p675c6.C11677l;
import p675c6.C11678m;
import p675c6.C11679n;
import p675c6.C11680o;
import p675c6.C11681p;
import p675c6.InterfaceC11667b;
import p764g6.C13822b;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;
import p802i6.C14935a;

/* JADX INFO: renamed from: f6.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13555g {

    /* JADX INFO: renamed from: a */
    public static final C15384c f42888a = C15384c.m16635u("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:439:0x0754 A[LOOP:1: B:437:0x074e->B:439:0x0754, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16, types: [b6.b] */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r20v33 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC11667b m15090a(C13822b c13822b, C7781j c7781j) {
        String strMo15435x;
        InterfaceC11667b c11678m;
        int i10;
        InterfaceC11667b c11666a = null;
        boolean zMo15426S0 = false;
        boolean zMo15426S1 = false;
        int i11 = 0;
        c13822b.mo15430e();
        int iMo15431g0 = 2;
        while (true) {
            if (!c13822b.hasNext()) {
                strMo15435x = null;
                break;
            }
            int iMo15427T = c13822b.mo15427T(f42888a);
            if (iMo15427T == 0) {
                strMo15435x = c13822b.mo15435x();
                break;
            }
            if (iMo15427T != 1) {
                c13822b.mo15428W();
                c13822b.mo15421D();
            } else {
                iMo15431g0 = c13822b.mo15431g0();
            }
        }
        if (strMo15435x == null) {
            return null;
        }
        switch (strMo15435x) {
            case "el":
                C15384c c15384c = AbstractC13553e.f42880a;
                boolean z6 = iMo15431g0 == 3;
                String strMo15435x2 = null;
                InterfaceC11253e interfaceC11253eM15088b = null;
                C11249a c11249aM8103f = null;
                boolean zMo15426S2 = false;
                while (c13822b.hasNext()) {
                    int iMo15427T2 = c13822b.mo15427T(AbstractC13553e.f42880a);
                    if (iMo15427T2 == 0) {
                        strMo15435x2 = c13822b.mo15435x();
                    } else if (iMo15427T2 == 1) {
                        interfaceC11253eM15088b = AbstractC13549a.m15088b(c13822b, c7781j);
                    } else if (iMo15427T2 == 2) {
                        c11249aM8103f = AbstractC7846A5.m8103f(c13822b, c7781j);
                    } else if (iMo15427T2 == 3) {
                        zMo15426S2 = c13822b.mo15426S0();
                    } else if (iMo15427T2 != 4) {
                        c13822b.mo15428W();
                        c13822b.mo15421D();
                    } else {
                        z6 = c13822b.mo15431g0() == 3;
                    }
                }
                c11666a = new C11666a(strMo15435x2, interfaceC11253eM15088b, c11249aM8103f, z6, zMo15426S2);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "fl":
                C15384c c15384c2 = AbstractC13573y.f42925a;
                C11249a c11249a = null;
                String strMo15435x3 = null;
                C11249a c11249aM8099b = null;
                boolean zMo15426S3 = false;
                boolean zMo15426S4 = false;
                int iMo15431g1 = 1;
                while (c13822b.hasNext()) {
                    int iMo15427T3 = c13822b.mo15427T(AbstractC13573y.f42925a);
                    if (iMo15427T3 == 0) {
                        strMo15435x3 = c13822b.mo15435x();
                    } else if (iMo15427T3 == 1) {
                        c11249aM8099b = AbstractC7846A5.m8099b(c13822b, c7781j);
                    } else if (iMo15427T3 == 2) {
                        c11249a = AbstractC7846A5.m8102e(c13822b, c7781j);
                    } else if (iMo15427T3 == 3) {
                        zMo15426S3 = c13822b.mo15426S0();
                    } else if (iMo15427T3 == 4) {
                        iMo15431g1 = c13822b.mo15431g0();
                    } else if (iMo15427T3 != 5) {
                        c13822b.mo15428W();
                        c13822b.mo15421D();
                    } else {
                        zMo15426S4 = c13822b.mo15426S0();
                    }
                }
                if (c11249a == null) {
                    c11249a = new C11249a(2, Collections.singletonList(new C14935a(100)));
                }
                c11666a = new C11677l(strMo15435x3, zMo15426S3, iMo15431g1 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c11249aM8099b, c11249a, zMo15426S4);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "gf":
                C15384c c15384c3 = AbstractC13560l.f42901a;
                Path.FillType fillType = Path.FillType.WINDING;
                C11249a c11249aM8102e = null;
                String strMo15435x4 = null;
                C11249a c11249aM8101d = null;
                C11249a c11249aM8103f2 = null;
                C11249a c11249aM8103f3 = null;
                int i12 = 0;
                boolean zMo15426S5 = false;
                while (c13822b.hasNext()) {
                    switch (c13822b.mo15427T(AbstractC13560l.f42901a)) {
                        case 0:
                            strMo15435x4 = c13822b.mo15435x();
                            break;
                        case 1:
                            c13822b.mo15430e();
                            int iMo15431g2 = -1;
                            while (c13822b.hasNext()) {
                                int iMo15427T4 = c13822b.mo15427T(AbstractC13560l.f42902b);
                                if (iMo15427T4 == 0) {
                                    iMo15431g2 = c13822b.mo15431g0();
                                } else if (iMo15427T4 != 1) {
                                    c13822b.mo15428W();
                                    c13822b.mo15421D();
                                } else {
                                    c11249aM8101d = AbstractC7846A5.m8101d(c13822b, c7781j, iMo15431g2);
                                }
                            }
                            c13822b.mo15434m();
                            break;
                        case 2:
                            c11249aM8102e = AbstractC7846A5.m8102e(c13822b, c7781j);
                            break;
                        case 3:
                            i12 = c13822b.mo15431g0() != 1 ? 2 : 1;
                            break;
                        case 4:
                            c11249aM8103f2 = AbstractC7846A5.m8103f(c13822b, c7781j);
                            break;
                        case 5:
                            c11249aM8103f3 = AbstractC7846A5.m8103f(c13822b, c7781j);
                            break;
                        case 6:
                            fillType = c13822b.mo15431g0() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zMo15426S5 = c13822b.mo15426S0();
                            break;
                        default:
                            c13822b.mo15428W();
                            c13822b.mo15421D();
                            break;
                    }
                }
                c11666a = new C11669d(strMo15435x4, i12, fillType, c11249aM8101d, c11249aM8102e == null ? new C11249a(2, Collections.singletonList(new C14935a(100))) : c11249aM8102e, c11249aM8103f2, c11249aM8103f3, zMo15426S5);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "gr":
                C15384c c15384c4 = AbstractC13574z.f42926a;
                ArrayList arrayList = new ArrayList();
                String strMo15435x5 = null;
                while (c13822b.hasNext()) {
                    int iMo15427T5 = c13822b.mo15427T(AbstractC13574z.f42926a);
                    if (iMo15427T5 == 0) {
                        strMo15435x5 = c13822b.mo15435x();
                    } else if (iMo15427T5 == 1) {
                        zMo15426S0 = c13822b.mo15426S0();
                    } else if (iMo15427T5 != 2) {
                        c13822b.mo15421D();
                    } else {
                        c13822b.mo15429a();
                        while (c13822b.hasNext()) {
                            InterfaceC11667b interfaceC11667bM15090a = m15090a(c13822b, c7781j);
                            if (interfaceC11667bM15090a != null) {
                                arrayList.add(interfaceC11667bM15090a);
                            }
                        }
                        c13822b.mo15433k();
                    }
                }
                c11678m = new C11678m(strMo15435x5, arrayList, zMo15426S0);
                c11666a = c11678m;
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "gs":
                C15384c c15384c5 = AbstractC13561m.f42903a;
                ArrayList arrayList2 = new ArrayList();
                C11249a c11249aM8102e2 = null;
                String strMo15435x6 = null;
                C11249a c11249aM8101d2 = null;
                C11249a c11249aM8103f4 = null;
                C11249a c11249aM8103f5 = null;
                C11250b c11250bM8100c = null;
                C11250b c11250b = null;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean zMo15426S6 = false;
                float fMo15423O = 0.0f;
                while (c13822b.hasNext()) {
                    switch (c13822b.mo15427T(AbstractC13561m.f42903a)) {
                        case 0:
                            strMo15435x6 = c13822b.mo15435x();
                            break;
                        case 1:
                            c13822b.mo15430e();
                            int iMo15431g3 = -1;
                            while (c13822b.hasNext()) {
                                int iMo15427T6 = c13822b.mo15427T(AbstractC13561m.f42904b);
                                if (iMo15427T6 == 0) {
                                    iMo15431g3 = c13822b.mo15431g0();
                                } else if (iMo15427T6 != 1) {
                                    c13822b.mo15428W();
                                    c13822b.mo15421D();
                                } else {
                                    c11249aM8101d2 = AbstractC7846A5.m8101d(c13822b, c7781j, iMo15431g3);
                                }
                            }
                            c13822b.mo15434m();
                            break;
                        case 2:
                            c11249aM8102e2 = AbstractC7846A5.m8102e(c13822b, c7781j);
                            break;
                        case 3:
                            i13 = c13822b.mo15431g0() != 1 ? 2 : 1;
                            break;
                        case 4:
                            c11249aM8103f4 = AbstractC7846A5.m8103f(c13822b, c7781j);
                            break;
                        case 5:
                            c11249aM8103f5 = AbstractC7846A5.m8103f(c13822b, c7781j);
                            break;
                        case 6:
                            c11250bM8100c = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                            break;
                        case 7:
                            i14 = AbstractC0010F.m27k(3)[c13822b.mo15431g0() - 1];
                            break;
                        case 8:
                            i15 = AbstractC0010F.m27k(3)[c13822b.mo15431g0() - 1];
                            break;
                        case 9:
                            fMo15423O = (float) c13822b.mo15423O();
                            break;
                        case 10:
                            zMo15426S6 = c13822b.mo15426S0();
                            break;
                        case 11:
                            c13822b.mo15429a();
                            while (c13822b.hasNext()) {
                                c13822b.mo15430e();
                                String strMo15435x7 = null;
                                C11250b c11250bM8100c2 = null;
                                while (c13822b.hasNext()) {
                                    int iMo15427T7 = c13822b.mo15427T(AbstractC13561m.f42905c);
                                    if (iMo15427T7 == 0) {
                                        strMo15435x7 = c13822b.mo15435x();
                                    } else if (iMo15427T7 != 1) {
                                        c13822b.mo15428W();
                                        c13822b.mo15421D();
                                    } else {
                                        c11250bM8100c2 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                                    }
                                }
                                c13822b.mo15434m();
                                if (strMo15435x7.equals("o")) {
                                    c11250b = c11250bM8100c2;
                                } else if (strMo15435x7.equals("d") || strMo15435x7.equals("g")) {
                                    c7781j.f24594o = true;
                                    arrayList2.add(c11250bM8100c2);
                                }
                            }
                            c13822b.mo15433k();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((C11250b) arrayList2.get(0));
                            }
                            break;
                        default:
                            c13822b.mo15428W();
                            c13822b.mo15421D();
                            break;
                    }
                }
                c11666a = new C11670e(strMo15435x6, i13, c11249aM8101d2, c11249aM8102e2 == null ? new C11249a(2, Collections.singletonList(new C14935a(100))) : c11249aM8102e2, c11249aM8103f4, c11249aM8103f5, c11250bM8100c, i14, i15, fMo15423O, arrayList2, c11250b, zMo15426S6);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "mm":
                C15384c c15384c6 = AbstractC13567s.f42918a;
                String strMo15435x8 = null;
                boolean zMo15426S7 = false;
                while (c13822b.hasNext()) {
                    int iMo15427T8 = c13822b.mo15427T(AbstractC13567s.f42918a);
                    if (iMo15427T8 == 0) {
                        strMo15435x8 = c13822b.mo15435x();
                    } else if (iMo15427T8 == 1) {
                        int iMo15431g4 = c13822b.mo15431g0();
                        if (iMo15431g4 != 1) {
                            if (iMo15431g4 == 2) {
                                i11 = 2;
                            } else if (iMo15431g4 == 3) {
                                i11 = 3;
                            } else if (iMo15431g4 == 4) {
                                i11 = 4;
                            } else if (iMo15431g4 == 5) {
                                i11 = 5;
                            }
                        }
                        i11 = 1;
                    } else if (iMo15427T8 != 2) {
                        c13822b.mo15428W();
                        c13822b.mo15421D();
                    } else {
                        zMo15426S7 = c13822b.mo15426S0();
                    }
                }
                C11672g c11672g = new C11672g(strMo15435x8, i11, zMo15426S7);
                c7781j.m8039a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                c11666a = c11672g;
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "rc":
                C15384c c15384c7 = AbstractC13569u.f42920a;
                String strMo15435x9 = null;
                InterfaceC11253e interfaceC11253eM15088b2 = null;
                C11249a c11249aM8103f6 = null;
                C11250b c11250bM8100c3 = null;
                boolean zMo15426S8 = false;
                while (c13822b.hasNext()) {
                    int iMo15427T9 = c13822b.mo15427T(AbstractC13569u.f42920a);
                    if (iMo15427T9 == 0) {
                        strMo15435x9 = c13822b.mo15435x();
                    } else if (iMo15427T9 == 1) {
                        interfaceC11253eM15088b2 = AbstractC13549a.m15088b(c13822b, c7781j);
                    } else if (iMo15427T9 == 2) {
                        c11249aM8103f6 = AbstractC7846A5.m8103f(c13822b, c7781j);
                    } else if (iMo15427T9 == 3) {
                        c11250bM8100c3 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                    } else if (iMo15427T9 != 4) {
                        c13822b.mo15421D();
                    } else {
                        zMo15426S8 = c13822b.mo15426S0();
                    }
                }
                c11666a = new C11674i(strMo15435x9, interfaceC11253eM15088b2, c11249aM8103f6, c11250bM8100c3, zMo15426S8);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "rd":
                C15384c c15384c8 = AbstractC13571w.f42922a;
                String strMo15435x10 = null;
                C11250b c11250bM8100c4 = null;
                while (c13822b.hasNext()) {
                    int iMo15427T10 = c13822b.mo15427T(AbstractC13571w.f42922a);
                    if (iMo15427T10 == 0) {
                        strMo15435x10 = c13822b.mo15435x();
                    } else if (iMo15427T10 == 1) {
                        c11250bM8100c4 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                    } else if (iMo15427T10 != 2) {
                        c13822b.mo15421D();
                    } else {
                        zMo15426S1 = c13822b.mo15426S0();
                    }
                }
                c11666a = zMo15426S1 ? null : new C11675j(strMo15435x10, c11250bM8100c4);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "rp":
                C15384c c15384c9 = AbstractC13570v.f42921a;
                String strMo15435x11 = null;
                C11250b c11250bM8100c5 = null;
                C11250b c11250bM8100c6 = null;
                C11252d c11252dM15089a = null;
                boolean zMo15426S9 = false;
                while (c13822b.hasNext()) {
                    int iMo15427T11 = c13822b.mo15427T(AbstractC13570v.f42921a);
                    if (iMo15427T11 == 0) {
                        strMo15435x11 = c13822b.mo15435x();
                    } else if (iMo15427T11 == 1) {
                        c11250bM8100c5 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                    } else if (iMo15427T11 == 2) {
                        c11250bM8100c6 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                    } else if (iMo15427T11 == 3) {
                        c11252dM15089a = AbstractC13551c.m15089a(c13822b, c7781j);
                    } else if (iMo15427T11 != 4) {
                        c13822b.mo15421D();
                    } else {
                        zMo15426S9 = c13822b.mo15426S0();
                    }
                }
                c11666a = new C11674i(strMo15435x11, c11250bM8100c5, c11250bM8100c6, c11252dM15089a, zMo15426S9);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "sh":
                C11249a c11249a2 = null;
                C15384c c15384c10 = AbstractC13545A.f42868a;
                String strMo15435x12 = null;
                int iMo15431g5 = 0;
                boolean zMo15426S10 = false;
                while (c13822b.hasNext()) {
                    int iMo15427T12 = c13822b.mo15427T(AbstractC13545A.f42868a);
                    if (iMo15427T12 == 0) {
                        strMo15435x12 = c13822b.mo15435x();
                    } else if (iMo15427T12 == 1) {
                        iMo15431g5 = c13822b.mo15431g0();
                    } else if (iMo15427T12 == 2) {
                        c11249a2 = new C11249a(5, AbstractC13564p.m15097a(c13822b, c7781j, AbstractC14418g.m15932c(), C13572x.f42923Y, false));
                    } else if (iMo15427T12 != 3) {
                        c13822b.mo15421D();
                    } else {
                        zMo15426S10 = c13822b.mo15426S0();
                    }
                }
                c11678m = new C11679n(strMo15435x12, iMo15431g5, c11249a2, zMo15426S10);
                c11666a = c11678m;
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "sr":
                C15384c c15384c11 = AbstractC13568t.f42919a;
                boolean z10 = iMo15431g0 == 3;
                int i16 = 0;
                boolean zMo15426S11 = false;
                String strMo15435x13 = null;
                C11250b c11250bM8100c7 = null;
                InterfaceC11253e interfaceC11253eM15088b3 = null;
                C11250b c11250bM8100c8 = null;
                C11250b c11250bM8100c9 = null;
                C11250b c11250bM8100c10 = null;
                C11250b c11250bM8100c11 = null;
                C11250b c11250bM8100c12 = null;
                while (c13822b.hasNext()) {
                    switch (c13822b.mo15427T(AbstractC13568t.f42919a)) {
                        case 0:
                            strMo15435x13 = c13822b.mo15435x();
                            break;
                        case 1:
                            int iMo15431g6 = c13822b.mo15431g0();
                            int[] iArrM27k = AbstractC0010F.m27k(2);
                            int length = iArrM27k.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= length) {
                                    i16 = 0;
                                }
                                int i18 = iArrM27k[i17];
                                if (i18 == 1) {
                                    i10 = 1;
                                } else {
                                    if (i18 != 2) {
                                        throw null;
                                    }
                                    i10 = 2;
                                }
                                if (i10 == iMo15431g6) {
                                    i16 = i18;
                                }
                                i17++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            c11250bM8100c7 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                            break;
                        case 3:
                            interfaceC11253eM15088b3 = AbstractC13549a.m15088b(c13822b, c7781j);
                            break;
                        case 4:
                            c11250bM8100c8 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                            break;
                        case 5:
                            c11250bM8100c10 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                            break;
                        case 6:
                            c11250bM8100c12 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                            break;
                        case 7:
                            c11250bM8100c9 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                            break;
                        case 8:
                            c11250bM8100c11 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                            break;
                        case 9:
                            zMo15426S11 = c13822b.mo15426S0();
                            break;
                        case 10:
                            z10 = c13822b.mo15431g0() == 3;
                            break;
                        default:
                            c13822b.mo15428W();
                            c13822b.mo15421D();
                            break;
                    }
                }
                c11666a = new C11673h(strMo15435x13, i16, c11250bM8100c7, interfaceC11253eM15088b3, c11250bM8100c8, c11250bM8100c9, c11250bM8100c10, c11250bM8100c11, c11250bM8100c12, zMo15426S11, z10);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "st":
                C15384c c15384c12 = AbstractC13546B.f42869a;
                ArrayList arrayList3 = new ArrayList();
                C11249a c11249aM8102e3 = null;
                String strMo15435x14 = null;
                ?? r20 = 0;
                C11249a c11249aM8099b2 = null;
                C11250b c11250bM8100c13 = null;
                int i19 = 0;
                int i20 = 0;
                boolean zMo15426S12 = false;
                float fMo15423O2 = 0.0f;
                while (c13822b.hasNext()) {
                    switch (c13822b.mo15427T(AbstractC13546B.f42869a)) {
                        case 0:
                            strMo15435x14 = c13822b.mo15435x();
                            r20 = r20;
                            break;
                        case 1:
                            c11249aM8099b2 = AbstractC7846A5.m8099b(c13822b, c7781j);
                            r20 = r20;
                            break;
                        case 2:
                            c11250bM8100c13 = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                            r20 = r20;
                            break;
                        case 3:
                            c11249aM8102e3 = AbstractC7846A5.m8102e(c13822b, c7781j);
                            r20 = r20;
                            break;
                        case 4:
                            i19 = AbstractC0010F.m27k(3)[c13822b.mo15431g0() - 1];
                            r20 = r20;
                            break;
                        case 5:
                            i20 = AbstractC0010F.m27k(3)[c13822b.mo15431g0() - 1];
                            r20 = r20;
                            break;
                        case 6:
                            fMo15423O2 = (float) c13822b.mo15423O();
                            r20 = r20;
                            break;
                        case 7:
                            zMo15426S12 = c13822b.mo15426S0();
                            r20 = r20;
                            break;
                        case 8:
                            c13822b.mo15429a();
                            ?? r21 = r20;
                            while (c13822b.hasNext()) {
                                c13822b.mo15430e();
                                InterfaceC11667b interfaceC11667b = c11666a;
                                Object objM8100c = interfaceC11667b;
                                ?? Mo15435x = interfaceC11667b;
                                while (c13822b.hasNext()) {
                                    int iMo15427T13 = c13822b.mo15427T(AbstractC13546B.f42870b);
                                    if (iMo15427T13 == 0) {
                                        Mo15435x = c13822b.mo15435x();
                                    } else if (iMo15427T13 != 1) {
                                        c13822b.mo15428W();
                                        c13822b.mo15421D();
                                    } else {
                                        objM8100c = AbstractC7846A5.m8100c(c13822b, c7781j, true);
                                    }
                                    Mo15435x = Mo15435x;
                                    objM8100c = objM8100c;
                                }
                                c13822b.mo15434m();
                                Mo15435x.getClass();
                                switch (Mo15435x) {
                                    case "d":
                                    case "g":
                                        c7781j.f24594o = true;
                                        arrayList3.add(objM8100c);
                                        break;
                                    case "o":
                                        r21 = objM8100c;
                                        break;
                                }
                                c11666a = null;
                                r21 = r21;
                            }
                            c13822b.mo15433k();
                            r20 = r21;
                            if (arrayList3.size() == 1) {
                                arrayList3.add((C11250b) arrayList3.get(0));
                                r20 = r21;
                            }
                            break;
                        default:
                            c13822b.mo15421D();
                            continue;
                    }
                    c11666a = null;
                }
                c11666a = new C11680o(strMo15435x14, r20, arrayList3, c11249aM8099b2, c11249aM8102e3 == null ? new C11249a(2, Collections.singletonList(new C14935a(100))) : c11249aM8102e3, c11250bM8100c13, i19 == 0 ? 1 : i19, i20 == 0 ? 1 : i20, fMo15423O2, zMo15426S12);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "tm":
                C15384c c15384c13 = AbstractC13547C.f42871a;
                String strMo15435x15 = null;
                C11250b c11250bM8100c14 = null;
                C11250b c11250bM8100c15 = null;
                C11250b c11250bM8100c16 = null;
                int i21 = 0;
                boolean zMo15426S13 = false;
                while (c13822b.hasNext()) {
                    int iMo15427T14 = c13822b.mo15427T(AbstractC13547C.f42871a);
                    if (iMo15427T14 == 0) {
                        c11250bM8100c14 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                    } else if (iMo15427T14 == 1) {
                        c11250bM8100c15 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                    } else if (iMo15427T14 == 2) {
                        c11250bM8100c16 = AbstractC7846A5.m8100c(c13822b, c7781j, false);
                    } else if (iMo15427T14 == 3) {
                        strMo15435x15 = c13822b.mo15435x();
                    } else if (iMo15427T14 == 4) {
                        int iMo15431g7 = c13822b.mo15431g0();
                        if (iMo15431g7 == 1) {
                            i21 = 1;
                        } else {
                            if (iMo15431g7 != 2) {
                                throw new IllegalArgumentException(AbstractC10763a.m11048f(iMo15431g7, "Unknown trim path type "));
                            }
                            i21 = 2;
                        }
                    } else if (iMo15427T14 != 5) {
                        c13822b.mo15421D();
                    } else {
                        zMo15426S13 = c13822b.mo15426S0();
                    }
                }
                c11666a = new C11681p(strMo15435x15, i21, c11250bM8100c14, c11250bM8100c15, c11250bM8100c16, zMo15426S13);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            case "tr":
                c11666a = AbstractC13551c.m15089a(c13822b, c7781j);
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
            default:
                AbstractC14413b.m15913b("Unknown shape type ".concat(strMo15435x));
                while (c13822b.hasNext()) {
                    c13822b.mo15421D();
                }
                c13822b.mo15434m();
                return c11666a;
        }
    }
}
