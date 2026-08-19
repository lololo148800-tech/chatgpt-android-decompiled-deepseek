package p623Zf;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Zf.F */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC10304F {
    public static final C10303E Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f30589Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10304F f30590Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10304F f30591o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10304F f30592p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC10304F f30593q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC10304F f30594r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC10304F f30595s0;

    /* JADX INFO: renamed from: t0 */
    public static final EnumC10304F f30596t0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ EnumC10304F[] f30597u0;

    static {
        EnumC10304F enumC10304F = new EnumC10304F("NotStarted", 0);
        f30590Z = enumC10304F;
        EnumC10304F enumC10304F2 = new EnumC10304F("EmailCollected", 1);
        f30591o0 = enumC10304F2;
        EnumC10304F enumC10304F3 = new EnumC10304F("EmailVerified", 2);
        f30592p0 = enumC10304F3;
        EnumC10304F enumC10304F4 = new EnumC10304F("InfoSubmitted", 3);
        f30593q0 = enumC10304F4;
        EnumC10304F enumC10304F5 = new EnumC10304F("SanctionChecked", 4);
        f30594r0 = enumC10304F5;
        EnumC10304F enumC10304F6 = new EnumC10304F("AccountCreationAttempted", 5);
        f30595s0 = enumC10304F6;
        EnumC10304F enumC10304F7 = new EnumC10304F("PhoneVerified", 6);
        f30596t0 = enumC10304F7;
        EnumC10304F[] enumC10304FArr = {enumC10304F, enumC10304F2, enumC10304F3, enumC10304F4, enumC10304F5, enumC10304F6, enumC10304F7};
        f30597u0 = enumC10304FArr;
        AbstractC7877E4.m8156j(enumC10304FArr);
        Companion = new C10303E();
        f30589Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C10302D.f30588Y);
    }

    public static EnumC10304F valueOf(String str) {
        return (EnumC10304F) Enum.valueOf(EnumC10304F.class, str);
    }

    public static EnumC10304F[] values() {
        return (EnumC10304F[]) f30597u0.clone();
    }
}
