package bf;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bf.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC11383k {
    public static final C11382j Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f34393Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11383k f34394Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11383k f34395o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC11383k f34396p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC11383k f34397q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC11383k[] f34398r0;

    static {
        EnumC11383k enumC11383k = new EnumC11383k("Private", 0);
        f34394Z = enumC11383k;
        EnumC11383k enumC11383k2 = new EnumC11383k("Workspace", 1);
        f34395o0 = enumC11383k2;
        EnumC11383k enumC11383k3 = new EnumC11383k("Public", 2);
        f34396p0 = enumC11383k3;
        EnumC11383k enumC11383k4 = new EnumC11383k("Link", 3);
        f34397q0 = enumC11383k4;
        EnumC11383k[] enumC11383kArr = {enumC11383k, enumC11383k2, enumC11383k3, enumC11383k4};
        f34398r0 = enumC11383kArr;
        AbstractC7877E4.m8156j(enumC11383kArr);
        Companion = new C11382j();
        f34393Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C11381i.f34389Z);
    }

    public static EnumC11383k valueOf(String str) {
        return (EnumC11383k) Enum.valueOf(EnumC11383k.class, str);
    }

    public static EnumC11383k[] values() {
        return (EnumC11383k[]) f34398r0.clone();
    }
}
