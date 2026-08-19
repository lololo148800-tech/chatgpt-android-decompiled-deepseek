package p383Pg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8524N2;

/* JADX INFO: renamed from: Pg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6406c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C6406c f20840Z = new C6406c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6406c f20841o0 = new C6406c(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6406c f20842p0 = new C6406c(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20843Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6406c(int i10, int i11) {
        super(i10);
        this.f20843Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20843Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.settings_app_language_dialog_title, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.settings_app_language, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8524N2.m9189b(), null, null, 0L, c6021p3, 48, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
