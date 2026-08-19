package p362Of;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: Of.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6188c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C6188c f20150Z = new C6188c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6188c f20151o0 = new C6188c(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6188c f20152p0 = new C6188c(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C6188c f20153q0 = new C6188c(2, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20154Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6188c(int i10, int i11) {
        super(i10);
        this.f20154Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20154Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8215v5.m8841c(), AbstractC8142m4.m8676d(R.string.content_description_close, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8215v5.m8841c(), AbstractC8142m4.m8676d(R.string.content_description_close, c6021p4), null, 0L, c6021p4, 0, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
