package p225Im;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Im.C */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3744C {

    /* JADX INFO: renamed from: Y */
    public static final EnumC3744C f11394Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC3744C f11395Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC3744C f11396o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC3744C[] f11397p0;

    static {
        EnumC3744C enumC3744C = new EnumC3744C("INVARIANT", 0);
        f11394Y = enumC3744C;
        EnumC3744C enumC3744C2 = new EnumC3744C(SDPKeywords.f31992IN, 1);
        f11395Z = enumC3744C2;
        EnumC3744C enumC3744C3 = new EnumC3744C("OUT", 2);
        f11396o0 = enumC3744C3;
        EnumC3744C[] enumC3744CArr = {enumC3744C, enumC3744C2, enumC3744C3};
        f11397p0 = enumC3744CArr;
        AbstractC7877E4.m8156j(enumC3744CArr);
    }

    public static EnumC3744C valueOf(String str) {
        return (EnumC3744C) Enum.valueOf(EnumC3744C.class, str);
    }

    public static EnumC3744C[] values() {
        return (EnumC3744C[]) f11397p0.clone();
    }
}
