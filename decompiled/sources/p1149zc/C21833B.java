package p1149zc;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;

/* JADX INFO: renamed from: zc.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C21833B extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C21833B f69293Y = new C21833B(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.lock_key_hole, c6021p, 0), null, null, 0L, c6021p, 48, 12);
        }
        return C17296C.f55119a;
    }
}
