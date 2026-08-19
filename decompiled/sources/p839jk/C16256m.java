package p839jk;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: jk.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C16256m implements InterfaceC16261r {

    /* JADX INFO: renamed from: a */
    public final int f50384a;

    public C16256m(int i10) {
        this.f50384a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16256m) && this.f50384a == ((C16256m) obj).f50384a;
    }

    public final int hashCode() {
        return this.f50384a;
    }

    public final String toString() {
        return AbstractC10763a.m11056n(new StringBuilder("CheckUpload(pageIndex="), this.f50384a, Separators.RPAREN);
    }
}
