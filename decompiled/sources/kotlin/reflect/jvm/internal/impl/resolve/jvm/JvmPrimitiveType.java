package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", TokenNames.f32009C, "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", TokenNames.f32018S, "java.lang.Short"),
    INT(PrimitiveType.INT, "int", TokenNames.f32012I, "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", TokenNames.f32011F, "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: q0 */
    public static final HashMap f52900q0 = new HashMap();

    /* JADX INFO: renamed from: r0 */
    public static final EnumMap f52901r0 = new EnumMap(PrimitiveType.class);

    /* JADX INFO: renamed from: s0 */
    public static final HashMap f52902s0 = new HashMap();

    /* JADX INFO: renamed from: t0 */
    public static final HashSet f52903t0 = new HashSet();

    /* JADX INFO: renamed from: u0 */
    public static final HashMap f52904u0 = new HashMap();

    /* JADX INFO: renamed from: Y */
    public final PrimitiveType f52906Y;

    /* JADX INFO: renamed from: Z */
    public final String f52907Z;

    /* JADX INFO: renamed from: o0 */
    public final String f52908o0;

    /* JADX INFO: renamed from: p0 */
    public final FqName f52909p0;

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f52900q0.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            f52901r0.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            f52902s0.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
            String strReplace = jvmPrimitiveType.f52909p0.asString().replace('.', '/');
            f52903t0.add(strReplace);
            f52904u0.put(strReplace, Separators.LPAREN + jvmPrimitiveType.f52908o0 + ")L" + strReplace + Separators.SEMICOLON);
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            m18362a(8);
            throw null;
        }
        this.f52906Y = primitiveType;
        this.f52907Z = str;
        this.f52908o0 = str2;
        this.f52909p0 = new FqName(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18362a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static JvmPrimitiveType get(String str) {
        if (str == null) {
            m18362a(3);
            throw null;
        }
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) f52900q0.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public String getDesc() {
        String str = this.f52908o0;
        if (str != null) {
            return str;
        }
        m18362a(14);
        throw null;
    }

    public String getJavaKeywordName() {
        String str = this.f52907Z;
        if (str != null) {
            return str;
        }
        m18362a(13);
        throw null;
    }

    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType = this.f52906Y;
        if (primitiveType != null) {
            return primitiveType;
        }
        m18362a(12);
        throw null;
    }

    public FqName getWrapperFqName() {
        FqName fqName = this.f52909p0;
        if (fqName != null) {
            return fqName;
        }
        m18362a(15);
        throw null;
    }

    public static JvmPrimitiveType get(PrimitiveType primitiveType) {
        if (primitiveType != null) {
            JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) f52901r0.get(primitiveType);
            if (jvmPrimitiveType != null) {
                return jvmPrimitiveType;
            }
            m18362a(6);
            throw null;
        }
        m18362a(5);
        throw null;
    }
}
