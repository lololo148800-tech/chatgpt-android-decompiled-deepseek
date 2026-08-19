package p994rk;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8130l0;

/* JADX INFO: renamed from: rk.t2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19221t2 implements InterfaceC19174i {
    public static final Parcelable.Creator<C19221t2> CREATOR = new C19217s2();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.VerifyPersonaButton f60970Y;

    /* JADX INFO: renamed from: Z */
    public final ArrayList f60971Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f60972o0;

    public C19221t2(UiComponentConfig.VerifyPersonaButton config) {
        AbstractC16544l.m18094g(config, "config");
        this.f60970Y = config;
        this.f60971Z = new ArrayList();
    }

    @Override // p994rk.InterfaceC19174i
    /* JADX INFO: renamed from: E */
    public final boolean mo20307E() {
        return this.f60972o0;
    }

    @Override // p994rk.InterfaceC19174i
    /* JADX INFO: renamed from: T */
    public final void mo20308T(boolean z6) {
        this.f60972o0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f */
    public final ArrayList getF40947o0() {
        return this.f60971Z;
    }

    @Override // p994rk.InterfaceC19174i, p994rk.InterfaceC19201o2
    public final UiComponentConfig.Button getConfig() {
        return this.f60970Y;
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60970Y, i10);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60970Y;
    }
}
