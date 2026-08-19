package com.revenuecat.purchases.paywalls.events;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0002MLB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u008f\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J~\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J(\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200HÇ\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0018R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u0018R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u0018R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b@\u0010<\u001a\u0004\b?\u0010\u0018R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010!R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u0018R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010G\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010$R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00105\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010\u0018¨\u0006N"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "", "", ParameterNames.f31999ID, "", "version", "type", "appUserID", "sessionID", "offeringID", "paywallRevision", "", DiagnosticsEntry.TIMESTAMP_KEY, "displayMode", "", "darkMode", "localeIdentifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;)V", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Lao/j0;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()J", "component9", "component10", "()Z", "component11", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", TokenNames.f32012I, "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getSessionID", "getSessionID$annotations", "getOfferingID", "getOfferingID$annotations", "getPaywallRevision", "getPaywallRevision$annotations", "J", "getTimestamp", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PaywallBackendEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;
    private final String appUserID;
    private final boolean darkMode;
    private final String displayMode;
    private final String id;
    private final String localeIdentifier;
    private final String offeringID;
    private final int paywallRevision;
    private final String sessionID;
    private final long timestamp;
    private final String type;
    private final int version;

    @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent$Companion;", "", "()V", "PAYWALL_EVENT_SCHEMA_VERSION", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallBackendEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC17300c
    public /* synthetic */ PaywallBackendEvent(int i10, String str, int i11, String str2, String str3, String str4, String str5, int i12, long j10, String str6, boolean z6, String str7, AbstractC11171j0 abstractC11171j0) {
        if (2047 != (i10 & 2047)) {
            AbstractC11153a0.m12389l(i10, 2047, PaywallBackendEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.version = i11;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i12;
        this.timestamp = j10;
        this.displayMode = str6;
        this.darkMode = z6;
        this.localeIdentifier = str7;
    }

    public static /* synthetic */ void getAppUserID$annotations() {
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingID$annotations() {
    }

    public static /* synthetic */ void getPaywallRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallBackendEvent self, InterfaceC10429b output, SerialDescriptor serialDesc) {
        output.mo5584r(serialDesc, 0, self.id);
        output.mo5579m(1, self.version, serialDesc);
        output.mo5584r(serialDesc, 2, self.type);
        output.mo5584r(serialDesc, 3, self.appUserID);
        output.mo5584r(serialDesc, 4, self.sessionID);
        output.mo5584r(serialDesc, 5, self.offeringID);
        output.mo5579m(6, self.paywallRevision, serialDesc);
        output.mo5564E(serialDesc, 7, self.timestamp);
        output.mo5584r(serialDesc, 8, self.displayMode);
        output.mo5583q(serialDesc, 9, self.darkMode);
        output.mo5584r(serialDesc, 10, self.localeIdentifier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDarkMode() {
        return this.darkMode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppUserID() {
        return this.appUserID;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOfferingID() {
        return this.offeringID;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final PaywallBackendEvent copy(String id2, int version, String type, String appUserID, String sessionID, String offeringID, int paywallRevision, long timestamp, String displayMode, boolean darkMode, String localeIdentifier) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(sessionID, "sessionID");
        AbstractC16544l.m18094g(offeringID, "offeringID");
        AbstractC16544l.m18094g(displayMode, "displayMode");
        AbstractC16544l.m18094g(localeIdentifier, "localeIdentifier");
        return new PaywallBackendEvent(id2, version, type, appUserID, sessionID, offeringID, paywallRevision, timestamp, displayMode, darkMode, localeIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallBackendEvent)) {
            return false;
        }
        PaywallBackendEvent paywallBackendEvent = (PaywallBackendEvent) other;
        return AbstractC16544l.m18089b(this.id, paywallBackendEvent.id) && this.version == paywallBackendEvent.version && AbstractC16544l.m18089b(this.type, paywallBackendEvent.type) && AbstractC16544l.m18089b(this.appUserID, paywallBackendEvent.appUserID) && AbstractC16544l.m18089b(this.sessionID, paywallBackendEvent.sessionID) && AbstractC16544l.m18089b(this.offeringID, paywallBackendEvent.offeringID) && this.paywallRevision == paywallBackendEvent.paywallRevision && this.timestamp == paywallBackendEvent.timestamp && AbstractC16544l.m18089b(this.displayMode, paywallBackendEvent.displayMode) && this.darkMode == paywallBackendEvent.darkMode && AbstractC16544l.m18089b(this.localeIdentifier, paywallBackendEvent.localeIdentifier);
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    public int hashCode() {
        int iM527p = (AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(((this.id.hashCode() * 31) + this.version) * 31, 31, this.type), 31, this.appUserID), 31, this.sessionID), 31, this.offeringID) + this.paywallRevision) * 31;
        long j10 = this.timestamp;
        int iM527p2 = AbstractC0168G.m527p((iM527p + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.displayMode);
        boolean z6 = this.darkMode;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return this.localeIdentifier.hashCode() + ((iM527p2 + r6) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaywallBackendEvent(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", appUserID=");
        sb2.append(this.appUserID);
        sb2.append(", sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", offeringID=");
        sb2.append(this.offeringID);
        sb2.append(", paywallRevision=");
        sb2.append(this.paywallRevision);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", displayMode=");
        sb2.append(this.displayMode);
        sb2.append(", darkMode=");
        sb2.append(this.darkMode);
        sb2.append(", localeIdentifier=");
        return AbstractC9306j0.m9892k(sb2, this.localeIdentifier, ')');
    }

    public PaywallBackendEvent(String id2, int i10, String type, String appUserID, String sessionID, String offeringID, int i11, long j10, String displayMode, boolean z6, String localeIdentifier) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(sessionID, "sessionID");
        AbstractC16544l.m18094g(offeringID, "offeringID");
        AbstractC16544l.m18094g(displayMode, "displayMode");
        AbstractC16544l.m18094g(localeIdentifier, "localeIdentifier");
        this.id = id2;
        this.version = i10;
        this.type = type;
        this.appUserID = appUserID;
        this.sessionID = sessionID;
        this.offeringID = offeringID;
        this.paywallRevision = i11;
        this.timestamp = j10;
        this.displayMode = displayMode;
        this.darkMode = z6;
        this.localeIdentifier = localeIdentifier;
    }
}
