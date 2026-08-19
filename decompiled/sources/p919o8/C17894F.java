package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.F */
/* JADX INFO: loaded from: classes.dex */
public final class C17894F {

    /* JADX INFO: renamed from: a */
    public final Number f57027a;

    /* JADX INFO: renamed from: b */
    public final Number f57028b;

    public C17894F(Number number, Number number2) {
        this.f57027a = number;
        this.f57028b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17894F)) {
            return false;
        }
        C17894F c17894f = (C17894F) obj;
        return AbstractC16544l.m18089b(this.f57027a, c17894f.f57027a) && AbstractC16544l.m18089b(this.f57028b, c17894f.f57028b);
    }

    public final int hashCode() {
        return this.f57028b.hashCode() + (this.f57027a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f57027a + ", height=" + this.f57028b + Separators.RPAREN;
    }
}
