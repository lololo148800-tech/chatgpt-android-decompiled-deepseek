package p1105xc;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xc.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21180j {
    public static final C21179i Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f67322Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21180j f67323Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21180j f67324o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21180j[] f67325p0;

    static {
        EnumC21180j enumC21180j = new EnumC21180j("DEFAULT", 0);
        f67323Z = enumC21180j;
        EnumC21180j enumC21180j2 = new EnumC21180j("INTERNAL", 1);
        f67324o0 = enumC21180j2;
        EnumC21180j[] enumC21180jArr = {enumC21180j, enumC21180j2};
        f67325p0 = enumC21180jArr;
        AbstractC7877E4.m8156j(enumC21180jArr);
        Companion = new C21179i();
        f67322Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21178h.f67321Y);
    }

    public static EnumC21180j valueOf(String str) {
        return (EnumC21180j) Enum.valueOf(EnumC21180j.class, str);
    }

    public static EnumC21180j[] values() {
        return (EnumC21180j[]) f67325p0.clone();
    }
}
