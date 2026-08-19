package p000;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8464D2;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: classes.dex */
public final class C21348y extends AbstractC8464D2 {

    /* JADX INFO: renamed from: a */
    public final Object f67812a;

    public C21348y(Object obj) {
        this.f67812a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21348y) && AbstractC16544l.m18089b(this.f67812a, ((C21348y) obj).f67812a);
    }

    public final int hashCode() {
        return this.f67812a.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f67812a + Separators.RPAREN;
    }
}
