package p1156zj;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: zj.v1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22202v1 extends AbstractC22121S {

    /* JADX INFO: renamed from: b */
    public final String f70383b;

    /* JADX INFO: renamed from: c */
    public final String f70384c;

    /* JADX INFO: renamed from: d */
    public final StepStyles.GovernmentIdStepStyle f70385d;

    /* JADX INFO: renamed from: e */
    public final NextStep.GovernmentId.AssetConfig.PendingPage f70386e;

    /* JADX INFO: renamed from: f */
    public final C22097F0 f70387f;

    /* JADX INFO: renamed from: g */
    public final PendingPageTextPosition f70388g;

    public C22202v1(String title, String description, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, C22097F0 c22097f0, PendingPageTextPosition pendingPageTextVerticalPosition) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f70383b = title;
        this.f70384c = description;
        this.f70385d = governmentIdStepStyle;
        this.f70386e = pendingPage;
        this.f70387f = c22097f0;
        this.f70388g = pendingPageTextVerticalPosition;
    }
}
