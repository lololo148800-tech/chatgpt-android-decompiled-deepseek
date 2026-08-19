package p1025te;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: te.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19870a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C19870a f63000Z = new C19870a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19870a f63001o0 = new C19870a(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63002Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19870a(int i10, int i11) {
        super(i10);
        this.f63002Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63002Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.arrow_rotate_left, c6021p, 0), AbstractC8142m4.m8676d(R.string.conversation_attachment_retry, c6021p), null, 0L, c6021p, 0, 12);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.close_xs, c6021p2, 0), AbstractC8142m4.m8676d(R.string.conversation_attachment_remove, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
