package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.deserialization.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16578a extends Flags.FlagField {

    /* JADX INFO: renamed from: a */
    public final Internal.EnumLite[] f52587a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16578a(int i10, Internal.EnumLite[] enumLiteArr) {
        if (enumLiteArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i11 = 1;
        int length = enumLiteArr.length - 1;
        if (length != 0) {
            for (int i12 = 31; i12 >= 0; i12--) {
                if (((1 << i12) & length) != 0) {
                    i11 = 1 + i12;
                }
            }
            throw new IllegalStateException("Empty enum: " + enumLiteArr.getClass());
        }
        super(i10, i11);
        this.f52587a = enumLiteArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
    public final Object get(int i10) {
        int i11 = (1 << this.bitWidth) - 1;
        int i12 = this.offset;
        int i13 = (i10 & (i11 << i12)) >> i12;
        for (Internal.EnumLite enumLite : this.f52587a) {
            if (enumLite.getNumber() == i13) {
                return enumLite;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
    public final int toFlags(Object obj) {
        return ((Internal.EnumLite) obj).getNumber() << this.offset;
    }
}
