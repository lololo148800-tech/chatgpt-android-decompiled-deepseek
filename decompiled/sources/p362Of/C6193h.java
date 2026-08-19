package p362Of;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p575Xd.C9449h;
import p575Xd.C9457p;
import p575Xd.C9460s;
import p575Xd.InterfaceC9461t;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Of.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6193h extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20170Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC9461t f20171Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6193h(InterfaceC9461t interfaceC9461t, int i10) {
        super(3);
        this.f20170Y = i10;
        this.f20171Z = interfaceC9461t;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC9461t interfaceC9461t = this.f20171Z;
        switch (this.f20170Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    int iOrdinal = ((C9449h) interfaceC9461t).f28456b.ordinal();
                    if (iOrdinal == 0) {
                        i10 = R.string.tool_function_allow;
                    } else {
                        if (iOrdinal != 1) {
                            throw new C0644w();
                        }
                        i10 = R.string.tool_function_confirm;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                return c17296c;
            case 1:
                InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    int iOrdinal2 = ((C9457p) interfaceC9461t).f28470b.ordinal();
                    if (iOrdinal2 == 0) {
                        i11 = R.string.tool_function_decline;
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new C0644w();
                        }
                        i11 = R.string.tool_function_deny;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i11, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                return c17296c;
            default:
                InterfaceC17783s0 Button2 = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button2, "$this$Button");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    String str = ((C9460s) interfaceC9461t).f28476d;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.tool_function_oauth_login, new Object[]{str}, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                return c17296c;
        }
    }
}
