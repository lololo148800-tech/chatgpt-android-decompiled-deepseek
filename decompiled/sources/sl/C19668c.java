package sl;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: sl.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19668c implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62334Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15085k f62335Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C15085k f62336o0;

    public /* synthetic */ C19668c(C15085k c15085k, C15085k c15085k2, int i10) {
        this.f62334Y = i10;
        this.f62335Z = c15085k;
        this.f62336o0 = c15085k2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f62334Y) {
            case 0:
                if (th2 != null) {
                    AbstractC15070F.m16175c(this.f62335Z, th2);
                    AbstractC15070F.m16175c(this.f62336o0, th2);
                }
                break;
            default:
                if (th2 != null) {
                    this.f62335Z.mo1138b(th2);
                    this.f62336o0.mo1138b(th2);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
