package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0406i {

    /* JADX INFO: renamed from: a */
    public final String f1348a;

    public C0406i(String version) {
        AbstractC16544l.m18094g(version, "version");
        this.f1348a = version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0406i) && AbstractC16544l.m18089b(this.f1348a, ((C0406i) obj).f1348a);
    }

    public final int hashCode() {
        return this.f1348a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f1348a, Separators.RPAREN, new StringBuilder("Tracer(version="));
    }
}
