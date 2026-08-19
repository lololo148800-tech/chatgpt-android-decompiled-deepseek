package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11468o;
import bj.InterfaceC11470q;
import bj.InterfaceC11472s;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p523V9.AbstractC8033Y5;
import p680cj.C11763d;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse;", "", "errors", "", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "DocumentErrorResponse", "UnknownErrorAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GenericFileUploadErrorResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<DocumentErrorResponse> errors;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$Companion;", "", "<init>", "()V", "Lbj/q;", "getAdapter", "()Lbj/q;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC11470q getAdapter() {
            List listEmptyList = Collections.emptyList();
            List listEmptyList2 = Collections.emptyList();
            if (listEmptyList.contains("document-generic-disabled-file-type-error")) {
                throw new IllegalArgumentException("Labels must be unique.");
            }
            ArrayList arrayList = new ArrayList(listEmptyList);
            arrayList.add("document-generic-disabled-file-type-error");
            ArrayList arrayList2 = new ArrayList(listEmptyList2);
            arrayList2.add(DocumentErrorResponse.DisabledFileTypeError.class);
            return new C11763d(DocumentErrorResponse.class, "code", arrayList, arrayList2, null).m13056b(DocumentErrorResponse.FileLimitExceededError.class, "document-generic-file-limit-exceeded-error").m13056b(DocumentErrorResponse.PageLimitExceededError.class, "document-generic-page-limit-exceeded-error").m13056b(DocumentErrorResponse.MalformedFileError.class, "document-generic-malformed-file-error").m13056b(DocumentErrorResponse.MalformedImageError.class, "document-generic-malformed-image-error").m13056b(DocumentErrorResponse.MalformedPdfError.class, "document-generic-malformed-pdf-error").m13056b(DocumentErrorResponse.GovernmentIdDimensionSizeError.class, "document-government-id-dimension-size-error").m13055a(UnknownErrorAdapter.INSTANCE);
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u0082\u0001\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "Landroid/os/Parcelable;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "details", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", UiComponentConfig.Title.type, "getTitle", "DisabledFileTypeError", "FileLimitExceededError", "GovernmentIdDimensionSizeError", "MalformedFileError", "MalformedImageError", "MalformedPdfError", "PageLimitExceededError", "UnknownError", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static abstract class DocumentErrorResponse implements Parcelable {

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class DisabledFileTypeError extends DocumentErrorResponse {
            public static final Parcelable.Creator<DisabledFileTypeError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<DisabledFileTypeError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisabledFileTypeError createFromParcel(Parcel parcel) {
                    return new DisabledFileTypeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisabledFileTypeError[] newArray(int i10) {
                    return new DisabledFileTypeError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$DisabledFileTypeError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "", "uploadedFileType", "", "enabledFileTypes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUploadedFileType", "()Ljava/lang/String;", "Ljava/util/List;", "getEnabledFileTypes", "()Ljava/util/List;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final List<String> enabledFileTypes;
                private final String uploadedFileType;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readString(), parcel.createStringArrayList());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11468o(name = "uploaded_file_type") String str, @InterfaceC11468o(name = "enabled_file_types") List<String> list) {
                    this.uploadedFileType = str;
                    this.enabledFileTypes = list;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final List<String> getEnabledFileTypes() {
                    return this.enabledFileTypes;
                }

                public final String getUploadedFileType() {
                    return this.uploadedFileType;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeString(this.uploadedFileType);
                    parcel.writeStringList(this.enabledFileTypes);
                }
            }

            public DisabledFileTypeError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class FileLimitExceededError extends DocumentErrorResponse {
            public static final Parcelable.Creator<FileLimitExceededError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<FileLimitExceededError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileLimitExceededError createFromParcel(Parcel parcel) {
                    return new FileLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileLimitExceededError[] newArray(int i10) {
                    return new FileLimitExceededError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeInt(1);
                }
            }

            public FileLimitExceededError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class GovernmentIdDimensionSizeError extends DocumentErrorResponse {
            public static final Parcelable.Creator<GovernmentIdDimensionSizeError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<GovernmentIdDimensionSizeError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GovernmentIdDimensionSizeError createFromParcel(Parcel parcel) {
                    return new GovernmentIdDimensionSizeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GovernmentIdDimensionSizeError[] newArray(int i10) {
                    return new GovernmentIdDimensionSizeError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0011\u0010\b¨\u0006\u0012"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "", "minDimensionSize", "maxDimensionSize", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f32012I, "getMinDimensionSize", "getMaxDimensionSize", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int maxDimensionSize;
                private final int minDimensionSize;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt(), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11468o(name = "min_dimension_size") int i10, @InterfaceC11468o(name = "max_dimension_size") int i11) {
                    this.minDimensionSize = i10;
                    this.maxDimensionSize = i11;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final int getMaxDimensionSize() {
                    return this.maxDimensionSize;
                }

                public final int getMinDimensionSize() {
                    return this.minDimensionSize;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeInt(this.minDimensionSize);
                    parcel.writeInt(this.maxDimensionSize);
                }
            }

            public GovernmentIdDimensionSizeError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class MalformedFileError extends DocumentErrorResponse {
            public static final Parcelable.Creator<MalformedFileError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<MalformedFileError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedFileError createFromParcel(Parcel parcel) {
                    return new MalformedFileError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedFileError[] newArray(int i10) {
                    return new MalformedFileError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedFileError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeInt(1);
                }
            }

            public MalformedFileError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class MalformedImageError extends DocumentErrorResponse {
            public static final Parcelable.Creator<MalformedImageError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<MalformedImageError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedImageError createFromParcel(Parcel parcel) {
                    return new MalformedImageError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedImageError[] newArray(int i10) {
                    return new MalformedImageError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedImageError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeInt(1);
                }
            }

            public MalformedImageError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class MalformedPdfError extends DocumentErrorResponse {
            public static final Parcelable.Creator<MalformedPdfError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<MalformedPdfError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedPdfError createFromParcel(Parcel parcel) {
                    return new MalformedPdfError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedPdfError[] newArray(int i10) {
                    return new MalformedPdfError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$MalformedPdfError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeInt(1);
                }
            }

            public MalformedPdfError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError$Details;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError$Details;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError$Details;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError$Details;", "Details", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class PageLimitExceededError extends DocumentErrorResponse {
            public static final Parcelable.Creator<PageLimitExceededError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PageLimitExceededError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PageLimitExceededError createFromParcel(Parcel parcel) {
                    return new PageLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PageLimitExceededError[] newArray(int i10) {
                    return new PageLimitExceededError[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$PageLimitExceededError$Details;", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "", "pageLimit", "<init>", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", TokenNames.f32012I, "getPageLimit", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int pageLimit;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11468o(name = "page_limit") int i10) {
                    this.pageLimit = i10;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final int getPageLimit() {
                    return this.pageLimit;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    parcel.writeInt(this.pageLimit);
                }
            }

            public PageLimitExceededError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, flags);
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "", UiComponentConfig.Title.type, "code", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCode", "Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "getDetails", "()Lcom/withpersona/sdk2/inquiry/network/ErrorDetails;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class UnknownError extends DocumentErrorResponse {
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();
            private final String code;
            private final ErrorDetails details;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<UnknownError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError createFromParcel(Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString(), (ErrorDetails) parcel.readParcelable(UnknownError.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError[] newArray(int i10) {
                    return new UnknownError[i10];
                }
            }

            public UnknownError() {
                this(null, null, null, 7, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public ErrorDetails getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                parcel.writeParcelable(this.details, flags);
            }

            public /* synthetic */ UnknownError(String str, String str2, ErrorDetails errorDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "Unknown Error" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : errorDetails);
            }

            public UnknownError(String str, String str2, ErrorDetails errorDetails) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = errorDetails;
            }
        }

        public /* synthetic */ DocumentErrorResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getCode();

        public abstract ErrorDetails getDetails();

        public abstract String getTitle();

        private DocumentErrorResponse() {
        }
    }

    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$UnknownErrorAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;", "<init>", "()V", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;)V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UnknownErrorAdapter extends AbstractC11471r {
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        @Override // bj.AbstractC11471r
        public DocumentErrorResponse.UnknownError fromJson(AbstractC11477x reader) {
            reader.mo12814e();
            String strM8384b = null;
            String strM8384b2 = null;
            while (reader.hasNext()) {
                String strMo12813a0 = reader.mo12813a0();
                if (AbstractC16544l.m18089b(strMo12813a0, UiComponentConfig.Title.type)) {
                    strM8384b = AbstractC8033Y5.m8384b(reader);
                } else if (AbstractC16544l.m18089b(strMo12813a0, "code")) {
                    strM8384b2 = AbstractC8033Y5.m8384b(reader);
                } else {
                    reader.mo12800D();
                }
            }
            reader.mo12818m();
            if (strM8384b == null) {
                strM8384b = "Unknown Error";
            }
            return new DocumentErrorResponse.UnknownError(strM8384b, strM8384b2, null, 4, null);
        }

        @Override // bj.AbstractC11471r
        public void toJson(AbstractC11440E writer, DocumentErrorResponse.UnknownError value) {
            writer.mo12833e();
            writer.mo12827T(UiComponentConfig.Title.type);
            writer.mo12828V0(value != null ? value.getTitle() : null);
            writer.mo12827T("code");
            writer.mo12828V0(value != null ? value.getCode() : null);
            writer.mo12823E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericFileUploadErrorResponse(List<? extends DocumentErrorResponse> list) {
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericFileUploadErrorResponse copy$default(GenericFileUploadErrorResponse genericFileUploadErrorResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = genericFileUploadErrorResponse.errors;
        }
        return genericFileUploadErrorResponse.copy(list);
    }

    public final List<DocumentErrorResponse> component1() {
        return this.errors;
    }

    public final GenericFileUploadErrorResponse copy(List<? extends DocumentErrorResponse> errors) {
        return new GenericFileUploadErrorResponse(errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenericFileUploadErrorResponse) && AbstractC16544l.m18089b(this.errors, ((GenericFileUploadErrorResponse) other).errors);
    }

    public final List<DocumentErrorResponse> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public String toString() {
        return "GenericFileUploadErrorResponse(errors=" + this.errors + Separators.RPAREN;
    }
}
