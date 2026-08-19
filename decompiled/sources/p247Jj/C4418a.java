package p247Jj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4418a extends AbstractC4424d {

    /* JADX INFO: renamed from: a */
    public final C4412V f14338a;

    public C4418a(C4412V c4412v) {
        this.f14338a = c4412v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4418a) && AbstractC16544l.m18089b(this.f14338a, ((C4418a) obj).f14338a);
    }

    public final int hashCode() {
        return this.f14338a.hashCode();
    }

    public final String toString() {
        return "Complete(nextState=" + this.f14338a + Separators.RPAREN;
    }
}
