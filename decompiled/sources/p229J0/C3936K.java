package p229J0;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p635a1.C10456n;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: J0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C3936K extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ float f12118Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ float f12119Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3936K(float f10, float f11) {
        super(2);
        this.f12118Y = f10;
        this.f12119Z = f11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17780r.m19507a(AbstractC10844c.m11253m(C10456n.f30959Y, this.f12118Y, this.f12119Z), c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
