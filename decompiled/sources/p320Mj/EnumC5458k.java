package p320Mj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mj.k */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5458k {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5458k f17821Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC5458k[] f17822Z;

    static {
        EnumC5458k enumC5458k = new EnumC5458k("Transition", 0);
        f17821Y = enumC5458k;
        EnumC5458k[] enumC5458kArr = {enumC5458k, new EnumC5458k("TransitionBack", 1), new EnumC5458k("DocumentFilesPost", 2), new EnumC5458k("DocumentFilesDelete", 3)};
        f17822Z = enumC5458kArr;
        AbstractC7877E4.m8156j(enumC5458kArr);
    }

    public static EnumC5458k valueOf(String str) {
        return (EnumC5458k) Enum.valueOf(EnumC5458k.class, str);
    }

    public static EnumC5458k[] values() {
        return (EnumC5458k[]) f17822Z.clone();
    }
}
