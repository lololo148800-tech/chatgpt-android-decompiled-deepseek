package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.l2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19189l2 implements InterfaceC19201o2, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<C19189l2> CREATOR = new C19185k2();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.Title f60911Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60912Z;

    public C19189l2(UiComponentConfig.Title config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60911Y = config;
        this.f60912Z = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19189l2) && AbstractC16544l.m18089b(this.f60911Y, ((C19189l2) obj).f60911Y);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40938x0() {
        return this.f60912Z;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60911Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.Title.Attributes attributes = this.f60911Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.Title.Attributes attributes = this.f60911Y.getAttributes();
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
        return this.f60911Y.hashCode();
    }

    public final String toString() {
        return "TitleComponent(config=" + this.f60911Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60911Y, i10);
    }
}
