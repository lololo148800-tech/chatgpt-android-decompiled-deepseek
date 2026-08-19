package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0#X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%¨\u0006,"}, m18067d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "freePhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "getFreePhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "fullPricePhase", "getFullPricePhase", ParameterNames.f31999ID, "", "getId", "()Ljava/lang/String;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "introPhase", "getIntroPhase", "isBasePlan", "", "()Z", "isPrepaid", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "pricingPhases", "", "getPricingPhases", "()Ljava/util/List;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "tags", "getTags", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface SubscriptionOption {

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DefaultImpls {
        public static Period getBillingPeriod(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            if (fullPricePhase != null) {
                return fullPricePhase.getBillingPeriod();
            }
            return null;
        }

        public static PricingPhase getFreePhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = AbstractC17680n.m19337M(1, subscriptionOption.getPricingPhases()).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() == 0) {
                    return (PricingPhase) next;
                }
            }
            next = null;
            return (PricingPhase) next;
        }

        public static PricingPhase getFullPricePhase(SubscriptionOption subscriptionOption) {
            return (PricingPhase) AbstractC17680n.m19353c0(subscriptionOption.getPricingPhases());
        }

        public static PricingPhase getIntroPhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = AbstractC17680n.m19337M(1, subscriptionOption.getPricingPhases()).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() > 0) {
                    return (PricingPhase) next;
                }
            }
            next = null;
            return (PricingPhase) next;
        }

        @InterfaceC17300c
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        public static boolean isBasePlan(SubscriptionOption subscriptionOption) {
            return subscriptionOption.getPricingPhases().size() == 1;
        }

        public static boolean isPrepaid(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            return (fullPricePhase != null ? fullPricePhase.getRecurrenceMode() : null) == RecurrenceMode.NON_RECURRING;
        }
    }

    Period getBillingPeriod();

    PricingPhase getFreePhase();

    PricingPhase getFullPricePhase();

    String getId();

    InstallmentsInfo getInstallmentsInfo();

    PricingPhase getIntroPhase();

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    List<PricingPhase> getPricingPhases();

    PurchasingData getPurchasingData();

    List<String> getTags();

    boolean isBasePlan();

    boolean isPrepaid();
}
