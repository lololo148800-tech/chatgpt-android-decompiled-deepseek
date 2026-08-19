package kotlin.reflect.jvm.internal.impl.load.java;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import p388Pm.C6509c;

/* JADX INFO: loaded from: classes2.dex */
public class JavaDescriptorVisibilities {
    public static final DescriptorVisibility PACKAGE_VISIBILITY;
    public static final DescriptorVisibility PROTECTED_AND_PACKAGE;
    public static final DescriptorVisibility PROTECTED_STATIC_VISIBILITY;

    /* JADX INFO: renamed from: a */
    public static final HashMap f51739a;

    static {
        C6509c c6509c = new C6509c(JavaVisibilities.PackageVisibility.INSTANCE, 9);
        PACKAGE_VISIBILITY = c6509c;
        C6509c c6509c2 = new C6509c(JavaVisibilities.ProtectedStaticVisibility.INSTANCE, 10);
        PROTECTED_STATIC_VISIBILITY = c6509c2;
        C6509c c6509c3 = new C6509c(JavaVisibilities.ProtectedAndPackage.INSTANCE, 11);
        PROTECTED_AND_PACKAGE = c6509c3;
        HashMap map = new HashMap();
        f51739a = map;
        map.put(c6509c.getDelegate(), c6509c);
        map.put(c6509c2.getDelegate(), c6509c2);
        map.put(c6509c3.getDelegate(), c6509c3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18172a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = qffLJgOYizGmMj.JOhZanMLDio;
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18173b(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            m18172a(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18172a(1);
            throw null;
        }
        if (m18174c(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18174c(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            m18172a(2);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18172a(3);
            throw null;
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) ? false : true;
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            m18172a(4);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f51739a.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.toDescriptorVisibility(visibility);
        if (descriptorVisibility2 != null) {
            return descriptorVisibility2;
        }
        m18172a(5);
        throw null;
    }
}
