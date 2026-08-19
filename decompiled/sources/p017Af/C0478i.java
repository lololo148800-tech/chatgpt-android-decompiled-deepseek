package p017Af;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1783Q;
import p080D0.AbstractC1807h0;
import p080D0.C1782P;
import p1045ul.C20387d;
import p1071w0.EnumC20729S;
import p1095x1.InterfaceC21056J;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p156G1.C2963j;
import p193Hf.C3363f1;
import p523V9.AbstractC8088f6;
import p715e1.C13257c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.C14358n;
import p821j1.C16042g;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p857kl.C16464l;

/* JADX INFO: renamed from: Af.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0478i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1553Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f1554Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0478i(long j10, int i10) {
        super(1);
        this.f1553Y = i10;
        this.f1554Z = j10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10 = 5;
        long j10 = this.f1554Z;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f1553Y) {
            case 0:
                InterfaceC16039d drawBehind = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(drawBehind, "$this$drawBehind");
                drawBehind.mo17607x0(this.f1554Z, 0L, AbstractC8088f6.m8536b(0.0f, C13803e.m15331c(drawBehind.mo17602i())), drawBehind.mo7864b0(2), (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                return c17296c;
            case 1:
                InterfaceC16039d drawBehind2 = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(drawBehind2, "$this$drawBehind");
                drawBehind2.mo17607x0(this.f1554Z, 0L, AbstractC8088f6.m8536b(0.0f, C13803e.m15331c(drawBehind2.mo17602i())), drawBehind2.mo7864b0(2), (480 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
                return c17296c;
            case 2:
                InterfaceC16039d Canvas = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(Canvas, "$this$Canvas");
                float f10 = 2;
                Canvas.mo17591U(this.f1554Z, (112 & 2) != 0 ? C13803e.m15332d(Canvas.mo17602i()) / 2.0f : (C13803e.m15332d(Canvas.mo17602i()) / f10) - Canvas.mo7864b0(6), (112 & 4) != 0 ? Canvas.mo17604o0() : Canvas.mo17604o0(), (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                float fMo7864b0 = Canvas.mo7864b0(5);
                Canvas.mo17591U(this.f1554Z, (112 & 2) != 0 ? C13803e.m15332d(Canvas.mo17602i()) / 2.0f : (C13803e.m15332d(Canvas.mo17602i()) / f10) - (fMo7864b0 / f10), (112 & 4) != 0 ? Canvas.mo17604o0() : Canvas.mo17604o0(), (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : new C16043h(fMo7864b0, 0.0f, 0, 0, 30), null, 3);
                return c17296c;
            case 3:
                C16464l cookie = (C16464l) obj;
                AbstractC16544l.m18094g(cookie, "cookie");
                C20387d c20387d = cookie.f51074e;
                if (c20387d != null) {
                    return Boolean.valueOf(c20387d.f64480u0 < j10);
                }
                return Boolean.FALSE;
            case 4:
                Long l4 = (Long) obj;
                if (l4 == null) {
                    throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                }
                C21554a c21554a = C21555b.f68260Z;
                if (j10 > 0) {
                    return Long.valueOf(C21555b.m21835e(j10) + l4.longValue());
                }
                throw new IllegalArgumentException("Cannot call addTime with a negative duration");
            case 5:
                InterfaceC21056J item = (InterfaceC21056J) obj;
                AbstractC16544l.m18094g(item, "item");
                return item.mo21533p(j10);
            case 6:
                C13257c c13257c = (C13257c) obj;
                float fM15333e = C13803e.m15333e(c13257c.f41873Y.mo14854i()) / 2.0f;
                return c13257c.m14856a(new C3363f1(fM15333e, AbstractC1807h0.m2632u(c13257c, fM15333e), new C14356l(j10, 5, Build.VERSION.SDK_INT >= 29 ? C14358n.f45047a.m15769a(j10, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5))), i10));
            default:
                ((C2963j) obj).m3787m(AbstractC1783Q.f5106c, new C1782P(EnumC20729S.f65724Y, this.f1554Z, 2, true));
                return c17296c;
        }
    }
}
