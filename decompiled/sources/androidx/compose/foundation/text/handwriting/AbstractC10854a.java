package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.AbstractC10842a;
import p049Bm.InterfaceC1426a;
import p1094x0.AbstractC21046e;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10854a {

    /* JADX INFO: renamed from: a */
    public static final float f32581a = 40;

    /* JADX INFO: renamed from: b */
    public static final float f32582b = 10;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m11276a(boolean z6, InterfaceC1426a interfaceC1426a) {
        C10456n c10456n = C10456n.f30959Y;
        return (z6 && AbstractC21046e.f66933a) ? AbstractC10842a.m11234l(new StylusHandwritingElementWithNegativePadding(interfaceC1426a), f32582b, f32581a) : c10456n;
    }
}
