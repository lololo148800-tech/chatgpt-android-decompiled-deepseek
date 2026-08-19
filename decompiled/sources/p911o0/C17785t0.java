package p911o0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import p530Vi.AbstractC8301I;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: o0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17785t0 implements InterfaceC17783s0 {

    /* JADX INFO: renamed from: a */
    public static final C17785t0 f56761a = new C17785t0();

    /* JADX INFO: renamed from: a */
    public final InterfaceC10459q m19513a(InterfaceC10459q interfaceC10459q, float f10, boolean z6) {
        if (f10 > 0.0d) {
            return interfaceC10459q.mo428M(new LayoutWeightElement(AbstractC8301I.m8917h(f10, Float.MAX_VALUE), z6));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }
}
