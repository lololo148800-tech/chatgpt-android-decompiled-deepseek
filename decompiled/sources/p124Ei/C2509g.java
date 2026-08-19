package p124Ei;

import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4075j3;
import p349O0.C6021p;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9818V;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: Ei.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2509g extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7803Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f7804Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2509g(boolean z6, int i10) {
        super(2);
        this.f7803Y = i10;
        this.f7804Z = z6;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int i11;
        AbstractC17140a abstractC17140aM8631b;
        int i12;
        switch (this.f7803Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    boolean z6 = this.f7804Z;
                    if (z6) {
                        i10 = R.drawable.flash_on;
                    } else {
                        if (z6) {
                            throw new C0644w();
                        }
                        i10 = R.drawable.flash_off;
                    }
                    AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(i10, c6021p, 0);
                    if (z6) {
                        i11 = R.string.voice_switch_turn_on_torch;
                    } else {
                        if (z6) {
                            throw new C0644w();
                        }
                        i11 = R.string.voice_switch_turn_off_torch;
                    }
                    AbstractC3878A1.m4596a(abstractC17140aM8631b2, AbstractC8142m4.m8676d(i11, c6021p), null, C14365u.f45055e, c6021p, 3072, 4);
                }
                return C17296C.f55119a;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C4075j3.f12983a.m4746b(this.f7804Z, null, null, c6021p2, 3072);
                }
                return C17296C.f55119a;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    c6021p3.m6524S(107442124);
                    C10456n c10456n = C10456n.f30959Y;
                    if (this.f7804Z) {
                        AbstractC4124r4.m4768b("Some long subtitle text that might be two lines", AbstractC9818V.m10458b(c10456n, true, true, 0.0f, 12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p3, 6, 0, 65532);
                    }
                    c6021p3.m6553p(false);
                    AbstractC4124r4.m4768b("By some author", AbstractC9818V.m10458b(c10456n, true, true, 0.0f, 12), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p3, 6, 0, 65532);
                }
                return C17296C.f55119a;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(this.f7804Z ? R.drawable.arrow_left : R.drawable.menu, c6021p4, 0), AbstractC8142m4.m8676d(R.string.conversation_menu_button, c6021p4), null, 0L, c6021p4, 0, 12);
                }
                return C17296C.f55119a;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else if (this.f7804Z) {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.check_circle_filled, c6021p5, 0), null, null, ((C3949M0) c6021p5.m6548k(AbstractC3959O0.f12302a)).f12213a, c6021p5, 48, 4);
                }
                return C17296C.f55119a;
            case 5:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23186c);
                    if (this.f7804Z) {
                        c6021p6.m6524S(-1355249978);
                        abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.chat_temporary_checked, c6021p6, 0);
                        c6021p6.m6553p(false);
                    } else {
                        c6021p6.m6524S(-1355247170);
                        abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.chat_temporary, c6021p6, 0);
                        c6021p6.m6553p(false);
                    }
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, AbstractC8142m4.m8676d(R.string.conversation_attachment_content_description, c6021p6), interfaceC10459qM11252l, 0L, c6021p6, 0, 8);
                }
                return C17296C.f55119a;
            default:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    boolean z10 = this.f7804Z;
                    if (z10) {
                        i12 = R.string.message_feedback_good_transcription;
                    } else {
                        if (z10) {
                            throw new C0644w();
                        }
                        i12 = R.string.conversations_good_response;
                    }
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i12, c6021p7), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p7, 0, 0, 131070);
                }
                return C17296C.f55119a;
        }
    }
}
