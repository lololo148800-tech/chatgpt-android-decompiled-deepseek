package p1034u6;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u6.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC20128f {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC20128f[] f63760Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC20128f EF9;

    static {
        EnumC20128f[] enumC20128fArr = {new EnumC20128f("CacheFirst", 0), new EnumC20128f("CacheOnly", 1), new EnumC20128f("NetworkFirst", 2), new EnumC20128f("NetworkOnly", 3), new EnumC20128f("CacheAndNetwork", 4)};
        f63760Y = enumC20128fArr;
        AbstractC7877E4.m8156j(enumC20128fArr);
    }

    public static EnumC20128f valueOf(String str) {
        return (EnumC20128f) Enum.valueOf(EnumC20128f.class, str);
    }

    public static EnumC20128f[] values() {
        return (EnumC20128f[]) f63760Y.clone();
    }
}
