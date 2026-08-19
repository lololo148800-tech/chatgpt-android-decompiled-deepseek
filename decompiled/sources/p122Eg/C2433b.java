package p122Eg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0130g;
import p017Af.C0468O;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3984T1;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8547R2;
import p594Y9.AbstractC9733G3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p895n1.C17429i;
import p895n1.C17433m;
import p895n1.C17435o;
import p895n1.C17438r;
import p895n1.C17439s;
import p895n1.C17440t;
import p895n1.C17445y;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: Eg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2433b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7562Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2436e f7563Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SunsetViewModel f7564o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2433b(C2436e c2436e, SunsetViewModel sunsetViewModel, int i10) {
        super(3);
        this.f7562Y = i10;
        this.f7563Z = c2436e;
        this.f7564o0 = sunsetViewModel;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        SunsetViewModel sunsetViewModel = this.f7564o0;
        C2436e c2436e = this.f7563Z;
        switch (this.f7562Y) {
            case 0:
                C17794y HeroContent = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(HeroContent, "$this$HeroContent");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else if (c2436e.f7574c != null) {
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f);
                    c6021p.m6524S(1830313676);
                    boolean zM6542f = c6021p.m6542f(sunsetViewModel);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0130g(sunsetViewModel, 19);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, interfaceC10459qM11244d, false, null, null, null, null, null, null, AbstractC8411c.m8969c(1025848227, c6021p, new C0468O(c2436e, 5)), c6021p, 805306416, 508);
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
                if ((19 & iIntValue2) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C17425e c17425eM19122b = AbstractC8547R2.f26375a;
                    if (c17425eM19122b == null) {
                        C17424d c17424d = new C17424d("Outlined.WbTwilight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = AbstractC17418F.f55636a;
                        long j10 = C14365u.f45052b;
                        C14341T c14341t = new C14341T(j10);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C17433m(16.955f, 8.662f));
                        arrayList.add(new C17440t(2.121f, -2.122f));
                        arrayList.add(new C17440t(1.415f, 1.414f));
                        arrayList.add(new C17440t(-2.121f, 2.122f));
                        C17429i c17429i = C17429i.f55733c;
                        arrayList.add(c17429i);
                        C17424d.m19121a(c17424d, arrayList, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        C14341T c14341t2 = new C14341T(j10);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new C17433m(2.0f, 18.0f));
                        arrayList2.add(new C17439s(20.0f));
                        arrayList2.add(new C17445y(2.0f));
                        arrayList2.add(new C17439s(-20.0f));
                        arrayList2.add(c17429i);
                        C17424d.m19121a(c17424d, arrayList2, 0, c14341t2, null, 1.0f, 0, 2, 1.0f);
                        C14341T c14341t3 = new C14341T(j10);
                        ArrayList arrayList3 = new ArrayList(32);
                        arrayList3.add(new C17433m(11.0f, 4.0f));
                        arrayList3.add(new C17439s(2.0f));
                        arrayList3.add(new C17445y(3.0f));
                        arrayList3.add(new C17439s(-2.0f));
                        arrayList3.add(c17429i);
                        C17424d.m19121a(c17424d, arrayList3, 0, c14341t3, null, 1.0f, 0, 2, 1.0f);
                        C14341T c14341t4 = new C14341T(j10);
                        ArrayList arrayList4 = new ArrayList(32);
                        arrayList4.add(new C17433m(3.543f, 7.925f));
                        arrayList4.add(new C17440t(1.414f, -1.414f));
                        arrayList4.add(new C17440t(2.121f, 2.121f));
                        arrayList4.add(new C17440t(-1.414f, 1.414f));
                        arrayList4.add(c17429i);
                        C17424d.m19121a(c17424d, arrayList4, 0, c14341t4, null, 1.0f, 0, 2, 1.0f);
                        C14341T c14341t5 = new C14341T(j10);
                        ArrayList arrayList5 = new ArrayList(32);
                        arrayList5.add(new C17433m(5.0f, 16.0f));
                        arrayList5.add(new C17439s(14.0f));
                        arrayList5.add(new C17438r(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f));
                        arrayList5.add(new C17435o(5.0f, 12.13f, 5.0f, 16.0f));
                        arrayList5.add(c17429i);
                        C17424d.m19121a(c17424d, arrayList5, 0, c14341t5, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b = c17424d.m19122b();
                        AbstractC8547R2.f26375a = c17425eM19122b;
                    }
                    C17425e c17425e = c17425eM19122b;
                    String strM8676d = AbstractC8142m4.m8676d(R.string.sunset_screen_title, c6021p2);
                    String strM8676d2 = c2436e.f7572a;
                    c6021p2.m6524S(-760373312);
                    if (strM8676d2 == null) {
                        strM8676d2 = AbstractC8142m4.m8676d(R.string.sunset_screen_description, c6021p2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC9733G3.m10320a(AbstractC10842a.m11232j(AbstractC10844c.f32512c, paddings), c17425e, strM8676d, strM8676d2, AbstractC8411c.m8969c(131690001, c6021p2, new C2433b(c2436e, sunsetViewModel, 0)), c6021p2, 24576, 0);
                }
                break;
        }
        return c17296c;
    }
}
