package p878lo;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC17101j {

    /* JADX INFO: renamed from: Y */
    public static final C17094c f54652Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC17101j[] f54653Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17101j EF6;

    static {
        EnumC17101j[] enumC17101jArr = {new EnumC17101j("Android", 0), new EnumC17101j("Desktop", 1)};
        f54653Z = enumC17101jArr;
        AbstractC7877E4.m8156j(enumC17101jArr);
        f54652Y = new C17094c();
    }

    public static EnumC17101j valueOf(String str) {
        return (EnumC17101j) Enum.valueOf(EnumC17101j.class, str);
    }

    public static EnumC17101j[] values() {
        return (EnumC17101j[]) f54653Z.clone();
    }
}
