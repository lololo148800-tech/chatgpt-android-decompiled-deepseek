package androidx.compose.animation;

import p492U1.C7545j;
import p523V9.AbstractC8079e5;
import p571X9.AbstractC9113C4;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;
import p758g0.C13781p0;
import p758g0.InterfaceC13726B;

/* JADX INFO: renamed from: androidx.compose.animation.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10832b {

    /* JADX INFO: renamed from: a */
    public static final long f32376a = AbstractC9113C4.m9643a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m11205a(InterfaceC10459q interfaceC10459q, C13781p0 c13781p0, int i10) {
        InterfaceC13726B interfaceC13726BM15254s = c13781p0;
        if ((i10 & 1) != 0) {
            Object obj = AbstractC13795w0.f43580a;
            interfaceC13726BM15254s = AbstractC13758e.m15254s(0.0f, 400.0f, new C7545j(AbstractC9113C4.m9643a(1, 1)), 1);
        }
        return AbstractC8079e5.m8502b(interfaceC10459q).mo428M(new SizeAnimationModifierElement(interfaceC13726BM15254s, null));
    }
}
