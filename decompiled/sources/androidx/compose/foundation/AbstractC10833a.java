package androidx.compose.foundation;

import p003A1.C0280q;
import p049Bm.InterfaceC1426a;
import p1051v0.C20416d;
import p156G1.C2960g;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.InterfaceC14267W;
import p773h0.InterfaceC14274b0;
import p774h1.AbstractC14334L;
import p774h1.C14327E;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.foundation.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10833a {
    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m11206a(InterfaceC10459q interfaceC10459q, C14327E c14327e, C20416d c20416d, int i10) {
        InterfaceC14339Q interfaceC14339Q = c20416d;
        if ((i10 & 2) != 0) {
            interfaceC14339Q = AbstractC14334L.f44973a;
        }
        return interfaceC10459q.mo428M(new BackgroundElement(0L, c14327e, 1.0f, interfaceC14339Q, 1));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q m11207b(InterfaceC10459q interfaceC10459q, long j10, InterfaceC14339Q interfaceC14339Q) {
        return interfaceC10459q.mo428M(new BackgroundElement(j10, null, 1.0f, interfaceC14339Q, 2));
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10459q m11208c(InterfaceC10459q interfaceC10459q, InterfaceC17406l interfaceC17406l, InterfaceC14267W interfaceC14267W, boolean z6, C2960g c2960g, InterfaceC1426a interfaceC1426a, int i10) {
        InterfaceC10459q interfaceC10459qM10921b;
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        if ((i10 & 16) != 0) {
            c2960g = null;
        }
        if (interfaceC14267W instanceof InterfaceC14274b0) {
            interfaceC10459qM10921b = new ClickableElement(interfaceC17406l, (InterfaceC14274b0) interfaceC14267W, z6, null, c2960g, interfaceC1426a);
        } else if (interfaceC14267W == null) {
            interfaceC10459qM10921b = new ClickableElement(interfaceC17406l, null, z6, null, c2960g, interfaceC1426a);
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (interfaceC17406l != null) {
                interfaceC10459qM10921b = AbstractC10839g.m11214a(c10456n, interfaceC17406l, interfaceC14267W).mo428M(new ClickableElement(interfaceC17406l, null, z6, null, c2960g, interfaceC1426a));
            } else {
                interfaceC10459qM10921b = AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C10835c(interfaceC14267W, z6, null, c2960g, interfaceC1426a));
            }
        }
        return interfaceC10459q.mo428M(interfaceC10459qM10921b);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10459q m11209d(InterfaceC10459q interfaceC10459q, boolean z6, String str, InterfaceC1426a interfaceC1426a, int i10) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C10834b(z6, str, null, interfaceC1426a));
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC10459q m11210e(InterfaceC10459q interfaceC10459q, InterfaceC17406l interfaceC17406l, InterfaceC14267W interfaceC14267W, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, int i10) {
        InterfaceC10459q interfaceC10459qM10921b;
        boolean z10 = (i10 & 4) != 0 ? true : z6;
        InterfaceC1426a interfaceC1426a3 = (i10 & 64) != 0 ? null : interfaceC1426a;
        if (interfaceC14267W instanceof InterfaceC14274b0) {
            interfaceC10459qM10921b = new CombinedClickableElement(interfaceC17406l, (InterfaceC14274b0) interfaceC14267W, z10, null, null, interfaceC1426a2, null, interfaceC1426a3, null);
        } else if (interfaceC14267W == null) {
            interfaceC10459qM10921b = new CombinedClickableElement(interfaceC17406l, null, z10, null, null, interfaceC1426a2, null, interfaceC1426a3, null);
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (interfaceC17406l != null) {
                interfaceC10459qM10921b = AbstractC10839g.m11214a(c10456n, interfaceC17406l, interfaceC14267W).mo428M(new CombinedClickableElement(interfaceC17406l, null, z10, null, null, interfaceC1426a2, null, interfaceC1426a3, null));
            } else {
                interfaceC10459qM10921b = AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C10837e(interfaceC14267W, z10, null, null, interfaceC1426a2, null, interfaceC1426a3, null));
            }
        }
        return interfaceC10459q.mo428M(interfaceC10459qM10921b);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC10459q m11211f(InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2) {
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C10836d(true, null, null, null, interfaceC1426a, null, interfaceC1426a2));
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC10459q m11212g(InterfaceC10459q interfaceC10459q, InterfaceC17406l interfaceC17406l) {
        return interfaceC10459q.mo428M(new HoverableElement(interfaceC17406l));
    }
}
