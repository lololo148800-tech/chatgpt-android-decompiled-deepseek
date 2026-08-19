package p039Bc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p204I1.C3578I;
import p349O0.C5996c0;
import p492U1.C7545j;

/* JADX INFO: renamed from: Bc.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C0884r extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2600Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5996c0 f2601Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0884r(C5996c0 c5996c0, int i10) {
        super(1);
        this.f2600Y = i10;
        this.f2601Z = c5996c0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f2600Y) {
            case 0:
                this.f2601Z.m6413h(((Number) obj).intValue());
                break;
            case 1:
                long j10 = ((C7545j) obj).f23903a;
                C5996c0 c5996c0 = this.f2601Z;
                c5996c0.m6413h(Math.max(c5996c0.m6412g(), (int) (j10 >> 32)));
                break;
            case 2:
                long j11 = ((C7545j) obj).f23903a;
                C5996c0 c5996c1 = this.f2601Z;
                c5996c1.m6413h(Math.max(c5996c1.m6412g(), (int) (j11 >> 32)));
                break;
            case 3:
                long j12 = ((C7545j) obj).f23903a;
                C5996c0 c5996c2 = this.f2601Z;
                c5996c2.m6413h(Math.max(c5996c2.m6412g(), (int) (j12 >> 32)));
                break;
            case 4:
                InterfaceC21098s it = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f2601Z.m6413h((int) (it.mo21524k() & 4294967295L));
                break;
            case 5:
                InterfaceC21098s it2 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f2601Z.m6413h((int) (it2.mo21524k() & 4294967295L));
                break;
            case 6:
                C3578I it3 = (C3578I) obj;
                AbstractC16544l.m18094g(it3, "it");
                this.f2601Z.m6413h(it3.f10893b.f10963f);
                break;
            case 7:
                C3578I it4 = (C3578I) obj;
                AbstractC16544l.m18094g(it4, "it");
                this.f2601Z.m6413h(it4.f10893b.f10963f);
                break;
            default:
                this.f2601Z.m6413h(((Number) obj).intValue());
                break;
        }
        return C17296C.f55119a;
    }
}
