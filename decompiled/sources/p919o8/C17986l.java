package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C17986l {

    /* JADX INFO: renamed from: a */
    public final String f57429a;

    public C17986l(String str) {
        this.f57429a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17986l) && AbstractC16544l.m18089b(this.f57429a, ((C17986l) obj).f57429a);
    }

    public final int hashCode() {
        return this.f57429a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f57429a, Separators.RPAREN, new StringBuilder("ContainerView(id="));
    }
}
