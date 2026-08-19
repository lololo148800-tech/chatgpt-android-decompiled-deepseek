package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C17927Q {

    /* JADX INFO: renamed from: a */
    public final String f57141a;

    public C17927Q(String str) {
        this.f57141a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17927Q) && AbstractC16544l.m18089b(this.f57141a, ((C17927Q) obj).f57141a);
    }

    public final int hashCode() {
        return this.f57141a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57141a, Separators.RPAREN, new StringBuilder("ContainerView(id="));
    }
}
