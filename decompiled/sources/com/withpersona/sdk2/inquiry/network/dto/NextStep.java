package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.EnumC11476w;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import bj.InterfaceC11468o;
import bj.InterfaceC11470q;
import bj.InterfaceC11472s;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import mm.InterfaceC17306i;
import p523V9.AbstractC7877E4;
import p523V9.AbstractC8033Y5;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.bQBnquXS;
import p680cj.C11761b;
import p680cj.C11763d;
import p911o0.AbstractC17792x;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "", DiagnosticsEntry.NAME_KEY, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "CancelDialog", "Companion", "Complete", "Document", "GovernmentId", "Selfie", "Ui", "Unknown", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class NextStep {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String name;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, SDPKeywords.PROMPT, "btnSubmit", "btnResume", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPrompt", "getBtnSubmit", "getBtnResume", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class CancelDialog implements Parcelable {
        public static final Parcelable.Creator<CancelDialog> CREATOR = new Creator();
        private final String btnResume;
        private final String btnSubmit;
        private final String prompt;
        private final String title;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<CancelDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelDialog createFromParcel(Parcel parcel) {
                return new CancelDialog(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelDialog[] newArray(int i10) {
                return new CancelDialog[i10];
            }
        }

        public CancelDialog(String str, String str2, String str3, String str4) {
            this.title = str;
            this.prompt = str2;
            this.btnSubmit = str3;
            this.btnResume = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getBtnResume() {
            return this.btnResume;
        }

        public final String getBtnSubmit() {
            return this.btnSubmit;
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.prompt);
            parcel.writeString(this.btnSubmit);
            parcel.writeString(this.btnResume);
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Companion;", "", "<init>", "()V", "Lbj/q;", "createAdapter", "()Lbj/q;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterfaceC11470q createAdapter() {
            C11763d c11763d = new C11763d(NextStep.class, "type", Collections.emptyList(), Collections.emptyList(), null);
            return c11763d.m13055a(new C11761b(c11763d, Unknown.INSTANCE)).m13056b(C12890Ui.class, zakks.dIIIQWtZnRwaAVw).m13056b(GovernmentId.class, "government_id").m13056b(Selfie.class, "selfie").m13056b(Document.class, "document").m13056b(Complete.class, "complete");
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Complete extends NextStep implements Parcelable {
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();
        private final String name;

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Complete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete createFromParcel(Parcel parcel) {
                return new Complete(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Complete[] newArray(int i10) {
                return new Complete[i10];
            }
        }

        public Complete(String str) {
            super(str, null);
            this.name = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
        }
    }

    @Metadata(m18066d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u001d\u001e\u001f !\"#B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "AssetConfig", "Config", "Localizations", "Pages", "PendingPage", "PromptPage", "StartPage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Document extends NextStep implements Parcelable {
        public static final Parcelable.Creator<Document> CREATOR = new Creator();
        private final Config config;
        private final String name;
        private final StepStyles.DocumentStepStyle styles;

        @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "pendingPage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "getPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "getPendingPage", "PendingPage", "PromptPage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final /* data */ class AssetConfig implements Parcelable {
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i10) {
                    return new AssetConfig[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "headerPictograph", "loadingPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getHeaderPictograph", "getLoadingPictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class PendingPage implements Parcelable {
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage headerPictograph;
                private final UiComponentConfig.RemoteImage loadingPictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage createFromParcel(Parcel parcel) {
                        return new PendingPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage[] newArray(int i10) {
                        return new PendingPage[i10];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PendingPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ PendingPage copy$default(PendingPage pendingPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final PendingPage copy(UiComponentConfig.RemoteImage headerPictograph, UiComponentConfig.RemoteImage loadingPictograph) {
                    return new PendingPage(headerPictograph, loadingPictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) other;
                    return AbstractC16544l.m18089b(this.headerPictograph, pendingPage.headerPictograph) && AbstractC16544l.m18089b(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final UiComponentConfig.RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.loadingPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                }

                public PendingPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                public /* synthetic */ PendingPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2);
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "headerPictograph", "documentPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PromptPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getHeaderPictograph", "getDocumentPictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class PromptPage implements Parcelable {
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage documentPictograph;
                private final UiComponentConfig.RemoteImage headerPictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        return new PromptPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i10) {
                        return new PromptPage[i10];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PromptPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = promptPage.documentPictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                public final PromptPage copy(UiComponentConfig.RemoteImage headerPictograph, UiComponentConfig.RemoteImage documentPictograph) {
                    return new PromptPage(headerPictograph, documentPictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return AbstractC16544l.m18089b(this.headerPictograph, promptPage.headerPictograph) && AbstractC16544l.m18089b(this.documentPictograph, promptPage.documentPictograph);
                }

                public final UiComponentConfig.RemoteImage getDocumentPictograph() {
                    return this.documentPictograph;
                }

                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.documentPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", documentPictograph=" + this.documentPictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.documentPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                }

                public PromptPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.documentPictograph = remoteImage2;
                }

                public /* synthetic */ PromptPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, PendingPage pendingPage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i10 & 2) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                return assetConfig.copy(promptPage, pendingPage);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final AssetConfig copy(PromptPage promptPage, PendingPage pendingPage) {
                return new AssetConfig(promptPage, pendingPage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return AbstractC16544l.m18089b(this.promptPage, assetConfig.promptPage) && AbstractC16544l.m18089b(this.pendingPage, assetConfig.pendingPage);
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int iHashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                PendingPage pendingPage = this.pendingPage;
                return iHashCode + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", pendingPage=" + this.pendingPage + Separators.RPAREN;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    pendingPage.writeToParcel(parcel, flags);
                }
            }

            public AssetConfig(PromptPage promptPage, PendingPage pendingPage) {
                this.promptPage = promptPage;
                this.pendingPage = pendingPage;
            }

            public /* synthetic */ AssetConfig(PromptPage promptPage, PendingPage pendingPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : promptPage, (i10 & 2) != 0 ? null : pendingPage);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010'R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b,\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108¨\u00069"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "Landroid/os/Parcelable;", "", "backStepEnabled", "cancelButtonEnabled", "", "documentFileLimit", "", "documentId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "startPage", "fieldKeyDocument", "kind", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "getCancelButtonEnabled", TokenNames.f32012I, "getDocumentFileLimit", "Ljava/lang/String;", "getDocumentId", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "getStartPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "getFieldKeyDocument", "getKind", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "getPages", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Config implements Parcelable {
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final AssetConfig assets;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final int documentFileLimit;
            private final String documentId;
            private final String fieldKeyDocument;
            private final String kind;
            private final Localizations localizations;
            private final Pages pages;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final StartPage startPage;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(boolValueOf, boolValueOf2, parcel.readInt(), parcel.readString(), StartPage.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), Localizations.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Pages.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AssetConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PendingPageTextPosition.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i10) {
                    return new Config[i10];
                }
            }

            public Config(Boolean bool, Boolean bool2, int i10, String str, StartPage startPage, String str2, String str3, Localizations localizations, Pages pages, AssetConfig assetConfig, PendingPageTextPosition pendingPageTextPosition) {
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.documentFileLimit = i10;
                this.documentId = str;
                this.startPage = startPage;
                this.fieldKeyDocument = str2;
                this.kind = str3;
                this.localizations = localizations;
                this.pages = pages;
                this.assets = assetConfig;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final int getDocumentFileLimit() {
                return this.documentFileLimit;
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            public final String getKind() {
                return this.kind;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final Pages getPages() {
                return this.pages;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StartPage getStartPage() {
                return this.startPage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool2);
                }
                parcel.writeInt(this.documentFileLimit);
                parcel.writeString(this.documentId);
                parcel.writeString(this.startPage.name());
                parcel.writeString(this.fieldKeyDocument);
                parcel.writeString(this.kind);
                this.localizations.writeToParcel(parcel, flags);
                Pages pages = this.pages;
                if (pages == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    pages.writeToParcel(parcel, flags);
                }
                AssetConfig assetConfig = this.assets;
                if (assetConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    assetConfig.writeToParcel(parcel, flags);
                }
                PendingPageTextPosition pendingPageTextPosition = this.pendingPageTextVerticalPosition;
                if (pendingPageTextPosition == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(pendingPageTextPosition.name());
                }
            }
        }

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                return new Document(parcel.readString(), parcel.readInt() == 0 ? null : StepStyles.DocumentStepStyle.CREATOR.createFromParcel(parcel), Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i10) {
                return new Document[i10];
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    return new Localizations(PendingPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(PendingPage pendingPage, PromptPage promptPage, CancelDialog cancelDialog) {
                this.pendingPage = pendingPage;
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                this.pendingPage.writeToParcel(parcel, flags);
                this.promptPage.writeToParcel(parcel, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "document", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "getDocument", "DocumentPages", "DocumentStartPage", "UploadOptionsDialog", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final /* data */ class Pages implements Parcelable {
            public static final Parcelable.Creator<Pages> CREATOR = new Creator();
            private final DocumentPages document;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Pages> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages createFromParcel(Parcel parcel) {
                    return new Pages(parcel.readInt() == 0 ? null : DocumentPages.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Pages[] newArray(int i10) {
                    return new Pages[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", SDPKeywords.PROMPT, "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "uploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentPages;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "getPrompt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "getUploadOptionsDialog", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class DocumentPages implements Parcelable {
                public static final Parcelable.Creator<DocumentPages> CREATOR = new Creator();
                private final DocumentStartPage prompt;
                private final UploadOptionsDialog uploadOptionsDialog;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<DocumentPages> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentPages createFromParcel(Parcel parcel) {
                        return new DocumentPages(parcel.readInt() == 0 ? null : DocumentStartPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UploadOptionsDialog.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentPages[] newArray(int i10) {
                        return new DocumentPages[i10];
                    }
                }

                public DocumentPages(DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog) {
                    this.prompt = documentStartPage;
                    this.uploadOptionsDialog = uploadOptionsDialog;
                }

                public static /* synthetic */ DocumentPages copy$default(DocumentPages documentPages, DocumentStartPage documentStartPage, UploadOptionsDialog uploadOptionsDialog, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        documentStartPage = documentPages.prompt;
                    }
                    if ((i10 & 2) != 0) {
                        uploadOptionsDialog = documentPages.uploadOptionsDialog;
                    }
                    return documentPages.copy(documentStartPage, uploadOptionsDialog);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                public final DocumentPages copy(DocumentStartPage prompt, UploadOptionsDialog uploadOptionsDialog) {
                    return new DocumentPages(prompt, uploadOptionsDialog);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentPages)) {
                        return false;
                    }
                    DocumentPages documentPages = (DocumentPages) other;
                    return AbstractC16544l.m18089b(this.prompt, documentPages.prompt) && AbstractC16544l.m18089b(this.uploadOptionsDialog, documentPages.uploadOptionsDialog);
                }

                public final DocumentStartPage getPrompt() {
                    return this.prompt;
                }

                public final UploadOptionsDialog getUploadOptionsDialog() {
                    return this.uploadOptionsDialog;
                }

                public int hashCode() {
                    DocumentStartPage documentStartPage = this.prompt;
                    int iHashCode = (documentStartPage == null ? 0 : documentStartPage.hashCode()) * 31;
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    return iHashCode + (uploadOptionsDialog != null ? uploadOptionsDialog.hashCode() : 0);
                }

                public String toString() {
                    return "DocumentPages(prompt=" + this.prompt + ", uploadOptionsDialog=" + this.uploadOptionsDialog + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    DocumentStartPage documentStartPage = this.prompt;
                    if (documentStartPage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        documentStartPage.writeToParcel(parcel, flags);
                    }
                    UploadOptionsDialog uploadOptionsDialog = this.uploadOptionsDialog;
                    if (uploadOptionsDialog == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        uploadOptionsDialog.writeToParcel(parcel, flags);
                    }
                }
            }

            @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "componentNameMapping", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getUiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "getComponentNameMapping", "ComponentNameMapping", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @InterfaceC11472s(generateAdapter = true)
            public static final /* data */ class DocumentStartPage implements Parcelable {
                public static final Parcelable.Creator<DocumentStartPage> CREATOR = new Creator();
                private final ComponentNameMapping componentNameMapping;
                private final C12890Ui uiStep;

                @InterfaceC11472s(generateAdapter = true)
                @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "Landroid/os/Parcelable;", "", "buttonFilePicker", "buttonPhotoLibrary", "buttonCamera", "buttonUploadOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage$ComponentNameMapping;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonFilePicker", "getButtonPhotoLibrary", "getButtonCamera", "getButtonUploadOptions", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final /* data */ class ComponentNameMapping implements Parcelable {
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                    private final String buttonCamera;
                    private final String buttonFilePicker;
                    private final String buttonPhotoLibrary;
                    private final String buttonUploadOptions;

                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping createFromParcel(Parcel parcel) {
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping[] newArray(int i10) {
                            return new ComponentNameMapping[i10];
                        }
                    }

                    public ComponentNameMapping(String str, String str2, String str3, String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonUploadOptions = str4;
                    }

                    public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i10 & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i10 & 8) != 0) {
                            str4 = componentNameMapping.buttonUploadOptions;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    public final ComponentNameMapping copy(String buttonFilePicker, String buttonPhotoLibrary, String buttonCamera, String buttonUploadOptions) {
                        return new ComponentNameMapping(buttonFilePicker, buttonPhotoLibrary, buttonCamera, buttonUploadOptions);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ComponentNameMapping)) {
                            return false;
                        }
                        ComponentNameMapping componentNameMapping = (ComponentNameMapping) other;
                        return AbstractC16544l.m18089b(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && AbstractC16544l.m18089b(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && AbstractC16544l.m18089b(this.buttonCamera, componentNameMapping.buttonCamera) && AbstractC16544l.m18089b(this.buttonUploadOptions, componentNameMapping.buttonUploadOptions);
                    }

                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public final String getButtonUploadOptions() {
                        return this.buttonUploadOptions;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonUploadOptions;
                        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    public String toString() {
                        String str = this.buttonFilePicker;
                        String str2 = this.buttonPhotoLibrary;
                        String str3 = this.buttonCamera;
                        String str4 = this.buttonUploadOptions;
                        StringBuilder sbM9896o = AbstractC9306j0.m9896o("ComponentNameMapping(buttonFilePicker=", str, ", buttonPhotoLibrary=", str2, ", buttonCamera=");
                        sbM9896o.append(str3);
                        sbM9896o.append(", buttonUploadOptions=");
                        sbM9896o.append(str4);
                        sbM9896o.append(Separators.RPAREN);
                        return sbM9896o.toString();
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        parcel.writeString(this.buttonFilePicker);
                        parcel.writeString(this.buttonPhotoLibrary);
                        parcel.writeString(this.buttonCamera);
                        parcel.writeString(this.buttonUploadOptions);
                    }
                }

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<DocumentStartPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentStartPage createFromParcel(Parcel parcel) {
                        return new DocumentStartPage(C12890Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DocumentStartPage[] newArray(int i10) {
                        return new DocumentStartPage[i10];
                    }
                }

                public DocumentStartPage(C12890Ui c12890Ui, ComponentNameMapping componentNameMapping) {
                    this.uiStep = c12890Ui;
                    this.componentNameMapping = componentNameMapping;
                }

                public static /* synthetic */ DocumentStartPage copy$default(DocumentStartPage documentStartPage, C12890Ui c12890Ui, ComponentNameMapping componentNameMapping, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        c12890Ui = documentStartPage.uiStep;
                    }
                    if ((i10 & 2) != 0) {
                        componentNameMapping = documentStartPage.componentNameMapping;
                    }
                    return documentStartPage.copy(c12890Ui, componentNameMapping);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C12890Ui getUiStep() {
                    return this.uiStep;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final DocumentStartPage copy(C12890Ui uiStep, ComponentNameMapping componentNameMapping) {
                    return new DocumentStartPage(uiStep, componentNameMapping);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentStartPage)) {
                        return false;
                    }
                    DocumentStartPage documentStartPage = (DocumentStartPage) other;
                    return AbstractC16544l.m18089b(this.uiStep, documentStartPage.uiStep) && AbstractC16544l.m18089b(this.componentNameMapping, documentStartPage.componentNameMapping);
                }

                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final C12890Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int iHashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return iHashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                public String toString() {
                    return "DocumentStartPage(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    this.uiStep.writeToParcel(parcel, flags);
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    if (componentNameMapping == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        componentNameMapping.writeToParcel(parcel, flags);
                    }
                }
            }

            @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "uiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "componentNameMapping", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "getUiStep", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "getComponentNameMapping", "ComponentNameMapping", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @InterfaceC11472s(generateAdapter = true)
            public static final /* data */ class UploadOptionsDialog implements Parcelable {
                public static final Parcelable.Creator<UploadOptionsDialog> CREATOR = new Creator();
                private final ComponentNameMapping componentNameMapping;
                private final C12890Ui uiStep;

                @InterfaceC11472s(generateAdapter = true)
                @Metadata(m18066d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "Landroid/os/Parcelable;", "", "buttonFilePicker", "buttonPhotoLibrary", "buttonCamera", "buttonCancel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog$ComponentNameMapping;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonFilePicker", "getButtonPhotoLibrary", "getButtonCamera", "getButtonCancel", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final /* data */ class ComponentNameMapping implements Parcelable {
                    public static final Parcelable.Creator<ComponentNameMapping> CREATOR = new Creator();
                    private final String buttonCamera;
                    private final String buttonCancel;
                    private final String buttonFilePicker;
                    private final String buttonPhotoLibrary;

                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public static final class Creator implements Parcelable.Creator<ComponentNameMapping> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping createFromParcel(Parcel parcel) {
                            return new ComponentNameMapping(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final ComponentNameMapping[] newArray(int i10) {
                            return new ComponentNameMapping[i10];
                        }
                    }

                    public ComponentNameMapping(String str, String str2, String str3, String str4) {
                        this.buttonFilePicker = str;
                        this.buttonPhotoLibrary = str2;
                        this.buttonCamera = str3;
                        this.buttonCancel = str4;
                    }

                    public static /* synthetic */ ComponentNameMapping copy$default(ComponentNameMapping componentNameMapping, String str, String str2, String str3, String str4, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = componentNameMapping.buttonFilePicker;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = componentNameMapping.buttonPhotoLibrary;
                        }
                        if ((i10 & 4) != 0) {
                            str3 = componentNameMapping.buttonCamera;
                        }
                        if ((i10 & 8) != 0) {
                            str4 = componentNameMapping.buttonCancel;
                        }
                        return componentNameMapping.copy(str, str2, str3, str4);
                    }

                    /* JADX INFO: renamed from: component1, reason: from getter */
                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    /* JADX INFO: renamed from: component2, reason: from getter */
                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    /* JADX INFO: renamed from: component3, reason: from getter */
                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    /* JADX INFO: renamed from: component4, reason: from getter */
                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    public final ComponentNameMapping copy(String buttonFilePicker, String buttonPhotoLibrary, String buttonCamera, String buttonCancel) {
                        return new ComponentNameMapping(buttonFilePicker, buttonPhotoLibrary, buttonCamera, buttonCancel);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ComponentNameMapping)) {
                            return false;
                        }
                        ComponentNameMapping componentNameMapping = (ComponentNameMapping) other;
                        return AbstractC16544l.m18089b(this.buttonFilePicker, componentNameMapping.buttonFilePicker) && AbstractC16544l.m18089b(this.buttonPhotoLibrary, componentNameMapping.buttonPhotoLibrary) && AbstractC16544l.m18089b(this.buttonCamera, componentNameMapping.buttonCamera) && AbstractC16544l.m18089b(this.buttonCancel, componentNameMapping.buttonCancel);
                    }

                    public final String getButtonCamera() {
                        return this.buttonCamera;
                    }

                    public final String getButtonCancel() {
                        return this.buttonCancel;
                    }

                    public final String getButtonFilePicker() {
                        return this.buttonFilePicker;
                    }

                    public final String getButtonPhotoLibrary() {
                        return this.buttonPhotoLibrary;
                    }

                    public int hashCode() {
                        String str = this.buttonFilePicker;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.buttonPhotoLibrary;
                        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.buttonCamera;
                        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        String str4 = this.buttonCancel;
                        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
                    }

                    public String toString() {
                        String str = this.buttonFilePicker;
                        String str2 = this.buttonPhotoLibrary;
                        String str3 = this.buttonCamera;
                        String str4 = this.buttonCancel;
                        StringBuilder sbM9896o = AbstractC9306j0.m9896o("ComponentNameMapping(buttonFilePicker=", str, ", buttonPhotoLibrary=", str2, ", buttonCamera=");
                        sbM9896o.append(str3);
                        sbM9896o.append(", buttonCancel=");
                        sbM9896o.append(str4);
                        sbM9896o.append(Separators.RPAREN);
                        return sbM9896o.toString();
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        parcel.writeString(this.buttonFilePicker);
                        parcel.writeString(this.buttonPhotoLibrary);
                        parcel.writeString(this.buttonCamera);
                        parcel.writeString(this.buttonCancel);
                    }
                }

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<UploadOptionsDialog> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadOptionsDialog createFromParcel(Parcel parcel) {
                        return new UploadOptionsDialog(C12890Ui.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComponentNameMapping.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final UploadOptionsDialog[] newArray(int i10) {
                        return new UploadOptionsDialog[i10];
                    }
                }

                public UploadOptionsDialog(C12890Ui c12890Ui, ComponentNameMapping componentNameMapping) {
                    this.uiStep = c12890Ui;
                    this.componentNameMapping = componentNameMapping;
                }

                public static /* synthetic */ UploadOptionsDialog copy$default(UploadOptionsDialog uploadOptionsDialog, C12890Ui c12890Ui, ComponentNameMapping componentNameMapping, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        c12890Ui = uploadOptionsDialog.uiStep;
                    }
                    if ((i10 & 2) != 0) {
                        componentNameMapping = uploadOptionsDialog.componentNameMapping;
                    }
                    return uploadOptionsDialog.copy(c12890Ui, componentNameMapping);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final C12890Ui getUiStep() {
                    return this.uiStep;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final UploadOptionsDialog copy(C12890Ui uiStep, ComponentNameMapping componentNameMapping) {
                    return new UploadOptionsDialog(uiStep, componentNameMapping);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UploadOptionsDialog)) {
                        return false;
                    }
                    UploadOptionsDialog uploadOptionsDialog = (UploadOptionsDialog) other;
                    return AbstractC16544l.m18089b(this.uiStep, uploadOptionsDialog.uiStep) && AbstractC16544l.m18089b(this.componentNameMapping, uploadOptionsDialog.componentNameMapping);
                }

                public final ComponentNameMapping getComponentNameMapping() {
                    return this.componentNameMapping;
                }

                public final C12890Ui getUiStep() {
                    return this.uiStep;
                }

                public int hashCode() {
                    int iHashCode = this.uiStep.hashCode() * 31;
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    return iHashCode + (componentNameMapping == null ? 0 : componentNameMapping.hashCode());
                }

                public String toString() {
                    return "UploadOptionsDialog(uiStep=" + this.uiStep + ", componentNameMapping=" + this.componentNameMapping + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    this.uiStep.writeToParcel(parcel, flags);
                    ComponentNameMapping componentNameMapping = this.componentNameMapping;
                    if (componentNameMapping == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        componentNameMapping.writeToParcel(parcel, flags);
                    }
                }
            }

            public Pages(DocumentPages documentPages) {
                this.document = documentPages;
            }

            public static /* synthetic */ Pages copy$default(Pages pages, DocumentPages documentPages, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    documentPages = pages.document;
                }
                return pages.copy(documentPages);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentPages getDocument() {
                return this.document;
            }

            public final Pages copy(DocumentPages document) {
                return new Pages(document);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Pages) && AbstractC16544l.m18089b(this.document, ((Pages) other).document);
            }

            public final DocumentPages getDocument() {
                return this.document;
            }

            public int hashCode() {
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    return 0;
                }
                return documentPages.hashCode();
            }

            public String toString() {
                return "Pages(document=" + this.document + bQBnquXS.LnIu;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                DocumentPages documentPages = this.document;
                if (documentPages == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    documentPages.writeToParcel(parcel, flags);
                }
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PendingPage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            public PendingPage(String str, String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, SDPKeywords.PROMPT, "disclaimer", "captureOptionsDialogTitle", "btnCapture", "btnUpload", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPrompt", "getDisclaimer", "getCaptureOptionsDialogTitle", "getBtnCapture", "getBtnUpload", "getBtnSubmit", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String btnCapture;
            private final String btnSubmit;
            private final String btnUpload;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String captureOptionsDialogTitle;
            private final String disclaimer;
            private final String prompt;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            public PromptPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @InterfaceC11468o(name = "cameraPermissionsBtnContinueMobile") String str10, @InterfaceC11468o(name = "cameraPermissionsBtnCancel") String str11) {
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.captureOptionsDialogTitle = str4;
                this.btnCapture = str5;
                this.btnUpload = str6;
                this.btnSubmit = str7;
                this.cameraPermissionsTitle = str8;
                this.cameraPermissionsPrompt = str9;
                this.cameraPermissionsAllowButtonText = str10;
                this.cameraPermissionsCancelButtonText = str11;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getBtnCapture() {
                return this.btnCapture;
            }

            public final String getBtnSubmit() {
                return this.btnSubmit;
            }

            public final String getBtnUpload() {
                return this.btnUpload;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getCaptureOptionsDialogTitle() {
                return this.captureOptionsDialogTitle;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.disclaimer);
                parcel.writeString(this.captureOptionsDialogTitle);
                parcel.writeString(this.btnCapture);
                parcel.writeString(this.btnUpload);
                parcel.writeString(this.btnSubmit);
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "", "(Ljava/lang/String;I)V", "PROMPT", "REVIEW", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum StartPage {
            PROMPT,
            REVIEW;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public Document(String str, StepStyles.DocumentStepStyle documentStepStyle, Config config) {
            super(str, null);
            this.name = str;
            this.styles = documentStepStyle;
            this.config = config;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            if (documentStepStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentStepStyle.writeToParcel(parcel, flags);
            }
            this.config.writeToParcel(parcel, flags);
        }
    }

    @Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001:\u0010\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", DiagnosticsEntry.NAME_KEY, "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStyle;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStyle;)V", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "getName", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$GovernmentIdStepStyle;", "AssetConfig", "AutoClassificationConfig", "AutoClassificationPage", "CaptureFileType", "CapturePage", "CheckPage", "Config", "LocalizationOverride", "Localizations", "PassportNfcOption", "PendingPage", "PromptPage", "RequestPage", "ReviewUploadPage", "SelectPage", "VideoCaptureMethod", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class GovernmentId extends NextStep {
        private final Config config;
        private final String name;
        private final StepStyles.GovernmentIdStepStyle styles;

        @Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u00056789:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0017¨\u0006;"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "selectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "pendingPage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "component4", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "component5", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "getSelectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "getPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "getCapturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "getCheckPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "getPendingPage", "CapturePage", "CheckPage", "PendingPage", "PromptPage", "SelectPage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final /* data */ class AssetConfig implements Parcelable {
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final CapturePage capturePage;
            private final CheckPage checkPage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;
            private final SelectPage selectPage;

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u000e¨\u00063"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "idFrontHelpModalPictograph", "idBackHelpModalPictograph", "barcodeHelpModalPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getIdFrontPictograph", "getIdBackPictograph", "getBarcodePdf417Pictograph", "getPassportFrontPictograph", "getPassportSignaturePictograph", "getIdFrontHelpModalPictograph", "getIdBackHelpModalPictograph", "getBarcodeHelpModalPictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class CapturePage implements Parcelable {
                public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage barcodeHelpModalPictograph;
                private final UiComponentConfig.RemoteImage barcodePdf417Pictograph;
                private final UiComponentConfig.RemoteImage idBackHelpModalPictograph;
                private final UiComponentConfig.RemoteImage idBackPictograph;
                private final UiComponentConfig.RemoteImage idFrontHelpModalPictograph;
                private final UiComponentConfig.RemoteImage idFrontPictograph;
                private final UiComponentConfig.RemoteImage passportFrontPictograph;
                private final UiComponentConfig.RemoteImage passportSignaturePictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<CapturePage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CapturePage createFromParcel(Parcel parcel) {
                        return new CapturePage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CapturePage[] newArray(int i10) {
                        return new CapturePage[i10];
                    }
                }

                public CapturePage() {
                    this(null, null, null, null, null, null, null, null, 255, null);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final UiComponentConfig.RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final UiComponentConfig.RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final UiComponentConfig.RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final UiComponentConfig.RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final UiComponentConfig.RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                /* JADX INFO: renamed from: component8, reason: from getter */
                public final UiComponentConfig.RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                public final CapturePage copy(UiComponentConfig.RemoteImage idFrontPictograph, UiComponentConfig.RemoteImage idBackPictograph, UiComponentConfig.RemoteImage barcodePdf417Pictograph, UiComponentConfig.RemoteImage passportFrontPictograph, UiComponentConfig.RemoteImage passportSignaturePictograph, UiComponentConfig.RemoteImage idFrontHelpModalPictograph, UiComponentConfig.RemoteImage idBackHelpModalPictograph, UiComponentConfig.RemoteImage barcodeHelpModalPictograph) {
                    return new CapturePage(idFrontPictograph, idBackPictograph, barcodePdf417Pictograph, passportFrontPictograph, passportSignaturePictograph, idFrontHelpModalPictograph, idBackHelpModalPictograph, barcodeHelpModalPictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CapturePage)) {
                        return false;
                    }
                    CapturePage capturePage = (CapturePage) other;
                    return AbstractC16544l.m18089b(this.idFrontPictograph, capturePage.idFrontPictograph) && AbstractC16544l.m18089b(this.idBackPictograph, capturePage.idBackPictograph) && AbstractC16544l.m18089b(this.barcodePdf417Pictograph, capturePage.barcodePdf417Pictograph) && AbstractC16544l.m18089b(this.passportFrontPictograph, capturePage.passportFrontPictograph) && AbstractC16544l.m18089b(this.passportSignaturePictograph, capturePage.passportSignaturePictograph) && AbstractC16544l.m18089b(this.idFrontHelpModalPictograph, capturePage.idFrontHelpModalPictograph) && AbstractC16544l.m18089b(this.idBackHelpModalPictograph, capturePage.idBackHelpModalPictograph) && AbstractC16544l.m18089b(this.barcodeHelpModalPictograph, capturePage.barcodeHelpModalPictograph);
                }

                public final UiComponentConfig.RemoteImage getBarcodeHelpModalPictograph() {
                    return this.barcodeHelpModalPictograph;
                }

                public final UiComponentConfig.RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                public final UiComponentConfig.RemoteImage getIdBackHelpModalPictograph() {
                    return this.idBackHelpModalPictograph;
                }

                public final UiComponentConfig.RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                public final UiComponentConfig.RemoteImage getIdFrontHelpModalPictograph() {
                    return this.idFrontHelpModalPictograph;
                }

                public final UiComponentConfig.RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                public final UiComponentConfig.RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                public final UiComponentConfig.RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.idFrontPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.idBackPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage4 = this.passportFrontPictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    int iHashCode5 = (iHashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    int iHashCode6 = (iHashCode5 + (remoteImage6 == null ? 0 : remoteImage6.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    int iHashCode7 = (iHashCode6 + (remoteImage7 == null ? 0 : remoteImage7.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    return iHashCode7 + (remoteImage8 != null ? remoteImage8.hashCode() : 0);
                }

                public String toString() {
                    return "CapturePage(idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + ", idFrontHelpModalPictograph=" + this.idFrontHelpModalPictograph + ", idBackHelpModalPictograph=" + this.idBackHelpModalPictograph + ", barcodeHelpModalPictograph=" + this.barcodeHelpModalPictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.idFrontPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.idBackPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage3 = this.barcodePdf417Pictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage4 = this.passportFrontPictograph;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage5 = this.passportSignaturePictograph;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage6 = this.idFrontHelpModalPictograph;
                    if (remoteImage6 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage6.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage7 = this.idBackHelpModalPictograph;
                    if (remoteImage7 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage7.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage8 = this.barcodeHelpModalPictograph;
                    if (remoteImage8 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage8.writeToParcel(parcel, flags);
                    }
                }

                public CapturePage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, UiComponentConfig.RemoteImage remoteImage6, UiComponentConfig.RemoteImage remoteImage7, UiComponentConfig.RemoteImage remoteImage8) {
                    this.idFrontPictograph = remoteImage;
                    this.idBackPictograph = remoteImage2;
                    this.barcodePdf417Pictograph = remoteImage3;
                    this.passportFrontPictograph = remoteImage4;
                    this.passportSignaturePictograph = remoteImage5;
                    this.idFrontHelpModalPictograph = remoteImage6;
                    this.idBackHelpModalPictograph = remoteImage7;
                    this.barcodeHelpModalPictograph = remoteImage8;
                }

                public /* synthetic */ CapturePage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, UiComponentConfig.RemoteImage remoteImage6, UiComponentConfig.RemoteImage remoteImage7, UiComponentConfig.RemoteImage remoteImage8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5, (i10 & 32) != 0 ? null : remoteImage6, (i10 & 64) != 0 ? null : remoteImage7, (i10 & 128) == 0 ? remoteImage8 : null);
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "iconFile", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getIconFile", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class CheckPage implements Parcelable {
                public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage iconFile;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<CheckPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CheckPage createFromParcel(Parcel parcel) {
                        return new CheckPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final CheckPage[] newArray(int i10) {
                        return new CheckPage[i10];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public CheckPage() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ CheckPage copy$default(CheckPage checkPage, UiComponentConfig.RemoteImage remoteImage, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = checkPage.iconFile;
                    }
                    return checkPage.copy(remoteImage);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getIconFile() {
                    return this.iconFile;
                }

                public final CheckPage copy(UiComponentConfig.RemoteImage iconFile) {
                    return new CheckPage(iconFile);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CheckPage) && AbstractC16544l.m18089b(this.iconFile, ((CheckPage) other).iconFile);
                }

                public final UiComponentConfig.RemoteImage getIconFile() {
                    return this.iconFile;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        return 0;
                    }
                    return remoteImage.hashCode();
                }

                public String toString() {
                    return "CheckPage(iconFile=" + this.iconFile + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.iconFile;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                }

                public CheckPage(UiComponentConfig.RemoteImage remoteImage) {
                    this.iconFile = remoteImage;
                }

                public /* synthetic */ CheckPage(UiComponentConfig.RemoteImage remoteImage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage);
                }
            }

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    return new AssetConfig(parcel.readInt() == 0 ? null : SelectPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CapturePage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PendingPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i10) {
                    return new AssetConfig[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "headerPictograph", "loadingPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getHeaderPictograph", "getLoadingPictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class PendingPage implements Parcelable {
                public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage headerPictograph;
                private final UiComponentConfig.RemoteImage loadingPictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<PendingPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage createFromParcel(Parcel parcel) {
                        return new PendingPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PendingPage[] newArray(int i10) {
                        return new PendingPage[i10];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public PendingPage() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ PendingPage copy$default(PendingPage pendingPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = pendingPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = pendingPage.loadingPictograph;
                    }
                    return pendingPage.copy(remoteImage, remoteImage2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final PendingPage copy(UiComponentConfig.RemoteImage headerPictograph, UiComponentConfig.RemoteImage loadingPictograph) {
                    return new PendingPage(headerPictograph, loadingPictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PendingPage)) {
                        return false;
                    }
                    PendingPage pendingPage = (PendingPage) other;
                    return AbstractC16544l.m18089b(this.headerPictograph, pendingPage.headerPictograph) && AbstractC16544l.m18089b(this.loadingPictograph, pendingPage.loadingPictograph);
                }

                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final UiComponentConfig.RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.loadingPictograph;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public String toString() {
                    return "PendingPage(headerPictograph=" + this.headerPictograph + ", loadingPictograph=" + this.loadingPictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.loadingPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                }

                public PendingPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2) {
                    this.headerPictograph = remoteImage;
                    this.loadingPictograph = remoteImage2;
                }

                public /* synthetic */ PendingPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2);
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010\f¨\u0006-"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "headerPictograph", "idFrontPictograph", "idBackPictograph", "barcodePdf417Pictograph", "passportFrontPictograph", "passportSignaturePictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getHeaderPictograph", "getIdFrontPictograph", "getIdBackPictograph", "getBarcodePdf417Pictograph", "getPassportFrontPictograph", "getPassportSignaturePictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class PromptPage implements Parcelable {
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage barcodePdf417Pictograph;
                private final UiComponentConfig.RemoteImage headerPictograph;
                private final UiComponentConfig.RemoteImage idBackPictograph;
                private final UiComponentConfig.RemoteImage idFrontPictograph;
                private final UiComponentConfig.RemoteImage passportFrontPictograph;
                private final UiComponentConfig.RemoteImage passportSignaturePictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        return new PromptPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i10) {
                        return new PromptPage[i10];
                    }
                }

                public PromptPage() {
                    this(null, null, null, null, null, null, 63, null);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, UiComponentConfig.RemoteImage remoteImage6, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = promptPage.idFrontPictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage7 = remoteImage2;
                    if ((i10 & 4) != 0) {
                        remoteImage3 = promptPage.idBackPictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage8 = remoteImage3;
                    if ((i10 & 8) != 0) {
                        remoteImage4 = promptPage.barcodePdf417Pictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage9 = remoteImage4;
                    if ((i10 & 16) != 0) {
                        remoteImage5 = promptPage.passportFrontPictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage10 = remoteImage5;
                    if ((i10 & 32) != 0) {
                        remoteImage6 = promptPage.passportSignaturePictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage7, remoteImage8, remoteImage9, remoteImage10, remoteImage6);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final UiComponentConfig.RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final UiComponentConfig.RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final UiComponentConfig.RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final UiComponentConfig.RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public final PromptPage copy(UiComponentConfig.RemoteImage headerPictograph, UiComponentConfig.RemoteImage idFrontPictograph, UiComponentConfig.RemoteImage idBackPictograph, UiComponentConfig.RemoteImage barcodePdf417Pictograph, UiComponentConfig.RemoteImage passportFrontPictograph, UiComponentConfig.RemoteImage passportSignaturePictograph) {
                    return new PromptPage(headerPictograph, idFrontPictograph, idBackPictograph, barcodePdf417Pictograph, passportFrontPictograph, passportSignaturePictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return AbstractC16544l.m18089b(this.headerPictograph, promptPage.headerPictograph) && AbstractC16544l.m18089b(this.idFrontPictograph, promptPage.idFrontPictograph) && AbstractC16544l.m18089b(this.idBackPictograph, promptPage.idBackPictograph) && AbstractC16544l.m18089b(this.barcodePdf417Pictograph, promptPage.barcodePdf417Pictograph) && AbstractC16544l.m18089b(this.passportFrontPictograph, promptPage.passportFrontPictograph) && AbstractC16544l.m18089b(this.passportSignaturePictograph, promptPage.passportSignaturePictograph);
                }

                public final UiComponentConfig.RemoteImage getBarcodePdf417Pictograph() {
                    return this.barcodePdf417Pictograph;
                }

                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final UiComponentConfig.RemoteImage getIdBackPictograph() {
                    return this.idBackPictograph;
                }

                public final UiComponentConfig.RemoteImage getIdFrontPictograph() {
                    return this.idFrontPictograph;
                }

                public final UiComponentConfig.RemoteImage getPassportFrontPictograph() {
                    return this.passportFrontPictograph;
                }

                public final UiComponentConfig.RemoteImage getPassportSignaturePictograph() {
                    return this.passportSignaturePictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.idFrontPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage3 = this.idBackPictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage5 = this.passportFrontPictograph;
                    int iHashCode5 = (iHashCode4 + (remoteImage5 == null ? 0 : remoteImage5.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    return iHashCode5 + (remoteImage6 != null ? remoteImage6.hashCode() : 0);
                }

                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", idFrontPictograph=" + this.idFrontPictograph + ", idBackPictograph=" + this.idBackPictograph + ", barcodePdf417Pictograph=" + this.barcodePdf417Pictograph + ", passportFrontPictograph=" + this.passportFrontPictograph + ", passportSignaturePictograph=" + this.passportSignaturePictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.idFrontPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage3 = this.idBackPictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage4 = this.barcodePdf417Pictograph;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage5 = this.passportFrontPictograph;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage6 = this.passportSignaturePictograph;
                    if (remoteImage6 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage6.writeToParcel(parcel, flags);
                    }
                }

                public PromptPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, UiComponentConfig.RemoteImage remoteImage6) {
                    this.headerPictograph = remoteImage;
                    this.idFrontPictograph = remoteImage2;
                    this.idBackPictograph = remoteImage3;
                    this.barcodePdf417Pictograph = remoteImage4;
                    this.passportFrontPictograph = remoteImage5;
                    this.passportSignaturePictograph = remoteImage6;
                }

                public /* synthetic */ PromptPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, UiComponentConfig.RemoteImage remoteImage6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5, (i10 & 32) != 0 ? null : remoteImage6);
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u000b¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "headerPictograph", "iconDriversLicense", "iconPassport", "iconNationalId", "iconGovernmentId", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "component3", "component4", "component5", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getHeaderPictograph", "getIconDriversLicense", "getIconPassport", "getIconNationalId", "getIconGovernmentId", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class SelectPage implements Parcelable {
                public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage headerPictograph;
                private final UiComponentConfig.RemoteImage iconDriversLicense;
                private final UiComponentConfig.RemoteImage iconGovernmentId;
                private final UiComponentConfig.RemoteImage iconNationalId;
                private final UiComponentConfig.RemoteImage iconPassport;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<SelectPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SelectPage createFromParcel(Parcel parcel) {
                        return new SelectPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SelectPage[] newArray(int i10) {
                        return new SelectPage[i10];
                    }
                }

                public SelectPage() {
                    this(null, null, null, null, null, 31, null);
                }

                public static /* synthetic */ SelectPage copy$default(SelectPage selectPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = selectPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = selectPage.iconDriversLicense;
                    }
                    UiComponentConfig.RemoteImage remoteImage6 = remoteImage2;
                    if ((i10 & 4) != 0) {
                        remoteImage3 = selectPage.iconPassport;
                    }
                    UiComponentConfig.RemoteImage remoteImage7 = remoteImage3;
                    if ((i10 & 8) != 0) {
                        remoteImage4 = selectPage.iconNationalId;
                    }
                    UiComponentConfig.RemoteImage remoteImage8 = remoteImage4;
                    if ((i10 & 16) != 0) {
                        remoteImage5 = selectPage.iconGovernmentId;
                    }
                    return selectPage.copy(remoteImage, remoteImage6, remoteImage7, remoteImage8, remoteImage5);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final UiComponentConfig.RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final UiComponentConfig.RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final UiComponentConfig.RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                public final SelectPage copy(UiComponentConfig.RemoteImage headerPictograph, UiComponentConfig.RemoteImage iconDriversLicense, UiComponentConfig.RemoteImage iconPassport, UiComponentConfig.RemoteImage iconNationalId, UiComponentConfig.RemoteImage iconGovernmentId) {
                    return new SelectPage(headerPictograph, iconDriversLicense, iconPassport, iconNationalId, iconGovernmentId);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SelectPage)) {
                        return false;
                    }
                    SelectPage selectPage = (SelectPage) other;
                    return AbstractC16544l.m18089b(this.headerPictograph, selectPage.headerPictograph) && AbstractC16544l.m18089b(this.iconDriversLicense, selectPage.iconDriversLicense) && AbstractC16544l.m18089b(this.iconPassport, selectPage.iconPassport) && AbstractC16544l.m18089b(this.iconNationalId, selectPage.iconNationalId) && AbstractC16544l.m18089b(this.iconGovernmentId, selectPage.iconGovernmentId);
                }

                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final UiComponentConfig.RemoteImage getIconDriversLicense() {
                    return this.iconDriversLicense;
                }

                public final UiComponentConfig.RemoteImage getIconGovernmentId() {
                    return this.iconGovernmentId;
                }

                public final UiComponentConfig.RemoteImage getIconNationalId() {
                    return this.iconNationalId;
                }

                public final UiComponentConfig.RemoteImage getIconPassport() {
                    return this.iconPassport;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.iconDriversLicense;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage3 = this.iconPassport;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage4 = this.iconNationalId;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage5 = this.iconGovernmentId;
                    return iHashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                public String toString() {
                    return "SelectPage(headerPictograph=" + this.headerPictograph + ", iconDriversLicense=" + this.iconDriversLicense + ", iconPassport=" + this.iconPassport + ", iconNationalId=" + this.iconNationalId + ", iconGovernmentId=" + this.iconGovernmentId + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.iconDriversLicense;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage3 = this.iconPassport;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage4 = this.iconNationalId;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage5 = this.iconGovernmentId;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, flags);
                    }
                }

                public SelectPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.iconDriversLicense = remoteImage2;
                    this.iconPassport = remoteImage3;
                    this.iconNationalId = remoteImage4;
                    this.iconGovernmentId = remoteImage5;
                }

                public /* synthetic */ SelectPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5);
                }
            }

            public AssetConfig() {
                this(null, null, null, null, null, 31, null);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    selectPage = assetConfig.selectPage;
                }
                if ((i10 & 2) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                PromptPage promptPage2 = promptPage;
                if ((i10 & 4) != 0) {
                    capturePage = assetConfig.capturePage;
                }
                CapturePage capturePage2 = capturePage;
                if ((i10 & 8) != 0) {
                    checkPage = assetConfig.checkPage;
                }
                CheckPage checkPage2 = checkPage;
                if ((i10 & 16) != 0) {
                    pendingPage = assetConfig.pendingPage;
                }
                return assetConfig.copy(selectPage, promptPage2, capturePage2, checkPage2, pendingPage);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final AssetConfig copy(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage) {
                return new AssetConfig(selectPage, promptPage, capturePage, checkPage, pendingPage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return AbstractC16544l.m18089b(this.selectPage, assetConfig.selectPage) && AbstractC16544l.m18089b(this.promptPage, assetConfig.promptPage) && AbstractC16544l.m18089b(this.capturePage, assetConfig.capturePage) && AbstractC16544l.m18089b(this.checkPage, assetConfig.checkPage) && AbstractC16544l.m18089b(this.pendingPage, assetConfig.pendingPage);
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            public int hashCode() {
                SelectPage selectPage = this.selectPage;
                int iHashCode = (selectPage == null ? 0 : selectPage.hashCode()) * 31;
                PromptPage promptPage = this.promptPage;
                int iHashCode2 = (iHashCode + (promptPage == null ? 0 : promptPage.hashCode())) * 31;
                CapturePage capturePage = this.capturePage;
                int iHashCode3 = (iHashCode2 + (capturePage == null ? 0 : capturePage.hashCode())) * 31;
                CheckPage checkPage = this.checkPage;
                int iHashCode4 = (iHashCode3 + (checkPage == null ? 0 : checkPage.hashCode())) * 31;
                PendingPage pendingPage = this.pendingPage;
                return iHashCode4 + (pendingPage != null ? pendingPage.hashCode() : 0);
            }

            public String toString() {
                return "AssetConfig(selectPage=" + this.selectPage + ", promptPage=" + this.promptPage + ", capturePage=" + this.capturePage + ", checkPage=" + this.checkPage + ", pendingPage=" + this.pendingPage + Separators.RPAREN;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                SelectPage selectPage = this.selectPage;
                if (selectPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    selectPage.writeToParcel(parcel, flags);
                }
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, flags);
                }
                CapturePage capturePage = this.capturePage;
                if (capturePage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    capturePage.writeToParcel(parcel, flags);
                }
                CheckPage checkPage = this.checkPage;
                if (checkPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    checkPage.writeToParcel(parcel, flags);
                }
                PendingPage pendingPage = this.pendingPage;
                if (pendingPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    pendingPage.writeToParcel(parcel, flags);
                }
            }

            public AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage) {
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
            }

            public /* synthetic */ AssetConfig(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : selectPage, (i10 & 2) != 0 ? null : promptPage, (i10 & 4) != 0 ? null : capturePage, (i10 & 8) != 0 ? null : checkPage, (i10 & 16) != 0 ? null : pendingPage);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Landroid/os/Parcelable;", "", "isEnabled", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "capturePageConfig", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getExtractTextFromImage", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "getCapturePageConfig", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final /* data */ class AutoClassificationConfig implements Parcelable {
            public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new Creator();
            private final CapturePageConfig capturePageConfig;
            private final Boolean extractTextFromImage;
            private final Boolean isEnabled;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<AutoClassificationConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationConfig createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new AutoClassificationConfig(boolValueOf, boolValueOf2, parcel.readInt() != 0 ? CapturePageConfig.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationConfig[] newArray(int i10) {
                    return new AutoClassificationConfig[i10];
                }
            }

            public AutoClassificationConfig() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ AutoClassificationConfig copy$default(AutoClassificationConfig autoClassificationConfig, Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = autoClassificationConfig.isEnabled;
                }
                if ((i10 & 2) != 0) {
                    bool2 = autoClassificationConfig.extractTextFromImage;
                }
                if ((i10 & 4) != 0) {
                    capturePageConfig = autoClassificationConfig.capturePageConfig;
                }
                return autoClassificationConfig.copy(bool, bool2, capturePageConfig);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Boolean getIsEnabled() {
                return this.isEnabled;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            public final AutoClassificationConfig copy(Boolean isEnabled, Boolean extractTextFromImage, CapturePageConfig capturePageConfig) {
                return new AutoClassificationConfig(isEnabled, extractTextFromImage, capturePageConfig);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoClassificationConfig)) {
                    return false;
                }
                AutoClassificationConfig autoClassificationConfig = (AutoClassificationConfig) other;
                return AbstractC16544l.m18089b(this.isEnabled, autoClassificationConfig.isEnabled) && AbstractC16544l.m18089b(this.extractTextFromImage, autoClassificationConfig.extractTextFromImage) && AbstractC16544l.m18089b(this.capturePageConfig, autoClassificationConfig.capturePageConfig);
            }

            public final CapturePageConfig getCapturePageConfig() {
                return this.capturePageConfig;
            }

            public final Boolean getExtractTextFromImage() {
                return this.extractTextFromImage;
            }

            public int hashCode() {
                Boolean bool = this.isEnabled;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.extractTextFromImage;
                int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                return iHashCode2 + (capturePageConfig != null ? capturePageConfig.hashCode() : 0);
            }

            public final Boolean isEnabled() {
                return this.isEnabled;
            }

            public String toString() {
                return "AutoClassificationConfig(isEnabled=" + this.isEnabled + ", extractTextFromImage=" + this.extractTextFromImage + ", capturePageConfig=" + this.capturePageConfig + Separators.RPAREN;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Boolean bool = this.isEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                Boolean bool2 = this.extractTextFromImage;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool2);
                }
                CapturePageConfig capturePageConfig = this.capturePageConfig;
                if (capturePageConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    capturePageConfig.writeToParcel(parcel, flags);
                }
            }

            public AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig) {
                this.isEnabled = bool;
                this.extractTextFromImage = bool2;
                this.capturePageConfig = capturePageConfig;
            }

            public /* synthetic */ AutoClassificationConfig(Boolean bool, Boolean bool2, CapturePageConfig capturePageConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : capturePageConfig);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "Landroid/os/Parcelable;", "", "unableToClassifyDocumentTitle", "unableToClassifyDocumentContinueButtonText", "idClassRejectedTitle", "idClassRejectedContinueButtonText", "countryInputTitle", "idClassInputTitle", "manualClassificationTitle", "manualClassificationContinueButtonText", "autoClassificationCaptureTipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUnableToClassifyDocumentTitle", "()Ljava/lang/String;", "getUnableToClassifyDocumentContinueButtonText", "getIdClassRejectedTitle", "getIdClassRejectedContinueButtonText", "getCountryInputTitle", "getIdClassInputTitle", "getManualClassificationTitle", "getManualClassificationContinueButtonText", "getAutoClassificationCaptureTipText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class AutoClassificationPage implements Parcelable {
            public static final Parcelable.Creator<AutoClassificationPage> CREATOR = new Creator();
            private final String autoClassificationCaptureTipText;
            private final String countryInputTitle;
            private final String idClassInputTitle;
            private final String idClassRejectedContinueButtonText;
            private final String idClassRejectedTitle;
            private final String manualClassificationContinueButtonText;
            private final String manualClassificationTitle;
            private final String unableToClassifyDocumentContinueButtonText;
            private final String unableToClassifyDocumentTitle;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<AutoClassificationPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationPage createFromParcel(Parcel parcel) {
                    return new AutoClassificationPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AutoClassificationPage[] newArray(int i10) {
                    return new AutoClassificationPage[i10];
                }
            }

            public AutoClassificationPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
                this.unableToClassifyDocumentTitle = str;
                this.unableToClassifyDocumentContinueButtonText = str2;
                this.idClassRejectedTitle = str3;
                this.idClassRejectedContinueButtonText = str4;
                this.countryInputTitle = str5;
                this.idClassInputTitle = str6;
                this.manualClassificationTitle = str7;
                this.manualClassificationContinueButtonText = str8;
                this.autoClassificationCaptureTipText = str9;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getAutoClassificationCaptureTipText() {
                return this.autoClassificationCaptureTipText;
            }

            public final String getCountryInputTitle() {
                return this.countryInputTitle;
            }

            public final String getIdClassInputTitle() {
                return this.idClassInputTitle;
            }

            public final String getIdClassRejectedContinueButtonText() {
                return this.idClassRejectedContinueButtonText;
            }

            public final String getIdClassRejectedTitle() {
                return this.idClassRejectedTitle;
            }

            public final String getManualClassificationContinueButtonText() {
                return this.manualClassificationContinueButtonText;
            }

            public final String getManualClassificationTitle() {
                return this.manualClassificationTitle;
            }

            public final String getUnableToClassifyDocumentContinueButtonText() {
                return this.unableToClassifyDocumentContinueButtonText;
            }

            public final String getUnableToClassifyDocumentTitle() {
                return this.unableToClassifyDocumentTitle;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.unableToClassifyDocumentTitle);
                parcel.writeString(this.unableToClassifyDocumentContinueButtonText);
                parcel.writeString(this.idClassRejectedTitle);
                parcel.writeString(this.idClassRejectedContinueButtonText);
                parcel.writeString(this.countryInputTitle);
                parcel.writeString(this.idClassInputTitle);
                parcel.writeString(this.manualClassificationTitle);
                parcel.writeString(this.manualClassificationContinueButtonText);
                parcel.writeString(this.autoClassificationCaptureTipText);
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "", "(Ljava/lang/String;I)V", "Image", "Video", "Unknown", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum CaptureFileType {
            Image,
            Video,
            Unknown;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, CaptureFileType value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public CaptureFileType fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        return CaptureFileType.Video;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b/\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b2\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b3\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b4\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b5\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b6\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b7\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b8\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b9\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b:\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b;\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b<\u0010(R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b=\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b>\u0010(R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b?\u0010(¨\u0006@"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, "scanFront", "scanBack", "scanPdf417", "scanFrontOrBack", "scanSignature", "capturing", "confirmCapture", "disclaimer", "hintHoldStill", "hintLowLight", "btnHelp", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueBtn", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHintsMobile", "idFrontHelpModalContinueBtn", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHintsMobile", "idBackHelpModalContinueBtn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getScanFront", "getScanBack", "getScanPdf417", "getScanFrontOrBack", "getScanSignature", "getCapturing", "getConfirmCapture", "getDisclaimer", "getHintHoldStill", "getHintLowLight", "getBtnHelp", "getBarcodeHelpModalTitle", "getBarcodeHelpModalPrompt", "getBarcodeHelpModalHints", "getBarcodeHelpModalContinueBtn", "getIdFrontHelpModalTitle", "getIdFrontHelpModalPrompt", "getIdFrontHelpModalHintsMobile", "getIdFrontHelpModalContinueBtn", "getIdBackHelpModalTitle", "getIdBackHelpModalPrompt", "getIdBackHelpModalHintsMobile", "getIdBackHelpModalContinueBtn", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class CapturePage implements Parcelable {
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
            private final String barcodeHelpModalContinueBtn;
            private final String barcodeHelpModalHints;
            private final String barcodeHelpModalPrompt;
            private final String barcodeHelpModalTitle;
            private final String btnHelp;
            private final String capturing;
            private final String confirmCapture;
            private final String disclaimer;
            private final String hintHoldStill;
            private final String hintLowLight;
            private final String idBackHelpModalContinueBtn;
            private final String idBackHelpModalHintsMobile;
            private final String idBackHelpModalPrompt;
            private final String idBackHelpModalTitle;
            private final String idFrontHelpModalContinueBtn;
            private final String idFrontHelpModalHintsMobile;
            private final String idFrontHelpModalPrompt;
            private final String idFrontHelpModalTitle;
            private final String scanBack;
            private final String scanFront;
            private final String scanFrontOrBack;
            private final String scanPdf417;
            private final String scanSignature;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i10) {
                    return new CapturePage[i10];
                }
            }

            public CapturePage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
                this.title = str;
                this.scanFront = str2;
                this.scanBack = str3;
                this.scanPdf417 = str4;
                this.scanFrontOrBack = str5;
                this.scanSignature = str6;
                this.capturing = str7;
                this.confirmCapture = str8;
                this.disclaimer = str9;
                this.hintHoldStill = str10;
                this.hintLowLight = str11;
                this.btnHelp = str12;
                this.barcodeHelpModalTitle = str13;
                this.barcodeHelpModalPrompt = str14;
                this.barcodeHelpModalHints = str15;
                this.barcodeHelpModalContinueBtn = str16;
                this.idFrontHelpModalTitle = str17;
                this.idFrontHelpModalPrompt = str18;
                this.idFrontHelpModalHintsMobile = str19;
                this.idFrontHelpModalContinueBtn = str20;
                this.idBackHelpModalTitle = str21;
                this.idBackHelpModalPrompt = str22;
                this.idBackHelpModalHintsMobile = str23;
                this.idBackHelpModalContinueBtn = str24;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getBarcodeHelpModalContinueBtn() {
                return this.barcodeHelpModalContinueBtn;
            }

            public final String getBarcodeHelpModalHints() {
                return this.barcodeHelpModalHints;
            }

            public final String getBarcodeHelpModalPrompt() {
                return this.barcodeHelpModalPrompt;
            }

            public final String getBarcodeHelpModalTitle() {
                return this.barcodeHelpModalTitle;
            }

            public final String getBtnHelp() {
                return this.btnHelp;
            }

            public final String getCapturing() {
                return this.capturing;
            }

            public final String getConfirmCapture() {
                return this.confirmCapture;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final String getHintHoldStill() {
                return this.hintHoldStill;
            }

            public final String getHintLowLight() {
                return this.hintLowLight;
            }

            public final String getIdBackHelpModalContinueBtn() {
                return this.idBackHelpModalContinueBtn;
            }

            public final String getIdBackHelpModalHintsMobile() {
                return this.idBackHelpModalHintsMobile;
            }

            public final String getIdBackHelpModalPrompt() {
                return this.idBackHelpModalPrompt;
            }

            public final String getIdBackHelpModalTitle() {
                return this.idBackHelpModalTitle;
            }

            public final String getIdFrontHelpModalContinueBtn() {
                return this.idFrontHelpModalContinueBtn;
            }

            public final String getIdFrontHelpModalHintsMobile() {
                return this.idFrontHelpModalHintsMobile;
            }

            public final String getIdFrontHelpModalPrompt() {
                return this.idFrontHelpModalPrompt;
            }

            public final String getIdFrontHelpModalTitle() {
                return this.idFrontHelpModalTitle;
            }

            public final String getScanBack() {
                return this.scanBack;
            }

            public final String getScanFront() {
                return this.scanFront;
            }

            public final String getScanFrontOrBack() {
                return this.scanFrontOrBack;
            }

            public final String getScanPdf417() {
                return this.scanPdf417;
            }

            public final String getScanSignature() {
                return this.scanSignature;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.scanFront);
                parcel.writeString(this.scanBack);
                parcel.writeString(this.scanPdf417);
                parcel.writeString(this.scanFrontOrBack);
                parcel.writeString(this.scanSignature);
                parcel.writeString(this.capturing);
                parcel.writeString(this.confirmCapture);
                parcel.writeString(this.disclaimer);
                parcel.writeString(this.hintHoldStill);
                parcel.writeString(this.hintLowLight);
                parcel.writeString(this.btnHelp);
                parcel.writeString(this.barcodeHelpModalTitle);
                parcel.writeString(this.barcodeHelpModalPrompt);
                parcel.writeString(this.barcodeHelpModalHints);
                parcel.writeString(this.barcodeHelpModalContinueBtn);
                parcel.writeString(this.idFrontHelpModalTitle);
                parcel.writeString(this.idFrontHelpModalPrompt);
                parcel.writeString(this.idFrontHelpModalHintsMobile);
                parcel.writeString(this.idFrontHelpModalContinueBtn);
                parcel.writeString(this.idBackHelpModalTitle);
                parcel.writeString(this.idBackHelpModalPrompt);
                parcel.writeString(this.idBackHelpModalHintsMobile);
                parcel.writeString(this.idBackHelpModalContinueBtn);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "Landroid/os/Parcelable;", "", "buttonSubmit", "buttonRetake", "titleConfirmCapture", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonSubmit", "()Ljava/lang/String;", "getButtonRetake", "getTitleConfirmCapture", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class CheckPage implements Parcelable {
            public static final Parcelable.Creator<CheckPage> CREATOR = new Creator();
            private final String buttonRetake;
            private final String buttonSubmit;
            private final String titleConfirmCapture;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<CheckPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage createFromParcel(Parcel parcel) {
                    return new CheckPage(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPage[] newArray(int i10) {
                    return new CheckPage[i10];
                }
            }

            public CheckPage(@InterfaceC11468o(name = "btnSubmit") String str, @InterfaceC11468o(name = "btnRetake") String str2, String str3) {
                this.buttonSubmit = str;
                this.buttonRetake = str2;
                this.titleConfirmCapture = str3;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getButtonRetake() {
                return this.buttonRetake;
            }

            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getTitleConfirmCapture() {
                return this.titleConfirmCapture;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.buttonSubmit);
                parcel.writeString(this.buttonRetake);
                parcel.writeString(this.titleConfirmCapture);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001BÝ\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010$R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010#\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b,\u0010(R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\b-\u0010(R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010/R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010)\u001a\u0004\bB\u0010(R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bD\u00102¨\u0006E"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "", "idclasses", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "backStepEnabled", "", "cancelButtonEnabled", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "enabledCaptureOptionsNativeMobile", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "imageCaptureCount", "", "nativeMobileCameraManualCaptureDelayMs", "", "fieldKeyDocument", "", "fieldKeyIdclass", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "shouldSkipReviewScreen", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoSessionJwt", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "audioEnabled", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/Boolean;)V", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "getAudioEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAutoClassificationConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "getBackStepEnabled", "getCancelButtonEnabled", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "getEnabledCaptureOptionsNativeMobile", "getFieldKeyDocument", "()Ljava/lang/String;", "getFieldKeyIdclass", "getIdclasses", "getImageCaptureCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocalizationOverrides", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "getNativeMobileCameraManualCaptureDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getReviewCaptureButtonsAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "getShouldSkipReviewScreen", "getVideoCaptureMethods", "getVideoSessionJwt", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Config {
            private final AssetConfig assets;
            private final Boolean audioEnabled;
            private final AutoClassificationConfig autoClassificationConfig;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<CaptureFileType> enabledCaptureFileTypes;
            private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;
            private final String fieldKeyDocument;
            private final String fieldKeyIdclass;
            private final List<C12893Id> idclasses;
            private final Integer imageCaptureCount;
            private final List<LocalizationOverride> localizationOverrides;
            private final Localizations localizations;
            private final Long nativeMobileCameraManualCaptureDelayMs;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final StyleElements.Axis reviewCaptureButtonsAxis;
            private final Boolean shouldSkipReviewScreen;
            private final List<VideoCaptureMethod> videoCaptureMethods;
            private final String videoSessionJwt;

            /* JADX WARN: Multi-variable type inference failed */
            public Config(List<C12893Id> list, Boolean bool, Boolean bool2, Localizations localizations, List<? extends CaptureOptionNativeMobile> list2, Integer num, Long l4, String str, String str2, List<LocalizationOverride> list3, Boolean bool3, List<? extends CaptureFileType> list4, List<? extends VideoCaptureMethod> list5, @InterfaceC11468o(name = "videoSessionJWT") String str3, AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, Boolean bool4) {
                this.idclasses = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.enabledCaptureOptionsNativeMobile = list2;
                this.imageCaptureCount = num;
                this.nativeMobileCameraManualCaptureDelayMs = l4;
                this.fieldKeyDocument = str;
                this.fieldKeyIdclass = str2;
                this.localizationOverrides = list3;
                this.shouldSkipReviewScreen = bool3;
                this.enabledCaptureFileTypes = list4;
                this.videoCaptureMethods = list5;
                this.videoSessionJwt = str3;
                this.assets = assetConfig;
                this.autoClassificationConfig = autoClassificationConfig;
                this.reviewCaptureButtonsAxis = axis;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            public final AutoClassificationConfig getAutoClassificationConfig() {
                return this.autoClassificationConfig;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            public final List<CaptureOptionNativeMobile> getEnabledCaptureOptionsNativeMobile() {
                return this.enabledCaptureOptionsNativeMobile;
            }

            public final String getFieldKeyDocument() {
                return this.fieldKeyDocument;
            }

            public final String getFieldKeyIdclass() {
                return this.fieldKeyIdclass;
            }

            public final List<C12893Id> getIdclasses() {
                return this.idclasses;
            }

            public final Integer getImageCaptureCount() {
                return this.imageCaptureCount;
            }

            public final List<LocalizationOverride> getLocalizationOverrides() {
                return this.localizationOverrides;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final Long getNativeMobileCameraManualCaptureDelayMs() {
                return this.nativeMobileCameraManualCaptureDelayMs;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final StyleElements.Axis getReviewCaptureButtonsAxis() {
                return this.reviewCaptureButtonsAxis;
            }

            public final Boolean getShouldSkipReviewScreen() {
                return this.shouldSkipReviewScreen;
            }

            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }
        }

        @Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B=\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR!\u0010%\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0011¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "Landroid/os/Parcelable;", "", "", "countryCode", "idClass", "side", "page", SubscriberAttributeKt.JSON_NAME_KEY, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "compareTo", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;)I", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "getIdClass", "getSide", "getPage", "getKey", "getText", "precedenceScore$delegate", "Lmm/i;", "getPrecedenceScore", "getPrecedenceScore$annotations", "()V", "precedenceScore", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final class LocalizationOverride implements Parcelable, Comparable<LocalizationOverride> {
            public static final Parcelable.Creator<LocalizationOverride> CREATOR = new Creator();
            private final String countryCode;
            private final String idClass;
            private final String key;
            private final String page;

            /* JADX INFO: renamed from: precedenceScore$delegate, reason: from kotlin metadata */
            private final InterfaceC17306i precedenceScore = AbstractC9227W.m9800c(new NextStep$GovernmentId$LocalizationOverride$precedenceScore$2(this));
            private final String side;
            private final String text;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<LocalizationOverride> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LocalizationOverride createFromParcel(Parcel parcel) {
                    return new LocalizationOverride(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LocalizationOverride[] newArray(int i10) {
                    return new LocalizationOverride[i10];
                }
            }

            public LocalizationOverride(String str, String str2, String str3, String str4, String str5, String str6) {
                this.countryCode = str;
                this.idClass = str2;
                this.side = str3;
                this.page = str4;
                this.key = str5;
                this.text = str6;
            }

            public static /* synthetic */ void getPrecedenceScore$annotations() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getCountryCode() {
                return this.countryCode;
            }

            public final String getIdClass() {
                return this.idClass;
            }

            public final String getKey() {
                return this.key;
            }

            public final String getPage() {
                return this.page;
            }

            public final int getPrecedenceScore() {
                return ((Number) this.precedenceScore.getValue()).intValue();
            }

            public final String getSide() {
                return this.side;
            }

            public final String getText() {
                return this.text;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.countryCode);
                parcel.writeString(this.idClass);
                parcel.writeString(this.side);
                parcel.writeString(this.page);
                parcel.writeString(this.key);
                parcel.writeString(this.text);
            }

            @Override // java.lang.Comparable
            public int compareTo(LocalizationOverride other) {
                return AbstractC16544l.m18096i(getPrecedenceScore(), other.getPrecedenceScore());
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109¨\u0006:"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "selectPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "checkPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "requestPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "reviewUploadPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "autoClassificationPage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "getSelectPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "getCheckPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "getRequestPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "getReviewUploadPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "getAutoClassificationPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final AutoClassificationPage autoClassificationPage;
            private final CancelDialog cancelDialog;
            private final CapturePage capturePage;
            private final CheckPage checkPage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;
            private final RequestPage requestPage;
            private final ReviewUploadPage reviewUploadPage;
            private final SelectPage selectPage;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    return new Localizations(SelectPage.CREATOR.createFromParcel(parcel), PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), CheckPage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), RequestPage.CREATOR.createFromParcel(parcel), ReviewUploadPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AutoClassificationPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(SelectPage selectPage, PromptPage promptPage, CapturePage capturePage, CheckPage checkPage, PendingPage pendingPage, RequestPage requestPage, ReviewUploadPage reviewUploadPage, CancelDialog cancelDialog, AutoClassificationPage autoClassificationPage) {
                this.selectPage = selectPage;
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.checkPage = checkPage;
                this.pendingPage = pendingPage;
                this.requestPage = requestPage;
                this.reviewUploadPage = reviewUploadPage;
                this.cancelDialog = cancelDialog;
                this.autoClassificationPage = autoClassificationPage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final AutoClassificationPage getAutoClassificationPage() {
                return this.autoClassificationPage;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final CheckPage getCheckPage() {
                return this.checkPage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final RequestPage getRequestPage() {
                return this.requestPage;
            }

            public final ReviewUploadPage getReviewUploadPage() {
                return this.reviewUploadPage;
            }

            public final SelectPage getSelectPage() {
                return this.selectPage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                this.selectPage.writeToParcel(parcel, flags);
                this.promptPage.writeToParcel(parcel, flags);
                this.capturePage.writeToParcel(parcel, flags);
                this.checkPage.writeToParcel(parcel, flags);
                this.pendingPage.writeToParcel(parcel, flags);
                this.requestPage.writeToParcel(parcel, flags);
                this.reviewUploadPage.writeToParcel(parcel, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, flags);
                }
                AutoClassificationPage autoClassificationPage = this.autoClassificationPage;
                if (autoClassificationPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    autoClassificationPage.writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "", "(Ljava/lang/String;I)V", "REQUIRED", "OPTIONAL", "REQUIRED_IF_SUPPORTED", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum PassportNfcOption {
            REQUIRED,
            OPTIONAL,
            REQUIRED_IF_SUPPORTED;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PassportNfcOption;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, PassportNfcOption value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public PassportNfcOption fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, ParameterNames.REQUIRED)) {
                        return PassportNfcOption.REQUIRED;
                    }
                    if (AbstractC16544l.m18089b(objM12871r0, ParameterNames.OPTIONAL)) {
                        return PassportNfcOption.OPTIONAL;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "required_if_supported") ? PassportNfcOption.REQUIRED_IF_SUPPORTED : PassportNfcOption.OPTIONAL;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            public PendingPage(String str, String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "Landroid/os/Parcelable;", "", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCameraPermissionsTitle", "()Ljava/lang/String;", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsBtnCancel", "getMicrophonePermissionsBtnContinueMobile", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String microphonePermissionsBtnCancel;
            private final String microphonePermissionsBtnContinueMobile;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            public PromptPage(String str, String str2, @InterfaceC11468o(name = "cameraPermissionsBtnContinueMobile") String str3, @InterfaceC11468o(name = "cameraPermissionsBtnCancel") String str4, String str5, String str6, String str7, String str8) {
                this.cameraPermissionsTitle = str;
                this.cameraPermissionsPrompt = str2;
                this.cameraPermissionsAllowButtonText = str3;
                this.cameraPermissionsCancelButtonText = str4;
                this.microphonePermissionsBtnCancel = str5;
                this.microphonePermissionsBtnContinueMobile = str6;
                this.microphonePermissionsPrompt = str7;
                this.microphonePermissionsTitle = str8;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
                parcel.writeString(this.microphonePermissionsBtnCancel);
                parcel.writeString(this.microphonePermissionsBtnContinueMobile);
                parcel.writeString(this.microphonePermissionsPrompt);
                parcel.writeString(this.microphonePermissionsTitle);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Landroid/os/Parcelable;", "", "titleFront", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "choosePhotoButtonText", "liveUploadButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitleFront", "()Ljava/lang/String;", "getTitleBack", "getTitlePdf417", "getTitlePassportSignature", "getDescriptionFront", "getDescriptionBack", "getDescriptionPdf417", "getDescriptionPassportSignature", "getChoosePhotoButtonText", "getLiveUploadButtonText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class RequestPage implements Parcelable {
            public static final Parcelable.Creator<RequestPage> CREATOR = new Creator();
            private final String choosePhotoButtonText;
            private final String descriptionBack;
            private final String descriptionFront;
            private final String descriptionPassportSignature;
            private final String descriptionPdf417;
            private final String liveUploadButtonText;
            private final String titleBack;
            private final String titleFront;
            private final String titlePassportSignature;
            private final String titlePdf417;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<RequestPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPage createFromParcel(Parcel parcel) {
                    return new RequestPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPage[] newArray(int i10) {
                    return new RequestPage[i10];
                }
            }

            public RequestPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
                this.titleFront = str;
                this.titleBack = str2;
                this.titlePdf417 = str3;
                this.titlePassportSignature = str4;
                this.descriptionFront = str5;
                this.descriptionBack = str6;
                this.descriptionPdf417 = str7;
                this.descriptionPassportSignature = str8;
                this.choosePhotoButtonText = str9;
                this.liveUploadButtonText = str10;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getChoosePhotoButtonText() {
                return this.choosePhotoButtonText;
            }

            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            public final String getLiveUploadButtonText() {
                return this.liveUploadButtonText;
            }

            public final String getTitleBack() {
                return this.titleBack;
            }

            public final String getTitleFront() {
                return this.titleFront;
            }

            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.titleFront);
                parcel.writeString(this.titleBack);
                parcel.writeString(this.titlePdf417);
                parcel.writeString(this.titlePassportSignature);
                parcel.writeString(this.descriptionFront);
                parcel.writeString(this.descriptionBack);
                parcel.writeString(this.descriptionPdf417);
                parcel.writeString(this.descriptionPassportSignature);
                parcel.writeString(this.choosePhotoButtonText);
                parcel.writeString(this.liveUploadButtonText);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "Landroid/os/Parcelable;", "", "titleFront", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "confirmButtonText", "chooseAnotherButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitleFront", "()Ljava/lang/String;", "getTitleBack", "getTitlePdf417", "getTitlePassportSignature", "getDescriptionFront", "getDescriptionBack", "getDescriptionPdf417", "getDescriptionPassportSignature", "getConfirmButtonText", "getChooseAnotherButtonText", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class ReviewUploadPage implements Parcelable {
            public static final Parcelable.Creator<ReviewUploadPage> CREATOR = new Creator();
            private final String chooseAnotherButtonText;
            private final String confirmButtonText;
            private final String descriptionBack;
            private final String descriptionFront;
            private final String descriptionPassportSignature;
            private final String descriptionPdf417;
            private final String titleBack;
            private final String titleFront;
            private final String titlePassportSignature;
            private final String titlePdf417;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<ReviewUploadPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewUploadPage createFromParcel(Parcel parcel) {
                    return new ReviewUploadPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReviewUploadPage[] newArray(int i10) {
                    return new ReviewUploadPage[i10];
                }
            }

            public ReviewUploadPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
                this.titleFront = str;
                this.titleBack = str2;
                this.titlePdf417 = str3;
                this.titlePassportSignature = str4;
                this.descriptionFront = str5;
                this.descriptionBack = str6;
                this.descriptionPdf417 = str7;
                this.descriptionPassportSignature = str8;
                this.confirmButtonText = str9;
                this.chooseAnotherButtonText = str10;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getChooseAnotherButtonText() {
                return this.chooseAnotherButtonText;
            }

            public final String getConfirmButtonText() {
                return this.confirmButtonText;
            }

            public final String getDescriptionBack() {
                return this.descriptionBack;
            }

            public final String getDescriptionFront() {
                return this.descriptionFront;
            }

            public final String getDescriptionPassportSignature() {
                return this.descriptionPassportSignature;
            }

            public final String getDescriptionPdf417() {
                return this.descriptionPdf417;
            }

            public final String getTitleBack() {
                return this.titleBack;
            }

            public final String getTitleFront() {
                return this.titleFront;
            }

            public final String getTitlePassportSignature() {
                return this.titlePassportSignature;
            }

            public final String getTitlePdf417() {
                return this.titlePdf417;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.titleFront);
                parcel.writeString(this.titleBack);
                parcel.writeString(this.titlePdf417);
                parcel.writeString(this.titlePassportSignature);
                parcel.writeString(this.descriptionFront);
                parcel.writeString(this.descriptionBack);
                parcel.writeString(this.descriptionPdf417);
                parcel.writeString(this.descriptionPassportSignature);
                parcel.writeString(this.confirmButtonText);
                parcel.writeString(this.chooseAnotherButtonText);
            }
        }

        @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, SDPKeywords.PROMPT, "choose", "disclaimer", "", "idClassToName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPrompt", "getChoose", "getDisclaimer", "Ljava/util/Map;", "getIdClassToName", "()Ljava/util/Map;", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public static final class SelectPage implements Parcelable {
            private final String choose;
            private final String disclaimer;
            private final Map<String, String> idClassToName;
            private final String prompt;
            private final String title;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<SelectPage> CREATOR = new Creator();

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "<init>", "()V", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;)V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, SelectPage value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public SelectPage fromJson(AbstractC11477x reader) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    reader.mo12814e();
                    String strMo12820x = "";
                    String strMo12820x2 = strMo12820x;
                    String strM8384b = null;
                    String strMo12820x3 = strMo12820x2;
                    while (reader.hasNext()) {
                        String strMo12813a0 = reader.mo12813a0();
                        if (strMo12813a0 != null) {
                            int iHashCode = strMo12813a0.hashCode();
                            if (iHashCode != -979805852) {
                                if (iHashCode != 110371416) {
                                    if (iHashCode != 432371099) {
                                        if (iHashCode == 1282023341 && strMo12813a0.equals("optionNotice")) {
                                            strMo12820x2 = reader.mo12820x();
                                        }
                                    } else if (strMo12813a0.equals("disclaimer")) {
                                        strM8384b = AbstractC8033Y5.m8384b(reader);
                                    }
                                } else if (strMo12813a0.equals(UiComponentConfig.Title.type)) {
                                    strMo12820x3 = reader.mo12820x();
                                }
                            } else if (strMo12813a0.equals(SDPKeywords.PROMPT)) {
                                strMo12820x = reader.mo12820x();
                            }
                        }
                        if (reader.hasNext() && reader.mo12805S() == EnumC11476w.f34691r0) {
                            linkedHashMap.put(strMo12813a0, reader.mo12820x());
                        } else {
                            reader.mo12800D();
                        }
                    }
                    reader.mo12818m();
                    return new SelectPage(strMo12820x3, strMo12820x, strMo12820x2, strM8384b, linkedHashMap);
                }
            }

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<SelectPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SelectPage createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    int i10 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new SelectPage(string, string2, string3, string4, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SelectPage[] newArray(int i10) {
                    return new SelectPage[i10];
                }
            }

            public SelectPage(String str, String str2, String str3, String str4, Map<String, String> map) {
                this.title = str;
                this.prompt = str2;
                this.choose = str3;
                this.disclaimer = str4;
                this.idClassToName = map;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getChoose() {
                return this.choose;
            }

            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final Map<String, String> getIdClassToName() {
                return this.idClassToName;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.choose);
                parcel.writeString(this.disclaimer);
                Map<String, String> map = this.idClassToName;
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum VideoCaptureMethod {
            Stream,
            Upload,
            None;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, VideoCaptureMethod value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public VideoCaptureMethod fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, "stream")) {
                        return VideoCaptureMethod.Stream;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public GovernmentId(String str, Config config, StepStyles.GovernmentIdStepStyle governmentIdStepStyle) {
            super(str, null);
            this.name = str;
            this.config = config;
            this.styles = governmentIdStepStyle;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", DiagnosticsEntry.NAME_KEY, "", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStyle;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStyle;)V", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "getName", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$SelfieStepStyle;", "AssetConfig", "CaptureFileType", "CaptureMethod", "CapturePage", "Config", "Localizations", "PendingPage", "PromptPage", "SelfiePose", "VideoCaptureMethod", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class Selfie extends NextStep {
        private final Config config;
        private final String name;
        private final StepStyles.SelfieStepStyle styles;

        @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "recordPage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "getPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "getRecordPage", "PromptPage", "RecordPage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = true)
        public static final /* data */ class AssetConfig implements Parcelable {
            public static final Parcelable.Creator<AssetConfig> CREATOR = new Creator();
            private final PromptPage promptPage;
            private final RecordPage recordPage;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<AssetConfig> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig createFromParcel(Parcel parcel) {
                    return new AssetConfig(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RecordPage.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AssetConfig[] newArray(int i10) {
                    return new AssetConfig[i10];
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u000b¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "headerPictograph", "selfiePictograph", "selfieCenterPictograph", "selfieLeftPictograph", "selfieRightPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "component3", "component4", "component5", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getHeaderPictograph", "getSelfiePictograph", "getSelfieCenterPictograph", "getSelfieLeftPictograph", "getSelfieRightPictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class PromptPage implements Parcelable {
                public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage headerPictograph;
                private final UiComponentConfig.RemoteImage selfieCenterPictograph;
                private final UiComponentConfig.RemoteImage selfieLeftPictograph;
                private final UiComponentConfig.RemoteImage selfiePictograph;
                private final UiComponentConfig.RemoteImage selfieRightPictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<PromptPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage createFromParcel(Parcel parcel) {
                        return new PromptPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final PromptPage[] newArray(int i10) {
                        return new PromptPage[i10];
                    }
                }

                public PromptPage() {
                    this(null, null, null, null, null, 31, null);
                }

                public static /* synthetic */ PromptPage copy$default(PromptPage promptPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = promptPage.headerPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = promptPage.selfiePictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage6 = remoteImage2;
                    if ((i10 & 4) != 0) {
                        remoteImage3 = promptPage.selfieCenterPictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage7 = remoteImage3;
                    if ((i10 & 8) != 0) {
                        remoteImage4 = promptPage.selfieLeftPictograph;
                    }
                    UiComponentConfig.RemoteImage remoteImage8 = remoteImage4;
                    if ((i10 & 16) != 0) {
                        remoteImage5 = promptPage.selfieRightPictograph;
                    }
                    return promptPage.copy(remoteImage, remoteImage6, remoteImage7, remoteImage8, remoteImage5);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final UiComponentConfig.RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final UiComponentConfig.RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final UiComponentConfig.RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public final PromptPage copy(UiComponentConfig.RemoteImage headerPictograph, UiComponentConfig.RemoteImage selfiePictograph, UiComponentConfig.RemoteImage selfieCenterPictograph, UiComponentConfig.RemoteImage selfieLeftPictograph, UiComponentConfig.RemoteImage selfieRightPictograph) {
                    return new PromptPage(headerPictograph, selfiePictograph, selfieCenterPictograph, selfieLeftPictograph, selfieRightPictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PromptPage)) {
                        return false;
                    }
                    PromptPage promptPage = (PromptPage) other;
                    return AbstractC16544l.m18089b(this.headerPictograph, promptPage.headerPictograph) && AbstractC16544l.m18089b(this.selfiePictograph, promptPage.selfiePictograph) && AbstractC16544l.m18089b(this.selfieCenterPictograph, promptPage.selfieCenterPictograph) && AbstractC16544l.m18089b(this.selfieLeftPictograph, promptPage.selfieLeftPictograph) && AbstractC16544l.m18089b(this.selfieRightPictograph, promptPage.selfieRightPictograph);
                }

                public final UiComponentConfig.RemoteImage getHeaderPictograph() {
                    return this.headerPictograph;
                }

                public final UiComponentConfig.RemoteImage getSelfieCenterPictograph() {
                    return this.selfieCenterPictograph;
                }

                public final UiComponentConfig.RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                public final UiComponentConfig.RemoteImage getSelfiePictograph() {
                    return this.selfiePictograph;
                }

                public final UiComponentConfig.RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.selfiePictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    int iHashCode3 = (iHashCode2 + (remoteImage3 == null ? 0 : remoteImage3.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    int iHashCode4 = (iHashCode3 + (remoteImage4 == null ? 0 : remoteImage4.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage5 = this.selfieRightPictograph;
                    return iHashCode4 + (remoteImage5 != null ? remoteImage5.hashCode() : 0);
                }

                public String toString() {
                    return "PromptPage(headerPictograph=" + this.headerPictograph + ", selfiePictograph=" + this.selfiePictograph + ", selfieCenterPictograph=" + this.selfieCenterPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.headerPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.selfiePictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage3 = this.selfieCenterPictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage4 = this.selfieLeftPictograph;
                    if (remoteImage4 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage4.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage5 = this.selfieRightPictograph;
                    if (remoteImage5 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage5.writeToParcel(parcel, flags);
                    }
                }

                public PromptPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5) {
                    this.headerPictograph = remoteImage;
                    this.selfiePictograph = remoteImage2;
                    this.selfieCenterPictograph = remoteImage3;
                    this.selfieLeftPictograph = remoteImage4;
                    this.selfieRightPictograph = remoteImage5;
                }

                public /* synthetic */ PromptPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, UiComponentConfig.RemoteImage remoteImage4, UiComponentConfig.RemoteImage remoteImage5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3, (i10 & 8) != 0 ? null : remoteImage4, (i10 & 16) != 0 ? null : remoteImage5);
                }
            }

            @InterfaceC11472s(generateAdapter = true)
            @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "loadingPictograph", "selfieLeftPictograph", "selfieRightPictograph", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "component2", "component3", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage;", "getLoadingPictograph", "getSelfieLeftPictograph", "getSelfieRightPictograph", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final /* data */ class RecordPage implements Parcelable {
                public static final Parcelable.Creator<RecordPage> CREATOR = new Creator();
                private final UiComponentConfig.RemoteImage loadingPictograph;
                private final UiComponentConfig.RemoteImage selfieLeftPictograph;
                private final UiComponentConfig.RemoteImage selfieRightPictograph;

                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public static final class Creator implements Parcelable.Creator<RecordPage> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecordPage createFromParcel(Parcel parcel) {
                        return new RecordPage(parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiComponentConfig.RemoteImage.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final RecordPage[] newArray(int i10) {
                        return new RecordPage[i10];
                    }
                }

                public RecordPage() {
                    this(null, null, null, 7, null);
                }

                public static /* synthetic */ RecordPage copy$default(RecordPage recordPage, UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        remoteImage = recordPage.loadingPictograph;
                    }
                    if ((i10 & 2) != 0) {
                        remoteImage2 = recordPage.selfieLeftPictograph;
                    }
                    if ((i10 & 4) != 0) {
                        remoteImage3 = recordPage.selfieRightPictograph;
                    }
                    return recordPage.copy(remoteImage, remoteImage2, remoteImage3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final UiComponentConfig.RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final UiComponentConfig.RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final UiComponentConfig.RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public final RecordPage copy(UiComponentConfig.RemoteImage loadingPictograph, UiComponentConfig.RemoteImage selfieLeftPictograph, UiComponentConfig.RemoteImage selfieRightPictograph) {
                    return new RecordPage(loadingPictograph, selfieLeftPictograph, selfieRightPictograph);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RecordPage)) {
                        return false;
                    }
                    RecordPage recordPage = (RecordPage) other;
                    return AbstractC16544l.m18089b(this.loadingPictograph, recordPage.loadingPictograph) && AbstractC16544l.m18089b(this.selfieLeftPictograph, recordPage.selfieLeftPictograph) && AbstractC16544l.m18089b(this.selfieRightPictograph, recordPage.selfieRightPictograph);
                }

                public final UiComponentConfig.RemoteImage getLoadingPictograph() {
                    return this.loadingPictograph;
                }

                public final UiComponentConfig.RemoteImage getSelfieLeftPictograph() {
                    return this.selfieLeftPictograph;
                }

                public final UiComponentConfig.RemoteImage getSelfieRightPictograph() {
                    return this.selfieRightPictograph;
                }

                public int hashCode() {
                    UiComponentConfig.RemoteImage remoteImage = this.loadingPictograph;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    UiComponentConfig.RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    int iHashCode2 = (iHashCode + (remoteImage2 == null ? 0 : remoteImage2.hashCode())) * 31;
                    UiComponentConfig.RemoteImage remoteImage3 = this.selfieRightPictograph;
                    return iHashCode2 + (remoteImage3 != null ? remoteImage3.hashCode() : 0);
                }

                public String toString() {
                    return "RecordPage(loadingPictograph=" + this.loadingPictograph + ", selfieLeftPictograph=" + this.selfieLeftPictograph + ", selfieRightPictograph=" + this.selfieRightPictograph + Separators.RPAREN;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    UiComponentConfig.RemoteImage remoteImage = this.loadingPictograph;
                    if (remoteImage == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage2 = this.selfieLeftPictograph;
                    if (remoteImage2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage2.writeToParcel(parcel, flags);
                    }
                    UiComponentConfig.RemoteImage remoteImage3 = this.selfieRightPictograph;
                    if (remoteImage3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        remoteImage3.writeToParcel(parcel, flags);
                    }
                }

                public RecordPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3) {
                    this.loadingPictograph = remoteImage;
                    this.selfieLeftPictograph = remoteImage2;
                    this.selfieRightPictograph = remoteImage3;
                }

                public /* synthetic */ RecordPage(UiComponentConfig.RemoteImage remoteImage, UiComponentConfig.RemoteImage remoteImage2, UiComponentConfig.RemoteImage remoteImage3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? null : remoteImage, (i10 & 2) != 0 ? null : remoteImage2, (i10 & 4) != 0 ? null : remoteImage3);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AssetConfig() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AssetConfig copy$default(AssetConfig assetConfig, PromptPage promptPage, RecordPage recordPage, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    promptPage = assetConfig.promptPage;
                }
                if ((i10 & 2) != 0) {
                    recordPage = assetConfig.recordPage;
                }
                return assetConfig.copy(promptPage, recordPage);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            public final AssetConfig copy(PromptPage promptPage, RecordPage recordPage) {
                return new AssetConfig(promptPage, recordPage);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AssetConfig)) {
                    return false;
                }
                AssetConfig assetConfig = (AssetConfig) other;
                return AbstractC16544l.m18089b(this.promptPage, assetConfig.promptPage) && AbstractC16544l.m18089b(this.recordPage, assetConfig.recordPage);
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            public final RecordPage getRecordPage() {
                return this.recordPage;
            }

            public int hashCode() {
                PromptPage promptPage = this.promptPage;
                int iHashCode = (promptPage == null ? 0 : promptPage.hashCode()) * 31;
                RecordPage recordPage = this.recordPage;
                return iHashCode + (recordPage != null ? recordPage.hashCode() : 0);
            }

            public String toString() {
                return "AssetConfig(promptPage=" + this.promptPage + ", recordPage=" + this.recordPage + Separators.RPAREN;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, flags);
                }
                RecordPage recordPage = this.recordPage;
                if (recordPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    recordPage.writeToParcel(parcel, flags);
                }
            }

            public AssetConfig(PromptPage promptPage, RecordPage recordPage) {
                this.promptPage = promptPage;
                this.recordPage = recordPage;
            }

            public /* synthetic */ AssetConfig(PromptPage promptPage, RecordPage recordPage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : promptPage, (i10 & 2) != 0 ? null : recordPage);
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "", "(Ljava/lang/String;I)V", "Image", "Video", "Unknown", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum CaptureFileType {
            Image,
            Video,
            Unknown;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, CaptureFileType value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public CaptureFileType fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        return CaptureFileType.Video;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "image") ? CaptureFileType.Image : CaptureFileType.Unknown;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "", "(Ljava/lang/String;I)V", "ONLY_CENTER", "PROFILE_AND_CENTER", "CONFIGURABLE_POSES", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum CaptureMethod {
            ONLY_CENTER,
            PROFILE_AND_CENTER,
            CONFIGURABLE_POSES;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCenter", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSelfieHintTakePhoto", "getSelfieHintCenterFace", "getSelfieHintFaceTooClose", "getSelfieHintFaceTooFar", "getSelfieHintMultipleFaces", "getSelfieHintFaceIncomplete", "getSelfieHintPoseNotCenter", "getSelfieHintLookLeft", "getSelfieHintLookRight", "getSelfieHintHoldStill", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class CapturePage implements Parcelable {
            public static final Parcelable.Creator<CapturePage> CREATOR = new Creator();
            private final String selfieHintCenterFace;
            private final String selfieHintFaceIncomplete;
            private final String selfieHintFaceTooClose;
            private final String selfieHintFaceTooFar;
            private final String selfieHintHoldStill;
            private final String selfieHintLookLeft;
            private final String selfieHintLookRight;
            private final String selfieHintMultipleFaces;
            private final String selfieHintPoseNotCenter;
            private final String selfieHintTakePhoto;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<CapturePage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage createFromParcel(Parcel parcel) {
                    return new CapturePage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CapturePage[] newArray(int i10) {
                    return new CapturePage[i10];
                }
            }

            public CapturePage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
                this.title = str;
                this.selfieHintTakePhoto = str2;
                this.selfieHintCenterFace = str3;
                this.selfieHintFaceTooClose = str4;
                this.selfieHintFaceTooFar = str5;
                this.selfieHintMultipleFaces = str6;
                this.selfieHintFaceIncomplete = str7;
                this.selfieHintPoseNotCenter = str8;
                this.selfieHintLookLeft = str9;
                this.selfieHintLookRight = str10;
                this.selfieHintHoldStill = str11;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            public final String getSelfieHintPoseNotCenter() {
                return this.selfieHintPoseNotCenter;
            }

            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.selfieHintTakePhoto);
                parcel.writeString(this.selfieHintCenterFace);
                parcel.writeString(this.selfieHintFaceTooClose);
                parcel.writeString(this.selfieHintFaceTooFar);
                parcel.writeString(this.selfieHintMultipleFaces);
                parcel.writeString(this.selfieHintFaceIncomplete);
                parcel.writeString(this.selfieHintPoseNotCenter);
                parcel.writeString(this.selfieHintLookLeft);
                parcel.writeString(this.selfieHintLookRight);
                parcel.writeString(this.selfieHintHoldStill);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b/\u0010\u001eR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%¨\u00062"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "", "selfieType", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "backStepEnabled", "", "cancelButtonEnabled", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "fieldKeySelfie", "", "requireStrictSelfieCapture", "skipPromptPage", "enabledCaptureFileTypes", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "assets", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "videoSessionJwt", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "audioEnabled", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/Boolean;)V", "getAssets", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "getAudioEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackStepEnabled", "getCancelButtonEnabled", "getEnabledCaptureFileTypes", "()Ljava/util/List;", "getFieldKeySelfie", "()Ljava/lang/String;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "getOrderedPoses", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "getRequireStrictSelfieCapture", "()Z", "getSelfieType", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "getSkipPromptPage", "getVideoCaptureMethods", "getVideoSessionJwt", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Config {
            private final AssetConfig assets;
            private final Boolean audioEnabled;
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<CaptureFileType> enabledCaptureFileTypes;
            private final String fieldKeySelfie;
            private final Localizations localizations;
            private final List<SelfiePose> orderedPoses;
            private final PendingPageTextPosition pendingPageTextVerticalPosition;
            private final boolean requireStrictSelfieCapture;
            private final CaptureMethod selfieType;
            private final Boolean skipPromptPage;
            private final List<VideoCaptureMethod> videoCaptureMethods;
            private final String videoSessionJwt;

            /* JADX WARN: Multi-variable type inference failed */
            public Config(CaptureMethod captureMethod, Boolean bool, Boolean bool2, Localizations localizations, String str, boolean z6, Boolean bool3, List<? extends CaptureFileType> list, List<? extends VideoCaptureMethod> list2, AssetConfig assetConfig, @InterfaceC11468o(name = "videoSessionJWT") String str2, List<? extends SelfiePose> list3, PendingPageTextPosition pendingPageTextPosition, Boolean bool4) {
                this.selfieType = captureMethod;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.localizations = localizations;
                this.fieldKeySelfie = str;
                this.requireStrictSelfieCapture = z6;
                this.skipPromptPage = bool3;
                this.enabledCaptureFileTypes = list;
                this.videoCaptureMethods = list2;
                this.assets = assetConfig;
                this.videoSessionJwt = str2;
                this.orderedPoses = list3;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.audioEnabled = bool4;
            }

            public final AssetConfig getAssets() {
                return this.assets;
            }

            public final Boolean getAudioEnabled() {
                return this.audioEnabled;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<CaptureFileType> getEnabledCaptureFileTypes() {
                return this.enabledCaptureFileTypes;
            }

            public final String getFieldKeySelfie() {
                return this.fieldKeySelfie;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final List<SelfiePose> getOrderedPoses() {
                return this.orderedPoses;
            }

            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            public final CaptureMethod getSelfieType() {
                return this.selfieType;
            }

            public final Boolean getSkipPromptPage() {
                return this.skipPromptPage;
            }

            public final List<VideoCaptureMethod> getVideoCaptureMethods() {
                return this.videoCaptureMethods;
            }

            public final String getVideoSessionJwt() {
                return this.videoSessionJwt;
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "capturePage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "getCapturePage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final CapturePage capturePage;
            private final PendingPage pendingPage;
            private final PromptPage promptPage;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    return new Localizations(PromptPage.CREATOR.createFromParcel(parcel), CapturePage.CREATOR.createFromParcel(parcel), PendingPage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CancelDialog.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(PromptPage promptPage, CapturePage capturePage, PendingPage pendingPage, CancelDialog cancelDialog) {
                this.promptPage = promptPage;
                this.capturePage = capturePage;
                this.pendingPage = pendingPage;
                this.cancelDialog = cancelDialog;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final CapturePage getCapturePage() {
                return this.capturePage;
            }

            public final PendingPage getPendingPage() {
                return this.pendingPage;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                this.promptPage.writeToParcel(parcel, flags);
                this.capturePage.writeToParcel(parcel, flags);
                this.pendingPage.writeToParcel(parcel, flags);
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, flags);
                }
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PendingPage implements Parcelable {
            public static final Parcelable.Creator<PendingPage> CREATOR = new Creator();
            private final String description;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PendingPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage createFromParcel(Parcel parcel) {
                    return new PendingPage(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PendingPage[] newArray(int i10) {
                    return new PendingPage[i10];
                }
            }

            public PendingPage(String str, String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "Landroid/os/Parcelable;", "", UiComponentConfig.Title.type, SDPKeywords.PROMPT, "promptCenter", "disclosure", "buttonSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsAllowButtonText", "cameraPermissionsCancelButtonText", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPrompt", "getPromptCenter", "getDisclosure", "getButtonSubmit", "getCameraPermissionsTitle", "getCameraPermissionsPrompt", "getCameraPermissionsAllowButtonText", "getCameraPermissionsCancelButtonText", "getMicrophonePermissionsBtnCancel", "getMicrophonePermissionsBtnContinueMobile", "getMicrophonePermissionsPrompt", "getMicrophonePermissionsTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String buttonSubmit;
            private final String cameraPermissionsAllowButtonText;
            private final String cameraPermissionsCancelButtonText;
            private final String cameraPermissionsPrompt;
            private final String cameraPermissionsTitle;
            private final String disclosure;
            private final String microphonePermissionsBtnCancel;
            private final String microphonePermissionsBtnContinueMobile;
            private final String microphonePermissionsPrompt;
            private final String microphonePermissionsTitle;
            private final String prompt;
            private final String promptCenter;
            private final String title;

            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            public PromptPage(@InterfaceC11468o(name = "selfieTitle") String str, @InterfaceC11468o(name = "selfiePrompt") String str2, @InterfaceC11468o(name = "selfiePromptCenter") String str3, @InterfaceC11468o(name = "agreeToPolicy") String str4, @InterfaceC11468o(name = "btnSubmit") String str5, String str6, String str7, @InterfaceC11468o(name = "cameraPermissionsBtnContinueMobile") String str8, @InterfaceC11468o(name = "cameraPermissionsBtnCancel") String str9, String str10, String str11, String str12, String str13) {
                this.title = str;
                this.prompt = str2;
                this.promptCenter = str3;
                this.disclosure = str4;
                this.buttonSubmit = str5;
                this.cameraPermissionsTitle = str6;
                this.cameraPermissionsPrompt = str7;
                this.cameraPermissionsAllowButtonText = str8;
                this.cameraPermissionsCancelButtonText = str9;
                this.microphonePermissionsBtnCancel = str10;
                this.microphonePermissionsBtnContinueMobile = str11;
                this.microphonePermissionsPrompt = str12;
                this.microphonePermissionsTitle = str13;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getButtonSubmit() {
                return this.buttonSubmit;
            }

            public final String getCameraPermissionsAllowButtonText() {
                return this.cameraPermissionsAllowButtonText;
            }

            public final String getCameraPermissionsCancelButtonText() {
                return this.cameraPermissionsCancelButtonText;
            }

            public final String getCameraPermissionsPrompt() {
                return this.cameraPermissionsPrompt;
            }

            public final String getCameraPermissionsTitle() {
                return this.cameraPermissionsTitle;
            }

            public final String getDisclosure() {
                return this.disclosure;
            }

            public final String getMicrophonePermissionsBtnCancel() {
                return this.microphonePermissionsBtnCancel;
            }

            public final String getMicrophonePermissionsBtnContinueMobile() {
                return this.microphonePermissionsBtnContinueMobile;
            }

            public final String getMicrophonePermissionsPrompt() {
                return this.microphonePermissionsPrompt;
            }

            public final String getMicrophonePermissionsTitle() {
                return this.microphonePermissionsTitle;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public final String getPromptCenter() {
                return this.promptCenter;
            }

            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.promptCenter);
                parcel.writeString(this.disclosure);
                parcel.writeString(this.buttonSubmit);
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
                parcel.writeString(this.microphonePermissionsBtnCancel);
                parcel.writeString(this.microphonePermissionsBtnContinueMobile);
                parcel.writeString(this.microphonePermissionsPrompt);
                parcel.writeString(this.microphonePermissionsTitle);
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "RIGHT", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum SelfiePose {
            CENTER,
            LEFT,
            RIGHT;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "Companion", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @InterfaceC11472s(generateAdapter = false)
        public enum VideoCaptureMethod {
            Stream,
            Upload,
            None;

            private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod$Companion;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "<init>", "()V", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;)V", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Companion extends AbstractC11471r {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11453S
                public void toJson(AbstractC11440E writer, VideoCaptureMethod value) {
                }

                private Companion() {
                }

                @Override // bj.AbstractC11471r
                @InterfaceC11467n
                public VideoCaptureMethod fromJson(AbstractC11477x reader) {
                    Object objM12871r0 = reader.m12871r0();
                    if (AbstractC16544l.m18089b(objM12871r0, "stream")) {
                        return VideoCaptureMethod.Stream;
                    }
                    return AbstractC16544l.m18089b(objM12871r0, "upload") ? VideoCaptureMethod.Upload : VideoCaptureMethod.None;
                }
            }

            public static InterfaceC20006a getEntries() {
                return $ENTRIES;
            }
        }

        public Selfie(String str, Config config, StepStyles.SelfieStepStyle selfieStepStyle) {
            super(str, null);
            this.name = str;
            this.config = config;
            this.styles = selfieStepStyle;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui */
    @Metadata(m18066d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001d\u001e\u001fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Landroid/os/Parcelable;", "", DiagnosticsEntry.NAME_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStyle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyles$UiStepStyle;", "Config", "Localizations", "PromptPage", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = true)
    public static final class C12890Ui extends NextStep implements Parcelable {
        public static final Parcelable.Creator<C12890Ui> CREATOR = new Creator();
        private final Config config;
        private final String name;
        private final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Creator */
        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<C12890Ui> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C12890Ui createFromParcel(Parcel parcel) {
                return new C12890Ui(parcel.readString(), Config.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepStyles.UiStepStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C12890Ui[] newArray(int i10) {
                return new C12890Ui[i10];
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations */
        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "promptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "getPromptPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "getCancelDialog", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Localizations implements Parcelable {
            public static final Parcelable.Creator<Localizations> CREATOR = new Creator();
            private final CancelDialog cancelDialog;
            private final PromptPage promptPage;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Localizations$Creator */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Localizations> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations createFromParcel(Parcel parcel) {
                    return new Localizations(parcel.readInt() == 0 ? null : PromptPage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CancelDialog.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Localizations[] newArray(int i10) {
                    return new Localizations[i10];
                }
            }

            public Localizations(PromptPage promptPage, CancelDialog cancelDialog) {
                this.promptPage = promptPage;
                this.cancelDialog = cancelDialog;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final CancelDialog getCancelDialog() {
                return this.cancelDialog;
            }

            public final PromptPage getPromptPage() {
                return this.promptPage;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                PromptPage promptPage = this.promptPage;
                if (promptPage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    promptPage.writeToParcel(parcel, flags);
                }
                CancelDialog cancelDialog = this.cancelDialog;
                if (cancelDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    cancelDialog.writeToParcel(parcel, flags);
                }
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$PromptPage */
        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "Landroid/os/Parcelable;", "", "gpsPermissionsBtnCancel", "gpsPermissionsAllowButtonText", "gpsFeatureTurnOnText", "gpsPermissionsPrompt", "gpsPermissionsTitle", "gpsFeaturePrompt", "gpsFeatureTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGpsPermissionsBtnCancel", "()Ljava/lang/String;", "getGpsPermissionsAllowButtonText", "getGpsFeatureTurnOnText", "getGpsPermissionsPrompt", "getGpsPermissionsTitle", "getGpsFeaturePrompt", "getGpsFeatureTitle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class PromptPage implements Parcelable {
            public static final Parcelable.Creator<PromptPage> CREATOR = new Creator();
            private final String gpsFeaturePrompt;
            private final String gpsFeatureTitle;
            private final String gpsFeatureTurnOnText;
            private final String gpsPermissionsAllowButtonText;
            private final String gpsPermissionsBtnCancel;
            private final String gpsPermissionsPrompt;
            private final String gpsPermissionsTitle;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$PromptPage$Creator */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<PromptPage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage createFromParcel(Parcel parcel) {
                    return new PromptPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PromptPage[] newArray(int i10) {
                    return new PromptPage[i10];
                }
            }

            public PromptPage(String str, @InterfaceC11468o(name = "gpsPermissionsBtnContinueMobile") String str2, @InterfaceC11468o(name = "gpsDeviceFeatureBtnContinueMobile") String str3, String str4, String str5, String str6, String str7) {
                this.gpsPermissionsBtnCancel = str;
                this.gpsPermissionsAllowButtonText = str2;
                this.gpsFeatureTurnOnText = str3;
                this.gpsPermissionsPrompt = str4;
                this.gpsPermissionsTitle = str5;
                this.gpsFeaturePrompt = str6;
                this.gpsFeatureTitle = str7;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getGpsFeaturePrompt() {
                return this.gpsFeaturePrompt;
            }

            public final String getGpsFeatureTitle() {
                return this.gpsFeatureTitle;
            }

            public final String getGpsFeatureTurnOnText() {
                return this.gpsFeatureTurnOnText;
            }

            public final String getGpsPermissionsAllowButtonText() {
                return this.gpsPermissionsAllowButtonText;
            }

            public final String getGpsPermissionsBtnCancel() {
                return this.gpsPermissionsBtnCancel;
            }

            public final String getGpsPermissionsPrompt() {
                return this.gpsPermissionsPrompt;
            }

            public final String getGpsPermissionsTitle() {
                return this.gpsPermissionsTitle;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.gpsPermissionsBtnCancel);
                parcel.writeString(this.gpsPermissionsAllowButtonText);
                parcel.writeString(this.gpsFeatureTurnOnText);
                parcel.writeString(this.gpsPermissionsPrompt);
                parcel.writeString(this.gpsPermissionsTitle);
                parcel.writeString(this.gpsFeaturePrompt);
                parcel.writeString(this.gpsFeatureTitle);
            }
        }

        public /* synthetic */ C12890Ui(String str, Config config, StepStyles.UiStepStyle uiStepStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i10 & 4) != 0 ? null : uiStepStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Config getConfig() {
            return this.config;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.NextStep
        public String getName() {
            return this.name;
        }

        public final StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.name);
            this.config.writeToParcel(parcel, flags);
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            if (uiStepStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uiStepStyle.writeToParcel(parcel, flags);
            }
        }

        public C12890Ui(String str, Config config, StepStyles.UiStepStyle uiStepStyle) {
            super(str, null);
            this.name = str;
            this.config = config;
            this.styles = uiStepStyle;
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config */
        @InterfaceC11472s(generateAdapter = true)
        @Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "components", "", "backStepEnabled", "cancelButtonEnabled", "terminal", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError;", "serverComponentErrors", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getBackStepEnabled", "()Ljava/lang/Boolean;", "getCancelButtonEnabled", "getTerminal", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "getServerComponentErrors", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Config implements Parcelable {
            public static final Parcelable.Creator<Config> CREATOR = new Creator();
            private final Boolean backStepEnabled;
            private final Boolean cancelButtonEnabled;
            private final List<UiComponentConfig> components;
            private final Localizations localizations;
            private final List<UiComponentError> serverComponentErrors;
            private final Boolean terminal;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui$Config$Creator */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Boolean boolValueOf3;
                    int iM19530m = 0;
                    ArrayList arrayList2 = null;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i10 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i10);
                        int iM19530m2 = 0;
                        while (iM19530m2 != i10) {
                            iM19530m2 = AbstractC17792x.m19530m(Config.class, parcel, arrayList3, iM19530m2, 1);
                        }
                        arrayList = arrayList3;
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    Localizations localizationsCreateFromParcel = parcel.readInt() == 0 ? null : Localizations.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int i11 = parcel.readInt();
                        arrayList2 = new ArrayList(i11);
                        while (iM19530m != i11) {
                            iM19530m = AbstractC17792x.m19530m(Config.class, parcel, arrayList2, iM19530m, 1);
                        }
                    }
                    return new Config(arrayList, boolValueOf, boolValueOf2, boolValueOf3, localizationsCreateFromParcel, arrayList2);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Config[] newArray(int i10) {
                    return new Config[i10];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config(List<? extends UiComponentConfig> list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List<? extends UiComponentError> list2) {
                this.components = list;
                this.backStepEnabled = bool;
                this.cancelButtonEnabled = bool2;
                this.terminal = bool3;
                this.localizations = localizations;
                this.serverComponentErrors = list2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final Boolean getBackStepEnabled() {
                return this.backStepEnabled;
            }

            public final Boolean getCancelButtonEnabled() {
                return this.cancelButtonEnabled;
            }

            public final List<UiComponentConfig> getComponents() {
                return this.components;
            }

            public final Localizations getLocalizations() {
                return this.localizations;
            }

            public final List<UiComponentError> getServerComponentErrors() {
                return this.serverComponentErrors;
            }

            public final Boolean getTerminal() {
                return this.terminal;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                List<UiComponentConfig> list = this.components;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(list.size());
                    Iterator<UiComponentConfig> it = list.iterator();
                    while (it.hasNext()) {
                        parcel.writeParcelable(it.next(), flags);
                    }
                }
                Boolean bool = this.backStepEnabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool);
                }
                Boolean bool2 = this.cancelButtonEnabled;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool2);
                }
                Boolean bool3 = this.terminal;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    AbstractC12107L1.m13829t(parcel, 1, bool3);
                }
                Localizations localizations = this.localizations;
                if (localizations == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    localizations.writeToParcel(parcel, flags);
                }
                List<UiComponentError> list2 = this.serverComponentErrors;
                if (list2 == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                Iterator<UiComponentError> it2 = list2.iterator();
                while (it2.hasNext()) {
                    parcel.writeParcelable(it2.next(), flags);
                }
            }

            public /* synthetic */ Config(List list, Boolean bool, Boolean bool2, Boolean bool3, Localizations localizations, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : localizations, (i10 & 32) == 0 ? list2 : null);
            }
        }
    }

    @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class Unknown extends NextStep {
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -1141780238;
        }

        public String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ NextStep(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getName() {
        return this.name;
    }

    private NextStep(String str) {
        this.name = str;
    }
}
