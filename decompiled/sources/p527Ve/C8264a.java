package p527Ve;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9818V;
import p635a1.C10456n;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: Ve.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8264a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C8264a f25765Z = new C8264a(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8264a f25766o0 = new C8264a(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C8264a f25767p0 = new C8264a(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C8264a f25768q0 = new C8264a(2, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25769Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8264a(int i10, int i11) {
        super(i10);
        this.f25769Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25769Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.chevron_down_md, c6021p, 0), null, AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23185b), 0L, c6021p, 48, 8);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.snorlax_add_new, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b("This is a placeholder", AbstractC9818V.m10458b(C10456n.f30959Y, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 6, 0, 131068);
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC17780r.m19507a(AbstractC9818V.m10458b(AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23186c), true, false, 0.0f, 14), c6021p4, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
