package p046Bk;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;

/* JADX INFO: renamed from: Bk.t0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1409t0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3770a;

    static {
        int[] iArr = new int[UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes.values().length];
        try {
            iArr[UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3770a = iArr;
    }
}
