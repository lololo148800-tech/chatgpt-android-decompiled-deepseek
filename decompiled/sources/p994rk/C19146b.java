package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8130l0;

/* JADX INFO: renamed from: rk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19146b implements InterfaceC19174i {
    public static final Parcelable.Creator<C19146b> CREATOR = new C19142a();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.ActionButton f60852Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60853Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f60854o0;

    public C19146b(UiComponentConfig.ActionButton config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60852Y = config;
        this.f60853Z = new ArrayList();
    }

    @Override // p994rk.InterfaceC19174i
    /* JADX INFO: renamed from: E */
    public final boolean mo20307E() {
        return this.f60854o0;
    }

    @Override // p994rk.InterfaceC19174i
    /* JADX INFO: renamed from: T */
    public final void mo20308T(boolean z6) {
        this.f60854o0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19146b) && AbstractC16544l.m18089b(this.f60852Y, ((C19146b) obj).f60852Y);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40916s0() {
        return this.f60853Z;
    }

    @Override // p994rk.InterfaceC19174i, p994rk.InterfaceC19201o2
    public final UiComponentConfig.Button getConfig() {
        return this.f60852Y;
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
        return this.f60852Y.hashCode();
    }

    public final String toString() {
        return "ActionButtonComponent(config=" + this.f60852Y + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60852Y, i10);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60852Y;
    }
}
