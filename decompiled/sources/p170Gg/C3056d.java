package p170Gg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import com.openai.feature.serverstatus.impl.unsupportedcountry.UnsupportedCountryViewModel;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0130g;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3984T1;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8524N2;
import p594Y9.AbstractC9733G3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Gg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3056d extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9218Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ UnsupportedCountryViewModel f9219Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3056d(UnsupportedCountryViewModel unsupportedCountryViewModel, int i10) {
        super(3);
        this.f9218Y = i10;
        this.f9219Z = unsupportedCountryViewModel;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9218Y) {
            case 0:
                C17794y HeroContent = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(HeroContent, "$this$HeroContent");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f);
                    c6021p.m6524S(1425145274);
                    UnsupportedCountryViewModel unsupportedCountryViewModel = this.f9219Z;
                    boolean zM6542f = c6021p.m6542f(unsupportedCountryViewModel);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0130g(unsupportedCountryViewModel, 25);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459qM11244d, false, null, null, null, null, null, null, AbstractC3054b.f9216a, c6021p, 805306416, 508);
                }
                break;
            default:
                InterfaceC17763i0 paddings = (InterfaceC17763i0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(paddings, "paddings");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6021p2.m6542f(paddings) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC9733G3.m10320a(AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings), AbstractC8524N2.m9189b(), AbstractC8142m4.m8676d(R.string.unsupported_country_title, c6021p2), AbstractC8142m4.m8676d(R.string.unsupported_country_message, c6021p2), AbstractC8411c.m8969c(-950029051, c6021p2, new C3056d(this.f9219Z, 0)), c6021p2, 24576, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
