package p321Mk;

import p523V9.AbstractC7877E4;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mk.o */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5477o {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5477o f17884Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5477o f17885Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC5477o f17886o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC5477o[] f17887p0;

    static {
        EnumC5477o enumC5477o = new EnumC5477o("BOTH", 0);
        f17884Y = enumC5477o;
        EnumC5477o enumC5477o2 = new EnumC5477o("HORIZONTAL", 1);
        f17885Z = enumC5477o2;
        EnumC5477o enumC5477o3 = new EnumC5477o(tpXhEMGxfXFVSh.qWscQJGrtjJL, 2);
        f17886o0 = enumC5477o3;
        EnumC5477o[] enumC5477oArr = {enumC5477o, enumC5477o2, enumC5477o3};
        f17887p0 = enumC5477oArr;
        AbstractC7877E4.m8156j(enumC5477oArr);
    }

    public static EnumC5477o valueOf(String str) {
        return (EnumC5477o) Enum.valueOf(EnumC5477o.class, str);
    }

    public static EnumC5477o[] values() {
        return (EnumC5477o[]) f17887p0.clone();
    }
}
