package p291Lf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8626e3;
import p594Y9.AbstractC9979u4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Lf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5009f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16341Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f16342Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f16343o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f16344p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f16345q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5009f(InterfaceC10459q interfaceC10459q, String str, int i10, int i11) {
        super(2);
        this.f16343o0 = interfaceC10459q;
        this.f16342Z = str;
        this.f16344p0 = i10;
        this.f16345q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16341Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8626e3.m9273b(this.f16344p0, C5997d.m6447d0(this.f16345q0 | 1), c6021p, this.f16343o0, this.f16342Z);
                break;
            default:
                AbstractC9979u4.m10620b(C5997d.m6447d0(this.f16344p0 | 1), this.f16345q0, c6021p, this.f16343o0, this.f16342Z);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5009f(String str, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f16342Z = str;
        this.f16343o0 = interfaceC10459q;
        this.f16344p0 = i10;
        this.f16345q0 = i11;
    }
}
