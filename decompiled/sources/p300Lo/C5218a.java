package p300Lo;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Lo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218a {

    /* JADX INFO: renamed from: a */
    public final Object f16953a;

    public C5218a(Object obj) {
        this.f16953a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5218a) && AbstractC16544l.m18089b(this.f16953a, ((C5218a) obj).f16953a);
    }

    public final int hashCode() {
        Object obj = this.f16953a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SingleNestedValue(value=" + this.f16953a + Separators.RPAREN;
    }
}
