package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.F1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19082F1 implements InterfaceC19201o2, InterfaceC19089I {
    public static final Parcelable.Creator<C19082F1> CREATOR = new C19079E1();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.QRCode f60757Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60758Z;

    public C19082F1(UiComponentConfig.QRCode config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60757Y = config;
        this.f60758Z = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19082F1) && AbstractC16544l.m18089b(this.f60757Y, ((C19082F1) obj).f60757Y);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40938x0() {
        return this.f60758Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60757Y;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.QRCode.Attributes attributes = this.f60757Y.getAttributes();
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
        return this.f60757Y.hashCode();
    }

    public final String toString() {
        return "QRCodeComponent(config=" + this.f60757Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60757Y, i10);
    }
}
