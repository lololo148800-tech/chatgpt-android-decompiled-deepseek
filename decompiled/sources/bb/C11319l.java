package bb;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Arrays;
import p644ab.InterfaceC10532e;

/* JADX INFO: renamed from: bb.l */
/* JADX INFO: loaded from: classes.dex */
public final class C11319l extends AbstractC11293S implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10532e f34235Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC11293S f34236Z;

    public C11319l(InterfaceC10532e interfaceC10532e, AbstractC11293S abstractC11293S) {
        this.f34235Y = interfaceC10532e;
        abstractC11293S.getClass();
        this.f34236Z = abstractC11293S;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC10532e interfaceC10532e = this.f34235Y;
        return this.f34236Z.compare(interfaceC10532e.mo22421apply(obj), interfaceC10532e.mo22421apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11319l)) {
            return false;
        }
        C11319l c11319l = (C11319l) obj;
        return this.f34235Y.equals(c11319l.f34235Y) && this.f34236Z.equals(c11319l.f34236Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34235Y, this.f34236Z});
    }

    public final String toString() {
        return this.f34236Z + ".onResultOf(" + this.f34235Y + Separators.RPAREN;
    }
}
