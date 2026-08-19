package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1071w0.EnumC20729S;
import p156G1.C2963j;
import p523V9.AbstractC8088f6;

/* JADX INFO: renamed from: D0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1800e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1818n f5166Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f5167Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f5168o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800e(InterfaceC1818n interfaceC1818n, boolean z6, boolean z10) {
        super(1);
        this.f5166Y = interfaceC1818n;
        this.f5167Z = z6;
        this.f5168o0 = z10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2963j c2963j = (C2963j) obj;
        long jMo2571a = this.f5166Y.mo2571a();
        c2963j.m3787m(AbstractC1783Q.f5106c, new C1782P(this.f5167Z ? EnumC20729S.f65725Z : EnumC20729S.f65726o0, jMo2571a, this.f5168o0 ? 1 : 3, AbstractC8088f6.m8538d(jMo2571a)));
        return C17296C.f55119a;
    }
}
