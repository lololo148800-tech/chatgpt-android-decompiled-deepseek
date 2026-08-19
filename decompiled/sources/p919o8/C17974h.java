package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17974h {

    /* JADX INFO: renamed from: a */
    public final String f57378a;

    public C17974h(String str) {
        this.f57378a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17974h) && AbstractC16544l.m18089b(this.f57378a, ((C17974h) obj).f57378a);
    }

    public final int hashCode() {
        return this.f57378a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57378a, Separators.RPAREN, new StringBuilder("CiTest(testExecutionId="));
    }
}
