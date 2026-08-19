package p839jk;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: jk.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C16255l implements InterfaceC16261r {

    /* JADX INFO: renamed from: a */
    public final int f50383a;

    public C16255l(int i10) {
        this.f50383a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16255l) && this.f50383a == ((C16255l) obj).f50383a;
    }

    public final int hashCode() {
        return this.f50383a;
    }

    public final String toString() {
        return AbstractC10763a.m11056n(new StringBuilder("Check(pageIndex="), this.f50383a, Separators.RPAREN);
    }
}
