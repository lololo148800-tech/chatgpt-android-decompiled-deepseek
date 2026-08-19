package p711dn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC13184a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13184a f41839Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13184a f41840Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC13184a f41841o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC13184a[] f41842p0;

    static {
        EnumC13184a enumC13184a = new EnumC13184a("BEGINNING", 0);
        f41839Y = enumC13184a;
        EnumC13184a enumC13184a2 = new EnumC13184a("MIDDLE", 1);
        f41840Z = enumC13184a2;
        EnumC13184a enumC13184a3 = new EnumC13184a("AFTER_DOT", 2);
        f41841o0 = enumC13184a3;
        EnumC13184a[] enumC13184aArr = {enumC13184a, enumC13184a2, enumC13184a3};
        f41842p0 = enumC13184aArr;
        AbstractC7877E4.m8156j(enumC13184aArr);
    }

    public static EnumC13184a valueOf(String str) {
        return (EnumC13184a) Enum.valueOf(EnumC13184a.class, str);
    }

    public static EnumC13184a[] values() {
        return (EnumC13184a[]) f41842p0.clone();
    }
}
