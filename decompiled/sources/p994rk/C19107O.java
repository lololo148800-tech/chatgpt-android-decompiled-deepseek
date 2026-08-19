package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C19107O implements InterfaceC19201o2 {
    public static final Parcelable.Creator<C19107O> CREATOR = new C19104N();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.CombinedStepImagePreview f60805Y;

    public C19107O(UiComponentConfig.CombinedStepImagePreview config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60805Y = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19107O) && AbstractC16544l.m18089b(this.f60805Y, ((C19107O) obj).f60805Y);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60805Y;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        return this.f60805Y.hashCode();
    }

    public final String toString() {
        return "ImagePreviewComponent(config=" + this.f60805Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60805Y, i10);
    }
}
