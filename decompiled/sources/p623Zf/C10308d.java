package p623Zf;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9703B3;
import p635a1.C10456n;
import p911o0.AbstractC17758g;

/* JADX INFO: renamed from: Zf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10308d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C10308d f30604Z = new C10308d(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10308d f30605o0 = new C10308d(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10308d f30606p0 = new C10308d(2, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30607Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10308d(int i10, int i11) {
        super(i10);
        this.f30607Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30607Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.design_logo_google, c6021p, 0), null, null, 0L, c6021p, 48, 12);
                    AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(C10456n.f30959Y, AbstractC7313q.f23199d));
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.login_google, c6021p), null, 0L, c6021p, 0);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.signup, c6021p2), null, 0L, c6021p2, 0);
                }
                break;
            default:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.login, c6021p3), null, 0L, c6021p3, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
