package p514V;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p001A.C0067i0;
import p178H.AbstractC3174u0;
import p178H.C3123P;
import p178H.C3131Y;
import p178H.C3142e0;
import p178H.InterfaceC3172t0;
import p228J.AbstractC3810L;
import p228J.C3809K;
import p228J.C3865u0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3861s0;
import p228J.InterfaceC3870x;
import p239Ja.C4307j;
import p253K.AbstractC4491b;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p414R.C6777k;
import p414R.C6778l;
import p414R.RunnableC6775i;
import p465T.C7166b;
import p544W9.AbstractC8488H2;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: V.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7733g implements InterfaceC3172t0 {

    /* JADX INFO: renamed from: Y */
    public final HashSet f24387Y;

    /* JADX INFO: renamed from: q0 */
    public final C0067i0 f24391q0;

    /* JADX INFO: renamed from: r0 */
    public final InterfaceC3870x f24392r0;

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC3870x f24393s0;

    /* JADX INFO: renamed from: u0 */
    public final HashSet f24395u0;

    /* JADX INFO: renamed from: v0 */
    public final HashMap f24396v0;

    /* JADX INFO: renamed from: w0 */
    public final C7727a f24397w0;

    /* JADX INFO: renamed from: x0 */
    public final C7727a f24398x0;

    /* JADX INFO: renamed from: Z */
    public final HashMap f24388Z = new HashMap();

    /* JADX INFO: renamed from: o0 */
    public final HashMap f24389o0 = new HashMap();

    /* JADX INFO: renamed from: p0 */
    public final HashMap f24390p0 = new HashMap();

    /* JADX INFO: renamed from: t0 */
    public final C3131Y f24394t0 = new C3131Y(this, 2);

    public C7733g(InterfaceC3870x interfaceC3870x, InterfaceC3870x interfaceC3870x2, HashSet hashSet, C0067i0 c0067i0, C4307j c4307j) {
        this.f24392r0 = interfaceC3870x;
        this.f24393s0 = interfaceC3870x2;
        this.f24391q0 = c0067i0;
        this.f24387Y = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it.next();
            map.put(abstractC3174u0, abstractC3174u0.m4016l(interfaceC3870x.mo122r(), null, abstractC3174u0.mo3936e(true, c0067i0)));
        }
        this.f24396v0 = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f24395u0 = hashSet2;
        this.f24397w0 = new C7727a(interfaceC3870x, hashSet2);
        if (this.f24393s0 != null) {
            this.f24398x0 = new C7727a(this.f24393s0, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            AbstractC3174u0 abstractC3174u1 = (AbstractC3174u0) it2.next();
            this.f24390p0.put(abstractC3174u1, Boolean.FALSE);
            this.f24389o0.put(abstractC3174u1, new C7732f(interfaceC3870x, this, c4307j));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m7997m(C6778l c6778l, AbstractC3810L abstractC3810L, C3865u0 c3865u0) {
        c6778l.m7226d();
        try {
            AbstractC8488H2.m9140a();
            c6778l.m7223a();
            C6777k c6777k = c6778l.f21773l;
            Objects.requireNonNull(c6777k);
            c6777k.m7222g(abstractC3810L, new RunnableC6775i(c6777k, 0));
        } catch (C3809K unused) {
            InterfaceC3861s0 interfaceC3861s0 = c3865u0.f11682f;
            if (interfaceC3861s0 != null) {
                interfaceC3861s0.mo28a(c3865u0);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC3810L m7998s(AbstractC3174u0 abstractC3174u0) {
        List listM4591b = abstractC3174u0 instanceof C3123P ? abstractC3174u0.f9572m.m4591b() : DesugarCollections.unmodifiableList(abstractC3174u0.f9572m.f11683g.f11482a);
        AbstractC4941g.m5559R(null, listM4591b.size() <= 1);
        if (listM4591b.size() == 1) {
            return (AbstractC3810L) listM4591b.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C7166b m7999c(AbstractC3174u0 abstractC3174u0, C7727a c7727a, InterfaceC3870x interfaceC3870x, C6778l c6778l, int i10, boolean z6) {
        Size size;
        Size sizeM5249e;
        int i11;
        int iMo143h = interfaceC3870x.mo105a().mo143h(i10);
        Matrix matrix = c6778l.f21763b;
        RectF rectF = AbstractC4503n.f14693a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        boolean z10 = false;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = (f11 * f13) + (f10 * f12);
        float f15 = (f10 * f13) - (f11 * f12);
        double dSqrt = Math.sqrt((f11 * f11) + (f10 * f10)) * Math.sqrt((f13 * f13) + (f12 * f12));
        boolean z11 = ((float) Math.toDegrees(Math.atan2(((double) f15) / dSqrt, ((double) f14) / dSqrt))) > 0.0f;
        InterfaceC3800E0 interfaceC3800E0 = (InterfaceC3800E0) this.f24396v0.get(abstractC3174u0);
        Objects.requireNonNull(interfaceC3800E0);
        float[] fArr2 = new float[9];
        c6778l.f21763b.getValues(fArr2);
        int iM5251g = AbstractC4503n.m5251g((int) Math.round(Math.atan2(fArr2[3], fArr2[0]) * 57.29577951308232d));
        c7727a.getClass();
        boolean zM5247c = AbstractC4503n.m5247c(iM5251g);
        Rect rectM7983a = c6778l.f21765d;
        if (zM5247c) {
            rectM7983a = new Rect(rectM7983a.top, rectM7983a.left, rectM7983a.bottom, rectM7983a.right);
            z10 = true;
        }
        if (z6) {
            sizeM5249e = AbstractC4503n.m5249e(rectM7983a);
            Iterator it = c7727a.m7986b(interfaceC3800E0).iterator();
            while (it.hasNext()) {
                Size sizeM5249e2 = AbstractC4503n.m5249e(C7727a.m7983a((Size) it.next(), sizeM5249e));
                if (!C7727a.m7984c(sizeM5249e2, sizeM5249e)) {
                    sizeM5249e = sizeM5249e2;
                    break;
                }
            }
        } else {
            Size sizeM5249e3 = AbstractC4503n.m5249e(rectM7983a);
            List listM7986b = c7727a.m7986b(interfaceC3800E0);
            Iterator it2 = listM7986b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listM7986b.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = sizeM5249e3;
                            break;
                        }
                        Size size2 = (Size) it3.next();
                        if (!C7727a.m7984c(size2, sizeM5249e3)) {
                            size = size2;
                            break;
                        }
                    }
                } else {
                    size = (Size) it2.next();
                    Rational rationalM7985g = AbstractC4491b.f14647a;
                    if (!AbstractC4491b.m5220a(rationalM7985g, sizeM5249e3)) {
                        rationalM7985g = AbstractC4491b.f14649c;
                        if (!AbstractC4491b.m5220a(rationalM7985g, sizeM5249e3)) {
                            rationalM7985g = C7727a.m7985g(sizeM5249e3);
                        }
                    }
                    if (!c7727a.m7987d(rationalM7985g, size) && !C7727a.m7984c(size, sizeM5249e3)) {
                        break;
                    }
                }
            }
            rectM7983a = C7727a.m7983a(sizeM5249e3, size);
            sizeM5249e = size;
        }
        Pair pair = new Pair(rectM7983a, sizeM5249e);
        Rect rect = (Rect) pair.first;
        Size size3 = (Size) pair.second;
        if (z10) {
            Size size4 = new Size(size3.getHeight(), size3.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size3 = size4;
        }
        Pair pair2 = new Pair(rect, size3);
        Rect rect2 = (Rect) pair2.first;
        Size size5 = (Size) pair2.second;
        int iMo143h2 = this.f24392r0.mo105a().mo143h(((InterfaceC3818U) abstractC3174u0.f9565f).mo4541B());
        C7732f c7732f = (C7732f) this.f24389o0.get(abstractC3174u0);
        Objects.requireNonNull(c7732f);
        c7732f.f24385o0.f24400c = iMo143h2;
        int iM5251g2 = AbstractC4503n.m5251g((c6778l.f21770i + iMo143h2) - iMo143h);
        if (abstractC3174u0 instanceof C3142e0) {
            i11 = 1;
        } else {
            i11 = abstractC3174u0 instanceof C3123P ? 4 : 2;
        }
        return new C7166b(UUID.randomUUID(), i11, abstractC3174u0 instanceof C3123P ? 256 : 34, rect2, AbstractC4503n.m5250f(size5, iM5251g2), iM5251g2, abstractC3174u0.m4015k(interfaceC3870x) ^ z11);
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: e */
    public final void mo109e(AbstractC3174u0 abstractC3174u0) {
        AbstractC8488H2.m9140a();
        if (m8000t(abstractC3174u0)) {
            this.f24390p0.put(abstractC3174u0, Boolean.FALSE);
            C6778l c6778l = (C6778l) this.f24388Z.get(abstractC3174u0);
            Objects.requireNonNull(c6778l);
            AbstractC8488H2.m9140a();
            c6778l.m7223a();
            c6778l.f21773l.mo4507a();
        }
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: j */
    public final void mo114j(AbstractC3174u0 abstractC3174u0) {
        AbstractC3810L abstractC3810LM7998s;
        AbstractC8488H2.m9140a();
        C6778l c6778l = (C6778l) this.f24388Z.get(abstractC3174u0);
        Objects.requireNonNull(c6778l);
        if (m8000t(abstractC3174u0) && (abstractC3810LM7998s = m7998s(abstractC3174u0)) != null) {
            m7997m(c6778l, abstractC3810LM7998s, abstractC3174u0.f9572m);
        }
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: k */
    public final void mo115k(AbstractC3174u0 abstractC3174u0) {
        AbstractC8488H2.m9140a();
        if (m8000t(abstractC3174u0)) {
            C6778l c6778l = (C6778l) this.f24388Z.get(abstractC3174u0);
            Objects.requireNonNull(c6778l);
            AbstractC3810L abstractC3810LM7998s = m7998s(abstractC3174u0);
            if (abstractC3810LM7998s != null) {
                m7997m(c6778l, abstractC3810LM7998s, abstractC3174u0.f9572m);
                return;
            }
            AbstractC8488H2.m9140a();
            c6778l.m7223a();
            c6778l.f21773l.mo4507a();
        }
    }

    @Override // p178H.InterfaceC3172t0
    /* JADX INFO: renamed from: l */
    public final void mo116l(AbstractC3174u0 abstractC3174u0) {
        AbstractC8488H2.m9140a();
        if (m8000t(abstractC3174u0)) {
            return;
        }
        this.f24390p0.put(abstractC3174u0, Boolean.TRUE);
        AbstractC3810L abstractC3810LM7998s = m7998s(abstractC3174u0);
        if (abstractC3810LM7998s != null) {
            C6778l c6778l = (C6778l) this.f24388Z.get(abstractC3174u0);
            Objects.requireNonNull(c6778l);
            m7997m(c6778l, abstractC3810LM7998s, abstractC3174u0.f9572m);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8000t(AbstractC3174u0 abstractC3174u0) {
        Boolean bool = (Boolean) this.f24390p0.get(abstractC3174u0);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m8001u(HashMap map) {
        HashMap map2 = this.f24388Z;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) entry.getKey();
            C6778l c6778l = (C6778l) entry.getValue();
            abstractC3174u0.mo3944y(c6778l.f21765d);
            abstractC3174u0.mo3943x(c6778l.f21763b);
            abstractC3174u0.f9566g = abstractC3174u0.mo3941v(c6778l.f21768g, null);
            abstractC3174u0.m4019o();
        }
    }
}
