package tf;

import com.openai.chatgpt.R;
import io.C15105o;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p1071w0.AbstractC20740b0;
import p1071w0.C20718K0;
import p1108xi.AbstractC21264a;
import p204I1.C3590f;
import p229J0.AbstractC4124r4;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: tf.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C19941z extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63206Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f63207Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f63208o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19941z(Object obj, int i10, int i11) {
        super(2);
        this.f63206Y = i11;
        this.f63208o0 = obj;
        this.f63207Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String strM19533p;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f63208o0;
        int i10 = this.f63207Z;
        switch (this.f63206Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC19905J.m20790c((C15105o) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC20740b0.m21268i((C1837w0) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ((C20718K0) obj3).m21220a(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                break;
            case 3:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    if (((ArrayList) obj3).size() == 1) {
                        strM19533p = AbstractC17792x.m19533p(c6021p, 20357820, R.string.conversations_copy_latex_formula, c6021p, false);
                    } else {
                        c6021p.m6524S(20360961);
                        String strM8677e = AbstractC8142m4.m8677e(R.string.conversations_copy_latex_formula_n, new Object[]{Integer.valueOf(i10)}, c6021p);
                        c6021p.m6553p(false);
                        strM19533p = strM8677e;
                    }
                    AbstractC4124r4.m4768b(strM19533p, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC21264a.m21618b((C3590f) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                break;
        }
        return c17296c;
    }
}
