package p948pi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: pi.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18426i {

    /* JADX INFO: renamed from: a */
    public final String f58788a;

    public final boolean equals(Object obj) {
        if (obj instanceof C18426i) {
            return AbstractC16544l.m18089b(this.f58788a, ((C18426i) obj).f58788a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58788a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f58788a, Separators.RPAREN, new StringBuilder("IntegrityCookie(value="));
    }
}
