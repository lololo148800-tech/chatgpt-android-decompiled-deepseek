package p069Cf;

import android.javax.sip.C10808o;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p470T4.AbstractC7255t;
import p478Tc.AbstractC7313q;
import p552Wg.C8847i;
import p636a2.C10468e;
import p636a2.C10469f;
import p636a2.C10472i;
import p636a2.C10480q;

/* JADX INFO: renamed from: Cf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1647f extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4660Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10469f f4661Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10472i f4662o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1647f(C10469f c10469f, C10472i c10472i, int i10) {
        super(1);
        this.f4660Y = i10;
        this.f4661Z = c10469f;
        this.f4662o0 = c10472i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f4660Y) {
            case 0:
                C10468e constrainAs = (C10468e) obj;
                AbstractC16544l.m18094g(constrainAs, "$this$constrainAs");
                C10469f c10469f = this.f4661Z;
                AbstractC7255t.m7697e(constrainAs.f31001d, c10469f.f31008d, AbstractC7313q.f23200e, 4);
                float f10 = AbstractC7313q.f23199d;
                AbstractC7255t.m7697e(constrainAs.f31003f, this.f4662o0, f10, 4);
                constrainAs.f30999b.add(new C8847i(constrainAs, 9, new C10808o(C10480q.f31043Z)));
                C10468e.m10938a(constrainAs, c10469f);
                break;
            case 1:
                C10468e constrainAs2 = (C10468e) obj;
                AbstractC16544l.m18094g(constrainAs2, "$this$constrainAs");
                C10469f c10469f2 = this.f4661Z;
                AbstractC7255t.m7697e(constrainAs2.f31001d, c10469f2.f31008d, AbstractC7313q.f23200e, 4);
                float f11 = AbstractC7313q.f23199d;
                AbstractC7255t.m7697e(constrainAs2.f31003f, this.f4662o0, f11, 4);
                constrainAs2.f30999b.add(new C8847i(constrainAs2, 9, new C10808o(C10480q.f31043Z)));
                C10468e.m10938a(constrainAs2, c10469f2);
                break;
            default:
                C10468e constrainAs3 = (C10468e) obj;
                AbstractC16544l.m18094g(constrainAs3, "$this$constrainAs");
                float f12 = AbstractC7313q.f23202g;
                AbstractC7255t.m7697e(constrainAs3.f31003f, this.f4662o0, f12, 4);
                C10468e.m10938a(constrainAs3, this.f4661Z);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647f(C10472i c10472i, C10469f c10469f) {
        super(1);
        this.f4660Y = 2;
        this.f4662o0 = c10472i;
        this.f4661Z = c10469f;
    }
}
