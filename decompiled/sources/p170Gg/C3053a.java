package p170Gg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Gg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3053a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C3053a f9215Y = new C3053a(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.unsupported_country_button, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }
}
