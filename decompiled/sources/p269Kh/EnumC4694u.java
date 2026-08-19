package p269Kh;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Kh.u */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4694u {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4694u f15268Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4694u f15269Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC4694u f15270o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC4694u f15271p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC4694u[] f15272q0;

    static {
        EnumC4694u enumC4694u = new EnumC4694u("Retrieval", 0);
        f15268Y = enumC4694u;
        EnumC4694u enumC4694u2 = new EnumC4694u("CodeInterpreter", 1);
        f15269Z = enumC4694u2;
        EnumC4694u enumC4694u3 = new EnumC4694u("Multimodal", 2);
        f15270o0 = enumC4694u3;
        EnumC4694u enumC4694u4 = new EnumC4694u("Unknown", 3);
        f15271p0 = enumC4694u4;
        EnumC4694u[] enumC4694uArr = {enumC4694u, enumC4694u2, enumC4694u3, enumC4694u4};
        f15272q0 = enumC4694uArr;
        AbstractC7877E4.m8156j(enumC4694uArr);
    }

    public static EnumC4694u valueOf(String str) {
        return (EnumC4694u) Enum.valueOf(EnumC4694u.class, str);
    }

    public static EnumC4694u[] values() {
        return (EnumC4694u[]) f15272q0.clone();
    }
}
