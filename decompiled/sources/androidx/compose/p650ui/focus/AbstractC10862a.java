package androidx.compose.p650ui.focus;

import p049Bm.InterfaceC1436k;
import p635a1.InterfaceC10459q;
import p737f1.C13522n;

/* JADX INFO: renamed from: androidx.compose.ui.focus.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10862a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11299a(InterfaceC10459q interfaceC10459q, C13522n c13522n) {
        return interfaceC10459q.mo428M(new FocusRequesterElement(c13522n));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q m11300b(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new FocusChangedElement(interfaceC1436k));
    }
}
