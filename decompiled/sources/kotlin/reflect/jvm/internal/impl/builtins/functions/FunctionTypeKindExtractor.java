package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.google.protobuf.AbstractC12107L1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionTypeKindExtractor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final FunctionTypeKindExtractor f51334c = new FunctionTypeKindExtractor(AbstractC17681o.m19382k(FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE));

    /* JADX INFO: renamed from: a */
    public final List f51335a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f51336b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.f51334c;
        }
    }

    public static final class KindWithArity {

        /* JADX INFO: renamed from: a */
        public final FunctionTypeKind f51337a;

        /* JADX INFO: renamed from: b */
        public final int f51338b;

        public KindWithArity(FunctionTypeKind kind, int i10) {
            AbstractC16544l.m18094g(kind, "kind");
            this.f51337a = kind;
            this.f51338b = i10;
        }

        public final FunctionTypeKind component1() {
            return this.f51337a;
        }

        public final int component2() {
            return this.f51338b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return AbstractC16544l.m18089b(this.f51337a, kindWithArity.f51337a) && this.f51338b == kindWithArity.f51338b;
        }

        public final FunctionTypeKind getKind() {
            return this.f51337a;
        }

        public int hashCode() {
            return (this.f51337a.hashCode() * 31) + this.f51338b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
            sb2.append(this.f51337a);
            sb2.append(", arity=");
            return AbstractC12107L1.m13826q(sb2, this.f51338b, ')');
        }
    }

    public FunctionTypeKindExtractor(List<? extends FunctionTypeKind> kinds) {
        AbstractC16544l.m18094g(kinds, "kinds");
        this.f51335a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            FqName packageFqName = ((FunctionTypeKind) obj).getPackageFqName();
            Object arrayList = linkedHashMap.get(packageFqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(packageFqName, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f51336b = linkedHashMap;
    }

    public final FunctionTypeKind getFunctionalClassKind(FqName packageFqName, String className) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(className, "className");
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(packageFqName, className);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    public final KindWithArity getFunctionalClassKindWithArity(FqName packageFqName, String className) {
        Integer numValueOf;
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(className, "className");
        List<FunctionTypeKind> list = (List) this.f51336b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            int i10 = 0;
            if (AbstractC21329w.m21734u(className, functionTypeKind.getClassNamePrefix(), false)) {
                String strSubstring = className.substring(functionTypeKind.getClassNamePrefix().length());
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length = strSubstring.length();
                int i11 = 0;
                while (true) {
                    if (i10 >= length) {
                        numValueOf = Integer.valueOf(i11);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i10) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i11 = (i11 * 10) + iCharAt;
                    i10++;
                }
                if (numValueOf != null) {
                    return new KindWithArity(functionTypeKind, numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
