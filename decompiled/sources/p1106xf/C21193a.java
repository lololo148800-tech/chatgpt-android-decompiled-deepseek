package p1106xf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p571X9.AbstractC9225V3;

/* JADX INFO: renamed from: xf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21193a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67377Y;

    /* JADX INFO: renamed from: Z */
    public static final C21193a f67364Z = new C21193a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21193a f67365o0 = new C21193a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21193a f67366p0 = new C21193a(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C21193a f67367q0 = new C21193a(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C21193a f67368r0 = new C21193a(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C21193a f67369s0 = new C21193a(2, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C21193a f67370t0 = new C21193a(2, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C21193a f67371u0 = new C21193a(2, 7);

    /* JADX INFO: renamed from: v0 */
    public static final C21193a f67372v0 = new C21193a(2, 8);

    /* JADX INFO: renamed from: w0 */
    public static final C21193a f67373w0 = new C21193a(2, 9);

    /* JADX INFO: renamed from: x0 */
    public static final C21193a f67374x0 = new C21193a(2, 10);

    /* JADX INFO: renamed from: y0 */
    public static final C21193a f67375y0 = new C21193a(2, 11);

    /* JADX INFO: renamed from: z0 */
    public static final C21193a f67376z0 = new C21193a(2, 12);

    /* JADX INFO: renamed from: A0 */
    public static final C21193a f67358A0 = new C21193a(2, 13);

    /* JADX INFO: renamed from: B0 */
    public static final C21193a f67359B0 = new C21193a(2, 14);

    /* JADX INFO: renamed from: C0 */
    public static final C21193a f67360C0 = new C21193a(2, 15);

    /* JADX INFO: renamed from: D0 */
    public static final C21193a f67361D0 = new C21193a(2, 16);

    /* JADX INFO: renamed from: E0 */
    public static final C21193a f67362E0 = new C21193a(2, 17);

    /* JADX INFO: renamed from: F0 */
    public static final C21193a f67363F0 = new C21193a(2, 18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21193a(int i10, int i11) {
        super(i10);
        this.f67377Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67377Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(R.string.conversation_policy_warning, null, c6021p, 2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p, 0, 0, 262142);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_copy_message, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.stop, c6021p3, 0), null, null, 0L, c6021p3, 48, 12);
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.voice, c6021p4, 0), null, null, 0L, c6021p4, 48, 12);
                }
                break;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_regenerate_without_search, c6021p5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p5, 0, 0, 131070);
                }
                break;
            case 5:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.globe_off, c6021p6, 0), null, null, 0L, c6021p6, 48, 12);
                }
                break;
            case 6:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_regenerate_with_search, c6021p7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p7, 0, 0, 131070);
                }
                break;
            case 7:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.globe, c6021p8, 0), null, null, 0L, c6021p8, 48, 12);
                }
                break;
            case 8:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_regenerate, c6021p9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p9, 0, 0, 131070);
                }
                break;
            case 9:
                C6021p c6021p10 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.rotate_image, c6021p10, 0), null, null, 0L, c6021p10, 48, 12);
                }
                break;
            case 10:
                C6021p c6021p11 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p11.m6562y()) {
                    c6021p11.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.copy, c6021p11, 0), null, null, 0L, c6021p11, 48, 12);
                }
                break;
            case 11:
                C6021p c6021p12 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p12.m6562y()) {
                    c6021p12.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.copy, c6021p12, 0), null, null, 0L, c6021p12, 48, 12);
                }
                break;
            case 12:
                C6021p c6021p13 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p13.m6562y()) {
                    c6021p13.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_select_text, c6021p13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p13, 0, 0, 131070);
                }
                break;
            case 13:
                C6021p c6021p14 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p14.m6562y()) {
                    c6021p14.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.file_document, c6021p14, 0), null, null, 0L, c6021p14, 48, 12);
                }
                break;
            case 14:
                C6021p c6021p15 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p15.m6562y()) {
                    c6021p15.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.thumb_up, c6021p15, 0), null, null, 0L, c6021p15, 48, 12);
                }
                break;
            case 15:
                C6021p c6021p16 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p16.m6562y()) {
                    c6021p16.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.thumb_down, c6021p16, 0), null, null, 0L, c6021p16, 48, 12);
                }
                break;
            case 16:
                C6021p c6021p17 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p17.m6562y()) {
                    c6021p17.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_edit_message, c6021p17), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p17, 0, 0, 131070);
                }
                break;
            case 17:
                C6021p c6021p18 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p18.m6562y()) {
                    c6021p18.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.pencil, c6021p18, 0), null, null, 0L, c6021p18, 48, 12);
                }
                break;
            default:
                C6021p c6021p19 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p19.m6562y()) {
                    c6021p19.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_stop_generating, c6021p19), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p19, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
