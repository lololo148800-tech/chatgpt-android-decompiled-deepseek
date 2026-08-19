package p826j6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC11947e;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.revenuecat.purchases.google.usecase.C12747b;
import org.json.JSONException;
import p333N9.AbstractBinderC5687h;
import p618Za.C10267f;
import p813ij.C15026j;

/* JADX INFO: renamed from: j6.B */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC16133B extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final C12747b f50053b;

    /* JADX INFO: renamed from: c */
    public final C15026j f50054c;

    /* JADX INFO: renamed from: d */
    public final int f50055d;

    public BinderC16133B(C12747b c12747b, C15026j c15026j, int i10) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 10);
        this.f50053b = c12747b;
        this.f50054c = c15026j;
        this.f50055d = i10;
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: o */
    public final boolean mo6130o(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC11947e.m13413a(parcel, Bundle.CREATOR);
        AbstractC11947e.m13414b(parcel);
        int i11 = this.f50055d;
        C15026j c15026j = this.f50054c;
        C12747b c12747b = this.f50053b;
        if (bundle == null) {
            C16155i c16155i = AbstractC16144M.f50086i;
            c15026j.m16154u(AbstractC16142K.m17717b(63, 13, c16155i), i11);
            c12747b.m14490a(c16155i, null);
        } else {
            int iM13506a = AbstractC11988o0.m13506a("BillingClient", bundle);
            String strM13510e = AbstractC11988o0.m13510e("BillingClient", bundle);
            C10267f c10267fM17778a = C16155i.m17778a();
            c10267fM17778a.f30498b = iM13506a;
            c10267fM17778a.f30497a = strM13510e;
            if (iM13506a != 0) {
                AbstractC11988o0.m13512g("BillingClient", "getBillingConfig() failed. Response code: " + iM13506a);
                C16155i c16155iM10864c = c10267fM17778a.m10864c();
                c15026j.m16154u(AbstractC16142K.m17717b(23, 13, c16155iM10864c), i11);
                c12747b.m14490a(c16155iM10864c, null);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    c12747b.m14490a(c10267fM17778a.m10864c(), new C16151e(bundle.getString("BILLING_CONFIG")));
                } catch (JSONException e10) {
                    AbstractC11988o0.m13513h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
                    C16155i c16155i2 = AbstractC16144M.f50086i;
                    c15026j.m16154u(AbstractC16142K.m17717b(65, 13, c16155i2), i11);
                    c12747b.m14490a(c16155i2, null);
                }
            } else {
                AbstractC11988o0.m13512g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                c10267fM17778a.f30498b = 6;
                C16155i c16155iM10864c2 = c10267fM17778a.m10864c();
                c15026j.m16154u(AbstractC16142K.m17717b(64, 13, c16155iM10864c2), i11);
                c12747b.m14490a(c16155iM10864c2, null);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
