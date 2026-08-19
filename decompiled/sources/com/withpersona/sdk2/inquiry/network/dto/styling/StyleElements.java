package com.withpersona.sdk2.inquiry.network.dto.styling;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.EnumC11476w;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11468o;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\u0018\u0000 \u00062\u00020\u0001:\u0012\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0015"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements;", "", "()V", "Axis", "AxisContainer", "ChildSizes", "Companion", "ComplexElementColor", "DPMeasurement", "DPMeasurementSet", "DPSize", "DPSizeSet", "FontName", "FontWeight", "FontWeightContainer", "Measurement", "Position", "PositionType", "SimpleElementColor", "SimpleElementColorValue", "Size", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StyleElements {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public enum Axis {
        HORIZONTAL,
        VERTICAL;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion extends AbstractC11471r {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11453S
            public void toJson(AbstractC11440E writer, Axis value) {
            }

            private Companion() {
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11467n
            public Axis fromJson(AbstractC11477x reader) {
                Object objM12871r0 = reader.m12871r0();
                if (AbstractC16544l.m18089b(objM12871r0, "horizontal")) {
                    return Axis.HORIZONTAL;
                }
                return AbstractC16544l.m18089b(objM12871r0, "vertical") ? Axis.VERTICAL : Axis.HORIZONTAL;
            }
        }

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$AxisContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class AxisContainer implements Parcelable {
        public static final Parcelable.Creator<AxisContainer> CREATOR = new Creator();
        private final Axis base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<AxisContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AxisContainer createFromParcel(Parcel parcel) {
                return new AxisContainer(parcel.readInt() == 0 ? null : Axis.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AxisContainer[] newArray(int i10) {
                return new AxisContainer[i10];
            }
        }

        public AxisContainer(Axis axis) {
            this.base = axis;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Axis getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Axis axis = this.base;
            if (axis == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(axis.name());
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ChildSizes;", "Landroid/os/Parcelable;", "", "base", "<init>", "([I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "[I", "getBase", "()[I", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ChildSizes implements Parcelable {
        public static final Parcelable.Creator<ChildSizes> CREATOR = new Creator();
        private final int[] base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ChildSizes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChildSizes createFromParcel(Parcel parcel) {
                return new ChildSizes(parcel.createIntArray());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChildSizes[] newArray(int i10) {
                return new ChildSizes[i10];
            }
        }

        public ChildSizes(int[] iArr) {
            this.base = iArr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int[] getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeIntArray(this.base);
        }
    }

    @Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Companion;", "", "<init>", "()V", "Lbj/x;", "reader", "", "getStringFromJsonReader", "(Lbj/x;)Ljava/lang/String;", "", "getDoubleFromJsonReader", "(Lbj/x;)Ljava/lang/Double;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Double getDoubleFromJsonReader(AbstractC11477x reader) {
            if (reader.mo12805S() != EnumC11476w.f34694u0) {
                return Double.valueOf(reader.mo12803O());
            }
            reader.mo12800D();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getStringFromJsonReader(AbstractC11477x reader) {
            if (reader.mo12805S() != EnumC11476w.f34694u0) {
                return reader.mo12820x();
            }
            reader.mo12800D();
            return null;
        }

        private Companion() {
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\"\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0013\u0010$\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001b¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$ComplexElementColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "_base", "_focused", "_active", "_disabled", "_errored", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "get_base", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "get_focused", "get_active", "get_disabled", "get_errored", "getBase", "()Ljava/lang/Integer;", "base", "getFocused", "focused", "getActive", "active", "getDisabled", "disabled", "getErrored", "errored", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ComplexElementColor implements Parcelable {
        public static final Parcelable.Creator<ComplexElementColor> CREATOR = new Creator();
        private final SimpleElementColorValue _active;
        private final SimpleElementColorValue _base;
        private final SimpleElementColorValue _disabled;
        private final SimpleElementColorValue _errored;
        private final SimpleElementColorValue _focused;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ComplexElementColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexElementColor createFromParcel(Parcel parcel) {
                return new ComplexElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SimpleElementColorValue.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexElementColor[] newArray(int i10) {
                return new ComplexElementColor[i10];
            }
        }

        public ComplexElementColor(@InterfaceC11468o(name = "base") SimpleElementColorValue simpleElementColorValue, @InterfaceC11468o(name = "focused") SimpleElementColorValue simpleElementColorValue2, @InterfaceC11468o(name = "active") SimpleElementColorValue simpleElementColorValue3, @InterfaceC11468o(name = "disabled") SimpleElementColorValue simpleElementColorValue4, @InterfaceC11468o(name = "errored") SimpleElementColorValue simpleElementColorValue5) {
            this._base = simpleElementColorValue;
            this._focused = simpleElementColorValue2;
            this._active = simpleElementColorValue3;
            this._disabled = simpleElementColorValue4;
            this._errored = simpleElementColorValue5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getActive() {
            SimpleElementColorValue simpleElementColorValue = this._active;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getBase() {
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getDisabled() {
            SimpleElementColorValue simpleElementColorValue = this._disabled;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getErrored() {
            SimpleElementColorValue simpleElementColorValue = this._errored;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final Integer getFocused() {
            SimpleElementColorValue simpleElementColorValue = this._focused;
            if (simpleElementColorValue != null) {
                return simpleElementColorValue.getValue();
            }
            return null;
        }

        public final SimpleElementColorValue get_active() {
            return this._active;
        }

        public final SimpleElementColorValue get_base() {
            return this._base;
        }

        public final SimpleElementColorValue get_disabled() {
            return this._disabled;
        }

        public final SimpleElementColorValue get_errored() {
            return this._errored;
        }

        public final SimpleElementColorValue get_focused() {
            return this._focused;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            SimpleElementColorValue simpleElementColorValue = this._base;
            if (simpleElementColorValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue.writeToParcel(parcel, flags);
            }
            SimpleElementColorValue simpleElementColorValue2 = this._focused;
            if (simpleElementColorValue2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue2.writeToParcel(parcel, flags);
            }
            SimpleElementColorValue simpleElementColorValue3 = this._active;
            if (simpleElementColorValue3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue3.writeToParcel(parcel, flags);
            }
            SimpleElementColorValue simpleElementColorValue4 = this._disabled;
            if (simpleElementColorValue4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue4.writeToParcel(parcel, flags);
            }
            SimpleElementColorValue simpleElementColorValue5 = this._errored;
            if (simpleElementColorValue5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue5.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC17300c
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurement;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class DPMeasurement implements Parcelable {
        public static final Parcelable.Creator<DPMeasurement> CREATOR = new Creator();
        private final DPSize base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DPMeasurement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPMeasurement createFromParcel(Parcel parcel) {
                return new DPMeasurement(parcel.readInt() == 0 ? null : DPSize.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPMeasurement[] newArray(int i10) {
                return new DPMeasurement[i10];
            }
        }

        public DPMeasurement(DPSize dPSize) {
            this.base = dPSize;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final DPSize getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            DPSize dPSize = this.base;
            if (dPSize == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSize.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPMeasurementSet;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DPMeasurementSet implements Parcelable {
        public static final Parcelable.Creator<DPMeasurementSet> CREATOR = new Creator();
        private final DPSizeSet base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DPMeasurementSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPMeasurementSet createFromParcel(Parcel parcel) {
                return new DPMeasurementSet(parcel.readInt() == 0 ? null : DPSizeSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPMeasurementSet[] newArray(int i10) {
                return new DPMeasurementSet[i10];
            }
        }

        public DPMeasurementSet(DPSizeSet dPSizeSet) {
            this.base = dPSizeSet;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final DPSizeSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            DPSizeSet dPSizeSet = this.base;
            if (dPSizeSet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSizeSet.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "", "dp", "<init>", "(Ljava/lang/Double;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Double;", "getDp", "()Ljava/lang/Double;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public static final class DPSize extends Size implements Parcelable {
        private final Double dp;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<DPSize> CREATOR = new Creator();

        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "<init>", "()V", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;)V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion extends AbstractC11471r {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11453S
            public void toJson(AbstractC11440E writer, DPSize value) {
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bj.AbstractC11471r
            @InterfaceC11467n
            public DPSize fromJson(AbstractC11477x reader) {
                Double d10;
                Object doubleFromJsonReader = null;
                if (reader.mo12805S() == EnumC11476w.f34688o0) {
                    reader.mo12814e();
                    String stringFromJsonReader = null;
                    while (reader.hasNext()) {
                        String strMo12813a0 = reader.mo12813a0();
                        if (AbstractC16544l.m18089b(strMo12813a0, "unit")) {
                            stringFromJsonReader = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else if (AbstractC16544l.m18089b(strMo12813a0, "value")) {
                            doubleFromJsonReader = StyleElements.INSTANCE.getDoubleFromJsonReader(reader);
                        } else {
                            reader.mo12800D();
                        }
                    }
                    reader.mo12818m();
                    d10 = doubleFromJsonReader;
                    doubleFromJsonReader = stringFromJsonReader;
                } else {
                    reader.mo12800D();
                    d10 = 0;
                }
                Double dValueOf = d10;
                dValueOf = d10;
                if (AbstractC16544l.m18089b(doubleFromJsonReader, Separators.PERCENT) && d10 != 0) {
                    dValueOf = Double.valueOf((d10.doubleValue() / 100.0d) * (((double) Resources.getSystem().getDisplayMetrics().widthPixels) / ((double) Resources.getSystem().getDisplayMetrics().density)));
                }
                return new DPSize(dValueOf);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DPSize> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSize createFromParcel(Parcel parcel) {
                return new DPSize(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSize[] newArray(int i10) {
                return new DPSize[i10];
            }
        }

        public DPSize(Double d10) {
            super(null);
            this.dp = d10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Double getDp() {
            return this.dp;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Double d10 = this.dp;
            if (d10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d10.doubleValue());
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "top", "bottom", "left", "right", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getTop", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getBottom", "getLeft", "getRight", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DPSizeSet implements Parcelable {
        public static final Parcelable.Creator<DPSizeSet> CREATOR = new Creator();
        private final DPSize bottom;
        private final DPSize left;
        private final DPSize right;
        private final DPSize top;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<DPSizeSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSizeSet createFromParcel(Parcel parcel) {
                return new DPSizeSet(parcel.readInt() == 0 ? null : DPSize.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DPSize.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DPSize.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DPSize.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DPSizeSet[] newArray(int i10) {
                return new DPSizeSet[i10];
            }
        }

        public DPSizeSet(DPSize dPSize, DPSize dPSize2, DPSize dPSize3, DPSize dPSize4) {
            this.top = dPSize;
            this.bottom = dPSize2;
            this.left = dPSize3;
            this.right = dPSize4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final DPSize getBottom() {
            return this.bottom;
        }

        public final DPSize getLeft() {
            return this.left;
        }

        public final DPSize getRight() {
            return this.right;
        }

        public final DPSize getTop() {
            return this.top;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            DPSize dPSize = this.top;
            if (dPSize == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSize.writeToParcel(parcel, flags);
            }
            DPSize dPSize2 = this.bottom;
            if (dPSize2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSize2.writeToParcel(parcel, flags);
            }
            DPSize dPSize3 = this.left;
            if (dPSize3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSize3.writeToParcel(parcel, flags);
            }
            DPSize dPSize4 = this.right;
            if (dPSize4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dPSize4.writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "Landroid/os/Parcelable;", "", "fontName", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFontName", "()Ljava/lang/String;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public static final class FontName implements Parcelable {
        private final String fontName;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<FontName> CREATOR = new Creator();

        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "<init>", "()V", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;)V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontName;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion extends AbstractC11471r {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11453S
            public void toJson(AbstractC11440E writer, FontName value) {
            }

            private Companion() {
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11467n
            public FontName fromJson(AbstractC11477x reader) {
                String stringFromJsonReader = null;
                if (reader.mo12805S() == EnumC11476w.f34688o0) {
                    reader.mo12814e();
                    while (reader.hasNext()) {
                        if (AbstractC16544l.m18089b(reader.mo12813a0(), "base")) {
                            stringFromJsonReader = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else {
                            reader.mo12800D();
                        }
                    }
                    reader.mo12818m();
                } else {
                    reader.mo12800D();
                }
                return new FontName(stringFromJsonReader);
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FontName> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName createFromParcel(Parcel parcel) {
                return new FontName(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i10) {
                return new FontName[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FontName() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getFontName() {
            return this.fontName;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.fontName);
        }

        public FontName(String str) {
            this.fontName = str;
        }

        public /* synthetic */ FontName(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str);
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "", "(Ljava/lang/String;I)V", "LIGHT", "NORMAL", "MEDIUM", "BOLD", "HEAVY", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public enum FontWeight {
        LIGHT,
        NORMAL,
        MEDIUM,
        BOLD,
        HEAVY;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion extends AbstractC11471r {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11453S
            public void toJson(AbstractC11440E writer, FontWeight value) {
            }

            private Companion() {
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11467n
            public FontWeight fromJson(AbstractC11477x reader) {
                Object objM12871r0 = reader.m12871r0();
                if (AbstractC16544l.m18089b(objM12871r0, "light")) {
                    return FontWeight.LIGHT;
                }
                if (AbstractC16544l.m18089b(objM12871r0, "normal")) {
                    return FontWeight.NORMAL;
                }
                if (AbstractC16544l.m18089b(objM12871r0, "medium")) {
                    return FontWeight.MEDIUM;
                }
                if (AbstractC16544l.m18089b(objM12871r0, "bold")) {
                    return FontWeight.BOLD;
                }
                return AbstractC16544l.m18089b(objM12871r0, "heavy") ? FontWeight.HEAVY : FontWeight.NORMAL;
            }
        }

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeightContainer;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class FontWeightContainer implements Parcelable {
        public static final Parcelable.Creator<FontWeightContainer> CREATOR = new Creator();
        private final FontWeight base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<FontWeightContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeightContainer createFromParcel(Parcel parcel) {
                return new FontWeightContainer(parcel.readInt() == 0 ? null : FontWeight.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeightContainer[] newArray(int i10) {
                return new FontWeightContainer[i10];
            }
        }

        public FontWeightContainer(FontWeight fontWeight) {
            this.base = fontWeight;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final FontWeight getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            FontWeight fontWeight = this.base;
            if (fontWeight == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fontWeight.name());
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Measurement;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Measurement implements Parcelable {
        public static final Parcelable.Creator<Measurement> CREATOR = new Creator();
        private final Size base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Measurement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Measurement createFromParcel(Parcel parcel) {
                return new Measurement((Size) parcel.readParcelable(Measurement.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Measurement[] newArray(int i10) {
                return new Measurement[i10];
            }
        }

        public Measurement(Size size) {
            this.base = size;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Size getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeParcelable(this.base, flags);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Position;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Position implements Parcelable {
        public static final Parcelable.Creator<Position> CREATOR = new Creator();
        private final PositionType base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position createFromParcel(Parcel parcel) {
                return new Position(parcel.readInt() == 0 ? null : PositionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Position[] newArray(int i10) {
                return new Position[i10];
            }
        }

        public Position(PositionType positionType) {
            this.base = positionType;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final PositionType getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            PositionType positionType = this.base;
            if (positionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(positionType.name());
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "", "(Ljava/lang/String;I)V", "START", "CENTER", "END", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public enum PositionType {
        START,
        CENTER,
        END;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion extends AbstractC11471r {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11453S
            public void toJson(AbstractC11440E writer, PositionType value) {
            }

            private Companion() {
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11467n
            public PositionType fromJson(AbstractC11477x reader) {
                Object objM12871r0 = reader.m12871r0();
                if (AbstractC16544l.m18089b(objM12871r0, "start")) {
                    return PositionType.START;
                }
                if (AbstractC16544l.m18089b(objM12871r0, "center")) {
                    return PositionType.CENTER;
                }
                return AbstractC16544l.m18089b(objM12871r0, "end") ? PositionType.END : PositionType.START;
            }
        }

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColor;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "base", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SimpleElementColor implements Parcelable {
        public static final Parcelable.Creator<SimpleElementColor> CREATOR = new Creator();
        private final SimpleElementColorValue base;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SimpleElementColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColor createFromParcel(Parcel parcel) {
                return new SimpleElementColor(parcel.readInt() == 0 ? null : SimpleElementColorValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColor[] newArray(int i10) {
                return new SimpleElementColor[i10];
            }
        }

        public SimpleElementColor(SimpleElementColorValue simpleElementColorValue) {
            this.base = simpleElementColorValue;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final SimpleElementColorValue getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            SimpleElementColorValue simpleElementColorValue = this.base;
            if (simpleElementColorValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                simpleElementColorValue.writeToParcel(parcel, flags);
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$SimpleElementColorValue;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class SimpleElementColorValue implements Parcelable {
        public static final Parcelable.Creator<SimpleElementColorValue> CREATOR = new Creator();
        private final Integer value;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<SimpleElementColorValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColorValue createFromParcel(Parcel parcel) {
                return new SimpleElementColorValue(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimpleElementColorValue[] newArray(int i10) {
                return new SimpleElementColorValue[i10];
            }
        }

        public SimpleElementColorValue(@RgbaHexColor Integer num) {
            this.value = num;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            Integer num = this.value;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "Landroid/os/Parcelable;", "()V", "Companion", "PercentSize", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size$PercentSize;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static abstract class Size implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "<init>", "()V", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;)V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Companion extends AbstractC11471r {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // bj.AbstractC11471r
            @InterfaceC11453S
            public void toJson(AbstractC11440E writer, Size value) {
            }

            private Companion() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bj.AbstractC11471r
            @InterfaceC11467n
            public Size fromJson(AbstractC11477x reader) {
                Double d10;
                Object doubleFromJsonReader = null;
                if (reader.mo12805S() == EnumC11476w.f34688o0) {
                    reader.mo12814e();
                    String stringFromJsonReader = null;
                    while (reader.hasNext()) {
                        String strMo12813a0 = reader.mo12813a0();
                        if (AbstractC16544l.m18089b(strMo12813a0, "unit")) {
                            stringFromJsonReader = StyleElements.INSTANCE.getStringFromJsonReader(reader);
                        } else if (AbstractC16544l.m18089b(strMo12813a0, "value")) {
                            doubleFromJsonReader = StyleElements.INSTANCE.getDoubleFromJsonReader(reader);
                        } else {
                            reader.mo12800D();
                        }
                    }
                    reader.mo12818m();
                    d10 = doubleFromJsonReader;
                    doubleFromJsonReader = stringFromJsonReader;
                } else {
                    reader.mo12800D();
                    d10 = 0;
                }
                return (!AbstractC16544l.m18089b(doubleFromJsonReader, Separators.PERCENT) || d10 == 0) ? new DPSize(d10) : new PercentSize(d10.doubleValue() / 100.0d);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size$PercentSize;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Size;", "", "percent", "<init>", "(D)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getPercent", "()D", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PercentSize extends Size {
            public static final Parcelable.Creator<PercentSize> CREATOR = new Creator();
            private final double percent;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PercentSize> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PercentSize createFromParcel(Parcel parcel) {
                    return new PercentSize(parcel.readDouble());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PercentSize[] newArray(int i10) {
                    return new PercentSize[i10];
                }
            }

            public PercentSize(double d10) {
                super(null);
                this.percent = d10;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final double getPercent() {
                return this.percent;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeDouble(this.percent);
            }
        }

        public /* synthetic */ Size(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Size() {
        }
    }
}
