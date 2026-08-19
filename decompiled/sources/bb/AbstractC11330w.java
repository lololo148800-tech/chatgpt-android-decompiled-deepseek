package bb;

import com.google.android.gms.internal.play_billing.AbstractC11957g1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: bb.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11330w {

    /* JADX INFO: renamed from: a */
    public Serializable f34260a;

    /* JADX INFO: renamed from: b */
    public int f34261b;

    /* JADX INFO: renamed from: c */
    public boolean f34262c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Object[]] */
    public AbstractC11330w() {
        AbstractC11957g1.m13448j(4, "initialCapacity");
        this.f34260a = new Object[4];
        this.f34261b = 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m12760e(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: h */
    public static int m12761h(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return i12;
    }

    /* JADX INFO: renamed from: a */
    public void m12762a(Object obj) {
        obj.getClass();
        m12765f(this.f34261b + 1);
        Object[] objArr = (Object[]) this.f34260a;
        int i10 = this.f34261b;
        this.f34261b = i10 + 1;
        objArr[i10] = obj;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC11330w mo12701b(Object obj);

    /* JADX INFO: renamed from: c */
    public void m12763c(Object obj) {
        m12762a(obj);
    }

    /* JADX INFO: renamed from: d */
    public void m12764d(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            m12765f(list2.size() + this.f34261b);
            if (list2 instanceof AbstractC11331x) {
                this.f34261b = ((AbstractC11331x) list2).mo12698i(this.f34261b, (Object[]) this.f34260a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo12701b(it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: f */
    public void m12765f(int i10) {
        Object[] objArr = (Object[]) this.f34260a;
        if (objArr.length < i10) {
            this.f34260a = Arrays.copyOf(objArr, m12760e(objArr.length, i10));
            this.f34262c = false;
        } else if (this.f34262c) {
            this.f34260a = (Object[]) objArr.clone();
            this.f34262c = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12766g(Object obj) {
        obj.getClass();
        m12767i(1);
        Object[] objArr = (Object[]) this.f34260a;
        int i10 = this.f34261b;
        this.f34261b = i10 + 1;
        objArr[i10] = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: i */
    public void m12767i(int i10) {
        int length = ((Object[]) this.f34260a).length;
        int iM12761h = m12761h(length, this.f34261b + i10);
        if (iM12761h > length || this.f34262c) {
            this.f34260a = Arrays.copyOf((Object[]) this.f34260a, iM12761h);
            this.f34262c = false;
        }
    }

    public AbstractC11330w(boolean z6, int i10, Throwable th2, int i11) {
        i10 = (i11 & 2) != 0 ? 0 : i10;
        th2 = (i11 & 4) != 0 ? null : th2;
        this.f34262c = z6;
        this.f34261b = i10;
        this.f34260a = th2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable, java.lang.Object[]] */
    public AbstractC11330w(int i10) {
        AbstractC11320m.m12724c(i10, "initialCapacity");
        this.f34260a = new Object[i10];
        this.f34261b = 0;
    }
}
