package bb;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: bb.v */
/* JADX INFO: loaded from: classes.dex */
public final class C11329v extends AbstractC11293S implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Comparator[] f34259Y;

    public C11329v(C11319l c11319l, C11319l c11319l2) {
        this.f34259Y = new Comparator[]{c11319l, c11319l2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f34259Y;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11329v) {
            return Arrays.equals(this.f34259Y, ((C11329v) obj).f34259Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34259Y);
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(Arrays.toString(this.f34259Y), Separators.RPAREN, new StringBuilder("Ordering.compound("));
    }
}
