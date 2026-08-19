package p263K9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p1060v9.AbstractC20502t;
import p1078w9.AbstractC20851a;
import p247Jj.C4409T0;
import p523V9.AbstractC8199t5;

/* JADX INFO: renamed from: K9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4587g extends AbstractC20851a {
    public static final Parcelable.Creator<C4587g> CREATOR = new C4409T0(25);

    /* JADX INFO: renamed from: Y */
    public final C4565L f14947Y;

    /* JADX INFO: renamed from: Z */
    public final C4574V f14948Z;

    /* JADX INFO: renamed from: o0 */
    public final C4588h f14949o0;

    /* JADX INFO: renamed from: p0 */
    public final C4575W f14950p0;

    /* JADX INFO: renamed from: q0 */
    public final String f14951q0;

    public C4587g(C4565L c4565l, C4574V c4574v, C4588h c4588h, C4575W c4575w, String str) {
        this.f14947Y = c4565l;
        this.f14948Z = c4574v;
        this.f14949o0 = c4588h;
        this.f14950p0 = c4575w;
        this.f14951q0 = str;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m5335b() {
        try {
            JSONObject jSONObject = new JSONObject();
            C4588h c4588h = this.f14949o0;
            if (c4588h != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", c4588h.f14952Y);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            C4565L c4565l = this.f14947Y;
            if (c4565l != null) {
                jSONObject.put("uvm", c4565l.m5326b());
            }
            C4575W c4575w = this.f14950p0;
            if (c4575w != null) {
                jSONObject.put("prf", c4575w.m5332b());
            }
            String str = this.f14951q0;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4587g)) {
            return false;
        }
        C4587g c4587g = (C4587g) obj;
        return AbstractC20502t.m21161l(this.f14947Y, c4587g.f14947Y) && AbstractC20502t.m21161l(this.f14948Z, c4587g.f14948Z) && AbstractC20502t.m21161l(this.f14949o0, c4587g.f14949o0) && AbstractC20502t.m21161l(this.f14950p0, c4587g.f14950p0) && AbstractC20502t.m21161l(this.f14951q0, c4587g.f14951q0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14947Y, this.f14948Z, this.f14949o0, this.f14950p0, this.f14951q0});
    }

    public final String toString() {
        return AbstractC10763a.m11054l("AuthenticationExtensionsClientOutputs{", m5335b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM8811j = AbstractC8199t5.m8811j(parcel, 20293);
        AbstractC8199t5.m8806e(parcel, 1, this.f14947Y, i10);
        AbstractC8199t5.m8806e(parcel, 2, this.f14948Z, i10);
        AbstractC8199t5.m8806e(parcel, 3, this.f14949o0, i10);
        AbstractC8199t5.m8806e(parcel, 4, this.f14950p0, i10);
        AbstractC8199t5.m8807f(parcel, 5, this.f14951q0);
        AbstractC8199t5.m8812k(parcel, iM8811j);
    }
}
