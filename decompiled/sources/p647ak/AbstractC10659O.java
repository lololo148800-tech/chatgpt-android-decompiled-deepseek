package p647ak;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;

/* JADX INFO: renamed from: ak.O */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC10659O {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f31649a;

    static {
        int[] iArr = new int[EnumC10723q.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            EnumC10723q enumC10723q = EnumC10723q.f31854Y;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            EnumC10723q enumC10723q2 = EnumC10723q.f31854Y;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[NextStep.Selfie.SelfiePose.values().length];
        try {
            iArr2[NextStep.Selfie.SelfiePose.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NextStep.Selfie.SelfiePose.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NextStep.Selfie.SelfiePose.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f31649a = iArr2;
    }
}
