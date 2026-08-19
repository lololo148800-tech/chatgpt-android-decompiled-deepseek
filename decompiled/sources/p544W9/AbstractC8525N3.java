package p544W9;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8038Z3;
import p618Za.C10267f;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p826j6.AbstractC16144M;
import p826j6.C16137F;
import p826j6.C16155i;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.N3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8525N3 {
    /* JADX INFO: renamed from: a */
    public static Double m9190a(InterfaceC1436k interfaceC1436k, Object obj) {
        ArrayList arrayListM8395d = obj != null ? AbstractC8038Z3.m8395d(obj) : null;
        ArrayList arrayListM19339O = arrayListM8395d != null ? AbstractC17680n.m19339O(arrayListM8395d) : null;
        if (!AbstractC16544l.m18089b(arrayListM19339O != null ? Integer.valueOf(arrayListM19339O.size()) : null, arrayListM8395d != null ? Integer.valueOf(arrayListM8395d.size()) : null) || arrayListM8395d == null) {
            return null;
        }
        return (Double) interfaceC1436k.invoke(AbstractC17680n.m19339O(arrayListM8395d));
    }

    /* JADX INFO: renamed from: b */
    public static C16137F m9191b(String str, Bundle bundle) {
        C16155i c16155i = AbstractC16144M.f50086i;
        if (bundle == null) {
            AbstractC11988o0.m13512g("BillingClient", str.concat(" got null owned items list"));
            return new C16137F(c16155i, 54, 11);
        }
        int iM13506a = AbstractC11988o0.m13506a("BillingClient", bundle);
        String strM13510e = AbstractC11988o0.m13510e("BillingClient", bundle);
        C10267f c10267fM17778a = C16155i.m17778a();
        c10267fM17778a.f30498b = iM13506a;
        c10267fM17778a.f30497a = strM13510e;
        C16155i c16155iM10864c = c10267fM17778a.m10864c();
        if (iM13506a != 0) {
            AbstractC11988o0.m13512g("BillingClient", str + " failed. Response code: " + iM13506a);
            return new C16137F(c16155iM10864c, 23, 11);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            AbstractC11988o0.m13512g("BillingClient", "Bundle returned from " + str + tpXhEMGxfXFVSh.HrfirZQa);
            return new C16137F(c16155i, 55, 11);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            AbstractC11988o0.m13512g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new C16137F(c16155i, 56, 11);
        }
        if (stringArrayList2 == null) {
            AbstractC11988o0.m13512g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new C16137F(c16155i, 57, 11);
        }
        if (stringArrayList3 != null) {
            return new C16137F(AbstractC16144M.f50087j, 1, 11);
        }
        AbstractC11988o0.m13512g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new C16137F(c16155i, 58, 11);
    }
}
