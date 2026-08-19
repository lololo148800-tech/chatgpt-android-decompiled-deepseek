package p949pj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pj.x */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18493x {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18493x f58948Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18493x f58949Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC18493x[] f58950o0;

    static {
        EnumC18493x enumC18493x = new EnumC18493x("FRONT", 0);
        f58948Y = enumC18493x;
        EnumC18493x enumC18493x2 = new EnumC18493x("BACK", 1);
        f58949Z = enumC18493x2;
        EnumC18493x[] enumC18493xArr = {enumC18493x, enumC18493x2};
        f58950o0 = enumC18493xArr;
        AbstractC7877E4.m8156j(enumC18493xArr);
    }

    public static EnumC18493x valueOf(String str) {
        return (EnumC18493x) Enum.valueOf(EnumC18493x.class, str);
    }

    public static EnumC18493x[] values() {
        return (EnumC18493x[]) f58950o0.clone();
    }
}
