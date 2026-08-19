package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0307z;
import p042Bf.C1281w;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21059M;
import p296Lk.C5117n;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p537W0.C8410b;
import p544W9.AbstractC8698q3;
import p571X9.AbstractC9113C4;
import p927og.C18193d;
import p968qi.C18733p;
import p968qi.C18739v;
import p968qi.C18742y;

/* JADX INFO: renamed from: o0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17779q0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56747Y = 2;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f56748Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f56749o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f56750p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f56751q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f56752r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17779q0(int i10, int i11, InterfaceC1436k interfaceC1436k, C18739v c18739v, C18742y c18742y) {
        super(1);
        this.f56748Z = i10;
        this.f56749o0 = i11;
        this.f56750p0 = c18739v;
        this.f56751q0 = c18742y;
        this.f56752r0 = interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int iM10926a;
        switch (this.f56747Y) {
            case 0:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                AbstractC21069X[] abstractC21069XArr = (AbstractC21069X[]) this.f56750p0;
                int length = abstractC21069XArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    AbstractC21069X abstractC21069X = abstractC21069XArr[i10];
                    int i12 = i11 + 1;
                    AbstractC16544l.m18091d(abstractC21069X);
                    C17775o0 c17775o0M19486h = AbstractC17758g.m19486h(abstractC21069X);
                    C17781r0 c17781r0 = (C17781r0) this.f56751q0;
                    c17781r0.getClass();
                    AbstractC17758g abstractC17758g = c17775o0M19486h != null ? c17775o0M19486h.f56736c : null;
                    int i13 = this.f56748Z;
                    if (abstractC17758g != null) {
                        iM10926a = abstractC17758g.mo19456c(i13 - abstractC21069X.f66982Z, EnumC7546k.f23904Y, abstractC21069X, this.f56749o0);
                    } else {
                        iM10926a = c17781r0.f56758b.m10926a(0, i13 - abstractC21069X.f66982Z);
                    }
                    abstractC21068W.m21545d(abstractC21069X, ((int[]) this.f56752r0)[i11], iM10926a, 0.0f);
                    i10++;
                    i11 = i12;
                }
                break;
            case 1:
                ?? r6 = ((C17726F0) this.f56750p0).f56591B0;
                AbstractC21069X abstractC21069X2 = (AbstractC21069X) this.f56751q0;
                AbstractC21068W.m21537f((AbstractC21068W) obj, abstractC21069X2, ((C7543h) r6.invoke(new C7545j(AbstractC9113C4.m9643a(this.f56748Z - abstractC21069X2.f66981Y, this.f56749o0 - abstractC21069X2.f66982Z)), ((InterfaceC21059M) this.f56752r0).getLayoutDirection())).f23897a);
                break;
            default:
                C5117n LazyTable = (C5117n) obj;
                AbstractC16544l.m18094g(LazyTable, "$this$LazyTable");
                C18733p c18733p = C18733p.f59589o0;
                C18742y c18742y = (C18742y) this.f56751q0;
                C18739v c18739v = (C18739v) this.f56750p0;
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f56752r0;
                C8410b c8410b = new C8410b(new C1281w(c18739v, c18742y, interfaceC1436k, 28), true, -605269334);
                int i14 = this.f56748Z;
                AbstractC8698q3.m9400b(LazyTable, i14, c18733p, c8410b);
                AbstractC8698q3.m9400b(LazyTable, this.f56749o0 * i14, new C0307z(i14, 5), new C8410b(new C18193d(i14, c18742y, c18739v, interfaceC1436k), true, -726004511));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17779q0(C17726F0 c17726f0, int i10, AbstractC21069X abstractC21069X, int i11, InterfaceC21059M interfaceC21059M) {
        super(1);
        this.f56750p0 = c17726f0;
        this.f56748Z = i10;
        this.f56751q0 = abstractC21069X;
        this.f56749o0 = i11;
        this.f56752r0 = interfaceC21059M;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17779q0(AbstractC21069X[] abstractC21069XArr, C17781r0 c17781r0, int i10, int i11, int[] iArr) {
        super(1);
        this.f56750p0 = abstractC21069XArr;
        this.f56751q0 = c17781r0;
        this.f56748Z = i10;
        this.f56749o0 = i11;
        this.f56752r0 = iArr;
    }
}
