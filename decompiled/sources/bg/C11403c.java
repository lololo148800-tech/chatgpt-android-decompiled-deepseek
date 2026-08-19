package bg;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9703B3;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: bg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11403c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C11403c f34433Z = new C11403c(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C11403c f34434o0 = new C11403c(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34435Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11403c(int i10, int i11) {
        super(i10);
        this.f34435Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f34435Y) {
            case 0:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.login_skip, c6021p), null, 0L, c6021p, 0);
                }
                break;
            default:
                InterfaceC17783s0 TextButton2 = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton2, "$this$TextButton");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.design_cancel_button, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
