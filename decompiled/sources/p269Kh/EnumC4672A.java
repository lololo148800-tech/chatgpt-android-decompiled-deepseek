package p269Kh;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Kh.A */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4672A {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4672A f15213Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4672A f15214Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC4672A f15215o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC4672A[] f15216p0;

    static {
        EnumC4672A enumC4672A = new EnumC4672A("Free", 0);
        f15213Y = enumC4672A;
        EnumC4672A enumC4672A2 = new EnumC4672A("Plus", 1);
        f15214Z = enumC4672A2;
        EnumC4672A enumC4672A3 = new EnumC4672A("Unknown", 2);
        f15215o0 = enumC4672A3;
        EnumC4672A[] enumC4672AArr = {enumC4672A, enumC4672A2, enumC4672A3};
        f15216p0 = enumC4672AArr;
        AbstractC7877E4.m8156j(enumC4672AArr);
    }

    public static EnumC4672A valueOf(String str) {
        return (EnumC4672A) Enum.valueOf(EnumC4672A.class, str);
    }

    public static EnumC4672A[] values() {
        return (EnumC4672A[]) f15216p0.clone();
    }
}
