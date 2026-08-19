package androidx.compose.foundation;

import gf.C14127l;
import p003A1.C0280q;
import p349O0.C5984W0;
import p635a1.AbstractC10443a;
import p635a1.InterfaceC10459q;
import p773h0.C14269Y;
import p773h0.InterfaceC14267W;
import p773h0.InterfaceC14274b0;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.foundation.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10839g {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f32446a = new C5984W0(C14269Y.f44768Z);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11214a(InterfaceC10459q interfaceC10459q, InterfaceC17406l interfaceC17406l, InterfaceC14267W interfaceC14267W) {
        if (interfaceC14267W == null) {
            return interfaceC10459q;
        }
        return interfaceC14267W instanceof InterfaceC14274b0 ? interfaceC10459q.mo428M(new IndicationModifierElement(interfaceC17406l, (InterfaceC14274b0) interfaceC14267W)) : AbstractC10443a.m10921b(interfaceC10459q, C0280q.f1030t0, new C14127l(interfaceC14267W, 1, interfaceC17406l));
    }
}
