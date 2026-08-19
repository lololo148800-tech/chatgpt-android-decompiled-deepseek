package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: A8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0403f {

    /* JADX INFO: renamed from: a */
    public final C0399b f1344a;

    public C0403f(C0399b c0399b) {
        this.f1344a = c0399b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0403f) && AbstractC16544l.m18089b(this.f1344a, ((C0403f) obj).f1344a);
    }

    public final int hashCode() {
        C0399b c0399b = this.f1344a;
        if (c0399b == null) {
            return 0;
        }
        return c0399b.hashCode();
    }

    public final String toString() {
        return "Network(client=" + this.f1344a + Separators.RPAREN;
    }
}
