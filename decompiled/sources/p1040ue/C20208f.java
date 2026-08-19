package p1040ue;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: ue.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20208f {

    /* JADX INFO: renamed from: a */
    public final String f63977a;

    public final boolean equals(Object obj) {
        if (obj instanceof C20208f) {
            return AbstractC16544l.m18089b(this.f63977a, ((C20208f) obj).f63977a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63977a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f63977a, Separators.RPAREN, new StringBuilder("InputDecorationId(value="));
    }
}
