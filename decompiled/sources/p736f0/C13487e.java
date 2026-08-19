package p736f0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p013Ab.C0420b;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p492U1.EnumC7546k;
import p571X9.AbstractC9113C4;
import p692d0.C12948A;
import p953q0.C18576e;
import p953q0.C18580g;
import p953q0.InterfaceC18599t;

/* JADX INFO: renamed from: f0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13487e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42697Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f42698Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f42699o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f42700p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f42701q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13487e(int i10, int i11, C12948A c12948a, C0420b c0420b) {
        super(1);
        this.f42698Z = i10;
        this.f42699o0 = i11;
        this.f42700p0 = c12948a;
        this.f42701q0 = c0420b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object c18576e;
        switch (this.f42697Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                for (AbstractC21069X abstractC21069X : (AbstractC21069X[]) this.f42700p0) {
                    if (abstractC21069X != null) {
                        long jMo10925a = ((C13488f) this.f42701q0).f42702a.f42711b.mo10925a(AbstractC9113C4.m9643a(abstractC21069X.f66981Y, abstractC21069X.f66982Z), AbstractC9113C4.m9643a(this.f42698Z, this.f42699o0), EnumC7546k.f23904Y);
                        abstractC21068W.m21545d(abstractC21069X, (int) (jMo10925a >> 32), (int) (jMo10925a & 4294967295L), 0.0f);
                    }
                }
                break;
            default:
                C18580g c18580g = (C18580g) obj;
                InterfaceC1436k key = ((InterfaceC18599t) c18580g.f59184c).getKey();
                int i10 = this.f42698Z;
                int i11 = c18580g.f59182a;
                int iMax = Math.max(i10, i11);
                int iMin = Math.min(this.f42699o0, (c18580g.f59183b + i11) - 1);
                if (iMax <= iMin) {
                    while (true) {
                        if (key == null) {
                            c18576e = new C18576e(iMax);
                        } else {
                            c18576e = key.invoke(Integer.valueOf(iMax - i11));
                            if (c18576e == null) {
                                c18576e = new C18576e(iMax);
                            }
                        }
                        ((C12948A) this.f42700p0).m14606f(iMax, c18576e);
                        C0420b c0420b = (C0420b) this.f42701q0;
                        ((Object[]) c0420b.f1383p0)[iMax - c0420b.f1381Z] = c18576e;
                        if (iMax != iMin) {
                            iMax++;
                        }
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13487e(AbstractC21069X[] abstractC21069XArr, C13488f c13488f, int i10, int i11) {
        super(1);
        this.f42700p0 = abstractC21069XArr;
        this.f42701q0 = c13488f;
        this.f42698Z = i10;
        this.f42699o0 = i11;
    }
}
