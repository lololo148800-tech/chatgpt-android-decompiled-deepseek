package p994rk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;

/* JADX INFO: renamed from: rk.L1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC19100L1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60791a;

    static {
        int[] iArr = new int[UiComponentConfig.RemoteImage.ContentType.values().length];
        try {
            iArr[UiComponentConfig.RemoteImage.ContentType.JSON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UiComponentConfig.RemoteImage.ContentType.Image.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UiComponentConfig.RemoteImage.ContentType.SVG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f60791a = iArr;
    }
}
