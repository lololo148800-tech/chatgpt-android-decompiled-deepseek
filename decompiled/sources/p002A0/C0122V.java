package p002A0;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import androidx.navigation.AbstractC11122c;
import cd.C11709i;
import com.google.android.material.divider.MaterialDivider;
import com.openai.voice.VoiceModeViewModel;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import com.withpersona.sdk2.inquiry.steps.p688ui.view.ShadowedNestedScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import mm.C17309l;
import mm.C17312o;
import p003A1.AbstractC0168G;
import p003A1.C0229a1;
import p003A1.C0234b2;
import p003A1.C0238c2;
import p003A1.C0256i;
import p003A1.C0260j0;
import p003A1.C0271n;
import p003A1.C0275o0;
import p003A1.C0290t0;
import p003A1.C0296v0;
import p003A1.ChoreographerFrameCallbackC0293u0;
import p003A1.ComponentCallbacks2C0263k0;
import p003A1.ComponentCallbacks2C0266l0;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0255h1;
import p006A4.C0347h;
import p006A4.C0361v;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p045Bj.C1309g;
import p045Bj.C1310h;
import p046Bk.C1375d0;
import p046Bk.C1407s0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p071Ch.C1663C;
import p071Ch.C1682m;
import p074Ck.C1716a;
import p080D0.C1764A0;
import p080D0.C1803f0;
import p080D0.C1809i0;
import p080D0.C1824q;
import p080D0.C1826r;
import p080D0.C1837w0;
import p080D0.InterfaceC1812k;
import p1014t1.C19738o;
import p1081wc.C20887f;
import p1081wc.C20889h;
import p1081wc.EnumC20861G;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1139z0.C21582E0;
import p1143z4.AbstractC21790t;
import p1143z4.C21795y;
import p1143z4.InterfaceC21781k;
import p1155zi.C21984a1;
import p1156zj.C22090C;
import p1156zj.C22177n0;
import p1156zj.InterfaceC22179o;
import p124Ei.C2446D;
import p124Ei.C2531n0;
import p124Ei.C2544t0;
import p178H.C3163p;
import p183H4.C3228c;
import p195Hh.C3430e;
import p204I1.C3581L;
import p224Il.C3741a;
import p310M9.C5311e;
import p322Ml.C5488a;
import p322Ml.C5489b;
import p341Ni.EnumC5802v;
import p349O0.C5950F;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p350O1.InputConnectionC6068q;
import p392Q0.C6546d;
import p425Ra.C6828a;
import p470T4.AbstractC7255t;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p523V9.AbstractC8215v5;
import p537W0.C8410b;
import p544W9.AbstractC8663k4;
import p594Y9.AbstractC9930m3;
import p636a2.C10468e;
import p636a2.C10469f;
import p759g1.C13800b;
import p759g1.C13803e;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p821j1.InterfaceC16039d;
import p841k.C16281a;
import p842k0.C16300i;
import p842k0.C16305n;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p926of.C18146I;
import p926of.C18173j;
import p926of.C18174k;
import p979r2.C18862c;
import p994rk.InterfaceC19129V1;
import p994rk.InterfaceC19201o2;
import ye.C21515d;
import ye.C21525n;

/* JADX INFO: renamed from: A0.V */
/* JADX INFO: loaded from: classes.dex */
public final class C0122V extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f523Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f524Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f525o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0122V(C1375d0 c1375d0, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f523Y = 13;
        this.f524Z = c1375d0;
        this.f525o0 = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX INFO: renamed from: a */
    private final Object m422a(Object obj) {
        C0290t0 c0290t0 = (C0290t0) this.f524Z;
        ChoreographerFrameCallbackC0293u0 choreographerFrameCallbackC0293u0 = (ChoreographerFrameCallbackC0293u0) this.f525o0;
        synchronized (c0290t0.f1046p0) {
            c0290t0.f1048r0.remove(choreographerFrameCallbackC0293u0);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Type inference failed for: r2v45, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        AbstractC11105n abstractC11105nMo7809i;
        InterfaceC0172H0 interfaceC0172H0;
        Intent intent;
        int i10 = -1;
        int i11 = 4;
        int i12 = 3;
        int i13 = 2;
        int i14 = 27;
        boolean z6 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean zContains = true;
        char c9 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        char c15 = 1;
        char c16 = 1;
        switch (this.f523Y) {
            case 0:
                C16300i c16300i = (C16300i) obj;
                C0120T c0120t = (C0120T) this.f525o0;
                boolean z10 = (C3581L.m4267c(c0120t.f499a.m21881c().f67818Z) || !c0120t.f502d || c0120t.f503e || c0120t.f505g) ? false : true;
                C2446D c2446d = new C2446D(c10 == true ? 1 : 0, i14);
                C16305n c16305n = (C16305n) this.f524Z;
                C16300i.m17825b(c16300i, c2446d, z10, new C0121U(c16305n, c0120t, z6 ? 1 : 0));
                C21582E0 c21582e0 = c0120t.f499a;
                C16300i.m17825b(c16300i, new C2446D(i13, i14), (C3581L.m4267c(c21582e0.m21881c().f67818Z) || c0120t.f505g) ? false : true, new C0121U(c16305n, c0120t, c9 == true ? 1 : 0));
                C16300i.m17825b(c16300i, new C2446D(i12, i14), c0120t.m401d(), new C0121U(c16305n, c0120t, i13));
                C16300i.m17825b(c16300i, new C2446D(i11, i14), C3581L.m4268d(c21582e0.m21881c().f67818Z) != c21582e0.m21881c().f67817Y.length(), new C0121U(c16305n, c0120t, i12));
                return C17296C.f55119a;
            case 1:
                Context context = (Context) this.f524Z;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C0263k0 componentCallbacks2C0263k0 = (ComponentCallbacks2C0263k0) this.f525o0;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0263k0);
                return new C0260j0(context, z6 ? 1 : 0, componentCallbacks2C0263k0);
            case 2:
                Context context2 = (Context) this.f524Z;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C0266l0 componentCallbacks2C0266l0 = (ComponentCallbacks2C0266l0) this.f525o0;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C0266l0);
                return new C0260j0(context2, c11 == true ? 1 : 0, componentCallbacks2C0266l0);
            case 3:
                return new C0229a1((InterfaceC0255h1) this.f524Z, new C0130g((C0275o0) this.f525o0, c12 == true ? 1 : 0));
            case 4:
                C0229a1 c0229a1 = (C0229a1) this.f524Z;
                synchronized (c0229a1.f860c) {
                    try {
                        c0229a1.f862e = true;
                        C6546d c6546d = c0229a1.f861d;
                        int i18 = c6546d.f21184o0;
                        if (i18 > 0) {
                            Object[] objArr = c6546d.f21182Y;
                            do {
                                InputConnectionC6068q inputConnectionC6068q = (InputConnectionC6068q) ((WeakReference) objArr[i17]).get();
                                if (inputConnectionC6068q != null && (inputConnection = inputConnectionC6068q.f19765b) != null) {
                                    inputConnectionC6068q.mo6645a(inputConnection);
                                    inputConnectionC6068q.f19765b = null;
                                }
                                i17++;
                            } while (i17 < i18);
                        }
                        c0229a1.f861d.m7104i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ((C0275o0) this.f525o0).f1000Z.f19685a.mo6617d();
                return C17296C.f55119a;
            case 5:
                return m422a(obj);
            case 6:
                ((Choreographer) ((C0296v0) this.f524Z).f1068Z).removeFrameCallback((ChoreographerFrameCallbackC0293u0) this.f525o0);
                return C17296C.f55119a;
            case 7:
                C0271n c0271n = (C0271n) obj;
                C0238c2 c0238c2 = (C0238c2) this.f524Z;
                if (!c0238c2.f884o0) {
                    AbstractC11105n abstractC11105nMo7809i2 = c0271n.f991a.mo7809i();
                    C8410b c8410b = (C8410b) this.f525o0;
                    c0238c2.f886q0 = c8410b;
                    if (c0238c2.f885p0 == null) {
                        c0238c2.f885p0 = abstractC11105nMo7809i2;
                        abstractC11105nMo7809i2.mo7806a(c0238c2);
                    } else if (abstractC11105nMo7809i2.mo7807b().compareTo(EnumC11104m.f33476o0) >= 0) {
                        c0238c2.f883Z.m6573j(new C8410b(new C0234b2(c0238c2, c8410b, c13 == true ? 1 : 0), true, -2000640158));
                    }
                }
                return C17296C.f55119a;
            case 8:
                C21795y c21795y = (C21795y) this.f524Z;
                c21795y.getClass();
                InterfaceC11112u owner = (InterfaceC11112u) this.f525o0;
                AbstractC16544l.m18094g(owner, "owner");
                if (!owner.equals(c21795y.f33544p)) {
                    InterfaceC11112u interfaceC11112u = c21795y.f33544p;
                    C3228c c3228c = c21795y.f33548t;
                    if (interfaceC11112u != null && (abstractC11105nMo7809i = interfaceC11112u.mo7809i()) != null) {
                        abstractC11105nMo7809i.mo7808c(c3228c);
                    }
                    c21795y.f33544p = owner;
                    owner.mo7809i().mo7806a(c3228c);
                }
                return new C0361v(0);
            case 9:
                return new C0260j0((InterfaceC5982V0) this.f524Z, i12, (C0347h) this.f525o0);
            case 10:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                final InterfaceC20904w interfaceC20904w = (InterfaceC20904w) this.f525o0;
                InterfaceC21781k interfaceC21781k = new InterfaceC21781k() { // from class: Bc.m
                    @Override // p1143z4.InterfaceC21781k
                    /* JADX INFO: renamed from: a */
                    public final void mo1946a(AbstractC11122c abstractC11122c, AbstractC21790t destination, Bundle bundle) {
                        AbstractC16544l.m18094g(abstractC11122c, "<anonymous parameter 0>");
                        AbstractC16544l.m18094g(destination, "destination");
                        String str = destination.f69136s0;
                        if (str == null) {
                            str = "unknown";
                        }
                        interfaceC20904w.mo21447a(C20887f.f66539n, AbstractC0168G.m535x("route", str));
                    }
                };
                AbstractC11122c abstractC11122c = (AbstractC11122c) this.f524Z;
                abstractC11122c.m12183b(interfaceC21781k);
                return new C0260j0(abstractC11122c, i11, interfaceC21781k);
            case 11:
                Object obj2 = ((C17312o) obj).f55139Y;
                Throwable thM18979a = C17312o.m18979a(obj2);
                C22177n0 c22177n0 = (C22177n0) this.f524Z;
                if (thM18979a == null) {
                    return AbstractC8215v5.m8840b(new C0146w(c22177n0, (InterfaceC22179o) this.f525o0, (C22090C) obj2, i11));
                }
                String message = thM18979a.getMessage();
                return (message == null || !AbstractC21322p.m21667A(message, "ENOSPC", false)) ? AbstractC8215v5.m8840b(new C1310h(c22177n0, z6 ? 1 : 0)) : AbstractC8215v5.m8840b(C1309g.f3459Y);
            case 12:
                C0794y0 insets = (C0794y0) obj;
                AbstractC16544l.m18094g(insets, "insets");
                C0790w0 c0790w0 = insets.f2209a;
                C18862c c18862cMo1755g = c0790w0.mo1755g(7);
                AbstractC16544l.m18093f(c18862cMo1755g, "getInsetsIgnoringVisibility(...)");
                C18862c c18862cMo1754f = c0790w0.mo1754f(8);
                AbstractC16544l.m18093f(c18862cMo1754f, "getInsets(...)");
                int i19 = c18862cMo1754f.f60089d;
                int i20 = c18862cMo1755g.f60089d;
                int iMax = Math.max(i20, i19);
                View view = (View) ((C5311e) this.f524Z).f17486p0;
                C1375d0 c1375d0 = (C1375d0) this.f525o0;
                int i21 = c18862cMo1755g.f60087b;
                int i22 = c18862cMo1755g.f60086a;
                int i23 = c18862cMo1755g.f60088c;
                if (view == null) {
                    c1375d0.f3648a.f4915j.setPadding(i22, i21, i23, iMax);
                } else {
                    ShadowedNestedScrollView nestedScroll = c1375d0.f3648a.f4915j;
                    AbstractC16544l.m18093f(nestedScroll, "nestedScroll");
                    nestedScroll.setPadding(i22, i21, i23, nestedScroll.getPaddingBottom());
                    view.setPadding(i22, view.getPaddingTop(), i23, iMax);
                }
                MaterialDivider footerDivider = c1375d0.f3648a.f4909d;
                AbstractC16544l.m18093f(footerDivider, "footerDivider");
                ViewGroup.LayoutParams layoutParams = footerDivider.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i20;
                footerDivider.setLayoutParams(marginLayoutParams);
                CoordinatorLayout footerSheetCoordinatorLayout = c1375d0.f3648a.f4911f;
                AbstractC16544l.m18093f(footerSheetCoordinatorLayout, "footerSheetCoordinatorLayout");
                footerSheetCoordinatorLayout.setPadding(i22, footerSheetCoordinatorLayout.getPaddingTop(), i23, iMax);
                return C17296C.f55119a;
            case 13:
                List selectedItems = (List) obj;
                AbstractC16544l.m18094g(selectedItems, "selectedItems");
                C1375d0 c1375d1 = (C1375d0) this.f524Z;
                c1375d1.f3648a.f4914i.getBackButton().setEnabled(true);
                C1716a c1716a = c1375d1.f3648a;
                c1716a.f4914i.setImportantForAccessibility(1);
                c1716a.f4917l.setImportantForAccessibility(1);
                if (!selectedItems.isEmpty()) {
                    ((AbstractC16546n) this.f525o0).invoke(selectedItems);
                }
                return C17296C.f55119a;
            case 14:
                InterfaceC19201o2 it = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it, "it");
                ((C1407s0) this.f524Z).f3766q.invoke((InterfaceC19129V1) this.f525o0, it);
                return C17296C.f55119a;
            case 15:
                Uri uri = (Uri) obj;
                AbstractC16544l.m18094g(uri, "uri");
                C3163p c3163p = (C3163p) ((InterfaceC5985X) this.f525o0).getValue();
                AbstractC16544l.m18093f(c3163p, "access$CameraPreview$lambda$1(...)");
                ((InterfaceC1439n) this.f524Z).invoke(uri, c3163p.equals(C3163p.f9511b) ? EnumC20861G.FrontCamera : EnumC20861G.BackCamera);
                return C17296C.f55119a;
            case 16:
                C10468e constrainAs = (C10468e) obj;
                AbstractC16544l.m18094g(constrainAs, "$this$constrainAs");
                AbstractC7255t.m7697e(constrainAs.f31001d, ((C10469f) this.f524Z).f31006b, 0.0f, 6);
                C10468e.m10938a(constrainAs, (C10469f) this.f525o0);
                return C17296C.f55119a;
            case 17:
                InterfaceC16039d drawBehind = (InterfaceC16039d) obj;
                AbstractC16544l.m18094g(drawBehind, "$this$drawBehind");
                InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) this.f524Z;
                int iFloor = (int) Math.floor(((Number) interfaceC5982V0.getValue()).floatValue());
                int i24 = 1 + iFloor;
                float f10 = iFloor;
                float fFloatValue = ((Number) interfaceC5982V0.getValue()).floatValue() - f10;
                float fMo7864b0 = drawBehind.mo7864b0(AbstractC7313q.f23200e) * f10;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) this.f525o0;
                float fM19372v0 = AbstractC17680n.m19372v0(AbstractC17680n.m19373w0((List) interfaceC5985X.getValue(), iFloor));
                float fM19372v1 = AbstractC17680n.m19372v0(AbstractC17680n.m19373w0((List) interfaceC5985X.getValue(), i24));
                float fIntValue = ((Number) ((List) interfaceC5985X.getValue()).get(iFloor)).intValue();
                Integer num = (Integer) AbstractC17680n.m19344T(i24, (List) interfaceC5985X.getValue());
                float fIntValue2 = num != null ? num.intValue() : ((Number) AbstractC17680n.m19351a0((List) interfaceC5985X.getValue())).intValue();
                float fMo7864b1 = drawBehind.mo7864b0(3);
                AbstractC14376f.m15850p(drawBehind, C14365u.f45052b, AbstractC8088f6.m8536b(AbstractC9930m3.m10589c(fM19372v0 + fMo7864b0, fM19372v1, fFloatValue), C13803e.m15331c(drawBehind.mo17602i()) - fMo7864b1), AbstractC8112i6.m8603a(AbstractC9930m3.m10589c(fIntValue, fIntValue2, fFloatValue), fMo7864b1), 0.0f, 120);
                return C17296C.f55119a;
            case 18:
                Throwable e10 = (Throwable) obj;
                AbstractC16544l.m18094g(e10, "e");
                boolean z11 = e10 instanceof RemoteException;
                if (!z11) {
                    if (e10 instanceof C6828a) {
                        zContains = C1663C.f4699k.contains(Integer.valueOf(((C6828a) e10).f62870Y.f36052Y));
                    } else {
                        zContains = e10 instanceof C1682m ? C1663C.f4699k.contains(Integer.valueOf(((C1682m) e10).f4762Y.f62870Y.f36052Y)) : false;
                    }
                }
                if (zContains) {
                    if (z11) {
                        i16 = 998;
                    } else if (e10 instanceof C6828a) {
                        i16 = ((C6828a) e10).f62870Y.f36052Y;
                    } else if (e10 instanceof C1682m) {
                        i16 = ((C1682m) e10).f4762Y.f62870Y.f36052Y;
                    }
                    C1663C c1663c = (C1663C) this.f524Z;
                    InterfaceC20904w interfaceC20904w2 = c1663c.f4704e;
                    C20889h c20889h = C20889h.f66551g;
                    C17309l c17309l = new C17309l("error_code", Integer.valueOf(i16));
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.f525o0;
                    interfaceC20904w2.mo21447a(c20889h, AbstractC17659D.m19249k(linkedHashMap, c17309l));
                    c1663c.f4705f.mo4188c("Retrying Play Integrity token generation", e10, c1663c.m2497d(linkedHashMap));
                }
                return Boolean.valueOf(zContains);
            case 19:
                C19738o c19738o = (C19738o) obj;
                if (((InterfaceC1812k) this.f524Z).mo461g(c19738o.f62480c, (C1826r) this.f525o0)) {
                    c19738o.m20691a();
                }
                return C17296C.f55119a;
            case 20:
                C19738o c19738o2 = (C19738o) obj;
                if (((C0138o) this.f524Z).mo461g(c19738o2.f62480c, (C1826r) this.f525o0)) {
                    c19738o2.m20691a();
                }
                return C17296C.f55119a;
            case 21:
                C1824q c1824q = (C1824q) obj;
                ((C1803f0) this.f524Z).m2601m(c1824q);
                ((InterfaceC1436k) this.f525o0).invoke(c1824q);
                return C17296C.f55119a;
            case 22:
                C16300i c16300i2 = (C16300i) obj;
                C1803f0 c1803f0 = (C1803f0) this.f525o0;
                boolean zM2596h = c1803f0.m2596h();
                C2446D c2446d2 = new C2446D(i13, i14);
                C16305n c16305n2 = (C16305n) this.f524Z;
                C16300i.m17825b(c16300i2, c2446d2, zM2596h, new C1809i0(c16305n2, c1803f0, z6 ? 1 : 0));
                C17296C c17296c = C17296C.f55119a;
                C16300i.m17825b(c16300i2, new C2446D(i11, i14), !c1803f0.m2594f(), new C1809i0(c16305n2, c1803f0, c14 == true ? 1 : 0));
                AbstractC17681o.m19382k(c17296c, c17296c);
                return c17296c;
            case 23:
                C16300i c16300i3 = (C16300i) obj;
                C1837w0 c1837w0 = (C1837w0) this.f525o0;
                boolean zM4267c = C3581L.m4267c(c1837w0.m2686j().f19683b);
                C6002f0 c6002f0 = c1837w0.f5314j;
                boolean z12 = !zM4267c && ((Boolean) c6002f0.getValue()).booleanValue();
                C2446D c2446d3 = new C2446D(c16 == true ? 1 : 0, i14);
                C16305n c16305n3 = (C16305n) this.f524Z;
                C16300i.m17825b(c16300i3, c2446d3, z12, new C1764A0(c16305n3, c1837w0, z6 ? 1 : 0));
                C16300i.m17825b(c16300i3, new C2446D(i13, i14), !zM4267c, new C1764A0(c16305n3, c1837w0, c15 == true ? 1 : 0));
                C16300i.m17825b(c16300i3, new C2446D(i12, i14), ((Boolean) c6002f0.getValue()).booleanValue() && (interfaceC0172H0 = c1837w0.f5310f) != null && ((C0256i) interfaceC0172H0).m826b(), new C1764A0(c16305n3, c1837w0, i13));
                C16300i.m17825b(c16300i3, new C2446D(i11, i14), C3581L.m4268d(c1837w0.m2686j().f19683b) != c1837w0.m2686j().f19682a.f10934Y.length(), new C1764A0(c16305n3, c1837w0, i12));
                return C17296C.f55119a;
            case 24:
                C18174k data = (C18174k) obj;
                AbstractC16544l.m18094g(data, "data");
                ArrayList arrayList = (ArrayList) this.f525o0;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (AbstractC16544l.m18089b(((C18173j) it2.next()).f57968a, data.f57980c)) {
                        i10 = i15;
                        ((InterfaceC1436k) this.f524Z).invoke(new C18146I(arrayList, i10, 8));
                        return C17296C.f55119a;
                    }
                    i15++;
                }
                ((InterfaceC1436k) this.f524Z).invoke(new C18146I(arrayList, i10, 8));
                return C17296C.f55119a;
            case 25:
                long j10 = ((C13800b) obj).f43584a;
                ((C16556x) this.f524Z).f51285Y = true;
                ((InterfaceC1436k) this.f525o0).invoke(new C2544t0(true));
                return C17296C.f55119a;
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    ((InterfaceC1426a) this.f524Z).invoke();
                    ((C11709i) this.f525o0).m13031a();
                }
                return C17296C.f55119a;
            case 27:
                C16281a result = (C16281a) obj;
                AbstractC16544l.m18094g(result, "result");
                if (result.f50448Y == -1 && (intent = result.f50449Z) != null) {
                    C3430e c3430e = VoiceModeForegroundService.f40396o0;
                    AbstractC8663k4.m9357c((Context) this.f524Z, EnumC5802v.f18950Z);
                    ((VoiceModeViewModel) this.f525o0).m14395k(new C2531n0(intent));
                }
                return C17296C.f55119a;
            case 28:
                ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) obj;
                AbstractC16544l.m18094g(networkCallback, "networkCallback");
                C5488a c5488a = new C5488a(networkCallback, (C5489b) this.f524Z);
                ((C3741a) this.f525o0).m4434a(c5488a);
                return c5488a;
            default:
                C21515d setState = (C21515d) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                String str = (String) this.f524Z;
                return C21515d.m21794a(setState, (C21525n) this.f525o0, AbstractC17681o.m19383l(str != null ? new C21984a1(str) : null), false, null, false, 28);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122V(C1837w0 c1837w0, C16305n c16305n) {
        super(1);
        this.f523Y = 23;
        this.f525o0 = c1837w0;
        this.f524Z = c16305n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122V(InterfaceC5982V0 interfaceC5982V0, InterfaceC5985X interfaceC5985X) {
        super(1);
        this.f523Y = 17;
        float f10 = AbstractC7313q.f23196a;
        this.f524Z = interfaceC5982V0;
        this.f525o0 = interfaceC5985X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0122V(Object obj, int i10, Object obj2) {
        super(1);
        this.f523Y = i10;
        this.f524Z = obj;
        this.f525o0 = obj2;
    }
}
