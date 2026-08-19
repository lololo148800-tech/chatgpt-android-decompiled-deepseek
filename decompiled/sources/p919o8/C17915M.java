package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.M */
/* JADX INFO: loaded from: classes.dex */
public final class C17915M {

    /* JADX INFO: renamed from: a */
    public final String f57115a;

    public C17915M(String str) {
        this.f57115a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17915M) && AbstractC16544l.m18089b(this.f57115a, ((C17915M) obj).f57115a);
    }

    public final int hashCode() {
        return this.f57115a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57115a, Separators.RPAREN, new StringBuilder("CiTest(testExecutionId="));
    }
}
