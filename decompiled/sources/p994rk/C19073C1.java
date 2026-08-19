package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.C1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19073C1 implements InterfaceC19201o2 {
    public static final Parcelable.Creator<C19073C1> CREATOR = new C19070B1();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.PrivacyPolicy f60750Y;

    public C19073C1(UiComponentConfig.PrivacyPolicy config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60750Y = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19073C1) && AbstractC16544l.m18089b(this.f60750Y, ((C19073C1) obj).f60750Y);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60750Y;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        return this.f60750Y.hashCode();
    }

    public final String toString() {
        return "PrivacyPolicyComponent(config=" + this.f60750Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60750Y, i10);
    }
}
