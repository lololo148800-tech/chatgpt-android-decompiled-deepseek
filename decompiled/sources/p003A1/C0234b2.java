package p003A1;

import android.view.View;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1728f;
import p349O0.C5943B0;
import p349O0.C5947D0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p609Z0.AbstractC10133b;

/* JADX INFO: renamed from: A1.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0234b2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f874Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0238c2 f875Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8410b f876o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0234b2(C0238c2 c0238c2, C8410b c8410b, int i10) {
        super(2);
        this.f874Y = i10;
        this.f875Z = c0238c2;
        this.f876o0 = c8410b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f874Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AndroidCompositionLocals_androidKt.m11353a(this.f875Z.f882Y, this.f876o0, c6021p, 0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C0238c2 c0238c2 = this.f875Z;
                    Object tag = c0238c2.f882Y.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC1723a) || (tag instanceof InterfaceC1728f)) ? (Set) tag : null;
                    AndroidComposeView androidComposeView = c0238c2.f882Y;
                    if (set == null) {
                        Object parent = androidComposeView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC1723a) && !(tag2 instanceof InterfaceC1728f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c6021p2.f19567c);
                        c6021p2.f19580p = true;
                        c6021p2.f19550B = true;
                        c6021p2.f19567c.m6342j();
                        c6021p2.f19555G.m6342j();
                        C5947D0 c5947d0 = c6021p2.f19556H;
                        C5943B0 c5943b0 = c5947d0.f19364a;
                        c5947d0.f19368e = c5943b0.f19354u0;
                        c5947d0.f19369f = c5943b0.f19355v0;
                    }
                    boolean zM6545h = c6021p2.m6545h(c0238c2);
                    Object objM6514H = c6021p2.m6514H();
                    C5975S c5975s = C6013l.f19514a;
                    if (zM6545h || objM6514H == c5975s) {
                        objM6514H = new C0226Z1(c0238c2, null);
                        c6021p2.m6537c0(objM6514H);
                    }
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p2, androidComposeView);
                    boolean zM6545h2 = c6021p2.m6545h(c0238c2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6545h2 || objM6514H2 == c5975s) {
                        objM6514H2 = new C0230a2(c0238c2, null);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p2, androidComposeView);
                    C5997d.m6440a(AbstractC10133b.f30038a.mo6405a(set), AbstractC8411c.m8969c(-1193460702, c6021p2, new C0234b2(c0238c2, this.f876o0, 0)), c6021p2, 56);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
