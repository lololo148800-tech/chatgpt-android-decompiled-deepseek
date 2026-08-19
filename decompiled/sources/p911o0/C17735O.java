package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: o0.O */
/* JADX INFO: loaded from: classes.dex */
public final class C17735O extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int[] f56628Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f56629Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f56630o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f56631p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC21069X[] f56632q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C17737Q f56633r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f56634s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC21059M f56635t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f56636u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int[] f56637v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17735O(int[] iArr, int i10, int i11, int i12, AbstractC21069X[] abstractC21069XArr, C17737Q c17737q, int i13, InterfaceC21059M interfaceC21059M, int i14, int[] iArr2) {
        super(1);
        this.f56628Y = iArr;
        this.f56629Z = i10;
        this.f56630o0 = i11;
        this.f56631p0 = i12;
        this.f56632q0 = abstractC21069XArr;
        this.f56633r0 = c17737q;
        this.f56634s0 = i13;
        this.f56635t0 = interfaceC21059M;
        this.f56636u0 = i14;
        this.f56637v0 = iArr2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC17758g abstractC17758g;
        AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
        int[] iArr = this.f56628Y;
        int i10 = iArr != null ? iArr[this.f56629Z] : 0;
        int i11 = this.f56630o0;
        for (int i12 = i11; i12 < this.f56631p0; i12++) {
            AbstractC21069X abstractC21069X = this.f56632q0[i12];
            AbstractC16544l.m18091d(abstractC21069X);
            C17775o0 c17775o0M19486h = AbstractC17758g.m19486h(abstractC21069X);
            this.f56635t0.getLayoutDirection();
            C17737Q c17737q = this.f56633r0;
            if (c17775o0M19486h != null) {
                c17737q.getClass();
                abstractC17758g = c17775o0M19486h.f56736c;
                if (abstractC17758g == null) {
                    abstractC17758g = c17737q.f56645d;
                }
            } else {
                abstractC17758g = c17737q.f56645d;
            }
            c17737q.getClass();
            abstractC21068W.m21545d(abstractC21069X, this.f56637v0[i12 - i11], abstractC17758g.mo19456c(this.f56634s0 - abstractC21069X.mo21548K(), EnumC7546k.f23904Y, abstractC21069X, this.f56636u0) + i10, 0.0f);
        }
        return C17296C.f55119a;
    }
}
