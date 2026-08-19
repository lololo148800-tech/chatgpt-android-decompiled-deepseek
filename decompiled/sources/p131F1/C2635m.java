package p131F1;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.function.Consumer;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p080D0.C1817m0;
import p083D3.AbstractC1872j;
import p1095x1.AbstractC21075b0;
import p1140z1.AbstractC21678Y;
import p153Fn.C2925c;
import p156G1.C2968o;
import p156G1.C2969p;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p392Q0.C6546d;
import p492U1.C7544i;
import p523V9.AbstractC8127k5;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9107B4;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: F1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2635m {

    /* JADX INFO: renamed from: a */
    public final C6002f0 f8152a = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);

    /* JADX INFO: renamed from: a */
    public final void m3623a(View view, C2969p c2969p, InterfaceC18776i interfaceC18776i, Consumer<ScrollCaptureTarget> consumer) {
        C6546d c6546d = new C6546d(new C2636n[16]);
        AbstractC8127k5.m8634c(c2969p.m3805a(), 0, new C2634l(1, 8, C6546d.class, c6546d, "add", "add(Ljava/lang/Object;)Z"));
        c6546d.m7113r(new C1817m0(new InterfaceC1436k[]{C2626d.f8128o0, C2626d.f8129p0}, 3));
        C2636n c2636n = (C2636n) (c6546d.m7108m() ? null : c6546d.f21182Y[c6546d.f21184o0 - 1]);
        if (c2636n == null) {
            return;
        }
        C2925c c2925cM1174c = AbstractC0575H.m1174c(interfaceC18776i);
        C2968o c2968o = c2636n.f8153a;
        C7544i c7544i = c2636n.f8155c;
        ScrollCaptureCallbackC2628f scrollCaptureCallbackC2628f = new ScrollCaptureCallbackC2628f(c2968o, c7544i, c2925cM1174c, this);
        AbstractC21678Y abstractC21678Y = c2636n.f8156d;
        C13801c c13801cMo21528y = AbstractC21075b0.m21568i(abstractC21678Y).mo21528y(abstractC21678Y, true);
        long jM9631a = AbstractC9101A4.m9631a(c7544i.f23899a, c7544i.f23900b);
        ScrollCaptureTarget scrollCaptureTargetM2827f = AbstractC1872j.m2827f(view, AbstractC14334L.m15614C(AbstractC9107B4.m9638b(c13801cMo21528y)), new Point((int) (jM9631a >> 32), (int) (jM9631a & 4294967295L)), scrollCaptureCallbackC2628f);
        scrollCaptureTargetM2827f.setScrollBounds(AbstractC14334L.m15614C(c7544i));
        consumer.m17405p(scrollCaptureTargetM2827f);
    }
}
