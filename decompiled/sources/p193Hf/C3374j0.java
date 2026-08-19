package p193Hf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8136l6;

/* JADX INFO: renamed from: Hf.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3374j0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f10302Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f10303Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f10304o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3374j0(int i10, boolean z6, boolean z10) {
        super(2);
        this.f10302Y = z6;
        this.f10303Z = z10;
        this.f10304o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f10304o0 | 1);
        AbstractC8136l6.m8661b(this.f10302Y, this.f10303Z, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
