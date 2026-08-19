package p339Nf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p736f0.InterfaceC13499q;

/* JADX INFO: renamed from: Nf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5719a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C5719a f18523Z = new C5719a(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5719a f18524o0 = new C5719a(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5719a f18525p0 = new C5719a(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18526Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5719a(int i10, int i11) {
        super(i10);
        this.f18526Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f18526Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String strM8676d = AbstractC8142m4.m8676d(R.string.message_sources_no_citations, c6021p);
                    C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k;
                    AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11237o(AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC5741w.f18690a, 0.0f, 2), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65528);
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
                    String strM8676d2 = AbstractC8142m4.m8676d(R.string.message_sources_no_sources, c6021p2);
                    C3582M c3582m2 = ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12155k;
                    AbstractC4124r4.m4768b(strM8676d2, AbstractC10842a.m11237o(AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC5741w.f18690a, 0.0f, 2), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7), ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m2, c6021p2, 0, 0, 65528);
                }
                break;
            default:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC3984T1.m4692k(null, 0.0f, 0L, (C6021p) obj2, 0, 7);
                break;
        }
        return C17296C.f55119a;
    }
}
