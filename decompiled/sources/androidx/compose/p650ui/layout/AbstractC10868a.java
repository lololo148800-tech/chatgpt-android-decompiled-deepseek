package androidx.compose.p650ui.layout;

import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21100u;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: androidx.compose.ui.layout.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10868a {
    /* JADX INFO: renamed from: a */
    public static final Object m11315a(InterfaceC21056J interfaceC21056J) {
        Object objMo21534t = interfaceC21056J.mo21534t();
        InterfaceC21100u interfaceC21100u = objMo21534t instanceof InterfaceC21100u ? (InterfaceC21100u) objMo21534t : null;
        if (interfaceC21100u != null) {
            return interfaceC21100u.mo10939t();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10459q m11316b(InterfaceC10459q interfaceC10459q, InterfaceC1440o interfaceC1440o) {
        return interfaceC10459q.mo428M(new LayoutElement(interfaceC1440o));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m11317c(InterfaceC10459q interfaceC10459q, String str) {
        return interfaceC10459q.mo428M(new LayoutIdElement(str));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10459q m11318d(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new OnGloballyPositionedElement(interfaceC1436k));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC10459q m11319e(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k) {
        return interfaceC10459q.mo428M(new OnSizeChangedModifier(interfaceC1436k));
    }
}
