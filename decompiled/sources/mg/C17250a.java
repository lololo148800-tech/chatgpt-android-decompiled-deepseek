package mg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9703B3;

/* JADX INFO: renamed from: mg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17250a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C17250a f55039Y = new C17250a(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.onboarding_check_email_code_screen_resend_code_button_text, c6021p), null, 0L, c6021p, 0);
        }
        return C17296C.f55119a;
    }
}
