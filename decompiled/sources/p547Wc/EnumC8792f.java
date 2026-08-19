package p547Wc;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Wc.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8792f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8792f f26896Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8792f f26897Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8792f f26898o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC8792f[] f26899p0;

    static {
        EnumC8792f enumC8792f = new EnumC8792f("Default", 0);
        f26896Y = enumC8792f;
        EnumC8792f enumC8792f2 = new EnumC8792f(SIPHeaderNames.WARNING, 1);
        f26897Z = enumC8792f2;
        EnumC8792f enumC8792f3 = new EnumC8792f("Error", 2);
        f26898o0 = enumC8792f3;
        EnumC8792f[] enumC8792fArr = {enumC8792f, enumC8792f2, enumC8792f3};
        f26899p0 = enumC8792fArr;
        AbstractC7877E4.m8156j(enumC8792fArr);
    }

    public static EnumC8792f valueOf(String str) {
        return (EnumC8792f) Enum.valueOf(EnumC8792f.class, str);
    }

    public static EnumC8792f[] values() {
        return (EnumC8792f[]) f26899p0.clone();
    }
}
