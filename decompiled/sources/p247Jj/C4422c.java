package p247Jj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4422c extends AbstractC4424d {

    /* JADX INFO: renamed from: a */
    public final AbstractC4433h0 f14367a;

    public C4422c(AbstractC4433h0 abstractC4433h0) {
        this.f14367a = abstractC4433h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4422c) && AbstractC16544l.m18089b(this.f14367a, ((C4422c) obj).f14367a);
    }

    public final int hashCode() {
        return this.f14367a.hashCode();
    }

    public final String toString() {
        return "Success(nextState=" + this.f14367a + Separators.RPAREN;
    }
}
