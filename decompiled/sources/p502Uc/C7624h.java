package p502Uc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;

/* JADX INFO: renamed from: Uc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C7624h extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f24101Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f24102Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f24103o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f24104p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8410b f24105q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f24106r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f24107s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7624h(List list, boolean z6, long j10, long j11, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f24101Y = list;
        this.f24102Z = z6;
        this.f24103o0 = j10;
        this.f24104p0 = j11;
        this.f24105q0 = c8410b;
        this.f24106r0 = i10;
        this.f24107s0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f24106r0 | 1);
        C8410b c8410b = this.f24105q0;
        long j10 = this.f24103o0;
        AbstractC7625i.m7963a(this.f24101Y, this.f24102Z, j10, this.f24104p0, c8410b, (C6021p) obj, iM6447d0, this.f24107s0);
        return C17296C.f55119a;
    }
}
