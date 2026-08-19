package p826j6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11922X;
import com.google.android.gms.internal.play_billing.EnumC11884K;
import p618Za.C10267f;

/* JADX INFO: renamed from: j6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16155i {

    /* JADX INFO: renamed from: a */
    public int f50151a;

    /* JADX INFO: renamed from: b */
    public String f50152b;

    /* JADX INFO: renamed from: a */
    public static C10267f m17778a() {
        C10267f c10267f = new C10267f();
        c10267f.f30497a = "";
        return c10267f;
    }

    public final String toString() {
        int i10 = this.f50151a;
        int i11 = AbstractC11988o0.f36308a;
        C11922X c11922x = EnumC11884K.f36153o0;
        Integer numValueOf = Integer.valueOf(i10);
        return AbstractC10763a.m11055m("Response Code: ", (!c11922x.containsKey(numValueOf) ? EnumC11884K.RESPONSE_CODE_UNSPECIFIED : (EnumC11884K) c11922x.get(numValueOf)).toString(), ", Debug Message: ", this.f50152b);
    }
}
