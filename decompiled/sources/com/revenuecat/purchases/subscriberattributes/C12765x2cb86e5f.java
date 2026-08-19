package com.revenuecat.purchases.subscriberattributes;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;

/* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "didBackendGetAttributes", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ZLjava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class C12765x2cb86e5f extends AbstractC16546n implements InterfaceC1440o {
    final /* synthetic */ InterfaceC1426a $completion;
    final /* synthetic */ C16558z $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12765x2cb86e5f(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, C16558z c16558z, InterfaceC1426a interfaceC1426a, int i10) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = c16558z;
        this.$completion = interfaceC1426a;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // p049Bm.InterfaceC1440o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue(), (List<SubscriberAttributeError>) obj3);
        return C17296C.f55119a;
    }

    public final void invoke(PurchasesError error, boolean z6, List<SubscriberAttributeError> attributeErrors) {
        AbstractC16544l.m18094g(error, "error");
        AbstractC16544l.m18094g(attributeErrors, "attributeErrors");
        if (z6) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, attributeErrors);
        }
        AbstractC12107L1.m13831v(new Object[]{this.$syncingAppUserID, error}, 2, AttributionStrings.ATTRIBUTES_SYNC_ERROR, LogIntent.RC_ERROR);
        C16558z c16558z = this.$currentSyncedAttributeCount;
        int i10 = c16558z.f51287Y + 1;
        c16558z.f51287Y = i10;
        InterfaceC1426a interfaceC1426a = this.$completion;
        if (interfaceC1426a == null || i10 != this.$unsyncedStoredAttributesCount) {
            return;
        }
        interfaceC1426a.invoke();
    }
}
