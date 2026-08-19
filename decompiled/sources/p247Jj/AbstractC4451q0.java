package p247Jj;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: renamed from: Jj.q0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4451q0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f14489a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f14490b;

    static {
        int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
        try {
            iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14489a = iArr;
        int[] iArr2 = new int[NextStep.Document.StartPage.values().length];
        try {
            iArr2[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f14490b = iArr2;
    }
}
