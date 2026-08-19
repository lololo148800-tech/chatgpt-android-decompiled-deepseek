package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: R7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6817b {

    /* JADX INFO: renamed from: a */
    public final C6818c f21871a;

    public C6817b(C6818c c6818c) {
        this.f21871a = c6818c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6817b) && AbstractC16544l.m18089b(this.f21871a, ((C6817b) obj).f21871a);
    }

    public final int hashCode() {
        return this.f21871a.f21872a.hashCode();
    }

    public final String toString() {
        return "Dd(device=" + this.f21871a + Separators.RPAREN;
    }
}
