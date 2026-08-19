package p293Lh;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC4124r4;
import p328N1.C5605u;
import p349O0.C6021p;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8662k3;
import p571X9.AbstractC9225V3;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Lh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5055a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16520Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f16521Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5055a(InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f16520Y = i10;
        this.f16521Z = interfaceC10459q;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16520Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8662k3.m9352c(this.f16521Z, null, c6021p, 0, 2);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC8662k3.m9352c(this.f16521Z, null, c6021p2, 0, 2);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4769c(AbstractC9225V3.m9795b(R.string.conversation_policy_warning, null, c6021p3, 2), AbstractC10844c.m11244d(this.f16521Z, 0.78f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p3, 0, 0, 262140);
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_content_blocked, c6021p4), AbstractC8071d5.m8483b(this.f16521Z, 0.38f), 0L, 0L, new C5605u(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p4, 0, 0, 131052);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
