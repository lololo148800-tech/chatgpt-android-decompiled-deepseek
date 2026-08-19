package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 Pl.X[], still in use, count: 1, list:
  (r3v5 Pl.X[]) from 0x010e: INVOKE (r3v5 Pl.X[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:271)
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
/* JADX INFO: renamed from: Pl.X */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6476X implements InterfaceC6477Y {
    H120(new C6471S(160, 120, 15, true), new C6474V(70000, 15)),
    H180(new C6471S(240, 180, 15, true), new C6474V(125000, 15)),
    H240(new C6471S(320, 240, 15, true), new C6474V(140000, 15)),
    H360(new C6471S(480, 360, 30, true), new C6474V(330000, 30)),
    H480(new C6471S(640, 480, 30, true), new C6474V(500000, 30)),
    H540(new C6471S(720, 540, 30, true), new C6474V(600000, 30)),
    H720(new C6471S(960, 720, 30, true), new C6474V(1300000, 30)),
    H1080(new C6471S(1440, 1080, 30, true), new C6474V(2300000, 30)),
    H1440(new C6471S(1920, 1440, 30, true), new C6474V(3800000, 30));


    /* JADX INFO: renamed from: Y */
    public final C6471S f21029Y;

    /* JADX INFO: renamed from: Z */
    public final C6474V f21030Z;

    static {
        AbstractC7877E4.m8156j(enumC6476XArr);
    }

    public EnumC6476X(C6471S c6471s, C6474V c6474v) {
        super(str, i);
        this.f21029Y = c6471s;
        this.f21030Z = c6474v;
    }

    public static EnumC6476X valueOf(String str) {
        return (EnumC6476X) Enum.valueOf(EnumC6476X.class, str);
    }

    public static EnumC6476X[] values() {
        return (EnumC6476X[]) f21028x0.clone();
    }

    @Override // p387Pl.InterfaceC6477Y
    /* JADX INFO: renamed from: a */
    public final C6471S mo7046a() {
        return this.f21029Y;
    }

    @Override // p387Pl.InterfaceC6477Y
    /* JADX INFO: renamed from: b */
    public final C6474V mo7047b() {
        return this.f21030Z;
    }
}
