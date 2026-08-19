package gf;

import androidx.compose.foundation.lazy.C10845a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p594Y9.AbstractC9839Y2;

/* JADX INFO: renamed from: gf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14117b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C14117b f44450Y = new C14117b(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C10845a item = (C10845a) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(item, "$this$item");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9839Y2.m10484a(null, c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
