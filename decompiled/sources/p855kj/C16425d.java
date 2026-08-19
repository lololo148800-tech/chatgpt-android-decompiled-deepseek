package p855kj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: kj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16425d extends AbstractC16428g {

    /* JADX INFO: renamed from: a */
    public final String f50954a = "Earpiece";

    @Override // p855kj.AbstractC16428g
    /* JADX INFO: renamed from: a */
    public final String mo18009a() {
        return this.f50954a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16425d) {
            return AbstractC16544l.m18089b(this.f50954a, ((C16425d) obj).f50954a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f50954a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f50954a, Separators.RPAREN, new StringBuilder("Earpiece(name="));
    }
}
