package p482Tg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mh.EnumC17264l;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1440o;
import p072Ci.EnumC1696a;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p571X9.AbstractC9322l4;
import p635a1.C10456n;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: Tg.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C7458o extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C7458o f23673Z = new C7458o(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7458o f23674o0 = new C7458o(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7458o f23675p0 = new C7458o(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C7458o f23676q0 = new C7458o(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C7458o f23677r0 = new C7458o(3, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23678Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7458o(int i10, int i11) {
        super(i10);
        this.f23678Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        switch (this.f23678Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC9322l4.m9912a(null, c6021p, 0);
                }
                return C17296C.f55119a;
            case 1:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(C10456n.f30959Y, AbstractC7313q.f23202g));
                }
                return C17296C.f55119a;
            case 2:
                C10845a item3 = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item3, "$this$item");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.settings_language_info, c6021p3), AbstractC10842a.m11234l(C10456n.f30959Y, AbstractC7313q.f23201f, AbstractC7313q.f23199d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12156l, c6021p3, 0, 0, 65532);
                }
                return C17296C.f55119a;
            case 3:
                EnumC17264l it = (EnumC17264l) obj;
                C6021p c6021p4 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                c6021p4.m6524S(-730493845);
                String strM8676d = AbstractC8142m4.m8676d(it.f55065Z, c6021p4);
                c6021p4.m6553p(false);
                return strM8676d;
            default:
                EnumC1696a it2 = (EnumC1696a) obj;
                C6021p c6021p5 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it2, "it");
                c6021p5.m6524S(448476685);
                int iOrdinal = it2.ordinal();
                if (iOrdinal == 0) {
                    i10 = R.string.settings_color_system;
                } else if (iOrdinal == 1) {
                    i10 = R.string.settings_color_light;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    i10 = R.string.settings_color_dark;
                }
                String strM8676d2 = AbstractC8142m4.m8676d(i10, c6021p5);
                c6021p5.m6553p(false);
                return strM8676d2;
        }
    }
}
