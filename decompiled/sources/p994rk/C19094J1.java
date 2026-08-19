package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.J1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19094J1 implements InterfaceC19201o2, InterfaceC19089I {
    public static final Parcelable.Creator<C19094J1> CREATOR = new C19091I1();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.RemoteImage f60779Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60780Z;

    public C19094J1(UiComponentConfig.RemoteImage config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60779Y = config;
        this.f60780Z = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19094J1) && AbstractC16544l.m18089b(this.f60779Y, ((C19094J1) obj).f60779Y);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40947o0() {
        return this.f60780Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60779Y;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.RemoteImage.Attributes attributes = this.f60779Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        return this.f60779Y.hashCode();
    }

    public final String toString() {
        return "RemoteImageComponent(config=" + this.f60779Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60779Y, i10);
    }
}
