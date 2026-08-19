package p017Af;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p478Tc.AbstractC7302f;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: Af.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0475f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C0475f f1545Y = new C0475f(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.dots_horizontal, c6021p, 0), AbstractC8142m4.m8676d(R.string.message_links, c6021p), null, AbstractC7302f.m7773b(c6021p), c6021p, 0, 4);
        }
        return C17296C.f55119a;
    }
}
