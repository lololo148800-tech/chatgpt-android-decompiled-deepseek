package p523V9;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p056C2.C1512f;
import p1111xl.C21296a;
import p156G1.C2955b;
import p156G1.C2968o;
import p156G1.C2971r;
import p225Im.C3743B;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3777y;
import p647ak.EnumC10647I;
import p759g1.C13800b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p949pj.C18452Z;
import p949pj.C18454a0;
import p949pj.C18456b0;
import p949pj.C18458c0;
import p949pj.C18460d0;
import p949pj.C18462e0;
import p949pj.C18464f0;

/* JADX INFO: renamed from: V9.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8146n0 {
    /* JADX INFO: renamed from: a */
    public static final C21296a m8684a(C21296a c21296a) {
        AbstractC16544l.m18094g(c21296a, "<this>");
        InterfaceC3777y interfaceC3777y = c21296a.f67701b;
        AbstractC16544l.m18091d(interfaceC3777y);
        InterfaceC3777y interfaceC3777y2 = ((C3743B) interfaceC3777y.getArguments().get(0)).f11393b;
        AbstractC16544l.m18091d(interfaceC3777y2);
        InterfaceC3757e classifier = interfaceC3777y2.getClassifier();
        AbstractC16544l.m18092e(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new C21296a((InterfaceC3756d) classifier, interfaceC3777y2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m8685b(ArrayList arrayList) {
        ?? arrayList2;
        long j10;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            arrayList2 = C17689w.f56480Y;
        } else {
            arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int iM19381j = AbstractC17681o.m19381j(arrayList);
            int i10 = 0;
            while (i10 < iM19381j) {
                i10++;
                Object obj2 = arrayList.get(i10);
                C2968o c2968o = (C2968o) obj2;
                C2968o c2968o2 = (C2968o) obj;
                arrayList2.add(new C13800b(AbstractC8088f6.m8536b(Math.abs(C13800b.m15306g(c2968o2.m3795e().m15317d()) - C13800b.m15306g(c2968o.m3795e().m15317d())), Math.abs(C13800b.m15307h(c2968o2.m3795e().m15317d()) - C13800b.m15307h(c2968o.m3795e().m15317d())))));
                obj = obj2;
            }
        }
        if (((Collection) arrayList2).size() == 1) {
            j10 = ((C13800b) AbstractC17680n.m19341Q(arrayList2)).f43584a;
        } else {
            if (arrayList2.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objM19341Q = AbstractC17680n.m19341Q(arrayList2);
            int iM19381j2 = AbstractC17681o.m19381j(arrayList2);
            if (1 <= iM19381j2) {
                int i11 = 1;
                while (true) {
                    objM19341Q = new C13800b(C13800b.m15311l(((C13800b) objM19341Q).f43584a, ((C13800b) arrayList2.get(i11)).f43584a));
                    if (i11 == iM19381j2) {
                        break;
                    }
                    i11++;
                }
            }
            j10 = ((C13800b) objM19341Q).f43584a;
        }
        return C13800b.m15307h(j10) < C13800b.m15306g(j10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m8686c(C1512f c1512f, C2968o c2968o) {
        Object obj = c2968o.m3798i().f8880Y.get(C2971r.f8921g);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            throw new ClassCastException();
        }
        C2968o c2968oM3799j = c2968o.m3799j();
        if (c2968oM3799j == null) {
            return;
        }
        Object obj2 = c2968oM3799j.m3798i().f8880Y.get(C2971r.f8919e);
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            Object obj3 = c2968oM3799j.m3798i().f8880Y.get(C2971r.f8920f);
            C2955b c2955b = (C2955b) (obj3 != null ? obj3 : null);
            if (c2955b == null || (c2955b.f8839a >= 0 && c2955b.f8840b >= 0)) {
                if (c2968o.m3798i().f8880Y.containsKey(C2971r.f8908A)) {
                    ArrayList arrayList = new ArrayList();
                    List listM3790h = C2968o.m3790h(c2968oM3799j, true, 4);
                    int size = listM3790h.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        C2968o c2968o2 = (C2968o) listM3790h.get(i11);
                        if (c2968o2.m3798i().f8880Y.containsKey(C2971r.f8908A)) {
                            arrayList.add(c2968o2);
                            if (c2968o2.f8888c.m22010H() < c2968o.f8888c.m22010H()) {
                                i10++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM8685b = m8685b(arrayList);
                    int i12 = zM8685b ? 0 : i10;
                    int i13 = zM8685b ? i10 : 0;
                    Object obj4 = c2968o.m3798i().f8880Y.get(C2971r.f8908A);
                    if (obj4 == null) {
                        obj4 = Boolean.FALSE;
                    }
                    c1512f.f4042a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, 1, i13, 1, false, ((Boolean) obj4).booleanValue()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC10647I m8687d(Throwable th2) {
        if (th2 instanceof C18454a0) {
            return EnumC10647I.f31584Y;
        }
        if (th2 instanceof C18456b0) {
            return EnumC10647I.f31585Z;
        }
        if (th2 instanceof C18458c0) {
            return EnumC10647I.f31586o0;
        }
        if (th2 instanceof C18462e0) {
            return EnumC10647I.f31587p0;
        }
        if (th2 instanceof C18464f0) {
            return EnumC10647I.f31588q0;
        }
        if (th2 instanceof C18460d0) {
            return EnumC10647I.f31589r0;
        }
        return th2 instanceof C18452Z ? EnumC10647I.f31590s0 : EnumC10647I.f31591t0;
    }
}
