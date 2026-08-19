package mh;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: mh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C17255c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C17255c f55048Z = new C17255c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C17255c f55049o0 = new C17255c(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f55050Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17255c(int i10, int i11) {
        super(i10);
        this.f55050Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55050Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8215v5.m8841c(), AbstractC8142m4.m8676d(R.string.whisper_close, c6021p), null, 0L, c6021p, 0, 12);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8215v5.m8841c(), AbstractC8142m4.m8676d(R.string.whisper_close, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
