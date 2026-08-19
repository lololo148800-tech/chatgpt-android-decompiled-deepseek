package af;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9745I3;
import p635a1.C10456n;
import p911o0.AbstractC17758g;
import p911o0.C17794y;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: af.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10572b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C10572b f31389Z = new C10572b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10572b f31390o0 = new C10572b(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10572b f31391p0 = new C10572b(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10572b f31392q0 = new C10572b(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C10572b f31393r0 = new C10572b(3, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C10572b f31394s0 = new C10572b(3, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C10572b f31395t0 = new C10572b(3, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31396Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10572b(int i10, int i11) {
        super(i10);
        this.f31396Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31396Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23199d));
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.gizmo_starter_prompts, c6021p), null, 0L, c6021p, 0, 6);
                }
                break;
            case 1:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23199d));
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.gizmo_details_ratings, c6021p2), null, 0L, c6021p2, 0, 6);
                }
                break;
            case 2:
                C10845a item3 = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p3, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23199d));
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_capabilities, c6021p3), null, 0L, c6021p3, 0, 6);
                }
                break;
            case 3:
                C10845a item4 = (C10845a) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item4, "$this$item");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p4, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23203h));
                }
                break;
            case 4:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue5 & 17) == 16 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.gizmo_start_conversation, c6021p5), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p5, 0, 0, 131070);
                }
                break;
            case 5:
                C10845a item5 = (C10845a) obj;
                C6021p c6021p6 = (C6021p) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item5, "$this$item");
                if ((iIntValue6 & 17) == 16 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC8090g0.m8549h(AbstractC10842a.m11237o(C10456n.f30959Y, AbstractC7313q.f23203h, 0.0f, 0.0f, 0.0f, 14), 0.0f, false, c6021p6, 0, 6);
                }
                break;
            default:
                C17794y Card = (C17794y) obj;
                C6021p c6021p7 = (C6021p) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Card, "$this$Card");
                if ((iIntValue7 & 17) == 16 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    AbstractC8090g0.m8549h(AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23199d), 0.0f, false, c6021p7, 0, 6);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
