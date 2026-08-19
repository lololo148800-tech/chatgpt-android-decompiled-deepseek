package p870le;

import com.openai.feature.conversations.impl.input.AbstractC12341a;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: le.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C16857N extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54078Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14111x0 f54079Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f54080o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f54081p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f54082q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16857N(C14111x0 c14111x0, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f54078Y = i11;
        this.f54079Z = c14111x0;
        this.f54080o0 = interfaceC1436k;
        this.f54081p0 = interfaceC10459q;
        this.f54082q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f54078Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC12341a.m14269f(this.f54079Z, this.f54080o0, this.f54081p0, c6021p, C5997d.m6447d0(this.f54082q0 | 1));
                break;
            default:
                AbstractC16912v0.m18582b(this.f54079Z, this.f54080o0, this.f54081p0, c6021p, C5997d.m6447d0(this.f54082q0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
