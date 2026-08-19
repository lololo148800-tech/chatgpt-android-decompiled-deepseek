package p1156zj;

import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import p849k7.C16361n;

/* JADX INFO: renamed from: zj.u */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC22197u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f70357a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f70358b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f70359c;

    static {
        int[] iArr = new int[CapturePageConfig.RuleType.values().length];
        try {
            iArr[CapturePageConfig.RuleType.ID_FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CapturePageConfig.RuleType.ID_FRONT_OR_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CapturePageConfig.RuleType.BARCODE_PDF417.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CapturePageConfig.RuleType.PASSPORT_MRZ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CapturePageConfig.RuleType.TEXT_EXTRACTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f70357a = iArr;
        int[] iArr2 = new int[CapturePageConfig.OverlayLocalIcon.values().length];
        try {
            iArr2[CapturePageConfig.OverlayLocalIcon.BARCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CapturePageConfig.OverlayLocalIcon.PASSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CapturePageConfig.OverlayLocalIcon.ID_FRONT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[CapturePageConfig.OverlayLocalIcon.ID_BACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[CapturePageConfig.OverlayLocalIcon.CORNERS_ONLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[CapturePageConfig.OverlayLocalIcon.EMPTY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        f70358b = iArr2;
        int[] iArr3 = new int[C12893Id.IdLocalIcon.values().length];
        try {
            iArr3[C12893Id.IdLocalIcon.WORLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[C12893Id.IdLocalIcon.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[C12893Id.IdLocalIcon.FLAG.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[C12893Id.IdLocalIcon.HOUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        f70359c = iArr3;
        int[] iArr4 = new int[EnumC22128V0.values().length];
        try {
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            C16361n c16361n = EnumC22128V0.f69944Z;
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            C16361n c16361n2 = EnumC22128V0.f69944Z;
            iArr4[3] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            C16361n c16361n3 = EnumC22128V0.f69944Z;
            iArr4[2] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            C16361n c16361n4 = EnumC22128V0.f69944Z;
            iArr4[4] = 5;
        } catch (NoSuchFieldError unused20) {
        }
    }
}
