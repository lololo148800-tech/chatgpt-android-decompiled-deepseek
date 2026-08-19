package p1007s7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: s7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C19463b {

    /* JADX INFO: renamed from: a */
    public final String f61765a;

    public C19463b(String str) {
        this.f61765a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19463b) && AbstractC16544l.m18089b(this.f61765a, ((C19463b) obj).f61765a);
    }

    public final int hashCode() {
        return this.f61765a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f61765a, Separators.RPAREN, new StringBuilder("BatchId(id="));
    }
}
