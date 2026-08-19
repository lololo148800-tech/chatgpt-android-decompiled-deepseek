package p826j6;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC11947e;
import com.google.android.gms.internal.play_billing.C12022w2;
import com.google.android.gms.internal.play_billing.C12026x2;
import com.google.android.gms.internal.play_billing.C12030y2;
import com.google.android.gms.internal.play_billing.C12034z2;
import p333N9.AbstractBinderC5687h;

/* JADX INFO: renamed from: j6.G */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC16138G extends AbstractBinderC5687h {

    /* JADX INFO: renamed from: b */
    public final C12026x2 f50065b;

    public BinderC16138G(C12026x2 c12026x2) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 10);
        this.f50065b = c12026x2;
    }

    @Override // p333N9.AbstractBinderC5687h
    /* JADX INFO: renamed from: o */
    public final boolean mo6130o(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        AbstractC11947e.m13414b(parcel);
        Integer numValueOf = Integer.valueOf(i11);
        C12026x2 c12026x2 = this.f50065b;
        c12026x2.f36360d = true;
        C12034z2 c12034z2 = c12026x2.f36358b;
        if (c12034z2 != null) {
            C12030y2 c12030y2 = c12034z2.f36368Z;
            c12030y2.getClass();
            if (C12022w2.f36347r0.mo13462D(c12030y2, null, numValueOf)) {
                C12022w2.m13550d(c12030y2);
                c12026x2.f36357a = null;
                c12026x2.f36358b = null;
                c12026x2.f36359c = null;
            }
        }
        return true;
    }
}
