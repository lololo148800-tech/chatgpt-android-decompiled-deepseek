package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zi.H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21921H1 implements InterfaceC21925I1 {

    /* JADX INFO: renamed from: a */
    public final Object f69472a;

    public final boolean equals(Object obj) {
        if (obj instanceof C21921H1) {
            return AbstractC16544l.m18089b(this.f69472a, ((C21921H1) obj).f69472a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f69472a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f69472a + Separators.RPAREN;
    }
}
