package p006A4;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.material3.AbstractC10859d;
import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p650ui.layout.AbstractC10868a;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.disclosure.DisclosureViewModel;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import com.openai.feature.notification.NotificationTaskViewModel;
import com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModel;
import com.openai.voice.assistant.AbstractC12590a;
import com.openai.voice.training.VoiceTrainingViewModel;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.ESignatureComponent;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.C0248f0;
import p003A1.C0286s;
import p017Af.C0491v;
import p020Ai.C0515d;
import p039Bc.C0885s;
import p046Bk.C1375d0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p074Ck.C1716a;
import p080D0.AbstractC1807h0;
import p080D0.C1765B;
import p080D0.C1799d0;
import p080D0.C1803f0;
import p080D0.C1824q;
import p080D0.C1838x;
import p080D0.C1840y;
import p1025te.C19861L;
import p103Dn.C2153Q0;
import p1061vb.C20513d;
import p1071w0.InterfaceC20772r0;
import p1081wc.EnumC20861G;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.AbstractC21790t;
import p1143z4.C21778h;
import p1155zi.C22068v1;
import p1155zi.C22072w1;
import p1155zi.EnumC21895B;
import p124Ei.C2487Y;
import p124Ei.C2500d;
import p124Ei.C2529m1;
import p124Ei.C2540r0;
import p156G1.AbstractC2965l;
import p193Hf.C3350b0;
import p197Hj.C3457c;
import p219Ig.C3713b;
import p219Ig.C3714c;
import p219Ig.C3715d;
import p219Ig.InterfaceC3718g;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3918H;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4071j;
import p229J0.AbstractC4124r4;
import p229J0.C3934J3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4036d0;
import p229J0.C4042e0;
import p243Jf.C4334d;
import p273Kl.C4714D;
import p278L0.C4892s;
import p292Lg.C5034f;
import p293Lh.C5056b;
import p316Mf.C5344k;
import p316Mf.C5347n;
import p319Mi.AbstractC5440b;
import p319Mi.C5446h;
import p319Mi.C5447i;
import p332N8.C5678b;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.AbstractC6199c;
import p363Og.C6210n;
import p363Og.C6211o;
import p363Og.C6213q;
import p398Q8.C6581a;
import p429Re.C6869c;
import p429Re.C6873g;
import p429Re.C6874h;
import p429Re.C6875i;
import p429Re.C6877k;
import p455Sf.C7122g;
import p455Sf.C7125j;
import p467T1.EnumC7198h;
import p478Tc.AbstractC7313q;
import p507Uh.AbstractC7676b;
import p507Uh.C7677c;
import p507Uh.InterfaceC7678d;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p553Wh.C8870f;
import p571X9.AbstractC9249Z3;
import p571X9.AbstractC9274d4;
import p571X9.AbstractC9393x3;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9751J3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p658b5.C11246q;
import p736f0.C13489g;
import p774h1.C14365u;
import p855kj.AbstractC16428g;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17767k0;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p911o0.C17794y;
import p911o0.InterfaceC17763i0;
import p962qc.AbstractC18671e;
import p994rk.InterfaceC19201o2;
import ug.AbstractC20236s;

/* JADX INFO: renamed from: A4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0349j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1208Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1209Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1210o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0349j(Object obj, int i10, Object obj2) {
        super(2);
        this.f1208Y = i10;
        this.f1210o0 = obj;
        this.f1209Z = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m990a(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1171223903);
            C7677c c7677c = (C7677c) this.f1210o0;
            boolean zM6542f = c6021p.m6542f(c7677c);
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f1209Z;
            boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1426a);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f2 || objM6514H == C6013l.f19514a) {
                objM6514H = new C4714D(c7677c, 24, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, null, false, null, null, null, null, null, null, AbstractC7676b.f24205c, c6021p, 805306368, 510);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0a5f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        boolean z6;
        int i10 = 8;
        int i11 = 18;
        int i12 = 25;
        C10456n c10456n = C10456n.f30959Y;
        Object obj3 = C6013l.f19514a;
        int i13 = 0;
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f1209Z;
        Object obj5 = this.f1210o0;
        int i14 = 2;
        switch (this.f1208Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    ((C0354o) obj5).f1228v0.invoke((C21778h) obj4, c6021p, 8);
                }
                return c17296c;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C21778h c21778h = (C21778h) obj4;
                    AbstractC21790t abstractC21790t = c21778h.f69074Z;
                    AbstractC16544l.m18092e(abstractC21790t, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((C0346g) abstractC21790t).f1198u0.mo985d((C13489g) obj5, c21778h, c6021p2, 72);
                }
                return c17296c;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    C7122g c7122g = (C7122g) obj5;
                    c6021p3.m6524S(-294307585);
                    C8870f c8870f = (C8870f) obj4;
                    boolean zM6545h = c6021p3.m6545h(c8870f) | c6021p3.m6545h(c7122g);
                    Object objM6514H = c6021p3.m6514H();
                    if (zM6545h || objM6514H == obj3) {
                        objM6514H = new C0286s(c8870f, i10, c7122g);
                        c6021p3.m6537c0(objM6514H);
                    }
                    c6021p3.m6553p(false);
                    AbstractC17665J.m19261a(c7122g.f22669a, c7122g.f22670b, (InterfaceC1426a) objM6514H, null, c6021p3, 0);
                }
                return c17296c;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Bitmap bitmap = (Bitmap) obj2;
                C1375d0 c1375d0 = (C1375d0) obj5;
                c1375d0.f3648a.f4914i.getBackButton().setEnabled(true);
                C1716a c1716a = c1375d0.f3648a;
                c1716a.f4914i.setImportantForAccessibility(1);
                c1716a.f4917l.setImportantForAccessibility(1);
                if (!zBooleanValue) {
                    ((C2153Q0) ((ESignatureComponent) ((InterfaceC19201o2) obj4)).bitmapController.f62320Y).setValue(bitmap);
                }
                return c17296c;
            case 4:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    ((C8410b) obj5).invoke((AbstractC20236s) obj4, c6021p4, 0);
                }
                return c17296c;
            case 5:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    ((C8410b) obj5).invoke(c6021p5, 0);
                    C1803f0 c1803f0 = (C1803f0) obj4;
                    if (c1803f0.m2595g() && c1803f0.m2592d()) {
                        C1824q c1824qM2593e = c1803f0.m2593e();
                        if (c1824qM2593e == null ? true : AbstractC16544l.m18089b(c1824qM2593e.f5257a, c1824qM2593e.f5258b)) {
                            c6021p5.m6524S(-880741817);
                            c6021p5.m6553p(false);
                        } else {
                            c6021p5.m6524S(-882227523);
                            C1824q c1824qM2593e2 = c1803f0.m2593e();
                            if (c1824qM2593e2 == null) {
                                c6021p5.m6524S(-882188681);
                                c6021p5.m6553p(false);
                                z6 = false;
                            } else {
                                c6021p5.m6524S(-882188680);
                                c6021p5.m6524S(1495564482);
                                List listM19382k = AbstractC17681o.m19382k(Boolean.TRUE, Boolean.FALSE);
                                int size = listM19382k.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    boolean zBooleanValue2 = ((Boolean) listM19382k.get(i15)).booleanValue();
                                    boolean zM6544g = c6021p5.m6544g(zBooleanValue2);
                                    Object objM6514H2 = c6021p5.m6514H();
                                    if (zM6544g || objM6514H2 == obj3) {
                                        objM6514H2 = new C1799d0(zBooleanValue2, c1803f0);
                                        c6021p5.m6537c0(objM6514H2);
                                    }
                                    InterfaceC20772r0 interfaceC20772r0 = (InterfaceC20772r0) objM6514H2;
                                    boolean zM6544g2 = c6021p5.m6544g(zBooleanValue2);
                                    Object objM6514H3 = c6021p5.m6514H();
                                    if (zM6544g2 || objM6514H3 == obj3) {
                                        objM6514H3 = zBooleanValue2 ? new C1840y(c1803f0, i13) : new C1840y(c1803f0, 1);
                                        c6021p5.m6537c0(objM6514H3);
                                    }
                                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H3;
                                    EnumC7198h enumC7198h = zBooleanValue2 ? c1824qM2593e2.f5257a.f5253a : c1824qM2593e2.f5258b.f5253a;
                                    C1765B c1765b = new C1765B(interfaceC1426a);
                                    boolean zM6545h2 = c6021p5.m6545h(interfaceC20772r0);
                                    Object objM6514H4 = c6021p5.m6514H();
                                    if (zM6545h2 || objM6514H4 == obj3) {
                                        objM6514H4 = new C1838x(interfaceC20772r0, null);
                                        c6021p5.m6537c0(objM6514H4);
                                    }
                                    AbstractC1807h0.m2616e(c1765b, zBooleanValue2, enumC7198h, c1824qM2593e2.f5259c, 0L, new SuspendPointerInputElement(interfaceC20772r0, null, (InterfaceC1439n) objM6514H4, 6), c6021p5, 0, 16);
                                    i15++;
                                    i13 = 0;
                                }
                                boolean z10 = i13;
                                c6021p5.m6553p(z10);
                                c6021p5.m6553p(z10);
                                z6 = z10;
                            }
                            c6021p5.m6553p(z6);
                        }
                    } else {
                        c6021p5.m6524S(-880741817);
                        c6021p5.m6553p(false);
                    }
                }
                return c17296c;
            case 6:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else if (((EnumC21895B) obj5) == EnumC21895B.f69418Y) {
                    AbstractC4124r4.m4768b(((AbstractC16428g) obj4).mo18009a(), null, C14365u.f45056f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p6, 384, 0, 131066);
                }
                return c17296c;
            case 7:
                C6021p c6021p7 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else if (AbstractC16544l.m18089b(((C2500d) obj5).f7790c, (AbstractC16428g) obj4)) {
                    AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.check, c6021p7, 0), AbstractC8142m4.m8676d(R.string.audio_device_selected_description, c6021p7), null, 0L, c6021p7, 0, 12);
                }
                return c17296c;
            case 8:
                Uri uri = (Uri) obj;
                EnumC20861G source = (EnumC20861G) obj2;
                AbstractC16544l.m18094g(uri, "uri");
                AbstractC16544l.m18094g(source, "source");
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj5;
                interfaceC1436k.invoke(new C2540r0(false));
                ((InputViewModel) obj4).m14395k(new C19861L(AbstractC9393x3.m9974d(uri)));
                interfaceC1436k.invoke(new C2487Y(source));
                return c17296c;
            case 9:
                C6021p c6021p8 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    AbstractC18671e.m20038a(null, AbstractC9249Z3.m9825b(), AbstractC8411c.m8969c(673876494, c6021p8, new C0885s((C2529m1) obj5, 3, (InterfaceC20904w) obj4)), c6021p8, 384, 1);
                }
                return c17296c;
            case 10:
                C6021p c6021p9 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23202g);
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23201f);
                    c6021p9.m6524S(432823617);
                    C0515d c0515d = (C0515d) obj5;
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) obj4;
                    boolean zM6542f = c6021p9.m6542f(c0515d) | c6021p9.m6542f(interfaceC1436k2);
                    Object objM6514H5 = c6021p9.m6514H();
                    if (zM6542f || objM6514H5 == obj3) {
                        objM6514H5 = new C3350b0(c0515d, i14, interfaceC1436k2);
                        c6021p9.m6537c0(objM6514H5);
                    }
                    c6021p9.m6553p(false);
                    AbstractC9746I4.m10337a(interfaceC10459qM11233k, null, null, false, c17764jM19500g, null, null, false, (InterfaceC1436k) objM6514H5, c6021p9, 0, 238);
                }
                return c17296c;
            case 11:
                C6021p c6021p10 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p10.m6562y()) {
                    c6021p10.m6517L();
                } else {
                    AbstractC12590a.m14403b((InterfaceC1436k) obj5, (InterfaceC10459q) obj4, c6021p10, 0, 0);
                }
                return c17296c;
            case 12:
                C6021p c6021p11 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p11.m6562y()) {
                    c6021p11.m6517L();
                } else {
                    InterfaceC3718g interfaceC3718g = (InterfaceC3718g) obj5;
                    boolean z11 = interfaceC3718g instanceof C3714c;
                    boolean z12 = interfaceC3718g instanceof C3715d;
                    C4042e0 c4042e0M4732a = AbstractC4048f0.m4732a(c6021p11);
                    c6021p11.m6524S(918863439);
                    DeactivatedAccountViewModel deactivatedAccountViewModel = (DeactivatedAccountViewModel) obj4;
                    boolean zM6542f2 = c6021p11.m6542f(deactivatedAccountViewModel);
                    Object objM6514H6 = c6021p11.m6514H();
                    if (zM6542f2 || objM6514H6 == obj3) {
                        objM6514H6 = new C3457c(deactivatedAccountViewModel, 4);
                        c6021p11.m6537c0(objM6514H6);
                    }
                    c6021p11.m6553p(false);
                    AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H6, null, c4042e0M4732a, z12, z11, AbstractC8411c.m8969c(1942096232, c6021p11, new C3713b(interfaceC3718g, 1)), c6021p11, 196608, 2);
                }
                return c17296c;
            case 13:
                C6021p c6021p12 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p12.m6562y()) {
                    c6021p12.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM19543a = C17794y.f56777a.m19543a(AbstractC10842a.m11232j(c10456n, AbstractC4071j.f12959g), ((InterfaceC1439n) obj5) == null ? C10444b.f30946y0 : C10444b.f30947z0);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i16 = c6021p12.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p12.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p12, interfaceC10459qM19543a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p12.m6528W();
                    if (c6021p12.f19563O) {
                        c6021p12.m6549l(c21696i);
                    } else {
                        c6021p12.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p12, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p12, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p12.f19563O || !AbstractC16544l.m18089b(c6021p12.m6514H(), Integer.valueOf(i16))) {
                        AbstractC0168G.m537z(i16, c6021p12, i16, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p12, interfaceC10459qM10923d);
                    ((InterfaceC1439n) obj4).invoke(c6021p12, 0);
                    c6021p12.m6553p(true);
                }
                return c17296c;
            case 14:
                C6021p c6021p13 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p13.m6562y()) {
                    c6021p13.m6517L();
                } else {
                    ((InterfaceC1440o) obj5).invoke(((C4036d0) obj4).f12709b, c6021p13, 0);
                }
                return c17296c;
            case 15:
                C6021p c6021p14 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p14.m6562y()) {
                    c6021p14.m6517L();
                } else {
                    InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(AbstractC10844c.m11241a(c10456n, AbstractC4048f0.f12771c, AbstractC4048f0.f12772d), (InterfaceC17763i0) obj5);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56728e, C10444b.f30944w0, c6021p14, 54);
                    int i17 = c6021p14.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p14.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p14, interfaceC10459qM11232j);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p14.m6528W();
                    if (c6021p14.f19563O) {
                        c6021p14.m6549l(c21696i2);
                    } else {
                        c6021p14.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p14, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p14, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p14.f19563O || !AbstractC16544l.m18089b(c6021p14.m6514H(), Integer.valueOf(i17))) {
                        AbstractC0168G.m537z(i17, c6021p14, i17, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p14, interfaceC10459qM10923d2);
                    ((InterfaceC1440o) obj4).invoke(C17785t0.f56761a, c6021p14, 6);
                    c6021p14.m6553p(true);
                }
                return c17296c;
            case 16:
                C6021p c6021p15 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p15.m6562y()) {
                    c6021p15.m6517L();
                } else {
                    AbstractC4124r4.m4767a(((C3941K4) obj5).f12154j, (C8410b) obj4, c6021p15, 0);
                }
                return c17296c;
            case 17:
                C6021p c6021p16 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p16.m6562y()) {
                    c6021p16.m6517L();
                } else {
                    C3934J3 c3934j3 = (C3934J3) obj4;
                    AbstractC16544l.m18091d(c3934j3);
                    ((InterfaceC1440o) obj5).invoke(c3934j3, c6021p16, 0);
                }
                return c17296c;
            case 18:
                C6021p c6021p17 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p17.m6562y()) {
                    c6021p17.m6517L();
                } else {
                    Object objM6514H7 = c6021p17.m6514H();
                    if (objM6514H7 == obj3) {
                        objM6514H7 = new C0248f0((InterfaceC5985X) obj5, i11);
                        c6021p17.m6537c0(objM6514H7);
                    }
                    InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(c10456n, (InterfaceC1436k) objM6514H7);
                    InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i18 = c6021p17.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p17.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p17, interfaceC10459qM11318d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i3 = C21698j.f68869b;
                    c6021p17.m6528W();
                    if (c6021p17.f19563O) {
                        c6021p17.m6549l(c21696i3);
                    } else {
                        c6021p17.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p17, interfaceC21057KM19511e2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p17, interfaceC6008i0M6550m3);
                    C21694h c21694h3 = C21698j.f68874g;
                    if (c6021p17.f19563O || !AbstractC16544l.m18089b(c6021p17.m6514H(), Integer.valueOf(i18))) {
                        AbstractC0168G.m537z(i18, c6021p17, i18, c21694h3);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p17, interfaceC10459qM10923d3);
                    ((C8410b) obj4).invoke(c6021p17, 0);
                    c6021p17.m6553p(true);
                }
                return c17296c;
            case 19:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                C11246q c11246q = ((C4892s) obj5).f15947a;
                ((C5994b0) c11246q.f34073j).m6410h(fFloatValue);
                ((C5994b0) c11246q.f34074k).m6410h(fFloatValue2);
                ((C16557y) obj4).f51286Y = fFloatValue;
                return c17296c;
            case 20:
                C6021p c6021p18 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p18.m6562y()) {
                    c6021p18.m6517L();
                } else {
                    String str = (String) obj5;
                    boolean zM6542f3 = c6021p18.m6542f(str);
                    Object objM6514H8 = c6021p18.m6514H();
                    if (zM6542f3 || objM6514H8 == obj3) {
                        objM6514H8 = new C0491v(str, i11);
                        c6021p18.m6537c0(objM6514H8);
                    }
                    InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(c10456n, false, (InterfaceC1436k) objM6514H8);
                    InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    int i19 = c6021p18.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p18.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p18, interfaceC10459qM3789a);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i4 = C21698j.f68869b;
                    c6021p18.m6528W();
                    if (c6021p18.f19563O) {
                        c6021p18.m6549l(c21696i4);
                    } else {
                        c6021p18.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p18, interfaceC21057KM19511e3);
                    C5997d.m6439Z(C21698j.f68872e, c6021p18, interfaceC6008i0M6550m4);
                    C21694h c21694h4 = C21698j.f68874g;
                    if (c6021p18.f19563O || !AbstractC16544l.m18089b(c6021p18.m6514H(), Integer.valueOf(i19))) {
                        AbstractC0168G.m537z(i19, c6021p18, i19, c21694h4);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p18, interfaceC10459qM10923d4);
                    ((C8410b) obj4).invoke(c6021p18, 0);
                    c6021p18.m6553p(true);
                }
                return c17296c;
            case 21:
                String message = (String) obj;
                List tags = (List) obj2;
                AbstractC16544l.m18094g(message, "message");
                AbstractC16544l.m18094g(tags, "tags");
                C5347n c5347n = (C5347n) obj4;
                AbstractC16544l.m18094g(c5347n, "<this>");
                ((MessageFeedbackViewModel) obj5).m14395k(new C5344k(c5347n.f17570a, c5347n.f17571b, message, tags));
                return c17296c;
            case 22:
                C6021p c6021p19 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p19.m6562y()) {
                    c6021p19.m6517L();
                } else {
                    C17756f c17756f2 = AbstractC17770m.f56724a;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23201f), C10444b.f30946y0, c6021p19, 0);
                    int i20 = c6021p19.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p19.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p19, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i5 = C21698j.f68869b;
                    c6021p19.m6528W();
                    if (c6021p19.f19563O) {
                        c6021p19.m6549l(c21696i5);
                    } else {
                        c6021p19.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p19, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p19, interfaceC6008i0M6550m5);
                    C21694h c21694h5 = C21698j.f68874g;
                    if (c6021p19.f19563O || !AbstractC16544l.m18089b(c6021p19.m6514H(), Integer.valueOf(i20))) {
                        AbstractC0168G.m537z(i20, c6021p19, i20, c21694h5);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p19, interfaceC10459qM10923d5);
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C5447i c5447i = (C5447i) obj5;
                    boolean z13 = c5447i.f17795b;
                    c6021p19.m6524S(1049986436);
                    VoiceTrainingViewModel voiceTrainingViewModel = (VoiceTrainingViewModel) obj4;
                    boolean zM6542f4 = c6021p19.m6542f(voiceTrainingViewModel);
                    Object objM6514H9 = c6021p19.m6514H();
                    if (zM6542f4 || objM6514H9 == obj3) {
                        objM6514H9 = new C5446h(voiceTrainingViewModel, i13);
                        c6021p19.m6537c0(objM6514H9);
                    }
                    c6021p19.m6553p(false);
                    AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H9, interfaceC10459qM11244d, null, z13, false, AbstractC5440b.f17784a, c6021p19, 196656, 20);
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                    C4042e0 c4042e0M4733b = AbstractC4048f0.m4733b(C14365u.f45059i, ((C3949M0) c6021p19.m6548k(AbstractC3959O0.f12302a)).f12213a, c6021p19, 12);
                    c6021p19.m6524S(1050004037);
                    boolean zM6542f5 = c6021p19.m6542f(voiceTrainingViewModel);
                    Object objM6514H10 = c6021p19.m6514H();
                    if (zM6542f5 || objM6514H10 == obj3) {
                        objM6514H10 = new C5446h(voiceTrainingViewModel, 1);
                        c6021p19.m6537c0(objM6514H10);
                    }
                    c6021p19.m6553p(false);
                    AbstractC9751J3.m10349b((InterfaceC1426a) objM6514H10, interfaceC10459qM11244d2, c4042e0M4733b, c5447i.f17796c, false, AbstractC5440b.f17785b, c6021p19, 196656, 16);
                    c6021p19.m6553p(true);
                }
                return c17296c;
            case 23:
                int iIntValue = ((Number) obj).intValue();
                List row = (List) obj2;
                AbstractC16544l.m18094g(row, "row");
                C16525B c16525b = (C16525B) obj5;
                if (c16525b.f51262Y == null) {
                    c16525b.f51262Y = Integer.valueOf(row.size());
                }
                Integer num = (Integer) c16525b.f51262Y;
                int iIntValue2 = num != null ? num.intValue() : row.size();
                C5678b c5678b = (C5678b) obj4;
                if (row.size() > iIntValue2) {
                    c5678b.f18439a.getClass();
                    C20513d c20513d = c5678b.f18439a;
                    c20513d.getClass();
                    c20513d.getClass();
                    throw new C6581a(iIntValue2, row.size(), iIntValue + 1);
                }
                if (iIntValue2 == row.size()) {
                    return row;
                }
                c5678b.f18439a.getClass();
                C20513d c20513d2 = c5678b.f18439a;
                c20513d2.getClass();
                c20513d2.getClass();
                throw new C6581a(iIntValue2, row.size(), iIntValue + 1);
            case 24:
                C6021p c6021p20 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p20.m6562y()) {
                    c6021p20.m6517L();
                } else {
                    InterfaceC3759g interfaceC3759g = (InterfaceC3759g) obj5;
                    AbstractC3918H.m4622d(AbstractC6199c.f20192a, null, AbstractC8411c.m8969c(-2020111125, c6021p20, new C6210n(interfaceC3759g, i13)), AbstractC8411c.m8969c(-385482590, c6021p20, new C6211o((C6213q) obj4, interfaceC3759g, i13)), 0.0f, null, null, null, c6021p20, 3462, 242);
                }
                return c17296c;
            case 25:
                C6021p c6021p21 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p21.m6562y()) {
                    c6021p21.m6517L();
                } else {
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p21, 0);
                    int i21 = c6021p21.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p21.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p21, c10456n);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i6 = C21698j.f68869b;
                    c6021p21.m6528W();
                    if (c6021p21.f19563O) {
                        c6021p21.m6549l(c21696i6);
                    } else {
                        c6021p21.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p21, c17790wM19515a2);
                    C5997d.m6439Z(C21698j.f68872e, c6021p21, interfaceC6008i0M6550m6);
                    C21694h c21694h6 = C21698j.f68874g;
                    if (c6021p21.f19563O || !AbstractC16544l.m18089b(c6021p21.m6514H(), Integer.valueOf(i21))) {
                        AbstractC0168G.m537z(i21, c6021p21, i21, c21694h6);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p21, interfaceC10459qM10923d6);
                    c6021p21.m6524S(-1853954183);
                    C6877k c6877k = (C6877k) obj5;
                    C6875i c6875i = c6877k.f22057f;
                    if (c6875i != null) {
                        C8410b c8410bM8969c = AbstractC8411c.m8969c(-1683482592, c6021p21, new C6873g(c6877k, i14));
                        if (c6875i.f22047c) {
                            c6021p21.m6524S(-1637521130);
                            AbstractC3984T1.m4697p(null, null, null, null, null, AbstractC8411c.m8969c(-1209546440, c6021p21, new C5056b(c8410bM8969c, i14)), c6021p21, 196608, 31);
                            c6021p21.m6553p(false);
                        } else {
                            c6021p21.m6524S(-1637395301);
                            c8410bM8969c.invoke(c6021p21, 6);
                            c6021p21.m6553p(false);
                        }
                        AbstractC17758g.m19482b(c6021p21, AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23201f));
                    }
                    c6021p21.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
                    c6021p21.m6524S(-1853926487);
                    DisclosureViewModel disclosureViewModel = (DisclosureViewModel) obj4;
                    boolean zM6542f6 = c6021p21.m6542f(disclosureViewModel);
                    Object objM6514H11 = c6021p21.m6514H();
                    if (zM6542f6 || objM6514H11 == obj3) {
                        objM6514H11 = new C6874h(disclosureViewModel, i13);
                        c6021p21.m6537c0(objM6514H11);
                    }
                    c6021p21.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H11, interfaceC10459qM11244d3, false, null, null, null, null, null, null, AbstractC8411c.m8969c(70251122, c6021p21, new C6869c(c6877k, i14)), c6021p21, 805306416, 508);
                    c6021p21.m6524S(-1853920736);
                    if (c6877k.f22059h != null) {
                        InterfaceC10459q interfaceC10459qM11244d4 = AbstractC10844c.m11244d(c10456n, 1.0f);
                        C17767k0 c17767k1 = AbstractC4048f0.f12769a;
                        C4042e0 c4042e0M4733b2 = AbstractC4048f0.m4733b(C14365u.f45059i, ((C3949M0) c6021p21.m6548k(AbstractC3959O0.f12302a)).f12213a, c6021p21, 12);
                        c6021p21.m6524S(-1853916181);
                        boolean zM6542f7 = c6021p21.m6542f(disclosureViewModel);
                        Object objM6514H12 = c6021p21.m6514H();
                        if (zM6542f7 || objM6514H12 == obj3) {
                            objM6514H12 = new C6874h(disclosureViewModel, 1);
                            c6021p21.m6537c0(objM6514H12);
                        }
                        c6021p21.m6553p(false);
                        AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H12, interfaceC10459qM11244d4, false, null, c4042e0M4733b2, null, null, null, null, AbstractC8411c.m8969c(-64732960, c6021p21, new C6869c(c6877k, 3)), c6021p21, 805306416, 492);
                    }
                    c6021p21.m6553p(false);
                    c6021p21.m6553p(true);
                }
                return c17296c;
            case 26:
                C6021p c6021p22 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p22.m6562y()) {
                    c6021p22.m6517L();
                } else {
                    AbstractC9274d4.m9842a(AbstractC8411c.m8969c(697150266, c6021p22, new C7125j((C22072w1) obj5, i14)), null, AbstractC8411c.m8969c(-1298152456, c6021p22, new C4334d((C8870f) obj4, 14)), null, false, null, c6021p22, 390, 58);
                }
                return c17296c;
            case 27:
                C6021p c6021p23 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p23.m6562y()) {
                    c6021p23.m6517L();
                } else {
                    C22068v1 c22068v1 = (C22068v1) obj5;
                    boolean z14 = c22068v1.f69769c;
                    c6021p23.m6524S(-1004350831);
                    NotificationTaskViewModel notificationTaskViewModel = (NotificationTaskViewModel) obj4;
                    boolean zM6542f8 = c6021p23.m6542f(notificationTaskViewModel) | c6021p23.m6545h(c22068v1);
                    Object objM6514H13 = c6021p23.m6514H();
                    if (zM6542f8 || objM6514H13 == obj3) {
                        objM6514H13 = new C5034f(notificationTaskViewModel, i12, c22068v1);
                        c6021p23.m6537c0(objM6514H13);
                    }
                    c6021p23.m6553p(false);
                    AbstractC10859d.m11284a(z14, (InterfaceC1436k) objM6514H13, null, null, false, null, null, c6021p23, 0, 124);
                }
                return c17296c;
            case 28:
                return m990a(obj, obj2);
            default:
                C6021p c6021p24 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p24.m6562y()) {
                    c6021p24.m6517L();
                } else {
                    c6021p24.m6524S(1849432615);
                    InterfaceC7678d interfaceC7678d = (InterfaceC7678d) obj5;
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj4;
                    boolean zM6542f9 = c6021p24.m6542f(interfaceC7678d) | c6021p24.m6542f(interfaceC1426a2);
                    Object objM6514H14 = c6021p24.m6514H();
                    if (zM6542f9 || objM6514H14 == obj3) {
                        objM6514H14 = new C4714D(interfaceC7678d, i12, interfaceC1426a2);
                        c6021p24.m6537c0(objM6514H14);
                    }
                    c6021p24.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H14, null, false, null, null, null, null, null, null, AbstractC7676b.f24203a, c6021p24, 805306368, 510);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349j(C21778h c21778h, C13489g c13489g) {
        super(2);
        this.f1208Y = 1;
        this.f1209Z = c21778h;
        this.f1210o0 = c13489g;
    }
}
