package p077Cn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p153Fn.AbstractC2923a;
import p275Kn.C4815b;
import p275Kn.C4816c;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Cn.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1734b implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4965Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f4966Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f4967o0;

    public /* synthetic */ C1734b(Object obj, int i10, Object obj2) {
        this.f4965Y = i10;
        this.f4966Z = obj;
        this.f4967o0 = obj2;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4965Y) {
            case 0:
                AbstractC2923a.m3727a((InterfaceC1436k) this.f4966Z, this.f4967o0, (InterfaceC18776i) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4816c.f15697h;
                C4815b c4815b = (C4815b) this.f4967o0;
                Object obj4 = c4815b.f15695Z;
                C4816c c4816c = (C4816c) this.f4966Z;
                atomicReferenceFieldUpdater.set(c4816c, obj4);
                c4816c.m5450g(c4815b.f15695Z);
                break;
        }
        return C17296C.f55119a;
    }
}
