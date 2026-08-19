package com.revenuecat.purchases.subscriberattributes;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p909nm.C17689w;

/* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class C12764x2cb86e5e extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ InterfaceC1426a $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ C16558z $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12764x2cb86e5e(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, C16558z c16558z, InterfaceC1426a interfaceC1426a, int i10) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = c16558z;
        this.$completion = interfaceC1426a;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22527invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22527invoke() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, C17689w.f56480Y);
        AbstractC12107L1.m13831v(new Object[]{this.$syncingAppUserID}, 1, AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, LogIntent.RC_SUCCESS);
        if (!AbstractC16544l.m18089b(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
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
