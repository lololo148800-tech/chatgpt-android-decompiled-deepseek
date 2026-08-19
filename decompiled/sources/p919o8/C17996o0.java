package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17996o0 {

    /* JADX INFO: renamed from: a */
    public final String f57468a;

    public C17996o0(String str) {
        this.f57468a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17996o0) && AbstractC16544l.m18089b(this.f57468a, ((C17996o0) obj).f57468a);
    }

    public final int hashCode() {
        return this.f57468a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57468a, Separators.RPAREN, new StringBuilder("CiTest(testExecutionId="));
    }
}
