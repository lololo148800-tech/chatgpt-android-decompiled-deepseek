package p544W9;

import java.util.ArrayList;
import java.util.List;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p204I1.C3598n;
import p254K0.C4519p;
import p254K0.C4520q;
import p254K0.C4522s;
import p254K0.C4526w;
import p257K3.C4535c;
import p530Vi.AbstractC8301I;
import p594Y9.AbstractC9930m3;
import p692d0.AbstractC12968g;
import p692d0.C12979r;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: W9.M2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8518M2 {

    /* JADX INFO: renamed from: a */
    public static C17425e f26336a;

    /* JADX INFO: renamed from: a */
    public static final C12979r m9182a(float f10, List list, boolean z6) {
        int i10 = AbstractC12968g.f41178a;
        C12979r c12979r = new C12979r();
        c12979r.f41194a = new float[1];
        c12979r.m14675a(0.0f);
        if (f10 != 0.0f && !list.isEmpty()) {
            C3508g c3508gM8929t = AbstractC8301I.m8929t(1, list.size());
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c3508gM8929t, 10));
            C3507f it = c3508gM8929t.iterator();
            while (it.f10596o0) {
                int iMo4199a = it.mo4199a();
                int i11 = iMo4199a - 1;
                C4520q c4520q = (C4520q) list.get(i11);
                C4520q c4520q2 = (C4520q) list.get(iMo4199a);
                c12979r.m14675a(iMo4199a == AbstractC17681o.m19381j(list) ? 1.0f : c12979r.m14676b(i11) + ((z6 ? ((C4519p) AbstractC17680n.m19341Q(c4520q2)).f14764c - ((C4519p) AbstractC17680n.m19341Q(c4520q)).f14764c : ((C4519p) AbstractC17680n.m19351a0(c4520q)).f14764c - ((C4519p) AbstractC17680n.m19351a0(c4520q2)).f14764c) / f10));
                arrayList.add(Boolean.TRUE);
            }
        }
        return c12979r;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static final C4520q m9183b(C4520q c4520q, float f10, float f11, float f12, C4519p c4519p, int i10) {
        ArrayList arrayList = new ArrayList(c4520q.f14770Y.size());
        int size = c4520q.f14770Y.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4519p c4519pM5260f = c4520q.get(i11);
            if (!c4519pM5260f.f14766e) {
                arrayList.add(c4519pM5260f);
            }
        }
        float size2 = f12 / arrayList.size();
        float f13 = (c4519p.f14763b - (size2 / 2.0f)) + f12;
        C4526w c4526w = new C4526w(c4520q, size2, 0);
        C4522s c4522s = new C4522s();
        c4526w.invoke(c4522s);
        ArrayList arrayListM5263b = C4522s.m5263b(i10, f13, c4522s.f14778a, c4522s.m5265c(), c4522s.f14779b, f10, f11, c4522s.f14780c);
        C4520q c4520q2 = new C4520q(arrayListM5263b);
        ArrayList arrayList2 = new ArrayList(arrayListM5263b.size());
        int size3 = arrayListM5263b.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C4519p c4519pM5260f2 = c4520q2.get(i12);
            arrayList2.add(new C4519p(c4519pM5260f2.f14762a, c4519pM5260f2.f14763b, c4520q.get(i12).f14764c, c4519pM5260f2.f14765d, c4519pM5260f2.f14766e, c4519pM5260f2.f14767f, c4519pM5260f2.f14768g));
        }
        return new C4520q(arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public static final C17425e m9184c() {
        C17425e c17425e = f26336a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Flag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(12.36f, 6.0f);
        c4535c.m5289o(0.4f, 2.0f);
        c4535c.m5286l(18.0f);
        c4535c.m5294t(6.0f);
        c4535c.m5287m(-3.36f);
        c4535c.m5289o(-0.4f, -2.0f);
        c4535c.m5286l(7.0f);
        c4535c.m5293s(6.0f);
        c4535c.m5287m(5.36f);
        c4535c.m5290p(14.0f, 4.0f);
        c4535c.m5286l(5.0f);
        c4535c.m5294t(17.0f);
        c4535c.m5287m(2.0f);
        c4535c.m5294t(-7.0f);
        c4535c.m5287m(5.6f);
        c4535c.m5289o(0.4f, 2.0f);
        c4535c.m5287m(7.0f);
        c4535c.m5293s(6.0f);
        c4535c.m5287m(-5.6f);
        c4535c.m5288n(14.0f, 4.0f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f26336a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: d */
    public static final float m9185d(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : AbstractC9930m3.m10589c(f10, f11, (f14 - f12) / (f13 - f12));
    }

    /* JADX INFO: renamed from: e */
    public static final C4520q m9186e(C4520q c4520q, int i10, int i11, float f10, float f11) {
        int i12 = i10 > i11 ? 1 : -1;
        float f12 = ((c4520q.get(i10).f14762a - c4520q.get(i10).f14768g) + f11) * i12;
        int i13 = c4520q.f14771Z;
        int i14 = i13 + i12;
        float f13 = c4520q.get(i13).f14763b + f12;
        C3598n c3598n = new C3598n(c4520q, i10, i11, 1);
        C4522s c4522s = new C4522s();
        c3598n.invoke(c4522s);
        return new C4520q(C4522s.m5263b(i14, f13, c4522s.f14778a, c4522s.m5265c(), c4522s.f14779b, f10, f11, c4522s.f14780c));
    }
}
