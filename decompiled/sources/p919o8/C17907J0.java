package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17907J0 {

    /* JADX INFO: renamed from: a */
    public final String f57098a;

    public C17907J0(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f57098a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17907J0) && AbstractC16544l.m18089b(this.f57098a, ((C17907J0) obj).f57098a);
    }

    public final int hashCode() {
        return this.f57098a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57098a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
