package fk;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13681b {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC13681b[] f43176Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC13681b EF7;

    static {
        EnumC13681b[] enumC13681bArr = {new EnumC13681b("Debug", 0), new EnumC13681b(SIPHeaderNames.WARNING, 1), new EnumC13681b("Error", 2)};
        f43176Y = enumC13681bArr;
        AbstractC7877E4.m8156j(enumC13681bArr);
    }

    public static EnumC13681b valueOf(String str) {
        return (EnumC13681b) Enum.valueOf(EnumC13681b.class, str);
    }

    public static EnumC13681b[] values() {
        return (EnumC13681b[]) f43176Y.clone();
    }
}
