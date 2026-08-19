package com.revenuecat.purchases;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1426a;
import p165G9.AbstractC3021g;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18067d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Transaction;", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomerInfo$nonSubscriptionTransactions$2 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$nonSubscriptionTransactions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // p049Bm.InterfaceC1426a
    public final List<Transaction> invoke() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC16544l.m18093f(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            String productId = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(productId);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject transactionJSONObject = jSONArray.getJSONObject(i10);
                AbstractC16544l.m18093f(productId, "productId");
                AbstractC16544l.m18093f(transactionJSONObject, "transactionJSONObject");
                arrayList.add(new Transaction(productId, transactionJSONObject));
            }
        }
        return AbstractC17680n.m19370t0(arrayList, new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC3021g.m3873a(((Transaction) t10).getPurchaseDate(), ((Transaction) t11).getPurchaseDate());
            }
        });
    }
}
