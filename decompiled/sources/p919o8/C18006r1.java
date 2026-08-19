package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18006r1 {

    /* JADX INFO: renamed from: a */
    public final String f57488a;

    public C18006r1(String str) {
        this.f57488a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18006r1) && AbstractC16544l.m18089b(this.f57488a, ((C18006r1) obj).f57488a);
    }

    public final int hashCode() {
        return this.f57488a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57488a, Separators.RPAREN, new StringBuilder("CiTest(testExecutionId="));
    }
}
