package p247Jj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.O0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4400O0 extends AbstractC4402P0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4433h0 f14288a;

    public C4400O0(AbstractC4433h0 abstractC4433h0) {
        this.f14288a = abstractC4433h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4400O0) && AbstractC16544l.m18089b(this.f14288a, ((C4400O0) obj).f14288a);
    }

    public final int hashCode() {
        return this.f14288a.hashCode();
    }

    public final String toString() {
        return "Success(nextState=" + this.f14288a + Separators.RPAREN;
    }
}
