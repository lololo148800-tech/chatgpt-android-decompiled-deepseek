package p547Wc;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Wc.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C8800j extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C8800j f26929Z = new C8800j(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8800j f26930o0 = new C8800j(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C8800j f26931p0 = new C8800j(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26932Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8800j(int i10, int i11) {
        super(i10);
        this.f26932Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f26932Y) {
            case 0:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.design_selection_dialog_ok, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                InterfaceC1439n innerTextField = (InterfaceC1439n) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(innerTextField, "innerTextField");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6545h(innerTextField) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    innerTextField.invoke(c6021p2, Integer.valueOf(iIntValue2 & 14));
                }
                break;
            default:
                InterfaceC1439n innerTextField2 = (InterfaceC1439n) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(innerTextField2, "innerTextField");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6545h(innerTextField2) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    innerTextField2.invoke(c6021p3, Integer.valueOf(iIntValue3 & 14));
                }
                break;
        }
        return C17296C.f55119a;
    }
}
