package p870le;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1081wc.InterfaceC20904w;
import p229J0.AbstractC3878A1;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;

/* JADX INFO: renamed from: le.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C16846C extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54032Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f54033Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16846C(InterfaceC20904w interfaceC20904w, int i10) {
        super(2);
        this.f54032Y = i10;
        this.f54033Z = interfaceC20904w;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54032Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                C17296C c17296c = C17296C.f55119a;
                if (iIntValue == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(2034006582);
                    InterfaceC20904w interfaceC20904w = this.f54033Z;
                    boolean zM6545h = c6021p.m6545h(interfaceC20904w);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C16845B(interfaceC20904w, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.camera, c6021p, 0), AbstractC8142m4.m8676d(R.string.conversations_take_photo, c6021p), null, 0L, c6021p, 0, 12);
                }
                return c17296c;
            default:
                C6021p c6021p2 = (C6021p) obj;
                int iIntValue2 = ((Number) obj2).intValue() & 3;
                C17296C c17296c2 = C17296C.f55119a;
                if (iIntValue2 == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(2034043158);
                    InterfaceC20904w interfaceC20904w2 = this.f54033Z;
                    boolean zM6545h2 = c6021p2.m6545h(interfaceC20904w2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6545h2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C16847D(interfaceC20904w2, null);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p2, c17296c2);
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.image_wide, c6021p2, 0), AbstractC8142m4.m8676d(R.string.conversations_image_button, c6021p2), null, 0L, c6021p2, 0, 12);
                }
                return c17296c2;
        }
    }
}
