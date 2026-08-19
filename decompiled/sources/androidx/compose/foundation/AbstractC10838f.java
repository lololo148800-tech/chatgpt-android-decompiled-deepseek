package androidx.compose.foundation;

import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.C14252G;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.foundation.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10838f {
    static {
        new AbstractC21672S() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // p1140z1.AbstractC21672S
            /* JADX INFO: renamed from: a */
            public final AbstractC10458p mo11196a() {
                return new C14252G();
            }

            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // p1140z1.AbstractC21672S
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ void mo11197i(AbstractC10458p abstractC10458p) {
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11213a(InterfaceC10459q interfaceC10459q, boolean z6, InterfaceC17406l interfaceC17406l) {
        return interfaceC10459q.mo428M(z6 ? new FocusableElement(interfaceC17406l) : C10456n.f30959Y);
    }
}
