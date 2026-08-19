package p826j6;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11907S;
import com.google.android.gms.internal.play_billing.C11935b;
import com.google.android.gms.internal.play_billing.C12027y;
import com.google.android.gms.internal.play_billing.InterfaceC11943d;
import com.revenuecat.purchases.google.usecase.C12746a;
import com.revenuecat.purchases.google.usecase.C12748c;
import com.revenuecat.purchases.google.usecase.C12749d;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p013Ab.C0420b;
import p265Kb.C4612e;
import p265Kb.C4613f;
import p544W9.AbstractC8525N3;
import p658b5.C11234e;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: j6.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC16170x implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16149c f50192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f50193c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f50194d;

    public /* synthetic */ CallableC16170x(C16149c c16149c, Object obj, Object obj2, int i10) {
        this.f50191a = i10;
        this.f50192b = c16149c;
        this.f50193c = obj;
        this.f50194d = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m17783a() {
        InterfaceC11943d interfaceC11943d;
        int i10;
        String strM13510e;
        C16149c c16149c = this.f50192b;
        C4613f c4613f = (C4613f) this.f50193c;
        C12746a c12746a = (C12746a) this.f50194d;
        c16149c.getClass();
        String str = c4613f.f15035Y;
        try {
            AbstractC11988o0.m13511f("BillingClient", "Consuming purchase with token: ".concat(str));
            synchronized (c16149c.f50112a) {
                interfaceC11943d = c16149c.f50119h;
            }
            if (interfaceC11943d == null) {
                c16149c.m17774x(c12746a, str, AbstractC16144M.f50088k, 119, "Service has been reset to null.", null);
                return null;
            }
            if (c16149c.f50126o) {
                String packageName = c16149c.f50117f.getPackageName();
                boolean z6 = c16149c.f50126o;
                String str2 = c16149c.f50114c;
                long jLongValue = c16149c.f50111E.longValue();
                Bundle bundle = new Bundle();
                if (z6) {
                    AbstractC11988o0.m13507b(bundle, str2, jLongValue);
                }
                Bundle bundleM13406u = ((C11935b) interfaceC11943d).m13406u(packageName, str, bundle);
                i10 = bundleM13406u.getInt("RESPONSE_CODE");
                strM13510e = AbstractC11988o0.m13510e("BillingClient", bundleM13406u);
            } else {
                String packageName2 = c16149c.f50117f.getPackageName();
                C11935b c11935b = (C11935b) interfaceC11943d;
                Parcel parcelM6119p = c11935b.m6119p();
                parcelM6119p.writeInt(3);
                parcelM6119p.writeString(packageName2);
                parcelM6119p.writeString(str);
                Parcel parcelM6120q = c11935b.m6120q(parcelM6119p, 5);
                i10 = parcelM6120q.readInt();
                parcelM6120q.recycle();
                strM13510e = "";
            }
            C16155i c16155iM17720a = AbstractC16144M.m17720a(i10, strM13510e);
            if (i10 == 0) {
                AbstractC11988o0.m13511f("BillingClient", "Successfully consumed purchase.");
                c12746a.m14489d(c16155iM17720a, str);
                return null;
            }
            c16149c.m17774x(c12746a, str, c16155iM17720a, 23, "Error consuming purchase with token. Response code: " + i10, null);
            return null;
        } catch (DeadObjectException e10) {
            c16149c.m17774x(c12746a, str, AbstractC16144M.f50088k, 29, "Error consuming purchase!", e10);
            return null;
        } catch (Exception e11) {
            c16149c.m17774x(c12746a, str, AbstractC16144M.f50086i, 29, "Error consuming purchase!", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private final Object m17785c() {
        C11234e c11234eM17771u;
        InterfaceC11943d interfaceC11943d;
        Bundle bundleM13410y;
        boolean z6 = true;
        C16149c c16149c = this.f50192b;
        String str = (String) this.f50193c;
        c16149c.getClass();
        AbstractC11988o0.m13511f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z10 = c16149c.f50126o;
        boolean z11 = c16149c.f50133v;
        c16149c.f50107A.getClass();
        Bundle bundleM13508c = AbstractC11988o0.m13508c(z10, z11, c16149c.f50107A.f1278Z, c16149c.f50114c, c16149c.f50111E.longValue());
        Exception exc = null;
        String string = null;
        while (true) {
            try {
                synchronized (c16149c.f50112a) {
                    interfaceC11943d = c16149c.f50119h;
                }
                if (interfaceC11943d == null) {
                    c11234eM17771u = c16149c.m17771u(AbstractC16144M.f50088k, 119, "Service has been reset to null", exc);
                    break;
                }
                if (c16149c.f50126o) {
                    bundleM13410y = ((C11935b) interfaceC11943d).m13411z(z6 != c16149c.f50133v ? 9 : 19, c16149c.f50117f.getPackageName(), str, string, bundleM13508c);
                } else {
                    bundleM13410y = ((C11935b) interfaceC11943d).m13410y(c16149c.f50117f.getPackageName(), str, string);
                }
                C16137F c16137fM9191b = AbstractC8525N3.m9191b("getPurchase()", bundleM13410y);
                C16155i c16155i = (C16155i) c16137fM9191b.f50064o0;
                if (c16155i != AbstractC16144M.f50087j) {
                    c11234eM17771u = c16149c.m17771u(c16155i, c16137fM9191b.f50063Z, "Purchase bundle invalid", exc);
                    break;
                }
                ArrayList<String> stringArrayList = bundleM13410y.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleM13410y.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleM13410y.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i10 = 0;
                boolean z12 = false;
                while (i10 < stringArrayList2.size()) {
                    String str2 = stringArrayList2.get(i10);
                    String str3 = stringArrayList3.get(i10);
                    AbstractC11988o0.m13511f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i10))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.m13149b())) {
                            AbstractC11988o0.m13512g("BillingClient", "BUG: empty/null token!");
                            z12 = true;
                        }
                        arrayList.add(purchase);
                        i10++;
                        z6 = true;
                    } catch (JSONException e10) {
                        c11234eM17771u = c16149c.m17771u(AbstractC16144M.f50086i, 51, "Got an exception trying to decode the purchase!", e10);
                    }
                }
                boolean z13 = z6;
                if (z12) {
                    c16149c.m17756D(26, 9, AbstractC16144M.f50086i);
                }
                string = bundleM13410y.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC11988o0.m13511f("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    c11234eM17771u = new C11234e(AbstractC16144M.f50087j, arrayList, false, 27);
                    break;
                }
                z6 = z13;
                exc = null;
            } catch (DeadObjectException e11) {
                c11234eM17771u = c16149c.m17771u(AbstractC16144M.f50088k, 52, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                c11234eM17771u = c16149c.m17771u(AbstractC16144M.f50086i, 52, "Got exception trying to get purchases try to reconnect", e12);
            }
        }
        ArrayList arrayList2 = (ArrayList) c11234eM17771u.f34001Z;
        if (arrayList2 != null) {
            ((C12748c) this.f50194d).mo14486a((C16155i) c11234eM17771u.f34002o0, arrayList2);
            return null;
        }
        C12748c c12748c = (C12748c) this.f50194d;
        C16155i c16155i2 = (C16155i) c11234eM17771u.f34002o0;
        C12027y c12027y = AbstractC11857B.f36097Z;
        c12748c.mo14486a(c16155i2, C11907S.f36188q0);
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final Object m17786d() {
        C15384c c15384c;
        InterfaceC11943d interfaceC11943d;
        C16149c c16149c = this.f50192b;
        String str = (String) this.f50193c;
        c16149c.getClass();
        AbstractC11988o0.m13511f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z6 = c16149c.f50126o;
        boolean z10 = c16149c.f50133v;
        c16149c.f50107A.getClass();
        Bundle bundleM13508c = AbstractC11988o0.m13508c(z6, z10, c16149c.f50107A.f1278Z, c16149c.f50114c, c16149c.f50111E.longValue());
        Exception exc = null;
        String string = null;
        while (c16149c.f50124m) {
            try {
                synchronized (c16149c.f50112a) {
                    interfaceC11943d = c16149c.f50119h;
                }
                if (interfaceC11943d == null) {
                    c15384c = c16149c.m17770t(AbstractC16144M.f50088k, 119, "Service reset to null", exc);
                } else {
                    Bundle bundleM13409x = ((C11935b) interfaceC11943d).m13409x(c16149c.f50117f.getPackageName(), str, string, bundleM13508c);
                    C16137F c16137fM9191b = AbstractC8525N3.m9191b("getPurchaseHistory()", bundleM13409x);
                    C16155i c16155i = (C16155i) c16137fM9191b.f50064o0;
                    if (c16155i != AbstractC16144M.f50087j) {
                        c16149c.m17756D(c16137fM9191b.f50063Z, 11, c16155i);
                        c15384c = new C15384c(c16155i, exc, false, 26);
                    } else {
                        ArrayList<String> stringArrayList = bundleM13409x.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundleM13409x.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundleM13409x.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        boolean z11 = false;
                        for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                            String str2 = stringArrayList2.get(i10);
                            String str3 = stringArrayList3.get(i10);
                            AbstractC11988o0.m13511f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i10))));
                            try {
                                PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                                JSONObject jSONObject = purchaseHistoryRecord.f35955c;
                                if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                    AbstractC11988o0.m13512g("BillingClient", "BUG: empty/null token!");
                                    z11 = true;
                                }
                                arrayList.add(purchaseHistoryRecord);
                            } catch (JSONException e10) {
                                c15384c = c16149c.m17770t(AbstractC16144M.f50086i, 51, "Got an exception trying to decode the purchase!", e10);
                            }
                        }
                        if (z11) {
                            c16149c.m17756D(26, 11, AbstractC16144M.f50086i);
                        }
                        string = bundleM13409x.getString("INAPP_CONTINUATION_TOKEN");
                        AbstractC11988o0.m13511f("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                        if (TextUtils.isEmpty(string)) {
                            c15384c = new C15384c(AbstractC16144M.f50087j, arrayList, false, 26);
                        } else {
                            exc = null;
                        }
                    }
                }
            } catch (DeadObjectException e11) {
                c15384c = c16149c.m17770t(AbstractC16144M.f50088k, 59, "Got exception trying to get purchase history", e11);
            } catch (Exception e12) {
                c15384c = c16149c.m17770t(AbstractC16144M.f50086i, 59, "Got exception trying to get purchase history", e12);
            }
            ((C12749d) this.f50194d).m14491a((C16155i) c15384c.f47968o0, (ArrayList) c15384c.f47967Z);
            return null;
        }
        AbstractC11988o0.m13512g("BillingClient", "getPurchaseHistory is not supported on current device");
        c15384c = new C15384c(AbstractC16144M.f50092o, exc, false, 26);
        ((C12749d) this.f50194d).m14491a((C16155i) c15384c.f47968o0, (ArrayList) c15384c.f47967Z);
        return null;
    }

    /* JADX INFO: renamed from: e */
    private final Object m17787e() {
        Bundle bundleM13514i;
        InterfaceC11943d interfaceC11943d;
        C16149c c16149c = this.f50192b;
        String str = (String) this.f50193c;
        String str2 = (String) this.f50194d;
        c16149c.getClass();
        try {
            synchronized (c16149c.f50112a) {
                interfaceC11943d = c16149c.f50119h;
            }
            if (interfaceC11943d == null) {
                return AbstractC11988o0.m13514i(AbstractC16144M.f50088k, 119);
            }
            return ((C11935b) interfaceC11943d).m13407v(c16149c.f50117f.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            C16155i c16155i = AbstractC16144M.f50088k;
            String strM17716a = AbstractC16142K.m17716a(e10);
            bundleM13514i = AbstractC11988o0.m13514i(c16155i, 5);
            if (strM17716a != null) {
                bundleM13514i.putString("ADDITIONAL_LOG_DETAILS", strM17716a);
            }
            return bundleM13514i;
        } catch (Exception e11) {
            C16155i c16155i2 = AbstractC16144M.f50086i;
            String strM17716a2 = AbstractC16142K.m17716a(e11);
            bundleM13514i = AbstractC11988o0.m13514i(c16155i2, 5);
            if (strM17716a2 != null) {
                bundleM13514i.putString("ADDITIONAL_LOG_DETAILS", strM17716a2);
            }
            return bundleM13514i;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC11943d interfaceC11943d;
        switch (this.f50191a) {
            case 0:
                return m17783a();
            case 1:
                return m17784b();
            case 2:
                return m17785c();
            case 3:
                return m17786d();
            case 4:
                return m17787e();
            default:
                C16149c c16149c = this.f50192b;
                C12746a c12746a = (C12746a) this.f50193c;
                C4612e c4612e = (C4612e) this.f50194d;
                c16149c.getClass();
                try {
                    synchronized (c16149c.f50112a) {
                        interfaceC11943d = c16149c.f50119h;
                        break;
                    }
                    if (interfaceC11943d == null) {
                        c16149c.m17773w(c12746a, AbstractC16144M.f50088k, 119, null);
                    } else {
                        String packageName = c16149c.f50117f.getPackageName();
                        String str = c4612e.f15034Z;
                        String str2 = c16149c.f50114c;
                        long jLongValue = c16149c.f50111E.longValue();
                        Bundle bundle = new Bundle();
                        AbstractC11988o0.m13507b(bundle, str2, jLongValue);
                        Bundle bundleM13405t = ((C11935b) interfaceC11943d).m13405t(packageName, str, bundle);
                        c12746a.m14488c(AbstractC16144M.m17720a(AbstractC11988o0.m13506a("BillingClient", bundleM13405t), AbstractC11988o0.m13510e("BillingClient", bundleM13405t)));
                    }
                } catch (DeadObjectException e10) {
                    c16149c.m17773w(c12746a, AbstractC16144M.f50088k, 28, e10);
                } catch (Exception e11) {
                    c16149c.m17773w(c12746a, AbstractC16144M.f50086i, 28, e11);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private final Object m17784b() {
        C0420b c0420b;
        InterfaceC11943d interfaceC11943d;
        C16149c c16149c = this.f50192b;
        C16167u c16167u = (C16167u) this.f50193c;
        c16149c.getClass();
        ArrayList arrayList = new ArrayList();
        String str = ((C16166t) c16167u.f50188a.get(0)).f50187b;
        AbstractC11857B abstractC11857B = c16167u.f50188a;
        int size = abstractC11857B.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList arrayList2 = new ArrayList(abstractC11857B.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(((C16166t) arrayList2.get(i12)).f50186a);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", c16149c.f50114c);
            try {
                synchronized (c16149c.f50112a) {
                    interfaceC11943d = c16149c.f50119h;
                }
                if (interfaceC11943d == null) {
                    c0420b = c16149c.m17769s(AbstractC16144M.f50088k, 119, "Service has been reset to null.", null);
                } else {
                    int i13 = true != c16149c.f50134w ? 17 : 20;
                    String packageName = c16149c.f50117f.getPackageName();
                    boolean z6 = c16149c.f50133v && c16149c.f50107A.f1278Z;
                    String str2 = c16149c.f50114c;
                    c16149c.m17762k();
                    c16149c.m17762k();
                    c16149c.m17762k();
                    c16149c.m17762k();
                    long jLongValue = c16149c.f50111E.longValue();
                    Bundle bundle2 = new Bundle();
                    AbstractC11988o0.m13507b(bundle2, str2, jLongValue);
                    bundle2.putBoolean("enablePendingPurchases", true);
                    bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                    if (z6) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    int size3 = arrayList2.size();
                    int i14 = 0;
                    boolean z10 = false;
                    while (i14 < size3) {
                        C16166t c16166t = (C16166t) arrayList2.get(i14);
                        ArrayList arrayList6 = arrayList2;
                        arrayList4.add(null);
                        z10 |= !TextUtils.isEmpty(null);
                        if (c16166t.f50187b.equals("first_party")) {
                            throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        }
                        i14++;
                        arrayList2 = arrayList6;
                    }
                    if (z10) {
                        bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                    }
                    Bundle bundleM13401A = ((C11935b) interfaceC11943d).m13401A(i13, packageName, str, bundle, bundle2);
                    if (bundleM13401A == null) {
                        c0420b = c16149c.m17769s(AbstractC16144M.f50073A, 44, "queryProductDetailsAsync got empty product details response.", null);
                    } else if (bundleM13401A.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleM13401A.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null) {
                            for (int i15 = 0; i15 < stringArrayList.size(); i15++) {
                                try {
                                    C16162p c16162p = new C16162p(stringArrayList.get(i15));
                                    AbstractC11988o0.m13511f("BillingClient", "Got product details: ".concat(c16162p.toString()));
                                    arrayList.add(c16162p);
                                } catch (JSONException e10) {
                                    c0420b = c16149c.m17769s(AbstractC16144M.m17720a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                                }
                            }
                            i10 = i11;
                        } else {
                            c0420b = c16149c.m17769s(AbstractC16144M.f50073A, 46, CsqksqyPE.YbDQWIttNeIV, null);
                        }
                    } else {
                        int iM13506a = AbstractC11988o0.m13506a("BillingClient", bundleM13401A);
                        String strM13510e = AbstractC11988o0.m13510e("BillingClient", bundleM13401A);
                        c0420b = iM13506a != 0 ? c16149c.m17769s(AbstractC16144M.m17720a(iM13506a, strM13510e), 23, AbstractC10763a.m11048f(iM13506a, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c16149c.m17769s(AbstractC16144M.m17720a(6, strM13510e), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                }
            } catch (DeadObjectException e11) {
                c0420b = c16149c.m17769s(AbstractC16144M.f50088k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            } catch (Exception e12) {
                c0420b = c16149c.m17769s(AbstractC16144M.f50086i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            }
            ((C12748c) this.f50194d).mo14487b(AbstractC16144M.m17720a(c0420b.f1381Z, (String) c0420b.f1382o0), (ArrayList) c0420b.f1383p0);
            return null;
        }
        c0420b = new C0420b(0, "", arrayList);
        ((C12748c) this.f50194d).mo14487b(AbstractC16144M.m17720a(c0420b.f1381Z, (String) c0420b.f1382o0), (ArrayList) c0420b.f1383p0);
        return null;
    }
}
