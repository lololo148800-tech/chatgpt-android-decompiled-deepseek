package p804i8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p544W9.AbstractC8595Z2;

/* JADX INFO: renamed from: i8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14945d extends AbstractC8595Z2 {

    /* JADX INFO: renamed from: a */
    public final int f46564a;

    public C14945d(int i10) {
        this.f46564a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14945d) && this.f46564a == ((C14945d) obj).f46564a;
    }

    public final int hashCode() {
        return this.f46564a;
    }

    public final String toString() {
        return AbstractC10763a.m11056n(new StringBuilder("Action(frustrationCount="), this.f46564a, Separators.RPAREN);
    }
}
