package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import mm.EnumC17307j;
import p345Nm.C5859e;
import p523V9.AbstractC7877E4;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17678l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[], still in use, count: 1, list:
  (r14v3 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]) from 0x0078: INVOKE (r14v3 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:121)
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
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Companion Companion;
    public static final Set<PrimitiveType> NUMBER_TYPES;

    /* JADX INFO: renamed from: Y */
    public final Name f51301Y;

    /* JADX INFO: renamed from: Z */
    public final Name f51302Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f51303o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f51304p0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        PrimitiveType primitiveType = CHAR;
        PrimitiveType primitiveType2 = BYTE;
        PrimitiveType primitiveType3 = SHORT;
        PrimitiveType primitiveType4 = INT;
        PrimitiveType primitiveType5 = FLOAT;
        PrimitiveType primitiveType6 = LONG;
        PrimitiveType primitiveType7 = DOUBLE;
        AbstractC7877E4.m8156j(primitiveTypeArr);
        Companion = new Companion(null);
        NUMBER_TYPES = AbstractC17678l.m19293P(new PrimitiveType[]{primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7});
    }

    public PrimitiveType(String str) {
        super(str, i);
        Name nameIdentifier = Name.identifier(str);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        this.f51301Y = nameIdentifier;
        Name nameIdentifier2 = Name.identifier(str.concat("Array"));
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        this.f51302Z = nameIdentifier2;
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        this.f51303o0 = AbstractC9227W.m9799b(enumC17307j, new C5859e(this, 0));
        this.f51304p0 = AbstractC9227W.m9799b(enumC17307j, new C5859e(this, 1));
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) f51300q0.clone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final FqName getArrayTypeFqName() {
        return (FqName) this.f51304p0.getValue();
    }

    public final Name getArrayTypeName() {
        return this.f51302Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final FqName getTypeFqName() {
        return (FqName) this.f51303o0.getValue();
    }

    public final Name getTypeName() {
        return this.f51301Y;
    }
}
