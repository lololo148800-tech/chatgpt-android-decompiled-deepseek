package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17968f {

    /* JADX INFO: renamed from: a */
    public final String f57350a;

    public C17968f(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f57350a = id2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17968f) && AbstractC16544l.m18089b(this.f57350a, ((C17968f) obj).f57350a);
    }

    public final int hashCode() {
        return this.f57350a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57350a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
