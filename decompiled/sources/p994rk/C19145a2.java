package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.a2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19145a2 implements InterfaceC19201o2, InterfaceC19089I {
    public static final Parcelable.Creator<C19145a2> CREATOR = new C19141Z1();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.Spacer f60850Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60851Z;

    public C19145a2(UiComponentConfig.Spacer config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60850Y = config;
        this.f60851Z = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19145a2) && AbstractC16544l.m18089b(this.f60850Y, ((C19145a2) obj).f60850Y);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40938x0() {
        return this.f60851Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60850Y;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.Spacer.Attributes attributes = this.f60850Y.getAttributes();
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
        return this.f60850Y.hashCode();
    }

    public final String toString() {
        return "SpacerComponent(config=" + this.f60850Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60850Y, i10);
    }
}
