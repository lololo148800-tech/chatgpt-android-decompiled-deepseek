package p1058v7;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: v7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C20474f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ short f64996Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f64997Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20474f(short s10, int i10) {
        super(0);
        this.f64996Y = s10;
        this.f64997Z = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String str;
        int i10 = this.f64997Z;
        short sM19524g = AbstractC17792x.m19524g(i10);
        StringBuilder sb2 = new StringBuilder("Unexpected block type identifier=");
        sb2.append((int) this.f64996Y);
        sb2.append(" met, was expecting ");
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "META";
        } else {
            str = "EVENT";
        }
        sb2.append(str);
        sb2.append(Separators.LPAREN);
        return AbstractC10763a.m11056n(sb2, sM19524g, Separators.RPAREN);
    }
}
