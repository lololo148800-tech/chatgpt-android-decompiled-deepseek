package p474T8;

import androidx.lifecycle.EnumC11103l;
import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9196Q3;

/* JADX INFO: renamed from: T8.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7275m implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23061Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC11103l f23062Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f23063o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f23064p0;

    public /* synthetic */ C7275m(Object obj, EnumC11103l enumC11103l, int i10, int i11) {
        this.f23061Y = i11;
        this.f23064p0 = obj;
        this.f23062Z = enumC11103l;
        this.f23063o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f23061Y;
        C6021p c6021p = (C6021p) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC9196Q3.m9759a((C7268f) this.f23064p0, this.f23062Z, c6021p, C5997d.m6447d0(this.f23063o0 | 1));
                break;
            default:
                AbstractC9196Q3.m9760b((List) this.f23064p0, this.f23062Z, c6021p, C5997d.m6447d0(this.f23063o0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
