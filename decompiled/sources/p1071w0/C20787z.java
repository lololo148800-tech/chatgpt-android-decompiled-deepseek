package p1071w0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0251g0;
import p049Bm.InterfaceC1436k;
import p080D0.C1837w0;
import p759g1.C13800b;

/* JADX INFO: renamed from: w0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C20787z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f66043Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C1837w0 f66044Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20787z(C1837w0 c1837w0, int i10) {
        super(1);
        this.f66043Y = i10;
        this.f66044Z = c1837w0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f66043Y) {
            case 0:
                return new C0251g0(this.f66044Z, 15);
            default:
                long j10 = ((C13800b) obj).f43584a;
                this.f66044Z.m2691o();
                return C17296C.f55119a;
        }
    }
}
