package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8130l0;

/* JADX INFO: renamed from: rk.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C19182k implements InterfaceC19174i {
    public static final Parcelable.Creator<C19182k> CREATOR = new C19178j();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.CancelButton f60902Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60903Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f60904o0;

    public C19182k(UiComponentConfig.CancelButton config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60902Y = config;
        this.f60903Z = new ArrayList();
    }

    @Override // p994rk.InterfaceC19174i
    /* JADX INFO: renamed from: E */
    public final boolean mo20307E() {
        return this.f60904o0;
    }

    @Override // p994rk.InterfaceC19174i
    /* JADX INFO: renamed from: T */
    public final void mo20308T(boolean z6) {
        this.f60904o0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19182k) && AbstractC16544l.m18089b(this.f60902Y, ((C19182k) obj).f60902Y);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40916s0() {
        return this.f60903Z;
    }

    @Override // p994rk.InterfaceC19174i, p994rk.InterfaceC19201o2
    public final UiComponentConfig.Button getConfig() {
        return this.f60902Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        return AbstractC19170h.m20312a(this);
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        return AbstractC19170h.m20313b(this);
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return AbstractC8130l0.m8648c(this);
    }

    public final int hashCode() {
        return this.f60902Y.hashCode();
    }

    public final String toString() {
        return "CancelButtonComponent(config=" + this.f60902Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60902Y, i10);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60902Y;
    }
}
