package p193Hf;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C5984W0;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8443A;
import p635a1.C10456n;
import p736f0.InterfaceC13499q;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Hf.W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3339W0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C3339W0 f10195Z = new C3339W0(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3339W0 f10196o0 = new C3339W0(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3339W0 f10197p0 = new C3339W0(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10198Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3339W0(int i10, int i11) {
        super(i10);
        this.f10198Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10198Y) {
            case 0:
                InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.async_tool_detail_button_text, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                String strM8676d = AbstractC8142m4.m8676d(R.string.canmore_streaming_typing, c6021p2);
                C10456n c10456n = C10456n.f30959Y;
                C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                long j10 = ((C3949M0) c6021p2.m6548k(c5984w0)).f12195I;
                C20416d c20416d = AbstractC20417e.f64539a;
                AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11234l(AbstractC8443A.m9045a(AbstractC10833a.m11207b(c10456n, j10, c20416d), 1, ((C3949M0) c6021p2.m6548k(c5984w0)).f12187A, c20416d), AbstractC7313q.f23201f, AbstractC7313q.f23199d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131068);
                break;
            default:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.canmore_load_failed_retry, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
