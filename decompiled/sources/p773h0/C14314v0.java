package p773h0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: h0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14314v0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44936Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f44937Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14314v0(int i10, int i11) {
        super(0);
        this.f44936Y = i11;
        this.f44937Z = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f44936Y) {
            case 0:
                return new C14322z0(this.f44937Z);
            default:
                return AbstractC10763a.m11056n(new StringBuilder("too many tags were added, "), this.f44937Z, " had to be discarded.");
        }
    }
}
