package p045Bj;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11097f;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputDateComponent;
import ge.C14111x0;
import gf.AbstractC14118c;
import gf.C14127l;
import gf.C14130o;
import io.ktor.client.plugins.auth.AbstractC15064i;
import io.sentry.android.navigation.SentryNavigationListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import mm.EnumC17307j;
import mm.InterfaceC17306i;
import np.InterfaceC17710b;
import p003A1.C0251g0;
import p003A1.C0254h0;
import p003A1.C0260j0;
import p006A4.C0362w;
import p008A6.C0383c;
import p008A6.C0386f;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p042Bf.C1278t;
import p042Bf.C1281w;
import p046Bk.AbstractC1391k0;
import p046Bk.C1347Q0;
import p046Bk.C1348R0;
import p046Bk.C1350S0;
import p046Bk.C1360X0;
import p046Bk.C1371c;
import p046Bk.C1381f0;
import p046Bk.C1382g;
import p046Bk.C1383g0;
import p046Bk.C1393l0;
import p046Bk.C1420z;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1009s9.C19506i;
import p100Dk.C2087n;
import p100Dk.C2093t;
import p100Dk.InterfaceC2094u;
import p103Dn.C2146N;
import p103Dn.C2219z0;
import p1081wc.C20864J;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21075b0;
import p1095x1.C21081e0;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1139z0.C21585H;
import p1143z4.C21795y;
import p1155zi.EnumC21895B;
import p1156zj.C22153f0;
import p1156zj.C22177n0;
import p1156zj.C22195t0;
import p124Ei.AbstractC2511g1;
import p124Ei.C2456I;
import p124Ei.C2494b;
import p124Ei.C2500d;
import p124Ei.EnumC2444C;
import p126Ek.AbstractC2571d;
import p126Ek.C2569b;
import p126Ek.C2570c;
import p126Ek.C2574g;
import p140Fa.C2685e;
import p168Gd.C3034b;
import p225Im.C3743B;
import p225Im.InterfaceC3759g;
import p229J0.C4171z3;
import p247Jj.AbstractC4379E;
import p247Jj.AbstractC4402P0;
import p247Jj.AbstractC4433h0;
import p247Jj.C4390J0;
import p247Jj.C4398N0;
import p247Jj.C4439k0;
import p247Jj.InterfaceC4396M0;
import p249Jl.SurfaceHolderCallbackC4482b;
import p269Kh.C4688o;
import p270Ki.C4700a;
import p296Lk.AbstractC5105b;
import p296Lk.C5109f;
import p296Lk.C5113j;
import p296Lk.C5115l;
import p296Lk.C5117n;
import p321Mk.C5464b;
import p321Mk.C5475m;
import p321Mk.C5476n;
import p324Mn.C5521B;
import p349O0.C5950F;
import p349O0.C5996c0;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p364Oh.C6226E;
import p387Pl.C6501u;
import p392Q0.C6546d;
import p403Qd.AbstractC6601G;
import p407Qh.InterfaceC6731a;
import p409Qk.C6754e;
import p457Sh.C7133a;
import p457Sh.C7136d;
import p482Tg.C7439X;
import p482Tg.C7442a;
import p492U1.C7543h;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p508Uj.AbstractC7701i;
import p508Uj.C7697e;
import p508Uj.C7698f;
import p508Uj.C7700h;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8111i5;
import p523V9.AbstractC8114j0;
import p523V9.AbstractC8215v5;
import p530Vi.AbstractC8301I;
import p531Vj.C8351V;
import p531Vj.C8352W;
import p531Vj.C8361c0;
import p531Vj.C8365e0;
import p531Vj.C8382u;
import p531Vj.EnumC8363d0;
import p537W0.C8410b;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8553S2;
import p552Wg.C8847i;
import p553Wh.C8870f;
import p556Wk.AbstractC8927i;
import p556Wk.C8926h;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9227W;
import p594Y9.AbstractC9930m3;
import p635a1.InterfaceC10446d;
import p647ak.AbstractC10712k0;
import p647ak.AbstractC10739y;
import p647ak.C10669T0;
import p647ak.C10670U;
import p647ak.C10676X;
import p647ak.C10692d0;
import p647ak.C10696e1;
import p647ak.C10704h0;
import p647ak.C10725r;
import p647ak.C10730t0;
import p658b5.C11242m;
import p676c7.C11682a;
import p676c7.C11683b;
import p676c7.C11688g;
import p677c8.C11689a;
import p722e8.C13315Z;
import p722e8.C13329m;
import p729ej.AbstractC13422m;
import p729ej.C13421l;
import p729ej.C13430u;
import p729ej.InterfaceC13410a;
import p729ej.InterfaceC13427r;
import p749fd.AbstractC13620e;
import p749fd.C13625j;
import p758g0.AbstractC13758e;
import p758g0.C13733I;
import p758g0.C13736L;
import p758g0.C13756d;
import p758g0.C13757d0;
import p758g0.C13770k;
import p758g0.C13774m;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.C14336N;
import p774h1.C14343V;
import p836jh.C16210b;
import p855kj.AbstractC16428g;
import p858ko.C16484C;
import p858ko.C16499b;
import p858ko.C16503f;
import p860l0.C16684J;
import p860l0.InterfaceC16694M0;
import p878lo.C17092a;
import p882m1.clb.WGTYqNchEpHca;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p911o0.AbstractC17792x;
import p919o8.C17882B;
import p919o8.C17885C;
import p919o8.C17891E;
import p919o8.C17897G;
import p919o8.C17953a;
import p919o8.C17959c;
import p919o8.C17965e;
import p919o8.C17968f;
import p919o8.C17977i;
import p919o8.C17989m;
import p919o8.C17992n;
import p919o8.C17995o;
import p919o8.C18004r;
import p919o8.C18007s;
import p919o8.C18013u;
import p919o8.C18022x;
import p919o8.C18025y;
import p926of.C18152O;
import p936p0.C18265e;
import p948pi.C18422e;
import p953q0.C18553K;
import p953q0.C18566Y;
import p953q0.InterfaceC18587j0;
import p960q9.C18655i;
import p993rj.C19033M;
import p993rj.EnumC19034N;
import p994rk.C19067A1;
import p994rk.C19207q0;
import p994rk.InterfaceC19132W1;
import p994rk.InterfaceC19135X1;
import p994rk.InterfaceC19138Y1;
import p994rk.InterfaceC19150c;
import p994rk.InterfaceC19154d;
import p994rk.InterfaceC19161e2;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19229w;
import p994rk.InterfaceC19240z1;
import sk.C19664c;

/* JADX INFO: renamed from: Bj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C1307e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3449Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f3450Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3451o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f3452p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f3453q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307e(C1313k c1313k, C22177n0 c22177n0, C22195t0 c22195t0, C13421l c13421l) {
        super(1);
        this.f3449Y = 1;
        this.f3452p0 = c1313k;
        this.f3453q0 = c22177n0;
        this.f3450Z = c22195t0;
        this.f3451o0 = c13421l;
    }

    /* JADX INFO: renamed from: a */
    private final Object m2011a(Object obj) {
        long j10 = ((C13800b) obj).f43584a;
        long jM15319f = ((C13801c) this.f3452p0).m15319f();
        C16499b zoom = (C16499b) this.f3450Z;
        AbstractC16544l.m18094g(zoom, "zoom");
        C13801c c13801cM8568b = AbstractC8096g6.m8568b(j10, AbstractC21075b0.m21571l(jM15319f, zoom.m18063a()));
        C21585H c21585h = C16484C.f51133q;
        ((C16484C) this.f3451o0).getClass();
        if (c13801cM8568b.m15319f() == 9205357640488583168L) {
            throw new IllegalStateException("The zoomable content is too large to safely calculate its draw region. This can happen if you're using an unusually large value for ZoomSpec#maxZoomFactor (for e.g., Float.MAX_VALUE). Please file an issue on https://github.com/saket/telephoto/issues if you think this is a mistake.");
        }
        C16503f c16503f = (C16503f) this.f3453q0;
        InterfaceC10446d alignment = c16503f.f51191e;
        AbstractC16544l.m18094g(alignment, "alignment");
        EnumC7546k layoutDirection = c16503f.f51192f;
        AbstractC16544l.m18094g(layoutDirection, "layoutDirection");
        long j11 = c16503f.f51187a;
        if (j11 == 9205357640488583168L) {
            throw new IllegalStateException("Whoops Modifier.zoomable() is not supposed to handle gestures yet. Please file an issue on https://github.com/saket/telephoto/issues?");
        }
        InterfaceC17306i interfaceC17306iM9799b = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C17092a(alignment, c13801cM8568b, j11, layoutDirection));
        c13801cM8568b.m15320g();
        return new C13800b(C13800b.m15300a(c13801cM8568b.m15321h() >= C13803e.m15333e(j11) ? AbstractC8301I.m8920k(C13800b.m15306g(c13801cM8568b.m15320g()), AbstractC8301I.m8917h(C13803e.m15333e(j11) - c13801cM8568b.m15321h(), 0.0f), 0.0f) : (int) (((C7543h) interfaceC17306iM9799b.getValue()).f23897a >> 32), c13801cM8568b.m15318e() >= C13803e.m15331c(j11) ? AbstractC8301I.m8920k(C13800b.m15307h(c13801cM8568b.m15320g()), AbstractC8301I.m8917h(C13803e.m15331c(j11) - c13801cM8568b.m15318e(), 0.0f), 0.0f) : (int) (((C7543h) interfaceC17306iM9799b.getValue()).f23897a & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    private final Object m2012b(Object obj) {
        C18265e LazyColumn = (C18265e) obj;
        AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
        List list = (List) this.f3451o0;
        if (list == null) {
            list = C17689w.f56480Y;
        }
        List list2 = list;
        int i10 = 8;
        LazyColumn.m19803p(list2.size(), null, new C1278t(21, list2), new C8410b(new C2456I(i10, (C4688o) this.f3452p0, (InterfaceC1426a) this.f3450Z, (InterfaceC1436k) this.f3453q0, list2), true, -632812321));
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307e(C8382u c8382u, C13421l c13421l, C8361c0 c8361c0, C8351V c8351v) {
        super(1);
        this.f3449Y = 13;
        this.f3452p0 = c8382u;
        this.f3451o0 = c13421l;
        this.f3450Z = c8361c0;
        this.f3453q0 = c8351v;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x061d  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String str;
        boolean z6;
        int i10 = 10;
        int i11 = 11;
        int i12 = 3;
        int i13 = 1;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f3451o0;
        Object obj3 = this.f3453q0;
        Object obj4 = this.f3450Z;
        Object obj5 = this.f3452p0;
        switch (this.f3449Y) {
            case 0:
                Throwable error = (Throwable) obj;
                AbstractC16544l.m18094g(error, "error");
                C13421l c13421l = (C13421l) obj2;
                c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8840b(new C0362w((C22153f0) obj5, (C22195t0) obj4, error, c13421l, (C2685e) obj3, 2)));
                return c17296c;
            case 1:
                AbstractC2571d it = (AbstractC2571d) obj;
                AbstractC16544l.m18094g(it, "it");
                C1313k c1313k = (C1313k) obj5;
                C19033M c19033mM8614e = AbstractC8114j0.m8614e((Context) c1313k.f3467b, EnumC19034N.f60679Y);
                C13421l c13421l2 = (C13421l) obj2;
                if (it instanceof C2570c) {
                    return AbstractC8215v5.m8840b(new C0254h0(c1313k, c19033mM8614e, it, (C22177n0) obj3, (C22195t0) obj4, c13421l2));
                }
                if (it instanceof C2569b) {
                    return AbstractC8215v5.m8840b(new C1311i(c13421l2, 2));
                }
                throw new C0644w();
            case 2:
                InterfaceC19201o2 component = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(component, "component");
                C1420z c1420z = ((C1360X0) obj5).f3606h;
                C1383g0 renderState = (C1383g0) ((AbstractC1391k0) obj3);
                C1393l0 renderProps = (C1393l0) obj4;
                AbstractC16544l.m18094g(renderProps, "renderProps");
                AbstractC16544l.m18094g(renderState, "renderState");
                C13421l c13421l3 = (C13421l) obj2;
                if (component instanceof InterfaceC19138Y1) {
                    C2574g c2574g = new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) ((InterfaceC19138Y1) component).getTextController().f33997Z);
                    String name = component.getName();
                    C1382g c1382g = new C1382g(renderState, component, c1420z, 6);
                    C3743B c3743b = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), name, c1382g);
                } else if (component instanceof InterfaceC19240z1) {
                    C2146N c2146n = (C2146N) ((InterfaceC19240z1) component).mo20299b().f47946Z;
                    C3743B c3743b2 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C19067A1.class))), c2146n), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C19067A1.class))))), component.getName(), new C1382g(renderState, component, c1420z, i10));
                } else if (component instanceof InterfaceC19161e2) {
                    C2146N c2146n2 = (C2146N) ((InputCheckboxGroupComponent) ((InterfaceC19161e2) component)).stringSetController.f62330o0;
                    C3743B c3743b3 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18076d(Set.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), c2146n2), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18076d(Set.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))))), component.getName(), new C1382g(renderState, component, c1420z, i11));
                } else if (component instanceof InterfaceC19150c) {
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) ((InterfaceC19150c) component);
                    C2146N c2146n3 = (C2146N) inputAddressComponent.f40939y0.f68345o0;
                    Class cls = Boolean.TYPE;
                    C2574g c2574g2 = new C2574g(AbstractC16526C.m18075c(cls), c2146n3);
                    String strM11052j = AbstractC10763a.m11052j(component.getName(), "UpdateCollapsedState");
                    C1371c c1371c = new C1371c(renderState, component, 5);
                    C3743B c3743b4 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g2, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(cls))), strM11052j, c1371c);
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) inputAddressComponent.textControllerForAddressStreet1.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(component.getName(), "UpdateAddressStreet1"), new C1382g(renderState, component, c1420z, 12));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) inputAddressComponent.textControllerForAddressStreet2.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(component.getName(), "UpdateAddressStreet2"), new C1382g(renderState, component, c1420z, 13));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) inputAddressComponent.textControllerForAddressCity.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(component.getName(), "UpdateAddressCity"), new C1382g(renderState, component, c1420z, 14));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) inputAddressComponent.textControllerForAddressSubdivision.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(component.getName(), "UpdateAddressSubdivision"), new C1382g(renderState, component, c1420z, 15));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) inputAddressComponent.textControllerForAddressPostalCode.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(component.getName(), "UpdateAddressPostalCode"), new C1382g(renderState, component, c1420z, 16));
                    if (component instanceof InputAddressComponent) {
                        InputAddressComponent inputAddressComponent2 = (InputAddressComponent) component;
                        String str2 = inputAddressComponent2.f40933s0;
                        String sessionToken = renderProps.f3707a;
                        if (str2 != null) {
                            C18655i c18655i = c1420z.f3800a;
                            AbstractC16544l.m18094g(sessionToken, "sessionToken");
                            AbstractC8215v5.m8843e(c13421l3, new C2087n(sessionToken, component, str2, (InterfaceC2094u) c18655i.f59414Z), AbstractC16526C.m18075c(C2087n.class), ((InputAddressComponent) component).getName(), new C1371c(renderState, component, 0));
                        }
                        String str3 = inputAddressComponent2.f40935u0;
                        if (str3 != null) {
                            C19506i c19506i = c1420z.f3801b;
                            AbstractC16544l.m18094g(sessionToken, "sessionToken");
                            AbstractC8215v5.m8843e(c13421l3, new C2093t(sessionToken, str3, (InterfaceC2094u) c19506i.f61960Z), AbstractC16526C.m18075c(C2093t.class), "", new C1371c(renderState, component, i13));
                        }
                    }
                } else if (component instanceof InterfaceC19132W1) {
                    C2146N c2146n4 = (C2146N) ((InputCheckboxComponent) ((InterfaceC19132W1) component)).twoStateViewController.f68345o0;
                    Class cls2 = Boolean.TYPE;
                    C2574g c2574g3 = new C2574g(AbstractC16526C.m18075c(cls2), c2146n4);
                    String name2 = component.getName();
                    C1371c c1371c2 = new C1371c(renderState, component, 2);
                    C3743B c3743b5 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g3, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(cls2))), name2, c1371c2);
                } else if (component instanceof InterfaceC19135X1) {
                    C2574g c2574g4 = new C2574g(AbstractC16526C.m18074b(Number.class), (C2146N) ((InterfaceC19135X1) component).getNumberController().f34082o0);
                    String name3 = component.getName();
                    C1382g c1382g2 = new C1382g(renderState, component, c1420z, 0);
                    C3743B c3743b6 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g4, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18074b(Number.class))), name3, c1382g2);
                } else if (component instanceof InterfaceC19154d) {
                    C2574g c2574g5 = new C2574g(AbstractC16526C.m18074b(Bitmap.class), (C2146N) ((ESignatureComponent) ((InterfaceC19154d) component)).bitmapController.f62321Z);
                    String name4 = component.getName();
                    C1371c c1371c3 = new C1371c(renderState, component, i12);
                    C3743B c3743b7 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g5, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18074b(Bitmap.class))), name4, c1371c3);
                } else if (component instanceof InterfaceC19229w) {
                    C2574g c2574g6 = new C2574g(AbstractC16526C.m18074b(String.class), (C2219z0) ((InputDateComponent) ((InterfaceC19229w) component)).dateController.f45765q0);
                    String name5 = component.getName();
                    C1382g c1382g3 = new C1382g(renderState, component, c1420z, i13);
                    C3743B c3743b8 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g6, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18074b(String.class))), name5, c1382g3);
                } else if (component instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                    C2574g c2574g7 = new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) governmentIdNfcScanComponent.cardAccessNumberController.f33997Z);
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) component;
                    String strM11052j2 = AbstractC10763a.m11052j(governmentIdNfcScanComponent2.getName(), "UpdateCardAccessNumber");
                    C1382g c1382g4 = new C1382g(renderState, component, c1420z, 2);
                    C3743B c3743b9 = C3743B.f11391c;
                    AbstractC8215v5.m8843e(c13421l3, c2574g7, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), strM11052j2, c1382g4);
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) governmentIdNfcScanComponent.documentNumberController.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(governmentIdNfcScanComponent2.getName(), "UpdateDocumentNumber"), new C1382g(renderState, component, c1420z, i12));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18074b(String.class), (C2219z0) governmentIdNfcScanComponent.dateOfBirthController.f45765q0), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18074b(String.class))), AbstractC10763a.m11052j(governmentIdNfcScanComponent2.getName(), "UpdateDateOfBirth"), new C1382g(renderState, component, c1420z, 4));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18074b(String.class), (C2219z0) governmentIdNfcScanComponent.expirationDateController.f45765q0), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18074b(String.class))), AbstractC10763a.m11052j(governmentIdNfcScanComponent2.getName(), "UpdateExpirationDate"), new C1382g(renderState, component, c1420z, 5));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18074b(C19664c.class), (C2146N) governmentIdNfcScanComponent.nfcDataController.f46725Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18074b(C19664c.class))), governmentIdNfcScanComponent2.getName(), new C1371c(renderState, component, 4));
                } else if (component instanceof C19207q0) {
                    C19207q0 c19207q0 = (C19207q0) component;
                    C2146N c2146n5 = (C2146N) c19207q0.f60939r0.f47946Z;
                    C3743B c3743b10 = C3743B.f11391c;
                    C2574g c2574g8 = new C2574g(AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C19067A1.class))), c2146n5);
                    C19207q0 c19207q1 = (C19207q0) component;
                    AbstractC8215v5.m8843e(c13421l3, c2574g8, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C19067A1.class))))), AbstractC10763a.m11052j(c19207q1.getName(), ":country"), new C1382g(renderState, component, c1420z, 7));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C19067A1.class))), (C2146N) c19207q0.f60940s0.f47946Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18076d(List.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C19067A1.class))))), AbstractC10763a.m11052j(c19207q1.getName(), ":idType"), new C1382g(renderState, component, c1420z, 8));
                    AbstractC8215v5.m8843e(c13421l3, new C2574g(AbstractC16526C.m18075c(String.class), (C2146N) c19207q0.f60944w0.f33997Z), AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(String.class))), AbstractC10763a.m11052j(c19207q1.getName(), ":idValue"), new C1382g(renderState, component, c1420z, 9));
                }
                return c17296c;
            case 3:
                AbstractC7701i output = (AbstractC7701i) obj;
                AbstractC16544l.m18094g(output, "output");
                C1383g0 c1383g0 = (C1383g0) obj5;
                C1360X0 c1360x0 = (C1360X0) obj2;
                if (output.equals(C7697e.f24244Y)) {
                    return AbstractC8215v5.m8839a(c1360x0, new C1347Q0(c1383g0));
                }
                C1381f0 c1381f0 = (C1381f0) obj4;
                if (output instanceof C7698f) {
                    return AbstractC8215v5.m8839a(c1360x0, new C1348R0(c1381f0, (GovernmentIdNfcScanComponent) obj3, c1383g0));
                }
                if (output instanceof C7700h) {
                    return AbstractC8215v5.m8839a(c1360x0, new C1350S0(c1381f0, output, c1383g0));
                }
                throw new C0644w();
            case 4:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C2500d c2500d = (C2500d) obj2;
                Iterator it2 = c2500d.f7791d.iterator();
                while (it2.hasNext()) {
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C2494b((InterfaceC1436k) obj5, (AbstractC16428g) it2.next(), (InterfaceC1426a) obj4, (EnumC21895B) obj3, c2500d, 0), true, 484618875), 3);
                }
                return c17296c;
            case 5:
                C14336N graphicsLayer = (C14336N) obj;
                AbstractC16544l.m18094g(graphicsLayer, "$this$graphicsLayer");
                InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) obj3;
                if (((EnumC2444C) obj2) == EnumC2444C.f7593Y) {
                    graphicsLayer.m15662p((-((Number) interfaceC5982V0.getValue()).floatValue()) * ((((int) (((C7545j) ((InterfaceC5985X) obj5).getValue()).f23903a & 4294967295L)) / 2.0f) + ((InterfaceC7537b) obj4).mo7866k0(AbstractC2511g1.f7809d)));
                } else {
                    graphicsLayer.m15649a(AbstractC9930m3.m10589c(1.0f, 0.0f, AbstractC9930m3.m10589c(0.0f, 0.33f, ((Number) interfaceC5982V0.getValue()).floatValue())));
                }
                graphicsLayer.m15660n(C14343V.f45023b);
                float fFloatValue = 1.0f - (((Number) interfaceC5982V0.getValue()).floatValue() * 0.66999996f);
                graphicsLayer.m15655g(fFloatValue);
                graphicsLayer.m15656h(fFloatValue);
                return c17296c;
            case 6:
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) obj;
                String str4 = (String) obj2;
                if (str4 != null) {
                    ((InterfaceC1436k) obj5).invoke(new C18152O((String) obj4, str4, interfaceC21098s, false));
                    ((InterfaceC20904w) obj3).mo21447a(C20864J.f66425d, C17690x.f56481Y);
                }
                return c17296c;
            case 7:
                InterfaceC21098s interfaceC21098s2 = (InterfaceC21098s) obj;
                C3034b c3034b = (C3034b) obj2;
                if (c3034b != null) {
                    ((InterfaceC1436k) obj5).invoke(new C18152O((String) obj4, c3034b.f9128a, interfaceC21098s2, false));
                    ((InterfaceC20904w) obj3).mo21447a(C20864J.f66425d, C17690x.f56481Y);
                }
                return c17296c;
            case 8:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                C4398N0 c4398n0 = (C4398N0) ((AbstractC4402P0) obj5);
                C4390J0 c4390j0 = (C4390J0) obj2;
                if (C4390J0.m5176e(c4390j0, c4398n0.f14285a)) {
                    Parcelable parcelable = (AbstractC4433h0) obj4;
                    if (parcelable instanceof InterfaceC4396M0) {
                        action.f42521b = C4390J0.m5178g(c4390j0, (InterfaceC4396M0) parcelable);
                    } else {
                        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = c4398n0.f14285a;
                        action.m14964a(new C4439k0("There was a problem reaching the server.", AbstractC4379E.m5173a(networkErrorInfo), networkErrorInfo, (String) obj3));
                    }
                } else {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = c4398n0.f14285a;
                    action.m14964a(new C4439k0("There was a problem reaching the server.", AbstractC4379E.m5173a(networkErrorInfo2), networkErrorInfo2, (String) obj3));
                }
                return c17296c;
            case 9:
                SurfaceHolderCallbackC4482b v2 = (SurfaceHolderCallbackC4482b) obj;
                AbstractC16544l.m18094g(v2, "v");
                AbstractC8553S2.m9212b((C4700a) obj5, (InterfaceC5985X) obj4, (InterfaceC5985X) obj3, (C6501u) obj2, v2);
                return c17296c;
            case 10:
                C5476n MinaBox = (C5476n) obj;
                AbstractC16544l.m18094g(MinaBox, "$this$MinaBox");
                C5115l c5115l = (C5115l) obj5;
                C5113j c5113j = (C5113j) obj3;
                AbstractC17792x.m19523f(((C5117n) obj4).f16720b, new C5109f(MinaBox, c5113j, c5115l, Math.min(((Number) ((InterfaceC5985X) obj2).getValue()).floatValue(), AbstractC17680n.m19371u0(c5115l.f16715b)), 1));
                if (c5113j.f16713c) {
                    MinaBox.f17882a.m1047b(1, new C5464b(new C4171z3(c5115l, 9), null, C5475m.f17881Y, AbstractC5105b.f16682a));
                }
                return c17296c;
            case 11:
                C6754e config = (C6754e) obj;
                AbstractC16544l.m18094g(config, "$this$config");
                Iterator it3 = ((Set) obj2).iterator();
                while (it3.hasNext()) {
                    config.m7190a(((C16210b) ((InterfaceC6731a) it3.next())).mo2504b(), new C0383c(7));
                }
                config.m7190a(AbstractC15064i.f46819c, new C7133a(0, (Set) obj4));
                if (((C18422e) obj5).f58783b) {
                    C7136d c7136d = new C7136d((C6226E) obj3);
                    InterfaceC17710b interfaceC17710b = AbstractC8927i.f27300a;
                    config.m7190a(C8926h.f27297b, new C0386f(c7136d));
                }
                return c17296c;
            case 12:
                C18265e LazyColumn2 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn2, "$this$LazyColumn");
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) obj2;
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7442a(interfaceC3759g, 0), true, 680556455), 3);
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7442a(interfaceC3759g, i13), true, 217756766), 3);
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7442a(interfaceC3759g, 2), true, 865984223), 3);
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7442a(interfaceC3759g, i12), true, 1514211680), 3);
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C1281w((C7439X) obj5, (C8870f) obj4, (String) obj3, 7), true, -2132528159), 3);
                return c17296c;
            case 13:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                int iOrdinal = ((C8382u) obj5).f26082a.f25973Z.ordinal();
                InterfaceC13410a interfaceC13410a = ((C13421l) obj2).f42503Y;
                C8351V c8351v = (C8351V) obj3;
                C8361c0 c8361c0 = (C8361c0) obj4;
                if (iOrdinal == 0) {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8361c0, new C8352W(c8361c0, c8351v, i12)));
                } else if (iOrdinal == 1) {
                    C8361c0.m8936e(c8361c0, action2, new C8365e0(c8351v.f26006a, EnumC8363d0.f26047Z));
                } else if (iOrdinal == 2) {
                    interfaceC13410a.mo3400l().mo3393B(AbstractC8215v5.m8839a(c8361c0, new C8352W(c8361c0, c8351v, 4)));
                }
                return c17296c;
            case 14:
                AbstractC10739y output2 = (AbstractC10739y) obj;
                AbstractC16544l.m18094g(output2, "output");
                C10696e1 c10696e1 = (C10696e1) obj5;
                return AbstractC8215v5.m8839a(c10696e1, new C0362w(output2, c10696e1, (C10670U) obj4, (C10730t0) obj3, (C13421l) obj2, 6));
            case 15:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                C10670U c10670u = (C10670U) obj5;
                action3.f42521b = C10696e1.m11019e((C10696e1) obj2, c10670u, (C10730t0) obj4, (C10725r) obj3, c10670u.f31675s0);
                return c17296c;
            case 16:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                C10676X c10676x = (C10676X) obj5;
                action4.f42521b = C10696e1.m11019e((C10696e1) obj2, c10676x, (C10730t0) obj4, (C10725r) obj3, c10676x.f31701o0);
                return c17296c;
            case 17:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                C10692d0 c10692d0 = (C10692d0) obj5;
                action5.f42521b = C10696e1.m11019e((C10696e1) obj2, c10692d0, (C10730t0) obj4, (C10725r) obj3, c10692d0.f31763s0);
                return c17296c;
            case 18:
                AbstractC2571d it4 = (AbstractC2571d) obj;
                AbstractC16544l.m18094g(it4, "it");
                C10696e1 c10696e2 = (C10696e1) obj5;
                C19033M c19033mM8614e2 = AbstractC8114j0.m8614e(c10696e2.f31778a, EnumC19034N.f60679Y);
                C13421l c13421l4 = (C13421l) obj2;
                if (it4 instanceof C2570c) {
                    C10696e1 c10696e3 = (C10696e1) obj5;
                    return AbstractC8215v5.m8839a(c10696e3, new C8847i(c10696e3, c19033mM8614e2, it4, (C10704h0) obj4, (C10730t0) obj3, c13421l4));
                }
                if (it4 instanceof C2569b) {
                    return AbstractC8215v5.m8839a(c10696e2, new C10669T0(c13421l4, c10696e2));
                }
                throw new C0644w();
            case 19:
                C11682a datadogContext = (C11682a) obj;
                AbstractC16544l.m18094g(datadogContext, "datadogContext");
                C11689a c11689a = (C11689a) obj2;
                String str5 = c11689a.f35464h;
                C17885C c17885c = (str5 == null || AbstractC21322p.m21681O(str5) || (str = c11689a.f35465i) == null || AbstractC21322p.m21681O(str)) ? null : new C17885C(str5, str, null);
                i13 = c17885c != null ? 2 : 1;
                C13315Z c13315z = (C13315Z) obj5;
                long j10 = c13315z.f42202u;
                C17953a c17953a = new C17953a(6, UUID.randomUUID().toString(), Long.valueOf(((C13329m) obj4).f42296c), null, null, new C18013u(0L), new C17992n(0L), new C18022x(0L), new C17882B(0L));
                String str6 = c11689a.f35460d;
                String str7 = str6 == null ? "" : str6;
                String str8 = c11689a.f35462f;
                C17965e c17965e = new C17965e(null, str7, null, str8 == null ? "" : str8, c11689a.f35461e);
                C11688g c11688g = datadogContext.f35421m;
                C17891E c17891e = AbstractC9144I.m9689a(c11688g) ? new C17891E(c11688g.f35452a, c11688g.f35453b, c11688g.f35454c, AbstractC17659D.m19256r(c11688g.f35455d)) : null;
                C17968f c17968f = new C17968f(c11689a.f35457a);
                C17959c c17959c = new C17959c(i13, Boolean.FALSE, c11689a.f35458b);
                int iM8602m = AbstractC8111i5.m8602m(datadogContext.f35415g, c13315z.f42183b.mo15463s());
                C11683b c11683b = datadogContext.f35420l;
                return new C17897G(j10, c17968f, datadogContext.f35411c, datadogContext.f35413e, null, null, c17959c, iM8602m, c17965e, c17891e, AbstractC8111i5.m8594e(datadogContext.f35419k), null, c17885c, null, new C18025y(c11683b.f35430f, c11683b.f35432h, null, c11683b.f35431g), new C18007s(AbstractC8111i5.m8595f(c11683b.f35428d), c11683b.f35425a, c11683b.f35427c, c11683b.f35426b, c11683b.f35433i), new C17995o(new C18004r(null, AbstractC8111i5.m8596g(c11689a.f35470n)), new C17977i(Float.valueOf(c13315z.f42193l)), null, null), new C17989m((LinkedHashMap) obj3), null, c17953a);
            case 20:
                long j11 = ((C13800b) obj).f43584a;
                int i14 = AbstractC13620e.f43030c;
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj3;
                C16484C c16484c = (C16484C) obj2;
                if (AbstractC13620e.m15144d(j11, (C13801c) interfaceC5985X.getValue(), c16484c)) {
                    long jM15143c = AbstractC13620e.m15143c(j11, (C13801c) interfaceC5985X.getValue(), c16484c);
                    C13625j c13625j = (C13625j) obj5;
                    c13625j.m15146a(jM15143c, (InterfaceC20904w) obj4);
                    c13625j.m15148c(jM15143c);
                }
                return c17296c;
            case 21:
                C13770k c13770k = (C13770k) obj;
                C13756d c13756d = (C13756d) obj2;
                AbstractC13758e.m15256u(c13770k, c13756d.f43411c);
                C6002f0 c6002f0 = c13770k.f43484e;
                Object objM15223d = c13756d.m15223d(c6002f0.getValue());
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj4;
                if (!AbstractC16544l.m18089b(objM15223d, c6002f0.getValue())) {
                    c13756d.f43411c.f43502Z.setValue(objM15223d);
                    ((C13774m) obj5).f43502Z.setValue(objM15223d);
                    if (interfaceC1436k != null) {
                        interfaceC1436k.invoke(c13756d);
                    }
                    c13770k.m15268a();
                    ((C16556x) obj3).f51285Y = true;
                } else if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(c13756d);
                }
                return c17296c;
            case 22:
                long jLongValue = ((Number) obj).longValue();
                InterfaceC5982V0 interfaceC5982V1 = (InterfaceC5982V0) ((InterfaceC5985X) obj2).getValue();
                long jLongValue2 = interfaceC5982V1 != null ? ((Number) interfaceC5982V1.getValue()).longValue() : jLongValue;
                C13736L c13736l = (C13736L) obj5;
                long j12 = c13736l.f43321c;
                C6546d c6546d = c13736l.f43319a;
                InterfaceC0571F interfaceC0571F = (InterfaceC0571F) obj3;
                C16557y c16557y = (C16557y) obj4;
                if (j12 == Long.MIN_VALUE || c16557y.f51286Y != AbstractC13758e.m15251p(interfaceC0571F.getCoroutineContext())) {
                    c13736l.f43321c = jLongValue;
                    int i15 = c6546d.f21184o0;
                    if (i15 > 0) {
                        Object[] objArr = c6546d.f21182Y;
                        int i16 = 0;
                        do {
                            ((C13733I) objArr[i16]).f43310s0 = true;
                            i16++;
                        } while (i16 < i15);
                    }
                    c16557y.f51286Y = AbstractC13758e.m15251p(interfaceC0571F.getCoroutineContext());
                }
                float f10 = c16557y.f51286Y;
                if (f10 == 0.0f) {
                    int i17 = c6546d.f21184o0;
                    if (i17 > 0) {
                        Object[] objArr2 = c6546d.f21182Y;
                        int i18 = 0;
                        do {
                            C13733I c13733i = (C13733I) objArr2[i18];
                            c13733i.f43307p0.setValue(c13733i.f43308q0.f43423c);
                            c13733i.f43310s0 = true;
                            i18++;
                        } while (i18 < i17);
                    }
                } else {
                    long j13 = (long) ((jLongValue2 - c13736l.f43321c) / f10);
                    int i19 = c6546d.f21184o0;
                    if (i19 > 0) {
                        Object[] objArr3 = c6546d.f21182Y;
                        z6 = true;
                        int i20 = 0;
                        do {
                            C13733I c13733i2 = (C13733I) objArr3[i20];
                            if (!c13733i2.f43309r0) {
                                c13733i2.f43312u0.f43320b.setValue(Boolean.FALSE);
                                if (c13733i2.f43310s0) {
                                    c13733i2.f43310s0 = false;
                                    c13733i2.f43311t0 = j13;
                                }
                                long j14 = j13 - c13733i2.f43311t0;
                                c13733i2.f43307p0.setValue(c13733i2.f43308q0.mo15234i(j14));
                                C13757d0 c13757d0 = c13733i2.f43308q0;
                                c13757d0.getClass();
                                c13733i2.f43309r0 = AbstractC12107L1.m13810a(c13757d0, j14);
                            }
                            if (!c13733i2.f43309r0) {
                                z6 = false;
                            }
                            i20++;
                        } while (i20 < i19);
                    } else {
                        z6 = true;
                    }
                    c13736l.f43322d.setValue(Boolean.valueOf(!z6));
                }
                return c17296c;
            case 23:
                int i21 = (int) (((C7545j) obj).f23903a & 4294967295L);
                ((C5996c0) obj4).m6413h(i21);
                ArrayList arrayListM15498l = ((C14111x0) obj2).m15498l();
                if (AbstractC16544l.m18089b(AbstractC17680n.m19344T(arrayListM15498l.size() - 2, arrayListM15498l), (AbstractC6601G) obj5)) {
                    ((C5996c0) obj3).m6413h(i21);
                }
                return c17296c;
            case 24:
                C18265e LazyColumn3 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn3, "$this$LazyColumn");
                C14130o c14130o = (C14130o) obj2;
                boolean z10 = c14130o.f44469b;
                List list = c14130o.f44468a;
                if (z10 && list.isEmpty()) {
                    for (int i22 = 0; i22 < 3; i22++) {
                        AbstractC17792x.m19528k(LazyColumn3, null, AbstractC14118c.f44453c, 3);
                    }
                } else {
                    InterfaceC3759g interfaceC3759g2 = (InterfaceC3759g) obj5;
                    LazyColumn3.m19803p(list.size(), null, new C1278t(17, list), new C8410b(new C2456I(6, interfaceC3759g2, (C5521B) obj4, (C5521B) obj3, list), true, -632812321));
                    if (c14130o.f44470c != null) {
                        AbstractC17792x.m19528k(LazyColumn3, null, new C8410b(new C14127l(c14130o, 0, interfaceC3759g2), true, -618968698), 3);
                    }
                }
                return c17296c;
            case 25:
                AbstractC16544l.m18094g((C5950F) obj, WGTYqNchEpHca.YGqSnbH);
                C11097f c11097f = new C11097f((C21795y) obj2, new SentryNavigationListener(((Boolean) ((InterfaceC5985X) obj4).getValue()).booleanValue(), ((Boolean) ((InterfaceC5985X) obj3).getValue()).booleanValue()));
                AbstractC11105n abstractC11105n = (AbstractC11105n) obj5;
                abstractC11105n.mo7806a(c11097f);
                return new C0260j0(c11097f, i10, abstractC11105n);
            case 26:
                return m2011a(obj);
            case 27:
                C13770k c13770k2 = (C13770k) obj;
                C16557y c16557y2 = (C16557y) obj2;
                float fFloatValue2 = ((Number) c13770k2.f43484e.getValue()).floatValue() - c16557y2.f51286Y;
                float fMo18510a = ((InterfaceC16694M0) obj5).mo18510a(fFloatValue2);
                c16557y2.f51286Y = ((Number) c13770k2.f43484e.getValue()).floatValue();
                ((C16557y) obj4).f51286Y = ((Number) c13770k2.m15269b()).floatValue();
                if (Math.abs(fFloatValue2 - fMo18510a) > 0.5f) {
                    c13770k2.m15268a();
                }
                ((C16684J) obj3).getClass();
                return c17296c;
            case 28:
                return m2012b(obj);
            default:
                C18566Y c18566y = (C18566Y) obj2;
                c18566y.f59147d = new C11242m((C18553K) obj5, (C21081e0) obj4, (InterfaceC18587j0) obj3);
                return new C0251g0(c18566y, 11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1307e(C10696e1 c10696e1, AbstractC10712k0 abstractC10712k0, C10730t0 c10730t0, C10725r c10725r, C13421l c13421l, int i10) {
        super(1);
        this.f3449Y = i10;
        this.f3451o0 = c10696e1;
        this.f3452p0 = abstractC10712k0;
        this.f3450Z = c10730t0;
        this.f3453q0 = c10725r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1307e(AbstractC13422m abstractC13422m, Object obj, Object obj2, C13421l c13421l, int i10) {
        super(1);
        this.f3449Y = i10;
        this.f3452p0 = abstractC13422m;
        this.f3450Z = obj;
        this.f3453q0 = obj2;
        this.f3451o0 = c13421l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1307e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f3449Y = i10;
        this.f3451o0 = obj;
        this.f3452p0 = obj2;
        this.f3450Z = obj3;
        this.f3453q0 = obj4;
    }
}
