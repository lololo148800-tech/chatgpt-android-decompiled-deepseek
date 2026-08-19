package p624Zg;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Zg.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C10336F {

    /* JADX INFO: renamed from: a */
    public final String f30668a;

    public final boolean equals(Object obj) {
        if (obj instanceof C10336F) {
            return AbstractC16544l.m18089b(this.f30668a, ((C10336F) obj).f30668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30668a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f30668a, Separators.RPAREN, new StringBuilder("Id(value="));
    }
}
