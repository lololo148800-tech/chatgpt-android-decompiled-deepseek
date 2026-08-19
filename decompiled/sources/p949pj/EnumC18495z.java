package p949pj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pj.z */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18495z {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18495z f58954Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18495z f58955Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18495z f58956o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18495z[] f58957p0;

    static {
        EnumC18495z enumC18495z = new EnumC18495z("User", 0);
        f58954Y = enumC18495z;
        EnumC18495z enumC18495z2 = new EnumC18495z("Environment", 1);
        f58955Z = enumC18495z2;
        EnumC18495z enumC18495z3 = new EnumC18495z("Unknown", 2);
        f58956o0 = enumC18495z3;
        EnumC18495z[] enumC18495zArr = {enumC18495z, enumC18495z2, enumC18495z3};
        f58957p0 = enumC18495zArr;
        AbstractC7877E4.m8156j(enumC18495zArr);
    }

    public static EnumC18495z valueOf(String str) {
        return (EnumC18495z) Enum.valueOf(EnumC18495z.class, str);
    }

    public static EnumC18495z[] values() {
        return (EnumC18495z[]) f58957p0.clone();
    }
}
