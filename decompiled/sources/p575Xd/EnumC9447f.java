package p575Xd;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import p523V9.AbstractC7877E4;
import p525Vb.C8258a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Xd.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9447f {

    /* JADX INFO: renamed from: Y */
    public static final C8258a f28450Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC9447f f28451Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC9447f f28452o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC9447f[] f28453p0;

    static {
        EnumC9447f enumC9447f = new EnumC9447f(SIPHeaderNames.ALLOW, 0);
        f28451Z = enumC9447f;
        EnumC9447f enumC9447f2 = new EnumC9447f("Confirm", 1);
        f28452o0 = enumC9447f2;
        EnumC9447f[] enumC9447fArr = {enumC9447f, enumC9447f2};
        f28453p0 = enumC9447fArr;
        AbstractC7877E4.m8156j(enumC9447fArr);
        f28450Y = new C8258a();
    }

    public static EnumC9447f valueOf(String str) {
        return (EnumC9447f) Enum.valueOf(EnumC9447f.class, str);
    }

    public static EnumC9447f[] values() {
        return (EnumC9447f[]) f28453p0.clone();
    }
}
