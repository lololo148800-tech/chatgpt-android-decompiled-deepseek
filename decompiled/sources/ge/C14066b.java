package ge;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p291Lf.AbstractC5023t;
import p328N1.C5609y;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p547Wc.EnumC8792f;
import p594Y9.AbstractC9709C3;
import p635a1.C10456n;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: ge.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14066b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C14066b f44251Z = new C14066b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14066b f44252o0 = new C14066b(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14066b f44253p0 = new C14066b(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44254Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14066b(int i10, int i11) {
        super(i10);
        this.f44254Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f44254Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC9709C3.m10300a(EnumC8792f.f26896Y, AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC5023t.f16406a), 0, AbstractC14068c.f44257a, c6021p, 3078);
                }
                break;
            case 1:
                String animatedTitle = (String) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(animatedTitle, "animatedTitle");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(animatedTitle) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(animatedTitle, null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p2, (iIntValue2 & 14) | 196608, 3120, 120798);
                }
                break;
            default:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_upgrade_conversation_popup_button, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
