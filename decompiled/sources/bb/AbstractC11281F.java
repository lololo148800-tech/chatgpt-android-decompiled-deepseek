package bb;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import p817j$.util.Objects;

/* JADX INFO: renamed from: bb.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11281F extends AbstractC11331x implements Set {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ int f34166o0 = 0;

    /* JADX INFO: renamed from: Z */
    public transient AbstractC11278C f34167Z;

    /* JADX INFO: renamed from: r */
    public static int m12703r(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC11281F m12704s(int i10, Object... objArr) {
        if (i10 == 0) {
            return C11300Z.f34205v0;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C11312f0(obj);
        }
        int iM12703r = m12703r(i10);
        Object[] objArr2 = new Object[iM12703r];
        int i11 = iM12703r - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM12736p = AbstractC11320m.m12736p(iHashCode);
            while (true) {
                int i15 = iM12736p & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM12736p++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C11312f0(obj4);
        }
        if (m12703r(i13) < iM12703r / 2) {
            return m12704s(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C11300Z(i12, i11, i13, objArr, objArr2);
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC11281F m12705t(Collection collection) {
        if ((collection instanceof AbstractC11281F) && !(collection instanceof SortedSet)) {
            AbstractC11281F abstractC11281F = (AbstractC11281F) collection;
            if (!abstractC11281F.mo12687q()) {
                return abstractC11281F;
            }
        }
        Object[] array = collection.toArray();
        return m12704s(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC11281F) && (this instanceof C11300Z)) {
            AbstractC11281F abstractC11281F = (AbstractC11281F) obj;
            abstractC11281F.getClass();
            if ((abstractC11281F instanceof C11300Z) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC11320m.m12727g(this, obj);
    }

    @Override // bb.AbstractC11331x
    /* JADX INFO: renamed from: f */
    public AbstractC11278C mo12697f() {
        AbstractC11278C abstractC11278C = this.f34167Z;
        if (abstractC11278C != null) {
            return abstractC11278C;
        }
        AbstractC11278C abstractC11278CMo12706u = mo12706u();
        this.f34167Z = abstractC11278CMo12706u;
        return abstractC11278CMo12706u;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC11320m.m12730j(this);
    }

    /* JADX INFO: renamed from: u */
    public AbstractC11278C mo12706u() {
        Object[] array = toArray(AbstractC11331x.f34263Y);
        C11276A c11276a = AbstractC11278C.f34162Z;
        return AbstractC11278C.m12689r(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC11314g0 iterator();
}
