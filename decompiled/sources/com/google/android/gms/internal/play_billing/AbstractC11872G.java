package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import p817j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11872G extends AbstractC12019w implements Set, p817j$.util.Set {

    /* JADX INFO: renamed from: Z */
    public transient AbstractC11857B f36128Z;

    /* JADX INFO: renamed from: r */
    public static int m13263r(int i10) {
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

    /* JADX INFO: renamed from: t */
    public static AbstractC11872G m13264t(int i10, Object... objArr) {
        if (i10 == 0) {
            return C11925Y.f36218u0;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C11932a0(obj);
        }
        int iM13263r = m13263r(i10);
        Object[] objArr2 = new Object[iM13263r];
        int i11 = iM13263r - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM13442c = AbstractC11957g1.m13442c(iHashCode);
            while (true) {
                int i15 = iM13442c & i11;
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
                iM13442c++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C11932a0(obj4);
        }
        if (m13263r(i13) < iM13263r / 2) {
            return m13264t(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C11925Y(i12, i11, i13, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC11872G) && (this instanceof C11925Y)) {
            AbstractC11872G abstractC11872G = (AbstractC11872G) obj;
            abstractC11872G.getClass();
            if ((abstractC11872G instanceof C11925Y) && hashCode() != obj.hashCode()) {
                return false;
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
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC12019w
    /* JADX INFO: renamed from: m */
    public AbstractC11857B mo13224m() {
        AbstractC11857B abstractC11857B = this.f36128Z;
        if (abstractC11857B != null) {
            return abstractC11857B;
        }
        AbstractC11857B abstractC11857BMo13265s = mo13265s();
        this.f36128Z = abstractC11857BMo13265s;
        return abstractC11857BMo13265s;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC11857B mo13265s() {
        Object[] array = toArray(AbstractC12019w.f36342Y);
        C12027y c12027y = AbstractC11857B.f36097Z;
        return AbstractC11857B.m13221t(array.length, array);
    }
}
