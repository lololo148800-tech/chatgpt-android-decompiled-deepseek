package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: R7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6818c {

    /* JADX INFO: renamed from: a */
    public final String f21872a;

    public C6818c(String architecture) {
        AbstractC16544l.m18094g(architecture, "architecture");
        this.f21872a = architecture;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6818c) && AbstractC16544l.m18089b(this.f21872a, ((C6818c) obj).f21872a);
    }

    public final int hashCode() {
        return this.f21872a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f21872a, Separators.RPAREN, new StringBuilder("Device(architecture="));
    }
}
