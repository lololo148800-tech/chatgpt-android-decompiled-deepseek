package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17929Q1 {

    /* JADX INFO: renamed from: a */
    public final Number f57143a;

    /* JADX INFO: renamed from: b */
    public final Number f57144b;

    /* JADX INFO: renamed from: c */
    public final Number f57145c;

    /* JADX INFO: renamed from: d */
    public final Number f57146d;

    public C17929Q1(Number number, Number number2, Number number3, Number number4) {
        this.f57143a = number;
        this.f57144b = number2;
        this.f57145c = number3;
        this.f57146d = number4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17929Q1)) {
            return false;
        }
        C17929Q1 c17929q1 = (C17929Q1) obj;
        return AbstractC16544l.m18089b(this.f57143a, c17929q1.f57143a) && AbstractC16544l.m18089b(this.f57144b, c17929q1.f57144b) && AbstractC16544l.m18089b(this.f57145c, c17929q1.f57145c) && AbstractC16544l.m18089b(this.f57146d, c17929q1.f57146d);
    }

    public final int hashCode() {
        return this.f57146d.hashCode() + ((this.f57145c.hashCode() + ((this.f57144b.hashCode() + (this.f57143a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Scroll(maxDepth=" + this.f57143a + ", maxDepthScrollTop=" + this.f57144b + ", maxScrollHeight=" + this.f57145c + ", maxScrollHeightTime=" + this.f57146d + Separators.RPAREN;
    }
}
