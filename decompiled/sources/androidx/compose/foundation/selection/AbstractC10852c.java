package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.material3.MinimumInteractiveModifier;
import p003A1.C0280q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p156G1.C2960g;
import p180H1.EnumC3197a;
import p571X9.AbstractC9306j0;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.InterfaceC14267W;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10852c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11272a(InterfaceC10459q interfaceC10459q, boolean z6, InterfaceC17406l interfaceC17406l, InterfaceC14267W interfaceC14267W, boolean z10, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        InterfaceC10459q interfaceC10459qM10921b;
        if (interfaceC14267W instanceof InterfaceC14274b0) {
            interfaceC10459qM10921b = new SelectableElement(z6, interfaceC17406l, (InterfaceC14274b0) interfaceC14267W, z10, c2960g, interfaceC1426a);
        } else if (interfaceC14267W == null) {
            interfaceC10459qM10921b = new SelectableElement(z6, interfaceC17406l, null, z10, c2960g, interfaceC1426a);
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (interfaceC17406l != null) {
                interfaceC10459qM10921b = AbstractC10839g.m11214a(c10456n, interfaceC17406l, interfaceC14267W).mo428M(new SelectableElement(z6, interfaceC17406l, null, z10, c2960g, interfaceC1426a));
            } else {
                interfaceC10459qM10921b = AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C10851b(interfaceC14267W, z6, z10, c2960g, interfaceC1426a));
            }
        }
        return interfaceC10459q.mo428M(interfaceC10459qM10921b);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10459q m11273b(InterfaceC10459q interfaceC10459q, boolean z6, C2960g c2960g, InterfaceC1426a interfaceC1426a, int i10) {
        if ((i10 & 4) != 0) {
            c2960g = null;
        }
        return AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C10850a(z6, true, c2960g, interfaceC1426a));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m11274c(MinimumInteractiveModifier minimumInteractiveModifier, boolean z6, InterfaceC17406l interfaceC17406l, boolean z10, C2960g c2960g, InterfaceC1436k interfaceC1436k) {
        ToggleableElement toggleableElement = new ToggleableElement(z6, interfaceC17406l, z10, c2960g, interfaceC1436k);
        minimumInteractiveModifier.getClass();
        return AbstractC9306j0.m9882a(minimumInteractiveModifier, toggleableElement);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10459q m11275d(EnumC3197a enumC3197a, InterfaceC17406l interfaceC17406l, InterfaceC14267W interfaceC14267W, boolean z6, C2960g c2960g, InterfaceC1426a interfaceC1426a) {
        if (interfaceC14267W instanceof InterfaceC14274b0) {
            return new TriStateToggleableElement(enumC3197a, interfaceC17406l, (InterfaceC14274b0) interfaceC14267W, z6, c2960g, interfaceC1426a);
        }
        if (interfaceC14267W == null) {
            return new TriStateToggleableElement(enumC3197a, interfaceC17406l, null, z6, c2960g, interfaceC1426a);
        }
        C10456n c10456n = C10456n.f30959Y;
        if (interfaceC17406l != null) {
            return AbstractC10839g.m11214a(c10456n, interfaceC17406l, interfaceC14267W).mo428M(new TriStateToggleableElement(enumC3197a, interfaceC17406l, null, z6, c2960g, interfaceC1426a));
        }
        return AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C10853d(interfaceC14267W, enumC3197a, z6, c2960g, interfaceC1426a));
    }
}
