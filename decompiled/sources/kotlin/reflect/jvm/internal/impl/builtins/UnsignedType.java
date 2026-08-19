package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedType {
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ UnsignedType[] f51312p0;

    /* JADX INFO: renamed from: Y */
    public final ClassId f51313Y;

    /* JADX INFO: renamed from: Z */
    public final Name f51314Z;

    /* JADX INFO: renamed from: o0 */
    public final ClassId f51315o0;

    static {
        ClassId.Companion companion = ClassId.Companion;
        UnsignedType unsignedType = new UnsignedType("UBYTE", 0, ClassId.Companion.fromString$default(companion, "kotlin/UByte", false, 2, null));
        UBYTE = unsignedType;
        UnsignedType unsignedType2 = new UnsignedType("USHORT", 1, ClassId.Companion.fromString$default(companion, "kotlin/UShort", false, 2, null));
        USHORT = unsignedType2;
        UnsignedType unsignedType3 = new UnsignedType("UINT", 2, ClassId.Companion.fromString$default(companion, "kotlin/UInt", false, 2, null));
        UINT = unsignedType3;
        UnsignedType unsignedType4 = new UnsignedType("ULONG", 3, ClassId.Companion.fromString$default(companion, "kotlin/ULong", false, 2, null));
        ULONG = unsignedType4;
        UnsignedType[] unsignedTypeArr = {unsignedType, unsignedType2, unsignedType3, unsignedType4};
        f51312p0 = unsignedTypeArr;
        AbstractC7877E4.m8156j(unsignedTypeArr);
    }

    public UnsignedType(String str, int i10, ClassId classId) {
        super(str, i10);
        this.f51313Y = classId;
        Name shortClassName = classId.getShortClassName();
        this.f51314Z = shortClassName;
        FqName packageFqName = classId.getPackageFqName();
        Name nameIdentifier = Name.identifier(shortClassName.asString() + "Array");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        this.f51315o0 = new ClassId(packageFqName, nameIdentifier);
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) f51312p0.clone();
    }

    public final ClassId getArrayClassId() {
        return this.f51315o0;
    }

    public final ClassId getClassId() {
        return this.f51313Y;
    }

    public final Name getTypeName() {
        return this.f51314Z;
    }
}
