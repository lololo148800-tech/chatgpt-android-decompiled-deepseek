package ge;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0201R0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p204I1.C3590f;
import p229J0.AbstractC4124r4;
import p349O0.C6013l;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8634g;
import p571X9.AbstractC9225V3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: ge.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14109w0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44365Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f44366Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f44367o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f44368p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14109w0(InterfaceC1426a interfaceC1426a, boolean z6, InterfaceC1426a interfaceC1426a2) {
        super(2);
        this.f44367o0 = interfaceC1426a;
        this.f44366Z = z6;
        this.f44368p0 = interfaceC1426a2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44365Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC1426a interfaceC1426a = this.f44367o0;
                    if (interfaceC1426a != null) {
                        c6021p.m6524S(1471628443);
                        boolean z6 = this.f44366Z;
                        boolean zM6544g = c6021p.m6544g(z6);
                        InterfaceC1426a interfaceC1426a2 = this.f44368p0;
                        boolean zM6542f = zM6544g | c6021p.m6542f(interfaceC1426a2) | c6021p.m6542f(interfaceC1426a);
                        Object objM6514H = c6021p.m6514H();
                        if (zM6542f || objM6514H == C6013l.f19514a) {
                            objM6514H = new C0201R0(z6, interfaceC1426a2, interfaceC1426a, 3);
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(false);
                        AbstractC8634g.m9289c((InterfaceC1426a) objM6514H, null, this.f44366Z, c6021p, 0, 2);
                    }
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else if (this.f44366Z) {
                    c6021p2.m6524S(1558327143);
                    C3590f c3590fM9795b = AbstractC9225V3.m9795b(R.string.conversations_conversation_delete_with_memory, null, c6021p2, 2);
                    InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(C10456n.f30959Y, AbstractC7313q.f23201f, 0.0f, 2);
                    c6021p2.m6524S(1712844847);
                    InterfaceC1426a interfaceC1426a3 = this.f44367o0;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1426a3);
                    InterfaceC1426a interfaceC1426a4 = this.f44368p0;
                    boolean zM6542f3 = zM6542f2 | c6021p2.m6542f(interfaceC1426a4);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f3 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C14101s0(interfaceC1426a3, interfaceC1426a4, 7);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4124r4.m4769c(c3590fM9795b, AbstractC10833a.m11209d(interfaceC10459qM11235m, false, null, (InterfaceC1426a) objM6514H2, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p2, 0, 0, 262140);
                    c6021p2.m6553p(false);
                } else {
                    c6021p2.m6524S(1558728159);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_conversation_delete, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                    c6021p2.m6553p(false);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14109w0(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2) {
        super(2);
        this.f44366Z = z6;
        this.f44367o0 = interfaceC1426a;
        this.f44368p0 = interfaceC1426a2;
    }
}
