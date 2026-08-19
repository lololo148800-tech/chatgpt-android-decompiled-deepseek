package p826j6;

import com.revenuecat.purchases.google.ErrorsKt;
import p618Za.C10267f;

/* JADX INFO: renamed from: j6.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16144M {

    /* JADX INFO: renamed from: A */
    public static final C16155i f50073A;

    /* JADX INFO: renamed from: B */
    public static final C16155i f50074B;

    /* JADX INFO: renamed from: C */
    public static final C16155i f50075C;

    /* JADX INFO: renamed from: D */
    public static final C16155i f50076D;

    /* JADX INFO: renamed from: E */
    public static final C16155i f50077E;

    /* JADX INFO: renamed from: a */
    public static final C16155i f50078a;

    /* JADX INFO: renamed from: b */
    public static final C16155i f50079b;

    /* JADX INFO: renamed from: c */
    public static final C16155i f50080c;

    /* JADX INFO: renamed from: d */
    public static final C16155i f50081d;

    /* JADX INFO: renamed from: e */
    public static final C16155i f50082e;

    /* JADX INFO: renamed from: f */
    public static final C16155i f50083f;

    /* JADX INFO: renamed from: g */
    public static final C16155i f50084g;

    /* JADX INFO: renamed from: h */
    public static final C16155i f50085h;

    /* JADX INFO: renamed from: i */
    public static final C16155i f50086i;

    /* JADX INFO: renamed from: j */
    public static final C16155i f50087j;

    /* JADX INFO: renamed from: k */
    public static final C16155i f50088k;

    /* JADX INFO: renamed from: l */
    public static final C16155i f50089l;

    /* JADX INFO: renamed from: m */
    public static final C16155i f50090m;

    /* JADX INFO: renamed from: n */
    public static final C16155i f50091n;

    /* JADX INFO: renamed from: o */
    public static final C16155i f50092o;

    /* JADX INFO: renamed from: p */
    public static final C16155i f50093p;

    /* JADX INFO: renamed from: q */
    public static final C16155i f50094q;

    /* JADX INFO: renamed from: r */
    public static final C16155i f50095r;

    /* JADX INFO: renamed from: s */
    public static final C16155i f50096s;

    /* JADX INFO: renamed from: t */
    public static final C16155i f50097t;

    /* JADX INFO: renamed from: u */
    public static final C16155i f50098u;

    /* JADX INFO: renamed from: v */
    public static final C16155i f50099v;

    /* JADX INFO: renamed from: w */
    public static final C16155i f50100w;

    /* JADX INFO: renamed from: x */
    public static final C16155i f50101x;

    /* JADX INFO: renamed from: y */
    public static final C16155i f50102y;

    /* JADX INFO: renamed from: z */
    public static final C16155i f50103z;

    static {
        C10267f c10267fM17778a = C16155i.m17778a();
        c10267fM17778a.f30498b = 3;
        c10267fM17778a.f30497a = ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE;
        f50078a = c10267fM17778a.m10864c();
        C10267f c10267fM17778a2 = C16155i.m17778a();
        c10267fM17778a2.f30498b = 3;
        c10267fM17778a2.f30497a = "Google Play In-app Billing API version is less than 9";
        f50079b = c10267fM17778a2.m10864c();
        C10267f c10267fM17778a3 = C16155i.m17778a();
        c10267fM17778a3.f30498b = 3;
        c10267fM17778a3.f30497a = "Billing service unavailable on device.";
        f50080c = c10267fM17778a3.m10864c();
        C10267f c10267fM17778a4 = C16155i.m17778a();
        c10267fM17778a4.f30498b = 2;
        c10267fM17778a4.f30497a = "Billing service unavailable on device.";
        f50081d = c10267fM17778a4.m10864c();
        C10267f c10267fM17778a5 = C16155i.m17778a();
        c10267fM17778a5.f30498b = 5;
        c10267fM17778a5.f30497a = "Client is already in the process of connecting to billing service.";
        f50082e = c10267fM17778a5.m10864c();
        C10267f c10267fM17778a6 = C16155i.m17778a();
        c10267fM17778a6.f30498b = 5;
        c10267fM17778a6.f30497a = "The list of SKUs can't be empty.";
        c10267fM17778a6.m10864c();
        C10267f c10267fM17778a7 = C16155i.m17778a();
        c10267fM17778a7.f30498b = 5;
        c10267fM17778a7.f30497a = "SKU type can't be empty.";
        c10267fM17778a7.m10864c();
        C10267f c10267fM17778a8 = C16155i.m17778a();
        c10267fM17778a8.f30498b = 5;
        c10267fM17778a8.f30497a = "Product type can't be empty.";
        f50083f = c10267fM17778a8.m10864c();
        C10267f c10267fM17778a9 = C16155i.m17778a();
        c10267fM17778a9.f30498b = -2;
        c10267fM17778a9.f30497a = "Client does not support extra params.";
        f50084g = c10267fM17778a9.m10864c();
        C10267f c10267fM17778a10 = C16155i.m17778a();
        c10267fM17778a10.f30498b = 5;
        c10267fM17778a10.f30497a = "Invalid purchase token.";
        f50085h = c10267fM17778a10.m10864c();
        C10267f c10267fM17778a11 = C16155i.m17778a();
        c10267fM17778a11.f30498b = 6;
        c10267fM17778a11.f30497a = "An internal error occurred.";
        f50086i = c10267fM17778a11.m10864c();
        C10267f c10267fM17778a12 = C16155i.m17778a();
        c10267fM17778a12.f30498b = 5;
        c10267fM17778a12.f30497a = "SKU can't be null.";
        c10267fM17778a12.m10864c();
        C10267f c10267fM17778a13 = C16155i.m17778a();
        c10267fM17778a13.f30498b = 0;
        f50087j = c10267fM17778a13.m10864c();
        C10267f c10267fM17778a14 = C16155i.m17778a();
        c10267fM17778a14.f30498b = -1;
        c10267fM17778a14.f30497a = "Service connection is disconnected.";
        f50088k = c10267fM17778a14.m10864c();
        C10267f c10267fM17778a15 = C16155i.m17778a();
        c10267fM17778a15.f30498b = 2;
        c10267fM17778a15.f30497a = "Timeout communicating with service.";
        f50089l = c10267fM17778a15.m10864c();
        C10267f c10267fM17778a16 = C16155i.m17778a();
        c10267fM17778a16.f30498b = -2;
        c10267fM17778a16.f30497a = "Client does not support subscriptions.";
        f50090m = c10267fM17778a16.m10864c();
        C10267f c10267fM17778a17 = C16155i.m17778a();
        c10267fM17778a17.f30498b = -2;
        c10267fM17778a17.f30497a = "Client does not support subscriptions update.";
        f50091n = c10267fM17778a17.m10864c();
        C10267f c10267fM17778a18 = C16155i.m17778a();
        c10267fM17778a18.f30498b = -2;
        c10267fM17778a18.f30497a = "Client does not support get purchase history.";
        f50092o = c10267fM17778a18.m10864c();
        C10267f c10267fM17778a19 = C16155i.m17778a();
        c10267fM17778a19.f30498b = -2;
        c10267fM17778a19.f30497a = "Client does not support price change confirmation.";
        f50093p = c10267fM17778a19.m10864c();
        C10267f c10267fM17778a20 = C16155i.m17778a();
        c10267fM17778a20.f30498b = -2;
        c10267fM17778a20.f30497a = "Play Store version installed does not support cross selling products.";
        f50094q = c10267fM17778a20.m10864c();
        C10267f c10267fM17778a21 = C16155i.m17778a();
        c10267fM17778a21.f30498b = -2;
        c10267fM17778a21.f30497a = "Client does not support multi-item purchases.";
        f50095r = c10267fM17778a21.m10864c();
        C10267f c10267fM17778a22 = C16155i.m17778a();
        c10267fM17778a22.f30498b = -2;
        c10267fM17778a22.f30497a = "Client does not support offer_id_token.";
        f50096s = c10267fM17778a22.m10864c();
        C10267f c10267fM17778a23 = C16155i.m17778a();
        c10267fM17778a23.f30498b = -2;
        c10267fM17778a23.f30497a = "Client does not support ProductDetails.";
        f50097t = c10267fM17778a23.m10864c();
        C10267f c10267fM17778a24 = C16155i.m17778a();
        c10267fM17778a24.f30498b = -2;
        c10267fM17778a24.f30497a = "Client does not support in-app messages.";
        f50098u = c10267fM17778a24.m10864c();
        C10267f c10267fM17778a25 = C16155i.m17778a();
        c10267fM17778a25.f30498b = -2;
        c10267fM17778a25.f30497a = "Client does not support user choice billing.";
        c10267fM17778a25.m10864c();
        C10267f c10267fM17778a26 = C16155i.m17778a();
        c10267fM17778a26.f30498b = -2;
        c10267fM17778a26.f30497a = "Play Store version installed does not support external offer.";
        f50099v = c10267fM17778a26.m10864c();
        C10267f c10267fM17778a27 = C16155i.m17778a();
        c10267fM17778a27.f30498b = -2;
        c10267fM17778a27.f30497a = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        f50100w = c10267fM17778a27.m10864c();
        C10267f c10267fM17778a28 = C16155i.m17778a();
        c10267fM17778a28.f30498b = 5;
        c10267fM17778a28.f30497a = "Unknown feature";
        f50101x = c10267fM17778a28.m10864c();
        C10267f c10267fM17778a29 = C16155i.m17778a();
        c10267fM17778a29.f30498b = -2;
        c10267fM17778a29.f30497a = "Play Store version installed does not support get billing config.";
        f50102y = c10267fM17778a29.m10864c();
        C10267f c10267fM17778a30 = C16155i.m17778a();
        c10267fM17778a30.f30498b = -2;
        c10267fM17778a30.f30497a = "Query product details with serialized docid is not supported.";
        f50103z = c10267fM17778a30.m10864c();
        C10267f c10267fM17778a31 = C16155i.m17778a();
        c10267fM17778a31.f30498b = 4;
        c10267fM17778a31.f30497a = "Item is unavailable for purchase.";
        f50073A = c10267fM17778a31.m10864c();
        C10267f c10267fM17778a32 = C16155i.m17778a();
        c10267fM17778a32.f30498b = -2;
        c10267fM17778a32.f30497a = "Query product details with developer specified account is not supported.";
        f50074B = c10267fM17778a32.m10864c();
        C10267f c10267fM17778a33 = C16155i.m17778a();
        c10267fM17778a33.f30498b = -2;
        c10267fM17778a33.f30497a = "Play Store version installed does not support alternative billing only.";
        f50075C = c10267fM17778a33.m10864c();
        C10267f c10267fM17778a34 = C16155i.m17778a();
        c10267fM17778a34.f30498b = 5;
        c10267fM17778a34.f30497a = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f50076D = c10267fM17778a34.m10864c();
        C10267f c10267fM17778a35 = C16155i.m17778a();
        c10267fM17778a35.f30498b = 6;
        c10267fM17778a35.f30497a = "An error occurred while retrieving billing override.";
        f50077E = c10267fM17778a35.m10864c();
    }

    /* JADX INFO: renamed from: a */
    public static C16155i m17720a(int i10, String str) {
        C10267f c10267fM17778a = C16155i.m17778a();
        c10267fM17778a.f30498b = i10;
        c10267fM17778a.f30497a = str;
        return c10267fM17778a.m10864c();
    }
}
