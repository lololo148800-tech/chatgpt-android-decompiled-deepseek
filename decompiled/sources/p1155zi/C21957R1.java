package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zi.R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21957R1 {

    /* JADX INFO: renamed from: a */
    public final String f69517a;

    public final boolean equals(Object obj) {
        if (obj instanceof C21957R1) {
            return AbstractC16544l.m18089b(this.f69517a, ((C21957R1) obj).f69517a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69517a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f69517a, Separators.RPAREN, new StringBuilder("Route(internalRoute="));
    }
}
