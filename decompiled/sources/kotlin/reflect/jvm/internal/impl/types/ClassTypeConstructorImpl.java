package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c */
    public final ClassDescriptor f53148c;

    /* JADX INFO: renamed from: d */
    public final List f53149d;

    /* JADX INFO: renamed from: e */
    public final Collection f53150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(ClassDescriptor classDescriptor, List<? extends TypeParameterDescriptor> list, Collection<KotlinType> collection, StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            m18413h(0);
            throw null;
        }
        if (list == null) {
            m18413h(1);
            throw null;
        }
        if (collection == null) {
            m18413h(2);
            throw null;
        }
        if (storageManager == null) {
            m18413h(3);
            throw null;
        }
        this.f53148c = classDescriptor;
        this.f53149d = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f53150e = DesugarCollections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m18413h(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: b */
    public final Collection mo7319b() {
        Collection collection = this.f53150e;
        if (collection != null) {
            return collection;
        }
        m18413h(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: e */
    public final SupertypeLoopChecker mo7321e() {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        if (empty != null) {
            return empty;
        }
        m18413h(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        List<TypeParameterDescriptor> list = this.f53149d;
        if (list != null) {
            return list;
        }
        m18413h(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        return DescriptorUtils.getFqName(this.f53148c).asString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassDescriptor mo22589getDeclarationDescriptor() {
        ClassDescriptor classDescriptor = this.f53148c;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        m18413h(5);
        throw null;
    }
}
