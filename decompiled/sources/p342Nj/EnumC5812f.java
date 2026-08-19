package p342Nj;

import bj.InterfaceC11468o;
import p315Me.Myis.CxcULo;
import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nj.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5812f {
    private static final /* synthetic */ InterfaceC20006a $ENTRIES;
    private static final /* synthetic */ EnumC5812f[] $VALUES;

    @InterfaceC11468o(name = "camera")
    public static final EnumC5812f Camera;

    @InterfaceC11468o(name = "network")
    public static final EnumC5812f Network;

    @InterfaceC11468o(name = "nfc")
    public static final EnumC5812f Nfc;

    @InterfaceC11468o(name = "other")
    public static final EnumC5812f Other;

    @InterfaceC11468o(name = "permissions")
    public static final EnumC5812f Permissions;

    static {
        EnumC5812f enumC5812f = new EnumC5812f("Camera", 0);
        Camera = enumC5812f;
        EnumC5812f enumC5812f2 = new EnumC5812f("Network", 1);
        Network = enumC5812f2;
        EnumC5812f enumC5812f3 = new EnumC5812f(efyhmdM.dNkkYeX, 2);
        Permissions = enumC5812f3;
        EnumC5812f enumC5812f4 = new EnumC5812f(CxcULo.UutFwmImFgk, 3);
        Nfc = enumC5812f4;
        EnumC5812f enumC5812f5 = new EnumC5812f("Other", 4);
        Other = enumC5812f5;
        EnumC5812f[] enumC5812fArr = {enumC5812f, enumC5812f2, enumC5812f3, enumC5812f4, enumC5812f5};
        $VALUES = enumC5812fArr;
        $ENTRIES = AbstractC7877E4.m8156j(enumC5812fArr);
    }

    public static EnumC5812f valueOf(String str) {
        return (EnumC5812f) Enum.valueOf(EnumC5812f.class, str);
    }

    public static EnumC5812f[] values() {
        return (EnumC5812f[]) $VALUES.clone();
    }
}
