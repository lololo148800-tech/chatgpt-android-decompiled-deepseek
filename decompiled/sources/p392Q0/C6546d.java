package p392Q0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Q0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6546d implements RandomAccess {

    /* JADX INFO: renamed from: Y */
    public Object[] f21182Y;

    /* JADX INFO: renamed from: Z */
    public C6543a f21183Z;

    /* JADX INFO: renamed from: o0 */
    public int f21184o0 = 0;

    public C6546d(Object[] objArr) {
        this.f21182Y = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m7098a(int i10, Object obj) {
        m7106k(this.f21184o0 + 1);
        Object[] objArr = this.f21182Y;
        int i11 = this.f21184o0;
        if (i10 != i11) {
            AbstractC17678l.m19304k(i10 + 1, i10, i11, objArr, objArr);
        }
        objArr[i10] = obj;
        this.f21184o0++;
    }

    /* JADX INFO: renamed from: c */
    public final void m7099c(Object obj) {
        m7106k(this.f21184o0 + 1);
        Object[] objArr = this.f21182Y;
        int i10 = this.f21184o0;
        objArr[i10] = obj;
        this.f21184o0 = i10 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m7100d(int i10, C6546d c6546d) {
        if (c6546d.m7108m()) {
            return;
        }
        m7106k(this.f21184o0 + c6546d.f21184o0);
        Object[] objArr = this.f21182Y;
        int i11 = this.f21184o0;
        if (i10 != i11) {
            AbstractC17678l.m19304k(c6546d.f21184o0 + i10, i10, i11, objArr, objArr);
        }
        AbstractC17678l.m19304k(i10, 0, c6546d.f21184o0, c6546d.f21182Y, objArr);
        this.f21184o0 += c6546d.f21184o0;
    }

    /* JADX INFO: renamed from: f */
    public final void m7101f(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        m7106k(list.size() + this.f21184o0);
        Object[] objArr = this.f21182Y;
        if (i10 != this.f21184o0) {
            AbstractC17678l.m19304k(list.size() + i10, i10, this.f21184o0, objArr, objArr);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = list.get(i11);
        }
        this.f21184o0 = list.size() + this.f21184o0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7102g(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        m7106k(collection.size() + this.f21184o0);
        Object[] objArr = this.f21182Y;
        if (i10 != this.f21184o0) {
            AbstractC17678l.m19304k(collection.size() + i10, i10, this.f21184o0, objArr, objArr);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f21184o0 = collection.size() + this.f21184o0;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final List m7103h() {
        C6543a c6543a = this.f21183Z;
        if (c6543a != null) {
            return c6543a;
        }
        C6543a c6543a2 = new C6543a(this);
        this.f21183Z = c6543a2;
        return c6543a2;
    }

    /* JADX INFO: renamed from: i */
    public final void m7104i() {
        Object[] objArr = this.f21182Y;
        int i10 = this.f21184o0;
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.f21184o0 = 0;
                return;
            }
            objArr[i10] = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7105j(Object obj) {
        int i10 = this.f21184o0 - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !AbstractC16544l.m18089b(this.f21182Y[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m7106k(int i10) {
        Object[] objArr = this.f21182Y;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
            this.f21182Y = objArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m7107l(Object obj) {
        int i10 = this.f21184o0;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.f21182Y;
        int i11 = 0;
        while (!AbstractC16544l.m18089b(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7108m() {
        return this.f21184o0 == 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m7109n() {
        return this.f21184o0 != 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7110o(Object obj) {
        int iM7107l = m7107l(obj);
        if (iM7107l < 0) {
            return false;
        }
        m7111p(iM7107l);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final Object m7111p(int i10) {
        Object[] objArr = this.f21182Y;
        Object obj = objArr[i10];
        int i11 = this.f21184o0;
        if (i10 != i11 - 1) {
            AbstractC17678l.m19304k(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f21184o0 - 1;
        this.f21184o0 = i12;
        objArr[i12] = null;
        return obj;
    }

    /* JADX INFO: renamed from: q */
    public final void m7112q(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f21184o0;
            if (i11 < i12) {
                Object[] objArr = this.f21182Y;
                AbstractC17678l.m19304k(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f21184o0;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f21182Y[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f21184o0 = i14;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7113r(Comparator comparator) {
        Arrays.sort(this.f21182Y, 0, this.f21184o0, comparator);
    }
}
