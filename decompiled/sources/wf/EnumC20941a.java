package wf;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20941a {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC20941a[] f66706Y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC20941a EF6;

    static {
        EnumC20941a[] enumC20941aArr = {new EnumC20941a("JPG", 0), new EnumC20941a("WEBP", 1)};
        f66706Y = enumC20941aArr;
        AbstractC7877E4.m8156j(enumC20941aArr);
    }

    public static EnumC20941a valueOf(String str) {
        return (EnumC20941a) Enum.valueOf(EnumC20941a.class, str);
    }

    public static EnumC20941a[] values() {
        return (EnumC20941a[]) f66706Y.clone();
    }
}
