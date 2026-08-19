package p010A8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: A8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0398a {

    /* JADX INFO: renamed from: a */
    public final String f1323a;

    public C0398a(String str) {
        this.f1323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0398a) && AbstractC16544l.m18089b(this.f1323a, ((C0398a) obj).f1323a);
    }

    public final int hashCode() {
        String str = this.f1323a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f1323a, Separators.RPAREN, new StringBuilder("Application(id="));
    }
}
