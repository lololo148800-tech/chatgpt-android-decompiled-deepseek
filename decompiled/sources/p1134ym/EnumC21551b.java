package p1134ym;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ym.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21551b {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC21551b[] f68249Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21551b EF8;

    static {
        EnumC21551b[] enumC21551bArr = {new EnumC21551b("PRESENT", 0), new EnumC21551b("ABSENT", 1), new EnumC21551b("PRESENT_OPTIONAL", 2), new EnumC21551b("ABSENT_OPTIONAL", 3)};
        f68249Y = enumC21551bArr;
        AbstractC7877E4.m8156j(enumC21551bArr);
    }

    public static EnumC21551b valueOf(String str) {
        return (EnumC21551b) Enum.valueOf(EnumC21551b.class, str);
    }

    public static EnumC21551b[] values() {
        return (EnumC21551b[]) f68249Y.clone();
    }
}
