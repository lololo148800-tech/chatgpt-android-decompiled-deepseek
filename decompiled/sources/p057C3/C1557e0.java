package p057C3;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1073w3.AbstractC20817s;
import p232J3.C4222W;

/* JADX INFO: renamed from: C3.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1557e0 extends AbstractC19764N {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f4323k = 0;

    /* JADX INFO: renamed from: b */
    public final int f4324b;

    /* JADX INFO: renamed from: c */
    public final C4222W f4325c;

    /* JADX INFO: renamed from: d */
    public final int f4326d;

    /* JADX INFO: renamed from: e */
    public final int f4327e;

    /* JADX INFO: renamed from: f */
    public final int[] f4328f;

    /* JADX INFO: renamed from: g */
    public final int[] f4329g;

    /* JADX INFO: renamed from: h */
    public final AbstractC19764N[] f4330h;

    /* JADX INFO: renamed from: i */
    public final Object[] f4331i;

    /* JADX INFO: renamed from: j */
    public final HashMap f4332j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1557e0(List list, C4222W c4222w) {
        AbstractC19764N[] abstractC19764NArr = new AbstractC19764N[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            abstractC19764NArr[i11] = ((InterfaceC1540S) it.next()).mo2229b();
            i11++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((InterfaceC1540S) it2.next()).mo2228a();
            i10++;
        }
        this(abstractC19764NArr, objArr, c4222w);
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: a */
    public final int mo2412a(boolean z6) {
        if (this.f4324b == 0) {
            return -1;
        }
        int iM2421q = 0;
        if (z6) {
            int[] iArr = this.f4325c.f13794b;
            iM2421q = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            AbstractC19764N[] abstractC19764NArr = this.f4330h;
            if (!abstractC19764NArr[iM2421q].m20728p()) {
                return abstractC19764NArr[iM2421q].mo2412a(z6) + this.f4329g[iM2421q];
            }
            iM2421q = m2421q(iM2421q, z6);
        } while (iM2421q != -1);
        return -1;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: b */
    public final int mo2413b(Object obj) {
        int iMo2413b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f4332j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iMo2413b = this.f4330h[iIntValue].mo2413b(obj3)) == -1) {
            return -1;
        }
        return this.f4328f[iIntValue] + iMo2413b;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: c */
    public final int mo2414c(boolean z6) {
        int iM2422r;
        int i10 = this.f4324b;
        if (i10 == 0) {
            return -1;
        }
        if (z6) {
            int[] iArr = this.f4325c.f13794b;
            iM2422r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iM2422r = i10 - 1;
        }
        do {
            AbstractC19764N[] abstractC19764NArr = this.f4330h;
            if (!abstractC19764NArr[iM2422r].m20728p()) {
                return abstractC19764NArr[iM2422r].mo2414c(z6) + this.f4329g[iM2422r];
            }
            iM2422r = m2422r(iM2422r, z6);
        } while (iM2422r != -1);
        return -1;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: e */
    public final int mo2415e(int i10, int i11, boolean z6) {
        int[] iArr = this.f4329g;
        int iM21403d = AbstractC20817s.m21403d(iArr, i10 + 1, false, false);
        int i12 = iArr[iM21403d];
        AbstractC19764N[] abstractC19764NArr = this.f4330h;
        int iMo2415e = abstractC19764NArr[iM21403d].mo2415e(i10 - i12, i11 != 2 ? i11 : 0, z6);
        if (iMo2415e != -1) {
            return i12 + iMo2415e;
        }
        int iM2421q = m2421q(iM21403d, z6);
        while (iM2421q != -1 && abstractC19764NArr[iM2421q].m20728p()) {
            iM2421q = m2421q(iM2421q, z6);
        }
        if (iM2421q != -1) {
            return abstractC19764NArr[iM2421q].mo2412a(z6) + iArr[iM2421q];
        }
        if (i11 == 2) {
            return mo2412a(z6);
        }
        return -1;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: f */
    public final C19762L mo2410f(int i10, C19762L c19762l, boolean z6) {
        int[] iArr = this.f4328f;
        int iM21403d = AbstractC20817s.m21403d(iArr, i10 + 1, false, false);
        int i11 = this.f4329g[iM21403d];
        this.f4330h[iM21403d].mo2410f(i10 - iArr[iM21403d], c19762l, z6);
        c19762l.f62579c += i11;
        if (z6) {
            Object obj = this.f4331i[iM21403d];
            Object obj2 = c19762l.f62578b;
            obj2.getClass();
            c19762l.f62578b = Pair.create(obj, obj2);
        }
        return c19762l;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: g */
    public final C19762L mo2416g(Object obj, C19762L c19762l) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f4332j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f4329g[iIntValue];
        this.f4330h[iIntValue].mo2416g(obj3, c19762l);
        c19762l.f62579c += i10;
        c19762l.f62578b = obj;
        return c19762l;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: h */
    public final int mo2417h() {
        return this.f4327e;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: k */
    public final int mo2418k(int i10, int i11, boolean z6) {
        int[] iArr = this.f4329g;
        int iM21403d = AbstractC20817s.m21403d(iArr, i10 + 1, false, false);
        int i12 = iArr[iM21403d];
        AbstractC19764N[] abstractC19764NArr = this.f4330h;
        int iMo2418k = abstractC19764NArr[iM21403d].mo2418k(i10 - i12, i11 != 2 ? i11 : 0, z6);
        if (iMo2418k != -1) {
            return i12 + iMo2418k;
        }
        int iM2422r = m2422r(iM21403d, z6);
        while (iM2422r != -1 && abstractC19764NArr[iM2422r].m20728p()) {
            iM2422r = m2422r(iM2422r, z6);
        }
        if (iM2422r != -1) {
            return abstractC19764NArr[iM2422r].mo2414c(z6) + iArr[iM2422r];
        }
        if (i11 == 2) {
            return mo2414c(z6);
        }
        return -1;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: l */
    public final Object mo2419l(int i10) {
        int[] iArr = this.f4328f;
        int iM21403d = AbstractC20817s.m21403d(iArr, i10 + 1, false, false);
        return Pair.create(this.f4331i[iM21403d], this.f4330h[iM21403d].mo2419l(i10 - iArr[iM21403d]));
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: m */
    public final C19763M mo2411m(int i10, C19763M c19763m, long j10) {
        int[] iArr = this.f4329g;
        int iM21403d = AbstractC20817s.m21403d(iArr, i10 + 1, false, false);
        int i11 = iArr[iM21403d];
        int i12 = this.f4328f[iM21403d];
        this.f4330h[iM21403d].mo2411m(i10 - i11, c19763m, j10);
        Object objCreate = this.f4331i[iM21403d];
        if (!C19763M.f62584p.equals(c19763m.f62586a)) {
            objCreate = Pair.create(objCreate, c19763m.f62586a);
        }
        c19763m.f62586a = objCreate;
        c19763m.f62598m += i12;
        c19763m.f62599n += i12;
        return c19763m;
    }

    @Override // p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: o */
    public final int mo2420o() {
        return this.f4326d;
    }

    /* JADX INFO: renamed from: q */
    public final int m2421q(int i10, boolean z6) {
        if (!z6) {
            if (i10 < this.f4324b - 1) {
                return i10 + 1;
            }
            return -1;
        }
        C4222W c4222w = this.f4325c;
        int i11 = c4222w.f13795c[i10] + 1;
        int[] iArr = c4222w.f13794b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final int m2422r(int i10, boolean z6) {
        if (!z6) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        C4222W c4222w = this.f4325c;
        int i11 = c4222w.f13795c[i10] - 1;
        if (i11 >= 0) {
            return c4222w.f13794b[i11];
        }
        return -1;
    }

    public C1557e0(AbstractC19764N[] abstractC19764NArr, Object[] objArr, C4222W c4222w) {
        this.f4325c = c4222w;
        this.f4324b = c4222w.f13794b.length;
        int length = abstractC19764NArr.length;
        this.f4330h = abstractC19764NArr;
        this.f4328f = new int[length];
        this.f4329g = new int[length];
        this.f4331i = objArr;
        this.f4332j = new HashMap();
        int length2 = abstractC19764NArr.length;
        int i10 = 0;
        int iMo2420o = 0;
        int iMo2417h = 0;
        int i11 = 0;
        while (i10 < length2) {
            AbstractC19764N abstractC19764N = abstractC19764NArr[i10];
            this.f4330h[i11] = abstractC19764N;
            this.f4329g[i11] = iMo2420o;
            this.f4328f[i11] = iMo2417h;
            iMo2420o += abstractC19764N.mo2420o();
            iMo2417h += this.f4330h[i11].mo2417h();
            this.f4332j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f4326d = iMo2420o;
        this.f4327e = iMo2417h;
    }
}
