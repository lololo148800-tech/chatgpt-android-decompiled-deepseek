package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeMappingMode {
    public static final TypeMappingMode CLASS_DECLARATION;
    public static final Companion Companion = new Companion(null);
    public static final TypeMappingMode DEFAULT;
    public static final TypeMappingMode DEFAULT_UAST;
    public static final TypeMappingMode GENERIC_ARGUMENT;
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;
    public static final TypeMappingMode RETURN_TYPE_BOXED;
    public static final TypeMappingMode SUPER_TYPE;
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;

    /* JADX INFO: renamed from: a */
    public final boolean f52079a;

    /* JADX INFO: renamed from: b */
    public final boolean f52080b;

    /* JADX INFO: renamed from: c */
    public final boolean f52081c;

    /* JADX INFO: renamed from: d */
    public final boolean f52082d;

    /* JADX INFO: renamed from: e */
    public final boolean f52083e;

    /* JADX INFO: renamed from: f */
    public final TypeMappingMode f52084f;

    /* JADX INFO: renamed from: g */
    public final boolean f52085g;

    /* JADX INFO: renamed from: h */
    public final TypeMappingMode f52086h;

    /* JADX INFO: renamed from: i */
    public final TypeMappingMode f52087i;

    /* JADX INFO: renamed from: j */
    public final boolean f52088j;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z6 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        TypeMappingMode typeMappingMode = null;
        boolean z13 = false;
        TypeMappingMode typeMappingMode2 = null;
        TypeMappingMode typeMappingMode3 = null;
        boolean z14 = false;
        TypeMappingMode typeMappingMode4 = new TypeMappingMode(z6, false, z10, z11, z12, typeMappingMode, z13, typeMappingMode2, typeMappingMode3, z14, 1023, defaultConstructorMarker);
        GENERIC_ARGUMENT = typeMappingMode4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        TypeMappingMode typeMappingMode5 = null;
        TypeMappingMode typeMappingMode6 = null;
        boolean z21 = true;
        TypeMappingMode typeMappingMode7 = new TypeMappingMode(z15, z16, z17, z18, z19, null, z20, typeMappingMode5, typeMappingMode6, z21, 511, defaultConstructorMarker2);
        GENERIC_ARGUMENT_UAST = typeMappingMode7;
        RETURN_TYPE_BOXED = new TypeMappingMode(z6, true, z10, z11, z12, typeMappingMode, z13, typeMappingMode2, typeMappingMode3, z14, 1021, defaultConstructorMarker);
        int i10 = 988;
        DEFAULT = new TypeMappingMode(z6, false, z10, z11, z12, typeMappingMode4, z13, typeMappingMode2, typeMappingMode3, z14, i10, defaultConstructorMarker);
        DEFAULT_UAST = new TypeMappingMode(z15, z16, z17, z18, z19, typeMappingMode7, z20, typeMappingMode5, typeMappingMode6, z21, 476, defaultConstructorMarker2);
        CLASS_DECLARATION = new TypeMappingMode(z6, true, z10, z11, z12, typeMappingMode4, z13, typeMappingMode2, typeMappingMode3, z14, i10, defaultConstructorMarker);
        boolean z22 = false;
        boolean z23 = true;
        SUPER_TYPE = new TypeMappingMode(z6, z22, z10, z23, z12, typeMappingMode4, z13, typeMappingMode2, typeMappingMode3, z14, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z6, z22, z10, z23, z12, typeMappingMode4, z13, typeMappingMode2, typeMappingMode3, z14, 919, defaultConstructorMarker);
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z6, z22, true, false, z12, typeMappingMode4, z13, typeMappingMode2, typeMappingMode3, z14, 984, defaultConstructorMarker);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.f52085g;
    }

    public final boolean getMapTypeAliases() {
        return this.f52088j;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.f52080b;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.f52079a;
    }

    public final boolean isForAnnotationParameter() {
        return this.f52081c;
    }

    public final TypeMappingMode toGenericArgumentMode(Variance effectiveVariance, boolean z6) {
        AbstractC16544l.m18094g(effectiveVariance, "effectiveVariance");
        if (!z6 || !this.f52081c) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i10 == 1) {
                TypeMappingMode typeMappingMode = this.f52086h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i10 != 2) {
                TypeMappingMode typeMappingMode2 = this.f52084f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.f52087i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.f52079a, true, this.f52081c, this.f52082d, this.f52083e, this.f52084f, this.f52085g, this.f52086h, this.f52087i, false, 512, null);
    }

    public TypeMappingMode(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, TypeMappingMode typeMappingMode, boolean z14, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z15) {
        this.f52079a = z6;
        this.f52080b = z10;
        this.f52081c = z11;
        this.f52082d = z12;
        this.f52083e = z13;
        this.f52084f = typeMappingMode;
        this.f52085g = z14;
        this.f52086h = typeMappingMode2;
        this.f52087i = typeMappingMode3;
        this.f52088j = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, TypeMappingMode typeMappingMode, boolean z14, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z16 = (i10 & 1) != 0 ? true : z6;
        boolean z17 = (i10 & 2) != 0 ? true : z10;
        boolean z18 = (i10 & 4) != 0 ? false : z11;
        boolean z19 = (i10 & 8) != 0 ? false : z12;
        boolean z20 = (i10 & 16) != 0 ? false : z13;
        TypeMappingMode typeMappingMode4 = (i10 & 32) != 0 ? null : typeMappingMode;
        this(z16, z17, z18, z19, z20, typeMappingMode4, (i10 & 64) == 0 ? z14 : true, (i10 & 128) != 0 ? typeMappingMode4 : typeMappingMode2, (i10 & 256) != 0 ? typeMappingMode4 : typeMappingMode3, (i10 & 512) == 0 ? z15 : false);
    }
}
