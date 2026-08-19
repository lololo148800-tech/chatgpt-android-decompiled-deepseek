package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedArrayType {
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ UnsignedArrayType[] f51310Z;

    /* JADX INFO: renamed from: Y */
    public final Name f51311Y;

    static {
        ClassId.Companion companion = ClassId.Companion;
        UnsignedArrayType unsignedArrayType = new UnsignedArrayType("UBYTEARRAY", 0, ClassId.Companion.fromString$default(companion, "kotlin/UByteArray", false, 2, null));
        UBYTEARRAY = unsignedArrayType;
        UnsignedArrayType unsignedArrayType2 = new UnsignedArrayType("USHORTARRAY", 1, ClassId.Companion.fromString$default(companion, "kotlin/UShortArray", false, 2, null));
        USHORTARRAY = unsignedArrayType2;
        UnsignedArrayType unsignedArrayType3 = new UnsignedArrayType("UINTARRAY", 2, ClassId.Companion.fromString$default(companion, "kotlin/UIntArray", false, 2, null));
        UINTARRAY = unsignedArrayType3;
        UnsignedArrayType unsignedArrayType4 = new UnsignedArrayType("ULONGARRAY", 3, ClassId.Companion.fromString$default(companion, "kotlin/ULongArray", false, 2, null));
        ULONGARRAY = unsignedArrayType4;
        UnsignedArrayType[] unsignedArrayTypeArr = {unsignedArrayType, unsignedArrayType2, unsignedArrayType3, unsignedArrayType4};
        f51310Z = unsignedArrayTypeArr;
        AbstractC7877E4.m8156j(unsignedArrayTypeArr);
    }

    public UnsignedArrayType(String str, int i10, ClassId classId) {
        super(str, i10);
        this.f51311Y = classId.getShortClassName();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) f51310Z.clone();
    }

    public final Name getTypeName() {
        return this.f51311Y;
    }
}
