package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17990m0 {

    /* JADX INFO: renamed from: a */
    public final String f57437a;

    public C17990m0(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f57437a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17990m0) && AbstractC16544l.m18089b(this.f57437a, ((C17990m0) obj).f57437a);
    }

    public final int hashCode() {
        return this.f57437a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57437a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
