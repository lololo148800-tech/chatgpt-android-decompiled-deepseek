package p946pc;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pc.v */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18356v {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC18356v[] f58610Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC18356v EF9;

    static {
        EnumC18356v[] enumC18356vArr = {new EnumC18356v("Primary", 0), new EnumC18356v("Secondary", 1), new EnumC18356v("Success", 2), new EnumC18356v("Danger", 3), new EnumC18356v(SIPHeaderNames.WARNING, 4)};
        f58610Y = enumC18356vArr;
        AbstractC7877E4.m8156j(enumC18356vArr);
    }

    public static EnumC18356v valueOf(String str) {
        return (EnumC18356v) Enum.valueOf(EnumC18356v.class, str);
    }

    public static EnumC18356v[] values() {
        return (EnumC18356v[]) f58610Y.clone();
    }
}
