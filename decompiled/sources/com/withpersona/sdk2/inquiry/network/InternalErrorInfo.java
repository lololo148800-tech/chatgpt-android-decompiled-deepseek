package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11470q;
import bj.InterfaceC11472s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p680cj.C11763d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "Landroid/os/Parcelable;", "()V", "CameraErrorInfo", "Companion", "ConfigurationErrorInfo", "IntegrationErrorInfo", "NetworkErrorInfo", "NoDiskSpaceErrorInfo", "PermissionErrorInfo", "UnknownErrorInfo", "WebRtcIntegrationErrorInfo", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$CameraErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$ConfigurationErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$IntegrationErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NoDiskSpaceErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$PermissionErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$UnknownErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$WebRtcIntegrationErrorInfo;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class InternalErrorInfo implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AbstractC11471r fallbackAdapter = new AbstractC11471r() { // from class: com.withpersona.sdk2.inquiry.network.InternalErrorInfo$Companion$fallbackAdapter$1
        @Override // bj.AbstractC11471r
        public Object fromJson(AbstractC11477x reader) {
            reader.mo12814e();
            reader.mo12818m();
            return null;
        }

        @Override // bj.AbstractC11471r
        public void toJson(AbstractC11440E writer, Object value) {
            writer.mo12833e().mo12827T("message").mo12828V0("Error with class '" + (value != null ? value.getClass().getCanonicalName() : null) + "' does not have a json adapter registered.").mo12823E();
        }
    }.nullSafe();

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$CameraErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$CameraErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class CameraErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<CameraErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CameraErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo createFromParcel(Parcel parcel) {
                return new CameraErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo[] newArray(int i10) {
                return new CameraErrorInfo[i10];
            }
        }

        public CameraErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ CameraErrorInfo copy$default(CameraErrorInfo cameraErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cameraErrorInfo.message;
            }
            return cameraErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final CameraErrorInfo copy(String message) {
            return new CameraErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CameraErrorInfo) && AbstractC16544l.m18089b(this.message, ((CameraErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("CameraErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    @Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \b*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$Companion;", "", "<init>", "()V", "Lbj/q;", "createAdapter", "()Lbj/q;", "Lbj/r;", "kotlin.jvm.PlatformType", "fallbackAdapter", "Lbj/r;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC11470q createAdapter() {
            List listEmptyList = Collections.emptyList();
            List listEmptyList2 = Collections.emptyList();
            if (listEmptyList.contains("network")) {
                throw new IllegalArgumentException("Labels must be unique.");
            }
            ArrayList arrayList = new ArrayList(listEmptyList);
            arrayList.add("network");
            ArrayList arrayList2 = new ArrayList(listEmptyList2);
            arrayList2.add(NetworkErrorInfo.class);
            return new C11763d(InternalErrorInfo.class, "type", arrayList, arrayList2, null).m13056b(IntegrationErrorInfo.class, "integration").m13056b(PermissionErrorInfo.class, "permission").m13056b(CameraErrorInfo.class, "camera").m13056b(ConfigurationErrorInfo.class, "configuration").m13056b(UnknownErrorInfo.class, "unknown").m13055a(InternalErrorInfo.fallbackAdapter);
        }

        private Companion() {
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$ConfigurationErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$ConfigurationErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class ConfigurationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<ConfigurationErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<ConfigurationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo createFromParcel(Parcel parcel) {
                return new ConfigurationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo[] newArray(int i10) {
                return new ConfigurationErrorInfo[i10];
            }
        }

        public ConfigurationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ ConfigurationErrorInfo copy$default(ConfigurationErrorInfo configurationErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = configurationErrorInfo.message;
            }
            return configurationErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final ConfigurationErrorInfo copy(String message) {
            return new ConfigurationErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigurationErrorInfo) && AbstractC16544l.m18089b(this.message, ((ConfigurationErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("ConfigurationErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$IntegrationErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$IntegrationErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class IntegrationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<IntegrationErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<IntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new IntegrationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo[] newArray(int i10) {
                return new IntegrationErrorInfo[i10];
            }
        }

        public IntegrationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ IntegrationErrorInfo copy$default(IntegrationErrorInfo integrationErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = integrationErrorInfo.message;
            }
            return integrationErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final IntegrationErrorInfo copy(String message) {
            return new IntegrationErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntegrationErrorInfo) && AbstractC16544l.m18089b(this.message, ((IntegrationErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("IntegrationErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b\u0007\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0013¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "code", "", "message", "", "isRecoverable", "Lcom/withpersona/sdk2/inquiry/network/ErrorResponse$Error;", "responseError", "<init>", "(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/ErrorResponse$Error;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()Lcom/withpersona/sdk2/inquiry/network/ErrorResponse$Error;", "copy", "(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/ErrorResponse$Error;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f32012I, "getCode", "Ljava/lang/String;", "getMessage", "Z", "Lcom/withpersona/sdk2/inquiry/network/ErrorResponse$Error;", "getResponseError", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class NetworkErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<NetworkErrorInfo> CREATOR = new Creator();
        private final int code;
        private final boolean isRecoverable;
        private final String message;
        private final ErrorResponse.Error responseError;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<NetworkErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo createFromParcel(Parcel parcel) {
                return new NetworkErrorInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (ErrorResponse.Error) parcel.readParcelable(NetworkErrorInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo[] newArray(int i10) {
                return new NetworkErrorInfo[i10];
            }
        }

        public /* synthetic */ NetworkErrorInfo(int i10, String str, boolean z6, ErrorResponse.Error error, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, z6, (i11 & 8) != 0 ? null : error);
        }

        public static /* synthetic */ NetworkErrorInfo copy$default(NetworkErrorInfo networkErrorInfo, int i10, String str, boolean z6, ErrorResponse.Error error, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = networkErrorInfo.code;
            }
            if ((i11 & 2) != 0) {
                str = networkErrorInfo.message;
            }
            if ((i11 & 4) != 0) {
                z6 = networkErrorInfo.isRecoverable;
            }
            if ((i11 & 8) != 0) {
                error = networkErrorInfo.responseError;
            }
            return networkErrorInfo.copy(i10, str, z6, error);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRecoverable() {
            return this.isRecoverable;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ErrorResponse.Error getResponseError() {
            return this.responseError;
        }

        public final NetworkErrorInfo copy(int code, String message, boolean isRecoverable, ErrorResponse.Error responseError) {
            return new NetworkErrorInfo(code, message, isRecoverable, responseError);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkErrorInfo)) {
                return false;
            }
            NetworkErrorInfo networkErrorInfo = (NetworkErrorInfo) other;
            return this.code == networkErrorInfo.code && AbstractC16544l.m18089b(this.message, networkErrorInfo.message) && this.isRecoverable == networkErrorInfo.isRecoverable && AbstractC16544l.m18089b(this.responseError, networkErrorInfo.responseError);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final ErrorResponse.Error getResponseError() {
            return this.responseError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public int hashCode() {
            int i10 = this.code * 31;
            String str = this.message;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z6 = this.isRecoverable;
            ?? r6 = z6;
            if (z6) {
                r6 = 1;
            }
            int i11 = (iHashCode + r6) * 31;
            ErrorResponse.Error error = this.responseError;
            return i11 + (error != null ? error.hashCode() : 0);
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public String toString() {
            return "NetworkErrorInfo(code=" + this.code + ", message=" + this.message + ", isRecoverable=" + this.isRecoverable + ", responseError=" + this.responseError + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeInt(this.code);
            parcel.writeString(this.message);
            parcel.writeInt(this.isRecoverable ? 1 : 0);
            parcel.writeParcelable(this.responseError, flags);
        }

        public NetworkErrorInfo(int i10, String str, boolean z6, ErrorResponse.Error error) {
            super(null);
            this.code = i10;
            this.message = str;
            this.isRecoverable = z6;
            this.responseError = error;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NoDiskSpaceErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NoDiskSpaceErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class NoDiskSpaceErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<NoDiskSpaceErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<NoDiskSpaceErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo createFromParcel(Parcel parcel) {
                return new NoDiskSpaceErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo[] newArray(int i10) {
                return new NoDiskSpaceErrorInfo[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoDiskSpaceErrorInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoDiskSpaceErrorInfo copy$default(NoDiskSpaceErrorInfo noDiskSpaceErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = noDiskSpaceErrorInfo.message;
            }
            return noDiskSpaceErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final NoDiskSpaceErrorInfo copy(String message) {
            return new NoDiskSpaceErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoDiskSpaceErrorInfo) && AbstractC16544l.m18089b(this.message, ((NoDiskSpaceErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("NoDiskSpaceErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }

        public /* synthetic */ NoDiskSpaceErrorInfo(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "No disk space available." : str);
        }

        public NoDiskSpaceErrorInfo(String str) {
            super(null);
            this.message = str;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$PermissionErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$PermissionErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class PermissionErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<PermissionErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<PermissionErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo createFromParcel(Parcel parcel) {
                return new PermissionErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo[] newArray(int i10) {
                return new PermissionErrorInfo[i10];
            }
        }

        public PermissionErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ PermissionErrorInfo copy$default(PermissionErrorInfo permissionErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = permissionErrorInfo.message;
            }
            return permissionErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final PermissionErrorInfo copy(String message) {
            return new PermissionErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PermissionErrorInfo) && AbstractC16544l.m18089b(this.message, ((PermissionErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("PermissionErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$UnknownErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$UnknownErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class UnknownErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<UnknownErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<UnknownErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo createFromParcel(Parcel parcel) {
                return new UnknownErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo[] newArray(int i10) {
                return new UnknownErrorInfo[i10];
            }
        }

        public UnknownErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ UnknownErrorInfo copy$default(UnknownErrorInfo unknownErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = unknownErrorInfo.message;
            }
            return unknownErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final UnknownErrorInfo copy(String message) {
            return new UnknownErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownErrorInfo) && AbstractC16544l.m18089b(this.message, ((UnknownErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("UnknownErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$WebRtcIntegrationErrorInfo;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$WebRtcIntegrationErrorInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class WebRtcIntegrationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<WebRtcIntegrationErrorInfo> CREATOR = new Creator();
        private final String message;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<WebRtcIntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new WebRtcIntegrationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo[] newArray(int i10) {
                return new WebRtcIntegrationErrorInfo[i10];
            }
        }

        public WebRtcIntegrationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ WebRtcIntegrationErrorInfo copy$default(WebRtcIntegrationErrorInfo webRtcIntegrationErrorInfo, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = webRtcIntegrationErrorInfo.message;
            }
            return webRtcIntegrationErrorInfo.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final WebRtcIntegrationErrorInfo copy(String message) {
            return new WebRtcIntegrationErrorInfo(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WebRtcIntegrationErrorInfo) && AbstractC16544l.m18089b(this.message, ((WebRtcIntegrationErrorInfo) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return AbstractC10763a.m11054l("WebRtcIntegrationErrorInfo(message=", this.message, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    public /* synthetic */ InternalErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalErrorInfo() {
    }
}
