package p839jk;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: jk.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C16260q implements InterfaceC16261r {

    /* JADX INFO: renamed from: a */
    public final int f50388a;

    public C16260q(int i10) {
        this.f50388a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16260q) && this.f50388a == ((C16260q) obj).f50388a;
    }

    public final int hashCode() {
        return this.f50388a;
    }

    public final String toString() {
        return AbstractC10763a.m11056n(new StringBuilder("TakePhoto(pageIndex="), this.f50388a, Separators.RPAREN);
    }
}
