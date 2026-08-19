package p647ak;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: renamed from: ak.r0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC10726r0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f31863a;

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
        f31863a = iArr;
    }
}
