package ag;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p523V9.AbstractC8042a0;
import p523V9.AbstractC8114j0;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: ag.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10601c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C10601c f31465Z = new C10601c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10601c f31466o0 = new C10601c(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10601c f31467p0 = new C10601c(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31468Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10601c(int i10, int i11) {
        super(i10);
        this.f31468Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31468Y) {
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
                    AbstractC8042a0.m8413a(AbstractC8142m4.m8676d(R.string.app_title, c6021p2), null, 0L, 0L, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p2, 0, 14);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC8114j0.m8611b("Continue", true, false, C10603e.f31472Y, c6021p3, 3510, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
