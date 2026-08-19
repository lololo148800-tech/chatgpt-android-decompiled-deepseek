package p193Hf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p253K.AbstractC4502m;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8144m6;
import p571X9.AbstractC9147I2;

/* JADX INFO: renamed from: Hf.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3312I0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10090Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f10091Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f10092o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3312I0(int i10, int i11, InterfaceC1426a interfaceC1426a) {
        super(2);
        this.f10090Y = i11;
        this.f10091Z = interfaceC1426a;
        this.f10092o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10090Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8144m6.m8681b(this.f10091Z, c6021p, C5997d.m6447d0(this.f10092o0 | 1));
                break;
            case 1:
                AbstractC9147I2.m9694c(this.f10091Z, c6021p, C5997d.m6447d0(this.f10092o0 | 1));
                break;
            default:
                AbstractC4502m.m5241d(this.f10091Z, c6021p, C5997d.m6447d0(this.f10092o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
