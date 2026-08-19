package com.revenuecat.purchases.paywalls.events;

import android.gov.nist.javax.sip.parser.TokenNames;
import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import bo.AbstractC11516d;
import bo.C11515c;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b%\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB_\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u001a\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001fR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\"R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010\u001dR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\u001d¨\u0006>"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "", "", "sessionID", "", "revision", "displayMode", "", "darkMode", "localeIdentifier", "offeringId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionID", "getSessionID$annotations", "()V", TokenNames.f32012I, "getRevision", "getRevision$annotations", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getOfferingId", "getOfferingId$annotations", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PaywallPostReceiptData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final C11515c json = AbstractC11516d.f34842d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final int revision;
    private final String sessionID;

    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lbo/c;", "json", "Lbo/c;", "getJson", "()Lbo/c;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C11515c getJson() {
            return PaywallPostReceiptData.json;
        }

        public final KSerializer serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC17300c
    public /* synthetic */ PaywallPostReceiptData(int i10, String str, int i11, String str2, boolean z6, String str3, String str4, AbstractC11171j0 abstractC11171j0) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionID = str;
        this.revision = i11;
        this.displayMode = str2;
        this.darkMode = z6;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, int i10, String str2, boolean z6, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallPostReceiptData.sessionID;
        }
        if ((i11 & 2) != 0) {
            i10 = paywallPostReceiptData.revision;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str2 = paywallPostReceiptData.displayMode;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            z6 = paywallPostReceiptData.darkMode;
        }
        boolean z10 = z6;
        if ((i11 & 16) != 0) {
            str3 = paywallPostReceiptData.localeIdentifier;
        }
        String str6 = str3;
        if ((i11 & 32) != 0) {
            str4 = paywallPostReceiptData.offeringId;
        }
        return paywallPostReceiptData.copy(str, i12, str5, z10, str6, str4);
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallPostReceiptData self, InterfaceC10429b output, SerialDescriptor serialDesc) {
        output.mo5584r(serialDesc, 0, self.sessionID);
        output.mo5579m(1, self.revision, serialDesc);
        output.mo5584r(serialDesc, 2, self.displayMode);
        output.mo5583q(serialDesc, 3, self.darkMode);
        output.mo5584r(serialDesc, 4, self.localeIdentifier);
        output.mo5584r(serialDesc, 5, self.offeringId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDarkMode() {
        return this.darkMode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOfferingId() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String sessionID, int revision, String displayMode, boolean darkMode, String localeIdentifier, String offeringId) {
        AbstractC16544l.m18094g(sessionID, "sessionID");
        AbstractC16544l.m18094g(displayMode, "displayMode");
        AbstractC16544l.m18094g(localeIdentifier, "localeIdentifier");
        AbstractC16544l.m18094g(offeringId, "offeringId");
        return new PaywallPostReceiptData(sessionID, revision, displayMode, darkMode, localeIdentifier, offeringId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) other;
        return AbstractC16544l.m18089b(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && AbstractC16544l.m18089b(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && AbstractC16544l.m18089b(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && AbstractC16544l.m18089b(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public int hashCode() {
        int iM527p = AbstractC0168G.m527p(((this.sessionID.hashCode() * 31) + this.revision) * 31, 31, this.displayMode);
        boolean z6 = this.darkMode;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return this.offeringId.hashCode() + AbstractC0168G.m527p((iM527p + r6) * 31, 31, this.localeIdentifier);
    }

    public final Map<String, Object> toMap() {
        C11515c c11515c = json;
        c11515c.getClass();
        Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(c11515c.m12904c(INSTANCE.serializer(), this));
        if (mapAsMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(mapAsMap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaywallPostReceiptData(sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", revision=");
        sb2.append(this.revision);
        sb2.append(", displayMode=");
        sb2.append(this.displayMode);
        sb2.append(", darkMode=");
        sb2.append(this.darkMode);
        sb2.append(", localeIdentifier=");
        sb2.append(this.localeIdentifier);
        sb2.append(", offeringId=");
        return AbstractC9306j0.m9892k(sb2, this.offeringId, ')');
    }

    public PaywallPostReceiptData(String sessionID, int i10, String displayMode, boolean z6, String localeIdentifier, String offeringId) {
        AbstractC16544l.m18094g(sessionID, "sessionID");
        AbstractC16544l.m18094g(displayMode, "displayMode");
        AbstractC16544l.m18094g(localeIdentifier, "localeIdentifier");
        AbstractC16544l.m18094g(offeringId, "offeringId");
        this.sessionID = sessionID;
        this.revision = i10;
        this.displayMode = displayMode;
        this.darkMode = z6;
        this.localeIdentifier = localeIdentifier;
        this.offeringId = offeringId;
    }
}
