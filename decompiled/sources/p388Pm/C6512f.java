package p388Pm;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Pm.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6512f implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21119Y;

    /* JADX INFO: renamed from: Z */
    public final NotFoundClasses f21120Z;

    public /* synthetic */ C6512f(NotFoundClasses notFoundClasses, int i10) {
        this.f21119Y = i10;
        this.f21120Z = notFoundClasses;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        DeclarationDescriptor declarationDescriptor;
        switch (this.f21119Y) {
            case 0:
                FqName fqName = (FqName) obj;
                AbstractC16544l.m18094g(fqName, "fqName");
                return new EmptyPackageFragmentDescriptor(this.f21120Z.f51406b, fqName);
            default:
                C6513g c6513g = (C6513g) obj;
                AbstractC16544l.m18094g(c6513g, "<destruct>");
                ClassId classId = c6513g.f21121a;
                if (classId.isLocal()) {
                    throw new UnsupportedOperationException("Unresolved local class: " + classId);
                }
                ClassId outerClassId = classId.getOuterClassId();
                NotFoundClasses notFoundClasses = this.f21120Z;
                List list = c6513g.f21122b;
                if (outerClassId == null || (declarationDescriptor = notFoundClasses.getClass(outerClassId, AbstractC17680n.m19336L(list, 1))) == null) {
                    declarationDescriptor = (ClassOrPackageFragmentDescriptor) notFoundClasses.f51407c.invoke(classId.getPackageFqName());
                }
                DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
                boolean zIsNestedClass = classId.isNestedClass();
                StorageManager storageManager = notFoundClasses.f51405a;
                Name shortClassName = classId.getShortClassName();
                Integer num = (Integer) AbstractC17680n.m19343S(list);
                return new NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
        }
    }
}
