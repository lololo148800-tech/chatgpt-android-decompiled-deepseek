package p022Ak;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p021Aj.C0516a;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ak.d */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0543d implements Parcelable {
    public static final Parcelable.Creator<EnumC0543d> CREATOR;

    /* JADX INFO: renamed from: Y */
    public static final EnumC0543d f1722Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0543d f1723Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC0543d f1724o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC0543d f1725p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC0543d f1726q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC0543d f1727r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC0543d f1728s0;

    /* JADX INFO: renamed from: t0 */
    public static final EnumC0543d f1729t0;

    /* JADX INFO: renamed from: u0 */
    public static final EnumC0543d f1730u0;

    /* JADX INFO: renamed from: v0 */
    public static final EnumC0543d f1731v0;

    /* JADX INFO: renamed from: w0 */
    public static final EnumC0543d f1732w0;

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ EnumC0543d[] f1733x0;

    static {
        EnumC0543d enumC0543d = new EnumC0543d("NetworkError", 0);
        f1722Y = enumC0543d;
        EnumC0543d enumC0543d2 = new EnumC0543d("CameraPermissionError", 1);
        f1723Z = enumC0543d2;
        EnumC0543d enumC0543d3 = new EnumC0543d("SdkConfigurationError", 2);
        f1724o0 = enumC0543d3;
        EnumC0543d enumC0543d4 = new EnumC0543d("CameraCompatibilityError", 3);
        f1725p0 = enumC0543d4;
        EnumC0543d enumC0543d5 = new EnumC0543d("IntegrationError", 4);
        f1726q0 = enumC0543d5;
        EnumC0543d enumC0543d6 = new EnumC0543d("SessionTokenError", 5);
        f1727r0 = enumC0543d6;
        EnumC0543d enumC0543d7 = new EnumC0543d("RateLimitExceeded", 6);
        f1728s0 = enumC0543d7;
        EnumC0543d enumC0543d8 = new EnumC0543d("UnexpectedError", 7);
        f1729t0 = enumC0543d8;
        EnumC0543d enumC0543d9 = new EnumC0543d("NoDiskSpaceError", 8);
        f1730u0 = enumC0543d9;
        EnumC0543d enumC0543d10 = new EnumC0543d("WebRtcIntegrationError", 9);
        f1731v0 = enumC0543d10;
        EnumC0543d enumC0543d11 = new EnumC0543d("ExceptionError", 10);
        f1732w0 = enumC0543d11;
        EnumC0543d[] enumC0543dArr = {enumC0543d, enumC0543d2, enumC0543d3, enumC0543d4, enumC0543d5, enumC0543d6, enumC0543d7, enumC0543d8, enumC0543d9, enumC0543d10, enumC0543d11};
        f1733x0 = enumC0543dArr;
        AbstractC7877E4.m8156j(enumC0543dArr);
        CREATOR = new C0516a(4);
    }

    public static EnumC0543d valueOf(String str) {
        return (EnumC0543d) Enum.valueOf(EnumC0543d.class, str);
    }

    public static EnumC0543d[] values() {
        return (EnumC0543d[]) f1733x0.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        AbstractC16544l.m18094g(out, "out");
        out.writeString(name());
    }
}
