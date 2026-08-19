package tf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC7974Q5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8231x5;
import p594Y9.AbstractC9703B3;
import p774h1.C14365u;

/* JADX INFO: renamed from: tf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19916a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63155Y;

    /* JADX INFO: renamed from: Z */
    public static final C19916a f63142Z = new C19916a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19916a f63143o0 = new C19916a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C19916a f63144p0 = new C19916a(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C19916a f63145q0 = new C19916a(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C19916a f63146r0 = new C19916a(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C19916a f63147s0 = new C19916a(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C19916a f63148t0 = new C19916a(2, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C19916a f63149u0 = new C19916a(2, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C19916a f63150v0 = new C19916a(2, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C19916a f63151w0 = new C19916a(2, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C19916a f63152x0 = new C19916a(2, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C19916a f63153y0 = new C19916a(2, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C19916a f63154z0 = new C19916a(2, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C19916a f63141A0 = new C19916a(2, 13);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19916a(int i10, int i11) {
        super(i10);
        this.f63155Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63155Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.close_lg, c6021p, 0), AbstractC8142m4.m8676d(R.string.content_description_close, c6021p), null, C14365u.f45055e, c6021p, 3072, 4);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.learn_more, c6021p2, 0), null, null, 0L, c6021p2, 48, 12);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.undo, c6021p3, 0), AbstractC8142m4.m8676d(R.string.conversation_image_edit_undo, c6021p3), null, 0L, c6021p3, 0, 12);
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.redo, c6021p4, 0), AbstractC8142m4.m8676d(R.string.conversation_image_edit_redo, c6021p4), null, 0L, c6021p4, 0, 12);
                }
                break;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.image_setting, c6021p5, 0), AbstractC8142m4.m8676d(R.string.image_settings_content_description, c6021p5), null, C14365u.f45055e, c6021p5, 3072, 4);
                }
                break;
            case 5:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_view_prompt, c6021p6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p6, 0, 0, 131070);
                }
                break;
            case 6:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8231x5.m8868d(), null, null, 0L, c6021p7, 48, 12);
                }
                break;
            case 7:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_good_response, c6021p8), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p8, 0, 0, 131070);
                }
                break;
            case 8:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC7974Q5.m8276c(), null, null, 0L, c6021p9, 48, 12);
                }
                break;
            case 9:
                C6021p c6021p10 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_bad_response, c6021p10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p10, 0, 0, 131070);
                }
                break;
            case 10:
                C6021p c6021p11 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p11.m6562y()) {
                    c6021p11.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC7966P5.m8257e(), null, null, 0L, c6021p11, 48, 12);
                }
                break;
            case 11:
                C6021p c6021p12 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p12.m6562y()) {
                    c6021p12.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.image_action_learn_more, c6021p12), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p12, 0, 0, 131070);
                }
                break;
            case 12:
                C6021p c6021p13 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p13.m6562y()) {
                    c6021p13.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.image_action_attach_conversation, c6021p13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p13, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p14 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p14.m6562y()) {
                    c6021p14.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.image_action_Share, c6021p14), null, 0L, c6021p14, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
