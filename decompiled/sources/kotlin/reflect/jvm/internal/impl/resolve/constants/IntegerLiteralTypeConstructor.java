package kotlin.reflect.jvm.internal.impl.resolve.constants;

import android.gov.nist.core.Separators;
import in.C15044a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import mm.C17314q;
import p298Lm.C5140G;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final long f52882a;

    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor f52883b;

    /* JADX INFO: renamed from: c */
    public final Set f52884c;

    /* JADX INFO: renamed from: d */
    public final SimpleType f52885d = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);

    /* JADX INFO: renamed from: e */
    public final C17314q f52886e = AbstractC9227W.m9800c(new C5140G(this, 21));

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC16622a.values().length];
                try {
                    EnumC16622a[] enumC16622aArr = EnumC16622a.f52890Y;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    EnumC16622a[] enumC16622aArr2 = EnumC16622a.f52890Y;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v1 */
        public final SimpleType findIntersectionType(Collection<? extends SimpleType> types) {
            AbstractC16544l.m18094g(types, "types");
            EnumC16622a[] enumC16622aArr = EnumC16622a.f52890Y;
            if (types.isEmpty()) {
                return null;
            }
            Iterator it = types.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = (SimpleType) next;
                IntegerLiteralTypeConstructor.Companion.getClass();
                if (next != 0 && simpleType != null) {
                    TypeConstructor constructor = next.getConstructor();
                    TypeConstructor constructor2 = simpleType.getConstructor();
                    boolean z6 = constructor instanceof IntegerLiteralTypeConstructor;
                    if (z6 && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) constructor;
                        Set<KotlinType> possibleTypes = integerLiteralTypeConstructor.getPossibleTypes();
                        Set<KotlinType> other = ((IntegerLiteralTypeConstructor) constructor2).getPossibleTypes();
                        AbstractC16544l.m18094g(possibleTypes, "<this>");
                        AbstractC16544l.m18094g(other, "other");
                        Set setM19326F0 = AbstractC17680n.m19326F0(possibleTypes);
                        AbstractC17686t.m19398v(other, setM19326F0);
                        next = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f52882a, integerLiteralTypeConstructor.f52883b, setM19326F0, null), false);
                    } else if (z6) {
                        if (!((IntegerLiteralTypeConstructor) constructor).getPossibleTypes().contains(simpleType)) {
                            simpleType = null;
                        }
                        next = simpleType;
                    } else if (!(constructor2 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor) constructor2).getPossibleTypes().contains(next)) {
                    }
                }
                next = 0;
            }
            return (SimpleType) next;
        }
    }

    public IntegerLiteralTypeConstructor(long j10, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this.f52882a = j10;
        this.f52883b = moduleDescriptor;
        this.f52884c = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        return this.f52883b.getBuiltIns();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return C17689w.f56480Y;
    }

    public final Set<KotlinType> getPossibleTypes() {
        return this.f52884c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        return (List) this.f52886e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + AbstractC17680n.m19349Y(this.f52884c, Separators.COMMA, null, null, 0, null, C15044a.f46763Y, 30) + ']');
        return sb2.toString();
    }
}
