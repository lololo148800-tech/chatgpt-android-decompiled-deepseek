package p679ce;

import com.openai.chatgpt.R;
import ge.C14111x0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3878A1;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8634g;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: ce.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C11720k extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35537Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14111x0 f35538Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11720k(C14111x0 c14111x0, int i10) {
        super(2);
        this.f35537Y = i10;
        this.f35538Z = c14111x0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC17140a abstractC17140aM8631b;
        AbstractC17140a abstractC17140aM8631b2;
        switch (this.f35537Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8634g.m9290d(this.f35538Z, null, c6021p, 0, 2);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else if (this.f35538Z.f44380K) {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.check, c6021p2, 0), null, null, 0L, c6021p2, 48, 12);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    if (this.f35538Z.f44430r) {
                        c6021p3.m6524S(604677059);
                        abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.mic_filled_off, c6021p3, 0);
                        c6021p3.m6553p(false);
                    } else {
                        c6021p3.m6524S(604679487);
                        abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.mic_filled, c6021p3, 0);
                        c6021p3.m6553p(false);
                    }
                    AbstractC3878A1.m4596a(abstractC17140aM8631b, AbstractC8142m4.m8676d(R.string.conversations_conversation_whisper_button, c6021p3), null, 0L, c6021p3, 0, 12);
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    if (this.f35538Z.f44430r) {
                        c6021p4.m6524S(604274947);
                        abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.mic_filled_off, c6021p4, 0);
                        c6021p4.m6553p(false);
                    } else {
                        c6021p4.m6524S(604277248);
                        abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.mic_outline, c6021p4, 0);
                        c6021p4.m6553p(false);
                    }
                    AbstractC3878A1.m4596a(abstractC17140aM8631b2, AbstractC8142m4.m8676d(R.string.conversations_conversation_whisper_button, c6021p4), null, 0L, c6021p4, 0, 12);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
