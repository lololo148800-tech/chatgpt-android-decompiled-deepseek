package p124Ei;

import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p204I1.C3582M;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9703B3;
import p635a1.C10456n;
import p736f0.InterfaceC13499q;
import p774h1.C14338P;
import p774h1.C14365u;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Ei.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C2530n extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C2530n f7864Z = new C2530n(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2530n f7865o0 = new C2530n(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2530n f7866p0 = new C2530n(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7867Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2530n(int i10, int i11) {
        super(i10);
        this.f7867Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7867Y) {
            case 0:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.video_warning, c6021p), AbstractC10842a.m11234l(C10456n.f30959Y, AbstractC7313q.f23203h, AbstractC7313q.f23202g), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C3582M.m4274b(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, C14365u.f45055e, 0L, null, null, 0L, new C14338P(4.0f, 2, C14365u.f45052b), 3, 0, 0L, null, null, 16736254), c6021p, 0, 0, 65532);
                break;
            case 1:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9703B3.m10296a(AbstractC8142m4.m8676d(R.string.disclosure_continue, c6021p2), null, 0L, c6021p2, 0);
                }
                break;
            default:
                InterfaceC13499q AnimatedVisibility2 = (InterfaceC13499q) obj;
                C6021p c6021p3 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility2, "$this$AnimatedVisibility");
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_settings_title, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                break;
        }
        return C17296C.f55119a;
    }
}
