package p292Lg;

import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8656j3;
import p594Y9.AbstractC9745I3;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: Lg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5030b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C5030b f16453Z = new C5030b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5030b f16454o0 = new C5030b(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5030b f16455p0 = new C5030b(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5030b f16456q0 = new C5030b(3, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16457Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5030b(int i10, int i11) {
        super(i10);
        this.f16457Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16457Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6542f(item) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8656j3.m9339g(AbstractC17792x.m19521d(item), c6021p, 0);
                }
                break;
            case 1:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(item2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.settings_voice_mode, c6021p2), AbstractC17792x.m19521d(item2), 0L, c6021p2, 0, 4);
                }
                break;
            case 2:
                C10845a item3 = (C10845a) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item3, "$this$item");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6542f(item3) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.settings_chat_history_title, c6021p3), AbstractC17792x.m19521d(item3), 0L, c6021p3, 0, 4);
                }
                break;
            default:
                C10845a item4 = (C10845a) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item4, "$this$item");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6021p4.m6542f(item4) ? 4 : 2;
                }
                if ((iIntValue4 & 19) == 18 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.settings_data_account, c6021p4), AbstractC17792x.m19521d(item4), 0L, c6021p4, 0, 4);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
