package af;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1441p;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8090g0;
import p635a1.C10456n;

/* JADX INFO: renamed from: af.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10577e extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public static final C10577e f31415Y = new C10577e(4);

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        C10845a items = (C10845a) obj;
        ((Number) obj2).intValue();
        C6021p c6021p = (C6021p) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC16544l.m18094g(items, "$this$items");
        if ((iIntValue & 129) == 128 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8090g0.m8549h(AbstractC10842a.m11237o(C10456n.f30959Y, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14), AbstractC7312p.f23188e, false, c6021p, 384, 0);
        }
        return C17296C.f55119a;
    }
}
