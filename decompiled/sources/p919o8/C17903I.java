package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.I */
/* JADX INFO: loaded from: classes.dex */
public final class C17903I {

    /* JADX INFO: renamed from: a */
    public final String f57082a;

    public C17903I(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f57082a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17903I) && AbstractC16544l.m18089b(this.f57082a, ((C17903I) obj).f57082a);
    }

    public final int hashCode() {
        return this.f57082a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57082a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
