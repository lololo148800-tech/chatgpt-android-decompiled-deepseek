package p323Mm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5495b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5495b f17939Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5495b f17940Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC5495b[] f17941o0;

    static {
        EnumC5495b enumC5495b = new EnumC5495b("JAVA", 0);
        f17939Y = enumC5495b;
        EnumC5495b enumC5495b2 = new EnumC5495b("KOTLIN", 1);
        f17940Z = enumC5495b2;
        EnumC5495b[] enumC5495bArr = {enumC5495b, enumC5495b2};
        f17941o0 = enumC5495bArr;
        AbstractC7877E4.m8156j(enumC5495bArr);
    }

    public static EnumC5495b valueOf(String str) {
        return (EnumC5495b) Enum.valueOf(EnumC5495b.class, str);
    }

    public static EnumC5495b[] values() {
        return (EnumC5495b[]) f17941o0.clone();
    }
}
