package p751ff;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: ff.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13630a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C13630a f43065Z = new C13630a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13630a f43066o0 = new C13630a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C13630a f43067p0 = new C13630a(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C13630a f43068q0 = new C13630a(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C13630a f43069r0 = new C13630a(2, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43070Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13630a(int i10, int i11) {
        super(i10);
        this.f43070Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43070Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.snorlax_edit_title, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.check, c6021p2, 0), AbstractC8142m4.m8676d(R.string.snorlax_save_button, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.snorlax_delete, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.trash, c6021p4, 0), null, null, 0L, c6021p4, 48, 12);
                }
                break;
            default:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.dots_vertical, c6021p5, 0), AbstractC8142m4.m8676d(R.string.snorlax_edit_menu, c6021p5), null, 0L, c6021p5, 0, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
