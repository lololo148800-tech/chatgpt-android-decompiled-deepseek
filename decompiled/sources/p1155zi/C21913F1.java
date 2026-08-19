package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zi.F1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21913F1 implements InterfaceC21925I1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC21933K1 f69462a;

    public final boolean equals(Object obj) {
        if (obj instanceof C21913F1) {
            return AbstractC16544l.m18089b(this.f69462a, ((C21913F1) obj).f69462a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69462a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.f69462a + Separators.RPAREN;
    }
}
