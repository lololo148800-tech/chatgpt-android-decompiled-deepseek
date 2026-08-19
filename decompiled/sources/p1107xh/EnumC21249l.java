package p1107xh;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import p523V9.AbstractC7877E4;
import p849k7.C16361n;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: xh.l */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21249l {

    /* JADX INFO: renamed from: Z */
    public static final C16361n f67602Z;

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67603o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC21249l f67604p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC21249l f67605q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC21249l f67606r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC21249l[] f67607s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ C20007b f67608t0;

    /* JADX INFO: renamed from: Y */
    public final String f67609Y;

    public EnumC21249l(String str, int i10, String str2) {
        super(str, i10);
        this.f67609Y = str2;
    }

    public static EnumC21249l valueOf(String str) {
        return (EnumC21249l) Enum.valueOf(EnumC21249l.class, str);
    }

    public static EnumC21249l[] values() {
        return (EnumC21249l[]) f67607s0.clone();
    }

    static {
        EnumC21249l enumC21249l = new EnumC21249l("ALWAYS_ALLOW", 0, "ALWAYS_ALLOW");
        f67604p0 = enumC21249l;
        EnumC21249l enumC21249l2 = new EnumC21249l("UNSET", 1, "UNSET");
        f67605q0 = enumC21249l2;
        String str = qffLJgOYizGmMj.klnPxGiDLuFFOOX;
        EnumC21249l enumC21249l3 = new EnumC21249l(str, 2, str);
        f67606r0 = enumC21249l3;
        EnumC21249l[] enumC21249lArr = {enumC21249l, enumC21249l2, enumC21249l3};
        f67607s0 = enumC21249lArr;
        f67608t0 = AbstractC7877E4.m8156j(enumC21249lArr);
        f67602Z = new C16361n();
        f67603o0 = new C17871x("GizmoActionStatus", AbstractC17681o.m19382k("ALWAYS_ALLOW", "UNSET"));
    }
}
