package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18008s0 {

    /* JADX INFO: renamed from: a */
    public final String f57494a;

    public C18008s0(String str) {
        this.f57494a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18008s0) && AbstractC16544l.m18089b(this.f57494a, ((C18008s0) obj).f57494a);
    }

    public final int hashCode() {
        return this.f57494a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57494a, Separators.RPAREN, new StringBuilder("ContainerView(id="));
    }
}
