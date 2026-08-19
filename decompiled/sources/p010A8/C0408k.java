package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0408k {

    /* JADX INFO: renamed from: a */
    public final String f1354a;

    public C0408k(String str) {
        this.f1354a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0408k) && AbstractC16544l.m18089b(this.f1354a, ((C0408k) obj).f1354a);
    }

    public final int hashCode() {
        String str = this.f1354a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f1354a, Separators.RPAREN, new StringBuilder("View(id="));
    }
}
