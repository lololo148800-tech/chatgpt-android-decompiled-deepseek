package p080D0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1014t1.AbstractC19736m;
import p1014t1.C19738o;
import p1071w0.InterfaceC20772r0;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1776J extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5076Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20772r0 f5077Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1776J(InterfaceC20772r0 interfaceC20772r0, int i10) {
        super(1);
        this.f5076Y = i10;
        this.f5077Z = interfaceC20772r0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f5076Y) {
            case 0:
                C19738o c19738o = (C19738o) obj;
                this.f5077Z.mo468e(AbstractC19736m.m20687i(c19738o, false));
                c19738o.m20691a();
                break;
            case 1:
                C19738o c19738o2 = (C19738o) obj;
                this.f5077Z.mo468e(AbstractC19736m.m20687i(c19738o2, false));
                c19738o2.m20691a();
                break;
            case 2:
                C19738o c19738o3 = (C19738o) obj;
                this.f5077Z.mo468e(AbstractC19736m.m20687i(c19738o3, false));
                c19738o3.m20691a();
                break;
            default:
                this.f5077Z.mo465b(((C13800b) obj).f43584a);
                break;
        }
        return C17296C.f55119a;
    }
}
