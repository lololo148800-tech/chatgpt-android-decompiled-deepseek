package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11472s;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0007./01234B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u00065"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Landroid/os/Parcelable;", "", "side", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "manualCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "autoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "overlay", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "component4", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSide", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "getManualCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "getAutoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "getOverlay", "AutoCaptureConfig", "ManualCaptureConfig", "OverlayConfig", "OverlayLocalIcon", "Rule", "RuleSet", "RuleType", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class CapturePageConfig implements Parcelable {
    public static final Parcelable.Creator<CapturePageConfig> CREATOR = new Creator();
    private final AutoCaptureConfig autoCaptureConfig;
    private final ManualCaptureConfig manualCaptureConfig;
    private final OverlayConfig overlay;
    private final String side;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "ruleSets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getRuleSets", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class AutoCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new Creator();
        private final List<RuleSet> ruleSets;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<AutoCaptureConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i10);
                    int iM21251v = 0;
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(RuleSet.CREATOR, parcel, arrayList2, iM21251v, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AutoCaptureConfig(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig[] newArray(int i10) {
                return new AutoCaptureConfig[i10];
            }
        }

        public AutoCaptureConfig(List<RuleSet> list) {
            this.ruleSets = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoCaptureConfig copy$default(AutoCaptureConfig autoCaptureConfig, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = autoCaptureConfig.ruleSets;
            }
            return autoCaptureConfig.copy(list);
        }

        public final List<RuleSet> component1() {
            return this.ruleSets;
        }

        public final AutoCaptureConfig copy(List<RuleSet> ruleSets) {
            return new AutoCaptureConfig(ruleSets);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && AbstractC16544l.m18089b(this.ruleSets, ((AutoCaptureConfig) other).ruleSets);
        }

        public final List<RuleSet> getRuleSets() {
            return this.ruleSets;
        }

        public int hashCode() {
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "AutoCaptureConfig(ruleSets=" + this.ruleSets + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RuleSet> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<CapturePageConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CapturePageConfig createFromParcel(Parcel parcel) {
            return new CapturePageConfig(parcel.readString(), parcel.readInt() == 0 ? null : ManualCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CapturePageConfig[] newArray(int i10) {
            return new CapturePageConfig[i10];
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "Landroid/os/Parcelable;", "", "isEnabled", "", "delayMs", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "getDelayMs", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class ManualCaptureConfig implements Parcelable {
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new Creator();
        private final Long delayMs;
        private final Boolean isEnabled;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ManualCaptureConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ManualCaptureConfig(boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig[] newArray(int i10) {
                return new ManualCaptureConfig[i10];
            }
        }

        public ManualCaptureConfig(Boolean bool, Long l4) {
            this.isEnabled = bool;
            this.delayMs = l4;
        }

        public static /* synthetic */ ManualCaptureConfig copy$default(ManualCaptureConfig manualCaptureConfig, Boolean bool, Long l4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = manualCaptureConfig.isEnabled;
            }
            if ((i10 & 2) != 0) {
                l4 = manualCaptureConfig.delayMs;
            }
            return manualCaptureConfig.copy(bool, l4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDelayMs() {
            return this.delayMs;
        }

        public final ManualCaptureConfig copy(Boolean isEnabled, Long delayMs) {
            return new ManualCaptureConfig(isEnabled, delayMs);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) other;
            return AbstractC16544l.m18089b(this.isEnabled, manualCaptureConfig.isEnabled) && AbstractC16544l.m18089b(this.delayMs, manualCaptureConfig.delayMs);
        }

        public final Long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l4 = this.delayMs;
            return iHashCode + (l4 != null ? l4.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                AbstractC12107L1.m13829t(parcel, 1, bool);
            }
            Long l4 = this.delayMs;
            if (l4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l4.longValue());
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "overlay", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "overlayFallback", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getOverlay", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "getOverlayFallback", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class OverlayConfig implements Parcelable {
        public static final Parcelable.Creator<OverlayConfig> CREATOR = new Creator();
        private final UiComponentConfig.RemoteImage overlay;
        private final OverlayLocalIcon overlayFallback;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<OverlayConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OverlayConfig createFromParcel(Parcel parcel) {
                return new OverlayConfig(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayLocalIcon.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OverlayConfig[] newArray(int i10) {
                return new OverlayConfig[i10];
            }
        }

        public OverlayConfig(UiComponentConfig.RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon) {
            this.overlay = remoteImage;
            this.overlayFallback = overlayLocalIcon;
        }

        public static /* synthetic */ OverlayConfig copy$default(OverlayConfig overlayConfig, UiComponentConfig.RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                remoteImage = overlayConfig.overlay;
            }
            if ((i10 & 2) != 0) {
                overlayLocalIcon = overlayConfig.overlayFallback;
            }
            return overlayConfig.copy(remoteImage, overlayLocalIcon);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiComponentConfig.RemoteImage getOverlay() {
            return this.overlay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        public final OverlayConfig copy(UiComponentConfig.RemoteImage overlay, OverlayLocalIcon overlayFallback) {
            return new OverlayConfig(overlay, overlayFallback);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverlayConfig)) {
                return false;
            }
            OverlayConfig overlayConfig = (OverlayConfig) other;
            return AbstractC16544l.m18089b(this.overlay, overlayConfig.overlay) && this.overlayFallback == overlayConfig.overlayFallback;
        }

        public final UiComponentConfig.RemoteImage getOverlay() {
            return this.overlay;
        }

        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        public int hashCode() {
            UiComponentConfig.RemoteImage remoteImage = this.overlay;
            int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            return iHashCode + (overlayLocalIcon != null ? overlayLocalIcon.hashCode() : 0);
        }

        public String toString() {
            return "OverlayConfig(overlay=" + this.overlay + ", overlayFallback=" + this.overlayFallback + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            UiComponentConfig.RemoteImage remoteImage = this.overlay;
            if (remoteImage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                remoteImage.writeToParcel(parcel, flags);
            }
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            if (overlayLocalIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(overlayLocalIcon.name());
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "", "(Ljava/lang/String;I)V", "BARCODE", "PASSPORT", "ID_FRONT", "ID_BACK", "CORNERS_ONLY", "EMPTY", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public enum OverlayLocalIcon {
        BARCODE,
        PASSPORT,
        ID_FRONT,
        ID_BACK,
        CORNERS_ONLY,
        EMPTY;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u000b¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "type", "", "isRequired", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;Ljava/lang/Boolean;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "getType", "Ljava/lang/Boolean;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Rule implements Parcelable {
        public static final Parcelable.Creator<Rule> CREATOR = new Creator();
        private final Boolean isRequired;
        private final RuleType type;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Rule> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rule createFromParcel(Parcel parcel) {
                Boolean boolValueOf = null;
                RuleType ruleTypeValueOf = parcel.readInt() == 0 ? null : RuleType.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Rule(ruleTypeValueOf, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rule[] newArray(int i10) {
                return new Rule[i10];
            }
        }

        public Rule(RuleType ruleType, Boolean bool) {
            this.type = ruleType;
            this.isRequired = bool;
        }

        public static /* synthetic */ Rule copy$default(Rule rule, RuleType ruleType, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ruleType = rule.type;
            }
            if ((i10 & 2) != 0) {
                bool = rule.isRequired;
            }
            return rule.copy(ruleType, bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RuleType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        public final Rule copy(RuleType type, Boolean isRequired) {
            return new Rule(type, isRequired);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) other;
            return this.type == rule.type && AbstractC16544l.m18089b(this.isRequired, rule.isRequired);
        }

        public final RuleType getType() {
            return this.type;
        }

        public int hashCode() {
            RuleType ruleType = this.type;
            int iHashCode = (ruleType == null ? 0 : ruleType.hashCode()) * 31;
            Boolean bool = this.isRequired;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isRequired() {
            return this.isRequired;
        }

        public String toString() {
            return "Rule(type=" + this.type + ", isRequired=" + this.isRequired + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            RuleType ruleType = this.type;
            if (ruleType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(ruleType.name());
            }
            Boolean bool = this.isRequired;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                AbstractC12107L1.m13829t(parcel, 1, bool);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "rules", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getRules", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class RuleSet implements Parcelable {
        public static final Parcelable.Creator<RuleSet> CREATOR = new Creator();
        private final List<Rule> rules;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<RuleSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i10);
                    int iM21251v = 0;
                    while (iM21251v != i10) {
                        iM21251v = AbstractC20734X.m21251v(Rule.CREATOR, parcel, arrayList2, iM21251v, 1);
                    }
                    arrayList = arrayList2;
                }
                return new RuleSet(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet[] newArray(int i10) {
                return new RuleSet[i10];
            }
        }

        public RuleSet(List<Rule> list) {
            this.rules = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RuleSet copy$default(RuleSet ruleSet, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = ruleSet.rules;
            }
            return ruleSet.copy(list);
        }

        public final List<Rule> component1() {
            return this.rules;
        }

        public final RuleSet copy(List<Rule> rules) {
            return new RuleSet(rules);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RuleSet) && AbstractC16544l.m18089b(this.rules, ((RuleSet) other).rules);
        }

        public final List<Rule> getRules() {
            return this.rules;
        }

        public int hashCode() {
            List<Rule> list = this.rules;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "RuleSet(rules=" + this.rules + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            List<Rule> list = this.rules;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "", "(Ljava/lang/String;I)V", "ID_FRONT", "ID_FRONT_OR_BACK", "BARCODE_PDF417", "PASSPORT_MRZ", "TEXT_EXTRACTION", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public enum RuleType {
        ID_FRONT,
        ID_FRONT_OR_BACK,
        BARCODE_PDF417,
        PASSPORT_MRZ,
        TEXT_EXTRACTION;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    public CapturePageConfig(String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig) {
        this.side = str;
        this.manualCaptureConfig = manualCaptureConfig;
        this.autoCaptureConfig = autoCaptureConfig;
        this.overlay = overlayConfig;
    }

    public static /* synthetic */ CapturePageConfig copy$default(CapturePageConfig capturePageConfig, String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = capturePageConfig.side;
        }
        if ((i10 & 2) != 0) {
            manualCaptureConfig = capturePageConfig.manualCaptureConfig;
        }
        if ((i10 & 4) != 0) {
            autoCaptureConfig = capturePageConfig.autoCaptureConfig;
        }
        if ((i10 & 8) != 0) {
            overlayConfig = capturePageConfig.overlay;
        }
        return capturePageConfig.copy(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    public final CapturePageConfig copy(String side, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlay) {
        return new CapturePageConfig(side, manualCaptureConfig, autoCaptureConfig, overlay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapturePageConfig)) {
            return false;
        }
        CapturePageConfig capturePageConfig = (CapturePageConfig) other;
        return AbstractC16544l.m18089b(this.side, capturePageConfig.side) && AbstractC16544l.m18089b(this.manualCaptureConfig, capturePageConfig.manualCaptureConfig) && AbstractC16544l.m18089b(this.autoCaptureConfig, capturePageConfig.autoCaptureConfig) && AbstractC16544l.m18089b(this.overlay, capturePageConfig.overlay);
    }

    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    public final String getSide() {
        return this.side;
    }

    public int hashCode() {
        String str = this.side;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        int iHashCode2 = (iHashCode + (manualCaptureConfig == null ? 0 : manualCaptureConfig.hashCode())) * 31;
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        int iHashCode3 = (iHashCode2 + (autoCaptureConfig == null ? 0 : autoCaptureConfig.hashCode())) * 31;
        OverlayConfig overlayConfig = this.overlay;
        return iHashCode3 + (overlayConfig != null ? overlayConfig.hashCode() : 0);
    }

    public String toString() {
        return "CapturePageConfig(side=" + this.side + ", manualCaptureConfig=" + this.manualCaptureConfig + ", autoCaptureConfig=" + this.autoCaptureConfig + ", overlay=" + this.overlay + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.side);
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        if (manualCaptureConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            manualCaptureConfig.writeToParcel(parcel, flags);
        }
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        if (autoCaptureConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoCaptureConfig.writeToParcel(parcel, flags);
        }
        OverlayConfig overlayConfig = this.overlay;
        if (overlayConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayConfig.writeToParcel(parcel, flags);
        }
    }
}
