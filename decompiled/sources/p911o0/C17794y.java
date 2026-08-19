package p911o0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import p530Vi.AbstractC8301I;
import p635a1.C10449g;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: o0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C17794y {

    /* JADX INFO: renamed from: a */
    public static final C17794y f56777a = new C17794y();

    /* JADX INFO: renamed from: a */
    public final InterfaceC10459q m19543a(InterfaceC10459q interfaceC10459q, C10449g c10449g) {
        return interfaceC10459q.mo428M(new HorizontalAlignElement(c10449g));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC10459q m19544b(InterfaceC10459q interfaceC10459q, boolean z6) {
        if (1.0f > 0.0d) {
            return interfaceC10459q.mo428M(new LayoutWeightElement(AbstractC8301I.m8917h(1.0f, Float.MAX_VALUE), z6));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
