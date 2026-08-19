package androidx.compose.p650ui.draw;

import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21090k;
import p635a1.C10444b;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p774h1.C14356l;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: androidx.compose.ui.draw.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10861a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11295a(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new DrawBehindElement(interfaceC1436k));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q m11296b(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new DrawWithCacheElement(interfaceC1436k));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m11297c(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new DrawWithContentElement(interfaceC1436k));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10459q m11298d(InterfaceC10459q interfaceC10459q, AbstractC17140a abstractC17140a, InterfaceC10446d interfaceC10446d, InterfaceC21090k interfaceC21090k, float f10, C14356l c14356l, int i10) {
        if ((i10 & 4) != 0) {
            interfaceC10446d = C10444b.f30938q0;
        }
        InterfaceC10446d interfaceC10446d2 = interfaceC10446d;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        return interfaceC10459q.mo428M(new PainterElement(abstractC17140a, true, interfaceC10446d2, interfaceC21090k, f10, c14356l));
    }
}
