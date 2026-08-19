package com.revenuecat.purchases.models;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p025An.C0644w;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000fR\u0014\u0010)\u001a\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(¨\u00060"}, m18067d2 = {"Lcom/revenuecat/purchases/models/Period;", "Landroid/os/Parcelable;", "", "value", "Lcom/revenuecat/purchases/models/Period$Unit;", "unit", "", "iso8601", "<init>", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V", "component1", "()I", "component2", "()Lcom/revenuecat/purchases/models/Period$Unit;", "component3", "()Ljava/lang/String;", "copy", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)Lcom/revenuecat/purchases/models/Period;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f32012I, "getValue", "Lcom/revenuecat/purchases/models/Period$Unit;", "getUnit", "Ljava/lang/String;", "getIso8601", "", "getValueInWeeks$purchases_customEntitlementComputationRelease", "()D", "valueInWeeks", "getValueInMonths", "valueInMonths", "getValueInYears$purchases_customEntitlementComputationRelease", "valueInYears", "Factory", "Unit", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Period implements Parcelable {
    private final String iso8601;
    private final Unit unit;
    private final int value;

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            AbstractC16544l.m18094g(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i10) {
            return new Period[i10];
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.Period$Factory, reason: from kotlin metadata */
    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/revenuecat/purchases/models/Period$Factory;", "", "()V", "create", "Lcom/revenuecat/purchases/models/Period;", "iso8601", "", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Period create(String iso8601) {
            AbstractC16544l.m18094g(iso8601, "iso8601");
            C17309l period = PeriodKt.toPeriod(iso8601);
            return new Period(((Number) period.f55136Y).intValue(), (Unit) period.f55137Z, iso8601);
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18067d2 = {"Lcom/revenuecat/purchases/models/Period$Unit;", "", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "UNKNOWN", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i10, Unit unit, String iso8601) {
        AbstractC16544l.m18094g(unit, "unit");
        AbstractC16544l.m18094g(iso8601, "iso8601");
        this.value = i10;
        this.unit = unit;
        this.iso8601 = iso8601;
    }

    public static /* synthetic */ Period copy$default(Period period, int i10, Unit unit, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = period.value;
        }
        if ((i11 & 2) != 0) {
            unit = period.unit;
        }
        if ((i11 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i10, unit, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unit getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIso8601() {
        return this.iso8601;
    }

    public final Period copy(int value, Unit unit, String iso8601) {
        AbstractC16544l.m18094g(unit, "unit");
        AbstractC16544l.m18094g(iso8601, "iso8601");
        return new Period(value, unit, iso8601);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Period)) {
            return false;
        }
        Period period = (Period) other;
        return this.value == period.value && this.unit == period.unit && AbstractC16544l.m18089b(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInMonths() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            d10 = this.value;
            d11 = 30.0d;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    return this.value;
                }
                if (i10 == 4) {
                    return ((double) this.value) * 12.0d;
                }
                if (i10 != 5) {
                    throw new C0644w();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d10 = this.value;
            d11 = 4.345238095238096d;
        }
        return d10 / d11;
    }

    public final double getValueInWeeks$purchases_customEntitlementComputationRelease() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return ((double) this.value) / 7.0d;
        }
        if (i10 == 2) {
            return this.value;
        }
        if (i10 == 3) {
            d10 = this.value;
            d11 = 4.345238095238096d;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new C0644w();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d10 = this.value;
            d11 = 52.142857142857146d;
        }
        return d10 * d11;
    }

    public final double getValueInYears$purchases_customEntitlementComputationRelease() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            d10 = this.value;
            d11 = 365.0d;
        } else if (i10 == 2) {
            d10 = this.value;
            d11 = 52.142857142857146d;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.value;
                }
                if (i10 != 5) {
                    throw new C0644w();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d10 = this.value;
            d11 = 12.0d;
        }
        return d10 / d11;
    }

    public int hashCode() {
        return this.iso8601.hashCode() + ((this.unit.hashCode() + (this.value * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Period(value=");
        sb2.append(this.value);
        sb2.append(", unit=");
        sb2.append(this.unit);
        sb2.append(", iso8601=");
        return AbstractC9306j0.m9892k(sb2, this.iso8601, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC16544l.m18094g(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}
