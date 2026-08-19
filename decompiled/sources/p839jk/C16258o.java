package p839jk;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: jk.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C16258o implements InterfaceC16261r {

    /* JADX INFO: renamed from: a */
    public final int f50386a;

    public C16258o(int i10) {
        this.f50386a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16258o) && this.f50386a == ((C16258o) obj).f50386a;
    }

    public final int hashCode() {
        return this.f50386a;
    }

    public final String toString() {
        return AbstractC10763a.m11056n(new StringBuilder("Prompt(pageIndex="), this.f50386a, Separators.RPAREN);
    }
}
