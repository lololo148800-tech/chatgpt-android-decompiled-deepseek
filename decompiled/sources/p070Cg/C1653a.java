package p070Cg;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7870D5;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p911o0.AbstractC17758g;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Cg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1653a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C1653a f4678Y = new C1653a(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3878A1.m4597b(AbstractC7870D5.m8148b(), null, null, 0L, c6021p, 48, 12);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(C10456n.f30959Y, AbstractC7313q.f23199d));
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.failwhale_try_again_button, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }
}
