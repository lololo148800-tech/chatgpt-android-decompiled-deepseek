package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11472s;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import dj.AbstractC13178c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p185H6.C3246b;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "Landroid/os/Parcelable;", "()V", DiagnosticsEntry.NAME_KEY, "", "getName", "()Ljava/lang/String;", "type", "getType", "Companion", "UiGovernmentIdNfcScanComponentError", "UiInputAddressComponentError", "UiInputComponentError", "UiInputInternationalDbComponentError", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputAddressComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputInternationalDbComponentError;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class UiComponentError implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "<init>", "()V", "Lbj/x;", "reader", "", "getJsonType", "(Lbj/x;)Ljava/lang/String;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;)V", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion extends AbstractC11471r {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getJsonType(AbstractC11477x reader) {
            AbstractC11477x abstractC11477xMo12807T = reader.mo12807T();
            abstractC11477xMo12807T.mo12814e();
            while (abstractC11477xMo12807T.hasNext()) {
                if (AbstractC16544l.m18089b(abstractC11477xMo12807T.mo12813a0(), "type")) {
                    return abstractC11477xMo12807T.mo12820x();
                }
                abstractC11477xMo12807T.mo12800D();
            }
            return null;
        }

        @Override // bj.AbstractC11471r
        @InterfaceC11453S
        public void toJson(AbstractC11440E writer, UiComponentError value) {
        }

        private Companion() {
        }

        @Override // bj.AbstractC11471r
        @InterfaceC11467n
        public UiComponentError fromJson(AbstractC11477x reader) {
            C11447L c11447l = new C11447L(new C3246b());
            String jsonType = getJsonType(reader);
            if (jsonType == null) {
                return null;
            }
            if (jsonType.equals(UiComponentConfig.InputAddress.type)) {
                return (UiComponentError) c11447l.m12849a(UiInputAddressComponentError.class, AbstractC13178c.f41820a).fromJson(reader);
            }
            return jsonType.equals(UiComponentConfig.InputInternationalDb.type) ? (UiComponentError) c11447l.m12849a(UiInputInternationalDbComponentError.class, AbstractC13178c.f41820a).fromJson(reader) : (UiComponentError) c11447l.m12849a(UiInputComponentError.class, AbstractC13178c.f41820a).fromJson(reader);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u000bR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010'¨\u0006("}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputAddressComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputAddressComponentError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getType", "Ljava/util/Map;", "getMessage", "setMessage", "(Ljava/util/Map;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UiInputAddressComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputAddressComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;
        private final String type;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiInputAddressComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputAddressComponentError(string, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError[] newArray(int i10) {
                return new UiInputAddressComponentError[i10];
            }
        }

        public UiInputAddressComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputAddressComponentError copy$default(UiInputAddressComponentError uiInputAddressComponentError, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiInputAddressComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiInputAddressComponentError.type;
            }
            if ((i10 & 4) != 0) {
                map = uiInputAddressComponentError.message;
            }
            return uiInputAddressComponentError.copy(str, str2, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputAddressComponentError copy(String name, String type, Map<String, String> message) {
            return new UiInputAddressComponentError(name, type, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiInputAddressComponentError)) {
                return false;
            }
            UiInputAddressComponentError uiInputAddressComponentError = (UiInputAddressComponentError) other;
            return AbstractC16544l.m18089b(this.name, uiInputAddressComponentError.name) && AbstractC16544l.m18089b(this.type, uiInputAddressComponentError.type) && AbstractC16544l.m18089b(this.message, uiInputAddressComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.message.hashCode() + AbstractC0168G.m527p(this.name.hashCode() * 31, 31, this.type);
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.type;
            Map<String, String> map = this.message;
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("UiInputAddressComponentError(name=", str, ", type=", str2, ", message=");
            sbM9896o.append(map);
            sbM9896o.append(Separators.RPAREN);
            return sbM9896o.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\n¨\u0006#"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "type", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputComponentError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getType", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UiInputComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputComponentError> CREATOR = new Creator();
        private final String message;
        private final String name;
        private final String type;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiInputComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError createFromParcel(Parcel parcel) {
                return new UiInputComponentError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError[] newArray(int i10) {
                return new UiInputComponentError[i10];
            }
        }

        public UiInputComponentError(String str, String str2, String str3) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = str3;
        }

        public static /* synthetic */ UiInputComponentError copy$default(UiInputComponentError uiInputComponentError, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiInputComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiInputComponentError.type;
            }
            if ((i10 & 4) != 0) {
                str3 = uiInputComponentError.message;
            }
            return uiInputComponentError.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final UiInputComponentError copy(String name, String type, String message) {
            return new UiInputComponentError(name, type, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiInputComponentError)) {
                return false;
            }
            UiInputComponentError uiInputComponentError = (UiInputComponentError) other;
            return AbstractC16544l.m18089b(this.name, uiInputComponentError.name) && AbstractC16544l.m18089b(this.type, uiInputComponentError.type) && AbstractC16544l.m18089b(this.message, uiInputComponentError.message);
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.message.hashCode() + AbstractC0168G.m527p(this.name.hashCode() * 31, 31, this.type);
        }

        public String toString() {
            return AbstractC9306j0.m9891j(this.message, Separators.RPAREN, AbstractC9306j0.m9896o("UiInputComponentError(name=", this.name, ", type=", this.type, ", message="));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u000bR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010'¨\u0006("}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputInternationalDbComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputInternationalDbComponentError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getType", "Ljava/util/Map;", "getMessage", "setMessage", "(Ljava/util/Map;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UiInputInternationalDbComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputInternationalDbComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;
        private final String type;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiInputInternationalDbComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputInternationalDbComponentError(string, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError[] newArray(int i10) {
                return new UiInputInternationalDbComponentError[i10];
            }
        }

        public UiInputInternationalDbComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputInternationalDbComponentError copy$default(UiInputInternationalDbComponentError uiInputInternationalDbComponentError, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiInputInternationalDbComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiInputInternationalDbComponentError.type;
            }
            if ((i10 & 4) != 0) {
                map = uiInputInternationalDbComponentError.message;
            }
            return uiInputInternationalDbComponentError.copy(str, str2, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputInternationalDbComponentError copy(String name, String type, Map<String, String> message) {
            return new UiInputInternationalDbComponentError(name, type, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiInputInternationalDbComponentError)) {
                return false;
            }
            UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiInputInternationalDbComponentError) other;
            return AbstractC16544l.m18089b(this.name, uiInputInternationalDbComponentError.name) && AbstractC16544l.m18089b(this.type, uiInputInternationalDbComponentError.type) && AbstractC16544l.m18089b(this.message, uiInputInternationalDbComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.message.hashCode() + AbstractC0168G.m527p(this.name.hashCode() * 31, 31, this.type);
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.type;
            Map<String, String> map = this.message;
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("UiInputInternationalDbComponentError(name=", str, ", type=", str2, ", message=");
            sbM9896o.append(map);
            sbM9896o.append(Separators.RPAREN);
            return sbM9896o.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public /* synthetic */ UiComponentError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    public abstract String getType();

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u000bR.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010'¨\u0006("}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "type", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getType", "Ljava/util/Map;", "getMessage", "setMessage", "(Ljava/util/Map;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UiGovernmentIdNfcScanComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiGovernmentIdNfcScanComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;
        private final String type;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UiGovernmentIdNfcScanComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiGovernmentIdNfcScanComponentError(string, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError[] newArray(int i10) {
                return new UiGovernmentIdNfcScanComponentError[i10];
            }
        }

        public /* synthetic */ UiGovernmentIdNfcScanComponentError(String str, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "" : str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiGovernmentIdNfcScanComponentError copy$default(UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uiGovernmentIdNfcScanComponentError.name;
            }
            if ((i10 & 2) != 0) {
                str2 = uiGovernmentIdNfcScanComponentError.type;
            }
            if ((i10 & 4) != 0) {
                map = uiGovernmentIdNfcScanComponentError.message;
            }
            return uiGovernmentIdNfcScanComponentError.copy(str, str2, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiGovernmentIdNfcScanComponentError copy(String name, String type, Map<String, String> message) {
            return new UiGovernmentIdNfcScanComponentError(name, type, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiGovernmentIdNfcScanComponentError)) {
                return false;
            }
            UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiGovernmentIdNfcScanComponentError) other;
            return AbstractC16544l.m18089b(this.name, uiGovernmentIdNfcScanComponentError.name) && AbstractC16544l.m18089b(this.type, uiGovernmentIdNfcScanComponentError.type) && AbstractC16544l.m18089b(this.message, uiGovernmentIdNfcScanComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.message.hashCode() + AbstractC0168G.m527p(this.name.hashCode() * 31, 31, this.type);
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.type;
            Map<String, String> map = this.message;
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("UiGovernmentIdNfcScanComponentError(name=", str, ", type=", str2, ", message=");
            sbM9896o.append(map);
            sbM9896o.append(Separators.RPAREN);
            return sbM9896o.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public UiGovernmentIdNfcScanComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }
    }

    private UiComponentError() {
    }
}
