package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p449S9.C7054X;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.W */
/* JADX INFO: loaded from: classes.dex */
public final class C4575W extends AbstractC20851a {
    public static final Parcelable.Creator<C4575W> CREATOR = new C4409T0(29);

    /* JADX INFO: renamed from: Y */
    public final boolean f14921Y;

    /* JADX INFO: renamed from: Z */
    public final C7054X f14922Z;

    public C4575W(boolean z6, C7054X c7054x) {
        this.f14921Y = z6;
        this.f14922Z = c7054x;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m5332b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f14921Y) {
                jSONObject.put("enabled", true);
            }
            C7054X c7054x = this.f14922Z;
            byte[] bArrM7453t = c7054x == null ? null : c7054x.m7453t();
            if (bArrM7453t != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM7453t, 32), 11));
                if (bArrM7453t.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM7453t, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4575W)) {
            return false;
        }
        C4575W c4575w = (C4575W) obj;
        return this.f14921Y == c4575w.f14921Y && AbstractC20502t.m21161l(this.f14922Z, c4575w.f14922Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f14921Y), this.f14922Z});
    }

    public final String toString() {
        return AbstractC10763a.m11054l("AuthenticationExtensionsPrfOutputs{", m5332b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8813l(parcel, 1, 4);
        parcel.writeInt(this.f14921Y ? 1 : 0);
        C7054X c7054x = this.f14922Z;
        AbstractC8199t5.m8804c(parcel, 2, c7054x == null ? null : c7054x.m7453t());
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
