package p196Hi;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p774h1.C14365u;

/* JADX INFO: renamed from: Hi.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C3452v extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C3452v f10498Z = new C3452v(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3452v f10499o0 = new C3452v(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3452v f10500p0 = new C3452v(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10501Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3452v(int i10, int i11) {
        super(i10);
        this.f10501Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10501Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.assistant_notification_description, c6021p), null, 0L, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k.f10910a.f10860b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131062);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.ic_quick_tile, c6021p2, 0), AbstractC8142m4.m8676d(R.string.quick_tile_open_in_app, c6021p2), AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23185b), C14365u.f45055e, c6021p2, 3072, 0);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.collapse, c6021p3, 0), AbstractC8142m4.m8676d(R.string.quick_tile_minimize, c6021p3), AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23185b), C14365u.f45055e, c6021p3, 3072, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
