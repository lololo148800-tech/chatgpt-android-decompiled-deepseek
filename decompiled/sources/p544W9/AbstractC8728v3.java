package p544W9;

import android.graphics.Rect;
import io.sentry.C15524y1;
import io.sentry.android.replay.AbstractC15306t;
import io.sentry.android.replay.viewhierarchy.AbstractC15316d;
import io.sentry.android.replay.viewhierarchy.C15313a;
import io.sentry.android.replay.viewhierarchy.C15314b;
import io.sentry.android.replay.viewhierarchy.C15315c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p025An.C0624m;
import p045Bj.C1313k;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21075b0;
import p1095x1.C21060N;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p1140z1.C21715t;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2963j;
import p156G1.C2971r;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3582M;
import p299Ln.C5217b;
import p299Ln.ExecutorC5216a;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8154o0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p635a1.InterfaceC10459q;
import p746fa.C13606o;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p774h1.InterfaceC14366v;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.v3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8728v3 {

    /* JADX INFO: renamed from: a */
    public static WeakReference f26664a;

    /* JADX INFO: renamed from: a */
    public static final Object m9451a(C13606o c13606o, AbstractC19687c abstractC19687c) throws Exception {
        if (!c13606o.m15131j()) {
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
            c0624m.m1262r();
            c13606o.m15123b(ExecutorC5216a.f16951Y, new C5217b(c0624m));
            Object objM1261q = c0624m.m1261q();
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            return objM1261q;
        }
        Exception excM15129h = c13606o.m15129h();
        if (excM15129h != null) {
            throw excM15129h;
        }
        if (!c13606o.f42985d) {
            return c13606o.m15130i();
        }
        throw new CancellationException("Task " + c13606o + " was cancelled normally.");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX INFO: renamed from: b */
    public static boolean m9452b(C21658D c21658d, boolean z6, C15524y1 c15524y1) {
        C2963j c2963jM22056q;
        String str;
        C2963j c2963jM22056q2 = c21658d.m22056q();
        Object obj = null;
        if (c2963jM22056q2 != null) {
            Object obj2 = c2963jM22056q2.f8880Y.get(AbstractC15306t.f47820a);
            obj = (String) (obj2 != null ? obj2 : null);
        }
        if (AbstractC16544l.m18089b(obj, "unmask")) {
            return false;
        }
        if (AbstractC16544l.m18089b(obj, "mask")) {
            return true;
        }
        if (z6) {
            str = "android.widget.ImageView";
        } else {
            C2963j c2963jM22056q3 = c21658d.m22056q();
            if (c2963jM22056q3 != null) {
                if (c2963jM22056q3.f8880Y.containsKey(C2971r.f8935u)) {
                    str = "android.widget.TextView";
                } else {
                    c2963jM22056q = c21658d.m22056q();
                    if (c2963jM22056q != null) {
                        if (c2963jM22056q.f8880Y.containsKey(AbstractC2962i.f8862i)) {
                            str = "android.widget.TextView";
                        }
                    }
                    str = "android.view.View";
                }
            } else {
                c2963jM22056q = c21658d.m22056q();
                if (c2963jM22056q != null) {
                    if (c2963jM22056q.f8880Y.containsKey(AbstractC2962i.f8862i)) {
                        str = "android.widget.TextView";
                    }
                }
                str = "android.view.View";
            }
        }
        if (c15524y1.getExperimental().f48340a.f47052d.contains(str)) {
            return false;
        }
        return c15524y1.getExperimental().f48340a.f47051c.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0211  */
    /* JADX WARN: Code duplicated, block: B:102:0x0214 A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #0 {all -> 0x0221, blocks: (B:97:0x01f8, B:99:0x020e, B:102:0x0214), top: B:179:0x01f8 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0224  */
    /* JADX WARN: Code duplicated, block: B:110:0x022d  */
    /* JADX WARN: Code duplicated, block: B:114:0x023a  */
    /* JADX WARN: Code duplicated, block: B:119:0x024c  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0258  */
    /* JADX WARN: Code duplicated, block: B:127:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0270  */
    /* JADX WARN: Code duplicated, block: B:131:0x0273  */
    /* JADX WARN: Code duplicated, block: B:132:0x0282  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f7 A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #1 {all -> 0x02ff, blocks: (B:138:0x02e1, B:140:0x02f7), top: B:181:0x02e1 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02fb A[LOOP:2: B:135:0x02c5->B:142:0x02fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0302  */
    /* JADX WARN: Code duplicated, block: B:148:0x0309  */
    /* JADX WARN: Code duplicated, block: B:151:0x0311  */
    /* JADX WARN: Code duplicated, block: B:154:0x031c  */
    /* JADX WARN: Code duplicated, block: B:156:0x032c  */
    /* JADX WARN: Code duplicated, block: B:161:0x033e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0351  */
    /* JADX WARN: Code duplicated, block: B:166:0x035a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0362  */
    /* JADX WARN: Code duplicated, block: B:179:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df  */
    /* JADX WARN: Code duplicated, block: B:99:0x020e A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:97:0x01f8, B:99:0x020e, B:102:0x0214), top: B:179:0x01f8 }] */
    /* JADX INFO: renamed from: c */
    public static void m9453c(C21658D c21658d, AbstractC15316d abstractC15316d, boolean z6, C15524y1 c15524y1) {
        AbstractC15316d abstractC15316d2;
        boolean z10;
        C21658D c21658d2;
        C15524y1 c15524y2;
        AbstractC15316d abstractC15316d3;
        Rect rect;
        boolean z11;
        boolean z12;
        boolean z13;
        List listM22007E;
        int size;
        int i10;
        AbstractC17140a abstractC17140a;
        boolean z14;
        AbstractC15316d c15313a;
        boolean z15;
        boolean z16;
        String name;
        InterfaceC10459q interfaceC10459q;
        Object obj;
        boolean z17;
        ArrayList arrayList;
        List listM22007E2;
        int size2;
        int i11;
        boolean z18;
        C14365u c14365u;
        C3578I c3578i;
        C14365u c14365u2;
        C0095w0 c0095w0;
        Integer numValueOf;
        C3577H c3577h;
        C3582M c3582m;
        InterfaceC10459q interfaceC10459q2;
        String name2;
        Object obj2;
        InterfaceC14366v interfaceC14366v;
        C14365u c14365u3;
        Object obj3;
        C2954a c2954a;
        InterfaceC1436k interfaceC1436k;
        AbstractC15316d abstractC15316d4 = abstractC15316d;
        C15524y1 c15524y3 = c15524y1;
        C6543a c6543a = (C6543a) c21658d.m22054p();
        C6546d c6546d = c6543a.f21176Y;
        if (c6546d.m7108m()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(c6546d.f21184o0);
        int i12 = 0;
        for (int i13 = c6546d.f21184o0; i12 < i13; i13 = i13) {
            C21658D c21658d3 = (C21658D) c6543a.get(i12);
            if (c21658d3.m22025W() && c21658d3.m22024V()) {
                C1313k c1313k = c21658d3.f68638I0;
                if (z6) {
                    f26664a = new WeakReference(AbstractC21075b0.m21568i((C21715t) c1313k.f3468c));
                }
                C2963j c2963jM22056q = c21658d3.m22056q();
                C21715t c21715t = (C21715t) c1313k.f3468c;
                WeakReference weakReference = f26664a;
                InterfaceC21098s interfaceC21098sM21568i = weakReference != null ? (InterfaceC21098s) weakReference.get() : null;
                AbstractC16544l.m18094g(c21715t, "<this>");
                if (interfaceC21098sM21568i == null) {
                    interfaceC21098sM21568i = AbstractC21075b0.m21568i(c21715t);
                }
                float fMo21524k = (int) (interfaceC21098sM21568i.mo21524k() >> 32);
                float fMo21524k2 = (int) (interfaceC21098sM21568i.mo21524k() & 4294967295L);
                C13801c c13801cMo21528y = interfaceC21098sM21568i.mo21528y(c21715t, true);
                float f10 = c13801cMo21528y.f43586a;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > fMo21524k) {
                    f10 = fMo21524k;
                }
                float f11 = c13801cMo21528y.f43587b;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > fMo21524k2) {
                    f11 = fMo21524k2;
                }
                float f12 = c13801cMo21528y.f43588c;
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                if (f12 <= fMo21524k) {
                    fMo21524k = f12;
                }
                float f13 = c13801cMo21528y.f43589d;
                float f14 = f13 >= 0.0f ? f13 : 0.0f;
                if (f14 <= fMo21524k2) {
                    fMo21524k2 = f14;
                }
                if (f10 == fMo21524k || f11 == fMo21524k2) {
                    rect = new Rect();
                } else {
                    long jMo21520d = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(f10, f11));
                    long jMo21520d2 = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(fMo21524k, f11));
                    long jMo21520d3 = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(fMo21524k, fMo21524k2));
                    long jMo21520d4 = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(f10, fMo21524k2));
                    float fM15306g = C13800b.m15306g(jMo21520d);
                    float fM15306g2 = C13800b.m15306g(jMo21520d2);
                    float fM15306g3 = C13800b.m15306g(jMo21520d4);
                    float fM15306g4 = C13800b.m15306g(jMo21520d3);
                    float fMin = Math.min(fM15306g, Math.min(fM15306g2, Math.min(fM15306g3, fM15306g4)));
                    float fMax = Math.max(fM15306g, Math.max(fM15306g2, Math.max(fM15306g3, fM15306g4)));
                    float fM15307h = C13800b.m15307h(jMo21520d);
                    float fM15307h2 = C13800b.m15307h(jMo21520d2);
                    float fM15307h3 = C13800b.m15307h(jMo21520d4);
                    float fM15307h4 = C13800b.m15307h(jMo21520d3);
                    rect = new Rect((int) fMin, (int) Math.min(fM15307h, Math.min(fM15307h2, Math.min(fM15307h3, fM15307h4))), (int) fMax, (int) Math.max(fM15307h, Math.max(fM15307h2, Math.max(fM15307h3, fM15307h4))));
                }
                if (((AbstractC21678Y) c1313k.f3469d).m22166Q0()) {
                    z11 = false;
                } else if (c2963jM22056q != null) {
                    if (c2963jM22056q.f8880Y.containsKey(C2971r.f8927m)) {
                        z11 = false;
                    } else if (rect.height() > 0 || rect.width() <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else if (rect.height() > 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (c2963jM22056q != null) {
                    z12 = true;
                    z13 = c2963jM22056q.f8880Y.containsKey(AbstractC2962i.f8862i);
                    if (c2963jM22056q != null) {
                        if (c2963jM22056q.f8880Y.containsKey(C2971r.f8935u) == z12) {
                            if (z11 || !m9452b(c21658d3, false, c15524y3)) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            arrayList = new ArrayList();
                            if (c2963jM22056q != null) {
                                obj3 = c2963jM22056q.f8880Y.get(AbstractC2962i.f8854a);
                                if (obj3 == null) {
                                    obj3 = null;
                                }
                                c2954a = (C2954a) obj3;
                                if (c2954a != null && (interfaceC1436k = (InterfaceC1436k) c2954a.f8838b) != null) {
                                }
                            }
                            listM22007E2 = c21658d3.m22007E();
                            size2 = listM22007E2.size();
                            z18 = false;
                            c14365u = null;
                            for (i11 = 0; i11 < size2; i11++) {
                                interfaceC10459q2 = ((C21060N) listM22007E2.get(i11)).f66972a;
                                name2 = interfaceC10459q2.getClass().getName();
                                if (AbstractC21322p.m21667A(name2, "Text", false)) {
                                    try {
                                        Field declaredField = interfaceC10459q2.getClass().getDeclaredField("color");
                                        declaredField.setAccessible(true);
                                        obj2 = declaredField.get(interfaceC10459q2);
                                        if (obj2 instanceof InterfaceC14366v) {
                                            interfaceC14366v = (InterfaceC14366v) obj2;
                                        } else {
                                            interfaceC14366v = null;
                                        }
                                        if (interfaceC14366v != null) {
                                            c14365u3 = new C14365u(interfaceC14366v.mo4719a());
                                        } else {
                                            c14365u3 = null;
                                        }
                                        c14365u = c14365u3;
                                    } catch (Throwable unused) {
                                        c14365u = null;
                                    }
                                } else if (AbstractC21322p.m21667A(name2, "Fill", false)) {
                                    z18 = true;
                                }
                            }
                            c3578i = (C3578I) AbstractC17680n.m19343S(arrayList);
                            if (c3578i != null || (c3577h = c3578i.f10892a) == null || (c3582m = c3577h.f10883b) == null) {
                                c14365u2 = null;
                            } else {
                                c14365u2 = new C14365u(c3582m.m4277d());
                            }
                            if (c14365u2 != null) {
                                c14365u = c14365u2;
                            } else if (c14365u2.f45062a != C14365u.f45060j) {
                                c14365u = c14365u2;
                            }
                            if (!arrayList.isEmpty() || z13) {
                                c0095w0 = null;
                            } else {
                                c0095w0 = new C0095w0((C3578I) AbstractC17680n.m19341Q(arrayList), z18);
                            }
                            if (c14365u != null) {
                                numValueOf = Integer.valueOf(AbstractC14334L.m15617F(c14365u.f45062a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            C15315c c15315c = new C15315c(c0095w0, numValueOf, 0, 0, rect.left, rect.top, c21658d3.m22011I(), c21658d3.m22059s(), abstractC15316d.f47845c, i12, abstractC15316d, z17, true, z11, rect);
                            abstractC15316d2 = abstractC15316d;
                            c15524y2 = c15524y1;
                            abstractC15316d3 = c15315c;
                            c21658d2 = c21658d3;
                            z10 = false;
                        } else if (z13) {
                            if (z11) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            arrayList = new ArrayList();
                            if (c2963jM22056q != null) {
                                obj3 = c2963jM22056q.f8880Y.get(AbstractC2962i.f8854a);
                                if (obj3 == null) {
                                    obj3 = null;
                                }
                                c2954a = (C2954a) obj3;
                                if (c2954a != null) {
                                }
                            }
                            listM22007E2 = c21658d3.m22007E();
                            size2 = listM22007E2.size();
                            z18 = false;
                            c14365u = null;
                            while (i11 < size2) {
                                interfaceC10459q2 = ((C21060N) listM22007E2.get(i11)).f66972a;
                                name2 = interfaceC10459q2.getClass().getName();
                                if (AbstractC21322p.m21667A(name2, "Text", false)) {
                                    Field declaredField2 = interfaceC10459q2.getClass().getDeclaredField("color");
                                    declaredField2.setAccessible(true);
                                    obj2 = declaredField2.get(interfaceC10459q2);
                                    if (obj2 instanceof InterfaceC14366v) {
                                        interfaceC14366v = (InterfaceC14366v) obj2;
                                    } else {
                                        interfaceC14366v = null;
                                    }
                                    if (interfaceC14366v != null) {
                                        c14365u3 = new C14365u(interfaceC14366v.mo4719a());
                                    } else {
                                        c14365u3 = null;
                                    }
                                    c14365u = c14365u3;
                                } else if (AbstractC21322p.m21667A(name2, "Fill", false)) {
                                    z18 = true;
                                }
                            }
                            c3578i = (C3578I) AbstractC17680n.m19343S(arrayList);
                            if (c3578i != null) {
                                c14365u2 = null;
                            } else {
                                c14365u2 = null;
                            }
                            if (c14365u2 != null) {
                                c14365u = c14365u2;
                            } else if (c14365u2.f45062a != C14365u.f45060j) {
                                c14365u = c14365u2;
                            }
                            if (arrayList.isEmpty()) {
                                c0095w0 = null;
                            } else {
                                c0095w0 = null;
                            }
                            if (c14365u != null) {
                                numValueOf = Integer.valueOf(AbstractC14334L.m15617F(c14365u.f45062a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            C15315c c15315c2 = new C15315c(c0095w0, numValueOf, 0, 0, rect.left, rect.top, c21658d3.m22011I(), c21658d3.m22059s(), abstractC15316d.f47845c, i12, abstractC15316d, z17, true, z11, rect);
                            abstractC15316d2 = abstractC15316d;
                            c15524y2 = c15524y1;
                            abstractC15316d3 = c15315c2;
                            c21658d2 = c21658d3;
                            z10 = false;
                        } else {
                            listM22007E = c21658d3.m22007E();
                            size = listM22007E.size();
                            i10 = 0;
                            while (true) {
                                if (i10 < size) {
                                    interfaceC10459q = ((C21060N) listM22007E.get(i10)).f66972a;
                                    z10 = false;
                                    if (AbstractC21322p.m21667A(interfaceC10459q.getClass().getName(), tpXhEMGxfXFVSh.TJcptil, false)) {
                                        try {
                                            Field declaredField3 = interfaceC10459q.getClass().getDeclaredField("painter");
                                            declaredField3.setAccessible(true);
                                            obj = declaredField3.get(interfaceC10459q);
                                            if (obj instanceof AbstractC17140a) {
                                                abstractC17140a = (AbstractC17140a) obj;
                                                break;
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    } else {
                                        i10++;
                                    }
                                } else {
                                    z10 = false;
                                }
                                abstractC17140a = null;
                                break;
                            }
                            if (abstractC17140a != null) {
                                c15524y2 = c15524y1;
                                c21658d2 = c21658d3;
                                if (z11 || !m9452b(c21658d2, true, c15524y2)) {
                                    z15 = z10;
                                } else {
                                    z15 = true;
                                }
                                int iM22011I = c21658d2.m22011I();
                                int iM22059s = c21658d2.m22059s();
                                if (z15) {
                                    name = abstractC17140a.getClass().getName();
                                    if (!AbstractC21322p.m21667A(name, "Vector", z10) || AbstractC21322p.m21667A(name, "Color", z10) || AbstractC21322p.m21667A(name, "Brush", z10)) {
                                        z16 = z10;
                                    } else {
                                        z16 = true;
                                    }
                                } else {
                                    z16 = z10;
                                }
                                abstractC15316d2 = abstractC15316d;
                                c15313a = new C15314b(iM22011I, iM22059s, abstractC15316d2.f47845c, abstractC15316d, z16, rect);
                            } else {
                                abstractC15316d2 = abstractC15316d;
                                c15524y2 = c15524y1;
                                c21658d2 = c21658d3;
                                if (z11 || !m9452b(c21658d2, z10, c15524y2)) {
                                    z14 = z10;
                                } else {
                                    z14 = true;
                                }
                                c15313a = new C15313a(c21658d2.m22011I(), c21658d2.m22059s(), abstractC15316d2.f47845c, abstractC15316d, z14, rect);
                            }
                            abstractC15316d3 = c15313a;
                        }
                    } else if (z13) {
                        if (z11) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        arrayList = new ArrayList();
                        if (c2963jM22056q != null) {
                            obj3 = c2963jM22056q.f8880Y.get(AbstractC2962i.f8854a);
                            if (obj3 == null) {
                                obj3 = null;
                            }
                            c2954a = (C2954a) obj3;
                            if (c2954a != null) {
                            }
                        }
                        listM22007E2 = c21658d3.m22007E();
                        size2 = listM22007E2.size();
                        z18 = false;
                        c14365u = null;
                        while (i11 < size2) {
                            interfaceC10459q2 = ((C21060N) listM22007E2.get(i11)).f66972a;
                            name2 = interfaceC10459q2.getClass().getName();
                            if (AbstractC21322p.m21667A(name2, "Text", false)) {
                                Field declaredField4 = interfaceC10459q2.getClass().getDeclaredField("color");
                                declaredField4.setAccessible(true);
                                obj2 = declaredField4.get(interfaceC10459q2);
                                if (obj2 instanceof InterfaceC14366v) {
                                    interfaceC14366v = (InterfaceC14366v) obj2;
                                } else {
                                    interfaceC14366v = null;
                                }
                                if (interfaceC14366v != null) {
                                    c14365u3 = new C14365u(interfaceC14366v.mo4719a());
                                } else {
                                    c14365u3 = null;
                                }
                                c14365u = c14365u3;
                            } else if (AbstractC21322p.m21667A(name2, "Fill", false)) {
                                z18 = true;
                            }
                        }
                        c3578i = (C3578I) AbstractC17680n.m19343S(arrayList);
                        if (c3578i != null) {
                            c14365u2 = null;
                        } else {
                            c14365u2 = null;
                        }
                        if (c14365u2 != null) {
                            c14365u = c14365u2;
                        } else if (c14365u2.f45062a != C14365u.f45060j) {
                            c14365u = c14365u2;
                        }
                        if (arrayList.isEmpty()) {
                            c0095w0 = null;
                        } else {
                            c0095w0 = null;
                        }
                        if (c14365u != null) {
                            numValueOf = Integer.valueOf(AbstractC14334L.m15617F(c14365u.f45062a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        C15315c c15315c3 = new C15315c(c0095w0, numValueOf, 0, 0, rect.left, rect.top, c21658d3.m22011I(), c21658d3.m22059s(), abstractC15316d.f47845c, i12, abstractC15316d, z17, true, z11, rect);
                        abstractC15316d2 = abstractC15316d;
                        c15524y2 = c15524y1;
                        abstractC15316d3 = c15315c3;
                        c21658d2 = c21658d3;
                        z10 = false;
                    } else {
                        listM22007E = c21658d3.m22007E();
                        size = listM22007E.size();
                        i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                interfaceC10459q = ((C21060N) listM22007E.get(i10)).f66972a;
                                z10 = false;
                                if (AbstractC21322p.m21667A(interfaceC10459q.getClass().getName(), tpXhEMGxfXFVSh.TJcptil, false)) {
                                    Field declaredField5 = interfaceC10459q.getClass().getDeclaredField("painter");
                                    declaredField5.setAccessible(true);
                                    obj = declaredField5.get(interfaceC10459q);
                                    if (obj instanceof AbstractC17140a) {
                                        abstractC17140a = (AbstractC17140a) obj;
                                        break;
                                    }
                                } else {
                                    i10++;
                                }
                            } else {
                                z10 = false;
                            }
                            abstractC17140a = null;
                            break;
                        }
                        if (abstractC17140a != null) {
                            c15524y2 = c15524y1;
                            c21658d2 = c21658d3;
                            if (z11) {
                                z15 = z10;
                            } else {
                                z15 = z10;
                            }
                            int iM22011I2 = c21658d2.m22011I();
                            int iM22059s2 = c21658d2.m22059s();
                            if (z15) {
                                name = abstractC17140a.getClass().getName();
                                if (AbstractC21322p.m21667A(name, "Vector", z10)) {
                                    z16 = z10;
                                } else {
                                    z16 = z10;
                                }
                            } else {
                                z16 = z10;
                            }
                            abstractC15316d2 = abstractC15316d;
                            c15313a = new C15314b(iM22011I2, iM22059s2, abstractC15316d2.f47845c, abstractC15316d, z16, rect);
                        } else {
                            abstractC15316d2 = abstractC15316d;
                            c15524y2 = c15524y1;
                            c21658d2 = c21658d3;
                            if (z11) {
                                z14 = z10;
                            } else {
                                z14 = z10;
                            }
                            c15313a = new C15313a(c21658d2.m22011I(), c21658d2.m22059s(), abstractC15316d2.f47845c, abstractC15316d, z14, rect);
                        }
                        abstractC15316d3 = c15313a;
                    }
                } else {
                    z12 = true;
                }
                if (c2963jM22056q != null) {
                    if (c2963jM22056q.f8880Y.containsKey(C2971r.f8935u) == z12) {
                        if (z11) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        arrayList = new ArrayList();
                        if (c2963jM22056q != null) {
                            obj3 = c2963jM22056q.f8880Y.get(AbstractC2962i.f8854a);
                            if (obj3 == null) {
                                obj3 = null;
                            }
                            c2954a = (C2954a) obj3;
                            if (c2954a != null) {
                            }
                        }
                        listM22007E2 = c21658d3.m22007E();
                        size2 = listM22007E2.size();
                        z18 = false;
                        c14365u = null;
                        while (i11 < size2) {
                            interfaceC10459q2 = ((C21060N) listM22007E2.get(i11)).f66972a;
                            name2 = interfaceC10459q2.getClass().getName();
                            if (AbstractC21322p.m21667A(name2, "Text", false)) {
                                Field declaredField6 = interfaceC10459q2.getClass().getDeclaredField("color");
                                declaredField6.setAccessible(true);
                                obj2 = declaredField6.get(interfaceC10459q2);
                                if (obj2 instanceof InterfaceC14366v) {
                                    interfaceC14366v = (InterfaceC14366v) obj2;
                                } else {
                                    interfaceC14366v = null;
                                }
                                if (interfaceC14366v != null) {
                                    c14365u3 = new C14365u(interfaceC14366v.mo4719a());
                                } else {
                                    c14365u3 = null;
                                }
                                c14365u = c14365u3;
                            } else if (AbstractC21322p.m21667A(name2, "Fill", false)) {
                                z18 = true;
                            }
                        }
                        c3578i = (C3578I) AbstractC17680n.m19343S(arrayList);
                        if (c3578i != null) {
                            c14365u2 = null;
                        } else {
                            c14365u2 = null;
                        }
                        if (c14365u2 != null) {
                            c14365u = c14365u2;
                        } else if (c14365u2.f45062a != C14365u.f45060j) {
                            c14365u = c14365u2;
                        }
                        if (arrayList.isEmpty()) {
                            c0095w0 = null;
                        } else {
                            c0095w0 = null;
                        }
                        if (c14365u != null) {
                            numValueOf = Integer.valueOf(AbstractC14334L.m15617F(c14365u.f45062a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        C15315c c15315c4 = new C15315c(c0095w0, numValueOf, 0, 0, rect.left, rect.top, c21658d3.m22011I(), c21658d3.m22059s(), abstractC15316d.f47845c, i12, abstractC15316d, z17, true, z11, rect);
                        abstractC15316d2 = abstractC15316d;
                        c15524y2 = c15524y1;
                        abstractC15316d3 = c15315c4;
                        c21658d2 = c21658d3;
                        z10 = false;
                    } else if (z13) {
                        if (z11) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        arrayList = new ArrayList();
                        if (c2963jM22056q != null) {
                            obj3 = c2963jM22056q.f8880Y.get(AbstractC2962i.f8854a);
                            if (obj3 == null) {
                                obj3 = null;
                            }
                            c2954a = (C2954a) obj3;
                            if (c2954a != null) {
                            }
                        }
                        listM22007E2 = c21658d3.m22007E();
                        size2 = listM22007E2.size();
                        z18 = false;
                        c14365u = null;
                        while (i11 < size2) {
                            interfaceC10459q2 = ((C21060N) listM22007E2.get(i11)).f66972a;
                            name2 = interfaceC10459q2.getClass().getName();
                            if (AbstractC21322p.m21667A(name2, "Text", false)) {
                                Field declaredField7 = interfaceC10459q2.getClass().getDeclaredField("color");
                                declaredField7.setAccessible(true);
                                obj2 = declaredField7.get(interfaceC10459q2);
                                if (obj2 instanceof InterfaceC14366v) {
                                    interfaceC14366v = (InterfaceC14366v) obj2;
                                } else {
                                    interfaceC14366v = null;
                                }
                                if (interfaceC14366v != null) {
                                    c14365u3 = new C14365u(interfaceC14366v.mo4719a());
                                } else {
                                    c14365u3 = null;
                                }
                                c14365u = c14365u3;
                            } else if (AbstractC21322p.m21667A(name2, "Fill", false)) {
                                z18 = true;
                            }
                        }
                        c3578i = (C3578I) AbstractC17680n.m19343S(arrayList);
                        if (c3578i != null) {
                            c14365u2 = null;
                        } else {
                            c14365u2 = null;
                        }
                        if (c14365u2 != null) {
                            c14365u = c14365u2;
                        } else if (c14365u2.f45062a != C14365u.f45060j) {
                            c14365u = c14365u2;
                        }
                        if (arrayList.isEmpty()) {
                            c0095w0 = null;
                        } else {
                            c0095w0 = null;
                        }
                        if (c14365u != null) {
                            numValueOf = Integer.valueOf(AbstractC14334L.m15617F(c14365u.f45062a) | (-16777216));
                        } else {
                            numValueOf = null;
                        }
                        C15315c c15315c5 = new C15315c(c0095w0, numValueOf, 0, 0, rect.left, rect.top, c21658d3.m22011I(), c21658d3.m22059s(), abstractC15316d.f47845c, i12, abstractC15316d, z17, true, z11, rect);
                        abstractC15316d2 = abstractC15316d;
                        c15524y2 = c15524y1;
                        abstractC15316d3 = c15315c5;
                        c21658d2 = c21658d3;
                        z10 = false;
                    } else {
                        listM22007E = c21658d3.m22007E();
                        size = listM22007E.size();
                        i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                interfaceC10459q = ((C21060N) listM22007E.get(i10)).f66972a;
                                z10 = false;
                                if (AbstractC21322p.m21667A(interfaceC10459q.getClass().getName(), tpXhEMGxfXFVSh.TJcptil, false)) {
                                    Field declaredField8 = interfaceC10459q.getClass().getDeclaredField("painter");
                                    declaredField8.setAccessible(true);
                                    obj = declaredField8.get(interfaceC10459q);
                                    if (obj instanceof AbstractC17140a) {
                                        abstractC17140a = (AbstractC17140a) obj;
                                        break;
                                    }
                                } else {
                                    i10++;
                                }
                            } else {
                                z10 = false;
                            }
                            abstractC17140a = null;
                            break;
                        }
                        if (abstractC17140a != null) {
                            c15524y2 = c15524y1;
                            c21658d2 = c21658d3;
                            if (z11) {
                                z15 = z10;
                            } else {
                                z15 = z10;
                            }
                            int iM22011I3 = c21658d2.m22011I();
                            int iM22059s3 = c21658d2.m22059s();
                            if (z15) {
                                name = abstractC17140a.getClass().getName();
                                if (AbstractC21322p.m21667A(name, "Vector", z10)) {
                                    z16 = z10;
                                } else {
                                    z16 = z10;
                                }
                            } else {
                                z16 = z10;
                            }
                            abstractC15316d2 = abstractC15316d;
                            c15313a = new C15314b(iM22011I3, iM22059s3, abstractC15316d2.f47845c, abstractC15316d, z16, rect);
                        } else {
                            abstractC15316d2 = abstractC15316d;
                            c15524y2 = c15524y1;
                            c21658d2 = c21658d3;
                            if (z11) {
                                z14 = z10;
                            } else {
                                z14 = z10;
                            }
                            c15313a = new C15313a(c21658d2.m22011I(), c21658d2.m22059s(), abstractC15316d2.f47845c, abstractC15316d, z14, rect);
                        }
                        abstractC15316d3 = c15313a;
                    }
                } else if (z13) {
                    if (z11) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    arrayList = new ArrayList();
                    if (c2963jM22056q != null) {
                        obj3 = c2963jM22056q.f8880Y.get(AbstractC2962i.f8854a);
                        if (obj3 == null) {
                            obj3 = null;
                        }
                        c2954a = (C2954a) obj3;
                        if (c2954a != null) {
                        }
                    }
                    listM22007E2 = c21658d3.m22007E();
                    size2 = listM22007E2.size();
                    z18 = false;
                    c14365u = null;
                    while (i11 < size2) {
                        interfaceC10459q2 = ((C21060N) listM22007E2.get(i11)).f66972a;
                        name2 = interfaceC10459q2.getClass().getName();
                        if (AbstractC21322p.m21667A(name2, "Text", false)) {
                            Field declaredField9 = interfaceC10459q2.getClass().getDeclaredField("color");
                            declaredField9.setAccessible(true);
                            obj2 = declaredField9.get(interfaceC10459q2);
                            if (obj2 instanceof InterfaceC14366v) {
                                interfaceC14366v = (InterfaceC14366v) obj2;
                            } else {
                                interfaceC14366v = null;
                            }
                            if (interfaceC14366v != null) {
                                c14365u3 = new C14365u(interfaceC14366v.mo4719a());
                            } else {
                                c14365u3 = null;
                            }
                            c14365u = c14365u3;
                        } else if (AbstractC21322p.m21667A(name2, "Fill", false)) {
                            z18 = true;
                        }
                    }
                    c3578i = (C3578I) AbstractC17680n.m19343S(arrayList);
                    if (c3578i != null) {
                        c14365u2 = null;
                    } else {
                        c14365u2 = null;
                    }
                    if (c14365u2 != null) {
                        c14365u = c14365u2;
                    } else if (c14365u2.f45062a != C14365u.f45060j) {
                        c14365u = c14365u2;
                    }
                    if (arrayList.isEmpty()) {
                        c0095w0 = null;
                    } else {
                        c0095w0 = null;
                    }
                    if (c14365u != null) {
                        numValueOf = Integer.valueOf(AbstractC14334L.m15617F(c14365u.f45062a) | (-16777216));
                    } else {
                        numValueOf = null;
                    }
                    C15315c c15315c6 = new C15315c(c0095w0, numValueOf, 0, 0, rect.left, rect.top, c21658d3.m22011I(), c21658d3.m22059s(), abstractC15316d.f47845c, i12, abstractC15316d, z17, true, z11, rect);
                    abstractC15316d2 = abstractC15316d;
                    c15524y2 = c15524y1;
                    abstractC15316d3 = c15315c6;
                    c21658d2 = c21658d3;
                    z10 = false;
                } else {
                    listM22007E = c21658d3.m22007E();
                    size = listM22007E.size();
                    i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            interfaceC10459q = ((C21060N) listM22007E.get(i10)).f66972a;
                            z10 = false;
                            if (AbstractC21322p.m21667A(interfaceC10459q.getClass().getName(), tpXhEMGxfXFVSh.TJcptil, false)) {
                                Field declaredField10 = interfaceC10459q.getClass().getDeclaredField("painter");
                                declaredField10.setAccessible(true);
                                obj = declaredField10.get(interfaceC10459q);
                                if (obj instanceof AbstractC17140a) {
                                    abstractC17140a = (AbstractC17140a) obj;
                                    break;
                                }
                            } else {
                                i10++;
                            }
                        } else {
                            z10 = false;
                        }
                        abstractC17140a = null;
                        break;
                    }
                    if (abstractC17140a != null) {
                        c15524y2 = c15524y1;
                        c21658d2 = c21658d3;
                        if (z11) {
                            z15 = z10;
                        } else {
                            z15 = z10;
                        }
                        int iM22011I4 = c21658d2.m22011I();
                        int iM22059s4 = c21658d2.m22059s();
                        if (z15) {
                            name = abstractC17140a.getClass().getName();
                            if (AbstractC21322p.m21667A(name, "Vector", z10)) {
                                z16 = z10;
                            } else {
                                z16 = z10;
                            }
                        } else {
                            z16 = z10;
                        }
                        abstractC15316d2 = abstractC15316d;
                        c15313a = new C15314b(iM22011I4, iM22059s4, abstractC15316d2.f47845c, abstractC15316d, z16, rect);
                    } else {
                        abstractC15316d2 = abstractC15316d;
                        c15524y2 = c15524y1;
                        c21658d2 = c21658d3;
                        if (z11) {
                            z14 = z10;
                        } else {
                            z14 = z10;
                        }
                        c15313a = new C15313a(c21658d2.m22011I(), c21658d2.m22059s(), abstractC15316d2.f47845c, abstractC15316d, z14, rect);
                    }
                    abstractC15316d3 = c15313a;
                }
            } else {
                i12 = i12;
                abstractC15316d2 = abstractC15316d4;
                z10 = false;
                c21658d2 = c21658d3;
                c15524y2 = c15524y3;
                abstractC15316d3 = null;
            }
            ArrayList arrayList3 = arrayList2;
            if (abstractC15316d3 != null) {
                arrayList3.add(abstractC15316d3);
                m9453c(c21658d2, abstractC15316d3, z10, c15524y2);
            }
            i12++;
            arrayList2 = arrayList3;
            c15524y3 = c15524y2;
            abstractC15316d4 = abstractC15316d2;
            c6543a = c6543a;
        }
        abstractC15316d4.f47848f = arrayList2;
    }
}
