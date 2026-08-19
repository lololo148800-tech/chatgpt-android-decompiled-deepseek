package p523V9;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.SizeF;
import android.widget.TextView;
import cm.C11788f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p000.C10440a;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1817m0;
import p117Eb.C2391u;
import p225Im.InterfaceC3756d;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6014l0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.C7542g;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9393x3;
import p571X9.AbstractC9400y4;
import p637a3.AbstractC10491h;
import p672c3.AbstractC11635v;
import p672c3.C11627r;
import p672c3.C11634u0;
import p672c3.C11636v0;
import p672c3.C11640x0;
import p672c3.C11642y0;
import p672c3.C11644z0;
import p672c3.InterfaceC11563A0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19205p2;

/* JADX INFO: renamed from: V9.g4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8094g4 {

    /* JADX INFO: renamed from: a */
    public static C2391u f25431a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX INFO: renamed from: a */
    public static final void m8560a(int i10, long j10, InterfaceC1439n interfaceC1439n, C6021p c6021p, InterfaceC11563A0 interfaceC11563A0) {
        int i11;
        boolean z6;
        List listM19382k;
        List listM9974d;
        Object next;
        C17309l c17309l;
        List listM9974d2;
        ?? r6;
        ?? M9974d;
        c6021p.m6526U(1526030150);
        if ((i10 & 6) == 0) {
            int i12 = i10 & 8;
            i11 = (c6021p.m6542f(interfaceC11563A0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6540e(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC1439n) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (interfaceC11563A0 instanceof C11644z0) {
                c6021p.m6525T(-1173540356);
                c6021p.m6553p(false);
                listM9974d = AbstractC9393x3.m9974d(new C7542g(j10));
            } else if (interfaceC11563A0 instanceof C11640x0) {
                c6021p.m6525T(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    c6021p.m6525T(-2019914396);
                    Bundle bundle = (Bundle) c6021p.m6548k(AbstractC11635v.f35260a);
                    c6021p.m6525T(-1173535336);
                    boolean zM6540e = c6021p.m6540e(j10);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6540e || objM6514H == C6013l.f19514a) {
                        objM6514H = new C11636v0(j10, 0);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
                    c6021p.m6553p(false);
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i14 = bundle.getInt("appWidgetMinHeight", 0);
                        int i15 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i16 = bundle.getInt("appWidgetMinWidth", 0);
                        int i17 = bundle.getInt("appWidgetMaxWidth", 0);
                        M9974d = (i14 == 0 || i15 == 0 || i16 == 0 || i17 == 0) ? AbstractC9393x3.m9974d(interfaceC1426a.invoke()) : AbstractC17681o.m19382k(new C7542g(AbstractC9400y4.m9979b(i16, i15)), new C7542g(AbstractC9400y4.m9979b(i17, i14)));
                    } else {
                        M9974d = new ArrayList(AbstractC17682p.m19389r(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            M9974d.add(new C7542g(AbstractC9400y4.m9979b(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    c6021p.m6553p(false);
                    r6 = M9974d;
                } else {
                    c6021p.m6525T(-2019826759);
                    ArrayList arrayListM8393b = AbstractC8038Z3.m8393b((Bundle) c6021p.m6548k(AbstractC11635v.f35260a));
                    if (arrayListM8393b.isEmpty()) {
                        listM9974d2 = arrayListM8393b;
                        listM9974d2 = AbstractC9393x3.m9974d(new C7542g(j10));
                    }
                    listM9974d2 = arrayListM8393b;
                    c6021p.m6553p(false);
                    r6 = listM9974d2;
                }
                c6021p.m6553p(false);
                listM9974d = (Collection) r6;
            } else {
                if (!(interfaceC11563A0 instanceof C11642y0)) {
                    c6021p.m6525T(-1173645715);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                c6021p.m6525T(-2019661188);
                if (Build.VERSION.SDK_INT >= 31) {
                    listM9974d = ((C11642y0) interfaceC11563A0).f35271a;
                    z6 = false;
                } else {
                    C11642y0 c11642y0 = (C11642y0) interfaceC11563A0;
                    long j11 = ((C7542g) AbstractC17680n.m19370t0(c11642y0.f35271a, new C1817m0(new InterfaceC1436k[]{C11627r.f35233Z, C11627r.f35234o0}, 3)).get(0)).f23896a;
                    ArrayList arrayListM8393b2 = AbstractC8038Z3.m8393b((Bundle) c6021p.m6548k(AbstractC11635v.f35260a));
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM8393b2, 10));
                    Iterator it = arrayListM8393b2.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        long j12 = ((C7542g) it.next()).f23896a;
                        Set set = c11642y0.f35271a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = set.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            long j13 = ((C7542g) it3.next()).f23896a;
                            C11642y0 c11642y1 = c11642y0;
                            float f10 = 1;
                            if (((float) Math.ceil(C7542g.m7877b(j12))) + f10 <= C7542g.m7877b(j13) || ((float) Math.ceil(C7542g.m7876a(j12))) + f10 <= C7542g.m7876a(j13)) {
                                c17309l = null;
                            } else {
                                C7542g c7542g = new C7542g(j13);
                                float fM7877b = C7542g.m7877b(j12) - C7542g.m7877b(j13);
                                float fM7876a = C7542g.m7876a(j12) - C7542g.m7876a(j13);
                                c17309l = new C17309l(c7542g, Float.valueOf((fM7876a * fM7876a) + (fM7877b * fM7877b)));
                            }
                            if (c17309l != null) {
                                arrayList2.add(c17309l);
                            }
                            c11642y0 = c11642y1;
                        }
                        C11642y0 c11642y2 = c11642y0;
                        Iterator it4 = arrayList2.iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                float fFloatValue = ((Number) ((C17309l) next).f55137Z).floatValue();
                                do {
                                    Object next2 = it4.next();
                                    float fFloatValue2 = ((Number) ((C17309l) next2).f55137Z).floatValue();
                                    if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                        next = next2;
                                        fFloatValue = fFloatValue2;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        C17309l c17309l2 = (C17309l) next;
                        C7542g c7542g2 = c17309l2 != null ? (C7542g) c17309l2.f55136Y : null;
                        arrayList.add(new C7542g(c7542g2 != null ? c7542g2.f23896a : j11));
                        c11642y0 = c11642y2;
                        it = it2;
                    }
                    if (arrayList.isEmpty()) {
                        z6 = false;
                        listM19382k = AbstractC17681o.m19382k(new C7542g(j11), new C7542g(j11));
                    } else {
                        z6 = false;
                        listM19382k = arrayList;
                    }
                    listM9974d = listM19382k;
                }
                c6021p.m6553p(z6);
            }
            List listM19335K = AbstractC17680n.m19335K(listM9974d);
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(listM19335K, 10));
            Iterator it5 = listM19335K.iterator();
            while (it5.hasNext()) {
                m8561b(((i13 << 3) & 112) | (i13 & 896), ((C7542g) it5.next()).f23896a, interfaceC1439n, c6021p, interfaceC11563A0);
                arrayList3.add(C17296C.f55119a);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C11634u0(interfaceC11563A0, j10, interfaceC1439n, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8561b(int i10, long j10, InterfaceC1439n interfaceC1439n, C6021p c6021p, InterfaceC11563A0 interfaceC11563A0) {
        int i11;
        c6021p.m6526U(-53921383);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6540e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            int i12 = i10 & 64;
            i11 |= c6021p.m6542f(interfaceC11563A0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC1439n) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6442b(new C6014l0[]{AbstractC10491h.f31086a.mo6405a(new C7542g(j10))}, AbstractC8411c.m8968b(-1209815847, c6021p, new C10440a(interfaceC1439n, j10, interfaceC11563A0)), c6021p, 48);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C11634u0(j10, interfaceC11563A0, interfaceC1439n, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC19201o2 m8562c(InterfaceC3756d type, List list) {
        InterfaceC19201o2 interfaceC19201o2M8562c;
        AbstractC16544l.m18094g(list, "<this>");
        AbstractC16544l.m18094g(type, "type");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19201o2 interfaceC19201o2 = (InterfaceC19201o2) it.next();
            if (type.mo4449e(interfaceC19201o2)) {
                if (interfaceC19201o2 instanceof InterfaceC19201o2) {
                    return interfaceC19201o2;
                }
                return null;
            }
            if ((interfaceC19201o2 instanceof InterfaceC19205p2) && (interfaceC19201o2M8562c = m8562c(type, ((InterfaceC19205p2) interfaceC19201o2).getChildren())) != null) {
                return interfaceC19201o2M8562c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m8563d(TextView textView, String text) {
        AbstractC16544l.m18094g(textView, "<this>");
        AbstractC16544l.m18094g(text, "text");
        Context context = textView.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        C2391u c2391uM3502t = f25431a;
        if (c2391uM3502t == null) {
            c2391uM3502t = C2391u.m3502t(context);
            f25431a = c2391uM3502t;
        }
        SpannableStringBuilder spannableStringBuilderM3511H = c2391uM3502t.m3511H(text);
        c2391uM3502t.m3510G(textView, spannableStringBuilderM3511H);
        Object[] spans = spannableStringBuilderM3511H.getSpans(0, spannableStringBuilderM3511H.length(), C11788f.class);
        AbstractC16544l.m18093f(spans, "getSpans(start, end, T::class.java)");
        if (spans.length == 0) {
            Object[] spans2 = spannableStringBuilderM3511H.getSpans(0, spannableStringBuilderM3511H.length(), URLSpan.class);
            AbstractC16544l.m18093f(spans2, "getSpans(start, end, T::class.java)");
            if (spans2.length == 0) {
                textView.setMovementMethod(null);
            }
        }
    }
}
