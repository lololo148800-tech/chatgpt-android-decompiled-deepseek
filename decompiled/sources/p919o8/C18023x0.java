package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18023x0 {

    /* JADX INFO: renamed from: a */
    public final C17898G0 f57530a;

    public C18023x0(C17898G0 c17898g0) {
        this.f57530a = c17898g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18023x0) && AbstractC16544l.m18089b(this.f57530a, ((C18023x0) obj).f57530a);
    }

    public final int hashCode() {
        C17898G0 c17898g0 = this.f57530a;
        if (c17898g0 == null) {
            return 0;
        }
        return c17898g0.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f57530a + Separators.RPAREN;
    }
}
