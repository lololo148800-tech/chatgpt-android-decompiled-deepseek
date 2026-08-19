package p346Nn;

import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5896f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5896f f19224Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC5896f[] f19225Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5896f EF2;

    static {
        EnumC5896f enumC5896f = new EnumC5896f(efyhmdM.BKgHcmLCnCHU, 0);
        EnumC5896f enumC5896f2 = new EnumC5896f("PM", 1);
        f19224Y = enumC5896f2;
        EnumC5896f[] enumC5896fArr = {enumC5896f, enumC5896f2};
        f19225Z = enumC5896fArr;
        AbstractC7877E4.m8156j(enumC5896fArr);
    }

    public static EnumC5896f valueOf(String str) {
        return (EnumC5896f) Enum.valueOf(EnumC5896f.class, str);
    }

    public static EnumC5896f[] values() {
        return (EnumC5896f[]) f19225Z.clone();
    }
}
