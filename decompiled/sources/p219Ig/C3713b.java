package p219Ig;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: Ig.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3713b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11263Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3718g f11264Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3713b(InterfaceC3718g interfaceC3718g, int i10) {
        super(2);
        this.f11263Y = i10;
        this.f11264Z = interfaceC3718g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC3718g interfaceC3718g = this.f11264Z;
        switch (this.f11263Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String strMo4418d = interfaceC3718g.mo4418d();
                    c6021p.m6524S(918854331);
                    if (strMo4418d == null) {
                        strMo4418d = AbstractC8142m4.m8676d(R.string.deactivated_account_placeholder_name, c6021p);
                    }
                    c6021p.m6553p(false);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.deactivated_account_title, new Object[]{strMo4418d}, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12151g, c6021p, 0, 0, 65534);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(interfaceC3718g.mo4417c(), c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
        }
        return c17296c;
    }
}
