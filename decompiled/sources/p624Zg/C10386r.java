package p624Zg;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Zg.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C10386r {

    /* JADX INFO: renamed from: a */
    public final String f30784a;

    public final boolean equals(Object obj) {
        if (obj instanceof C10386r) {
            return AbstractC16544l.m18089b(this.f30784a, ((C10386r) obj).f30784a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30784a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f30784a, Separators.RPAREN, new StringBuilder("Id(value="));
    }
}
