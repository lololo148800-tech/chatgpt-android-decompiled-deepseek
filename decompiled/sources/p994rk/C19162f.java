package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C19162f implements InterfaceC19201o2 {
    public static final Parcelable.Creator<C19162f> CREATOR = new C19158e();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.Branding f60874Y;

    public C19162f(UiComponentConfig.Branding config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60874Y = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19162f) && AbstractC16544l.m18089b(this.f60874Y, ((C19162f) obj).f60874Y);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60874Y;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        return this.f60874Y.hashCode();
    }

    public final String toString() {
        return "BrandingComponent(config=" + this.f60874Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60874Y, i10);
    }
}
