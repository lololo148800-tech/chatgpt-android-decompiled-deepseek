package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17913L0 {

    /* JADX INFO: renamed from: a */
    public final String f57112a;

    public C17913L0(String str) {
        this.f57112a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17913L0) && AbstractC16544l.m18089b(this.f57112a, ((C17913L0) obj).f57112a);
    }

    public final int hashCode() {
        return this.f57112a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57112a, Separators.RPAREN, new StringBuilder("CiTest(testExecutionId="));
    }
}
