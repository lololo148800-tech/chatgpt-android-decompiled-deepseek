package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17981j0 {

    /* JADX INFO: renamed from: a */
    public final Number f57398a;

    /* JADX INFO: renamed from: b */
    public final Number f57399b;

    public C17981j0(Number number, Number number2) {
        this.f57398a = number;
        this.f57399b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17981j0)) {
            return false;
        }
        C17981j0 c17981j0 = (C17981j0) obj;
        return AbstractC16544l.m18089b(this.f57398a, c17981j0.f57398a) && AbstractC16544l.m18089b(this.f57399b, c17981j0.f57399b);
    }

    public final int hashCode() {
        return this.f57399b.hashCode() + (this.f57398a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f57398a + ", height=" + this.f57399b + Separators.RPAREN;
    }
}
