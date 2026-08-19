package p858ko;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ko.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C16500c {

    /* JADX INFO: renamed from: a */
    public final Float f51183a;

    public C16500c(Float f10) {
        this.f51183a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16500c) && AbstractC16544l.m18089b(this.f51183a, ((C16500c) obj).f51183a);
    }

    public final int hashCode() {
        Float f10 = this.f51183a;
        if (f10 == null) {
            return 0;
        }
        return f10.hashCode();
    }

    public final String toString() {
        return "CycleZoomOnDoubleClick(maxZoomFactor=" + this.f51183a + Separators.RPAREN;
    }
}
