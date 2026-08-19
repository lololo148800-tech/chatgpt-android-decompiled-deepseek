package ye;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ye.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21521j {
    public static final C21520i Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f68147Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21521j f68148Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21521j f68149o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21521j f68150p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC21521j[] f68151q0;

    static {
        EnumC21521j enumC21521j = new EnumC21521j("ConversationComposerWebIcon", 0);
        f68148Z = enumC21521j;
        EnumC21521j enumC21521j2 = new EnumC21521j("ConversationRegenerateWithSearch", 1);
        f68149o0 = enumC21521j2;
        EnumC21521j enumC21521j3 = new EnumC21521j("ConversationRegenerateWithoutSearch", 2);
        f68150p0 = enumC21521j3;
        EnumC21521j[] enumC21521jArr = {enumC21521j, enumC21521j2, enumC21521j3};
        f68151q0 = enumC21521jArr;
        AbstractC7877E4.m8156j(enumC21521jArr);
        Companion = new C21520i();
        f68147Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21519h.f68146Y);
    }

    public static EnumC21521j valueOf(String str) {
        return (EnumC21521j) Enum.valueOf(EnumC21521j.class, str);
    }

    public static EnumC21521j[] values() {
        return (EnumC21521j[]) f68151q0.clone();
    }
}
