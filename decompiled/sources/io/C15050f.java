package io;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p1135yn.C21555b;

/* JADX INFO: renamed from: io.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C15050f implements InterfaceC15054j {

    /* JADX INFO: renamed from: a */
    public final long f46777a;

    public C15050f(long j10) {
        this.f46777a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15050f) && C21555b.m21834d(this.f46777a, ((C15050f) obj).f46777a);
    }

    public final int hashCode() {
        return C21555b.m21837g(this.f46777a);
    }

    public final String toString() {
        return AbstractC10763a.m11054l("Dismissing(animationDuration=", C21555b.m21842l(this.f46777a), Separators.RPAREN);
    }
}
