package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6483c {

    /* JADX INFO: renamed from: Y */
    public static final EnumC6483c f21039Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC6483c[] f21040Z;

    static {
        EnumC6483c enumC6483c = new EnumC6483c("RELIABLE", 0);
        f21039Y = enumC6483c;
        EnumC6483c[] enumC6483cArr = {enumC6483c, new EnumC6483c("LOSSY", 1)};
        f21040Z = enumC6483cArr;
        AbstractC7877E4.m8156j(enumC6483cArr);
    }

    public static EnumC6483c valueOf(String str) {
        return (EnumC6483c) Enum.valueOf(EnumC6483c.class, str);
    }

    public static EnumC6483c[] values() {
        return (EnumC6483c[]) f21040Z.clone();
    }
}
