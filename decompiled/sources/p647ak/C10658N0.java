package p647ak;

import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8178r0;

/* JADX INFO: renamed from: ak.N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10658N0 extends AbstractC8178r0 {

    /* JADX INFO: renamed from: b */
    public final String f31643b;

    /* JADX INFO: renamed from: c */
    public final String f31644c;

    /* JADX INFO: renamed from: d */
    public final PendingPageTextPosition f31645d;

    /* JADX INFO: renamed from: e */
    public final StepStyles.SelfieStepStyle f31646e;

    /* JADX INFO: renamed from: f */
    public final C10665R0 f31647f;

    /* JADX INFO: renamed from: g */
    public final UiComponentConfig.RemoteImage f31648g;

    public C10658N0(String title, String description, PendingPageTextPosition pendingPageTextVerticalPosition, StepStyles.SelfieStepStyle selfieStepStyle, C10665R0 c10665r0, UiComponentConfig.RemoteImage remoteImage) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f31643b = title;
        this.f31644c = description;
        this.f31645d = pendingPageTextVerticalPosition;
        this.f31646e = selfieStepStyle;
        this.f31647f = c10665r0;
        this.f31648g = remoteImage;
    }
}
