package p514V;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p003A1.C0195P;
import p117Eb.C2388r;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p253K.AbstractC4491b;
import p253K.AbstractC4503n;
import p253K.C4493d;
import p523V9.AbstractC8072d6;
import p817j$.util.Objects;

/* JADX INFO: renamed from: V.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7727a {

    /* JADX INFO: renamed from: h */
    public static final double f24352h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a */
    public final Size f24353a;

    /* JADX INFO: renamed from: b */
    public final Rational f24354b;

    /* JADX INFO: renamed from: c */
    public final Rational f24355c;

    /* JADX INFO: renamed from: d */
    public final HashSet f24356d;

    /* JADX INFO: renamed from: e */
    public final C2388r f24357e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3866v f24358f;

    /* JADX INFO: renamed from: g */
    public final HashMap f24359g;

    public C7727a(InterfaceC3870x interfaceC3870x, HashSet hashSet) {
        Size sizeM5249e = AbstractC4503n.m5249e(interfaceC3870x.mo111g().mo305j());
        InterfaceC3866v interfaceC3866vMo122r = interfaceC3870x.mo122r();
        C2388r c2388r = new C2388r(interfaceC3866vMo122r, sizeM5249e);
        this.f24359g = new HashMap();
        this.f24353a = sizeM5249e;
        Rational rational = ((double) sizeM5249e.getWidth()) / ((double) sizeM5249e.getHeight()) > f24352h ? AbstractC4491b.f14649c : AbstractC4491b.f14647a;
        AbstractC8072d6.m8486c("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeM5249e + ") is " + rational + Separators.DOT);
        this.f24354b = rational;
        Rational rational2 = AbstractC4491b.f14647a;
        if (rational.equals(rational2)) {
            rational2 = AbstractC4491b.f14649c;
        } else if (!rational.equals(AbstractC4491b.f14649c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f24355c = rational2;
        this.f24358f = interfaceC3866vMo122r;
        this.f24356d = hashSet;
        this.f24357e = c2388r;
    }

    /* JADX INFO: renamed from: a */
    public static Rect m7983a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalM7985g = m7985g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM7985g2 = m7985g(size);
        if (rationalM7985g.floatValue() == rationalM7985g2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalM7985g.floatValue() > rationalM7985g2.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rationalM7985g.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rationalM7985g.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7984c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    /* JADX INFO: renamed from: g */
    public static Rational m7985g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: b */
    public final List m7986b(InterfaceC3800E0 interfaceC3800E0) {
        Rational rationalM7985g;
        if (!this.f24356d.contains(interfaceC3800E0)) {
            throw new IllegalArgumentException("Invalid child config: " + interfaceC3800E0);
        }
        HashMap map = this.f24359g;
        if (map.containsKey(interfaceC3800E0)) {
            List list = (List) map.get(interfaceC3800E0);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listM3497g = this.f24357e.m3497g(interfaceC3800E0);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : listM3497g) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalM7985g = null;
                    break;
                }
                rationalM7985g = (Rational) it.next();
            } while (!AbstractC4491b.m5220a(rationalM7985g, size));
            if (rationalM7985g != null) {
                Size size2 = (Size) map2.get(rationalM7985g);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM7985g = m7985g(size);
            }
            arrayList.add(size);
            map2.put(rationalM7985g, size);
        }
        map.put(interfaceC3800E0, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7987d(Rational rational, Size size) {
        Rational rational2 = this.f24354b;
        if (rational2.equals(rational) || AbstractC4491b.m5220a(rational, size)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalM7985g = AbstractC4491b.f14647a;
        if (!AbstractC4491b.m5220a(rationalM7985g, size)) {
            rationalM7985g = AbstractC4491b.f14649c;
            if (!AbstractC4491b.m5220a(rationalM7985g, size)) {
                rationalM7985g = m7985g(size);
            }
        }
        float fFloatValue3 = rationalM7985g.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            if (fFloatValue2 >= fFloatValue3) {
                return false;
            }
        } else if (fFloatValue2 <= fFloatValue3) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m7988e(List list, boolean z6) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AbstractC4491b.f14647a;
        map.put(rational, new ArrayList());
        Rational rational2 = AbstractC4491b.f14649c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AbstractC4491b.m5220a(rational3, size)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM7985g = m7985g(size);
                    arrayList2.add(rationalM7985g);
                    map.put(rationalM7985g, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new C0195P(m7985g(this.f24353a), 5));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(AbstractC4491b.f14649c) && !rational4.equals(AbstractC4491b.f14647a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(m7989f(rational4, list2, z6));
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m7989f(Rational rational, List list, boolean z6) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (AbstractC4491b.m5220a(rational, size)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new C4493d(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f24356d.iterator();
        while (it2.hasNext()) {
            List<Size> listM7986b = m7986b((InterfaceC3800E0) it2.next());
            if (!z6) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listM7986b) {
                    if (!m7987d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listM7986b = arrayList3;
            }
            if (listM7986b.isEmpty()) {
                return new ArrayList();
            }
            if (listM7986b.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listM7986b.iterator();
                    while (it3.hasNext()) {
                        if (!m7984c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listM7986b.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listM7986b.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!m7984c((Size) it4.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
