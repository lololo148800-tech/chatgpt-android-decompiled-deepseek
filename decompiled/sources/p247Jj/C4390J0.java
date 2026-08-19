package p247Jj;

import android.os.Parcel;
import android.os.Parcelable;
import com.statsig.androidsdk.StatsigLoggerKt;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import fk.InterfaceC13680a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import mk.C17282c;
import mm.C17309l;
import p002A0.C0146w;
import p003A1.C0155B1;
import p003A1.C0286s;
import p025An.C0644w;
import p026Ao.C0678l;
import p046Bk.C1360X0;
import p046Bk.C1393l0;
import p1044uj.C20316S;
import p1044uj.C20359r0;
import p1044uj.C20362t;
import p1044uj.EnumC20325a0;
import p110E4.C2307e;
import p1156zj.AbstractC22200v;
import p1156zj.C22107K0;
import p1156zj.C22130W0;
import p1156zj.C22192s0;
import p1156zj.C22195t0;
import p1156zj.EnumC22128V0;
import p117Eb.C2392v;
import p193Hf.C3350b0;
import p197Hj.C3457c;
import p248Jk.InterfaceC4478i;
import p320Mj.C5461n;
import p342Nj.AbstractC5807a;
import p342Nj.C5813g;
import p342Nj.InterfaceC5816j;
import p366Oj.C6263e;
import p523V9.AbstractC8162p0;
import p523V9.AbstractC8215v5;
import p544W9.AbstractC8694q;
import p571X9.AbstractC9393x3;
import p603Yj.C10069b;
import p603Yj.C10072e;
import p647ak.AbstractC10659O;
import p647ak.AbstractC10726r0;
import p647ak.C10696e1;
import p647ak.C10720o0;
import p647ak.C10722p0;
import p647ak.C10724q0;
import p647ak.C10728s0;
import p647ak.C10730t0;
import p647ak.EnumC10723q;
import p658b5.C11234e;
import p658b5.C11242m;
import p720e6.C13288c;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p729ej.C13421l;
import p769gj.C14172n;
import p814ik.C15033e;
import p839jk.C16251h;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p931ok.C18226g;
import p931ok.EnumC18225f;
import pm.C18513a;
import tj.EnumC19999a;

/* JADX INFO: renamed from: Jj.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4390J0 extends AbstractC13422m implements InterfaceC13680a {

    /* JADX INFO: renamed from: a */
    public final C11234e f14259a;

    /* JADX INFO: renamed from: b */
    public final C11242m f14260b;

    /* JADX INFO: renamed from: c */
    public final C4432h f14261c;

    /* JADX INFO: renamed from: d */
    public final C13288c f14262d;

    /* JADX INFO: renamed from: e */
    public final C22107K0 f14263e;

    /* JADX INFO: renamed from: f */
    public final C10696e1 f14264f;

    /* JADX INFO: renamed from: g */
    public final C1360X0 f14265g;

    /* JADX INFO: renamed from: h */
    public final C20359r0 f14266h;

    /* JADX INFO: renamed from: i */
    public final C10069b f14267i;

    /* JADX INFO: renamed from: j */
    public final C2307e f14268j;

    /* JADX INFO: renamed from: k */
    public final C17282c f14269k;

    /* JADX INFO: renamed from: l */
    public final C16251h f14270l;

    public C4390J0(C11234e c11234e, C11242m c11242m, C4432h checkInquiryWorker, C13288c c13288c, C22107K0 c22107k0, C10696e1 c10696e1, C1360X0 c1360x0, C20359r0 c20359r0, C10069b sandboxFlags, C2307e c2307e, C17282c navigationStateManager, C16251h externalEventLogger) {
        AbstractC16544l.m18094g(checkInquiryWorker, "checkInquiryWorker");
        AbstractC16544l.m18094g(sandboxFlags, "sandboxFlags");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        AbstractC16544l.m18094g(externalEventLogger, "externalEventLogger");
        this.f14259a = c11234e;
        this.f14260b = c11242m;
        this.f14261c = checkInquiryWorker;
        this.f14262d = c13288c;
        this.f14263e = c22107k0;
        this.f14264f = c10696e1;
        this.f14265g = c1360x0;
        this.f14266h = c20359r0;
        this.f14267i = sandboxFlags;
        this.f14268j = c2307e;
        this.f14269k = navigationStateManager;
        this.f14270l = externalEventLogger;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m5176e(C4390J0 c4390j0, InternalErrorInfo internalErrorInfo) {
        c4390j0.getClass();
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
            if ((networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final void m5177f(C13421l c13421l, C4390J0 c4390j0, AbstractC4433h0 abstractC4433h0, boolean z6) {
        c13421l.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c4390j0, new C4457t0(abstractC4433h0, z6)));
    }

    /* JADX INFO: renamed from: g */
    public static final C4427e0 m5178g(C4390J0 c4390j0, InterfaceC4396M0 interfaceC4396M0) {
        c4390j0.getClass();
        return new C4427e0(interfaceC4396M0.m5180e(), interfaceC4396M0.m5179a(), interfaceC4396M0.getStyles(), C17062e.f54533o0);
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        Object c4427e0;
        InterfaceC4447o0 props = (InterfaceC4447o0) obj;
        AbstractC16544l.m18094g(props, "props");
        if (c13420k != null) {
            C0678l c0678lM14962a = c13420k.m14962a();
            Parcelable parcelable = null;
            if (c0678lM14962a.mo1372d() <= 0) {
                c0678lM14962a = null;
            }
            if (c0678lM14962a != null) {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC16544l.m18093f(parcelObtain, "obtain()");
                byte[] bArrMo1382q = c0678lM14962a.mo1382q();
                parcelObtain.unmarshall(bArrMo1382q, 0, bArrMo1382q.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(C13420k.class.getClassLoader());
                AbstractC16544l.m18091d(parcelable);
                parcelObtain.recycle();
            }
            AbstractC4433h0 abstractC4433h0 = (AbstractC4433h0) parcelable;
            if (abstractC4433h0 != null) {
                return abstractC4433h0;
            }
        }
        if (props instanceof C4445n0) {
            C4445n0 c4445n0 = (C4445n0) props;
            c4427e0 = new C4414W(c4445n0.f14470a, c4445n0.f14471b, c4445n0.f14472c, c4445n0.f14474e, c4445n0.f14473d, c4445n0.f14475f, c4445n0.f14476g, c4445n0.f14477h, c4445n0.f14478i);
        } else {
            if (!(props instanceof C4443m0)) {
                throw new C0644w();
            }
            C4443m0 c4443m0 = (C4443m0) props;
            String str = c4443m0.f14462a;
            String str2 = c4443m0.f14463b;
            if (str2 == null || str2.length() == 0) {
                return new C4415X(str);
            }
            c4427e0 = new C4427e0(c4443m0.f14463b, new C4407S0(), str, null, true, C17062e.f54533o0);
        }
        return c4427e0;
    }

    /* JADX WARN: Code duplicated, block: B:261:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:262:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:265:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        String str;
        C4411U0 c4411u0;
        AbstractC4433h0 abstractC4433h0;
        EnumC20325a0 enumC20325a0;
        Object c6263e;
        NextStep.C12890Ui.PromptPage promptPage;
        NextStep.C12890Ui.PromptPage promptPage2;
        NextStep.C12890Ui.PromptPage promptPage3;
        NextStep.C12890Ui.PromptPage promptPage4;
        NextStep.C12890Ui.PromptPage promptPage5;
        NextStep.C12890Ui.PromptPage promptPage6;
        NextStep.C12890Ui.PromptPage promptPage7;
        AbstractC8162p0 abstractC8162p0;
        List listM9974d;
        List list;
        int i10;
        EnumC10723q enumC10723q;
        ArrayList arrayList;
        Iterator it;
        Object next;
        String text;
        C18226g c18226g;
        EnumC18225f enumC18225f;
        C4390J0 c4390j0 = this;
        C13421l c13421l2 = c13421l;
        InterfaceC4447o0 renderProps = (InterfaceC4447o0) obj;
        AbstractC4433h0 renderState = (AbstractC4433h0) obj2;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        String strMo5191e = renderState.mo5191e();
        String strMo5190a = renderState.mo5190a();
        String strMo5195c = renderState.mo5195c();
        AbstractC4413V0 abstractC4413V0Mo5192f = renderState.mo5192f();
        boolean z6 = abstractC4413V0Mo5192f instanceof C4407S0;
        C4411U0 c4411u1 = C4411U0.f14312Y;
        if (!z6) {
            str = "";
            c4411u0 = c4411u1;
            if (AbstractC16544l.m18089b(abstractC4413V0Mo5192f, c4411u0) && strMo5191e != null && strMo5190a != null && strMo5195c != null) {
                C17062e inquirySessionConfig = renderState.mo5198d();
                C13288c c13288c = c4390j0.f14262d;
                AbstractC16544l.m18094g(inquirySessionConfig, "inquirySessionConfig");
                AbstractC8215v5.m8843e(c13421l2, new C4405R0(strMo5191e, strMo5190a, strMo5195c, (InterfaceC5816j) c13288c.f42001Y, inquirySessionConfig), AbstractC16526C.m18075c(C4405R0.class), str, new C0146w(c4390j0, renderState, strMo5191e, 23));
            }
        } else if (strMo5191e == null || strMo5190a == null) {
            str = "";
            c4411u0 = c4411u1;
        } else {
            EnumC4392K0 enumC4392K0 = ((C4407S0) abstractC4413V0Mo5192f).f14302Y;
            C17062e c17062eMo5198d = renderState.mo5198d();
            C2392v c2392v = c4390j0.f14261c.f14427a;
            str = "";
            c4411u0 = c4411u1;
            AbstractC8215v5.m8843e(c13421l2, new C4430g(strMo5191e, strMo5190a, enumC4392K0, c17062eMo5198d, C4373B.m5169a(((C4373B) c2392v.f7436Z).f14241b), (InterfaceC5816j) ((InterfaceC4478i) c2392v.f7437o0).get(), (C15033e) ((InterfaceC4478i) c2392v.f7438p0).get(), (C10069b) ((InterfaceC4478i) c2392v.f7439q0).get(), (C5461n) ((InterfaceC4478i) c2392v.f7440r0).get()), AbstractC16526C.m18075c(C4430g.class), str, new C3350b0(c4390j0, 22, strMo5191e));
        }
        boolean zM18089b = AbstractC16544l.m18089b(renderState.mo5192f(), c4411u0);
        C17282c c17282c = c4390j0.f14269k;
        c17282c.f55101g = zM18089b;
        c17282c.m18976b();
        C0155B1 c0155b1 = new C0155B1(c13421l2, c4390j0, renderState, 21);
        c13421l2.mo3410z("controllerRequestCollector", new C4453r0(renderState, c4390j0, c13421l2, null));
        if (renderProps.isCancelled()) {
            c13421l2.mo3410z("cancel_inquiry", new C4455s0(renderState, c4390j0, c13421l2, null));
        }
        if (!(renderState instanceof C4414W)) {
            if (renderState instanceof C4415X) {
                C4415X c4415x = (C4415X) renderState;
                c17282c.f55098d = false;
                c17282c.f55099e = false;
                c17282c.f55100f = true;
                c17282c.m18976b();
                C11242m c11242m = c4390j0.f14260b;
                String inquiryId = c4415x.f14327u0;
                AbstractC16544l.m18094g(inquiryId, "inquiryId");
                AbstractC8215v5.m8843e(c13421l2, new C4442m(inquiryId, (InterfaceC5816j) c11242m.f34018Y, (C15033e) c11242m.f34019Z, (C5461n) c11242m.f34020o0), AbstractC16526C.m18075c(C4442m.class), str, new C3350b0(c4390j0, 16, c4415x));
                c6263e = new C4449p0(c4415x.f14431p0, true, c0155b1);
            } else if (renderState instanceof C4427e0) {
                C4427e0 c4427e0 = (C4427e0) renderState;
                c17282c.f55098d = false;
                c17282c.f55099e = false;
                c17282c.f55100f = true;
                c17282c.m18976b();
                c6263e = new C4449p0(c4427e0.f14393x0, c4427e0.f14394y0, c0155b1);
                abstractC4433h0 = renderState;
            } else if (renderState instanceof C4421b0) {
                C4421b0 c4421b0 = (C4421b0) renderState;
                List list2 = c4421b0.f14340A0;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C22130W0 c22130w0M22400b = AbstractC22200v.m22400b((C12893Id) it2.next(), c4421b0.f14366z0, c4421b0.f14349J0);
                    if (c22130w0M22400b != null) {
                        arrayList2.add(c22130w0M22400b);
                    }
                }
                List list3 = c4421b0.f14346G0;
                List listM19370t0 = list3 != null ? AbstractC17680n.m19370t0(list3, C18513a.f58996o0) : null;
                NextStep.GovernmentId.Localizations localizations = c4421b0.f14345F0;
                AbstractC16544l.m18094g(localizations, "<this>");
                String title = localizations.getSelectPage().getTitle();
                String prompt = localizations.getSelectPage().getPrompt();
                String choose = localizations.getSelectPage().getChoose();
                String disclaimer = localizations.getSelectPage().getDisclaimer();
                String str2 = disclaimer == null ? str : disclaimer;
                LinkedHashMap linkedHashMapM6190a = AbstractC5807a.m6190a(localizations.getCapturePage().getTitle(), UiComponentConfig.Title.type, "capturePage", listM19370t0);
                NextStep.GovernmentId.CapturePage capturePage = localizations.getCapturePage();
                String str3 = str;
                LinkedHashMap linkedHashMapM6191b = AbstractC5807a.m6191b("capturePage", AbstractC17659D.m19244f(new C17309l(new C17309l(EnumC22128V0.Front, "scanFront"), capturePage.getScanFront()), new C17309l(new C17309l(EnumC22128V0.Back, "scanBack"), capturePage.getScanBack()), new C17309l(new C17309l(EnumC22128V0.BarcodePdf417, "scanPdf417"), capturePage.getScanPdf417()), new C17309l(new C17309l(EnumC22128V0.PassportSignature, "scanSignature"), capturePage.getScanSignature()), new C17309l(new C17309l(EnumC22128V0.FrontOrBack, "scanFrontOrBack"), capturePage.getScanFrontOrBack())), listM19370t0);
                String capturing = localizations.getCapturePage().getCapturing();
                LinkedHashMap linkedHashMapM6190a2 = AbstractC5807a.m6190a(localizations.getCapturePage().getConfirmCapture(), "confirmCapture", "capturePage", listM19370t0);
                String disclaimer2 = localizations.getCapturePage().getDisclaimer();
                String str4 = disclaimer2 == null ? str3 : disclaimer2;
                String buttonSubmit = localizations.getCheckPage().getButtonSubmit();
                String buttonRetake = localizations.getCheckPage().getButtonRetake();
                LinkedHashMap linkedHashMapM6190a3 = AbstractC5807a.m6190a(localizations.getCheckPage().getTitleConfirmCapture(), "titleConfirmCapture", "requestPage", listM19370t0);
                String title2 = localizations.getPendingPage().getTitle();
                String description = localizations.getPendingPage().getDescription();
                Map<String, String> idClassToName = localizations.getSelectPage().getIdClassToName();
                if (listM19370t0 != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : listM19370t0) {
                        if (AbstractC16544l.m18089b(((NextStep.GovernmentId.LocalizationOverride) obj3).getPage(), "selectPage")) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(idClassToName.size()));
                Iterator it3 = idClassToName.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    Object key = entry.getKey();
                    String str5 = (String) entry.getKey();
                    String str6 = (String) entry.getValue();
                    if (arrayList != null) {
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                it = it3;
                                next = null;
                                break;
                            }
                            next = it4.next();
                            NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) next;
                            it = it3;
                            if ((AbstractC16544l.m18089b(localizationOverride.getIdClass(), str5) || localizationOverride.getIdClass() == null) && AbstractC16544l.m18089b(localizationOverride.getKey(), str5)) {
                                break;
                            }
                            it3 = it;
                        }
                        NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) next;
                        if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                            str6 = text;
                        }
                    } else {
                        it = it3;
                    }
                    linkedHashMap.put(key, str6);
                    it3 = it;
                }
                NextStep.GovernmentId.RequestPage requestPage = localizations.getRequestPage();
                EnumC22128V0 enumC22128V0 = EnumC22128V0.Front;
                C17309l c17309l = new C17309l(new C17309l(enumC22128V0, "titleFront"), requestPage.getTitleFront());
                EnumC22128V0 enumC22128V1 = EnumC22128V0.Back;
                C17309l c17309l2 = new C17309l(new C17309l(enumC22128V1, "titleBack"), requestPage.getTitleBack());
                EnumC22128V0 enumC22128V2 = EnumC22128V0.BarcodePdf417;
                C17309l c17309l3 = new C17309l(new C17309l(enumC22128V2, "titlePdf417"), requestPage.getTitlePdf417());
                EnumC22128V0 enumC22128V3 = EnumC22128V0.PassportSignature;
                C4411U0 c4411u2 = c4411u0;
                LinkedHashMap linkedHashMapM6191b2 = AbstractC5807a.m6191b("requestPage", AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l(new C17309l(enumC22128V3, "titlePassportSignature"), requestPage.getTitlePassportSignature())), listM19370t0);
                NextStep.GovernmentId.RequestPage requestPage2 = localizations.getRequestPage();
                LinkedHashMap linkedHashMapM6191b3 = AbstractC5807a.m6191b("requestPage", AbstractC17659D.m19244f(new C17309l(new C17309l(enumC22128V0, "descriptionFront"), requestPage2.getDescriptionFront()), new C17309l(new C17309l(enumC22128V1, "descriptionBack"), requestPage2.getDescriptionBack()), new C17309l(new C17309l(enumC22128V2, "descriptionPdf417"), requestPage2.getDescriptionPdf417()), new C17309l(new C17309l(enumC22128V3, "descriptionPassportSignature"), requestPage2.getDescriptionPassportSignature())), listM19370t0);
                String liveUploadButtonText = localizations.getRequestPage().getLiveUploadButtonText();
                String choosePhotoButtonText = localizations.getRequestPage().getChoosePhotoButtonText();
                NextStep.GovernmentId.ReviewUploadPage reviewUploadPage = localizations.getReviewUploadPage();
                Map mapM19244f = AbstractC17659D.m19244f(new C17309l(enumC22128V0, reviewUploadPage.getTitleFront()), new C17309l(enumC22128V1, reviewUploadPage.getTitleBack()), new C17309l(enumC22128V2, reviewUploadPage.getTitlePdf417()), new C17309l(enumC22128V3, reviewUploadPage.getTitlePassportSignature()));
                NextStep.GovernmentId.ReviewUploadPage reviewUploadPage2 = localizations.getReviewUploadPage();
                Map mapM19244f2 = AbstractC17659D.m19244f(new C17309l(enumC22128V0, reviewUploadPage2.getDescriptionFront()), new C17309l(enumC22128V1, reviewUploadPage2.getDescriptionBack()), new C17309l(enumC22128V2, reviewUploadPage2.getDescriptionPdf417()), new C17309l(enumC22128V3, reviewUploadPage2.getDescriptionPassportSignature()));
                String confirmButtonText = localizations.getReviewUploadPage().getConfirmButtonText();
                String chooseAnotherButtonText = localizations.getReviewUploadPage().getChooseAnotherButtonText();
                String cameraPermissionsTitle = localizations.getPromptPage().getCameraPermissionsTitle();
                String cameraPermissionsPrompt = localizations.getPromptPage().getCameraPermissionsPrompt();
                String cameraPermissionsAllowButtonText = localizations.getPromptPage().getCameraPermissionsAllowButtonText();
                String cameraPermissionsCancelButtonText = localizations.getPromptPage().getCameraPermissionsCancelButtonText();
                String microphonePermissionsTitle = localizations.getPromptPage().getMicrophonePermissionsTitle();
                String microphonePermissionsPrompt = localizations.getPromptPage().getMicrophonePermissionsPrompt();
                String microphonePermissionsBtnContinueMobile = localizations.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
                String microphonePermissionsBtnCancel = localizations.getPromptPage().getMicrophonePermissionsBtnCancel();
                String hintHoldStill = localizations.getCapturePage().getHintHoldStill();
                String hintLowLight = localizations.getCapturePage().getHintLowLight();
                String btnHelp = localizations.getCapturePage().getBtnHelp();
                String barcodeHelpModalTitle = localizations.getCapturePage().getBarcodeHelpModalTitle();
                String barcodeHelpModalPrompt = localizations.getCapturePage().getBarcodeHelpModalPrompt();
                String barcodeHelpModalHints = localizations.getCapturePage().getBarcodeHelpModalHints();
                String barcodeHelpModalContinueBtn = localizations.getCapturePage().getBarcodeHelpModalContinueBtn();
                String idFrontHelpModalTitle = localizations.getCapturePage().getIdFrontHelpModalTitle();
                String idFrontHelpModalPrompt = localizations.getCapturePage().getIdFrontHelpModalPrompt();
                String idFrontHelpModalHintsMobile = localizations.getCapturePage().getIdFrontHelpModalHintsMobile();
                String idFrontHelpModalContinueBtn = localizations.getCapturePage().getIdFrontHelpModalContinueBtn();
                String idBackHelpModalTitle = localizations.getCapturePage().getIdBackHelpModalTitle();
                String idBackHelpModalPrompt = localizations.getCapturePage().getIdBackHelpModalPrompt();
                String idBackHelpModalHintsMobile = localizations.getCapturePage().getIdBackHelpModalHintsMobile();
                String idBackHelpModalContinueBtn = localizations.getCapturePage().getIdBackHelpModalContinueBtn();
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = localizations.getAutoClassificationPage();
                String unableToClassifyDocumentTitle = autoClassificationPage != null ? autoClassificationPage.getUnableToClassifyDocumentTitle() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = localizations.getAutoClassificationPage();
                String unableToClassifyDocumentContinueButtonText = autoClassificationPage2 != null ? autoClassificationPage2.getUnableToClassifyDocumentContinueButtonText() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage3 = localizations.getAutoClassificationPage();
                String idClassRejectedTitle = autoClassificationPage3 != null ? autoClassificationPage3.getIdClassRejectedTitle() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage4 = localizations.getAutoClassificationPage();
                String idClassRejectedContinueButtonText = autoClassificationPage4 != null ? autoClassificationPage4.getIdClassRejectedContinueButtonText() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage5 = localizations.getAutoClassificationPage();
                String countryInputTitle = autoClassificationPage5 != null ? autoClassificationPage5.getCountryInputTitle() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage6 = localizations.getAutoClassificationPage();
                String idClassInputTitle = autoClassificationPage6 != null ? autoClassificationPage6.getIdClassInputTitle() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage7 = localizations.getAutoClassificationPage();
                String manualClassificationTitle = autoClassificationPage7 != null ? autoClassificationPage7.getManualClassificationTitle() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage8 = localizations.getAutoClassificationPage();
                String manualClassificationContinueButtonText = autoClassificationPage8 != null ? autoClassificationPage8.getManualClassificationContinueButtonText() : null;
                NextStep.GovernmentId.AutoClassificationPage autoClassificationPage9 = localizations.getAutoClassificationPage();
                C22192s0 c22192s0 = new C22192s0(title, prompt, choose, str2, linkedHashMapM6190a, linkedHashMapM6191b, capturing, linkedHashMapM6190a2, str4, buttonSubmit, buttonRetake, linkedHashMapM6190a3, title2, description, linkedHashMap, linkedHashMapM6191b2, linkedHashMapM6191b3, liveUploadButtonText, choosePhotoButtonText, mapM19244f, mapM19244f2, confirmButtonText, chooseAnotherButtonText, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, hintHoldStill, hintLowLight, btnHelp, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueBtn, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHintsMobile, idFrontHelpModalContinueBtn, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHintsMobile, idBackHelpModalContinueBtn, unableToClassifyDocumentTitle, unableToClassifyDocumentContinueButtonText, idClassRejectedTitle, idClassRejectedContinueButtonText, countryInputTitle, idClassInputTitle, manualClassificationTitle, manualClassificationContinueButtonText, autoClassificationPage9 != null ? autoClassificationPage9.getAutoClassificationCaptureTipText() : null);
                List list4 = c4421b0.f14354O0;
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list4, 10));
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(EnumC19999a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it5.next()).toString()));
                }
                VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(120000L, c4421b0.f14353N0, arrayList3, c4421b0.f14355P0, c4421b0.f14360U0);
                NextStep.GovernmentId.AssetConfig assetConfig = c4421b0.f14356Q0;
                if (assetConfig == null) {
                    assetConfig = new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null);
                }
                c4390j0 = this;
                c13421l2 = c13421l;
                c6263e = c13421l2.mo3404p(c4390j0.f14263e, new C22195t0(c4421b0.f14362v0, c4421b0.f14366z0, arrayList2, c4421b0.f14361u0, c4421b0.f14342C0, c4421b0.f14341B0, c4421b0.f14343D0, c4421b0.f14344E0, c4421b0.f14347H0, c4421b0.f14364x0, c22192s0, c4421b0.f14348I0, c4421b0.f14350K0, c4421b0.f14351L0, c4421b0.f14349J0, c4421b0.f14352M0, videoCaptureConfig, assetConfig, !AbstractC16544l.m18089b(c4421b0.f14363w0, c4411u2), c4421b0.f14357R0, c4421b0.f14358S0, c4421b0.f14359T0), c4421b0.f14342C0, new C3350b0(c4390j0, 18, c4421b0));
                abstractC4433h0 = renderState;
            } else {
                c13421l2 = c13421l2;
                String str7 = str;
                C4411U0 c4411u3 = c4411u0;
                c4390j0 = c4390j0;
                abstractC4433h0 = renderState;
                if (abstractC4433h0 instanceof C4425d0) {
                    C4425d0 c4425d0 = (C4425d0) abstractC4433h0;
                    NextStep.Selfie.CaptureMethod captureMethod = NextStep.Selfie.CaptureMethod.ONLY_CENTER;
                    NextStep.Selfie.CaptureMethod captureMethod2 = c4425d0.f14388z0;
                    boolean z10 = captureMethod2 == captureMethod;
                    NextStep.Selfie.Localizations localizations2 = c4425d0.f14375H0;
                    AbstractC16544l.m18094g(localizations2, "<this>");
                    String title3 = localizations2.getPromptPage().getTitle();
                    String promptCenter = z10 ? localizations2.getPromptPage().getPromptCenter() : localizations2.getPromptPage().getPrompt();
                    String disclosure = localizations2.getPromptPage().getDisclosure();
                    String buttonSubmit2 = localizations2.getPromptPage().getButtonSubmit();
                    String title4 = localizations2.getCapturePage().getTitle();
                    C10728s0 c10728s0 = new C10728s0(title3, promptCenter, disclosure, buttonSubmit2, title4 == null ? str7 : title4, localizations2.getCapturePage().getSelfieHintTakePhoto(), localizations2.getCapturePage().getSelfieHintCenterFace(), localizations2.getCapturePage().getSelfieHintFaceTooClose(), localizations2.getCapturePage().getSelfieHintFaceTooFar(), localizations2.getCapturePage().getSelfieHintMultipleFaces(), localizations2.getCapturePage().getSelfieHintFaceIncomplete(), localizations2.getCapturePage().getSelfieHintPoseNotCenter(), localizations2.getCapturePage().getSelfieHintLookLeft(), localizations2.getCapturePage().getSelfieHintLookRight(), localizations2.getCapturePage().getSelfieHintHoldStill(), localizations2.getPendingPage().getTitle(), localizations2.getPendingPage().getDescription());
                    AbstractC16544l.m18094g(captureMethod2, "<this>");
                    int i11 = AbstractC10726r0.f31863a[captureMethod2.ordinal()];
                    if (i11 == 1) {
                        abstractC8162p0 = C10720o0.f31848a;
                    } else if (i11 == 2) {
                        abstractC8162p0 = C10724q0.f31858a;
                    } else {
                        if (i11 != 3) {
                            throw new C0644w();
                        }
                        abstractC8162p0 = C10722p0.f31853a;
                    }
                    AbstractC8162p0 abstractC8162p1 = abstractC8162p0;
                    List list5 = c4425d0.f14380M0;
                    List list6 = list5;
                    if (list6 == null || list6.isEmpty()) {
                        int i12 = AbstractC4451q0.f14489a[captureMethod2.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                i10 = 3;
                                if (i12 != 3) {
                                    throw new C0644w();
                                }
                            } else {
                                i10 = 3;
                            }
                            EnumC10723q[] enumC10723qArr = new EnumC10723q[i10];
                            enumC10723qArr[0] = EnumC10723q.f31854Y;
                            enumC10723qArr[1] = EnumC10723q.f31855Z;
                            enumC10723qArr[2] = EnumC10723q.f31856o0;
                            listM9974d = AbstractC17681o.m19382k(enumC10723qArr);
                        } else {
                            listM9974d = AbstractC9393x3.m9974d(EnumC10723q.f31854Y);
                        }
                        list = listM9974d;
                    } else {
                        List<NextStep.Selfie.SelfiePose> list7 = list5;
                        ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(list7, 10));
                        for (NextStep.Selfie.SelfiePose selfiePose : list7) {
                            AbstractC16544l.m18094g(selfiePose, "<this>");
                            int i13 = AbstractC10659O.f31649a[selfiePose.ordinal()];
                            if (i13 == 1) {
                                enumC10723q = EnumC10723q.f31854Y;
                            } else if (i13 == 2) {
                                enumC10723q = EnumC10723q.f31855Z;
                            } else {
                                if (i13 != 3) {
                                    throw new C0644w();
                                }
                                enumC10723q = EnumC10723q.f31856o0;
                            }
                            arrayList4.add(enumC10723q);
                        }
                        list = arrayList4;
                    }
                    String cameraPermissionsTitle2 = localizations2.getPromptPage().getCameraPermissionsTitle();
                    String cameraPermissionsPrompt2 = localizations2.getPromptPage().getCameraPermissionsPrompt();
                    String cameraPermissionsAllowButtonText2 = localizations2.getPromptPage().getCameraPermissionsAllowButtonText();
                    String cameraPermissionsCancelButtonText2 = localizations2.getPromptPage().getCameraPermissionsCancelButtonText();
                    String microphonePermissionsTitle2 = localizations2.getPromptPage().getMicrophonePermissionsTitle();
                    String microphonePermissionsPrompt2 = localizations2.getPromptPage().getMicrophonePermissionsPrompt();
                    String microphonePermissionsBtnContinueMobile2 = localizations2.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
                    String microphonePermissionsBtnCancel2 = localizations2.getPromptPage().getMicrophonePermissionsBtnCancel();
                    NextStep.Selfie.AssetConfig assetConfig2 = c4425d0.f14378K0;
                    if (assetConfig2 == null) {
                        assetConfig2 = new NextStep.Selfie.AssetConfig(null, null, 3, null);
                    }
                    NextStep.Selfie.AssetConfig assetConfig3 = assetConfig2;
                    List list8 = c4425d0.f14377J0;
                    ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(list8, 10));
                    Iterator it6 = list8.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(EnumC19999a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it6.next()).toString()));
                    }
                    com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig videoCaptureConfig2 = new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(StatsigLoggerKt.FLUSH_TIMER_MS, c4425d0.f14376I0, arrayList5, c4425d0.f14379L0, c4425d0.f14382O0);
                    StepStyles.SelfieStepStyle selfieStepStyle = c4425d0.f14386x0;
                    PendingPageTextPosition pendingPageTextPosition = c4425d0.f14381N0;
                    String str8 = c4425d0.f14384v0;
                    String str9 = c4425d0.f14383u0;
                    String str10 = c4425d0.f14368A0;
                    String str11 = c4425d0.f14369B0;
                    c6263e = new C6263e(c4425d0.f14369B0, c13421l2.mo3404p(c4390j0.f14264f, new C10730t0(str8, str9, str10, str11, c4425d0.f14370C0, c4425d0.f14371D0, c4425d0.f14372E0, c4425d0.f14373F0, c4425d0.f14374G0, c10728s0, abstractC8162p1, list, cameraPermissionsTitle2, cameraPermissionsPrompt2, cameraPermissionsAllowButtonText2, cameraPermissionsCancelButtonText2, microphonePermissionsTitle2, microphonePermissionsPrompt2, microphonePermissionsBtnContinueMobile2, microphonePermissionsBtnCancel2, selfieStepStyle, videoCaptureConfig2, assetConfig3, pendingPageTextPosition), str11, new C3350b0(c4390j0, 19, c4425d0)), !AbstractC16544l.m18089b(c4425d0.f14385w0, c4411u3));
                } else if (abstractC4433h0 instanceof C4431g0) {
                    C4431g0 c4431g0 = (C4431g0) abstractC4433h0;
                    NextStep.C12890Ui.Localizations localizations3 = c4431g0.f14426z0;
                    C1393l0 c1393l0 = new C1393l0(c4431g0.f14422v0, c4431g0.f14421u0, c4431g0.f14413C0, c4431g0.f14412B0, c4431g0.f14414D0, c4431g0.f14415E0, c4431g0.f14416F0, c4431g0.f14420J0, (localizations3 == null || (promptPage7 = localizations3.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsTitle(), (localizations3 == null || (promptPage6 = localizations3.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsPrompt(), (localizations3 == null || (promptPage = localizations3.getPromptPage()) == null) ? null : promptPage.getGpsFeatureTurnOnText(), (localizations3 == null || (promptPage4 = localizations3.getPromptPage()) == null) ? null : promptPage4.getGpsPermissionsBtnCancel(), (localizations3 == null || (promptPage3 = localizations3.getPromptPage()) == null) ? null : promptPage3.getGpsFeatureTitle(), (localizations3 == null || (promptPage2 = localizations3.getPromptPage()) == null) ? null : promptPage2.getGpsFeaturePrompt(), (localizations3 == null || (promptPage5 = localizations3.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsAllowButtonText(), c4431g0.f14424x0, c4431g0.f14419I0);
                    C3350b0 c3350b0 = new C3350b0(c4390j0, 20, c4431g0);
                    C1360X0 c1360x0 = c4390j0.f14265g;
                    String str12 = c4431g0.f14418H0;
                    c6263e = new C6263e(str12, new C14172n(c13421l2.mo3404p(c1360x0, c1393l0, str12, c3350b0), str12), !AbstractC16544l.m18089b(c4431g0.f14423w0, c4411u3));
                } else {
                    if (!(abstractC4433h0 instanceof C4417Z)) {
                        if (abstractC4433h0 instanceof C4412V) {
                            throw new IllegalStateException("This state should never be reached.");
                        }
                        throw new C0644w();
                    }
                    C4417Z c4417z = (C4417Z) abstractC4433h0;
                    NextStep.Document document = c4417z.f14337z0;
                    String title5 = document.getConfig().getLocalizations().getPromptPage().getTitle();
                    String prompt2 = document.getConfig().getLocalizations().getPromptPage().getPrompt();
                    String disclaimer3 = document.getConfig().getLocalizations().getPromptPage().getDisclaimer();
                    String btnSubmit = document.getConfig().getLocalizations().getPromptPage().getBtnSubmit();
                    String title6 = document.getConfig().getLocalizations().getPendingPage().getTitle();
                    String description2 = document.getConfig().getLocalizations().getPendingPage().getDescription();
                    String fieldKeyDocument = document.getConfig().getFieldKeyDocument();
                    String kind = document.getConfig().getKind();
                    String documentId = document.getConfig().getDocumentId();
                    int i14 = AbstractC4451q0.f14490b[document.getConfig().getStartPage().ordinal()];
                    if (i14 == 1) {
                        enumC20325a0 = EnumC20325a0.f64263Y;
                    } else {
                        if (i14 != 2) {
                            throw new C0644w();
                        }
                        enumC20325a0 = EnumC20325a0.f64264Z;
                    }
                    EnumC20325a0 enumC20325a1 = enumC20325a0;
                    int documentFileLimit = document.getConfig().getDocumentFileLimit();
                    Boolean backStepEnabled = document.getConfig().getBackStepEnabled();
                    boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
                    Boolean cancelButtonEnabled = document.getConfig().getCancelButtonEnabled();
                    boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
                    String cameraPermissionsTitle3 = document.getConfig().getLocalizations().getPromptPage().getCameraPermissionsTitle();
                    String cameraPermissionsPrompt3 = document.getConfig().getLocalizations().getPromptPage().getCameraPermissionsPrompt();
                    String cameraPermissionsAllowButtonText3 = document.getConfig().getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
                    String cameraPermissionsCancelButtonText3 = document.getConfig().getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
                    NextStep.Document.AssetConfig assetConfig4 = c4417z.f14330C0;
                    if (assetConfig4 == null) {
                        assetConfig4 = new NextStep.Document.AssetConfig(null, null, 3, null);
                    }
                    NextStep.Document.AssetConfig assetConfig5 = assetConfig4;
                    PendingPageTextPosition pendingPageTextVerticalPosition = document.getConfig().getPendingPageTextVerticalPosition();
                    if (pendingPageTextVerticalPosition == null) {
                        pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
                    }
                    C20362t c20362t = c4417z.f14329B0;
                    StepStyles.DocumentStepStyle documentStepStyle = c4417z.f14335x0;
                    String str13 = c4417z.f14333v0;
                    String str14 = c4417z.f14332u0;
                    String str15 = c4417z.f14331D0;
                    c6263e = new C6263e(c4417z.f14331D0, c13421l2.mo3404p(c4390j0.f14266h, new C20316S(str13, str14, str15, c4417z.f14328A0, title5, prompt2, disclaimer3, btnSubmit, title6, description2, fieldKeyDocument, kind, documentId, enumC20325a1, c20362t, documentFileLimit, zBooleanValue, zBooleanValue2, cameraPermissionsTitle3, cameraPermissionsPrompt3, cameraPermissionsAllowButtonText3, cameraPermissionsCancelButtonText3, documentStepStyle, assetConfig5, pendingPageTextVerticalPosition), str15, new C3350b0(c4390j0, 17, c4417z)), !AbstractC16544l.m18089b(c4417z.f14334w0, c4411u3));
                }
            }
            if (abstractC4433h0.f14435t0) {
                enumC18225f = EnumC18225f.f58074Z;
            } else {
                enumC18225f = EnumC18225f.f58073Y;
            }
            c18226g = new C18226g(c6263e, enumC18225f);
            if (c4390j0.f14267i.f29816a) {
                return new C10072e(c18226g, new C0286s(c4390j0, 27, c13421l2), new C3457c(c4390j0, 11));
            }
            return c18226g;
        }
        C4414W c4414w = (C4414W) renderState;
        c17282c.f55098d = false;
        c17282c.f55099e = false;
        c17282c.f55100f = true;
        c17282c.m18976b();
        C5813g c5813g = new C5813g(c4414w.f14321u0, c4414w.f14322v0, c4414w.f14429Z, renderProps.mo5202a(), c4414w.f14324x0, c4414w.f14323w0, c4414w.f14325y0, c4414w.f14326z0, c4414w.f14318A0);
        C11234e c11234e = c4390j0.f14259a;
        AbstractC8215v5.m8843e(c13421l2, new C4454s(c5813g, (InterfaceC5816j) c11234e.f34001Z, (C5461n) c11234e.f34002o0), AbstractC16526C.m18075c(C4454s.class), str, new C3350b0(c4390j0, 15, c4414w));
        c6263e = new C4449p0(c4414w.f14431p0, true, c0155b1);
        abstractC4433h0 = renderState;
        if (abstractC4433h0.f14435t0) {
            enumC18225f = EnumC18225f.f58074Z;
        } else {
            enumC18225f = EnumC18225f.f58073Y;
        }
        c18226g = new C18226g(c6263e, enumC18225f);
        if (c4390j0.f14267i.f29816a) {
            return new C10072e(c18226g, new C0286s(c4390j0, 27, c13421l2), new C3457c(c4390j0, 11));
        }
        return c18226g;
    }

    @Override // fk.InterfaceC13680a
    public final void close() {
        this.f14264f.close();
        this.f14263e.close();
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC4433h0 state = (AbstractC4433h0) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }
}
