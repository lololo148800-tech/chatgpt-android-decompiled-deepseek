package p319Mi;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p571X9.AbstractC9225V3;
import p594Y9.AbstractC9703B3;

/* JADX INFO: renamed from: Mi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5439a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C5439a f17780Z = new C5439a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5439a f17781o0 = new C5439a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5439a f17782p0 = new C5439a(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17783Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5439a(int i10, int i11) {
        super(i10);
        this.f17783Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17783Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.voice_training_enroll, c6021p), null, 0L, c6021p, 0);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.voice_training_decline, c6021p2), null, 0L, c6021p2, 0);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(R.string.voice_training_control_description, null, c6021p3, 2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p3, 0, 0, 262142);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
