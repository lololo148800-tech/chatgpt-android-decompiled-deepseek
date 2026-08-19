package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import android.gov.nist.core.Separators;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a */
    public final String f52899a;

    public JvmClassName(String str) {
        if (str != null) {
            this.f52899a = str;
        } else {
            m18361a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18361a(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
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
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i10 != 5) {
            switch (i10) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 5) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static JvmClassName byClassId(ClassId classId) {
        if (classId != null) {
            return new JvmClassName(internalNameByClassId(classId));
        }
        m18361a(1);
        throw null;
    }

    public static JvmClassName byFqNameWithoutInnerClasses(FqName fqName) {
        if (fqName != null) {
            return new JvmClassName(fqName.asString().replace('.', '/'));
        }
        m18361a(4);
        throw null;
    }

    public static JvmClassName byInternalName(String str) {
        if (str != null) {
            return new JvmClassName(str);
        }
        m18361a(0);
        throw null;
    }

    public static String internalNameByClassId(ClassId classId) {
        if (classId == null) {
            m18361a(2);
            throw null;
        }
        FqName packageFqName = classId.getPackageFqName();
        String strReplace = classId.getRelativeClassName().asString().replace('.', '$');
        if (!packageFqName.isRoot()) {
            strReplace = packageFqName.asString().replace('.', '/') + Separators.SLASH + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        m18361a(3);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f52899a.equals(((JvmClassName) obj).f52899a);
    }

    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.f52899a.replace('/', '.'));
    }

    public String getInternalName() {
        String str = this.f52899a;
        if (str != null) {
            return str;
        }
        m18361a(10);
        throw null;
    }

    public FqName getPackageFqName() {
        String str = this.f52899a;
        int iLastIndexOf = str.lastIndexOf(Separators.SLASH);
        if (iLastIndexOf != -1) {
            return new FqName(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        FqName fqName = FqName.ROOT;
        if (fqName != null) {
            return fqName;
        }
        m18361a(9);
        throw null;
    }

    public int hashCode() {
        return this.f52899a.hashCode();
    }

    public String toString() {
        return this.f52899a;
    }
}
