package mp;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p879lp.InterfaceC17121d;

/* JADX INFO: renamed from: mp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C17362c implements InterfaceC17121d {

    /* JADX INFO: renamed from: a */
    public final int f55391a;

    /* JADX INFO: renamed from: b */
    public final int f55392b;

    public C17362c(int i10, int i11) {
        this.f55391a = i10;
        this.f55392b = i11;
    }

    @Override // p879lp.InterfaceC17121d
    public final int getBeginIndex() {
        return this.f55391a;
    }

    @Override // p879lp.InterfaceC17121d
    public final int getEndIndex() {
        return this.f55392b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Span{beginIndex=");
        sb2.append(this.f55391a);
        sb2.append(", endIndex=");
        return AbstractC10763a.m11056n(sb2, this.f55392b, "}");
    }
}
