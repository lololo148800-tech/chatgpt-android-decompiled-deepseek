package p291Lf;

import androidx.compose.foundation.layout.AbstractC10842a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1440o;
import p204I1.C3582M;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8095g5;
import p635a1.C10456n;

/* JADX INFO: renamed from: Lf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5007d extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C5007d f16339Y = new C5007d(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        C6021p c6021p = (C6021p) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= c6021p.m6538d(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            long j10 = ((C3582M) c6021p.m6548k(AbstractC4124r4.f13310a)).f10910a.f10860b;
            float fMo7870w = interfaceC7537b.mo7870w(j10) * (iIntValue == 0 ? 0.0f : 0.09f);
            List list = AbstractC5023t.f16413h;
            AbstractC4124r4.m4768b((String) list.get(iIntValue % list.size()), AbstractC10842a.m11231i(AbstractC8095g5.m8566c(C10456n.f30959Y, 1.5f), 0.0f, -fMo7870w, 1), 0L, j10, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131060);
        }
        return C17296C.f55119a;
    }
}
