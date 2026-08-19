package p1156zj;

import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0517b;

/* JADX INFO: renamed from: zj.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22195t0 {

    /* JADX INFO: renamed from: a */
    public final String f70335a;

    /* JADX INFO: renamed from: b */
    public final String f70336b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f70337c;

    /* JADX INFO: renamed from: d */
    public final String f70338d;

    /* JADX INFO: renamed from: e */
    public final String f70339e;

    /* JADX INFO: renamed from: f */
    public final String f70340f;

    /* JADX INFO: renamed from: g */
    public final boolean f70341g;

    /* JADX INFO: renamed from: h */
    public final boolean f70342h;

    /* JADX INFO: renamed from: i */
    public final List f70343i;

    /* JADX INFO: renamed from: j */
    public final StepStyles.GovernmentIdStepStyle f70344j;

    /* JADX INFO: renamed from: k */
    public final C22192s0 f70345k;

    /* JADX INFO: renamed from: l */
    public final int f70346l;

    /* JADX INFO: renamed from: m */
    public final String f70347m;

    /* JADX INFO: renamed from: n */
    public final String f70348n;

    /* JADX INFO: renamed from: o */
    public final long f70349o;

    /* JADX INFO: renamed from: p */
    public final boolean f70350p;

    /* JADX INFO: renamed from: q */
    public final VideoCaptureConfig f70351q;

    /* JADX INFO: renamed from: r */
    public final NextStep.GovernmentId.AssetConfig f70352r;

    /* JADX INFO: renamed from: s */
    public final boolean f70353s;

    /* JADX INFO: renamed from: t */
    public final C0517b f70354t;

    /* JADX INFO: renamed from: u */
    public final StyleElements.Axis f70355u;

    /* JADX INFO: renamed from: v */
    public final PendingPageTextPosition f70356v;

    public C22195t0(String sessionToken, String countryCode, ArrayList arrayList, String inquiryId, String fromStep, String fromComponent, boolean z6, boolean z10, List enabledCaptureOptionsNativeMobile, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, C22192s0 c22192s0, int i10, String fieldKeyDocument, String fieldKeyIdClass, long j10, boolean z11, VideoCaptureConfig videoCaptureConfig, NextStep.GovernmentId.AssetConfig assetConfig, boolean z12, C0517b autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(countryCode, "countryCode");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
        AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
        AbstractC16544l.m18094g(fieldKeyIdClass, "fieldKeyIdClass");
        AbstractC16544l.m18094g(autoClassificationConfig, "autoClassificationConfig");
        AbstractC16544l.m18094g(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
        AbstractC16544l.m18094g(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
        this.f70335a = sessionToken;
        this.f70336b = countryCode;
        this.f70337c = arrayList;
        this.f70338d = inquiryId;
        this.f70339e = fromStep;
        this.f70340f = fromComponent;
        this.f70341g = z6;
        this.f70342h = z10;
        this.f70343i = enabledCaptureOptionsNativeMobile;
        this.f70344j = governmentIdStepStyle;
        this.f70345k = c22192s0;
        this.f70346l = i10;
        this.f70347m = fieldKeyDocument;
        this.f70348n = fieldKeyIdClass;
        this.f70349o = j10;
        this.f70350p = z11;
        this.f70351q = videoCaptureConfig;
        this.f70352r = assetConfig;
        this.f70353s = z12;
        this.f70354t = autoClassificationConfig;
        this.f70355u = reviewCaptureButtonsAxis;
        this.f70356v = pendingPageTextVerticalPosition;
    }
}
