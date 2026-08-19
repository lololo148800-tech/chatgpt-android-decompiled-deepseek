package p247Jj;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;

/* JADX INFO: renamed from: Jj.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4426e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f14389a;

    static {
        int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
        try {
            iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14389a = iArr;
    }
}
