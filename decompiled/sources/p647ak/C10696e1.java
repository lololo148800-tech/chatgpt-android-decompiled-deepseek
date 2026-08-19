package p647ak;

import af.C10564U;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ck.C11772i;
import ck.C11773j;
import ck.InterfaceC11764a;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import dk.C13180b;
import dk.C13181c;
import fk.InterfaceC13680a;
import id.C14970i;
import io.sentry.internal.debugmeta.C15384c;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import mk.C17280a;
import mk.C17282c;
import mm.C17296C;
import mm.C17312o;
import mm.C17314q;
import p006A4.C0362w;
import p021Aj.C0519d;
import p025An.C0644w;
import p026Ao.C0678l;
import p045Bj.C1307e;
import p045Bj.C1311i;
import p092Dc.C1992i;
import p1113xn.AbstractC21322p;
import p1131yj.InterfaceC21546a;
import p117Eb.C2392v;
import p126Ek.C2574g;
import p126Ek.InterfaceC2568a;
import p147Fh.C2750g;
import p150Fk.AbstractC2894b;
import p178H.C3124Q;
import p225Im.C3743B;
import p247Jj.C4373B;
import p248Jk.InterfaceC4478i;
import p408Qj.C6742h;
import p437Rn.C6959q;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8138m0;
import p523V9.AbstractC8162p0;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8215v5;
import p531Vj.AbstractC8367f0;
import p531Vj.C8361c0;
import p531Vj.EnumC8334D;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8554S3;
import p544W9.AbstractC8694q;
import p547Wc.C8816z;
import p552Wg.C8847i;
import p571X9.AbstractC9306j0;
import p720e6.C13288c;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p729ej.C13421l;
import p729ej.C13424o;
import p729ej.InterfaceC13427r;
import p770gk.InterfaceC14185a;
import p839jk.C16240A;
import p839jk.C16241B;
import p839jk.C16242C;
import p839jk.C16243D;
import p839jk.C16251h;
import p839jk.C16266w;
import p839jk.C16269z;
import p856kk.C16433a;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p949pj.C18428A;
import p949pj.C18433F;
import p949pj.C18470i0;
import p993rj.C19026F;
import sj.C19661b;
import tj.EnumC19999a;

/* JADX INFO: renamed from: ak.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10696e1 extends AbstractC13422m implements InterfaceC13680a {

    /* JADX INFO: renamed from: a */
    public final Context f31778a;

    /* JADX INFO: renamed from: b */
    public final C11773j f31779b;

    /* JADX INFO: renamed from: c */
    public final C13288c f31780c;

    /* JADX INFO: renamed from: d */
    public final C10633B f31781d;

    /* JADX INFO: renamed from: e */
    public final C10645H f31782e;

    /* JADX INFO: renamed from: f */
    public final C8361c0 f31783f;

    /* JADX INFO: renamed from: g */
    public final C13181c f31784g;

    /* JADX INFO: renamed from: h */
    public final C18433F f31785h;

    /* JADX INFO: renamed from: i */
    public final C19026F f31786i;

    /* JADX INFO: renamed from: j */
    public final C19661b f31787j;

    /* JADX INFO: renamed from: k */
    public final C17282c f31788k;

    /* JADX INFO: renamed from: l */
    public final C16251h f31789l;

    public C10696e1(Context context, C11773j submitVerificationWorker, C13288c c13288c, C10633B selfieAnalyzeWorker, C10645H c10645h, C8361c0 c8361c0, C13181c c13181c, C18433F cameraXControllerFactory, C19026F camera2ManagerFactoryFactory, C19661b c19661b, C17282c navigationStateManager, C16251h externalEventLogger) throws IllegalAccessException, InstantiationException {
        Class<?> cls;
        AbstractC16544l.m18094g(submitVerificationWorker, "submitVerificationWorker");
        AbstractC16544l.m18094g(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        AbstractC16544l.m18094g(externalEventLogger, "externalEventLogger");
        this.f31778a = context;
        this.f31779b = submitVerificationWorker;
        this.f31780c = c13288c;
        this.f31781d = selfieAnalyzeWorker;
        this.f31782e = c10645h;
        this.f31783f = c8361c0;
        this.f31784g = c13181c;
        this.f31785h = cameraXControllerFactory;
        this.f31786i = camera2ManagerFactoryFactory;
        this.f31787j = c19661b;
        this.f31788k = navigationStateManager;
        this.f31789l = externalEventLogger;
        C17314q c17314q = AbstractC2894b.f8701a;
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            cls.newInstance();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final C10672V m11019e(C10696e1 c10696e1, AbstractC10712k0 abstractC10712k0, C10730t0 c10730t0, AbstractC10729t abstractC10729t, C18428A c18428a) {
        AbstractC10712k0 c10698f0;
        c10696e1.getClass();
        InterfaceC10717n interfaceC10717n = (InterfaceC10717n) abstractC10712k0;
        if (interfaceC10717n.mo11009c().size() > 1) {
            InterfaceC10717n interfaceC10717n2 = (InterfaceC10717n) abstractC10712k0;
            c10698f0 = new C10689c0(AbstractC17680n.m19362l0(abstractC10712k0.mo11015j(), abstractC10729t), AbstractC17680n.m19336L(interfaceC10717n2.mo11009c(), 1), interfaceC10717n2.mo11008b(), c18428a, interfaceC10717n2.mo11013h(), abstractC10712k0.mo11014i());
        } else if (c10696e1.m11025k(c10730t0) == EnumC19999a.f63315Z) {
            c10698f0 = new C10678Y(AbstractC17680n.m19362l0(abstractC10712k0.mo11015j(), abstractC10729t), 3000L, false, false, c18428a, ((InterfaceC10717n) abstractC10712k0).mo11013h(), abstractC10712k0.mo11014i());
        } else if (c10696e1.m11025k(c10730t0) == EnumC19999a.f63314Y) {
            c10698f0 = new C10680Z(AbstractC17680n.m19362l0(abstractC10712k0.mo11015j(), abstractC10729t), c18428a, ((InterfaceC10717n) abstractC10712k0).mo11013h(), abstractC10712k0.mo11014i());
        } else {
            c10698f0 = new C10698f0(((InterfaceC10717n) abstractC10712k0).mo11013h(), abstractC10712k0.mo11014i(), null, AbstractC17680n.m19362l0(abstractC10712k0.mo11015j(), abstractC10729t), c18428a);
        }
        return new C10672V(c10698f0, interfaceC10717n.mo11011f(), abstractC10712k0.mo11014i());
    }

    /* JADX INFO: renamed from: f */
    public static final void m11020f(C10696e1 c10696e1, C13421l c13421l, Throwable th2) {
        String message;
        c10696e1.getClass();
        String message2 = th2.getMessage();
        if (message2 != null && AbstractC21322p.m21667A(message2, "ENOSPC", false)) {
            c10696e1.m11024h(c13421l, new C10736w0(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th2 instanceof C3124Q)) {
            c10696e1.m11024h(c13421l, new C10736w0(new InternalErrorInfo.UnknownErrorInfo(AbstractC9306j0.m9889h("Unknown error. Type: ", th2.getClass().getCanonicalName()))));
            return;
        }
        Throwable cause = th2.getCause();
        if (cause == null || (message = cause.getMessage()) == null || !AbstractC21322p.m21667A(message, "ENOSPC", false)) {
            c10696e1.m11024h(c13421l, new C10736w0(new InternalErrorInfo.UnknownErrorInfo(AbstractC9306j0.m9889h("Unknown error. Type: ", th2.getClass().getCanonicalName()))));
        } else {
            c10696e1.m11024h(c13421l, new C10736w0(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m11021i(EnumC10647I enumC10647I, C10728s0 c10728s0) {
        int iOrdinal = enumC10647I.ordinal();
        String str = c10728s0.f31872g;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 7:
            case 8:
                return str;
            case 1:
                return c10728s0.f31873h;
            case 2:
                return c10728s0.f31874i;
            case 3:
                return c10728s0.f31875j;
            case 4:
                return c10728s0.f31876k;
            case 6:
                return c10728s0.f31877l;
            default:
                throw new C0644w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static AbstractC8554S3 m11022j(AbstractC10712k0 abstractC10712k0) {
        AbstractC8554S3 c16243d;
        if (abstractC10712k0 instanceof C10686b0) {
            return C16242C.f50367a;
        }
        if (abstractC10712k0 instanceof C10689c0) {
            EnumC10723q enumC10723qMo11012g = ((C10689c0) abstractC10712k0).mo11012g();
            c16243d = new C16240A(enumC10723qMo11012g != null ? AbstractC10661P.m11004a(enumC10723qMo11012g) : null);
        } else {
            if (!(abstractC10712k0 instanceof InterfaceC10715m)) {
                if (abstractC10712k0 instanceof C10672V) {
                    return m11022j(((C10672V) abstractC10712k0).f31682Y);
                }
                if (abstractC10712k0 instanceof C10678Y ? true : abstractC10712k0 instanceof C10680Z ? true : abstractC10712k0 instanceof C10710j0) {
                    return C16269z.f50399a;
                }
                if (abstractC10712k0 instanceof C10698f0) {
                    return C16241B.f50366a;
                }
                throw new C0644w();
            }
            EnumC10723q enumC10723qMo11012g2 = ((InterfaceC10715m) abstractC10712k0).mo11012g();
            c16243d = new C16243D(enumC10723qMo11012g2 != null ? AbstractC10661P.m11004a(enumC10723qMo11012g2) : null);
        }
        return c16243d;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        Parcelable parcelable;
        C10730t0 props = (C10730t0) obj;
        AbstractC16544l.m18094g(props, "props");
        if (c13420k != null) {
            C0678l c0678lM14962a = c13420k.m14962a();
            if (c0678lM14962a.mo1372d() <= 0) {
                c0678lM14962a = null;
            }
            if (c0678lM14962a == null) {
                parcelable = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC16544l.m18093f(parcelObtain, "obtain()");
                byte[] bArrMo1382q = c0678lM14962a.mo1382q();
                parcelObtain.unmarshall(bArrMo1382q, 0, bArrMo1382q.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(C13420k.class.getClassLoader());
                AbstractC16544l.m18091d(parcelable);
                parcelObtain.recycle();
            }
            AbstractC10712k0 abstractC10712k0 = (AbstractC10712k0) parcelable;
            if (abstractC10712k0 != null) {
                return abstractC10712k0;
            }
        }
        return props.f31891i ? new C10701g0(false, false, null, props.f31894l) : new C10686b0(null);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        boolean z6;
        boolean z10;
        Object c10658n0;
        C10652K0 c10652k0;
        EnumC10650J0 enumC10650J0;
        String strM11021i;
        EnumC10650J0 enumC10650J1;
        boolean z11;
        AbstractC8170q0 c10632a0;
        EnumC10650J0 enumC10650J2;
        AbstractC8170q0 c10634b0;
        String strM11021i2;
        String strM11021i3;
        String strM11021i4;
        AbstractC8170q0 c10632a1;
        AbstractC8170q0 c10638d0;
        EnumC10649J enumC10649J;
        String str;
        EnumC10650J0 enumC10650J3;
        Context context;
        UiComponentConfig.RemoteImage selfiePictograph;
        UiComponentConfig.RemoteImage remoteImage;
        C10730t0 renderProps = (C10730t0) obj;
        AbstractC10712k0 renderState = (AbstractC10712k0) obj2;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        boolean z12 = renderState instanceof C10670U;
        if (z12 ? true : renderState instanceof C10672V ? true : renderState instanceof C10674W ? true : renderState instanceof C10676X ? true : renderState instanceof C10689c0 ? true : renderState instanceof C10692d0 ? true : renderState instanceof C10695e0 ? true : renderState instanceof C10701g0 ? true : renderState instanceof C10704h0 ? true : renderState instanceof C10680Z ? true : renderState instanceof C10710j0 ? true : renderState instanceof C10678Y) {
            z6 = true;
        } else {
            if (!(renderState instanceof C10686b0 ? true : renderState instanceof C10683a0 ? true : renderState instanceof C10698f0)) {
                throw new C0644w();
            }
            z6 = false;
        }
        if (!z6) {
            c13421l.mo3410z("close_camera", new C10660O0(this, null));
        }
        VideoCaptureConfig videoCaptureConfig = renderProps.f31904v;
        Context context2 = this.f31778a;
        Serializable serializableM14562a = videoCaptureConfig.m14562a(context2);
        if (C17312o.m18979a(serializableM14562a) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            c13421l.mo3410z("output_webrtc_error", new C10664Q0(c13421l, this, null));
        }
        boolean z13 = renderState instanceof C10698f0;
        C17282c c17282c = this.f31788k;
        c17282c.f55098d = renderProps.f31887e;
        c17282c.f55099e = renderProps.f31888f;
        c17282c.f55100f = !z13;
        c17282c.m18976b();
        this.f31789l.m17811a(new C16266w(renderProps.f31886d, m11022j(renderState)));
        boolean z14 = renderState instanceof C10686b0;
        C10722p0 c10722p0 = C10722p0.f31853a;
        NextStep.Selfie.AssetConfig assetConfig = renderProps.f31905w;
        AbstractC8162p0 abstractC8162p0 = renderProps.f31893k;
        C10728s0 c10728s0 = renderProps.f31892j;
        if (z14) {
            C17280a c17280aM18975a = c17282c.m18975a();
            if (abstractC8162p0.equals(C10720o0.f31848a)) {
                NextStep.Selfie.AssetConfig.PromptPage promptPage = assetConfig.getPromptPage();
                if (promptPage != null) {
                    selfiePictograph = promptPage.getSelfieCenterPictograph();
                    remoteImage = selfiePictograph;
                } else {
                    remoteImage = null;
                }
            } else {
                if (!(abstractC8162p0.equals(C10724q0.f31858a) ? true : abstractC8162p0.equals(c10722p0))) {
                    throw new C0644w();
                }
                NextStep.Selfie.AssetConfig.PromptPage promptPage2 = assetConfig.getPromptPage();
                if (promptPage2 != null) {
                    selfiePictograph = promptPage2.getSelfiePictograph();
                    remoteImage = selfiePictograph;
                } else {
                    remoteImage = null;
                }
            }
            c10658n0 = new C10654L0(c10728s0.f31866a, c10728s0.f31867b, c10728s0.f31868c, c10728s0.f31869d, renderProps.f31903u, remoteImage, c17280aM18975a, new C10667S0(c13421l, this, renderProps, 6), new C10665R0(c13421l, this, 11), new C10665R0(this, c13421l, 12));
        } else {
            boolean z15 = renderState instanceof C10704h0;
            String str2 = c10728s0.f31870e;
            if (z15) {
                AbstractC8215v5.m8843e(c13421l, new C2574g((InterfaceC2568a) this.f31780c.f42001Y, videoCaptureConfig.f40859d), AbstractC16526C.m18075c(C2574g.class), "", new C1307e((AbstractC13422m) this, renderState, (Object) renderProps, c13421l, 18));
                EnumC10650J0 enumC10650J4 = EnumC10650J0.f31597Y;
                c10652k0 = new C10652K0(str2, null, new C10648I0(videoCaptureConfig.f40856a, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 22), new C10665R0(this, c13421l, 23), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 11), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
            } else if (renderState instanceof C10701g0) {
                C10701g0 c10701g0 = (C10701g0) renderState;
                C2750g c2750g = new C2750g(c13421l, this, renderProps, c10701g0, System.currentTimeMillis(), 2);
                EnumC10650J0 enumC10650J5 = EnumC10650J0.f31597Y;
                C10652K0 c10652k1 = new C10652K0(str2, null, new C10644G0(c2750g, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 20), new C10665R0(this, c13421l, 21), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 10), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                C8361c0 c8361c0 = this.f31783f;
                if (!c10701g0.f31801Y) {
                    EnumC8334D enumC8334D = EnumC8334D.f25983Y;
                    String str3 = renderProps.f31895m;
                    String str4 = str3 == null ? "" : str3;
                    String string = renderProps.f31896n;
                    if (string == null) {
                        context = context2;
                        string = context.getString(R.string.pi2_selfie_camera_permission_rationale);
                        AbstractC16544l.m18093f(string, "getString(...)");
                    } else {
                        context = context2;
                    }
                    String str5 = string;
                    String string2 = context.getString(R.string.pi2_selfie_camera_permission_denied_rationale, AbstractC8012V5.m8329b(context));
                    AbstractC16544l.m18093f(string2, "getString(...)");
                    c10658n0 = AbstractC8367f0.m8940c(c10652k1, c13421l, true, enumC8334D, false, str4, str5, string2, renderProps.f31897o, renderProps.f31898p, null, null, null, c8361c0, renderProps.f31903u, (19976 & 16384) != 0 ? "" : null, new C10687b1(this, c10701g0, renderProps, c13421l, 0));
                } else if (!c10701g0.f31802Z && m11023g(renderProps) && AbstractC8012V5.m8333f(context2) && videoCaptureConfig.f40860e) {
                    EnumC8334D enumC8334D2 = EnumC8334D.f25984Z;
                    String string3 = renderProps.f31900r;
                    if (string3 == null) {
                        string3 = context2.getString(R.string.pi2_selfie_mic_permission_rationale);
                        AbstractC16544l.m18093f(string3, "getString(...)");
                    }
                    String str6 = string3;
                    String string4 = context2.getString(R.string.pi2_selfie_mic_permission_denied_rationale, AbstractC8012V5.m8329b(context2));
                    String str7 = renderProps.f31899q;
                    String str8 = str7 == null ? "" : str7;
                    AbstractC16544l.m18091d(string4);
                    c10658n0 = AbstractC8367f0.m8940c(c10652k1, c13421l, true, enumC8334D2, false, str8, str6, string4, renderProps.f31901s, renderProps.f31902t, null, null, null, c8361c0, renderProps.f31903u, (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new C10687b1(this, c10701g0, renderProps, c13421l, 1));
                } else {
                    c10658n0 = c10652k1;
                }
            } else if (renderState instanceof C10683a0) {
                c10658n0 = new C10656M0(new C10667S0(c13421l, this, renderProps, 5));
            } else {
                boolean z16 = renderState instanceof C10689c0;
                String str9 = c10728s0.f31878m;
                String str10 = c10728s0.f31879n;
                if (z16) {
                    C10689c0 c10689c0 = (C10689c0) renderState;
                    int iOrdinal = ((EnumC10723q) AbstractC17680n.m19341Q(c10689c0.f31745Z)).ordinal();
                    if (iOrdinal == 0) {
                        throw new IllegalStateException("Pose hint cannot be shown for center pose");
                    }
                    if (iOrdinal == 1) {
                        enumC10649J = EnumC10649J.f31594Y;
                    } else {
                        if (iOrdinal != 2) {
                            throw new C0644w();
                        }
                        enumC10649J = EnumC10649J.f31595Z;
                    }
                    int iOrdinal2 = enumC10649J.ordinal();
                    if (iOrdinal2 == 0) {
                        str = c10728s0.f31877l;
                    } else if (iOrdinal2 == 1) {
                        str = str9;
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new C0644w();
                        }
                        str = str10;
                    }
                    int iOrdinal3 = enumC10649J.ordinal();
                    if (iOrdinal3 == 0) {
                        enumC10650J3 = EnumC10650J0.f31598Z;
                    } else if (iOrdinal3 == 1) {
                        enumC10650J3 = EnumC10650J0.f31600p0;
                    } else {
                        if (iOrdinal3 != 2) {
                            throw new C0644w();
                        }
                        enumC10650J3 = EnumC10650J0.f31603s0;
                    }
                    c10658n0 = new C10652K0(str2, str, new C10642F0(new C6959q(c13421l, this, c10689c0, 12), enumC10650J3, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 13), new C10665R0(this, c13421l, 14), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 7), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                } else {
                    boolean z17 = renderState instanceof C10692d0;
                    C10645H c10645h = this.f31782e;
                    if (z17) {
                        C10692d0 c10692d0 = (C10692d0) renderState;
                        AbstractC8215v5.m8843e(c13421l, c10645h, AbstractC16526C.m18075c(C10645H.class), "", new C8847i(this, 13, c10692d0));
                        EnumC10723q enumC10723qMo11011f = c10692d0.mo11011f();
                        boolean zM8671f = AbstractC8138m0.m8671f(c10692d0);
                        if (!zM8671f) {
                            C16556x c16556x = new C16556x();
                            c16556x.f51285Y = true;
                            c13421l.mo3410z("check_if_manual_capture_enabled", new C10693d1(c16556x, c13421l, this, null));
                        }
                        EnumC10650J0 enumC10650J6 = c10692d0.f31757Y ? EnumC10650J0.f31598Z : EnumC10650J0.f31597Y;
                        EnumC10647I enumC10647I = c10692d0.f31758Z;
                        if (enumC10647I == null || (strM11021i4 = m11021i(enumC10647I, c10728s0)) == null) {
                            strM11021i4 = c10728s0.f31871f;
                        }
                        String str11 = strM11021i4;
                        if (zM8671f) {
                            if (m11023g(renderProps)) {
                                c10632a1 = new C10640E0(new C6959q(c13421l, this, c10692d0, 13), enumC10650J6, !abstractC8162p0.equals(c10722p0));
                            } else {
                                c10638d0 = new C10638D0(new C0362w(enumC10723qMo11011f, c13421l, this, c10692d0, renderProps, 9), new C10669T0(this, c13421l, 2), false, enumC10650J6, !abstractC8162p0.equals(c10722p0));
                            }
                            c10658n0 = new C10652K0(str2, str11, c10638d0, renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 15), new C10665R0(this, c13421l, 16), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 8), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else {
                            c10632a1 = new C10632A0(enumC10650J6, !abstractC8162p0.equals(c10722p0));
                        }
                        c10638d0 = c10632a1;
                        c10658n0 = new C10652K0(str2, str11, c10638d0, renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 15), new C10665R0(this, c13421l, 16), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 8), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                    } else if (renderState instanceof C10695e0) {
                        C10695e0 c10695e0 = (C10695e0) renderState;
                        AbstractC8215v5.m8843e(c13421l, c10645h, AbstractC16526C.m18075c(C10645H.class), "", new C10681Z0(this, c10695e0, 0));
                        InterfaceC13427r.f42512a.getClass();
                        C13424o c13424o = new C13424o(1000L, "");
                        C10681Z0 c10681z0 = new C10681Z0(this, c10695e0, 1);
                        C3743B c3743b = C3743B.f11391c;
                        AbstractC8215v5.m8843e(c13421l, c13424o, AbstractC16526C.m18076d(InterfaceC13427r.class, AbstractC8443A.m9046b(AbstractC16526C.m18075c(C17296C.class))), "", c10681z0);
                        c10652k0 = new C10652K0(str2, c10728s0.f31880o, new C10632A0(EnumC10650J0.f31598Z, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 17), new C10665R0(this, c13421l, 18), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 9), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                    } else {
                        boolean z18 = renderState instanceof C10674W;
                        String str12 = c10728s0.f31872g;
                        if (z18) {
                            C10674W c10674w = (C10674W) renderState;
                            AbstractC8215v5.m8843e(c13421l, c10645h, AbstractC16526C.m18075c(C10645H.class), "", new C10662P0(this, 1));
                            c13421l.mo3410z("countdown_" + c10674w.f31689Y, new C10673V0(c13421l, this, c10674w, null));
                            EnumC10647I enumC10647I2 = c10674w.f31690Z;
                            c10658n0 = new C10652K0(str2, (enumC10647I2 == null || (strM11021i3 = m11021i(enumC10647I2, c10728s0)) == null) ? str12 : strM11021i3, new C10634B0(c10674w.f31689Y, m11025k(renderProps) == EnumC19999a.f63315Z, videoCaptureConfig.f40856a, EnumC10650J0.f31598Z, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 5), new C10665R0(this, c13421l, 6), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 2), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else if (renderState instanceof C10676X) {
                            C10676X c10676x = (C10676X) renderState;
                            EnumC10723q enumC10723q = (EnumC10723q) AbstractC17680n.m19341Q(c10676x.f31702p0);
                            int iOrdinal4 = enumC10723q.ordinal();
                            if (iOrdinal4 == 0) {
                                enumC10650J2 = EnumC10650J0.f31598Z;
                            } else if (iOrdinal4 == 1) {
                                enumC10650J2 = EnumC10650J0.f31601q0;
                            } else {
                                if (iOrdinal4 != 2) {
                                    throw new C0644w();
                                }
                                enumC10650J2 = EnumC10650J0.f31604t0;
                            }
                            EnumC10650J0 enumC10650J7 = enumC10650J2;
                            c13421l.mo3410z("countdown_to_manual_capture_" + c10676x.f31699Y, new C10675W0(c13421l, this, null));
                            EnumC10647I enumC10647I3 = c10676x.f31700Z;
                            String str13 = (enumC10647I3 == null || (strM11021i2 = m11021i(enumC10647I3, c10728s0)) == null) ? str12 : strM11021i2;
                            int i10 = c10676x.f31699Y;
                            if (i10 == 0) {
                                c10634b0 = new C10638D0(new C0362w(enumC10723q, c13421l, this, c10676x, renderProps, 8), new C10669T0(this, c13421l, 1), true, enumC10650J7, true ^ abstractC8162p0.equals(c10722p0));
                            } else {
                                c10634b0 = new C10634B0(i10, m11025k(renderProps) == EnumC19999a.f63315Z, videoCaptureConfig.f40856a, enumC10650J7, !abstractC8162p0.equals(c10722p0));
                            }
                            c10658n0 = new C10652K0(str2, str13, c10634b0, renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 7), new C10665R0(this, c13421l, 8), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 3), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else if (z12) {
                            C10670U c10670u = (C10670U) renderState;
                            EnumC10723q enumC10723q2 = (EnumC10723q) AbstractC17680n.m19341Q(c10670u.f31670Z);
                            C15384c c15384c = this.f31781d.f31549a;
                            AbstractC8215v5.m8843e(c13421l, new C10631A(C4373B.m5169a(((C4373B) c15384c.f47967Z).f14241b), (C18470i0) ((C14970i) c15384c.f47968o0).get(), enumC10723q2), AbstractC16526C.m18075c(C10631A.class), "", new C1307e((AbstractC13422m) this, (Object) c10670u, (Object) renderProps, c13421l, 14));
                            if (enumC10723q2 == EnumC10723q.f31855Z) {
                                strM11021i = str9;
                            } else if (enumC10723q2 == EnumC10723q.f31856o0) {
                                strM11021i = str10;
                            } else {
                                EnumC10647I enumC10647I4 = c10670u.f31671o0;
                                if (enumC10647I4 != null) {
                                    strM11021i = m11021i(enumC10647I4, c10728s0);
                                } else {
                                    strM11021i = enumC10723q2 == EnumC10723q.f31854Y ? str12 : null;
                                }
                            }
                            int iOrdinal5 = enumC10723q2.ordinal();
                            if (iOrdinal5 == 0) {
                                enumC10650J1 = EnumC10650J0.f31598Z;
                            } else if (iOrdinal5 == 1) {
                                enumC10650J1 = EnumC10650J0.f31601q0;
                            } else {
                                if (iOrdinal5 != 2) {
                                    throw new C0644w();
                                }
                                enumC10650J1 = EnumC10650J0.f31604t0;
                            }
                            EnumC10650J0 enumC10650J8 = enumC10650J1;
                            if (AbstractC8138m0.m8671f(c10670u)) {
                                c10632a0 = new C10638D0(new C0362w(enumC10723q2, c13421l, this, c10670u, renderProps, 7), new C10669T0(this, c13421l, 0), false, enumC10650J8, !abstractC8162p0.equals(c10722p0));
                                z11 = true;
                            } else {
                                z11 = true;
                                c10632a0 = new C10632A0(enumC10650J8, !abstractC8162p0.equals(c10722p0));
                            }
                            if (!AbstractC8138m0.m8671f(c10670u)) {
                                C16556x c16556x2 = new C16556x();
                                c16556x2.f51285Y = z11;
                                c13421l.mo3410z("check_if_manual_capture_enabled", new C10693d1(c16556x2, c13421l, this, null));
                            }
                            c10658n0 = new C10652K0(str2, strM11021i, c10632a0, renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 0), new C10665R0(this, c13421l, 1), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 0), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else if (renderState instanceof C10672V) {
                            C10672V c10672v = (C10672V) renderState;
                            if (c10672v.f31682Y instanceof C10698f0) {
                                enumC10650J0 = EnumC10650J0.f31607w0;
                            } else {
                                int iOrdinal6 = c10672v.f31683Z.ordinal();
                                if (iOrdinal6 == 0) {
                                    enumC10650J0 = EnumC10650J0.f31599o0;
                                } else if (iOrdinal6 == 1) {
                                    enumC10650J0 = EnumC10650J0.f31602r0;
                                } else {
                                    if (iOrdinal6 != 2) {
                                        throw new C0644w();
                                    }
                                    enumC10650J0 = EnumC10650J0.f31605u0;
                                }
                            }
                            c10652k0 = new C10652K0(str2, null, new C10646H0(new C10665R0(c13421l, this, 2), true, enumC10650J0, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 3), new C10665R0(this, c13421l, 4), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 1), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else if (renderState instanceof C10678Y) {
                            C10678Y c10678y = (C10678Y) renderState;
                            C13181c c13181c = this.f31784g;
                            c13421l.mo3410z("finalize_delay", new C13180b(c10678y, c13421l, null));
                            c10658n0 = new C10652K0(str2, null, new C10636C0(new C1311i(c13421l, 4), new C8816z(c13421l, 15, c10678y), c10678y.f31710o0, c10678y.f31711p0 ? EnumC10650J0.f31608x0 : EnumC10650J0.f31606v0, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c13181c.f41834d.m18975a(), new C0519d(c13421l, 6), new C0519d(c13421l, 7), AbstractC10708i1.m11028b(c13421l), new C6959q(c13181c, c13421l, renderProps, 17), EnumC19999a.f63315Z, videoCaptureConfig.f40860e, c13181c.f41832b, c13181c.f41833c);
                        } else if (renderState instanceof C10680Z) {
                            c10652k0 = new C10652K0(str2, null, new C10646H0(C10677X0.f31707Y, false, EnumC10650J0.f31606v0, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 9), new C10665R0(this, c13421l, 10), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 4), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else if (renderState instanceof C10710j0) {
                            c10652k0 = new C10652K0(str2, null, new C10646H0(new C6959q(c13421l, this, (C10710j0) renderState, 14), false, EnumC10650J0.f31608x0, !abstractC8162p0.equals(c10722p0)), renderProps.f31903u, AbstractC10708i1.m11031e(renderProps), renderProps.f31890h, c17282c.m18975a(), new C10665R0(c13421l, this, 24), new C10665R0(this, c13421l, 25), AbstractC10708i1.m11028b(c13421l), new C10667S0(this, c13421l, renderProps, 12), m11025k(renderProps), videoCaptureConfig.f40860e, this.f31785h, this.f31786i);
                        } else {
                            if (!z13) {
                                throw new C0644w();
                            }
                            C10698f0 c10698f0 = (C10698f0) renderState;
                            C2392v c2392v = this.f31779b.f35712a;
                            AbstractC8215v5.m8843e(c13421l, new C11772i(C4373B.m5169a(((C4373B) c2392v.f7436Z).f14241b), renderProps.f31883a, renderProps.f31884b, abstractC8162p0, c10698f0.f31793Y, (InterfaceC11764a) ((InterfaceC4478i) c2392v.f7437o0).get(), renderProps.f31886d, renderProps.f31885c, renderProps.f31889g, (InterfaceC14185a) ((C1992i) c2392v.f7438p0).get(), (InterfaceC21546a) ((InterfaceC4478i) c2392v.f7439q0).get(), (C16433a) ((InterfaceC4478i) c2392v.f7440r0).get(), c10698f0.f31794Z, c10698f0.f31795o0, c10698f0.f31796p0), AbstractC16526C.m18075c(C11772i.class), "", new C10669T0(this, c13421l, 4));
                            C10665R0 c10665r0 = new C10665R0(this, c13421l, 19);
                            NextStep.Selfie.AssetConfig.RecordPage recordPage = assetConfig.getRecordPage();
                            c10658n0 = new C10658N0(c10728s0.f31881p, c10728s0.f31882q, renderProps.f31906x, renderProps.f31903u, c10665r0, recordPage != null ? recordPage.getLoadingPictograph() : null);
                        }
                    }
                }
            }
            c10658n0 = c10652k0;
        }
        return c10658n0 instanceof C10652K0 ? new C6742h(c10658n0, "PermissionFlowModal", C17689w.f56480Y) : c10658n0;
    }

    @Override // fk.InterfaceC13680a
    public final void close() {
        C19661b c19661b = this.f31787j;
        c19661b.f62316c = 0L;
        c19661b.f62317d = 0.0d;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC10712k0 state = (AbstractC10712k0) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11023g(C10730t0 c10730t0) {
        Serializable serializableM14562a = c10730t0.f31904v.m14562a(this.f31778a);
        if (C17312o.m18979a(serializableM14562a) == null) {
            return ((Boolean) serializableM14562a).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m11024h(C13421l c13421l, AbstractC10740y0 abstractC10740y0) {
        if (!(abstractC10740y0 instanceof C10738x0) && !(abstractC10740y0 instanceof C10732u0)) {
            boolean z6 = abstractC10740y0 instanceof C10736w0;
        }
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this, new C10564U(abstractC10740y0, 10)));
    }

    /* JADX INFO: renamed from: k */
    public final EnumC19999a m11025k(C10730t0 c10730t0) {
        Serializable serializableM14563b = c10730t0.f31904v.m14563b(this.f31778a);
        return C17312o.m18979a(serializableM14563b) == null ? (EnumC19999a) serializableM14563b : EnumC19999a.f63316o0;
    }
}
