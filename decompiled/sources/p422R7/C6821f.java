package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: R7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6821f {

    /* JADX INFO: renamed from: a */
    public final C6816a f21882a;

    public C6821f(C6816a c6816a) {
        this.f21882a = c6816a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6821f) && AbstractC16544l.m18089b(this.f21882a, ((C6821f) obj).f21882a);
    }

    public final int hashCode() {
        return this.f21882a.hashCode();
    }

    public final String toString() {
        return "Network(client=" + this.f21882a + Separators.RPAREN;
    }
}
