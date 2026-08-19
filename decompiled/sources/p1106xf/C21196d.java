package p1106xf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p882m1.AbstractC17140a;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: xf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21196d extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C21196d f67397Y = new C21196d(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.gpt_4_filled, c6021p, 0);
            long j10 = AbstractC21209q.f67477b;
            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(AbstractC10842a.m11237o(C10456n.f30959Y, 0.0f, 0.0f, AbstractC7313q.f23198c, 0.0f, 11), AbstractC7312p.f23185b), j10, c6021p, 3120, 0);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_upgraded_response, c6021p), null, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 384, 0, 65530);
        }
        return C17296C.f55119a;
    }
}
