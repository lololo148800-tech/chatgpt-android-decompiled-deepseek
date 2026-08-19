package p679ce;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: ce.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C11721l extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C11721l f35539Z = new C11721l(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C11721l f35540o0 = new C11721l(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C11721l f35541p0 = new C11721l(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C11721l f35542q0 = new C11721l(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C11721l f35543r0 = new C11721l(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C11721l f35544s0 = new C11721l(2, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35545Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11721l(int i10, int i11) {
        super(i10);
        this.f35545Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35545Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_anonymous_terms, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, 0, 0, 65534);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_anonymous_privacy, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p2, 0, 0, 65534);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_anonymous_settings, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p3, 0, 0, 65534);
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_anonymous_new_chat, c6021p4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p4.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p4, 0, 0, 65534);
                }
                break;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.new_prompts, c6021p5, 0), null, null, 0L, c6021p5, 48, 12);
                }
                break;
            default:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_anonymous_login_description, c6021p6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p6, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
