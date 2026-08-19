package p994rk;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1157zk.C22212b;
import p822j2.C16056m;
import p909nm.AbstractC17681o;
import pk.C18496a;

/* JADX INFO: renamed from: rk.d2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19157d2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m20309a(ConstraintLayout constraintLayout, C16056m c16056m, ArrayList arrayList, ArrayList arrayList2, int[] iArr, StyleElements.PositionType positionType, int i10) {
        double d10;
        Integer num;
        int i11;
        Object next;
        Object next2;
        ArrayList f40951o0;
        ConstraintLayout root = constraintLayout;
        AbstractC16544l.m18094g(root, "root");
        int i12 = 0;
        if (iArr != null) {
            int i13 = 0;
            for (int i14 : iArr) {
                i13 += i14;
            }
            d10 = i13;
        } else {
            d10 = 0.0d;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i15 = 0;
        while (true) {
            InterfaceC19089I interfaceC19089I = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList2.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    Object next3 = it2.next();
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    int iIntValue = ((Number) next3).intValue();
                    Integer num2 = i16 > 0 ? (Integer) arrayList3.get(i16 - 1) : interfaceC19089I;
                    if (i16 == AbstractC17681o.m19381j(arrayList2)) {
                        c16056m.m17638e(iIntValue, 7, i12, 7);
                        Iterator it3 = arrayList.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((C18496a) next).f58959b.getId() != iIntValue);
                        C18496a c18496a = (C18496a) next;
                        if ((c18496a != null ? c18496a.f58958a : null) != null && num2 != 0) {
                            ((C22212b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(c18496a.f58958a));
                        }
                        num = null;
                    } else {
                        num = (Integer) arrayList3.get(i16);
                        c16056m.m17638e(iIntValue, 7, num.intValue(), 6);
                        c16056m.m17638e(num.intValue(), 7, ((Number) arrayList2.get(i17)).intValue(), 6);
                        c16056m.m17638e(num.intValue(), 6, iIntValue, 7);
                    }
                    if (num2 != 0) {
                        c16056m.m17638e(iIntValue, 6, num2.intValue(), 7);
                    } else {
                        c16056m.m17638e(iIntValue, 6, 0, 6);
                    }
                    c16056m.m17640i(iIntValue).f49599d.f49633c = -2;
                    c16056m.m17640i(iIntValue).f49599d.f49654m0 = true;
                    if (d10 > 0.0d) {
                        double d11 = ((double) (iArr != null ? iArr[i16] : 0)) / d10;
                        if (d11 > 0.0d) {
                            c16056m.m17640i(iIntValue).f49599d.f49623U = (float) d11;
                        } else {
                            c16056m.m17640i(iIntValue).f49599d.f49631b = -2;
                        }
                        i11 = 0;
                    } else {
                        it2 = it2;
                        i11 = 0;
                        c16056m.m17640i(iIntValue).f49599d.f49626X = 0;
                    }
                    c16056m.m17638e(iIntValue, 3, i11, 3);
                    c16056m.m17638e(iIntValue, 4, i11, 4);
                    if (num != null) {
                        c16056m.m17638e(num.intValue(), 3, i11, 3);
                        c16056m.m17638e(num.intValue(), 4, i11, 4);
                    }
                    int i18 = positionType == null ? -1 : AbstractC19153c2.f60867a[positionType.ordinal()];
                    if (i18 == 1) {
                        c16056m.m17642n(iIntValue, 0.0f);
                    } else if (i18 != 2) {
                        c16056m.m17642n(iIntValue, 0.5f);
                    } else {
                        c16056m.m17642n(iIntValue, 1.0f);
                    }
                    root = constraintLayout;
                    i12 = i11;
                    i16 = i17;
                    interfaceC19089I = null;
                    it2 = it2;
                }
                return;
            }
            Object next4 = it.next();
            int i19 = i15 + 1;
            if (i15 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            int iIntValue2 = ((Number) next4).intValue();
            Context context = constraintLayout.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            C22212b c22212b = new C22212b(context);
            c22212b.setId(View.generateViewId());
            c22212b.setSaveEnabled(false);
            if (i15 != AbstractC17681o.m19381j(arrayList2)) {
                Iterator it4 = arrayList.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (((C18496a) next2).f58959b.getId() != iIntValue2);
                C18496a c18496a2 = (C18496a) next2;
                InterfaceC19201o2 interfaceC19201o2 = c18496a2 != null ? c18496a2.f58958a : null;
                interfaceC19089I = interfaceC19201o2 instanceof InterfaceC19089I ? (InterfaceC19089I) interfaceC19201o2 : null;
                if (interfaceC19089I != null && (f40951o0 = interfaceC19089I.getF40900p0()) != null) {
                    f40951o0.add(c22212b);
                }
                root.addView(c22212b);
                c16056m.m17640i(c22212b.getId()).f49599d.f49631b = i10;
                c16056m.m17640i(c22212b.getId()).f49599d.f49652l0 = true;
                c16056m.m17640i(c22212b.getId()).f49599d.f49633c = 1;
                c16056m.m17640i(c22212b.getId()).f49599d.f49654m0 = true;
                arrayList3.add(Integer.valueOf(c22212b.getId()));
            }
            i15 = i19;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20310b(ConstraintLayout root, C16056m c16056m, ArrayList arrayList, ArrayList arrayList2, StyleElements.PositionType positionType, int i10) {
        Integer num;
        Object next;
        Object next2;
        ArrayList f40951o0;
        AbstractC16544l.m18094g(root, "root");
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                int i12 = 0;
                for (Object obj : arrayList2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    int iIntValue = ((Number) obj).intValue();
                    Integer num2 = i12 > 0 ? (Integer) arrayList3.get(i12 - 1) : null;
                    if (i12 == AbstractC17681o.m19381j(arrayList2)) {
                        c16056m.m17638e(iIntValue, 4, 0, 4);
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (((C18496a) next).f58959b.getId() != iIntValue);
                        C18496a c18496a = (C18496a) next;
                        if ((c18496a != null ? c18496a.f58958a : null) != null && num2 != null) {
                            ((C22212b) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(c18496a.f58958a));
                        }
                        num = null;
                    } else {
                        num = (Integer) arrayList3.get(i12);
                        c16056m.m17638e(num.intValue(), 3, iIntValue, 4);
                    }
                    if (i12 == 0) {
                        c16056m.m17638e(iIntValue, 3, 0, 3);
                    }
                    if (num2 != null) {
                        c16056m.m17638e(num2.intValue(), 4, iIntValue, 3);
                        c16056m.m17638e(iIntValue, 3, num2.intValue(), 4);
                    }
                    c16056m.m17638e(iIntValue, 6, 0, 6);
                    c16056m.m17638e(iIntValue, 7, 0, 7);
                    if (num != null) {
                        c16056m.m17638e(num.intValue(), 6, 0, 6);
                        c16056m.m17638e(num.intValue(), 7, 0, 7);
                    }
                    c16056m.m17640i(iIntValue).f49599d.f49633c = -2;
                    c16056m.m17640i(iIntValue).f49599d.f49631b = 0;
                    int i14 = positionType == null ? -1 : AbstractC19153c2.f60867a[positionType.ordinal()];
                    if (i14 == 1) {
                        c16056m.m17640i(iIntValue).f49599d.f49666w = 0.0f;
                    } else if (i14 != 2) {
                        c16056m.m17640i(iIntValue).f49599d.f49666w = 0.5f;
                    } else {
                        c16056m.m17640i(iIntValue).f49599d.f49666w = 1.0f;
                    }
                    i12 = i13;
                }
                return;
            }
            Object next3 = it.next();
            int i15 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            int iIntValue2 = ((Number) next3).intValue();
            Context context = root.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            C22212b c22212b = new C22212b(context);
            c22212b.setId(View.generateViewId());
            c22212b.setSaveEnabled(false);
            if (i11 != AbstractC17681o.m19381j(arrayList2)) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((C18496a) next2).f58959b.getId() != iIntValue2);
                C18496a c18496a2 = (C18496a) next2;
                InterfaceC19201o2 interfaceC19201o2 = c18496a2 != null ? c18496a2.f58958a : null;
                InterfaceC19089I interfaceC19089I = interfaceC19201o2 instanceof InterfaceC19089I ? (InterfaceC19089I) interfaceC19201o2 : null;
                if (interfaceC19089I != null && (f40951o0 = interfaceC19089I.getF40900p0()) != null) {
                    f40951o0.add(c22212b);
                }
                root.addView(c22212b);
                c16056m.m17640i(c22212b.getId()).f49599d.f49631b = 1;
                c16056m.m17640i(c22212b.getId()).f49599d.f49652l0 = true;
                c16056m.m17640i(c22212b.getId()).f49599d.f49633c = i10;
                c16056m.m17640i(c22212b.getId()).f49599d.f49654m0 = true;
                arrayList3.add(Integer.valueOf(c22212b.getId()));
            }
            i11 = i15;
        }
    }
}
