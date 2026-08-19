package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: oc.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18053i extends AbstractC18048d {

    /* JADX INFO: renamed from: a */
    public final char f57602a;

    /* JADX INFO: renamed from: b */
    public final int f57603b;

    /* JADX INFO: renamed from: c */
    public final int f57604c;

    /* JADX INFO: renamed from: d */
    public final String f57605d;

    /* JADX INFO: renamed from: e */
    public final String f57606e;

    public C18053i(char c9, int i10, int i11, String info, String literal) {
        AbstractC16544l.m18094g(info, "info");
        AbstractC16544l.m18094g(literal, "literal");
        this.f57602a = c9;
        this.f57603b = i10;
        this.f57604c = i11;
        this.f57605d = info;
        this.f57606e = literal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18053i)) {
            return false;
        }
        C18053i c18053i = (C18053i) obj;
        return this.f57602a == c18053i.f57602a && this.f57603b == c18053i.f57603b && this.f57604c == c18053i.f57604c && AbstractC16544l.m18089b(this.f57605d, c18053i.f57605d) && AbstractC16544l.m18089b(this.f57606e, c18053i.f57606e);
    }

    public final int hashCode() {
        return this.f57606e.hashCode() + AbstractC0168G.m527p(((((this.f57602a * 31) + this.f57603b) * 31) + this.f57604c) * 31, 31, this.f57605d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstFencedCodeBlock(fenceChar=");
        sb2.append(this.f57602a);
        sb2.append(", fenceLength=");
        sb2.append(this.f57603b);
        sb2.append(TfazcFv.lNaivbGVztJImb);
        sb2.append(this.f57604c);
        sb2.append(", info=");
        sb2.append(this.f57605d);
        sb2.append(", literal=");
        return AbstractC9306j0.m9891j(this.f57606e, Separators.RPAREN, sb2);
    }
}
