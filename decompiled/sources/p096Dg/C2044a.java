package p096Dg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0309z1;
import p043Bg.C1286b;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8095g5;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9733G3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Dg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2044a extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C2044a f6255Z = new C2044a(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2044a f6256o0 = new C2044a(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2044a f6257p0 = new C2044a(3, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6258Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2044a(int i10, int i11) {
        super(i10);
        this.f6258Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f6258Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.network_certificate_error_learn_more_button, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C17794y HeroContent = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(HeroContent, "$this$HeroContent");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p2.m6548k(AbstractC0187M0.f714p);
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f);
                    c6021p2.m6524S(-1497167302);
                    boolean zM6545h = c6021p2.m6545h(interfaceC0309z1);
                    Object objM6514H = c6021p2.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C1286b(interfaceC0309z1, 1);
                        c6021p2.m6537c0(objM6514H);
                    }
                    c6021p2.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459qM11244d, false, null, null, null, null, null, null, AbstractC2045b.f6259a, c6021p2, 805306416, 508);
                }
                break;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6021p3.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC9733G3.m10320a(AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings), AbstractC8095g5.m8564a(), AbstractC8142m4.m8676d(R.string.network_certificate_error_title, c6021p3), AbstractC8142m4.m8676d(R.string.network_certificate_error_message, c6021p3), AbstractC2045b.f6260b, c6021p3, 24576, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
