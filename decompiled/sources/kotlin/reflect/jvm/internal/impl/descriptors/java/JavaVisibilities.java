package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaVisibilities {
    public static final JavaVisibilities INSTANCE = new JavaVisibilities();

    public static final class PackageVisibility extends Visibility {
        public static final PackageVisibility INSTANCE = new PackageVisibility("package", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Integer compareTo(Visibility visibility) {
            AbstractC16544l.m18094g(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            return Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {
        public static final ProtectedAndPackage INSTANCE = new ProtectedAndPackage("protected_and_package", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Integer compareTo(Visibility visibility) {
            AbstractC16544l.m18094g(visibility, "visibility");
            if (equals(visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.INSTANCE) {
                return null;
            }
            return Integer.valueOf(Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {
        public static final ProtectedStaticVisibility INSTANCE = new ProtectedStaticVisibility("protected_static", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }
}
