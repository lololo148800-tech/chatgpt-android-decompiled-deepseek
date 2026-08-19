package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Modality {
    public static final Modality ABSTRACT;
    public static final Companion Companion;
    public static final Modality FINAL;
    public static final Modality OPEN;
    public static final Modality SEALED;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ Modality[] f51401Y;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Modality convertFromFlags(boolean z6, boolean z10, boolean z11) {
            if (z6) {
                return Modality.SEALED;
            }
            if (z10) {
                return Modality.ABSTRACT;
            }
            return z11 ? Modality.OPEN : Modality.FINAL;
        }
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        FINAL = modality;
        Modality modality2 = new Modality("SEALED", 1);
        SEALED = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        OPEN = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        ABSTRACT = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        f51401Y = modalityArr;
        AbstractC7877E4.m8156j(modalityArr);
        Companion = new Companion(null);
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) f51401Y.clone();
    }
}
