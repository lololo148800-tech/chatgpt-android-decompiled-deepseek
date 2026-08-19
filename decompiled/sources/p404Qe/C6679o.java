package p404Qe;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9147I2;
import p571X9.AbstractC9206S2;
import p594Y9.AbstractC10008z3;

/* JADX INFO: renamed from: Qe.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6679o extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21476Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f21477Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f21478o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6679o(String str, int i10, int i11) {
        super(2);
        this.f21476Y = i11;
        this.f21477Z = str;
        this.f21478o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21476Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9147I2.m9693b(this.f21477Z, c6021p, C5997d.m6447d0(this.f21478o0 | 1));
                break;
            case 1:
                AbstractC10008z3.m10646a(this.f21477Z, c6021p, C5997d.m6447d0(this.f21478o0 | 1));
                break;
            default:
                AbstractC9206S2.m9770a(this.f21477Z, c6021p, C5997d.m6447d0(this.f21478o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
