package p294Li;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: Li.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5084f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C5084f f16641Y = new C5084f(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_settings_title, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
        }
        return C17296C.f55119a;
    }
}
