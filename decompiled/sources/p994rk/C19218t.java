package p994rk;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p523V9.AbstractC8130l0;
import pk.C18500e;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: rk.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C19218t implements InterfaceC19129V1 {
    public static final Parcelable.Creator<C19218t> CREATOR = new C19214s();

    /* JADX INFO: renamed from: Y */
    public final UiComponentConfig.CreatePersonaSheet f60959Y;

    /* JADX INFO: renamed from: Z */
    public final UiComponentConfig.CreatePersonaSheet.CardCtaPage f60960Z;

    /* JADX INFO: renamed from: o0 */
    public final String f60961o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f60962p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f60963q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f60964r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f60965s0;

    /* JADX INFO: renamed from: t0 */
    public final C18500e f60966t0;

    public C19218t(UiComponentConfig.CreatePersonaSheet config, UiComponentConfig.CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean z6, boolean z10, boolean z11, boolean z12, C18500e screen) {
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(ctaCard, "ctaCard");
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(screen, "screen");
        this.f60959Y = config;
        this.f60960Z = ctaCard;
        this.f60961o0 = url;
        this.f60962p0 = z6;
        this.f60963q0 = z10;
        this.f60964r0 = z11;
        this.f60965s0 = z12;
        this.f60966t0 = screen;
    }

    /* JADX INFO: renamed from: a */
    public static C19218t m20326a(C19218t c19218t, boolean z6, C18500e c18500e, int i10) {
        UiComponentConfig.CreatePersonaSheet config = c19218t.f60959Y;
        UiComponentConfig.CreatePersonaSheet.CardCtaPage ctaCard = c19218t.f60960Z;
        String url = c19218t.f60961o0;
        boolean z10 = c19218t.f60962p0;
        if ((i10 & 16) != 0) {
            z6 = c19218t.f60963q0;
        }
        boolean z11 = z6;
        boolean z12 = (i10 & 32) != 0 ? c19218t.f60964r0 : false;
        boolean z13 = c19218t.f60965s0;
        if ((i10 & 128) != 0) {
            c18500e = c19218t.f60966t0;
        }
        C18500e screen = c18500e;
        c19218t.getClass();
        AbstractC16544l.m18094g(config, "config");
        AbstractC16544l.m18094g(ctaCard, "ctaCard");
        AbstractC16544l.m18094g(url, "url");
        AbstractC16544l.m18094g(screen, "screen");
        return new C19218t(config, ctaCard, url, z10, z11, z12, z13, screen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19218t)) {
            return false;
        }
        C19218t c19218t = (C19218t) obj;
        return AbstractC16544l.m18089b(this.f60959Y, c19218t.f60959Y) && AbstractC16544l.m18089b(this.f60960Z, c19218t.f60960Z) && AbstractC16544l.m18089b(this.f60961o0, c19218t.f60961o0) && this.f60962p0 == c19218t.f60962p0 && this.f60963q0 == c19218t.f60963q0 && this.f60964r0 == c19218t.f60964r0 && this.f60965s0 == c19218t.f60965s0 && AbstractC16544l.m18089b(this.f60966t0, c19218t.f60966t0);
    }

    @Override // p994rk.InterfaceC19201o2
    public final UiComponentConfig getConfig() {
        return this.f60959Y;
    }

    @Override // p994rk.InterfaceC19201o2
    public final String getName() {
        return AbstractC8130l0.m8648c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p((this.f60960Z.hashCode() + (this.f60959Y.hashCode() * 31)) * 31, 31, this.f60961o0);
        boolean z6 = this.f60962p0;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = (iM527p + r6) * 31;
        boolean z10 = this.f60963q0;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f60964r0;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i12 = (i11 + r11) * 31;
        boolean z12 = this.f60965s0;
        return this.f60966t0.hashCode() + ((i12 + (z12 ? 1 : z12)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeParcelable(this.f60959Y, i10);
        out.writeParcelable(this.f60960Z, i10);
        out.writeString(this.f60961o0);
        out.writeInt(this.f60962p0 ? 1 : 0);
        out.writeInt(this.f60963q0 ? 1 : 0);
        out.writeInt(this.f60964r0 ? 1 : 0);
        out.writeInt(this.f60965s0 ? 1 : 0);
        this.f60966t0.writeToParcel(out, i10);
    }

    public final String toString() {
        return "CreatePersonaSheetComponent(config=" + this.f60959Y + ", ctaCard=" + this.f60960Z + ", url=" + this.f60961o0 + ", autoCompleteOnDismiss=" + this.f60962p0 + CsqksqyPE.blgxpNY + this.f60963q0 + ", showing=" + this.f60964r0 + ", hideWhenTappedOutside=" + this.f60965s0 + ", screen=" + this.f60966t0 + Separators.RPAREN;
    }
}
