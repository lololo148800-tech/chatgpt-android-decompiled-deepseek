package p046Bk;

import android.app.Activity;
import android.os.Build;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p002A0.C0102A;
import p003A1.C0260j0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1025te.C19866Q;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21068W;
import p1128yg.C21539c;
import p1140z1.C21660F;
import p349O0.C5950F;
import p349O0.InterfaceC5985X;
import p507Uh.InterfaceC7678d;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8215v5;
import p531Vj.C8340J;
import p531Vj.C8351V;
import p531Vj.C8361c0;
import p531Vj.C8365e0;
import p531Vj.C8385x;
import p531Vj.EnumC8363d0;
import p571X9.AbstractC9165L2;
import p604Yk.C10077b;
import p729ej.C13421l;
import p729ej.C13430u;
import p774h1.C14351g;
import p774h1.C14356l;
import p775h2.AbstractC14376f;
import p821j1.C16037b;
import p893n.AbstractActivityC17375g;
import p909nm.C17690x;
import p936p0.C18273m;

/* JADX INFO: renamed from: Bk.F0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1325F0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3496Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f3497Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3498o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f3499p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f3500q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1325F0(Object obj, Object obj2, boolean z6, Object obj3, int i10) {
        super(1);
        this.f3496Y = i10;
        this.f3498o0 = obj;
        this.f3499p0 = obj2;
        this.f3497Z = z6;
        this.f3500q0 = obj3;
    }

    /* JADX WARN: Type inference failed for: r11v30, types: [yg.b] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3496Y) {
            case 0:
                C8340J it = (C8340J) obj;
                AbstractC16544l.m18094g(it, "it");
                C13421l c13421l = (C13421l) this.f3499p0;
                boolean z6 = this.f3497Z;
                AbstractC1391k0 abstractC1391k0 = (AbstractC1391k0) this.f3500q0;
                C1360X0 c1360x0 = (C1360X0) this.f3498o0;
                return AbstractC8215v5.m8839a(c1360x0, new C0102A(it, c13421l, c1360x0, z6, abstractC1391k0, 1));
            case 1:
                C21660F c21660f = (C21660F) obj;
                c21660f.m22080a();
                if (((Boolean) ((InterfaceC1426a) this.f3498o0).invoke()).booleanValue()) {
                    boolean z10 = this.f3497Z;
                    C14356l c14356l = (C14356l) this.f3500q0;
                    C14351g c14351g = (C14351g) this.f3499p0;
                    if (z10) {
                        C16037b c16037b = c21660f.f68674Y;
                        long jMo17604o0 = c16037b.mo17604o0();
                        C13711h c13711h = c16037b.f49479Z;
                        long jM15202x = c13711h.m15202x();
                        c13711h.m15196m().mo15706e();
                        try {
                            ((C10077b) c13711h.f43259Z).m10664L(-1.0f, 1.0f, jMo17604o0);
                            AbstractC14376f.m15844j(c21660f, c14351g, c14356l);
                        } finally {
                            AbstractC12107L1.m13830u(c13711h, jM15202x);
                        }
                    } else {
                        AbstractC14376f.m15844j(c21660f, c14351g, c14356l);
                    }
                }
                return C17296C.f55119a;
            case 2:
                ((Boolean) obj).booleanValue();
                AbstractC9165L2.m9715b((InterfaceC7678d) this.f3498o0, this.f3497Z, (InterfaceC1436k) this.f3499p0, (InterfaceC5985X) this.f3500q0);
                return C17296C.f55119a;
            case 3:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                boolean z11 = this.f3497Z;
                C8361c0 c8361c0 = (C8361c0) this.f3498o0;
                if (z11) {
                    C8361c0.m8936e(c8361c0, action, new C8365e0(((C8351V) this.f3500q0).f26006a, EnumC8363d0.f26047Z));
                } else {
                    ((C13421l) this.f3499p0).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8361c0, C8385x.f26099u0));
                }
                return C17296C.f55119a;
            case 4:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                boolean z12 = ((InterfaceC11112u) this.f3498o0).mo7809i().mo7807b().compareTo(EnumC11104m.f33477p0) >= 0;
                AbstractActivityC17375g owner = (AbstractActivityC17375g) this.f3500q0;
                final C21539c c21539c = (C21539c) this.f3499p0;
                if (z12 && !this.f3497Z) {
                    if (c21539c != null) {
                        AbstractC16544l.m18094g(owner, "owner");
                        if (c21539c.f68223b == null && Build.VERSION.SDK_INT >= 34) {
                            ?? r11 = new Activity.ScreenCaptureCallback() { // from class: yg.b
                                @Override // android.app.Activity.ScreenCaptureCallback
                                public final void onScreenCaptured() {
                                    c21539c.f68224c.mo3231f(C17296C.f55119a);
                                }
                            };
                            try {
                                owner.registerScreenCaptureCallback(owner.getMainExecutor(), r11);
                            } catch (IllegalStateException e10) {
                                AbstractC8160o6.m8727b(c21539c.f68222a, "Failed to register screen capture callback", e10, 4);
                            }
                            c21539c.f68223b = r11;
                        }
                    }
                    break;
                } else if (c21539c != null) {
                    c21539c.m21826a(owner);
                }
                return new C0260j0(c21539c, 9, owner);
            case 5:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ((InterfaceC20904w) this.f3498o0).mo21448b(C20857C.f66321c, bool, C17690x.f56481Y);
                boolean z13 = false;
                boolean z14 = this.f3497Z && !((C19866Q) this.f3499p0).m20785h();
                if (zBooleanValue && z14) {
                    z13 = true;
                }
                ((InterfaceC5985X) this.f3500q0).setValue(Boolean.valueOf(z13));
                return C17296C.f55119a;
            default:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                ArrayList arrayList = (ArrayList) this.f3498o0;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    C18273m c18273m = (C18273m) this.f3499p0;
                    boolean z15 = this.f3497Z;
                    if (i10 >= size) {
                        if (c18273m != null) {
                            c18273m.m19820l(abstractC21068W, z15);
                        }
                        ((InterfaceC5985X) this.f3500q0).getValue();
                        return C17296C.f55119a;
                    }
                    C18273m c18273m2 = (C18273m) arrayList.get(i10);
                    if (c18273m2 != c18273m) {
                        c18273m2.m19820l(abstractC21068W, z15);
                    }
                    i10++;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1325F0(Object obj, boolean z6, Object obj2, Object obj3, int i10) {
        super(1);
        this.f3496Y = i10;
        this.f3498o0 = obj;
        this.f3497Z = z6;
        this.f3499p0 = obj2;
        this.f3500q0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325F0(boolean z6, C8361c0 c8361c0, C8351V c8351v, C13421l c13421l) {
        super(1);
        this.f3496Y = 3;
        this.f3497Z = z6;
        this.f3498o0 = c8361c0;
        this.f3500q0 = c8351v;
        this.f3499p0 = c13421l;
    }
}
