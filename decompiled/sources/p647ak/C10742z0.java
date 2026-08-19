package p647ak;

import android.gov.nist.core.Separators;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ak.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10742z0 {

    /* JADX INFO: renamed from: a */
    public final UiComponentConfig.RemoteImage f31919a;

    /* JADX INFO: renamed from: b */
    public final UiComponentConfig.RemoteImage f31920b;

    public C10742z0(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2) {
        this.f31919a = remoteImage;
        this.f31920b = remoteImage2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10742z0)) {
            return false;
        }
        C10742z0 c10742z0 = (C10742z0) obj;
        return AbstractC16544l.m18089b(this.f31919a, c10742z0.f31919a) && AbstractC16544l.m18089b(this.f31920b, c10742z0.f31920b);
    }

    public final int hashCode() {
        UiComponentConfig.RemoteImage remoteImage = this.f31919a;
        int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
        UiComponentConfig.RemoteImage remoteImage2 = this.f31920b;
        return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
    }

    public final String toString() {
        return "AssetOverrides(leftPoseImage=" + this.f31919a + ", rightPoseImage=" + this.f31920b + Separators.RPAREN;
    }
}
