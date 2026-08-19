package com.revenuecat.purchases.paywalls.events;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p003A1.AbstractC0168G;
import p228J.AbstractC3794B0;
import p559Wn.InterfaceC8975g;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00043245B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 ¨\u00066"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "creationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "data", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "type", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "component2", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "getCreationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "getData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "getType", "Companion", "$serializer", "CreationData", "Data", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PaywallEvent {
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, AbstractC11153a0.m12383f("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values())};

    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0018¨\u0006-"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "Ljava/util/UUID;", ParameterNames.f31999ID, "Ljava/util/Date;", "date", "<init>", "(Ljava/util/UUID;Ljava/util/Date;)V", "", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/Date;Lao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/util/Date;", "copy", "(Ljava/util/UUID;Ljava/util/Date;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getId$annotations", "()V", "Ljava/util/Date;", "getDate", "getDate$annotations", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC8975g
    public static final /* data */ class CreationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Date date;
        private final UUID id;

        @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC17300c
        public /* synthetic */ CreationData(int i10, @InterfaceC8975g(with = UUIDSerializer.class) UUID uuid, @InterfaceC8975g(with = DateSerializer.class) Date date, AbstractC11171j0 abstractC11171j0) {
            if (3 != (i10 & 3)) {
                AbstractC11153a0.m12389l(i10, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = uuid;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uuid = creationData.id;
            }
            if ((i10 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        @InterfaceC8975g(with = DateSerializer.class)
        public static /* synthetic */ void getDate$annotations() {
        }

        @InterfaceC8975g(with = UUIDSerializer.class)
        public static /* synthetic */ void getId$annotations() {
        }

        public static final /* synthetic */ void write$Self(CreationData self, InterfaceC10429b output, SerialDescriptor serialDesc) {
            output.mo5575i(serialDesc, 0, UUIDSerializer.INSTANCE, self.id);
            output.mo5575i(serialDesc, 1, DateSerializer.INSTANCE, self.date);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final CreationData copy(UUID id2, Date date) {
            AbstractC16544l.m18094g(id2, "id");
            AbstractC16544l.m18094g(date, "date");
            return new CreationData(id2, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) other;
            return AbstractC16544l.m18089b(this.id, creationData.id) && AbstractC16544l.m18089b(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return this.date.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }

        public CreationData(UUID id2, Date date) {
            AbstractC16544l.m18094g(id2, "id");
            AbstractC16544l.m18094g(date, "date");
            this.id = id2;
            this.date = date;
        }
    }

    @Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBU\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b3\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "", "offeringIdentifier", "", "paywallRevision", "Ljava/util/UUID;", "sessionIdentifier", "displayMode", "localeIdentifier", "", "darkMode", "<init>", "(Ljava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Lao/j0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLao/j0;)V", "self", "LZn/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lmm/C;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;LZn/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/UUID;", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;Z)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOfferingIdentifier", TokenNames.f32012I, "getPaywallRevision", "Ljava/util/UUID;", "getSessionIdentifier", "getSessionIdentifier$annotations", "()V", "getDisplayMode", "getLocaleIdentifier", "Z", "getDarkMode", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC8975g
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final String localeIdentifier;
        private final String offeringIdentifier;
        private final int paywallRevision;
        private final UUID sessionIdentifier;

        @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallEvent$Data$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC17300c
        public /* synthetic */ Data(int i10, String str, int i11, @InterfaceC8975g(with = UUIDSerializer.class) UUID uuid, String str2, String str3, boolean z6, AbstractC11171j0 abstractC11171j0) {
            if (63 != (i10 & 63)) {
                AbstractC11153a0.m12389l(i10, 63, PaywallEvent$Data$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.offeringIdentifier = str;
            this.paywallRevision = i11;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z6;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i10, UUID uuid, String str2, String str3, boolean z6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.offeringIdentifier;
            }
            if ((i11 & 2) != 0) {
                i10 = data.paywallRevision;
            }
            int i12 = i10;
            if ((i11 & 4) != 0) {
                uuid = data.sessionIdentifier;
            }
            UUID uuid2 = uuid;
            if ((i11 & 8) != 0) {
                str2 = data.displayMode;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                str3 = data.localeIdentifier;
            }
            String str5 = str3;
            if ((i11 & 32) != 0) {
                z6 = data.darkMode;
            }
            return data.copy(str, i12, uuid2, str4, str5, z6);
        }

        @InterfaceC8975g(with = UUIDSerializer.class)
        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public static final /* synthetic */ void write$Self(Data self, InterfaceC10429b output, SerialDescriptor serialDesc) {
            output.mo5584r(serialDesc, 0, self.offeringIdentifier);
            output.mo5579m(1, self.paywallRevision, serialDesc);
            output.mo5575i(serialDesc, 2, UUIDSerializer.INSTANCE, self.sessionIdentifier);
            output.mo5584r(serialDesc, 3, self.displayMode);
            output.mo5584r(serialDesc, 4, self.localeIdentifier);
            output.mo5583q(serialDesc, 5, self.darkMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDisplayMode() {
            return this.displayMode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final Data copy(String offeringIdentifier, int paywallRevision, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean darkMode) {
            AbstractC16544l.m18094g(offeringIdentifier, "offeringIdentifier");
            AbstractC16544l.m18094g(sessionIdentifier, "sessionIdentifier");
            AbstractC16544l.m18094g(displayMode, "displayMode");
            AbstractC16544l.m18094g(localeIdentifier, "localeIdentifier");
            return new Data(offeringIdentifier, paywallRevision, sessionIdentifier, displayMode, localeIdentifier, darkMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return AbstractC16544l.m18089b(this.offeringIdentifier, data.offeringIdentifier) && this.paywallRevision == data.paywallRevision && AbstractC16544l.m18089b(this.sessionIdentifier, data.sessionIdentifier) && AbstractC16544l.m18089b(this.displayMode, data.displayMode) && AbstractC16544l.m18089b(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode;
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

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iM527p = AbstractC0168G.m527p(AbstractC0168G.m527p((this.sessionIdentifier.hashCode() + (((this.offeringIdentifier.hashCode() * 31) + this.paywallRevision) * 31)) * 31, 31, this.displayMode), 31, this.localeIdentifier);
            boolean z6 = this.darkMode;
            ?? r6 = z6;
            if (z6) {
                r6 = 1;
            }
            return iM527p + r6;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Data(offeringIdentifier=");
            sb2.append(this.offeringIdentifier);
            sb2.append(", paywallRevision=");
            sb2.append(this.paywallRevision);
            sb2.append(", sessionIdentifier=");
            sb2.append(this.sessionIdentifier);
            sb2.append(", displayMode=");
            sb2.append(this.displayMode);
            sb2.append(", localeIdentifier=");
            sb2.append(this.localeIdentifier);
            sb2.append(", darkMode=");
            return AbstractC3794B0.m4499x(sb2, this.darkMode, ')');
        }

        public Data(String offeringIdentifier, int i10, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean z6) {
            AbstractC16544l.m18094g(offeringIdentifier, "offeringIdentifier");
            AbstractC16544l.m18094g(sessionIdentifier, "sessionIdentifier");
            AbstractC16544l.m18094g(displayMode, "displayMode");
            AbstractC16544l.m18094g(localeIdentifier, "localeIdentifier");
            this.offeringIdentifier = offeringIdentifier;
            this.paywallRevision = i10;
            this.sessionIdentifier = sessionIdentifier;
            this.displayMode = displayMode;
            this.localeIdentifier = localeIdentifier;
            this.darkMode = z6;
        }
    }

    @InterfaceC17300c
    public /* synthetic */ PaywallEvent(int i10, CreationData creationData, Data data, PaywallEventType paywallEventType, AbstractC11171j0 abstractC11171j0) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i10 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i10 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final /* synthetic */ void write$Self(PaywallEvent self, InterfaceC10429b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.mo5575i(serialDesc, 0, PaywallEvent$CreationData$$serializer.INSTANCE, self.creationData);
        output.mo5575i(serialDesc, 1, PaywallEvent$Data$$serializer.INSTANCE, self.data);
        output.mo5575i(serialDesc, 2, kSerializerArr[2], self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CreationData getCreationData() {
        return this.creationData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaywallEventType getType() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType type) {
        AbstractC16544l.m18094g(creationData, "creationData");
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(type, "type");
        return new PaywallEvent(creationData, data, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) other;
        return AbstractC16544l.m18089b(this.creationData, paywallEvent.creationData) && AbstractC16544l.m18089b(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.data.hashCode() + (this.creationData.hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: toPaywallPostReceiptData$purchases_customEntitlementComputationRelease */
    public final PaywallPostReceiptData m14500x4be5d416() {
        String string = this.data.getSessionIdentifier().toString();
        AbstractC16544l.m18093f(string, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(string, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType type) {
        AbstractC16544l.m18094g(creationData, "creationData");
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(type, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = type;
    }
}
