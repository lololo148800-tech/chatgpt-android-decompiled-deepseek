package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18000p1 {

    /* JADX INFO: renamed from: a */
    public final String f57474a;

    public C18000p1(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f57474a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18000p1) && AbstractC16544l.m18089b(this.f57474a, ((C18000p1) obj).f57474a);
    }

    public final int hashCode() {
        return this.f57474a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57474a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
