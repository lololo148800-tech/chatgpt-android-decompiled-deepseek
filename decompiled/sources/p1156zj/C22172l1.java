package p1156zj;

import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mk.C17280a;
import p045Bj.C1311i;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p149Fj.EnumC2883q;
import p949pj.C18433F;
import p993rj.C19026F;
import tj.EnumC19999a;

/* JADX INFO: renamed from: zj.l1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22172l1 extends AbstractC22121S {

    /* JADX INFO: renamed from: A */
    public final boolean f70171A;

    /* JADX INFO: renamed from: B */
    public final long f70172B;

    /* JADX INFO: renamed from: C */
    public final boolean f70173C;

    /* JADX INFO: renamed from: D */
    public final String f70174D;

    /* JADX INFO: renamed from: E */
    public final CaptureTipsViewModel f70175E;

    /* JADX INFO: renamed from: F */
    public final NextStep.GovernmentId.AssetConfig.CapturePage f70176F;

    /* JADX INFO: renamed from: G */
    public final boolean f70177G;

    /* JADX INFO: renamed from: H */
    public final boolean f70178H;

    /* JADX INFO: renamed from: I */
    public final C18433F f70179I;

    /* JADX INFO: renamed from: J */
    public final C19026F f70180J;

    /* JADX INFO: renamed from: b */
    public final String f70181b;

    /* JADX INFO: renamed from: c */
    public final String f70182c;

    /* JADX INFO: renamed from: d */
    public final String f70183d;

    /* JADX INFO: renamed from: e */
    public final EnumC22169k1 f70184e;

    /* JADX INFO: renamed from: f */
    public final AbstractC22196t1 f70185f;

    /* JADX INFO: renamed from: g */
    public final EnumC2883q f70186g;

    /* JADX INFO: renamed from: h */
    public final EnumC22128V0 f70187h;

    /* JADX INFO: renamed from: i */
    public final C17280a f70188i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC1439n f70189j;

    /* JADX INFO: renamed from: k */
    public final AbstractC16546n f70190k;

    /* JADX INFO: renamed from: l */
    public final AbstractC16546n f70191l;

    /* JADX INFO: renamed from: m */
    public final boolean f70192m;

    /* JADX INFO: renamed from: n */
    public final List f70193n;

    /* JADX INFO: renamed from: o */
    public final AbstractC22180o0 f70194o;

    /* JADX INFO: renamed from: p */
    public final int f70195p;

    /* JADX INFO: renamed from: q */
    public final StepStyles.GovernmentIdStepStyle f70196q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC1439n f70197r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC1436k f70198s;

    /* JADX INFO: renamed from: t */
    public final C1311i f70199t;

    /* JADX INFO: renamed from: u */
    public final int f70200u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC1426a f70201v;

    /* JADX INFO: renamed from: w */
    public final AbstractC16546n f70202w;

    /* JADX INFO: renamed from: x */
    public final EnumC19999a f70203x;

    /* JADX INFO: renamed from: y */
    public final boolean f70204y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC1439n f70205z;

    /* JADX WARN: Multi-variable type inference failed */
    public C22172l1(String str, String message, String str2, EnumC22169k1 captureButtonState, AbstractC22196t1 overlay, EnumC2883q idClass, EnumC22128V0 captureSide, C17280a navigationState, InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, boolean z6, List autoCaptureRules, AbstractC22180o0 state, int i10, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, InterfaceC1439n interfaceC1439n2, InterfaceC1436k interfaceC1436k, C1311i c1311i, int i11, InterfaceC1426a interfaceC1426a3, InterfaceC1426a interfaceC1426a4, EnumC19999a enumC19999a, boolean z10, InterfaceC1439n interfaceC1439n3, boolean z11, long j10, boolean z12, String str3, CaptureTipsViewModel captureTipsViewModel, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z13, boolean z14, C18433F cameraXControllerFactory, C19026F camera2ManagerFactoryFactory) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(captureButtonState, "captureButtonState");
        AbstractC16544l.m18094g(overlay, "overlay");
        AbstractC16544l.m18094g(idClass, "idClass");
        AbstractC16544l.m18094g(captureSide, "captureSide");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        AbstractC16544l.m18094g(autoCaptureRules, "autoCaptureRules");
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        this.f70181b = str;
        this.f70182c = message;
        this.f70183d = str2;
        this.f70184e = captureButtonState;
        this.f70185f = overlay;
        this.f70186g = idClass;
        this.f70187h = captureSide;
        this.f70188i = navigationState;
        this.f70189j = interfaceC1439n;
        this.f70190k = (AbstractC16546n) interfaceC1426a;
        this.f70191l = (AbstractC16546n) interfaceC1426a2;
        this.f70192m = z6;
        this.f70193n = autoCaptureRules;
        this.f70194o = state;
        this.f70195p = i10;
        this.f70196q = governmentIdStepStyle;
        this.f70197r = interfaceC1439n2;
        this.f70198s = interfaceC1436k;
        this.f70199t = c1311i;
        this.f70200u = i11;
        this.f70201v = interfaceC1426a3;
        this.f70202w = (AbstractC16546n) interfaceC1426a4;
        this.f70203x = enumC19999a;
        this.f70204y = z10;
        this.f70205z = interfaceC1439n3;
        this.f70171A = z11;
        this.f70172B = j10;
        this.f70173C = z12;
        this.f70174D = str3;
        this.f70175E = captureTipsViewModel;
        this.f70176F = capturePage;
        this.f70177G = z13;
        this.f70178H = z14;
        this.f70179I = cameraXControllerFactory;
        this.f70180J = camera2ManagerFactoryFactory;
    }
}
