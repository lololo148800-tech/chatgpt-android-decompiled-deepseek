package p194Hg;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1062vd.C20541V;
import p1113xn.AbstractC21322p;
import p1155zi.C21891A;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3995V2;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p479Td.AbstractC7343b0;
import p479Td.C7326L;
import p502Uc.AbstractC7622f;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC8034Z;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p870le.C16878e0;

/* JADX INFO: renamed from: Hg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3425e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10441Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f10442Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f10443o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3425e(Object obj, boolean z6, int i10) {
        super(2);
        this.f10441Y = i10;
        this.f10443o0 = obj;
        this.f10442Z = z6;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10441Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C21891A c21891a = (C21891A) this.f10443o0;
                    if (c21891a.m22324c()) {
                        c6021p.m6524S(1244423413);
                        AbstractC3995V2.m4711a(this.f10442Z, null, !c21891a.m22329h(), null, null, c6021p, 48, 52);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1244626866);
                        AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.hazard, c6021p, 0), null, null, 0L, c6021p, 48, 12);
                        c6021p.m6553p(false);
                    }
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else if (this.f10442Z) {
                    c6021p2.m6524S(1452748123);
                    AbstractC3980S2.m4668b(AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23186c), 0L, 0.0f, 0L, 0, c6021p2, 6, 30);
                    c6021p2.m6553p(false);
                } else {
                    c6021p2.m6524S(1452862389);
                    ((InterfaceC1439n) this.f10443o0).invoke(c6021p2, 0);
                    c6021p2.m6553p(false);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    c6021p3.m6524S(2102157377);
                    C20541V c20541v = (C20541V) this.f10443o0;
                    String strM8676d = c20541v.f65169a.f21384f;
                    if (strM8676d == null) {
                        strM8676d = "";
                    }
                    if (AbstractC21322p.m21681O(strM8676d)) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p3);
                    }
                    c6021p3.m6553p(false);
                    AbstractC7622f.m7962a(strM8676d, false, AbstractC8411c.m8969c(-97467859, c6021p3, new C16878e0(this.f10442Z, strM8676d, c20541v, 3)), c6021p3, 432);
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC7918J5.m8211a(AbstractC8034Z.m8391f(((C7326L) ((AbstractC7343b0) this.f10443o0)).f23233c, this.f10442Z), null, c6021p4, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3425e(boolean z6, InterfaceC1439n interfaceC1439n) {
        super(2);
        this.f10441Y = 1;
        this.f10442Z = z6;
        this.f10443o0 = interfaceC1439n;
    }
}
