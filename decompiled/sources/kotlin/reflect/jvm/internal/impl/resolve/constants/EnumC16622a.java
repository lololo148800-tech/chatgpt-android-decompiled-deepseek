package kotlin.reflect.jvm.internal.impl.resolve.constants;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.a */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC16622a {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC16622a[] f52890Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16622a EF6;

    static {
        EnumC16622a[] enumC16622aArr = {new EnumC16622a("COMMON_SUPER_TYPE", 0), new EnumC16622a("INTERSECTION_TYPE", 1)};
        f52890Y = enumC16622aArr;
        AbstractC7877E4.m8156j(enumC16622aArr);
    }

    public static EnumC16622a valueOf(String str) {
        return (EnumC16622a) Enum.valueOf(EnumC16622a.class, str);
    }

    public static EnumC16622a[] values() {
        return (EnumC16622a[]) f52890Y.clone();
    }
}
