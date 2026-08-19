package sd;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: sd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C19533a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C19533a f62051Z = new C19533a(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19533a f62052o0 = new C19533a(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62053Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19533a(int i10, int i11) {
        super(i10);
        this.f62053Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f62053Y) {
            case 0:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_delete_button, c6021p), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
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
