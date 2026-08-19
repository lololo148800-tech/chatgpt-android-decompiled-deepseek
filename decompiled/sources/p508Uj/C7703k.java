package p508Uj;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p009A7.FlM.nkFZpTrMPpn;
import p263K9.C4576X;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Uj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C7703k implements Parcelable {
    public static final Parcelable.Creator<C7703k> CREATOR = new C4576X(19);

    /* JADX INFO: renamed from: Y */
    public final String f24254Y;

    /* JADX INFO: renamed from: Z */
    public final String f24255Z;

    /* JADX INFO: renamed from: o0 */
    public final String f24256o0;

    /* JADX INFO: renamed from: p0 */
    public final String f24257p0;

    /* JADX INFO: renamed from: q0 */
    public final String f24258q0;

    /* JADX INFO: renamed from: r0 */
    public final String f24259r0;

    /* JADX INFO: renamed from: s0 */
    public final String f24260s0;

    /* JADX INFO: renamed from: t0 */
    public final String f24261t0;

    /* JADX INFO: renamed from: u0 */
    public final String f24262u0;

    /* JADX INFO: renamed from: v0 */
    public final String f24263v0;

    /* JADX INFO: renamed from: w0 */
    public final String f24264w0;

    /* JADX INFO: renamed from: x0 */
    public final String f24265x0;

    /* JADX INFO: renamed from: y0 */
    public final String f24266y0;

    /* JADX INFO: renamed from: z0 */
    public final String f24267z0;

    public C7703k(String nfcScanPrompt, String authenticating, String reading, String cancelNfcScan, String nfcScanSuccess, String enablePassportNfcText, String enablePassportNfcConfirmButtonText, String enablePassportNfcCancelButtonText, String connectionLostText, String connectionLostConfirmButtonText, String authenticationErrorText, String authenticationErrorConfirmButtonText, String genericErrorText, String genericErrorConfirmButtonText) {
        AbstractC16544l.m18094g(nfcScanPrompt, "nfcScanPrompt");
        AbstractC16544l.m18094g(authenticating, "authenticating");
        AbstractC16544l.m18094g(reading, "reading");
        AbstractC16544l.m18094g(cancelNfcScan, "cancelNfcScan");
        AbstractC16544l.m18094g(nfcScanSuccess, "nfcScanSuccess");
        AbstractC16544l.m18094g(enablePassportNfcText, "enablePassportNfcText");
        AbstractC16544l.m18094g(enablePassportNfcConfirmButtonText, "enablePassportNfcConfirmButtonText");
        AbstractC16544l.m18094g(enablePassportNfcCancelButtonText, "enablePassportNfcCancelButtonText");
        AbstractC16544l.m18094g(connectionLostText, "connectionLostText");
        AbstractC16544l.m18094g(connectionLostConfirmButtonText, "connectionLostConfirmButtonText");
        AbstractC16544l.m18094g(authenticationErrorText, "authenticationErrorText");
        AbstractC16544l.m18094g(authenticationErrorConfirmButtonText, "authenticationErrorConfirmButtonText");
        AbstractC16544l.m18094g(genericErrorText, "genericErrorText");
        AbstractC16544l.m18094g(genericErrorConfirmButtonText, "genericErrorConfirmButtonText");
        this.f24254Y = nfcScanPrompt;
        this.f24255Z = authenticating;
        this.f24256o0 = reading;
        this.f24257p0 = cancelNfcScan;
        this.f24258q0 = nfcScanSuccess;
        this.f24259r0 = enablePassportNfcText;
        this.f24260s0 = enablePassportNfcConfirmButtonText;
        this.f24261t0 = enablePassportNfcCancelButtonText;
        this.f24262u0 = connectionLostText;
        this.f24263v0 = connectionLostConfirmButtonText;
        this.f24264w0 = authenticationErrorText;
        this.f24265x0 = authenticationErrorConfirmButtonText;
        this.f24266y0 = genericErrorText;
        this.f24267z0 = genericErrorConfirmButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7703k)) {
            return false;
        }
        C7703k c7703k = (C7703k) obj;
        return AbstractC16544l.m18089b(this.f24254Y, c7703k.f24254Y) && AbstractC16544l.m18089b(this.f24255Z, c7703k.f24255Z) && AbstractC16544l.m18089b(this.f24256o0, c7703k.f24256o0) && AbstractC16544l.m18089b(this.f24257p0, c7703k.f24257p0) && AbstractC16544l.m18089b(this.f24258q0, c7703k.f24258q0) && AbstractC16544l.m18089b(this.f24259r0, c7703k.f24259r0) && AbstractC16544l.m18089b(this.f24260s0, c7703k.f24260s0) && AbstractC16544l.m18089b(this.f24261t0, c7703k.f24261t0) && AbstractC16544l.m18089b(this.f24262u0, c7703k.f24262u0) && AbstractC16544l.m18089b(this.f24263v0, c7703k.f24263v0) && AbstractC16544l.m18089b(this.f24264w0, c7703k.f24264w0) && AbstractC16544l.m18089b(this.f24265x0, c7703k.f24265x0) && AbstractC16544l.m18089b(this.f24266y0, c7703k.f24266y0) && AbstractC16544l.m18089b(this.f24267z0, c7703k.f24267z0);
    }

    public final int hashCode() {
        return this.f24267z0.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f24254Y.hashCode() * 31, 31, this.f24255Z), 31, this.f24256o0), 31, this.f24257p0), 31, this.f24258q0), 31, this.f24259r0), 31, this.f24260s0), 31, this.f24261t0), 31, this.f24262u0), 31, this.f24263v0), 31, this.f24264w0), 31, this.f24265x0), 31, this.f24266y0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(this.f24254Y);
        out.writeString(this.f24255Z);
        out.writeString(this.f24256o0);
        out.writeString(this.f24257p0);
        out.writeString(this.f24258q0);
        out.writeString(this.f24259r0);
        out.writeString(this.f24260s0);
        out.writeString(this.f24261t0);
        out.writeString(this.f24262u0);
        out.writeString(this.f24263v0);
        out.writeString(this.f24264w0);
        out.writeString(this.f24265x0);
        out.writeString(this.f24266y0);
        out.writeString(this.f24267z0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportNfcStrings(nfcScanPrompt=");
        sb2.append(this.f24254Y);
        sb2.append(", authenticating=");
        sb2.append(this.f24255Z);
        sb2.append(", reading=");
        sb2.append(this.f24256o0);
        sb2.append(", cancelNfcScan=");
        sb2.append(this.f24257p0);
        sb2.append(", nfcScanSuccess=");
        sb2.append(this.f24258q0);
        sb2.append(nkFZpTrMPpn.iehnAEAajl);
        sb2.append(this.f24259r0);
        sb2.append(YladLSetV.QdmXTYarEDCKE);
        sb2.append(this.f24260s0);
        sb2.append(", enablePassportNfcCancelButtonText=");
        sb2.append(this.f24261t0);
        sb2.append(", connectionLostText=");
        sb2.append(this.f24262u0);
        sb2.append(", connectionLostConfirmButtonText=");
        sb2.append(this.f24263v0);
        sb2.append(", authenticationErrorText=");
        sb2.append(this.f24264w0);
        sb2.append(", authenticationErrorConfirmButtonText=");
        sb2.append(this.f24265x0);
        sb2.append(", genericErrorText=");
        sb2.append(this.f24266y0);
        sb2.append(", genericErrorConfirmButtonText=");
        return AbstractC9306j0.m9891j(this.f24267z0, Separators.RPAREN, sb2);
    }
}
