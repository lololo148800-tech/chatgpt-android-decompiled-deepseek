package p084D4;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p030B2.C0781s;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: D4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1934q extends AbstractC1897V {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f5699s;

    /* JADX INFO: renamed from: g */
    public boolean f5700g;

    /* JADX INFO: renamed from: h */
    public ArrayList f5701h;

    /* JADX INFO: renamed from: i */
    public ArrayList f5702i;

    /* JADX INFO: renamed from: j */
    public ArrayList f5703j;

    /* JADX INFO: renamed from: k */
    public ArrayList f5704k;

    /* JADX INFO: renamed from: l */
    public ArrayList f5705l;

    /* JADX INFO: renamed from: m */
    public ArrayList f5706m;

    /* JADX INFO: renamed from: n */
    public ArrayList f5707n;

    /* JADX INFO: renamed from: o */
    public ArrayList f5708o;

    /* JADX INFO: renamed from: p */
    public ArrayList f5709p;

    /* JADX INFO: renamed from: q */
    public ArrayList f5710q;

    /* JADX INFO: renamed from: r */
    public ArrayList f5711r;

    /* JADX INFO: renamed from: h */
    public static void m3104h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC1933p0) arrayList.get(size)).f5680a.animate().cancel();
        }
    }

    @Override // p084D4.AbstractC1897V
    /* JADX INFO: renamed from: a */
    public final boolean mo2910a(AbstractC1933p0 abstractC1933p0, AbstractC1933p0 abstractC1933p1, C0781s c0781s, C0781s c0781s2) {
        int i10;
        int i11;
        int i12 = c0781s.f2192b;
        int i13 = c0781s.f2193c;
        if (abstractC1933p1.m3102q()) {
            int i14 = c0781s.f2192b;
            i11 = c0781s.f2193c;
            i10 = i14;
        } else {
            i10 = c0781s2.f2192b;
            i11 = c0781s2.f2193c;
        }
        if (abstractC1933p0 == abstractC1933p1) {
            return m3105g(abstractC1933p0, i12, i13, i10, i11);
        }
        View view = abstractC1933p0.f5680a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m3109l(abstractC1933p0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m3109l(abstractC1933p1);
        float f10 = -((int) ((i10 - i12) - translationX));
        View view2 = abstractC1933p1.f5680a;
        view2.setTranslationX(f10);
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f5704k;
        C1930o c1930o = new C1930o();
        c1930o.f5661a = abstractC1933p0;
        c1930o.f5662b = abstractC1933p1;
        c1930o.f5663c = i12;
        c1930o.f5664d = i13;
        c1930o.f5665e = i10;
        c1930o.f5666f = i11;
        arrayList.add(c1930o);
        return true;
    }

    @Override // p084D4.AbstractC1897V
    /* JADX INFO: renamed from: d */
    public final void mo2912d(AbstractC1933p0 abstractC1933p0) {
        View view = abstractC1933p0.f5680a;
        view.animate().cancel();
        ArrayList arrayList = this.f5703j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1932p) arrayList.get(size)).f5674a == abstractC1933p0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2911c(abstractC1933p0);
                arrayList.remove(size);
            }
        }
        m3107j(this.f5704k, abstractC1933p0);
        if (this.f5701h.remove(abstractC1933p0)) {
            view.setAlpha(1.0f);
            m2911c(abstractC1933p0);
        }
        if (this.f5702i.remove(abstractC1933p0)) {
            view.setAlpha(1.0f);
            m2911c(abstractC1933p0);
        }
        ArrayList arrayList2 = this.f5707n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m3107j(arrayList3, abstractC1933p0);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f5706m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((C1932p) arrayList5.get(size4)).f5674a == abstractC1933p0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2911c(abstractC1933p0);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f5705l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC1933p0)) {
                view.setAlpha(1.0f);
                m2911c(abstractC1933p0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f5710q.remove(abstractC1933p0);
        this.f5708o.remove(abstractC1933p0);
        this.f5711r.remove(abstractC1933p0);
        this.f5709p.remove(abstractC1933p0);
        m3106i();
    }

    @Override // p084D4.AbstractC1897V
    /* JADX INFO: renamed from: e */
    public final void mo2913e() {
        ArrayList arrayList = this.f5703j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1932p c1932p = (C1932p) arrayList.get(size);
            View view = c1932p.f5674a.f5680a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2911c(c1932p.f5674a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f5701h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2911c((AbstractC1933p0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5702i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList3.get(size3);
            abstractC1933p0.f5680a.setAlpha(1.0f);
            m2911c(abstractC1933p0);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5704k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1930o c1930o = (C1930o) arrayList4.get(size4);
            AbstractC1933p0 abstractC1933p1 = c1930o.f5661a;
            if (abstractC1933p1 != null) {
                m3108k(c1930o, abstractC1933p1);
            }
            AbstractC1933p0 abstractC1933p2 = c1930o.f5662b;
            if (abstractC1933p2 != null) {
                m3108k(c1930o, abstractC1933p2);
            }
        }
        arrayList4.clear();
        if (mo2914f()) {
            ArrayList arrayList5 = this.f5706m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1932p c1932p2 = (C1932p) arrayList6.get(size6);
                    View view2 = c1932p2.f5674a.f5680a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2911c(c1932p2.f5674a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f5705l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC1933p0 abstractC1933p3 = (AbstractC1933p0) arrayList8.get(size8);
                    abstractC1933p3.f5680a.setAlpha(1.0f);
                    m2911c(abstractC1933p3);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f5707n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1930o c1930o2 = (C1930o) arrayList10.get(size10);
                    AbstractC1933p0 abstractC1933p4 = c1930o2.f5661a;
                    if (abstractC1933p4 != null) {
                        m3108k(c1930o2, abstractC1933p4);
                    }
                    AbstractC1933p0 abstractC1933p5 = c1930o2.f5662b;
                    if (abstractC1933p5 != null) {
                        m3108k(c1930o2, abstractC1933p5);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m3104h(this.f5710q);
            m3104h(this.f5709p);
            m3104h(this.f5708o);
            m3104h(this.f5711r);
            ArrayList arrayList11 = this.f5533b;
            if (arrayList11.size() > 0) {
                throw AbstractC14376f.m15860z(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // p084D4.AbstractC1897V
    /* JADX INFO: renamed from: f */
    public final boolean mo2914f() {
        return (this.f5702i.isEmpty() && this.f5704k.isEmpty() && this.f5703j.isEmpty() && this.f5701h.isEmpty() && this.f5709p.isEmpty() && this.f5710q.isEmpty() && this.f5708o.isEmpty() && this.f5711r.isEmpty() && this.f5706m.isEmpty() && this.f5705l.isEmpty() && this.f5707n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3105g(AbstractC1933p0 abstractC1933p0, int i10, int i11, int i12, int i13) {
        View view = abstractC1933p0.f5680a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) abstractC1933p0.f5680a.getTranslationY());
        m3109l(abstractC1933p0);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m2911c(abstractC1933p0);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.f5703j;
        C1932p c1932p = new C1932p();
        c1932p.f5674a = abstractC1933p0;
        c1932p.f5675b = translationX;
        c1932p.f5676c = translationY;
        c1932p.f5677d = i12;
        c1932p.f5678e = i13;
        arrayList.add(c1932p);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m3106i() {
        if (mo2914f()) {
            return;
        }
        ArrayList arrayList = this.f5533b;
        if (arrayList.size() > 0) {
            throw AbstractC14376f.m15860z(0, arrayList);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final void m3107j(ArrayList arrayList, AbstractC1933p0 abstractC1933p0) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1930o c1930o = (C1930o) arrayList.get(size);
            if (m3108k(c1930o, abstractC1933p0) && c1930o.f5661a == null && c1930o.f5662b == null) {
                arrayList.remove(c1930o);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3108k(C1930o c1930o, AbstractC1933p0 abstractC1933p0) {
        if (c1930o.f5662b == abstractC1933p0) {
            c1930o.f5662b = null;
        } else {
            if (c1930o.f5661a != abstractC1933p0) {
                return false;
            }
            c1930o.f5661a = null;
        }
        abstractC1933p0.f5680a.setAlpha(1.0f);
        View view = abstractC1933p0.f5680a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2911c(abstractC1933p0);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m3109l(AbstractC1933p0 abstractC1933p0) {
        if (f5699s == null) {
            f5699s = new ValueAnimator().getInterpolator();
        }
        abstractC1933p0.f5680a.animate().setInterpolator(f5699s);
        mo2912d(abstractC1933p0);
    }
}
