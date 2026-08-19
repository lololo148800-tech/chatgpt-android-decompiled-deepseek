package p455Sf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9703B3;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Sf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C7118c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public static final C7118c f22661Y = new C7118c(3);

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.notification_settings_screen_status_card_button_text, c6021p), null, 0L, c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
