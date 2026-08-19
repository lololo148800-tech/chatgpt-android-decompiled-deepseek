package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.C21094o;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17752d {

    /* JADX INFO: renamed from: a */
    public final C21094o f56685a;

    public C17752d(C21094o c21094o) {
        this.f56685a = c21094o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17752d) && AbstractC16544l.m18089b(this.f56685a, ((C17752d) obj).f56685a);
    }

    public final int hashCode() {
        return this.f56685a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.f56685a + ')';
    }
}
