package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import java.util.Set;
import p817j$.util.Objects;

/* JADX INFO: renamed from: S9.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7085o extends AbstractC7071h implements Set, p817j$.util.Set {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ int f22568o0 = 0;

    /* JADX INFO: renamed from: Z */
    public transient AbstractC7081m f22569Z;

    /* JADX INFO: renamed from: q */
    public static AbstractC7085o m7495q(int i10, Object... objArr) {
        if (i10 == 0) {
            return C7099y.f22589v0;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C7034C(obj);
        }
        int iM7496r = m7496r(i10);
        Object[] objArr2 = new Object[iM7496r];
        int i11 = iM7496r - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i15 = iRotateLeft & i11;
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
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C7034C(obj4);
        }
        if (m7496r(i13) < iM7496r / 2) {
            return m7495q(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C7099y(i12, i11, i13, objArr, objArr2);
    }

    /* JADX INFO: renamed from: r */
    public static int m7496r(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC7085o) && (this instanceof C7099y)) {
            AbstractC7085o abstractC7085o = (AbstractC7085o) obj;
            abstractC7085o.getClass();
            if (abstractC7085o instanceof C7099y) {
                if (((C7099y) this).f22591q0 != obj.hashCode()) {
                    return false;
                }
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC7057a.m7457b(this);
    }

    /* JADX INFO: renamed from: s */
    public AbstractC7081m mo7429s() {
        AbstractC7081m abstractC7081m = this.f22569Z;
        if (abstractC7081m != null) {
            return abstractC7081m;
        }
        AbstractC7081m abstractC7081mMo7497t = mo7497t();
        this.f22569Z = abstractC7081mMo7497t;
        return abstractC7081mMo7497t;
    }

    /* JADX INFO: renamed from: t */
    public AbstractC7081m mo7497t() {
        Object[] array = toArray(AbstractC7071h.f22545Y);
        C7073i c7073i = AbstractC7081m.f22562Z;
        return AbstractC7081m.m7491s(array.length, array);
    }
}
