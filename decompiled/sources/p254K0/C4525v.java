package p254K0;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p102Dm.AbstractC2119a;
import p200Hm.C3507f;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8506K2;
import p544W9.AbstractC8518M2;
import p692d0.C12979r;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: K0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C4525v {

    /* JADX INFO: renamed from: m */
    public static final C4525v f14788m;

    /* JADX INFO: renamed from: a */
    public final C4520q f14789a;

    /* JADX INFO: renamed from: b */
    public final Object f14790b;

    /* JADX INFO: renamed from: c */
    public final Object f14791c;

    /* JADX INFO: renamed from: d */
    public final float f14792d;

    /* JADX INFO: renamed from: e */
    public final float f14793e;

    /* JADX INFO: renamed from: f */
    public final float f14794f;

    /* JADX INFO: renamed from: g */
    public final float f14795g;

    /* JADX INFO: renamed from: h */
    public final float f14796h;

    /* JADX INFO: renamed from: i */
    public final float f14797i;

    /* JADX INFO: renamed from: j */
    public final C12979r f14798j;

    /* JADX INFO: renamed from: k */
    public final C12979r f14799k;

    /* JADX INFO: renamed from: l */
    public final boolean f14800l;

    static {
        C4520q c4520q = C4520q.f14769s0;
        C17689w c17689w = C17689w.f56480Y;
        f14788m = new C4525v(c4520q, c17689w, c17689w, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public C4525v(C4520q c4520q, List list, List list2, float f10, float f11, float f12, float f13) {
        this.f14789a = c4520q;
        this.f14790b = list;
        this.f14791c = list2;
        this.f14792d = f10;
        this.f14793e = f11;
        this.f14794f = f12;
        this.f14795g = f13;
        float fMax = list.isEmpty() ? 0.0f : Math.max(((C4519p) AbstractC17680n.m19341Q((List) AbstractC17680n.m19351a0(list))).f14764c - ((C4519p) AbstractC17680n.m19341Q((List) AbstractC17680n.m19341Q(list))).f14764c, f12);
        this.f14796h = fMax;
        float fMax2 = list2.isEmpty() ? 0.0f : Math.max(((C4519p) AbstractC17680n.m19351a0((List) AbstractC17680n.m19341Q(list2))).f14764c - ((C4519p) AbstractC17680n.m19351a0((List) AbstractC17680n.m19351a0(list2))).f14764c, f13);
        this.f14797i = fMax2;
        this.f14798j = AbstractC8518M2.m9182a(fMax, list, true);
        this.f14799k = AbstractC8518M2.m9182a(fMax2, list2, false);
        this.f14800l = (c4520q.f14770Y.isEmpty() || f10 == 0.0f || m5266a() == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final float m5266a() {
        return this.f14789a.m5261j().f14762a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final C4520q m5267b(float f10, float f11, boolean z6) {
        C12979r c12979r;
        ?? r10;
        C4524u c4524u;
        float fMax = Math.max(0.0f, f10);
        float fMax2 = Math.max(0.0f, f11 - this.f14797i);
        float f12 = this.f14796h;
        if (f12 <= fMax && fMax <= fMax2) {
            return this.f14789a;
        }
        float fM9185d = AbstractC8518M2.m9185d(1.0f, 0.0f, 0.0f, f12, fMax);
        if (fMax > fMax2) {
            fM9185d = AbstractC8518M2.m9185d(0.0f, 1.0f, fMax2, f11, fMax);
            Object obj = this.f14791c;
            c12979r = this.f14799k;
            r10 = obj;
        } else {
            Object obj2 = this.f14790b;
            c12979r = this.f14798j;
            r10 = obj2;
        }
        int size = r10.size();
        float fM14676b = c12979r.m14676b(0);
        C3507f it = AbstractC8301I.m8929t(1, size).iterator();
        while (true) {
            if (!it.f10596o0) {
                c4524u = new C4524u(0.0f, 0, 0);
                break;
            }
            int iMo4199a = it.mo4199a();
            float fM14676b2 = c12979r.m14676b(iMo4199a);
            if (fM9185d <= fM14676b2) {
                c4524u = new C4524u(AbstractC8518M2.m9185d(0.0f, 1.0f, fM14676b, fM14676b2, fM9185d), iMo4199a - 1, iMo4199a);
                break;
            }
            fM14676b = fM14676b2;
        }
        int i10 = c4524u.f14786b;
        int i11 = c4524u.f14785a;
        float f13 = c4524u.f14787c;
        if (z6) {
            if (AbstractC2119a.m3195i(f13) == 0) {
                i10 = i11;
            }
            return (C4520q) r10.get(i10);
        }
        C4520q c4520q = (C4520q) r10.get(i11);
        C4520q c4520q2 = (C4520q) r10.get(i10);
        ArrayList arrayList = new ArrayList(c4520q.f14770Y.size());
        int size2 = c4520q.f14770Y.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList.add(AbstractC8506K2.m9167a(c4520q.get(i12), c4520q2.get(i12), f13));
        }
        return new C4520q(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4525v)) {
            return false;
        }
        boolean z6 = this.f14800l;
        if (!z6 && !((C4525v) obj).f14800l) {
            return true;
        }
        C4525v c4525v = (C4525v) obj;
        return z6 == c4525v.f14800l && this.f14792d == c4525v.f14792d && this.f14793e == c4525v.f14793e && this.f14794f == c4525v.f14794f && this.f14795g == c4525v.f14795g && m5266a() == c4525v.m5266a() && this.f14796h == c4525v.f14796h && this.f14797i == c4525v.f14797i && AbstractC16544l.m18089b(this.f14798j, c4525v.f14798j) && AbstractC16544l.m18089b(this.f14799k, c4525v.f14799k) && AbstractC16544l.m18089b(this.f14789a, c4525v.f14789a);
    }

    public final int hashCode() {
        boolean z6 = this.f14800l;
        if (!z6) {
            return z6 ? 1231 : 1237;
        }
        return this.f14789a.hashCode() + ((this.f14799k.hashCode() + ((this.f14798j.hashCode() + AbstractC12107L1.m13819j(this.f14797i, AbstractC12107L1.m13819j(this.f14796h, (Float.floatToIntBits(m5266a()) + AbstractC12107L1.m13819j(this.f14795g, AbstractC12107L1.m13819j(this.f14794f, AbstractC12107L1.m13819j(this.f14793e, AbstractC12107L1.m13819j(this.f14792d, (z6 ? 1231 : 1237) * 31, 31), 31), 31), 31)) * 31, 31), 31)) * 31)) * 31);
    }
}
