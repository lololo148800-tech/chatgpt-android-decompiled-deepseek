package p449S9;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S9.S */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7049S implements Comparator {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7049S f22515Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC7049S[] f22516Z;

    static {
        EnumC7049S enumC7049S = new EnumC7049S("INSTANCE", 0);
        f22515Y = enumC7049S;
        f22516Z = new EnumC7049S[]{enumC7049S};
    }

    public static EnumC7049S[] values() {
        return (EnumC7049S[]) f22516Z.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = (bArr[i10] & 255) - (bArr2[i10] & 255);
            if (i11 != 0) {
                return i11;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
