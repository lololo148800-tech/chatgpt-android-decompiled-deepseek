package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 Pl.W[], still in use, count: 1, list:
  (r1v4 Pl.W[]) from 0x0116: INVOKE (r1v4 Pl.W[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:279)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Pl.W */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6475W implements InterfaceC6477Y {
    H90(new C6471S(160, 90, 15, true), new C6474V(90000, 15)),
    H180(new C6471S(320, 180, 15, true), new C6474V(160000, 15)),
    H216(new C6471S(384, 216, 15, true), new C6474V(180000, 15)),
    H360(new C6471S(640, 360, 30, true), new C6474V(450000, 30)),
    H540(new C6471S(960, 540, 30, true), new C6474V(800000, 30)),
    H720(new C6471S(1280, 720, 30, true), new C6474V(1700000, 30)),
    H1080(new C6471S(1920, 1080, 30, true), new C6474V(3000000, 30)),
    H1440(new C6471S(2560, 1440, 30, true), new C6474V(5000000, 30)),
    H2160(new C6471S(3840, 2160, 30, true), new C6474V(8000000, 30));


    /* JADX INFO: renamed from: Y */
    public final C6471S f21017Y;

    /* JADX INFO: renamed from: Z */
    public final C6474V f21018Z;

    static {
        AbstractC7877E4.m8156j(enumC6475WArr);
    }

    public EnumC6475W(C6471S c6471s, C6474V c6474v) {
        super(str, i);
        this.f21017Y = c6471s;
        this.f21018Z = c6474v;
    }

    public static EnumC6475W valueOf(String str) {
        return (EnumC6475W) Enum.valueOf(EnumC6475W.class, str);
    }

    public static EnumC6475W[] values() {
        return (EnumC6475W[]) f21016x0.clone();
    }

    @Override // p387Pl.InterfaceC6477Y
    /* JADX INFO: renamed from: a */
    public final C6471S mo7046a() {
        return this.f21017Y;
    }

    @Override // p387Pl.InterfaceC6477Y
    /* JADX INFO: renamed from: b */
    public final C6474V mo7047b() {
        return this.f21018Z;
    }
}
