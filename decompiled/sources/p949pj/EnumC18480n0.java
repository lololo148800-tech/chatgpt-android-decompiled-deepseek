package p949pj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pj.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18480n0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18480n0 f58924Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18480n0 f58925Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18480n0 f58926o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18480n0[] f58927p0;

    static {
        EnumC18480n0 enumC18480n0 = new EnumC18480n0("Center", 0);
        f58924Y = enumC18480n0;
        EnumC18480n0 enumC18480n1 = new EnumC18480n0("Left", 1);
        f58925Z = enumC18480n1;
        EnumC18480n0 enumC18480n2 = new EnumC18480n0("Right", 2);
        f58926o0 = enumC18480n2;
        EnumC18480n0[] enumC18480n0Arr = {enumC18480n0, enumC18480n1, enumC18480n2};
        f58927p0 = enumC18480n0Arr;
        AbstractC7877E4.m8156j(enumC18480n0Arr);
    }

    public static EnumC18480n0 valueOf(String str) {
        return (EnumC18480n0) Enum.valueOf(EnumC18480n0.class, str);
    }

    public static EnumC18480n0[] values() {
        return (EnumC18480n0[]) f58927p0.clone();
    }
}
