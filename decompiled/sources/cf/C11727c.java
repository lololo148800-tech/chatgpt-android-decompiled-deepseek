package cf;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.lazy.C10845a;
import androidx.compose.material3.C10858c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p042Bf.C1263e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4005X2;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: cf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11727c extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35564Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f35565Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f35566o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11727c(int i10, int i11, InterfaceC1436k interfaceC1436k) {
        super(3);
        this.f35564Y = i11;
        this.f35565Z = interfaceC1436k;
        this.f35566o0 = i10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35564Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.star_filled, c6021p, 0);
                    String strM8676d = AbstractC8142m4.m8676d(R.string.gizmo_rating_filled_star_cd, c6021p);
                    long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                    InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23188e);
                    c6021p.m6524S(-897179131);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = AbstractC0168G.m536y(c6021p);
                    }
                    InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
                    c6021p.m6553p(false);
                    C10858c c10858cM4717b = AbstractC4005X2.m4717b(AbstractC11728d.f35567a, 4, 0L, false);
                    c6021p.m6524S(-897170417);
                    InterfaceC1436k interfaceC1436k = this.f35565Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                    int i10 = this.f35566o0;
                    boolean zM6538d = zM6542f | c6021p.m6538d(i10);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6538d || objM6514H2 == c5975s) {
                        objM6514H2 = new C1263e(i10, 2, interfaceC1436k);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, strM8676d, AbstractC10833a.m11208c(interfaceC10459qM11252l, interfaceC17406l, c10858cM4717b, false, null, (InterfaceC1426a) objM6514H2, 28), j10, c6021p, 0, 0);
                }
                break;
            default:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.star_filled, c6021p2, 0);
                    String strM8676d2 = AbstractC8142m4.m8676d(R.string.gizmo_rating_empty_star_cd, c6021p2);
                    long j11 = ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12236r;
                    InterfaceC10459q interfaceC10459qM11252l2 = AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23188e);
                    c6021p2.m6524S(-897150427);
                    Object objM6514H3 = c6021p2.m6514H();
                    C5975S c5975s2 = C6013l.f19514a;
                    if (objM6514H3 == c5975s2) {
                        objM6514H3 = AbstractC0168G.m536y(c6021p2);
                    }
                    InterfaceC17406l interfaceC17406l2 = (InterfaceC17406l) objM6514H3;
                    c6021p2.m6553p(false);
                    C10858c c10858cM4717b2 = AbstractC4005X2.m4717b(AbstractC11728d.f35567a, 4, 0L, false);
                    c6021p2.m6524S(-897141713);
                    InterfaceC1436k interfaceC1436k2 = this.f35565Z;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k2);
                    int i11 = this.f35566o0;
                    boolean zM6538d2 = zM6542f2 | c6021p2.m6538d(i11);
                    Object objM6514H4 = c6021p2.m6514H();
                    if (zM6538d2 || objM6514H4 == c5975s2) {
                        objM6514H4 = new C1263e(i11, 3, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H4);
                    }
                    c6021p2.m6553p(false);
                    AbstractC3878A1.m4596a(abstractC17140aM8631b2, strM8676d2, AbstractC10833a.m11208c(interfaceC10459qM11252l2, interfaceC17406l2, c10858cM4717b2, false, null, (InterfaceC1426a) objM6514H4, 28), j11, c6021p2, 0, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
