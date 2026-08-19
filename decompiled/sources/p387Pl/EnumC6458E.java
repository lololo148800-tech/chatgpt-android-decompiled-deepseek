package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v5 Pl.E[], still in use, count: 1, list:
  (r7v5 Pl.E[]) from 0x00d5: INVOKE (r7v5 Pl.E[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:214)
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
/* JADX INFO: renamed from: Pl.E */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6458E implements InterfaceC6477Y {
    /* JADX INFO: Fake field, exist only in values array */
    H360_FPS3(new C6471S(640, 360, 3, true), new C6474V(200000, 3)),
    /* JADX INFO: Fake field, exist only in values array */
    H360_FPS15(new C6471S(640, 360, 15, true), new C6474V(400000, 15)),
    /* JADX INFO: Fake field, exist only in values array */
    H720_FPS5(new C6471S(1280, 720, 5, true), new C6474V(800000, 5)),
    /* JADX INFO: Fake field, exist only in values array */
    H720_FPS15(new C6471S(1280, 720, 15, true), new C6474V(1500000, 15)),
    /* JADX INFO: Fake field, exist only in values array */
    H720_FPS30(new C6471S(1280, 720, 30, true), new C6474V(2000000, 30)),
    /* JADX INFO: Fake field, exist only in values array */
    H1080_FPS15(new C6471S(1920, 1080, 15, true), new C6474V(2500000, 15)),
    /* JADX INFO: Fake field, exist only in values array */
    H1080_FPS30(new C6471S(1920, 1080, 30, true), new C6474V(5000000, 30)),
    ORIGINAL(new C6471S(0, 0, 30, false), new C6474V(7000000, 30));


    /* JADX INFO: renamed from: Y */
    public final C6471S f20956Y;

    /* JADX INFO: renamed from: Z */
    public final C6474V f20957Z;

    static {
        AbstractC7877E4.m8156j(enumC6458EArr);
    }

    public EnumC6458E(C6471S c6471s, C6474V c6474v) {
        super(str, i);
        this.f20956Y = c6471s;
        this.f20957Z = c6474v;
    }

    public static EnumC6458E valueOf(String str) {
        return (EnumC6458E) Enum.valueOf(EnumC6458E.class, str);
    }

    public static EnumC6458E[] values() {
        return (EnumC6458E[]) f20955p0.clone();
    }

    @Override // p387Pl.InterfaceC6477Y
    /* JADX INFO: renamed from: a */
    public final C6471S mo7046a() {
        return this.f20956Y;
    }

    @Override // p387Pl.InterfaceC6477Y
    /* JADX INFO: renamed from: b */
    public final C6474V mo7047b() {
        return this.f20957Z;
    }
}
