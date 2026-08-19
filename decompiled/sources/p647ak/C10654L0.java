package p647ak;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p523V9.AbstractC8178r0;

/* JADX INFO: renamed from: ak.L0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10654L0 extends AbstractC8178r0 {

    /* JADX INFO: renamed from: b */
    public final String f31627b;

    /* JADX INFO: renamed from: c */
    public final String f31628c;

    /* JADX INFO: renamed from: d */
    public final String f31629d;

    /* JADX INFO: renamed from: e */
    public final String f31630e;

    /* JADX INFO: renamed from: f */
    public final StepStyles.SelfieStepStyle f31631f;

    /* JADX INFO: renamed from: g */
    public final UiComponentConfig.RemoteImage f31632g;

    /* JADX INFO: renamed from: h */
    public final C17280a f31633h;

    /* JADX INFO: renamed from: i */
    public final C10667S0 f31634i;

    /* JADX INFO: renamed from: j */
    public final C10665R0 f31635j;

    /* JADX INFO: renamed from: k */
    public final C10665R0 f31636k;

    public C10654L0(String title, String prompt, String disclosure, String start, StepStyles.SelfieStepStyle selfieStepStyle, UiComponentConfig.RemoteImage remoteImage, C17280a navigationState, C10667S0 c10667s0, C10665R0 c10665r0, C10665R0 c10665r1) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(prompt, "prompt");
        AbstractC16544l.m18094g(disclosure, "disclosure");
        AbstractC16544l.m18094g(start, "start");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        this.f31627b = title;
        this.f31628c = prompt;
        this.f31629d = disclosure;
        this.f31630e = start;
        this.f31631f = selfieStepStyle;
        this.f31632g = remoteImage;
        this.f31633h = navigationState;
        this.f31634i = c10667s0;
        this.f31635j = c10665r0;
        this.f31636k = c10665r1;
    }
}
