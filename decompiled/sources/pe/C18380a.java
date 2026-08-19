package pe;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: pe.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18380a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C18380a f58654Y = new C18380a(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.share, c6021p, 0), AbstractC8142m4.m8676d(R.string.conversation_screenshot_detected_snackbar_button_text, c6021p), null, 0L, c6021p, 0, 12);
        }
        return C17296C.f55119a;
    }
}
