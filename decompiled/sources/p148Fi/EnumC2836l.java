package p148Fi;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Fi.l */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2836l {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC2836l[] f8574Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2836l EF7;

    static {
        EnumC2836l[] enumC2836lArr = {new EnumC2836l("MP3", 0), new EnumC2836l("OPUS", 1), new EnumC2836l("AAC", 2)};
        f8574Y = enumC2836lArr;
        AbstractC7877E4.m8156j(enumC2836lArr);
    }

    public static EnumC2836l valueOf(String str) {
        return (EnumC2836l) Enum.valueOf(EnumC2836l.class, str);
    }

    public static EnumC2836l[] values() {
        return (EnumC2836l[]) f8574Y.clone();
    }
}
