package p1156zj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zj.B */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC22088B {

    /* JADX INFO: renamed from: Y */
    public static final C22207y f69816Y;

    /* JADX INFO: renamed from: Z */
    public static final C22209z f69817Z;

    /* JADX INFO: renamed from: o0 */
    public static final C22086A f69818o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC22088B[] f69819p0;

    static {
        C22207y c22207y = new C22207y();
        f69816Y = c22207y;
        C22209z c22209z = new C22209z();
        f69817Z = c22209z;
        C22086A c22086a = new C22086A();
        f69818o0 = c22086a;
        EnumC22088B[] enumC22088BArr = {c22207y, c22209z, c22086a};
        f69819p0 = enumC22088BArr;
        AbstractC7877E4.m8156j(enumC22088BArr);
    }

    public static EnumC22088B valueOf(String str) {
        return (EnumC22088B) Enum.valueOf(EnumC22088B.class, str);
    }

    public static EnumC22088B[] values() {
        return (EnumC22088B[]) f69819p0.clone();
    }
}
