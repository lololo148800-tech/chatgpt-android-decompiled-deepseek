package p855kj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: kj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16427f extends AbstractC16428g {

    /* JADX INFO: renamed from: a */
    public final String f50956a = "Wired Headset";

    @Override // p855kj.AbstractC16428g
    /* JADX INFO: renamed from: a */
    public final String mo18009a() {
        return this.f50956a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16427f) {
            return AbstractC16544l.m18089b(this.f50956a, ((C16427f) obj).f50956a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f50956a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f50956a, Separators.RPAREN, new StringBuilder("WiredHeadset(name="));
    }
}
