package com.withpersona.sdk2.inquiry.steps.p688ui.components;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p544W9.AbstractC8706s;
import p658b5.C11232c;
import p791hj.C14522e;
import p813ij.C15026j;
import p994rk.C19080F;
import p994rk.InterfaceC19089I;
import p994rk.InterfaceC19201o2;
import p994rk.InterfaceC19235y;
import sk.C19664c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R(\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR(\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0015\u0012\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R(\u0010)\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lrk/o2;", "Lrk/y;", "Lrk/I;", "Lb5/c;", "u0", "Lb5/c;", "getCardAccessNumberController", "()Lb5/c;", "setCardAccessNumberController", "(Lb5/c;)V", "getCardAccessNumberController$annotations", "()V", "cardAccessNumberController", "v0", "getDocumentNumberController", "setDocumentNumberController", "getDocumentNumberController$annotations", "documentNumberController", "Lhj/e;", "w0", "Lhj/e;", "getDateOfBirthController", "()Lhj/e;", "setDateOfBirthController", "(Lhj/e;)V", "getDateOfBirthController$annotations", "dateOfBirthController", "x0", "getExpirationDateController", "setExpirationDateController", "getExpirationDateController$annotations", "expirationDateController", "Lij/j;", "y0", "Lij/j;", "getNfcDataController", "()Lij/j;", "setNfcDataController", "(Lij/j;)V", "getNfcDataController$annotations", "nfcDataController", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class GovernmentIdNfcScanComponent implements InterfaceC19201o2, InterfaceC19235y, InterfaceC19089I {
    public static final Parcelable.Creator<GovernmentIdNfcScanComponent> CREATOR = new C19080F();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.GovernmentIdNfcScan f40910Y;

    /* JADX INFO: renamed from: Z */
    public final String f40911Z;

    /* JADX INFO: renamed from: o0 */
    public final String f40912o0;

    /* JADX INFO: renamed from: p0 */
    public final String f40913p0;

    /* JADX INFO: renamed from: q0 */
    public final String f40914q0;

    /* JADX INFO: renamed from: r0 */
    public final C19664c f40915r0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList f40916s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f40917t0;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public C11232c cardAccessNumberController;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public C11232c documentNumberController;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public C14522e dateOfBirthController;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public C14522e expirationDateController;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public C15026j nfcDataController;

    public GovernmentIdNfcScanComponent(UiComponentConfig.GovernmentIdNfcScan config, String documentNumber, String str, String str2, String cardAccessNumber, C19664c c19664c) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(documentNumber, "documentNumber");
        AbstractC16544l.m18094g(cardAccessNumber, "cardAccessNumber");
        this.f40910Y = config;
        this.f40911Z = documentNumber;
        this.f40912o0 = str;
        this.f40913p0 = str2;
        this.f40914q0 = cardAccessNumber;
        this.f40915r0 = c19664c;
        this.f40916s0 = new ArrayList();
        this.cardAccessNumberController = AbstractC8706s.m9413a(cardAccessNumber);
        this.documentNumberController = AbstractC8706s.m9413a(documentNumber);
        UiComponentConfig.GovernmentIdNfcScan.Companion companion = UiComponentConfig.GovernmentIdNfcScan.INSTANCE;
        this.dateOfBirthController = new C14522e(str, null, companion.generateTextMonths());
        this.expirationDateController = new C14522e(str2, null, companion.generateTextMonths());
        C15026j c15026j = new C15026j();
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(c19664c);
        c15026j.f46724Y = c2153q0M3204c;
        c15026j.f46725Z = new C2146N(c2153q0M3204c, 0);
        this.nfcDataController = c15026j;
    }

    /* JADX INFO: renamed from: a */
    public static GovernmentIdNfcScanComponent m14578a(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, String str2, String str3, String str4, C19664c c19664c, int i10) {
        UiComponentConfig.GovernmentIdNfcScan config = governmentIdNfcScanComponent.f40910Y;
        if ((i10 & 2) != 0) {
            str = governmentIdNfcScanComponent.f40911Z;
        }
        String documentNumber = str;
        if ((i10 & 4) != 0) {
            str2 = governmentIdNfcScanComponent.f40912o0;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = governmentIdNfcScanComponent.f40913p0;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = governmentIdNfcScanComponent.f40914q0;
        }
        String cardAccessNumber = str4;
        if ((i10 & 32) != 0) {
            c19664c = governmentIdNfcScanComponent.f40915r0;
        }
        governmentIdNfcScanComponent.getClass();
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(documentNumber, "documentNumber");
        AbstractC16544l.m18094g(cardAccessNumber, "cardAccessNumber");
        return new GovernmentIdNfcScanComponent(config, documentNumber, str5, str6, cardAccessNumber, c19664c);
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getCardAccessNumberController$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getDateOfBirthController$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getDocumentNumberController$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getExpirationDateController$annotations() {
    }

    @InterfaceC11468o(ignore = true)
    public static /* synthetic */ void getNfcDataController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdNfcScanComponent)) {
            return false;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) obj;
        return AbstractC16544l.m18089b(this.f40910Y, governmentIdNfcScanComponent.f40910Y) && AbstractC16544l.m18089b(this.f40911Z, governmentIdNfcScanComponent.f40911Z) && AbstractC16544l.m18089b(this.f40912o0, governmentIdNfcScanComponent.f40912o0) && AbstractC16544l.m18089b(this.f40913p0, governmentIdNfcScanComponent.f40913p0) && AbstractC16544l.m18089b(this.f40914q0, governmentIdNfcScanComponent.f40914q0) && AbstractC16544l.m18089b(this.f40915r0, governmentIdNfcScanComponent.f40915r0);
    }

    @Override // p994rk.InterfaceC19089I
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ArrayList getF40938x0() {
        return this.f40916s0;
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f40910Y;
    }

    @Override // p994rk.InterfaceC19235y
    public final JsonLogicBoolean getDisabled() {
        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes = this.f40910Y.getAttributes();
        if (attributes != null) {
            return attributes.getDisabled();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19089I
    public final JsonLogicBoolean getHidden() {
        UiComponentConfig.GovernmentIdNfcScan.Attributes attributes = this.f40910Y.getAttributes();
        if (attributes != null) {
            return attributes.getHidden();
        }
        return null;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return getConfig().getName();
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f40910Y.hashCode() * 31, 31, this.f40911Z);
        String str = this.f40912o0;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40913p0;
        int iM527p2 = AbstractC0168G.m527p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f40914q0);
        C19664c c19664c = this.f40915r0;
        return iM527p2 + (c19664c != null ? c19664c.hashCode() : 0);
    }

    public final String toString() {
        return "GovernmentIdNfcScanComponent(config=" + this.f40910Y + ", documentNumber=" + this.f40911Z + ", dateOfBirth=" + this.f40912o0 + ", expirationDate=" + this.f40913p0 + ", cardAccessNumber=" + this.f40914q0 + ", governmentIdNfcData=" + this.f40915r0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f40910Y, i10);
        out.writeString(this.f40911Z);
        out.writeString(this.f40912o0);
        out.writeString(this.f40913p0);
        out.writeString(this.f40914q0);
        C19664c c19664c = this.f40915r0;
        if (c19664c == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c19664c.writeToParcel(out, i10);
        }
    }
}
