package p382Pf;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Pf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6402e extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C6402e f20831Z = new C6402e(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6402e f20832o0 = new C6402e(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20833Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6402e(int i10, int i11) {
        super(i10);
        this.f20833Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20833Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.tool_local_permission_grant_access, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                InterfaceC17783s0 Button2 = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button2, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.tool_local_permission_grant_access, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
