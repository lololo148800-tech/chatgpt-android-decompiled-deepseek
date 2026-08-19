package p592Y7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p642a8.C10523f;

/* JADX INFO: renamed from: Y7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9669d {

    /* JADX INFO: renamed from: a */
    public final C10523f f29155a;

    public C9669d(C10523f featureConfiguration) {
        AbstractC16544l.m18094g(featureConfiguration, "featureConfiguration");
        this.f29155a = featureConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9669d)) {
            return false;
        }
        C9669d c9669d = (C9669d) obj;
        c9669d.getClass();
        return AbstractC16544l.m18089b(this.f29155a, c9669d.f29155a);
    }

    public final int hashCode() {
        return this.f29155a.hashCode() + 1136396365;
    }

    public final String toString() {
        return "RumConfiguration(applicationId=c9880c8d-14b8-4540-aefd-e4a07e9216b4, featureConfiguration=" + this.f29155a + Separators.RPAREN;
    }
}
